#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_to_ad_account_shared_audience_update_with_required_body.h"



static business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body_create_internal(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type,
    list_t *recipient_account_ids
    ) {
    business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body_local_var = malloc(sizeof(business_to_ad_account_shared_audience_update_with_required_body_t));
    if (!business_to_ad_account_shared_audience_update_with_required_body_local_var) {
        return NULL;
    }
    memset(business_to_ad_account_shared_audience_update_with_required_body_local_var, 0, sizeof(business_to_ad_account_shared_audience_update_with_required_body_t));
    business_to_ad_account_shared_audience_update_with_required_body_local_var->_library_owned = 1;
    business_to_ad_account_shared_audience_update_with_required_body_local_var->audience_id = audience_id;
    business_to_ad_account_shared_audience_update_with_required_body_local_var->operation_type = operation_type;
    business_to_ad_account_shared_audience_update_with_required_body_local_var->recipient_account_ids = recipient_account_ids;
    return business_to_ad_account_shared_audience_update_with_required_body_local_var;
}

__attribute__((deprecated)) business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body_create(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type,
    list_t *recipient_account_ids
    ) {
    business_to_ad_account_shared_audience_update_with_required_body_t *result = business_to_ad_account_shared_audience_update_with_required_body_create_internal (
        audience_id,
        operation_type,
        recipient_account_ids
        );
    if (!result) {
    }
    return result;
}

void business_to_ad_account_shared_audience_update_with_required_body_free(business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body) {
    if(NULL == business_to_ad_account_shared_audience_update_with_required_body){
        return ;
    }
    if(business_to_ad_account_shared_audience_update_with_required_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_to_ad_account_shared_audience_update_with_required_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_to_ad_account_shared_audience_update_with_required_body->audience_id) {
        free(business_to_ad_account_shared_audience_update_with_required_body->audience_id);
        business_to_ad_account_shared_audience_update_with_required_body->audience_id = NULL;
    }
    if (business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids) {
        list_ForEach(listEntry, business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids) {
            free(listEntry->data);
        }
        list_freeList(business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids);
        business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids = NULL;
    }
    free(business_to_ad_account_shared_audience_update_with_required_body);
}

cJSON *business_to_ad_account_shared_audience_update_with_required_body_convertToJSON(business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body) {
    cJSON *item = cJSON_CreateObject();

    // business_to_ad_account_shared_audience_update_with_required_body->audience_id
    if (!business_to_ad_account_shared_audience_update_with_required_body->audience_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "audience_id", business_to_ad_account_shared_audience_update_with_required_body->audience_id) == NULL) {
    goto fail; //String
    }


    // business_to_ad_account_shared_audience_update_with_required_body->operation_type
    if (pinterest_rest_api_operation_type__NULL == business_to_ad_account_shared_audience_update_with_required_body->operation_type) {
        goto fail;
    }
    cJSON *operation_type_local_JSON = operation_type_convertToJSON(business_to_ad_account_shared_audience_update_with_required_body->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids
    if (!business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids) {
        goto fail;
    }
    cJSON *recipient_account_ids = cJSON_AddArrayToObject(item, "recipient_account_ids");
    if(recipient_account_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *recipient_account_idsListEntry;
    list_ForEach(recipient_account_idsListEntry, business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids) {
    if(cJSON_AddStringToObject(recipient_account_ids, "", recipient_account_idsListEntry->data) == NULL)
    {
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

business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body_parseFromJSON(cJSON *business_to_ad_account_shared_audience_update_with_required_bodyJSON){

    business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body_local_var = NULL;

    char *audience_id_local_str = NULL;

    // define the local variable for business_to_ad_account_shared_audience_update_with_required_body->operation_type
    pinterest_rest_api_operation_type__e operation_type_local_nonprim = 0;

    // define the local list for business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids
    list_t *recipient_account_idsList = NULL;

    // business_to_ad_account_shared_audience_update_with_required_body->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(business_to_ad_account_shared_audience_update_with_required_bodyJSON, "audience_id");
    if (cJSON_IsNull(audience_id)) {
        audience_id = NULL;
    }
    if (!audience_id) {
        goto end;
    }

    
    if(!cJSON_IsString(audience_id))
    {
    goto end; //String
    }

    // business_to_ad_account_shared_audience_update_with_required_body->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(business_to_ad_account_shared_audience_update_with_required_bodyJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (!operation_type) {
        goto end;
    }

    
    operation_type_local_nonprim = operation_type_parseFromJSON(operation_type); //custom

    // business_to_ad_account_shared_audience_update_with_required_body->recipient_account_ids
    cJSON *recipient_account_ids = cJSON_GetObjectItemCaseSensitive(business_to_ad_account_shared_audience_update_with_required_bodyJSON, "recipient_account_ids");
    if (cJSON_IsNull(recipient_account_ids)) {
        recipient_account_ids = NULL;
    }
    if (!recipient_account_ids) {
        goto end;
    }

    
    cJSON *recipient_account_ids_local = NULL;
    if(!cJSON_IsArray(recipient_account_ids)) {
        goto end;//primitive container
    }
    recipient_account_idsList = list_createList();

    cJSON_ArrayForEach(recipient_account_ids_local, recipient_account_ids)
    {
        if(!cJSON_IsString(recipient_account_ids_local))
        {
            goto end;
        }
        list_addElement(recipient_account_idsList , strdup(recipient_account_ids_local->valuestring));
    }


    if (audience_id && !cJSON_IsNull(audience_id)) audience_id_local_str = strdup(audience_id->valuestring);

    business_to_ad_account_shared_audience_update_with_required_body_local_var = business_to_ad_account_shared_audience_update_with_required_body_create_internal (
        audience_id_local_str,
        operation_type_local_nonprim,
        recipient_account_idsList
        );

    if (!business_to_ad_account_shared_audience_update_with_required_body_local_var) {
        goto end;
    }

    return business_to_ad_account_shared_audience_update_with_required_body_local_var;
end:
    if (audience_id_local_str) {
        free(audience_id_local_str);
        audience_id_local_str = NULL;
    }
    if (operation_type_local_nonprim) {
        operation_type_local_nonprim = 0;
    }
    if (recipient_account_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, recipient_account_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(recipient_account_idsList);
        recipient_account_idsList = NULL;
    }
    return NULL;

}
