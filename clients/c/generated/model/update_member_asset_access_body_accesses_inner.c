#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_member_asset_access_body_accesses_inner.h"


char* update_member_asset_access_body_accesses_inner_permissions_ToString(pinterest_rest_api_update_member_asset_access_body_accesses_inner__e permissions) {
    char *permissionsArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER" };
    return permissionsArray[permissions - 1];
}

pinterest_rest_api_update_member_asset_access_body_accesses_inner__e update_member_asset_access_body_accesses_inner_permissions_FromString(char* permissions) {
    int stringToReturn = 0;
    char *permissionsArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER" };
    size_t sizeofArray = sizeof(permissionsArray) / sizeof(permissionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions, permissionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static update_member_asset_access_body_accesses_inner_t *update_member_asset_access_body_accesses_inner_create_internal(
    char *asset_id,
    char *member_id,
    list_t *permissions
    ) {
    update_member_asset_access_body_accesses_inner_t *update_member_asset_access_body_accesses_inner_local_var = malloc(sizeof(update_member_asset_access_body_accesses_inner_t));
    if (!update_member_asset_access_body_accesses_inner_local_var) {
        return NULL;
    }
    update_member_asset_access_body_accesses_inner_local_var->asset_id = asset_id;
    update_member_asset_access_body_accesses_inner_local_var->member_id = member_id;
    update_member_asset_access_body_accesses_inner_local_var->permissions = permissions;

    update_member_asset_access_body_accesses_inner_local_var->_library_owned = 1;
    return update_member_asset_access_body_accesses_inner_local_var;
}

__attribute__((deprecated)) update_member_asset_access_body_accesses_inner_t *update_member_asset_access_body_accesses_inner_create(
    char *asset_id,
    char *member_id,
    list_t *permissions
    ) {
    return update_member_asset_access_body_accesses_inner_create_internal (
        asset_id,
        member_id,
        permissions
        );
}

void update_member_asset_access_body_accesses_inner_free(update_member_asset_access_body_accesses_inner_t *update_member_asset_access_body_accesses_inner) {
    if(NULL == update_member_asset_access_body_accesses_inner){
        return ;
    }
    if(update_member_asset_access_body_accesses_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "update_member_asset_access_body_accesses_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (update_member_asset_access_body_accesses_inner->asset_id) {
        free(update_member_asset_access_body_accesses_inner->asset_id);
        update_member_asset_access_body_accesses_inner->asset_id = NULL;
    }
    if (update_member_asset_access_body_accesses_inner->member_id) {
        free(update_member_asset_access_body_accesses_inner->member_id);
        update_member_asset_access_body_accesses_inner->member_id = NULL;
    }
    if (update_member_asset_access_body_accesses_inner->permissions) {
        list_ForEach(listEntry, update_member_asset_access_body_accesses_inner->permissions) {
            permissions_free(listEntry->data);
        }
        list_freeList(update_member_asset_access_body_accesses_inner->permissions);
        update_member_asset_access_body_accesses_inner->permissions = NULL;
    }
    free(update_member_asset_access_body_accesses_inner);
}

cJSON *update_member_asset_access_body_accesses_inner_convertToJSON(update_member_asset_access_body_accesses_inner_t *update_member_asset_access_body_accesses_inner) {
    cJSON *item = cJSON_CreateObject();

    // update_member_asset_access_body_accesses_inner->asset_id
    if (!update_member_asset_access_body_accesses_inner->asset_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_id", update_member_asset_access_body_accesses_inner->asset_id) == NULL) {
    goto fail; //String
    }


    // update_member_asset_access_body_accesses_inner->member_id
    if (!update_member_asset_access_body_accesses_inner->member_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "member_id", update_member_asset_access_body_accesses_inner->member_id) == NULL) {
    goto fail; //String
    }


    // update_member_asset_access_body_accesses_inner->permissions
    if (pinterest_rest_api_list_PERMISSIONS_NULL == update_member_asset_access_body_accesses_inner->permissions) {
        goto fail;
    }
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *permissionsListEntry;
    if (update_member_asset_access_body_accesses_inner->permissions) {
    list_ForEach(permissionsListEntry, update_member_asset_access_body_accesses_inner->permissions) {
    cJSON *itemLocal = permissions_convertToJSON((pinterest_rest_api_update_member_asset_access_body_accesses_inner__e)permissionsListEntry->data);
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

update_member_asset_access_body_accesses_inner_t *update_member_asset_access_body_accesses_inner_parseFromJSON(cJSON *update_member_asset_access_body_accesses_innerJSON){

    update_member_asset_access_body_accesses_inner_t *update_member_asset_access_body_accesses_inner_local_var = NULL;

    // define the local list for update_member_asset_access_body_accesses_inner->permissions
    list_t *permissionsList = NULL;

    // update_member_asset_access_body_accesses_inner->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(update_member_asset_access_body_accesses_innerJSON, "asset_id");
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

    // update_member_asset_access_body_accesses_inner->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(update_member_asset_access_body_accesses_innerJSON, "member_id");
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

    // update_member_asset_access_body_accesses_inner->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(update_member_asset_access_body_accesses_innerJSON, "permissions");
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
        update_member_asset_access_body_accesses_inner_permissions_e permissionsItem = permissions_parseFromJSON(permissions_local_nonprimitive);

        list_addElement(permissionsList, (void *)permissionsItem);
    }


    update_member_asset_access_body_accesses_inner_local_var = update_member_asset_access_body_accesses_inner_create_internal (
        strdup(asset_id->valuestring),
        strdup(member_id->valuestring),
        permissionsList
        );

    return update_member_asset_access_body_accesses_inner_local_var;
end:
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
