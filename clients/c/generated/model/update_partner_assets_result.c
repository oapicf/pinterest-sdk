#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_partner_assets_result.h"



update_partner_assets_result_t *update_partner_assets_result_create(
    char *asset_id,
    char *asset_type,
    char *partner_id,
    list_t *permissions
    ) {
    update_partner_assets_result_t *update_partner_assets_result_local_var = malloc(sizeof(update_partner_assets_result_t));
    if (!update_partner_assets_result_local_var) {
        return NULL;
    }
    update_partner_assets_result_local_var->asset_id = asset_id;
    update_partner_assets_result_local_var->asset_type = asset_type;
    update_partner_assets_result_local_var->partner_id = partner_id;
    update_partner_assets_result_local_var->permissions = permissions;

    return update_partner_assets_result_local_var;
}


void update_partner_assets_result_free(update_partner_assets_result_t *update_partner_assets_result) {
    if(NULL == update_partner_assets_result){
        return ;
    }
    listEntry_t *listEntry;
    if (update_partner_assets_result->asset_id) {
        free(update_partner_assets_result->asset_id);
        update_partner_assets_result->asset_id = NULL;
    }
    if (update_partner_assets_result->asset_type) {
        free(update_partner_assets_result->asset_type);
        update_partner_assets_result->asset_type = NULL;
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
    if(update_partner_assets_result->asset_type) {
    if(cJSON_AddStringToObject(item, "asset_type", update_partner_assets_result->asset_type) == NULL) {
    goto fail; //String
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

update_partner_assets_result_t *update_partner_assets_result_parseFromJSON(cJSON *update_partner_assets_resultJSON){

    update_partner_assets_result_t *update_partner_assets_result_local_var = NULL;

    // define the local list for update_partner_assets_result->permissions
    list_t *permissionsList = NULL;

    // update_partner_assets_result->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(update_partner_assets_resultJSON, "asset_id");
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // update_partner_assets_result->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(update_partner_assets_resultJSON, "asset_type");
    if (asset_type) { 
    if(!cJSON_IsString(asset_type) && !cJSON_IsNull(asset_type))
    {
    goto end; //String
    }
    }

    // update_partner_assets_result->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(update_partner_assets_resultJSON, "partner_id");
    if (partner_id) { 
    if(!cJSON_IsString(partner_id) && !cJSON_IsNull(partner_id))
    {
    goto end; //String
    }
    }

    // update_partner_assets_result->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(update_partner_assets_resultJSON, "permissions");
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


    update_partner_assets_result_local_var = update_partner_assets_result_create (
        asset_id && !cJSON_IsNull(asset_id) ? strdup(asset_id->valuestring) : NULL,
        asset_type && !cJSON_IsNull(asset_type) ? strdup(asset_type->valuestring) : NULL,
        partner_id && !cJSON_IsNull(partner_id) ? strdup(partner_id->valuestring) : NULL,
        permissions ? permissionsList : NULL
        );

    return update_partner_assets_result_local_var;
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
