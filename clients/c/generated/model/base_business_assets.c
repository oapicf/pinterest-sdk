#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "base_business_assets.h"



static base_business_assets_t *base_business_assets_create_internal(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions
    ) {
    base_business_assets_t *base_business_assets_local_var = malloc(sizeof(base_business_assets_t));
    if (!base_business_assets_local_var) {
        return NULL;
    }
    memset(base_business_assets_local_var, 0, sizeof(base_business_assets_t));
    base_business_assets_local_var->_library_owned = 1;
    base_business_assets_local_var->asset_group_info = asset_group_info;
    base_business_assets_local_var->asset_id = asset_id;
    base_business_assets_local_var->asset_type = asset_type;
    base_business_assets_local_var->permissions = permissions;
    return base_business_assets_local_var;
}

__attribute__((deprecated)) base_business_assets_t *base_business_assets_create(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions
    ) {
    base_business_assets_t *result = base_business_assets_create_internal (
        asset_group_info,
        asset_id,
        asset_type,
        permissions
        );
    if (!result) {
    }
    return result;
}

void base_business_assets_free(base_business_assets_t *base_business_assets) {
    if(NULL == base_business_assets){
        return ;
    }
    if(base_business_assets->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "base_business_assets_free");
        return ;
    }
    listEntry_t *listEntry;
    if (base_business_assets->asset_group_info) {
        asset_group_binding_free(base_business_assets->asset_group_info);
        base_business_assets->asset_group_info = NULL;
    }
    if (base_business_assets->asset_id) {
        free(base_business_assets->asset_id);
        base_business_assets->asset_id = NULL;
    }
    if (base_business_assets->permissions) {
        list_ForEach(listEntry, base_business_assets->permissions) {
            free(listEntry->data);
        }
        list_freeList(base_business_assets->permissions);
        base_business_assets->permissions = NULL;
    }
    free(base_business_assets);
}

cJSON *base_business_assets_convertToJSON(base_business_assets_t *base_business_assets) {
    cJSON *item = cJSON_CreateObject();

    // base_business_assets->asset_group_info
    if(base_business_assets->asset_group_info) {
    cJSON *asset_group_info_local_JSON = asset_group_binding_convertToJSON(base_business_assets->asset_group_info);
    if(asset_group_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asset_group_info", asset_group_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_business_assets->asset_id
    if(base_business_assets->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", base_business_assets->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // base_business_assets->asset_type
    if(base_business_assets->asset_type != pinterest_rest_api_asset_type_response__NULL) {
    cJSON *asset_type_local_JSON = asset_type_response_convertToJSON(base_business_assets->asset_type);
    if(asset_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "asset_type", asset_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // base_business_assets->permissions
    if(base_business_assets->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, base_business_assets->permissions) {
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

base_business_assets_t *base_business_assets_parseFromJSON(cJSON *base_business_assetsJSON){

    base_business_assets_t *base_business_assets_local_var = NULL;

    // define the local variable for base_business_assets->asset_group_info
    asset_group_binding_t *asset_group_info_local_nonprim = NULL;

    char *asset_id_local_str = NULL;

    // define the local variable for base_business_assets->asset_type
    pinterest_rest_api_asset_type_response__e asset_type_local_nonprim = 0;

    // define the local list for base_business_assets->permissions
    list_t *permissionsList = NULL;

    // base_business_assets->asset_group_info
    cJSON *asset_group_info = cJSON_GetObjectItemCaseSensitive(base_business_assetsJSON, "asset_group_info");
    if (cJSON_IsNull(asset_group_info)) {
        asset_group_info = NULL;
    }
    if (asset_group_info) { 
    asset_group_info_local_nonprim = asset_group_binding_parseFromJSON(asset_group_info); //nonprimitive
    }

    // base_business_assets->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(base_business_assetsJSON, "asset_id");
    if (cJSON_IsNull(asset_id)) {
        asset_id = NULL;
    }
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // base_business_assets->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(base_business_assetsJSON, "asset_type");
    if (cJSON_IsNull(asset_type)) {
        asset_type = NULL;
    }
    if (asset_type) { 
    asset_type_local_nonprim = asset_type_response_parseFromJSON(asset_type); //custom
    }

    // base_business_assets->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(base_business_assetsJSON, "permissions");
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

    base_business_assets_local_var = base_business_assets_create_internal (
        asset_group_info ? asset_group_info_local_nonprim : NULL,
        asset_id_local_str,
        asset_type ? asset_type_local_nonprim : 0,
        permissions ? permissionsList : NULL
        );

    if (!base_business_assets_local_var) {
        goto end;
    }

    return base_business_assets_local_var;
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
