#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shared_audience_response.h"


char* shared_audience_response_permissions_ToString(pinterest_rest_api_shared_audience_response__e permissions) {
    char *permissionsArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    return permissionsArray[permissions - 1];
}

pinterest_rest_api_shared_audience_response__e shared_audience_response_permissions_FromString(char* permissions) {
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

shared_audience_response_t *shared_audience_response_create(
    char *audience_id,
    list_t *permissions,
    list_t *recipient_account_ids
    ) {
    shared_audience_response_t *shared_audience_response_local_var = malloc(sizeof(shared_audience_response_t));
    if (!shared_audience_response_local_var) {
        return NULL;
    }
    shared_audience_response_local_var->audience_id = audience_id;
    shared_audience_response_local_var->permissions = permissions;
    shared_audience_response_local_var->recipient_account_ids = recipient_account_ids;

    return shared_audience_response_local_var;
}


void shared_audience_response_free(shared_audience_response_t *shared_audience_response) {
    if(NULL == shared_audience_response){
        return ;
    }
    listEntry_t *listEntry;
    if (shared_audience_response->audience_id) {
        free(shared_audience_response->audience_id);
        shared_audience_response->audience_id = NULL;
    }
    if (shared_audience_response->permissions) {
        list_ForEach(listEntry, shared_audience_response->permissions) {
            role_free(listEntry->data);
        }
        list_freeList(shared_audience_response->permissions);
        shared_audience_response->permissions = NULL;
    }
    if (shared_audience_response->recipient_account_ids) {
        list_ForEach(listEntry, shared_audience_response->recipient_account_ids) {
            free(listEntry->data);
        }
        list_freeList(shared_audience_response->recipient_account_ids);
        shared_audience_response->recipient_account_ids = NULL;
    }
    free(shared_audience_response);
}

cJSON *shared_audience_response_convertToJSON(shared_audience_response_t *shared_audience_response) {
    cJSON *item = cJSON_CreateObject();

    // shared_audience_response->audience_id
    if(shared_audience_response->audience_id) {
    if(cJSON_AddStringToObject(item, "audience_id", shared_audience_response->audience_id) == NULL) {
    goto fail; //String
    }
    }


    // shared_audience_response->permissions
    if(shared_audience_response->permissions != pinterest_rest_api_shared_audience_response_PERMISSIONS_NULL) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *permissionsListEntry;
    if (shared_audience_response->permissions) {
    list_ForEach(permissionsListEntry, shared_audience_response->permissions) {
    cJSON *itemLocal = role_convertToJSON((pinterest_rest_api_shared_audience_response__e)permissionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(permissions, itemLocal);
    }
    }
    }


    // shared_audience_response->recipient_account_ids
    if(shared_audience_response->recipient_account_ids) {
    cJSON *recipient_account_ids = cJSON_AddArrayToObject(item, "recipient_account_ids");
    if(recipient_account_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *recipient_account_idsListEntry;
    list_ForEach(recipient_account_idsListEntry, shared_audience_response->recipient_account_ids) {
    if(cJSON_AddStringToObject(recipient_account_ids, "", (char*)recipient_account_idsListEntry->data) == NULL)
    {
        goto fail;
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

shared_audience_response_t *shared_audience_response_parseFromJSON(cJSON *shared_audience_responseJSON){

    shared_audience_response_t *shared_audience_response_local_var = NULL;

    // define the local list for shared_audience_response->permissions
    list_t *permissionsList = NULL;

    // define the local list for shared_audience_response->recipient_account_ids
    list_t *recipient_account_idsList = NULL;

    // shared_audience_response->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(shared_audience_responseJSON, "audience_id");
    if (audience_id) { 
    if(!cJSON_IsString(audience_id) && !cJSON_IsNull(audience_id))
    {
    goto end; //String
    }
    }

    // shared_audience_response->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(shared_audience_responseJSON, "permissions");
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
        shared_audience_response_role_e permissionsItem = role_parseFromJSON(permissions_local_nonprimitive);

        list_addElement(permissionsList, (void *)permissionsItem);
    }
    }

    // shared_audience_response->recipient_account_ids
    cJSON *recipient_account_ids = cJSON_GetObjectItemCaseSensitive(shared_audience_responseJSON, "recipient_account_ids");
    if (recipient_account_ids) { 
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
    }


    shared_audience_response_local_var = shared_audience_response_create (
        audience_id && !cJSON_IsNull(audience_id) ? strdup(audience_id->valuestring) : NULL,
        permissions ? permissionsList : NULL,
        recipient_account_ids ? recipient_account_idsList : NULL
        );

    return shared_audience_response_local_var;
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
