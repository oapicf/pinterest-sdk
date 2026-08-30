#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_partner_assets_result.h"



static update_partner_assets_result_t *update_partner_assets_result_create_internal(
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    char *partner_id,
    list_t *permissions
    ) {
    update_partner_assets_result_t *update_partner_assets_result_local_var = malloc(sizeof(update_partner_assets_result_t));
    if (!update_partner_assets_result_local_var) {
        return NULL;
    }
    memset(update_partner_assets_result_local_var, 0, sizeof(update_partner_assets_result_t));
    update_partner_assets_result_local_var->_library_owned = 1;
    update_partner_assets_result_local_var->asset_id = asset_id;
    update_partner_assets_result_local_var->asset_type = asset_type;
    update_partner_assets_result_local_var->partner_id = partner_id;
    update_partner_assets_result_local_var->permissions = permissions;
    return update_partner_assets_result_local_var;
}

__attribute__((deprecated)) update_partner_assets_result_t *update_partner_assets_result_create(
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    char *partner_id,
    list_t *permissions
    ) {
    update_partner_assets_result_t *result = update_partner_assets_result_create_internal (
        asset_id,
        asset_type,
        partner_id,
        permissions
        );
    if (!result) {
    }
    return result;
}

void update_partner_assets_result_free(update_partner_assets_result_t *update_partner_assets_result) {
    if(NULL == update_partner_assets_result){
        return ;
    }
    if(update_partner_assets_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "update_partner_assets_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (update_partner_assets_result->asset_id) {
        free(update_partner_assets_result->asset_id);
        update_partner_assets_result->asset_id = NULL;
    }
    if (update_partner_assets_result->partner_id) {
        free(update_partner_assets_result->partner_id);
        update_partner_assets_result->partner_id = NULL;
    }
    if (update_partner_assets_result->permissions) {
        list_ForEach(listEntry, update_partner_assets_result->permissions) {
            free(listEntry->data);
        }
        list_freeList(update_partner_assets_result->permissions);
        update_partner_assets_result->permissions = NULL;
    }
    free(update_partner_assets_result);
}

cJSON *update_partner_assets_result_convertToJSON(update_partner_assets_result_t *update_partner_assets_result) {
    cJSON *item = cJSON_CreateObject();

    // update_partner_assets_result->asset_id
    if(update_partner_assets_result->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", update_partner_assets_result->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // update_partner_assets_result->asset_type
    if(update_partner_assets_result->asset_type != pinterest_rest_api_asset_type_response__NULL) {
    cJSON *asset_type_local_JSON = asset_type_response_convertToJSON(update_partner_assets_result->asset_type);
    if(asset_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "asset_type", asset_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // update_partner_assets_result->partner_id
    if(update_partner_assets_result->partner_id) {
    if(cJSON_AddStringToObject(item, "partner_id", update_partner_assets_result->partner_id) == NULL) {
    goto fail; //String
    }
    }


    // update_partner_assets_result->permissions
    if(update_partner_assets_result->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, update_partner_assets_result->permissions) {
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

update_partner_assets_result_t *update_partner_assets_result_parseFromJSON(cJSON *update_partner_assets_resultJSON){

    update_partner_assets_result_t *update_partner_assets_result_local_var = NULL;

    char *asset_id_local_str = NULL;

    // define the local variable for update_partner_assets_result->asset_type
    pinterest_rest_api_asset_type_response__e asset_type_local_nonprim = 0;

    char *partner_id_local_str = NULL;

    // define the local list for update_partner_assets_result->permissions
    list_t *permissionsList = NULL;

    // update_partner_assets_result->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(update_partner_assets_resultJSON, "asset_id");
    if (cJSON_IsNull(asset_id)) {
        asset_id = NULL;
    }
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // update_partner_assets_result->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(update_partner_assets_resultJSON, "asset_type");
    if (cJSON_IsNull(asset_type)) {
        asset_type = NULL;
    }
    if (asset_type) { 
    asset_type_local_nonprim = asset_type_response_parseFromJSON(asset_type); //custom
    }

    // update_partner_assets_result->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(update_partner_assets_resultJSON, "partner_id");
    if (cJSON_IsNull(partner_id)) {
        partner_id = NULL;
    }
    if (partner_id) { 
    if(!cJSON_IsString(partner_id) && !cJSON_IsNull(partner_id))
    {
    goto end; //String
    }
    }

    // update_partner_assets_result->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(update_partner_assets_resultJSON, "permissions");
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
    if (partner_id && !cJSON_IsNull(partner_id)) partner_id_local_str = strdup(partner_id->valuestring);

    update_partner_assets_result_local_var = update_partner_assets_result_create_internal (
        asset_id_local_str,
        asset_type ? asset_type_local_nonprim : 0,
        partner_id_local_str,
        permissions ? permissionsList : NULL
        );

    if (!update_partner_assets_result_local_var) {
        goto end;
    }

    return update_partner_assets_result_local_var;
end:
    if (asset_id_local_str) {
        free(asset_id_local_str);
        asset_id_local_str = NULL;
    }
    if (asset_type_local_nonprim) {
        asset_type_local_nonprim = 0;
    }
    if (partner_id_local_str) {
        free(partner_id_local_str);
        partner_id_local_str = NULL;
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
