#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_id_permissions.h"



static asset_id_permissions_t *asset_id_permissions_create_internal(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions
    ) {
    asset_id_permissions_t *asset_id_permissions_local_var = malloc(sizeof(asset_id_permissions_t));
    if (!asset_id_permissions_local_var) {
        return NULL;
    }
    memset(asset_id_permissions_local_var, 0, sizeof(asset_id_permissions_t));
    asset_id_permissions_local_var->_library_owned = 1;
    asset_id_permissions_local_var->asset_group_info = asset_group_info;
    asset_id_permissions_local_var->asset_id = asset_id;
    asset_id_permissions_local_var->asset_type = asset_type;
    asset_id_permissions_local_var->permissions = permissions;
    return asset_id_permissions_local_var;
}

__attribute__((deprecated)) asset_id_permissions_t *asset_id_permissions_create(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions
    ) {
    asset_id_permissions_t *result = asset_id_permissions_create_internal (
        asset_group_info,
        asset_id,
        asset_type,
        permissions
        );
    if (!result) {
    }
    return result;
}

void asset_id_permissions_free(asset_id_permissions_t *asset_id_permissions) {
    if(NULL == asset_id_permissions){
        return ;
    }
    if(asset_id_permissions->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_id_permissions_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_id_permissions->asset_group_info) {
        asset_group_binding_free(asset_id_permissions->asset_group_info);
        asset_id_permissions->asset_group_info = NULL;
    }
    if (asset_id_permissions->asset_id) {
        free(asset_id_permissions->asset_id);
        asset_id_permissions->asset_id = NULL;
    }
    if (asset_id_permissions->permissions) {
        list_ForEach(listEntry, asset_id_permissions->permissions) {
            free(listEntry->data);
        }
        list_freeList(asset_id_permissions->permissions);
        asset_id_permissions->permissions = NULL;
    }
    free(asset_id_permissions);
}

cJSON *asset_id_permissions_convertToJSON(asset_id_permissions_t *asset_id_permissions) {
    cJSON *item = cJSON_CreateObject();

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


    // asset_id_permissions->asset_id
    if (!asset_id_permissions->asset_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_id", asset_id_permissions->asset_id) == NULL) {
    goto fail; //String
    }


    // asset_id_permissions->asset_type
    if (pinterest_rest_api_asset_type_response__NULL == asset_id_permissions->asset_type) {
        goto fail;
    }
    cJSON *asset_type_local_JSON = asset_type_response_convertToJSON(asset_id_permissions->asset_type);
    if(asset_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "asset_type", asset_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // asset_id_permissions->permissions
    if (!asset_id_permissions->permissions) {
        goto fail;
    }
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, asset_id_permissions->permissions) {
    if(cJSON_AddStringToObject(permissions, "", permissionsListEntry->data) == NULL)
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

asset_id_permissions_t *asset_id_permissions_parseFromJSON(cJSON *asset_id_permissionsJSON){

    asset_id_permissions_t *asset_id_permissions_local_var = NULL;

    // define the local variable for asset_id_permissions->asset_group_info
    asset_group_binding_t *asset_group_info_local_nonprim = NULL;

    char *asset_id_local_str = NULL;

    // define the local variable for asset_id_permissions->asset_type
    pinterest_rest_api_asset_type_response__e asset_type_local_nonprim = 0;

    // define the local list for asset_id_permissions->permissions
    list_t *permissionsList = NULL;

    // asset_id_permissions->asset_group_info
    cJSON *asset_group_info = cJSON_GetObjectItemCaseSensitive(asset_id_permissionsJSON, "asset_group_info");
    if (cJSON_IsNull(asset_group_info)) {
        asset_group_info = NULL;
    }
    if (asset_group_info) { 
    asset_group_info_local_nonprim = asset_group_binding_parseFromJSON(asset_group_info); //nonprimitive
    }

    // asset_id_permissions->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(asset_id_permissionsJSON, "asset_id");
    if (cJSON_IsNull(asset_id)) {
        asset_id = NULL;
    }
    if (!asset_id) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_id))
    {
    goto end; //String
    }

    // asset_id_permissions->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(asset_id_permissionsJSON, "asset_type");
    if (cJSON_IsNull(asset_type)) {
        asset_type = NULL;
    }
    if (!asset_type) {
        goto end;
    }

    
    asset_type_local_nonprim = asset_type_response_parseFromJSON(asset_type); //custom

    // asset_id_permissions->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(asset_id_permissionsJSON, "permissions");
    if (cJSON_IsNull(permissions)) {
        permissions = NULL;
    }
    if (!permissions) {
        goto end;
    }

    
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


    if (asset_id && !cJSON_IsNull(asset_id)) asset_id_local_str = strdup(asset_id->valuestring);

    asset_id_permissions_local_var = asset_id_permissions_create_internal (
        asset_group_info ? asset_group_info_local_nonprim : NULL,
        asset_id_local_str,
        asset_type_local_nonprim,
        permissionsList
        );

    if (!asset_id_permissions_local_var) {
        goto end;
    }

    return asset_id_permissions_local_var;
end:
    if (asset_group_info_local_nonprim) {
        asset_group_binding_free(asset_group_info_local_nonprim);
        asset_group_info_local_nonprim = NULL;
    }
    if (asset_id_local_str) {
        free(asset_id_local_str);
        asset_id_local_str = NULL;
    }
    if (asset_type_local_nonprim) {
        asset_type_local_nonprim = 0;
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
