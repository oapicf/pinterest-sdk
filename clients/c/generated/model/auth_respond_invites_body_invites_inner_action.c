#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "auth_respond_invites_body_invites_inner_action.h"


char* auth_respond_invites_body_invites_inner_action_inner_ToString(pinterest_rest_api_auth_respond_invites_body_invites_inner_action_INNER_e inner) {
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    return innerArray[inner - 1];
}

pinterest_rest_api_auth_respond_invites_body_invites_inner_action_INNER_e auth_respond_invites_body_invites_inner_action_inner_FromString(char* inner) {
    int stringToReturn = 0;
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    size_t sizeofArray = sizeof(innerArray) / sizeof(innerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(inner, innerArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

auth_respond_invites_body_invites_inner_action_t *auth_respond_invites_body_invites_inner_action_create(
    int accept_invite,
    list_t* asset_id_to_permissions
    ) {
    auth_respond_invites_body_invites_inner_action_t *auth_respond_invites_body_invites_inner_action_local_var = malloc(sizeof(auth_respond_invites_body_invites_inner_action_t));
    if (!auth_respond_invites_body_invites_inner_action_local_var) {
        return NULL;
    }
    auth_respond_invites_body_invites_inner_action_local_var->accept_invite = accept_invite;
    auth_respond_invites_body_invites_inner_action_local_var->asset_id_to_permissions = asset_id_to_permissions;

    return auth_respond_invites_body_invites_inner_action_local_var;
}


void auth_respond_invites_body_invites_inner_action_free(auth_respond_invites_body_invites_inner_action_t *auth_respond_invites_body_invites_inner_action) {
    if(NULL == auth_respond_invites_body_invites_inner_action){
        return ;
    }
    listEntry_t *listEntry;
    if (auth_respond_invites_body_invites_inner_action->asset_id_to_permissions) {
        list_ForEach(listEntry, auth_respond_invites_body_invites_inner_action->asset_id_to_permissions) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(auth_respond_invites_body_invites_inner_action->asset_id_to_permissions);
        auth_respond_invites_body_invites_inner_action->asset_id_to_permissions = NULL;
    }
    free(auth_respond_invites_body_invites_inner_action);
}

cJSON *auth_respond_invites_body_invites_inner_action_convertToJSON(auth_respond_invites_body_invites_inner_action_t *auth_respond_invites_body_invites_inner_action) {
    cJSON *item = cJSON_CreateObject();

    // auth_respond_invites_body_invites_inner_action->accept_invite
    if (!auth_respond_invites_body_invites_inner_action->accept_invite) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "accept_invite", auth_respond_invites_body_invites_inner_action->accept_invite) == NULL) {
    goto fail; //Bool
    }


    // auth_respond_invites_body_invites_inner_action->asset_id_to_permissions
    if(auth_respond_invites_body_invites_inner_action->asset_id_to_permissions != pinterest_rest_api_auth_respond_invites_body_invites_inner_action_ASSETIDTOPERMISSIONS_NULL) {
    cJSON *asset_id_to_permissions = cJSON_AddObjectToObject(item, "asset_id_to_permissions");
    if(asset_id_to_permissions == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = asset_id_to_permissions;
    listEntry_t *asset_id_to_permissionsListEntry;
    if (auth_respond_invites_body_invites_inner_action->asset_id_to_permissions) {
    list_ForEach(asset_id_to_permissionsListEntry, auth_respond_invites_body_invites_inner_action->asset_id_to_permissions) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)asset_id_to_permissionsListEntry->data;
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

auth_respond_invites_body_invites_inner_action_t *auth_respond_invites_body_invites_inner_action_parseFromJSON(cJSON *auth_respond_invites_body_invites_inner_actionJSON){

    auth_respond_invites_body_invites_inner_action_t *auth_respond_invites_body_invites_inner_action_local_var = NULL;

    // define the local map for auth_respond_invites_body_invites_inner_action->asset_id_to_permissions
    list_t *asset_id_to_permissionsList = NULL;

    // auth_respond_invites_body_invites_inner_action->accept_invite
    cJSON *accept_invite = cJSON_GetObjectItemCaseSensitive(auth_respond_invites_body_invites_inner_actionJSON, "accept_invite");
    if (!accept_invite) {
        goto end;
    }

    
    if(!cJSON_IsBool(accept_invite))
    {
    goto end; //Bool
    }

    // auth_respond_invites_body_invites_inner_action->asset_id_to_permissions
    cJSON *asset_id_to_permissions = cJSON_GetObjectItemCaseSensitive(auth_respond_invites_body_invites_inner_actionJSON, "asset_id_to_permissions");
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


    auth_respond_invites_body_invites_inner_action_local_var = auth_respond_invites_body_invites_inner_action_create (
        accept_invite->valueint,
        asset_id_to_permissions ? asset_id_to_permissionsList : NULL
        );

    return auth_respond_invites_body_invites_inner_action_local_var;
end:
    if (asset_id_to_permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_id_to_permissionsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
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
