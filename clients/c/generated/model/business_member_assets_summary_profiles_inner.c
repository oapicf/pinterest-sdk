#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_member_assets_summary_profiles_inner.h"



business_member_assets_summary_profiles_inner_t *business_member_assets_summary_profiles_inner_create(
    char *id,
    list_t *permissions
    ) {
    business_member_assets_summary_profiles_inner_t *business_member_assets_summary_profiles_inner_local_var = malloc(sizeof(business_member_assets_summary_profiles_inner_t));
    if (!business_member_assets_summary_profiles_inner_local_var) {
        return NULL;
    }
    business_member_assets_summary_profiles_inner_local_var->id = id;
    business_member_assets_summary_profiles_inner_local_var->permissions = permissions;

    return business_member_assets_summary_profiles_inner_local_var;
}


void business_member_assets_summary_profiles_inner_free(business_member_assets_summary_profiles_inner_t *business_member_assets_summary_profiles_inner) {
    if(NULL == business_member_assets_summary_profiles_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (business_member_assets_summary_profiles_inner->id) {
        free(business_member_assets_summary_profiles_inner->id);
        business_member_assets_summary_profiles_inner->id = NULL;
    }
    if (business_member_assets_summary_profiles_inner->permissions) {
        list_ForEach(listEntry, business_member_assets_summary_profiles_inner->permissions) {
            free(listEntry->data);
        }
        list_freeList(business_member_assets_summary_profiles_inner->permissions);
        business_member_assets_summary_profiles_inner->permissions = NULL;
    }
    free(business_member_assets_summary_profiles_inner);
}

cJSON *business_member_assets_summary_profiles_inner_convertToJSON(business_member_assets_summary_profiles_inner_t *business_member_assets_summary_profiles_inner) {
    cJSON *item = cJSON_CreateObject();

    // business_member_assets_summary_profiles_inner->id
    if(business_member_assets_summary_profiles_inner->id) {
    if(cJSON_AddStringToObject(item, "id", business_member_assets_summary_profiles_inner->id) == NULL) {
    goto fail; //String
    }
    }


    // business_member_assets_summary_profiles_inner->permissions
    if(business_member_assets_summary_profiles_inner->permissions) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *permissionsListEntry;
    list_ForEach(permissionsListEntry, business_member_assets_summary_profiles_inner->permissions) {
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

business_member_assets_summary_profiles_inner_t *business_member_assets_summary_profiles_inner_parseFromJSON(cJSON *business_member_assets_summary_profiles_innerJSON){

    business_member_assets_summary_profiles_inner_t *business_member_assets_summary_profiles_inner_local_var = NULL;

    // define the local list for business_member_assets_summary_profiles_inner->permissions
    list_t *permissionsList = NULL;

    // business_member_assets_summary_profiles_inner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(business_member_assets_summary_profiles_innerJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // business_member_assets_summary_profiles_inner->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(business_member_assets_summary_profiles_innerJSON, "permissions");
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


    business_member_assets_summary_profiles_inner_local_var = business_member_assets_summary_profiles_inner_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        permissions ? permissionsList : NULL
        );

    return business_member_assets_summary_profiles_inner_local_var;
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
