#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_single_asset_binding.h"



user_single_asset_binding_t *user_single_asset_binding_create(
    list_t *permissions,
    business_access_user_summary_t *user
    ) {
    user_single_asset_binding_t *user_single_asset_binding_local_var = malloc(sizeof(user_single_asset_binding_t));
    if (!user_single_asset_binding_local_var) {
        return NULL;
    }
    user_single_asset_binding_local_var->permissions = permissions;
    user_single_asset_binding_local_var->user = user;

    return user_single_asset_binding_local_var;
}


void user_single_asset_binding_free(user_single_asset_binding_t *user_single_asset_binding) {
    if(NULL == user_single_asset_binding){
        return ;
    }
    listEntry_t *listEntry;
    if (user_single_asset_binding->permissions) {
        list_ForEach(listEntry, user_single_asset_binding->permissions) {
            free(listEntry->data);
        }
        list_freeList(user_single_asset_binding->permissions);
        user_single_asset_binding->permissions = NULL;
    }
    if (user_single_asset_binding->user) {
        business_access_user_summary_free(user_single_asset_binding->user);
        user_single_asset_binding->user = NULL;
    }
    free(user_single_asset_binding);
}

cJSON *user_single_asset_binding_convertToJSON(user_single_asset_binding_t *user_single_asset_binding) {
    cJSON *item = cJSON_CreateObject();

    // user_single_asset_binding->permissions
    if(user_single_asset_binding->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, user_single_asset_binding->permissions) {
    if(cJSON_AddStringToObject(permissions, "", (char*)permissionsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // user_single_asset_binding->user
    if(user_single_asset_binding->user) {
    cJSON *user_local_JSON = business_access_user_summary_convertToJSON(user_single_asset_binding->user);
    if(user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user", user_local_JSON);
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

user_single_asset_binding_t *user_single_asset_binding_parseFromJSON(cJSON *user_single_asset_bindingJSON){

    user_single_asset_binding_t *user_single_asset_binding_local_var = NULL;

    // define the local list for user_single_asset_binding->permissions
    list_t *permissionsList = NULL;

    // define the local variable for user_single_asset_binding->user
    business_access_user_summary_t *user_local_nonprim = NULL;

    // user_single_asset_binding->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(user_single_asset_bindingJSON, "permissions");
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

    // user_single_asset_binding->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(user_single_asset_bindingJSON, "user");
    if (user) { 
    user_local_nonprim = business_access_user_summary_parseFromJSON(user); //nonprimitive
    }


    user_single_asset_binding_local_var = user_single_asset_binding_create (
        permissions ? permissionsList : NULL,
        user ? user_local_nonprim : NULL
        );

    return user_single_asset_binding_local_var;
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
    if (user_local_nonprim) {
        business_access_user_summary_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
