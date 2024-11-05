#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_partner_assets_result.h"



delete_partner_assets_result_t *delete_partner_assets_result_create(
    char *asset_id,
    char *asset_type,
    list_t *permissions,
    int is_shared_partner,
    char *partner_id
    ) {
    delete_partner_assets_result_t *delete_partner_assets_result_local_var = malloc(sizeof(delete_partner_assets_result_t));
    if (!delete_partner_assets_result_local_var) {
        return NULL;
    }
    delete_partner_assets_result_local_var->asset_id = asset_id;
    delete_partner_assets_result_local_var->asset_type = asset_type;
    delete_partner_assets_result_local_var->permissions = permissions;
    delete_partner_assets_result_local_var->is_shared_partner = is_shared_partner;
    delete_partner_assets_result_local_var->partner_id = partner_id;

    return delete_partner_assets_result_local_var;
}


void delete_partner_assets_result_free(delete_partner_assets_result_t *delete_partner_assets_result) {
    if(NULL == delete_partner_assets_result){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_partner_assets_result->asset_id) {
        free(delete_partner_assets_result->asset_id);
        delete_partner_assets_result->asset_id = NULL;
    }
    if (delete_partner_assets_result->asset_type) {
        free(delete_partner_assets_result->asset_type);
        delete_partner_assets_result->asset_type = NULL;
    }
    if (delete_partner_assets_result->permissions) {
        list_ForEach(listEntry, delete_partner_assets_result->permissions) {
            free(listEntry->data);
        }
        list_freeList(delete_partner_assets_result->permissions);
        delete_partner_assets_result->permissions = NULL;
    }
    if (delete_partner_assets_result->partner_id) {
        free(delete_partner_assets_result->partner_id);
        delete_partner_assets_result->partner_id = NULL;
    }
    free(delete_partner_assets_result);
}

cJSON *delete_partner_assets_result_convertToJSON(delete_partner_assets_result_t *delete_partner_assets_result) {
    cJSON *item = cJSON_CreateObject();

    // delete_partner_assets_result->asset_id
    if(delete_partner_assets_result->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", delete_partner_assets_result->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // delete_partner_assets_result->asset_type
    if(delete_partner_assets_result->asset_type) {
    if(cJSON_AddStringToObject(item, "asset_type", delete_partner_assets_result->asset_type) == NULL) {
    goto fail; //String
    }
    }


    // delete_partner_assets_result->permissions
    if(delete_partner_assets_result->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, delete_partner_assets_result->permissions) {
    if(cJSON_AddStringToObject(permissions, "", (char*)permissionsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // delete_partner_assets_result->is_shared_partner
    if(delete_partner_assets_result->is_shared_partner) {
    if(cJSON_AddBoolToObject(item, "is_shared_partner", delete_partner_assets_result->is_shared_partner) == NULL) {
    goto fail; //Bool
    }
    }


    // delete_partner_assets_result->partner_id
    if(delete_partner_assets_result->partner_id) {
    if(cJSON_AddStringToObject(item, "partner_id", delete_partner_assets_result->partner_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_partner_assets_result_t *delete_partner_assets_result_parseFromJSON(cJSON *delete_partner_assets_resultJSON){

    delete_partner_assets_result_t *delete_partner_assets_result_local_var = NULL;

    // define the local list for delete_partner_assets_result->permissions
    list_t *permissionsList = NULL;

    // delete_partner_assets_result->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(delete_partner_assets_resultJSON, "asset_id");
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // delete_partner_assets_result->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(delete_partner_assets_resultJSON, "asset_type");
    if (asset_type) { 
    if(!cJSON_IsString(asset_type) && !cJSON_IsNull(asset_type))
    {
    goto end; //String
    }
    }

    // delete_partner_assets_result->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(delete_partner_assets_resultJSON, "permissions");
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

    // delete_partner_assets_result->is_shared_partner
    cJSON *is_shared_partner = cJSON_GetObjectItemCaseSensitive(delete_partner_assets_resultJSON, "is_shared_partner");
    if (is_shared_partner) { 
    if(!cJSON_IsBool(is_shared_partner))
    {
    goto end; //Bool
    }
    }

    // delete_partner_assets_result->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(delete_partner_assets_resultJSON, "partner_id");
    if (partner_id) { 
    if(!cJSON_IsString(partner_id) && !cJSON_IsNull(partner_id))
    {
    goto end; //String
    }
    }


    delete_partner_assets_result_local_var = delete_partner_assets_result_create (
        asset_id && !cJSON_IsNull(asset_id) ? strdup(asset_id->valuestring) : NULL,
        asset_type && !cJSON_IsNull(asset_type) ? strdup(asset_type->valuestring) : NULL,
        permissions ? permissionsList : NULL,
        is_shared_partner ? is_shared_partner->valueint : 0,
        partner_id && !cJSON_IsNull(partner_id) ? strdup(partner_id->valuestring) : NULL
        );

    return delete_partner_assets_result_local_var;
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
