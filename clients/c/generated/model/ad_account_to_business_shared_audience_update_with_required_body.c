#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_to_business_shared_audience_update_with_required_body.h"



static ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body_create_internal(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type,
    list_t *recipient_business_ids
    ) {
    ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body_local_var = malloc(sizeof(ad_account_to_business_shared_audience_update_with_required_body_t));
    if (!ad_account_to_business_shared_audience_update_with_required_body_local_var) {
        return NULL;
    }
    memset(ad_account_to_business_shared_audience_update_with_required_body_local_var, 0, sizeof(ad_account_to_business_shared_audience_update_with_required_body_t));
    ad_account_to_business_shared_audience_update_with_required_body_local_var->_library_owned = 1;
    ad_account_to_business_shared_audience_update_with_required_body_local_var->audience_id = audience_id;
    ad_account_to_business_shared_audience_update_with_required_body_local_var->operation_type = operation_type;
    ad_account_to_business_shared_audience_update_with_required_body_local_var->recipient_business_ids = recipient_business_ids;
    return ad_account_to_business_shared_audience_update_with_required_body_local_var;
}

__attribute__((deprecated)) ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body_create(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type,
    list_t *recipient_business_ids
    ) {
    ad_account_to_business_shared_audience_update_with_required_body_t *result = ad_account_to_business_shared_audience_update_with_required_body_create_internal (
        audience_id,
        operation_type,
        recipient_business_ids
        );
    if (!result) {
    }
    return result;
}

void ad_account_to_business_shared_audience_update_with_required_body_free(ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body) {
    if(NULL == ad_account_to_business_shared_audience_update_with_required_body){
        return ;
    }
    if(ad_account_to_business_shared_audience_update_with_required_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_account_to_business_shared_audience_update_with_required_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_to_business_shared_audience_update_with_required_body->audience_id) {
        free(ad_account_to_business_shared_audience_update_with_required_body->audience_id);
        ad_account_to_business_shared_audience_update_with_required_body->audience_id = NULL;
    }
    if (ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids) {
        list_ForEach(listEntry, ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids);
        ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids = NULL;
    }
    free(ad_account_to_business_shared_audience_update_with_required_body);
}

cJSON *ad_account_to_business_shared_audience_update_with_required_body_convertToJSON(ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_to_business_shared_audience_update_with_required_body->audience_id
    if (!ad_account_to_business_shared_audience_update_with_required_body->audience_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "audience_id", ad_account_to_business_shared_audience_update_with_required_body->audience_id) == NULL) {
    goto fail; //String
    }


    // ad_account_to_business_shared_audience_update_with_required_body->operation_type
    if (pinterest_rest_api_operation_type__NULL == ad_account_to_business_shared_audience_update_with_required_body->operation_type) {
        goto fail;
    }
    cJSON *operation_type_local_JSON = operation_type_convertToJSON(ad_account_to_business_shared_audience_update_with_required_body->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids
    if (!ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids) {
        goto fail;
    }
    cJSON *recipient_business_ids = cJSON_AddArrayToObject(item, "recipient_business_ids");
    if(recipient_business_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *recipient_business_idsListEntry;
    list_ForEach(recipient_business_idsListEntry, ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids) {
    if(cJSON_AddStringToObject(recipient_business_ids, "", recipient_business_idsListEntry->data) == NULL)
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

ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body_parseFromJSON(cJSON *ad_account_to_business_shared_audience_update_with_required_bodyJSON){

    ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body_local_var = NULL;

    char *audience_id_local_str = NULL;

    // define the local variable for ad_account_to_business_shared_audience_update_with_required_body->operation_type
    pinterest_rest_api_operation_type__e operation_type_local_nonprim = 0;

    // define the local list for ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids
    list_t *recipient_business_idsList = NULL;

    // ad_account_to_business_shared_audience_update_with_required_body->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(ad_account_to_business_shared_audience_update_with_required_bodyJSON, "audience_id");
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

    // ad_account_to_business_shared_audience_update_with_required_body->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(ad_account_to_business_shared_audience_update_with_required_bodyJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (!operation_type) {
        goto end;
    }

    
    operation_type_local_nonprim = operation_type_parseFromJSON(operation_type); //custom

    // ad_account_to_business_shared_audience_update_with_required_body->recipient_business_ids
    cJSON *recipient_business_ids = cJSON_GetObjectItemCaseSensitive(ad_account_to_business_shared_audience_update_with_required_bodyJSON, "recipient_business_ids");
    if (cJSON_IsNull(recipient_business_ids)) {
        recipient_business_ids = NULL;
    }
    if (!recipient_business_ids) {
        goto end;
    }

    
    cJSON *recipient_business_ids_local = NULL;
    if(!cJSON_IsArray(recipient_business_ids)) {
        goto end;//primitive container
    }
    recipient_business_idsList = list_createList();

    cJSON_ArrayForEach(recipient_business_ids_local, recipient_business_ids)
    {
        if(!cJSON_IsString(recipient_business_ids_local))
        {
            goto end;
        }
        list_addElement(recipient_business_idsList , strdup(recipient_business_ids_local->valuestring));
    }


    if (audience_id && !cJSON_IsNull(audience_id)) audience_id_local_str = strdup(audience_id->valuestring);

    ad_account_to_business_shared_audience_update_with_required_body_local_var = ad_account_to_business_shared_audience_update_with_required_body_create_internal (
        audience_id_local_str,
        operation_type_local_nonprim,
        recipient_business_idsList
        );

    if (!ad_account_to_business_shared_audience_update_with_required_body_local_var) {
        goto end;
    }

    return ad_account_to_business_shared_audience_update_with_required_body_local_var;
end:
    if (audience_id_local_str) {
        free(audience_id_local_str);
        audience_id_local_str = NULL;
    }
    if (operation_type_local_nonprim) {
        operation_type_local_nonprim = 0;
    }
    if (recipient_business_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, recipient_business_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(recipient_business_idsList);
        recipient_business_idsList = NULL;
    }
    return NULL;

}
