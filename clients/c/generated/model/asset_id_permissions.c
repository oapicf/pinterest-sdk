#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_id_permissions.h"



asset_id_permissions_t *asset_id_permissions_create(
    char *asset_id,
    char *asset_type,
    list_t *permissions,
    asset_group_binding_t *asset_group_info
    ) {
    asset_id_permissions_t *asset_id_permissions_local_var = malloc(sizeof(asset_id_permissions_t));
    if (!asset_id_permissions_local_var) {
        return NULL;
    }
    asset_id_permissions_local_var->asset_id = asset_id;
    asset_id_permissions_local_var->asset_type = asset_type;
    asset_id_permissions_local_var->permissions = permissions;
    asset_id_permissions_local_var->asset_group_info = asset_group_info;

    return asset_id_permissions_local_var;
}


void asset_id_permissions_free(asset_id_permissions_t *asset_id_permissions) {
    if(NULL == asset_id_permissions){
        return ;
    }
    listEntry_t *listEntry;
    if (asset_id_permissions->asset_id) {
        free(asset_id_permissions->asset_id);
        asset_id_permissions->asset_id = NULL;
    }
    if (asset_id_permissions->asset_type) {
        free(asset_id_permissions->asset_type);
        asset_id_permissions->asset_type = NULL;
    }
    if (asset_id_permissions->permissions) {
        list_ForEach(listEntry, asset_id_permissions->permissions) {
            free(listEntry->data);
        }
        list_freeList(asset_id_permissions->permissions);
        asset_id_permissions->permissions = NULL;
    }
    if (asset_id_permissions->asset_group_info) {
        asset_group_binding_free(asset_id_permissions->asset_group_info);
        asset_id_permissions->asset_group_info = NULL;
    }
    free(asset_id_permissions);
}

cJSON *asset_id_permissions_convertToJSON(asset_id_permissions_t *asset_id_permissions) {
    cJSON *item = cJSON_CreateObject();

    // asset_id_permissions->asset_id
    if(asset_id_permissions->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", asset_id_permissions->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // asset_id_permissions->asset_type
    if(asset_id_permissions->asset_type) {
    if(cJSON_AddStringToObject(item, "asset_type", asset_id_permissions->asset_type) == NULL) {
    goto fail; //String
    }
    }


    // asset_id_permissions->permissions
    if(asset_id_permissions->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, asset_id_permissions->permissions) {
    if(cJSON_AddStringToObject(permissions, "", (char*)permissionsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // asset_id_permissions->asset_group_info
    if(asset_id_permissions->asset_group_info) {
    cJSON *asset_group_info_local_JSON = asset_group_binding_convertToJSON(asset_id_permissions->asset_group_info);
    if(asset_group_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asset_group_info", asset_group_info_local_JSON);
    if(item->child == NULL) {
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

asset_id_permissions_t *asset_id_permissions_parseFromJSON(cJSON *asset_id_permissionsJSON){

    asset_id_permissions_t *asset_id_permissions_local_var = NULL;

    // define the local list for asset_id_permissions->permissions
    list_t *permissionsList = NULL;

    // define the local variable for asset_id_permissions->asset_group_info
    asset_group_binding_t *asset_group_info_local_nonprim = NULL;

    // asset_id_permissions->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(asset_id_permissionsJSON, "asset_id");
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // asset_id_permissions->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(asset_id_permissionsJSON, "asset_type");
    if (asset_type) { 
    if(!cJSON_IsString(asset_type) && !cJSON_IsNull(asset_type))
    {
    goto end; //String
    }
    }

    // asset_id_permissions->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(asset_id_permissionsJSON, "permissions");
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

    // asset_id_permissions->asset_group_info
    cJSON *asset_group_info = cJSON_GetObjectItemCaseSensitive(asset_id_permissionsJSON, "asset_group_info");
    if (asset_group_info) { 
    asset_group_info_local_nonprim = asset_group_binding_parseFromJSON(asset_group_info); //nonprimitive
    }


    asset_id_permissions_local_var = asset_id_permissions_create (
        asset_id && !cJSON_IsNull(asset_id) ? strdup(asset_id->valuestring) : NULL,
        asset_type && !cJSON_IsNull(asset_type) ? strdup(asset_type->valuestring) : NULL,
        permissions ? permissionsList : NULL,
        asset_group_info ? asset_group_info_local_nonprim : NULL
        );

    return asset_id_permissions_local_var;
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
    if (asset_group_info_local_nonprim) {
        asset_group_binding_free(asset_group_info_local_nonprim);
        asset_group_info_local_nonprim = NULL;
    }
    return NULL;

}
