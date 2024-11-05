#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_assets_summary_ad_accounts_inner.h"



invite_assets_summary_ad_accounts_inner_t *invite_assets_summary_ad_accounts_inner_create(
    char *id,
    list_t *permissions
    ) {
    invite_assets_summary_ad_accounts_inner_t *invite_assets_summary_ad_accounts_inner_local_var = malloc(sizeof(invite_assets_summary_ad_accounts_inner_t));
    if (!invite_assets_summary_ad_accounts_inner_local_var) {
        return NULL;
    }
    invite_assets_summary_ad_accounts_inner_local_var->id = id;
    invite_assets_summary_ad_accounts_inner_local_var->permissions = permissions;

    return invite_assets_summary_ad_accounts_inner_local_var;
}


void invite_assets_summary_ad_accounts_inner_free(invite_assets_summary_ad_accounts_inner_t *invite_assets_summary_ad_accounts_inner) {
    if(NULL == invite_assets_summary_ad_accounts_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (invite_assets_summary_ad_accounts_inner->id) {
        free(invite_assets_summary_ad_accounts_inner->id);
        invite_assets_summary_ad_accounts_inner->id = NULL;
    }
    if (invite_assets_summary_ad_accounts_inner->permissions) {
        list_ForEach(listEntry, invite_assets_summary_ad_accounts_inner->permissions) {
            free(listEntry->data);
        }
        list_freeList(invite_assets_summary_ad_accounts_inner->permissions);
        invite_assets_summary_ad_accounts_inner->permissions = NULL;
    }
    free(invite_assets_summary_ad_accounts_inner);
}

cJSON *invite_assets_summary_ad_accounts_inner_convertToJSON(invite_assets_summary_ad_accounts_inner_t *invite_assets_summary_ad_accounts_inner) {
    cJSON *item = cJSON_CreateObject();

    // invite_assets_summary_ad_accounts_inner->id
    if(invite_assets_summary_ad_accounts_inner->id) {
    if(cJSON_AddStringToObject(item, "id", invite_assets_summary_ad_accounts_inner->id) == NULL) {
    goto fail; //String
    }
    }


    // invite_assets_summary_ad_accounts_inner->permissions
    if(invite_assets_summary_ad_accounts_inner->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, invite_assets_summary_ad_accounts_inner->permissions) {
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

invite_assets_summary_ad_accounts_inner_t *invite_assets_summary_ad_accounts_inner_parseFromJSON(cJSON *invite_assets_summary_ad_accounts_innerJSON){

    invite_assets_summary_ad_accounts_inner_t *invite_assets_summary_ad_accounts_inner_local_var = NULL;

    // define the local list for invite_assets_summary_ad_accounts_inner->permissions
    list_t *permissionsList = NULL;

    // invite_assets_summary_ad_accounts_inner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(invite_assets_summary_ad_accounts_innerJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // invite_assets_summary_ad_accounts_inner->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(invite_assets_summary_ad_accounts_innerJSON, "permissions");
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


    invite_assets_summary_ad_accounts_inner_local_var = invite_assets_summary_ad_accounts_inner_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        permissions ? permissionsList : NULL
        );

    return invite_assets_summary_ad_accounts_inner_local_var;
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
