#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "auth_respond_invite_action.h"


char* auth_respond_invite_action_inner_ToString(pinterest_rest_api_auth_respond_invite_action_INNER_e inner) {
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER", "BIZ_PINNER_LIST_SHARER" };
    return innerArray[inner - 1];
}

pinterest_rest_api_auth_respond_invite_action_INNER_e auth_respond_invite_action_inner_FromString(char* inner) {
    int stringToReturn = 0;
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER", "BIZ_PINNER_LIST_SHARER" };
    size_t sizeofArray = sizeof(innerArray) / sizeof(innerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(inner, innerArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static auth_respond_invite_action_t *auth_respond_invite_action_create_internal(
    int *accept_invite,
    list_t* asset_id_to_permissions
    ) {
    auth_respond_invite_action_t *auth_respond_invite_action_local_var = malloc(sizeof(auth_respond_invite_action_t));
    if (!auth_respond_invite_action_local_var) {
        return NULL;
    }
    memset(auth_respond_invite_action_local_var, 0, sizeof(auth_respond_invite_action_t));
    auth_respond_invite_action_local_var->_library_owned = 1;
    auth_respond_invite_action_local_var->accept_invite = accept_invite;
    auth_respond_invite_action_local_var->asset_id_to_permissions = asset_id_to_permissions;
    return auth_respond_invite_action_local_var;
}

__attribute__((deprecated)) auth_respond_invite_action_t *auth_respond_invite_action_create(
    int *accept_invite,
    list_t* asset_id_to_permissions
    ) {
    int *accept_invite_copy = NULL;
    if (accept_invite) {
        accept_invite_copy = malloc(sizeof(int));
        if (accept_invite_copy) *accept_invite_copy = *accept_invite;
    }
    auth_respond_invite_action_t *result = auth_respond_invite_action_create_internal (
        accept_invite_copy,
        asset_id_to_permissions
        );
    if (!result) {
        free(accept_invite_copy);
    }
    return result;
}

void auth_respond_invite_action_free(auth_respond_invite_action_t *auth_respond_invite_action) {
    if(NULL == auth_respond_invite_action){
        return ;
    }
    if(auth_respond_invite_action->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "auth_respond_invite_action_free");
        return ;
    }
    listEntry_t *listEntry;
    if (auth_respond_invite_action->accept_invite) {
        free(auth_respond_invite_action->accept_invite);
        auth_respond_invite_action->accept_invite = NULL;
    }
    if (auth_respond_invite_action->asset_id_to_permissions) {
        list_ForEach(listEntry, auth_respond_invite_action->asset_id_to_permissions) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(auth_respond_invite_action->asset_id_to_permissions);
        auth_respond_invite_action->asset_id_to_permissions = NULL;
    }
    free(auth_respond_invite_action);
}

cJSON *auth_respond_invite_action_convertToJSON(auth_respond_invite_action_t *auth_respond_invite_action) {
    cJSON *item = cJSON_CreateObject();

    // auth_respond_invite_action->accept_invite
    if (!auth_respond_invite_action->accept_invite) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "accept_invite", *auth_respond_invite_action->accept_invite) == NULL) {
    goto fail; //Bool
    }


    // auth_respond_invite_action->asset_id_to_permissions
    if(auth_respond_invite_action->asset_id_to_permissions != pinterest_rest_api_auth_respond_invite_action_ASSETIDTOPERMISSIONS_NULL) {
    cJSON *asset_id_to_permissions = cJSON_AddObjectToObject(item, "asset_id_to_permissions");
    if(asset_id_to_permissions == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = asset_id_to_permissions;
    listEntry_t *asset_id_to_permissionsListEntry;
    if (auth_respond_invite_action->asset_id_to_permissions) {
    list_ForEach(asset_id_to_permissionsListEntry, auth_respond_invite_action->asset_id_to_permissions) {
        keyValuePair_t *localKeyValue = asset_id_to_permissionsListEntry->data;
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

auth_respond_invite_action_t *auth_respond_invite_action_parseFromJSON(cJSON *auth_respond_invite_actionJSON){

    auth_respond_invite_action_t *auth_respond_invite_action_local_var = NULL;

    // define the local variable for auth_respond_invite_action->accept_invite
    int *accept_invite_local_var = NULL;

    // define the local map for auth_respond_invite_action->asset_id_to_permissions
    list_t *asset_id_to_permissionsList = NULL;

    // auth_respond_invite_action->accept_invite
    cJSON *accept_invite = cJSON_GetObjectItemCaseSensitive(auth_respond_invite_actionJSON, "accept_invite");
    if (cJSON_IsNull(accept_invite)) {
        accept_invite = NULL;
    }
    if (!accept_invite) {
        goto end;
    }

    
    if(!cJSON_IsBool(accept_invite))
    {
    goto end; //Bool
    }
    accept_invite_local_var = malloc(sizeof(int));
    if(!accept_invite_local_var)
    {
        goto end;
    }
    *accept_invite_local_var = accept_invite->valueint;

    // auth_respond_invite_action->asset_id_to_permissions
    cJSON *asset_id_to_permissions = cJSON_GetObjectItemCaseSensitive(auth_respond_invite_actionJSON, "asset_id_to_permissions");
    if (cJSON_IsNull(asset_id_to_permissions)) {
        asset_id_to_permissions = NULL;
    }
    if (asset_id_to_permissions) { 
    cJSON *asset_id_to_permissions_local_map = NULL;
    if(!cJSON_IsObject(asset_id_to_permissions) && !cJSON_IsNull(asset_id_to_permissions))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(asset_id_to_permissions))
    {
        asset_id_to_permissionsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(asset_id_to_permissions_local_map, asset_id_to_permissions)
        {
            cJSON *localMapObject = asset_id_to_permissions_local_map;
            list_addElement(asset_id_to_permissionsList , localMapKeyPair);
        }
    }
    }



    auth_respond_invite_action_local_var = auth_respond_invite_action_create_internal (
        accept_invite_local_var,
        asset_id_to_permissions ? asset_id_to_permissionsList : NULL
        );

    if (!auth_respond_invite_action_local_var) {
        goto end;
    }

    return auth_respond_invite_action_local_var;
end:
    if (accept_invite_local_var) {
        free(accept_invite_local_var);
        accept_invite_local_var = NULL;
    }
    if (asset_id_to_permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_id_to_permissionsList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(asset_id_to_permissionsList);
        asset_id_to_permissionsList = NULL;
    }
    return NULL;

}
