#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_to_business_shared_audience.h"


char* business_to_business_shared_audience_permissions_ToString(pinterest_rest_api_business_to_business_shared_audience__e permissions) {
    char *permissionsArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    return permissionsArray[permissions - 1];
}

pinterest_rest_api_business_to_business_shared_audience__e business_to_business_shared_audience_permissions_FromString(char* permissions) {
    int stringToReturn = 0;
    char *permissionsArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    size_t sizeofArray = sizeof(permissionsArray) / sizeof(permissionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions, permissionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static business_to_business_shared_audience_t *business_to_business_shared_audience_create_internal(
    char *audience_id,
    list_t *permissions,
    list_t *recipient_business_ids
    ) {
    business_to_business_shared_audience_t *business_to_business_shared_audience_local_var = malloc(sizeof(business_to_business_shared_audience_t));
    if (!business_to_business_shared_audience_local_var) {
        return NULL;
    }
    memset(business_to_business_shared_audience_local_var, 0, sizeof(business_to_business_shared_audience_t));
    business_to_business_shared_audience_local_var->_library_owned = 1;
    business_to_business_shared_audience_local_var->audience_id = audience_id;
    business_to_business_shared_audience_local_var->permissions = permissions;
    business_to_business_shared_audience_local_var->recipient_business_ids = recipient_business_ids;
    return business_to_business_shared_audience_local_var;
}

__attribute__((deprecated)) business_to_business_shared_audience_t *business_to_business_shared_audience_create(
    char *audience_id,
    list_t *permissions,
    list_t *recipient_business_ids
    ) {
    business_to_business_shared_audience_t *result = business_to_business_shared_audience_create_internal (
        audience_id,
        permissions,
        recipient_business_ids
        );
    if (!result) {
    }
    return result;
}

void business_to_business_shared_audience_free(business_to_business_shared_audience_t *business_to_business_shared_audience) {
    if(NULL == business_to_business_shared_audience){
        return ;
    }
    if(business_to_business_shared_audience->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_to_business_shared_audience_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_to_business_shared_audience->audience_id) {
        free(business_to_business_shared_audience->audience_id);
        business_to_business_shared_audience->audience_id = NULL;
    }
    if (business_to_business_shared_audience->permissions) {
        list_ForEach(listEntry, business_to_business_shared_audience->permissions) {
            role_free(listEntry->data);
        }
        list_freeList(business_to_business_shared_audience->permissions);
        business_to_business_shared_audience->permissions = NULL;
    }
    if (business_to_business_shared_audience->recipient_business_ids) {
        list_ForEach(listEntry, business_to_business_shared_audience->recipient_business_ids) {
            free(listEntry->data);
        }
        list_freeList(business_to_business_shared_audience->recipient_business_ids);
        business_to_business_shared_audience->recipient_business_ids = NULL;
    }
    free(business_to_business_shared_audience);
}

cJSON *business_to_business_shared_audience_convertToJSON(business_to_business_shared_audience_t *business_to_business_shared_audience) {
    cJSON *item = cJSON_CreateObject();

    // business_to_business_shared_audience->audience_id
    if (!business_to_business_shared_audience->audience_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "audience_id", business_to_business_shared_audience->audience_id) == NULL) {
    goto fail; //String
    }


    // business_to_business_shared_audience->permissions
    if(business_to_business_shared_audience->permissions != pinterest_rest_api_list_PERMISSIONS_NULL) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *permissionsListEntry;
    if (business_to_business_shared_audience->permissions) {
    list_ForEach(permissionsListEntry, business_to_business_shared_audience->permissions) {
    cJSON *itemLocal = role_convertToJSON((pinterest_rest_api_business_to_business_shared_audience__e)permissionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(permissions, itemLocal);
    }
    }
    }


    // business_to_business_shared_audience->recipient_business_ids
    if (!business_to_business_shared_audience->recipient_business_ids) {
        goto fail;
    }
    cJSON *recipient_business_ids = cJSON_AddArrayToObject(item, "recipient_business_ids");
    if(recipient_business_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *recipient_business_idsListEntry;
    list_ForEach(recipient_business_idsListEntry, business_to_business_shared_audience->recipient_business_ids) {
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

business_to_business_shared_audience_t *business_to_business_shared_audience_parseFromJSON(cJSON *business_to_business_shared_audienceJSON){

    business_to_business_shared_audience_t *business_to_business_shared_audience_local_var = NULL;

    char *audience_id_local_str = NULL;

    // define the local list for business_to_business_shared_audience->permissions
    list_t *permissionsList = NULL;

    // define the local list for business_to_business_shared_audience->recipient_business_ids
    list_t *recipient_business_idsList = NULL;

    // business_to_business_shared_audience->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(business_to_business_shared_audienceJSON, "audience_id");
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

    // business_to_business_shared_audience->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(business_to_business_shared_audienceJSON, "permissions");
    if (cJSON_IsNull(permissions)) {
        permissions = NULL;
    }
    if (permissions) { 
    cJSON *permissions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(permissions)){
        goto end; //nonprimitive container
    }

    permissionsList = list_createList();

    cJSON_ArrayForEach(permissions_local_nonprimitive,permissions )
    {
        if(!cJSON_IsObject(permissions_local_nonprimitive)){
            goto end;
        }
        business_to_business_shared_audience_role_e permissionsItem = role_parseFromJSON(permissions_local_nonprimitive);

        list_addElement(permissionsList, (void *)permissionsItem);
    }
    }

    // business_to_business_shared_audience->recipient_business_ids
    cJSON *recipient_business_ids = cJSON_GetObjectItemCaseSensitive(business_to_business_shared_audienceJSON, "recipient_business_ids");
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

    business_to_business_shared_audience_local_var = business_to_business_shared_audience_create_internal (
        audience_id_local_str,
        permissions ? permissionsList : NULL,
        recipient_business_idsList
        );

    if (!business_to_business_shared_audience_local_var) {
        goto end;
    }

    return business_to_business_shared_audience_local_var;
end:
    if (audience_id_local_str) {
        free(audience_id_local_str);
        audience_id_local_str = NULL;
    }
    if (permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, permissionsList) {
            role_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(permissionsList);
        permissionsList = NULL;
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
