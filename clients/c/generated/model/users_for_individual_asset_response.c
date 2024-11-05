#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "users_for_individual_asset_response.h"



users_for_individual_asset_response_t *users_for_individual_asset_response_create(
    char *asset_id,
    char *member_id,
    list_t *permissions
    ) {
    users_for_individual_asset_response_t *users_for_individual_asset_response_local_var = malloc(sizeof(users_for_individual_asset_response_t));
    if (!users_for_individual_asset_response_local_var) {
        return NULL;
    }
    users_for_individual_asset_response_local_var->asset_id = asset_id;
    users_for_individual_asset_response_local_var->member_id = member_id;
    users_for_individual_asset_response_local_var->permissions = permissions;

    return users_for_individual_asset_response_local_var;
}


void users_for_individual_asset_response_free(users_for_individual_asset_response_t *users_for_individual_asset_response) {
    if(NULL == users_for_individual_asset_response){
        return ;
    }
    listEntry_t *listEntry;
    if (users_for_individual_asset_response->asset_id) {
        free(users_for_individual_asset_response->asset_id);
        users_for_individual_asset_response->asset_id = NULL;
    }
    if (users_for_individual_asset_response->member_id) {
        free(users_for_individual_asset_response->member_id);
        users_for_individual_asset_response->member_id = NULL;
    }
    if (users_for_individual_asset_response->permissions) {
        list_ForEach(listEntry, users_for_individual_asset_response->permissions) {
            free(listEntry->data);
        }
        list_freeList(users_for_individual_asset_response->permissions);
        users_for_individual_asset_response->permissions = NULL;
    }
    free(users_for_individual_asset_response);
}

cJSON *users_for_individual_asset_response_convertToJSON(users_for_individual_asset_response_t *users_for_individual_asset_response) {
    cJSON *item = cJSON_CreateObject();

    // users_for_individual_asset_response->asset_id
    if(users_for_individual_asset_response->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", users_for_individual_asset_response->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // users_for_individual_asset_response->member_id
    if(users_for_individual_asset_response->member_id) {
    if(cJSON_AddStringToObject(item, "member_id", users_for_individual_asset_response->member_id) == NULL) {
    goto fail; //String
    }
    }


    // users_for_individual_asset_response->permissions
    if(users_for_individual_asset_response->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, users_for_individual_asset_response->permissions) {
    if(cJSON_AddStringToObject(permissions, "", (char*)permissionsListEntry->data) == NULL)
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

users_for_individual_asset_response_t *users_for_individual_asset_response_parseFromJSON(cJSON *users_for_individual_asset_responseJSON){

    users_for_individual_asset_response_t *users_for_individual_asset_response_local_var = NULL;

    // define the local list for users_for_individual_asset_response->permissions
    list_t *permissionsList = NULL;

    // users_for_individual_asset_response->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(users_for_individual_asset_responseJSON, "asset_id");
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // users_for_individual_asset_response->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(users_for_individual_asset_responseJSON, "member_id");
    if (member_id) { 
    if(!cJSON_IsString(member_id) && !cJSON_IsNull(member_id))
    {
    goto end; //String
    }
    }

    // users_for_individual_asset_response->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(users_for_individual_asset_responseJSON, "permissions");
    if (permissions) { 
    cJSON *permissions_local = NULL;
    if(!cJSON_IsArray(permissions)) {
        goto end;//primitive container
    }
    permissionsList = list_createList();

    cJSON_ArrayForEach(permissions_local, permissions)
    {
        if(!cJSON_IsString(permissions_local))
        {
            goto end;
        }
        list_addElement(permissionsList , strdup(permissions_local->valuestring));
    }
    }


    users_for_individual_asset_response_local_var = users_for_individual_asset_response_create (
        asset_id && !cJSON_IsNull(asset_id) ? strdup(asset_id->valuestring) : NULL,
        member_id && !cJSON_IsNull(member_id) ? strdup(member_id->valuestring) : NULL,
        permissions ? permissionsList : NULL
        );

    return users_for_individual_asset_response_local_var;
end:
    if (permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, permissionsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(permissionsList);
        permissionsList = NULL;
    }
    return NULL;

}
