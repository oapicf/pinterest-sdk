#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_segment_create.h"



static customer_segment_create_t *customer_segment_create_create_internal(
    list_t *audience_ids,
    char *name
    ) {
    customer_segment_create_t *customer_segment_create_local_var = malloc(sizeof(customer_segment_create_t));
    if (!customer_segment_create_local_var) {
        return NULL;
    }
    memset(customer_segment_create_local_var, 0, sizeof(customer_segment_create_t));
    customer_segment_create_local_var->_library_owned = 1;
    customer_segment_create_local_var->audience_ids = audience_ids;
    customer_segment_create_local_var->name = name;
    return customer_segment_create_local_var;
}

__attribute__((deprecated)) customer_segment_create_t *customer_segment_create_create(
    list_t *audience_ids,
    char *name
    ) {
    customer_segment_create_t *result = customer_segment_create_create_internal (
        audience_ids,
        name
        );
    if (!result) {
    }
    return result;
}

void customer_segment_create_free(customer_segment_create_t *customer_segment_create) {
    if(NULL == customer_segment_create){
        return ;
    }
    if(customer_segment_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_segment_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_segment_create->audience_ids) {
        list_ForEach(listEntry, customer_segment_create->audience_ids) {
            free(listEntry->data);
        }
        list_freeList(customer_segment_create->audience_ids);
        customer_segment_create->audience_ids = NULL;
    }
    if (customer_segment_create->name) {
        free(customer_segment_create->name);
        customer_segment_create->name = NULL;
    }
    free(customer_segment_create);
}

cJSON *customer_segment_create_convertToJSON(customer_segment_create_t *customer_segment_create) {
    cJSON *item = cJSON_CreateObject();

    // customer_segment_create->audience_ids
    if (!customer_segment_create->audience_ids) {
        goto fail;
    }
    cJSON *audience_ids = cJSON_AddArrayToObject(item, "audience_ids");
    if(audience_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *audience_idsListEntry;
    list_ForEach(audience_idsListEntry, customer_segment_create->audience_ids) {
    if(cJSON_AddStringToObject(audience_ids, "", audience_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // customer_segment_create->name
    if (!customer_segment_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", customer_segment_create->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

customer_segment_create_t *customer_segment_create_parseFromJSON(cJSON *customer_segment_createJSON){

    customer_segment_create_t *customer_segment_create_local_var = NULL;

    // define the local list for customer_segment_create->audience_ids
    list_t *audience_idsList = NULL;

    char *name_local_str = NULL;

    // customer_segment_create->audience_ids
    cJSON *audience_ids = cJSON_GetObjectItemCaseSensitive(customer_segment_createJSON, "audience_ids");
    if (cJSON_IsNull(audience_ids)) {
        audience_ids = NULL;
    }
    if (!audience_ids) {
        goto end;
    }

    
    cJSON *audience_ids_local = NULL;
    if(!cJSON_IsArray(audience_ids)) {
        goto end;//primitive container
    }
    audience_idsList = list_createList();

    cJSON_ArrayForEach(audience_ids_local, audience_ids)
    {
        if(!cJSON_IsString(audience_ids_local))
        {
            goto end;
        }
        list_addElement(audience_idsList , strdup(audience_ids_local->valuestring));
    }

    // customer_segment_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(customer_segment_createJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    customer_segment_create_local_var = customer_segment_create_create_internal (
        audience_idsList,
        name_local_str
        );

    if (!customer_segment_create_local_var) {
        goto end;
    }

    return customer_segment_create_local_var;
end:
    if (audience_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, audience_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(audience_idsList);
        audience_idsList = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
