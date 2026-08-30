#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_business_partners_delete.h"



static delete_business_partners_delete_t *delete_business_partners_delete_create_internal(
    list_t *partner_ids,
    nullable_partner_type_t *partner_type
    ) {
    delete_business_partners_delete_t *delete_business_partners_delete_local_var = malloc(sizeof(delete_business_partners_delete_t));
    if (!delete_business_partners_delete_local_var) {
        return NULL;
    }
    memset(delete_business_partners_delete_local_var, 0, sizeof(delete_business_partners_delete_t));
    delete_business_partners_delete_local_var->_library_owned = 1;
    delete_business_partners_delete_local_var->partner_ids = partner_ids;
    delete_business_partners_delete_local_var->partner_type = partner_type;
    return delete_business_partners_delete_local_var;
}

__attribute__((deprecated)) delete_business_partners_delete_t *delete_business_partners_delete_create(
    list_t *partner_ids,
    nullable_partner_type_t *partner_type
    ) {
    delete_business_partners_delete_t *result = delete_business_partners_delete_create_internal (
        partner_ids,
        partner_type
        );
    if (!result) {
    }
    return result;
}

void delete_business_partners_delete_free(delete_business_partners_delete_t *delete_business_partners_delete) {
    if(NULL == delete_business_partners_delete){
        return ;
    }
    if(delete_business_partners_delete->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_business_partners_delete_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_business_partners_delete->partner_ids) {
        list_ForEach(listEntry, delete_business_partners_delete->partner_ids) {
            free(listEntry->data);
        }
        list_freeList(delete_business_partners_delete->partner_ids);
        delete_business_partners_delete->partner_ids = NULL;
    }
    if (delete_business_partners_delete->partner_type) {
        nullable_partner_type_free(delete_business_partners_delete->partner_type);
        delete_business_partners_delete->partner_type = NULL;
    }
    free(delete_business_partners_delete);
}

cJSON *delete_business_partners_delete_convertToJSON(delete_business_partners_delete_t *delete_business_partners_delete) {
    cJSON *item = cJSON_CreateObject();

    // delete_business_partners_delete->partner_ids
    if (!delete_business_partners_delete->partner_ids) {
        goto fail;
    }
    cJSON *partner_ids = cJSON_AddArrayToObject(item, "partner_ids");
    if(partner_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *partner_idsListEntry;
    list_ForEach(partner_idsListEntry, delete_business_partners_delete->partner_ids) {
    if(cJSON_AddStringToObject(partner_ids, "", partner_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // delete_business_partners_delete->partner_type
    if(delete_business_partners_delete->partner_type) {
    cJSON *partner_type_local_JSON = nullable_partner_type_convertToJSON(delete_business_partners_delete->partner_type);
    if(partner_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "partner_type", partner_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_business_partners_delete_t *delete_business_partners_delete_parseFromJSON(cJSON *delete_business_partners_deleteJSON){

    delete_business_partners_delete_t *delete_business_partners_delete_local_var = NULL;

    // define the local list for delete_business_partners_delete->partner_ids
    list_t *partner_idsList = NULL;

    // define the local variable for delete_business_partners_delete->partner_type
    nullable_partner_type_t *partner_type_local_nonprim = NULL;

    // delete_business_partners_delete->partner_ids
    cJSON *partner_ids = cJSON_GetObjectItemCaseSensitive(delete_business_partners_deleteJSON, "partner_ids");
    if (cJSON_IsNull(partner_ids)) {
        partner_ids = NULL;
    }
    if (!partner_ids) {
        goto end;
    }

    
    cJSON *partner_ids_local = NULL;
    if(!cJSON_IsArray(partner_ids)) {
        goto end;//primitive container
    }
    partner_idsList = list_createList();

    cJSON_ArrayForEach(partner_ids_local, partner_ids)
    {
        if(!cJSON_IsString(partner_ids_local))
        {
            goto end;
        }
        list_addElement(partner_idsList , strdup(partner_ids_local->valuestring));
    }

    // delete_business_partners_delete->partner_type
    cJSON *partner_type = cJSON_GetObjectItemCaseSensitive(delete_business_partners_deleteJSON, "partner_type");
    if (cJSON_IsNull(partner_type)) {
        partner_type = NULL;
    }
    if (partner_type) { 
    partner_type_local_nonprim = nullable_partner_type_parseFromJSON(partner_type); //custom
    }



    delete_business_partners_delete_local_var = delete_business_partners_delete_create_internal (
        partner_idsList,
        partner_type ? partner_type_local_nonprim : NULL
        );

    if (!delete_business_partners_delete_local_var) {
        goto end;
    }

    return delete_business_partners_delete_local_var;
end:
    if (partner_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, partner_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(partner_idsList);
        partner_idsList = NULL;
    }
    if (partner_type_local_nonprim) {
        nullable_partner_type_free(partner_type_local_nonprim);
        partner_type_local_nonprim = NULL;
    }
    return NULL;

}
