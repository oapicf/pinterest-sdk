#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_partner_assets_response.h"



get_partner_assets_response_t *get_partner_assets_response_create(
    char *asset_id,
    char *asset_type,
    list_t *permissions,
    asset_group_binding_t *asset_group_info
    ) {
    get_partner_assets_response_t *get_partner_assets_response_local_var = malloc(sizeof(get_partner_assets_response_t));
    if (!get_partner_assets_response_local_var) {
        return NULL;
    }
    get_partner_assets_response_local_var->asset_id = asset_id;
    get_partner_assets_response_local_var->asset_type = asset_type;
    get_partner_assets_response_local_var->permissions = permissions;
    get_partner_assets_response_local_var->asset_group_info = asset_group_info;

    return get_partner_assets_response_local_var;
}


void get_partner_assets_response_free(get_partner_assets_response_t *get_partner_assets_response) {
    if(NULL == get_partner_assets_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_partner_assets_response->asset_id) {
        free(get_partner_assets_response->asset_id);
        get_partner_assets_response->asset_id = NULL;
    }
    if (get_partner_assets_response->asset_type) {
        free(get_partner_assets_response->asset_type);
        get_partner_assets_response->asset_type = NULL;
    }
    if (get_partner_assets_response->permissions) {
        list_ForEach(listEntry, get_partner_assets_response->permissions) {
            free(listEntry->data);
        }
        list_freeList(get_partner_assets_response->permissions);
        get_partner_assets_response->permissions = NULL;
    }
    if (get_partner_assets_response->asset_group_info) {
        asset_group_binding_free(get_partner_assets_response->asset_group_info);
        get_partner_assets_response->asset_group_info = NULL;
    }
    free(get_partner_assets_response);
}

cJSON *get_partner_assets_response_convertToJSON(get_partner_assets_response_t *get_partner_assets_response) {
    cJSON *item = cJSON_CreateObject();

    // get_partner_assets_response->asset_id
    if(get_partner_assets_response->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", get_partner_assets_response->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // get_partner_assets_response->asset_type
    if(get_partner_assets_response->asset_type) {
    if(cJSON_AddStringToObject(item, "asset_type", get_partner_assets_response->asset_type) == NULL) {
    goto fail; //String
    }
    }


    // get_partner_assets_response->permissions
    if(get_partner_assets_response->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, get_partner_assets_response->permissions) {
    if(cJSON_AddStringToObject(permissions, "", (char*)permissionsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // get_partner_assets_response->asset_group_info
    if(get_partner_assets_response->asset_group_info) {
    cJSON *asset_group_info_local_JSON = asset_group_binding_convertToJSON(get_partner_assets_response->asset_group_info);
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

get_partner_assets_response_t *get_partner_assets_response_parseFromJSON(cJSON *get_partner_assets_responseJSON){

    get_partner_assets_response_t *get_partner_assets_response_local_var = NULL;

    // define the local list for get_partner_assets_response->permissions
    list_t *permissionsList = NULL;

    // define the local variable for get_partner_assets_response->asset_group_info
    asset_group_binding_t *asset_group_info_local_nonprim = NULL;

    // get_partner_assets_response->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(get_partner_assets_responseJSON, "asset_id");
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // get_partner_assets_response->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(get_partner_assets_responseJSON, "asset_type");
    if (asset_type) { 
    if(!cJSON_IsString(asset_type) && !cJSON_IsNull(asset_type))
    {
    goto end; //String
    }
    }

    // get_partner_assets_response->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(get_partner_assets_responseJSON, "permissions");
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

    // get_partner_assets_response->asset_group_info
    cJSON *asset_group_info = cJSON_GetObjectItemCaseSensitive(get_partner_assets_responseJSON, "asset_group_info");
    if (asset_group_info) { 
    asset_group_info_local_nonprim = asset_group_binding_parseFromJSON(asset_group_info); //nonprimitive
    }


    get_partner_assets_response_local_var = get_partner_assets_response_create (
        asset_id && !cJSON_IsNull(asset_id) ? strdup(asset_id->valuestring) : NULL,
        asset_type && !cJSON_IsNull(asset_type) ? strdup(asset_type->valuestring) : NULL,
        permissions ? permissionsList : NULL,
        asset_group_info ? asset_group_info_local_nonprim : NULL
        );

    return get_partner_assets_response_local_var;
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
