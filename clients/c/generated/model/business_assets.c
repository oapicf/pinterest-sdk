#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_assets.h"



static business_assets_t *business_assets_create_internal(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions,
    catalog_binding_t *catalog_info
    ) {
    business_assets_t *business_assets_local_var = malloc(sizeof(business_assets_t));
    if (!business_assets_local_var) {
        return NULL;
    }
    memset(business_assets_local_var, 0, sizeof(business_assets_t));
    business_assets_local_var->_library_owned = 1;
    business_assets_local_var->asset_group_info = asset_group_info;
    business_assets_local_var->asset_id = asset_id;
    business_assets_local_var->asset_type = asset_type;
    business_assets_local_var->permissions = permissions;
    business_assets_local_var->catalog_info = catalog_info;
    return business_assets_local_var;
}

__attribute__((deprecated)) business_assets_t *business_assets_create(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions,
    catalog_binding_t *catalog_info
    ) {
    business_assets_t *result = business_assets_create_internal (
        asset_group_info,
        asset_id,
        asset_type,
        permissions,
        catalog_info
        );
    if (!result) {
    }
    return result;
}

void business_assets_free(business_assets_t *business_assets) {
    if(NULL == business_assets){
        return ;
    }
    if(business_assets->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_assets_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_assets->asset_group_info) {
        asset_group_binding_free(business_assets->asset_group_info);
        business_assets->asset_group_info = NULL;
    }
    if (business_assets->asset_id) {
        free(business_assets->asset_id);
        business_assets->asset_id = NULL;
    }
    if (business_assets->permissions) {
        list_ForEach(listEntry, business_assets->permissions) {
            free(listEntry->data);
        }
        list_freeList(business_assets->permissions);
        business_assets->permissions = NULL;
    }
    if (business_assets->catalog_info) {
        catalog_binding_free(business_assets->catalog_info);
        business_assets->catalog_info = NULL;
    }
    free(business_assets);
}

cJSON *business_assets_convertToJSON(business_assets_t *business_assets) {
    cJSON *item = cJSON_CreateObject();

    // business_assets->asset_group_info
    if(business_assets->asset_group_info) {
    cJSON *asset_group_info_local_JSON = asset_group_binding_convertToJSON(business_assets->asset_group_info);
    if(asset_group_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asset_group_info", asset_group_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // business_assets->asset_id
    if(business_assets->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", business_assets->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // business_assets->asset_type
    if(business_assets->asset_type != pinterest_rest_api_asset_type_response__NULL) {
    cJSON *asset_type_local_JSON = asset_type_response_convertToJSON(business_assets->asset_type);
    if(asset_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "asset_type", asset_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // business_assets->permissions
    if(business_assets->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, business_assets->permissions) {
    if(cJSON_AddStringToObject(permissions, "", permissionsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // business_assets->catalog_info
    if(business_assets->catalog_info) {
    cJSON *catalog_info_local_JSON = catalog_binding_convertToJSON(business_assets->catalog_info);
    if(catalog_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "catalog_info", catalog_info_local_JSON);
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

business_assets_t *business_assets_parseFromJSON(cJSON *business_assetsJSON){

    business_assets_t *business_assets_local_var = NULL;

    // define the local variable for business_assets->asset_group_info
    asset_group_binding_t *asset_group_info_local_nonprim = NULL;

    char *asset_id_local_str = NULL;

    // define the local variable for business_assets->asset_type
    pinterest_rest_api_asset_type_response__e asset_type_local_nonprim = 0;

    // define the local list for business_assets->permissions
    list_t *permissionsList = NULL;

    // define the local variable for business_assets->catalog_info
    catalog_binding_t *catalog_info_local_nonprim = NULL;

    // business_assets->asset_group_info
    cJSON *asset_group_info = cJSON_GetObjectItemCaseSensitive(business_assetsJSON, "asset_group_info");
    if (cJSON_IsNull(asset_group_info)) {
        asset_group_info = NULL;
    }
    if (asset_group_info) { 
    asset_group_info_local_nonprim = asset_group_binding_parseFromJSON(asset_group_info); //nonprimitive
    }

    // business_assets->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(business_assetsJSON, "asset_id");
    if (cJSON_IsNull(asset_id)) {
        asset_id = NULL;
    }
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // business_assets->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(business_assetsJSON, "asset_type");
    if (cJSON_IsNull(asset_type)) {
        asset_type = NULL;
    }
    if (asset_type) { 
    asset_type_local_nonprim = asset_type_response_parseFromJSON(asset_type); //custom
    }

    // business_assets->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(business_assetsJSON, "permissions");
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

    // business_assets->catalog_info
    cJSON *catalog_info = cJSON_GetObjectItemCaseSensitive(business_assetsJSON, "catalog_info");
    if (cJSON_IsNull(catalog_info)) {
        catalog_info = NULL;
    }
    if (catalog_info) { 
    catalog_info_local_nonprim = catalog_binding_parseFromJSON(catalog_info); //nonprimitive
    }


    if (asset_id && !cJSON_IsNull(asset_id)) asset_id_local_str = strdup(asset_id->valuestring);

    business_assets_local_var = business_assets_create_internal (
        asset_group_info ? asset_group_info_local_nonprim : NULL,
        asset_id_local_str,
        asset_type ? asset_type_local_nonprim : 0,
        permissions ? permissionsList : NULL,
        catalog_info ? catalog_info_local_nonprim : NULL
        );

    if (!business_assets_local_var) {
        goto end;
    }

    return business_assets_local_var;
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
    if (catalog_info_local_nonprim) {
        catalog_binding_free(catalog_info_local_nonprim);
        catalog_info_local_nonprim = NULL;
    }
    return NULL;

}
