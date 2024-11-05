#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_partner_asset_access_body_accesses_inner.h"


char* update_partner_asset_access_body_accesses_inner_permissions_ToString(pinterest_rest_api_update_partner_asset_access_body_accesses_inner__e permissions) {
    char *permissionsArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    return permissionsArray[permissions - 1];
}

pinterest_rest_api_update_partner_asset_access_body_accesses_inner__e update_partner_asset_access_body_accesses_inner_permissions_FromString(char* permissions) {
    int stringToReturn = 0;
    char *permissionsArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    size_t sizeofArray = sizeof(permissionsArray) / sizeof(permissionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions, permissionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

update_partner_asset_access_body_accesses_inner_t *update_partner_asset_access_body_accesses_inner_create(
    char *partner_id,
    char *asset_id,
    list_t *permissions
    ) {
    update_partner_asset_access_body_accesses_inner_t *update_partner_asset_access_body_accesses_inner_local_var = malloc(sizeof(update_partner_asset_access_body_accesses_inner_t));
    if (!update_partner_asset_access_body_accesses_inner_local_var) {
        return NULL;
    }
    update_partner_asset_access_body_accesses_inner_local_var->partner_id = partner_id;
    update_partner_asset_access_body_accesses_inner_local_var->asset_id = asset_id;
    update_partner_asset_access_body_accesses_inner_local_var->permissions = permissions;

    return update_partner_asset_access_body_accesses_inner_local_var;
}


void update_partner_asset_access_body_accesses_inner_free(update_partner_asset_access_body_accesses_inner_t *update_partner_asset_access_body_accesses_inner) {
    if(NULL == update_partner_asset_access_body_accesses_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (update_partner_asset_access_body_accesses_inner->partner_id) {
        free(update_partner_asset_access_body_accesses_inner->partner_id);
        update_partner_asset_access_body_accesses_inner->partner_id = NULL;
    }
    if (update_partner_asset_access_body_accesses_inner->asset_id) {
        free(update_partner_asset_access_body_accesses_inner->asset_id);
        update_partner_asset_access_body_accesses_inner->asset_id = NULL;
    }
    if (update_partner_asset_access_body_accesses_inner->permissions) {
        list_ForEach(listEntry, update_partner_asset_access_body_accesses_inner->permissions) {
            permissions_free(listEntry->data);
        }
        list_freeList(update_partner_asset_access_body_accesses_inner->permissions);
        update_partner_asset_access_body_accesses_inner->permissions = NULL;
    }
    free(update_partner_asset_access_body_accesses_inner);
}

cJSON *update_partner_asset_access_body_accesses_inner_convertToJSON(update_partner_asset_access_body_accesses_inner_t *update_partner_asset_access_body_accesses_inner) {
    cJSON *item = cJSON_CreateObject();

    // update_partner_asset_access_body_accesses_inner->partner_id
    if (!update_partner_asset_access_body_accesses_inner->partner_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "partner_id", update_partner_asset_access_body_accesses_inner->partner_id) == NULL) {
    goto fail; //String
    }


    // update_partner_asset_access_body_accesses_inner->asset_id
    if (!update_partner_asset_access_body_accesses_inner->asset_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_id", update_partner_asset_access_body_accesses_inner->asset_id) == NULL) {
    goto fail; //String
    }


    // update_partner_asset_access_body_accesses_inner->permissions
    if (pinterest_rest_api_update_partner_asset_access_body_accesses_inner_PERMISSIONS_NULL == update_partner_asset_access_body_accesses_inner->permissions) {
        goto fail;
    }
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *permissionsListEntry;
    if (update_partner_asset_access_body_accesses_inner->permissions) {
    list_ForEach(permissionsListEntry, update_partner_asset_access_body_accesses_inner->permissions) {
    cJSON *itemLocal = permissions_convertToJSON((pinterest_rest_api_update_partner_asset_access_body_accesses_inner__e)permissionsListEntry->data);
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

update_partner_asset_access_body_accesses_inner_t *update_partner_asset_access_body_accesses_inner_parseFromJSON(cJSON *update_partner_asset_access_body_accesses_innerJSON){

    update_partner_asset_access_body_accesses_inner_t *update_partner_asset_access_body_accesses_inner_local_var = NULL;

    // define the local list for update_partner_asset_access_body_accesses_inner->permissions
    list_t *permissionsList = NULL;

    // update_partner_asset_access_body_accesses_inner->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(update_partner_asset_access_body_accesses_innerJSON, "partner_id");
    if (!partner_id) {
        goto end;
    }

    
    if(!cJSON_IsString(partner_id))
    {
    goto end; //String
    }

    // update_partner_asset_access_body_accesses_inner->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(update_partner_asset_access_body_accesses_innerJSON, "asset_id");
    if (!asset_id) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_id))
    {
    goto end; //String
    }

    // update_partner_asset_access_body_accesses_inner->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(update_partner_asset_access_body_accesses_innerJSON, "permissions");
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
        update_partner_asset_access_body_accesses_inner_permissions_e permissionsItem = permissions_parseFromJSON(permissions_local_nonprimitive);

        list_addElement(permissionsList, (void *)permissionsItem);
    }


    update_partner_asset_access_body_accesses_inner_local_var = update_partner_asset_access_body_accesses_inner_create (
        strdup(partner_id->valuestring),
        strdup(asset_id->valuestring),
        permissionsList
        );

    return update_partner_asset_access_body_accesses_inner_local_var;
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
