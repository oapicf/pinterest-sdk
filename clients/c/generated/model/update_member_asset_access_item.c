#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_member_asset_access_item.h"


char* update_member_asset_access_item_permissions_ToString(pinterest_rest_api_update_member_asset_access_item__e permissions) {
    char *permissionsArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER", "BIZ_PINNER_LIST_SHARER" };
    return permissionsArray[permissions - 1];
}

pinterest_rest_api_update_member_asset_access_item__e update_member_asset_access_item_permissions_FromString(char* permissions) {
    int stringToReturn = 0;
    char *permissionsArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER", "BIZ_PINNER_LIST_SHARER" };
    size_t sizeofArray = sizeof(permissionsArray) / sizeof(permissionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions, permissionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static update_member_asset_access_item_t *update_member_asset_access_item_create_internal(
    char *asset_id,
    char *member_id,
    list_t *permissions
    ) {
    update_member_asset_access_item_t *update_member_asset_access_item_local_var = malloc(sizeof(update_member_asset_access_item_t));
    if (!update_member_asset_access_item_local_var) {
        return NULL;
    }
    memset(update_member_asset_access_item_local_var, 0, sizeof(update_member_asset_access_item_t));
    update_member_asset_access_item_local_var->_library_owned = 1;
    update_member_asset_access_item_local_var->asset_id = asset_id;
    update_member_asset_access_item_local_var->member_id = member_id;
    update_member_asset_access_item_local_var->permissions = permissions;
    return update_member_asset_access_item_local_var;
}

__attribute__((deprecated)) update_member_asset_access_item_t *update_member_asset_access_item_create(
    char *asset_id,
    char *member_id,
    list_t *permissions
    ) {
    update_member_asset_access_item_t *result = update_member_asset_access_item_create_internal (
        asset_id,
        member_id,
        permissions
        );
    if (!result) {
    }
    return result;
}

void update_member_asset_access_item_free(update_member_asset_access_item_t *update_member_asset_access_item) {
    if(NULL == update_member_asset_access_item){
        return ;
    }
    if(update_member_asset_access_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "update_member_asset_access_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (update_member_asset_access_item->asset_id) {
        free(update_member_asset_access_item->asset_id);
        update_member_asset_access_item->asset_id = NULL;
    }
    if (update_member_asset_access_item->member_id) {
        free(update_member_asset_access_item->member_id);
        update_member_asset_access_item->member_id = NULL;
    }
    if (update_member_asset_access_item->permissions) {
        list_ForEach(listEntry, update_member_asset_access_item->permissions) {
            permissions_free(listEntry->data);
        }
        list_freeList(update_member_asset_access_item->permissions);
        update_member_asset_access_item->permissions = NULL;
    }
    free(update_member_asset_access_item);
}

cJSON *update_member_asset_access_item_convertToJSON(update_member_asset_access_item_t *update_member_asset_access_item) {
    cJSON *item = cJSON_CreateObject();

    // update_member_asset_access_item->asset_id
    if (!update_member_asset_access_item->asset_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_id", update_member_asset_access_item->asset_id) == NULL) {
    goto fail; //String
    }


    // update_member_asset_access_item->member_id
    if (!update_member_asset_access_item->member_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "member_id", update_member_asset_access_item->member_id) == NULL) {
    goto fail; //String
    }


    // update_member_asset_access_item->permissions
    if (pinterest_rest_api_list_PERMISSIONS_NULL == update_member_asset_access_item->permissions) {
        goto fail;
    }
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *permissionsListEntry;
    if (update_member_asset_access_item->permissions) {
    list_ForEach(permissionsListEntry, update_member_asset_access_item->permissions) {
    cJSON *itemLocal = permissions_convertToJSON((pinterest_rest_api_update_member_asset_access_item__e)permissionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(permissions, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_member_asset_access_item_t *update_member_asset_access_item_parseFromJSON(cJSON *update_member_asset_access_itemJSON){

    update_member_asset_access_item_t *update_member_asset_access_item_local_var = NULL;

    char *asset_id_local_str = NULL;

    char *member_id_local_str = NULL;

    // define the local list for update_member_asset_access_item->permissions
    list_t *permissionsList = NULL;

    // update_member_asset_access_item->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(update_member_asset_access_itemJSON, "asset_id");
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

    // update_member_asset_access_item->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(update_member_asset_access_itemJSON, "member_id");
    if (cJSON_IsNull(member_id)) {
        member_id = NULL;
    }
    if (!member_id) {
        goto end;
    }

    
    if(!cJSON_IsString(member_id))
    {
    goto end; //String
    }

    // update_member_asset_access_item->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(update_member_asset_access_itemJSON, "permissions");
    if (cJSON_IsNull(permissions)) {
        permissions = NULL;
    }
    if (!permissions) {
        goto end;
    }

    
    cJSON *permissions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(permissions)){
        goto end; //nonprimitive container
    }

    permissionsList = list_createList();

    cJSON_ArrayForEach(permissions_local_nonprimitive,permissions )
    {
        if(!cJSON_IsObject(permissions_local_nonprimitive)){
            goto end;
        }
        update_member_asset_access_item_permissions_e permissionsItem = permissions_parseFromJSON(permissions_local_nonprimitive);

        list_addElement(permissionsList, (void *)permissionsItem);
    }


    if (asset_id && !cJSON_IsNull(asset_id)) asset_id_local_str = strdup(asset_id->valuestring);
    if (member_id && !cJSON_IsNull(member_id)) member_id_local_str = strdup(member_id->valuestring);

    update_member_asset_access_item_local_var = update_member_asset_access_item_create_internal (
        asset_id_local_str,
        member_id_local_str,
        permissionsList
        );

    if (!update_member_asset_access_item_local_var) {
        goto end;
    }

    return update_member_asset_access_item_local_var;
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
            permissions_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(permissionsList);
        permissionsList = NULL;
    }
    return NULL;

}
