#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_segment_update_request_update_with_required_body.h"



static customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body_create_internal(
    list_t *audience_ids,
    char *id,
    pinterest_rest_api_audience_update_operation_type__e operation_type
    ) {
    customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body_local_var = malloc(sizeof(customer_segment_update_request_update_with_required_body_t));
    if (!customer_segment_update_request_update_with_required_body_local_var) {
        return NULL;
    }
    memset(customer_segment_update_request_update_with_required_body_local_var, 0, sizeof(customer_segment_update_request_update_with_required_body_t));
    customer_segment_update_request_update_with_required_body_local_var->_library_owned = 1;
    customer_segment_update_request_update_with_required_body_local_var->audience_ids = audience_ids;
    customer_segment_update_request_update_with_required_body_local_var->id = id;
    customer_segment_update_request_update_with_required_body_local_var->operation_type = operation_type;
    return customer_segment_update_request_update_with_required_body_local_var;
}

__attribute__((deprecated)) customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body_create(
    list_t *audience_ids,
    char *id,
    pinterest_rest_api_audience_update_operation_type__e operation_type
    ) {
    customer_segment_update_request_update_with_required_body_t *result = customer_segment_update_request_update_with_required_body_create_internal (
        audience_ids,
        id,
        operation_type
        );
    if (!result) {
    }
    return result;
}

void customer_segment_update_request_update_with_required_body_free(customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body) {
    if(NULL == customer_segment_update_request_update_with_required_body){
        return ;
    }
    if(customer_segment_update_request_update_with_required_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_segment_update_request_update_with_required_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_segment_update_request_update_with_required_body->audience_ids) {
        list_ForEach(listEntry, customer_segment_update_request_update_with_required_body->audience_ids) {
            free(listEntry->data);
        }
        list_freeList(customer_segment_update_request_update_with_required_body->audience_ids);
        customer_segment_update_request_update_with_required_body->audience_ids = NULL;
    }
    if (customer_segment_update_request_update_with_required_body->id) {
        free(customer_segment_update_request_update_with_required_body->id);
        customer_segment_update_request_update_with_required_body->id = NULL;
    }
    free(customer_segment_update_request_update_with_required_body);
}

cJSON *customer_segment_update_request_update_with_required_body_convertToJSON(customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body) {
    cJSON *item = cJSON_CreateObject();

    // customer_segment_update_request_update_with_required_body->audience_ids
    if(customer_segment_update_request_update_with_required_body->audience_ids) {
    cJSON *audience_ids = cJSON_AddArrayToObject(item, "audience_ids");
    if(audience_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *audience_idsListEntry;
    list_ForEach(audience_idsListEntry, customer_segment_update_request_update_with_required_body->audience_ids) {
    if(cJSON_AddStringToObject(audience_ids, "", audience_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // customer_segment_update_request_update_with_required_body->id
    if (!customer_segment_update_request_update_with_required_body->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", customer_segment_update_request_update_with_required_body->id) == NULL) {
    goto fail; //String
    }


    // customer_segment_update_request_update_with_required_body->operation_type
    if (pinterest_rest_api_audience_update_operation_type__NULL == customer_segment_update_request_update_with_required_body->operation_type) {
        goto fail;
    }
    cJSON *operation_type_local_JSON = audience_update_operation_type_convertToJSON(customer_segment_update_request_update_with_required_body->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body_parseFromJSON(cJSON *customer_segment_update_request_update_with_required_bodyJSON){

    customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body_local_var = NULL;

    // define the local list for customer_segment_update_request_update_with_required_body->audience_ids
    list_t *audience_idsList = NULL;

    char *id_local_str = NULL;

    // define the local variable for customer_segment_update_request_update_with_required_body->operation_type
    pinterest_rest_api_audience_update_operation_type__e operation_type_local_nonprim = 0;

    // customer_segment_update_request_update_with_required_body->audience_ids
    cJSON *audience_ids = cJSON_GetObjectItemCaseSensitive(customer_segment_update_request_update_with_required_bodyJSON, "audience_ids");
    if (cJSON_IsNull(audience_ids)) {
        audience_ids = NULL;
    }
    if (audience_ids) { 
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
    }

    // customer_segment_update_request_update_with_required_body->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(customer_segment_update_request_update_with_required_bodyJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // customer_segment_update_request_update_with_required_body->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(customer_segment_update_request_update_with_required_bodyJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (!operation_type) {
        goto end;
    }

    
    operation_type_local_nonprim = audience_update_operation_type_parseFromJSON(operation_type); //custom


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    customer_segment_update_request_update_with_required_body_local_var = customer_segment_update_request_update_with_required_body_create_internal (
        audience_ids ? audience_idsList : NULL,
        id_local_str,
        operation_type_local_nonprim
        );

    if (!customer_segment_update_request_update_with_required_body_local_var) {
        goto end;
    }

    return customer_segment_update_request_update_with_required_body_local_var;
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
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (operation_type_local_nonprim) {
        operation_type_local_nonprim = 0;
    }
    return NULL;

}
