#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shared_audience_response_common.h"


char* shared_audience_response_common_permissions_ToString(pinterest_rest_api_shared_audience_response_common__e permissions) {
    char *permissionsArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    return permissionsArray[permissions - 1];
}

pinterest_rest_api_shared_audience_response_common__e shared_audience_response_common_permissions_FromString(char* permissions) {
    int stringToReturn = 0;
    char *permissionsArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    size_t sizeofArray = sizeof(permissionsArray) / sizeof(permissionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions, permissionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

shared_audience_response_common_t *shared_audience_response_common_create(
    char *audience_id,
    list_t *permissions
    ) {
    shared_audience_response_common_t *shared_audience_response_common_local_var = malloc(sizeof(shared_audience_response_common_t));
    if (!shared_audience_response_common_local_var) {
        return NULL;
    }
    shared_audience_response_common_local_var->audience_id = audience_id;
    shared_audience_response_common_local_var->permissions = permissions;

    return shared_audience_response_common_local_var;
}


void shared_audience_response_common_free(shared_audience_response_common_t *shared_audience_response_common) {
    if(NULL == shared_audience_response_common){
        return ;
    }
    listEntry_t *listEntry;
    if (shared_audience_response_common->audience_id) {
        free(shared_audience_response_common->audience_id);
        shared_audience_response_common->audience_id = NULL;
    }
    if (shared_audience_response_common->permissions) {
        list_ForEach(listEntry, shared_audience_response_common->permissions) {
            role_free(listEntry->data);
        }
        list_freeList(shared_audience_response_common->permissions);
        shared_audience_response_common->permissions = NULL;
    }
    free(shared_audience_response_common);
}

cJSON *shared_audience_response_common_convertToJSON(shared_audience_response_common_t *shared_audience_response_common) {
    cJSON *item = cJSON_CreateObject();

    // shared_audience_response_common->audience_id
    if(shared_audience_response_common->audience_id) {
    if(cJSON_AddStringToObject(item, "audience_id", shared_audience_response_common->audience_id) == NULL) {
    goto fail; //String
    }
    }


    // shared_audience_response_common->permissions
    if(shared_audience_response_common->permissions != pinterest_rest_api_shared_audience_response_common_PERMISSIONS_NULL) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *permissionsListEntry;
    if (shared_audience_response_common->permissions) {
    list_ForEach(permissionsListEntry, shared_audience_response_common->permissions) {
    cJSON *itemLocal = role_convertToJSON((pinterest_rest_api_shared_audience_response_common__e)permissionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(permissions, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

shared_audience_response_common_t *shared_audience_response_common_parseFromJSON(cJSON *shared_audience_response_commonJSON){

    shared_audience_response_common_t *shared_audience_response_common_local_var = NULL;

    // define the local list for shared_audience_response_common->permissions
    list_t *permissionsList = NULL;

    // shared_audience_response_common->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(shared_audience_response_commonJSON, "audience_id");
    if (audience_id) { 
    if(!cJSON_IsString(audience_id) && !cJSON_IsNull(audience_id))
    {
    goto end; //String
    }
    }

    // shared_audience_response_common->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(shared_audience_response_commonJSON, "permissions");
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
        shared_audience_response_common_role_e permissionsItem = role_parseFromJSON(permissions_local_nonprimitive);

        list_addElement(permissionsList, (void *)permissionsItem);
    }
    }


    shared_audience_response_common_local_var = shared_audience_response_common_create (
        audience_id && !cJSON_IsNull(audience_id) ? strdup(audience_id->valuestring) : NULL,
        permissions ? permissionsList : NULL
        );

    return shared_audience_response_common_local_var;
end:
    if (permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, permissionsList) {
            role_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(permissionsList);
        permissionsList = NULL;
    }
    return NULL;

}
