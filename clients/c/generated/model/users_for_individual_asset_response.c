#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "users_for_individual_asset_response.h"



static users_for_individual_asset_response_t *users_for_individual_asset_response_create_internal(
    char *asset_id,
    char *member_id,
    list_t *permissions
    ) {
    users_for_individual_asset_response_t *users_for_individual_asset_response_local_var = malloc(sizeof(users_for_individual_asset_response_t));
    if (!users_for_individual_asset_response_local_var) {
        return NULL;
    }
    memset(users_for_individual_asset_response_local_var, 0, sizeof(users_for_individual_asset_response_t));
    users_for_individual_asset_response_local_var->_library_owned = 1;
    users_for_individual_asset_response_local_var->asset_id = asset_id;
    users_for_individual_asset_response_local_var->member_id = member_id;
    users_for_individual_asset_response_local_var->permissions = permissions;
    return users_for_individual_asset_response_local_var;
}

__attribute__((deprecated)) users_for_individual_asset_response_t *users_for_individual_asset_response_create(
    char *asset_id,
    char *member_id,
    list_t *permissions
    ) {
    users_for_individual_asset_response_t *result = users_for_individual_asset_response_create_internal (
        asset_id,
        member_id,
        permissions
        );
    if (!result) {
    }
    return result;
}

void users_for_individual_asset_response_free(users_for_individual_asset_response_t *users_for_individual_asset_response) {
    if(NULL == users_for_individual_asset_response){
        return ;
    }
    if(users_for_individual_asset_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "users_for_individual_asset_response_free");
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
    if(cJSON_AddStringToObject(permissions, "", permissionsListEntry->data) == NULL)
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

    char *asset_id_local_str = NULL;

    char *member_id_local_str = NULL;

    // define the local list for users_for_individual_asset_response->permissions
    list_t *permissionsList = NULL;

    // users_for_individual_asset_response->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(users_for_individual_asset_responseJSON, "asset_id");
    if (cJSON_IsNull(asset_id)) {
        asset_id = NULL;
    }
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // users_for_individual_asset_response->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(users_for_individual_asset_responseJSON, "member_id");
    if (cJSON_IsNull(member_id)) {
        member_id = NULL;
    }
    if (member_id) { 
    if(!cJSON_IsString(member_id) && !cJSON_IsNull(member_id))
    {
    goto end; //String
    }
    }

    // users_for_individual_asset_response->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(users_for_individual_asset_responseJSON, "permissions");
    if (cJSON_IsNull(permissions)) {
        permissions = NULL;
    }
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


    if (asset_id && !cJSON_IsNull(asset_id)) asset_id_local_str = strdup(asset_id->valuestring);
    if (member_id && !cJSON_IsNull(member_id)) member_id_local_str = strdup(member_id->valuestring);

    users_for_individual_asset_response_local_var = users_for_individual_asset_response_create_internal (
        asset_id_local_str,
        member_id_local_str,
        permissions ? permissionsList : NULL
        );

    if (!users_for_individual_asset_response_local_var) {
        goto end;
    }

    return users_for_individual_asset_response_local_var;
end:
    if (asset_id_local_str) {
        free(asset_id_local_str);
        asset_id_local_str = NULL;
    }
    if (member_id_local_str) {
        free(member_id_local_str);
        member_id_local_str = NULL;
    }
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
