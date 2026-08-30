#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_assets_summary_item.h"



static invite_assets_summary_item_t *invite_assets_summary_item_create_internal(
    char *id,
    list_t *permissions
    ) {
    invite_assets_summary_item_t *invite_assets_summary_item_local_var = malloc(sizeof(invite_assets_summary_item_t));
    if (!invite_assets_summary_item_local_var) {
        return NULL;
    }
    memset(invite_assets_summary_item_local_var, 0, sizeof(invite_assets_summary_item_t));
    invite_assets_summary_item_local_var->_library_owned = 1;
    invite_assets_summary_item_local_var->id = id;
    invite_assets_summary_item_local_var->permissions = permissions;
    return invite_assets_summary_item_local_var;
}

__attribute__((deprecated)) invite_assets_summary_item_t *invite_assets_summary_item_create(
    char *id,
    list_t *permissions
    ) {
    invite_assets_summary_item_t *result = invite_assets_summary_item_create_internal (
        id,
        permissions
        );
    if (!result) {
    }
    return result;
}

void invite_assets_summary_item_free(invite_assets_summary_item_t *invite_assets_summary_item) {
    if(NULL == invite_assets_summary_item){
        return ;
    }
    if(invite_assets_summary_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_assets_summary_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_assets_summary_item->id) {
        free(invite_assets_summary_item->id);
        invite_assets_summary_item->id = NULL;
    }
    if (invite_assets_summary_item->permissions) {
        list_ForEach(listEntry, invite_assets_summary_item->permissions) {
            free(listEntry->data);
        }
        list_freeList(invite_assets_summary_item->permissions);
        invite_assets_summary_item->permissions = NULL;
    }
    free(invite_assets_summary_item);
}

cJSON *invite_assets_summary_item_convertToJSON(invite_assets_summary_item_t *invite_assets_summary_item) {
    cJSON *item = cJSON_CreateObject();

    // invite_assets_summary_item->id
    if(invite_assets_summary_item->id) {
    if(cJSON_AddStringToObject(item, "id", invite_assets_summary_item->id) == NULL) {
    goto fail; //String
    }
    }


    // invite_assets_summary_item->permissions
    if(invite_assets_summary_item->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, invite_assets_summary_item->permissions) {
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

invite_assets_summary_item_t *invite_assets_summary_item_parseFromJSON(cJSON *invite_assets_summary_itemJSON){

    invite_assets_summary_item_t *invite_assets_summary_item_local_var = NULL;

    char *id_local_str = NULL;

    // define the local list for invite_assets_summary_item->permissions
    list_t *permissionsList = NULL;

    // invite_assets_summary_item->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(invite_assets_summary_itemJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // invite_assets_summary_item->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(invite_assets_summary_itemJSON, "permissions");
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


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    invite_assets_summary_item_local_var = invite_assets_summary_item_create_internal (
        id_local_str,
        permissions ? permissionsList : NULL
        );

    if (!invite_assets_summary_item_local_var) {
        goto end;
    }

    return invite_assets_summary_item_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
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
