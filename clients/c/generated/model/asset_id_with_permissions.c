#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_id_with_permissions.h"



static asset_id_with_permissions_t *asset_id_with_permissions_create_internal(
    char *id,
    list_t *permissions
    ) {
    asset_id_with_permissions_t *asset_id_with_permissions_local_var = malloc(sizeof(asset_id_with_permissions_t));
    if (!asset_id_with_permissions_local_var) {
        return NULL;
    }
    memset(asset_id_with_permissions_local_var, 0, sizeof(asset_id_with_permissions_t));
    asset_id_with_permissions_local_var->_library_owned = 1;
    asset_id_with_permissions_local_var->id = id;
    asset_id_with_permissions_local_var->permissions = permissions;
    return asset_id_with_permissions_local_var;
}

__attribute__((deprecated)) asset_id_with_permissions_t *asset_id_with_permissions_create(
    char *id,
    list_t *permissions
    ) {
    asset_id_with_permissions_t *result = asset_id_with_permissions_create_internal (
        id,
        permissions
        );
    if (!result) {
    }
    return result;
}

void asset_id_with_permissions_free(asset_id_with_permissions_t *asset_id_with_permissions) {
    if(NULL == asset_id_with_permissions){
        return ;
    }
    if(asset_id_with_permissions->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_id_with_permissions_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_id_with_permissions->id) {
        free(asset_id_with_permissions->id);
        asset_id_with_permissions->id = NULL;
    }
    if (asset_id_with_permissions->permissions) {
        list_ForEach(listEntry, asset_id_with_permissions->permissions) {
            free(listEntry->data);
        }
        list_freeList(asset_id_with_permissions->permissions);
        asset_id_with_permissions->permissions = NULL;
    }
    free(asset_id_with_permissions);
}

cJSON *asset_id_with_permissions_convertToJSON(asset_id_with_permissions_t *asset_id_with_permissions) {
    cJSON *item = cJSON_CreateObject();

    // asset_id_with_permissions->id
    if(asset_id_with_permissions->id) {
    if(cJSON_AddStringToObject(item, "id", asset_id_with_permissions->id) == NULL) {
    goto fail; //String
    }
    }


    // asset_id_with_permissions->permissions
    if(asset_id_with_permissions->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, asset_id_with_permissions->permissions) {
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

asset_id_with_permissions_t *asset_id_with_permissions_parseFromJSON(cJSON *asset_id_with_permissionsJSON){

    asset_id_with_permissions_t *asset_id_with_permissions_local_var = NULL;

    char *id_local_str = NULL;

    // define the local list for asset_id_with_permissions->permissions
    list_t *permissionsList = NULL;

    // asset_id_with_permissions->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(asset_id_with_permissionsJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // asset_id_with_permissions->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(asset_id_with_permissionsJSON, "permissions");
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


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    asset_id_with_permissions_local_var = asset_id_with_permissions_create_internal (
        id_local_str,
        permissions ? permissionsList : NULL
        );

    if (!asset_id_with_permissions_local_var) {
        goto end;
    }

    return asset_id_with_permissions_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
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
