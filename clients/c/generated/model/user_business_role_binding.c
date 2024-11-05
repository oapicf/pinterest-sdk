#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_business_role_binding.h"



user_business_role_binding_t *user_business_role_binding_create(
    business_member_assets_summary_t *assets_summary,
    list_t *business_roles,
    business_access_user_summary_t *created_by_business,
    business_access_user_summary_t *created_by_user,
    int created_time,
    char *id,
    int is_shared_partner,
    business_access_user_summary_t *user
    ) {
    user_business_role_binding_t *user_business_role_binding_local_var = malloc(sizeof(user_business_role_binding_t));
    if (!user_business_role_binding_local_var) {
        return NULL;
    }
    user_business_role_binding_local_var->assets_summary = assets_summary;
    user_business_role_binding_local_var->business_roles = business_roles;
    user_business_role_binding_local_var->created_by_business = created_by_business;
    user_business_role_binding_local_var->created_by_user = created_by_user;
    user_business_role_binding_local_var->created_time = created_time;
    user_business_role_binding_local_var->id = id;
    user_business_role_binding_local_var->is_shared_partner = is_shared_partner;
    user_business_role_binding_local_var->user = user;

    return user_business_role_binding_local_var;
}


void user_business_role_binding_free(user_business_role_binding_t *user_business_role_binding) {
    if(NULL == user_business_role_binding){
        return ;
    }
    listEntry_t *listEntry;
    if (user_business_role_binding->assets_summary) {
        business_member_assets_summary_free(user_business_role_binding->assets_summary);
        user_business_role_binding->assets_summary = NULL;
    }
    if (user_business_role_binding->business_roles) {
        list_ForEach(listEntry, user_business_role_binding->business_roles) {
            free(listEntry->data);
        }
        list_freeList(user_business_role_binding->business_roles);
        user_business_role_binding->business_roles = NULL;
    }
    if (user_business_role_binding->created_by_business) {
        business_access_user_summary_free(user_business_role_binding->created_by_business);
        user_business_role_binding->created_by_business = NULL;
    }
    if (user_business_role_binding->created_by_user) {
        business_access_user_summary_free(user_business_role_binding->created_by_user);
        user_business_role_binding->created_by_user = NULL;
    }
    if (user_business_role_binding->id) {
        free(user_business_role_binding->id);
        user_business_role_binding->id = NULL;
    }
    if (user_business_role_binding->user) {
        business_access_user_summary_free(user_business_role_binding->user);
        user_business_role_binding->user = NULL;
    }
    free(user_business_role_binding);
}

cJSON *user_business_role_binding_convertToJSON(user_business_role_binding_t *user_business_role_binding) {
    cJSON *item = cJSON_CreateObject();

    // user_business_role_binding->assets_summary
    if(user_business_role_binding->assets_summary) {
    cJSON *assets_summary_local_JSON = business_member_assets_summary_convertToJSON(user_business_role_binding->assets_summary);
    if(assets_summary_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "assets_summary", assets_summary_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // user_business_role_binding->business_roles
    if(user_business_role_binding->business_roles) {
    cJSON *business_roles = cJSON_AddArrayToObject(item, "business_roles");
    if(business_roles == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *business_rolesListEntry;
    list_ForEach(business_rolesListEntry, user_business_role_binding->business_roles) {
    if(cJSON_AddStringToObject(business_roles, "", (char*)business_rolesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // user_business_role_binding->created_by_business
    if(user_business_role_binding->created_by_business) {
    cJSON *created_by_business_local_JSON = business_access_user_summary_convertToJSON(user_business_role_binding->created_by_business);
    if(created_by_business_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "created_by_business", created_by_business_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // user_business_role_binding->created_by_user
    if(user_business_role_binding->created_by_user) {
    cJSON *created_by_user_local_JSON = business_access_user_summary_convertToJSON(user_business_role_binding->created_by_user);
    if(created_by_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "created_by_user", created_by_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // user_business_role_binding->created_time
    if(user_business_role_binding->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", user_business_role_binding->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // user_business_role_binding->id
    if(user_business_role_binding->id) {
    if(cJSON_AddStringToObject(item, "id", user_business_role_binding->id) == NULL) {
    goto fail; //String
    }
    }


    // user_business_role_binding->is_shared_partner
    if(user_business_role_binding->is_shared_partner) {
    if(cJSON_AddBoolToObject(item, "is_shared_partner", user_business_role_binding->is_shared_partner) == NULL) {
    goto fail; //Bool
    }
    }


    // user_business_role_binding->user
    if(user_business_role_binding->user) {
    cJSON *user_local_JSON = business_access_user_summary_convertToJSON(user_business_role_binding->user);
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

user_business_role_binding_t *user_business_role_binding_parseFromJSON(cJSON *user_business_role_bindingJSON){

    user_business_role_binding_t *user_business_role_binding_local_var = NULL;

    // define the local variable for user_business_role_binding->assets_summary
    business_member_assets_summary_t *assets_summary_local_nonprim = NULL;

    // define the local list for user_business_role_binding->business_roles
    list_t *business_rolesList = NULL;

    // define the local variable for user_business_role_binding->created_by_business
    business_access_user_summary_t *created_by_business_local_nonprim = NULL;

    // define the local variable for user_business_role_binding->created_by_user
    business_access_user_summary_t *created_by_user_local_nonprim = NULL;

    // define the local variable for user_business_role_binding->user
    business_access_user_summary_t *user_local_nonprim = NULL;

    // user_business_role_binding->assets_summary
    cJSON *assets_summary = cJSON_GetObjectItemCaseSensitive(user_business_role_bindingJSON, "assets_summary");
    if (assets_summary) { 
    assets_summary_local_nonprim = business_member_assets_summary_parseFromJSON(assets_summary); //nonprimitive
    }

    // user_business_role_binding->business_roles
    cJSON *business_roles = cJSON_GetObjectItemCaseSensitive(user_business_role_bindingJSON, "business_roles");
    if (business_roles) { 
    cJSON *business_roles_local = NULL;
    if(!cJSON_IsArray(business_roles)) {
        goto end;//primitive container
    }
    business_rolesList = list_createList();

    cJSON_ArrayForEach(business_roles_local, business_roles)
    {
        if(!cJSON_IsString(business_roles_local))
        {
            goto end;
        }
        list_addElement(business_rolesList , strdup(business_roles_local->valuestring));
    }
    }

    // user_business_role_binding->created_by_business
    cJSON *created_by_business = cJSON_GetObjectItemCaseSensitive(user_business_role_bindingJSON, "created_by_business");
    if (created_by_business) { 
    created_by_business_local_nonprim = business_access_user_summary_parseFromJSON(created_by_business); //nonprimitive
    }

    // user_business_role_binding->created_by_user
    cJSON *created_by_user = cJSON_GetObjectItemCaseSensitive(user_business_role_bindingJSON, "created_by_user");
    if (created_by_user) { 
    created_by_user_local_nonprim = business_access_user_summary_parseFromJSON(created_by_user); //nonprimitive
    }

    // user_business_role_binding->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(user_business_role_bindingJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // user_business_role_binding->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(user_business_role_bindingJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // user_business_role_binding->is_shared_partner
    cJSON *is_shared_partner = cJSON_GetObjectItemCaseSensitive(user_business_role_bindingJSON, "is_shared_partner");
    if (is_shared_partner) { 
    if(!cJSON_IsBool(is_shared_partner))
    {
    goto end; //Bool
    }
    }

    // user_business_role_binding->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(user_business_role_bindingJSON, "user");
    if (user) { 
    user_local_nonprim = business_access_user_summary_parseFromJSON(user); //nonprimitive
    }


    user_business_role_binding_local_var = user_business_role_binding_create (
        assets_summary ? assets_summary_local_nonprim : NULL,
        business_roles ? business_rolesList : NULL,
        created_by_business ? created_by_business_local_nonprim : NULL,
        created_by_user ? created_by_user_local_nonprim : NULL,
        created_time ? created_time->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        is_shared_partner ? is_shared_partner->valueint : 0,
        user ? user_local_nonprim : NULL
        );

    return user_business_role_binding_local_var;
end:
    if (assets_summary_local_nonprim) {
        business_member_assets_summary_free(assets_summary_local_nonprim);
        assets_summary_local_nonprim = NULL;
    }
    if (business_rolesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, business_rolesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(business_rolesList);
        business_rolesList = NULL;
    }
    if (created_by_business_local_nonprim) {
        business_access_user_summary_free(created_by_business_local_nonprim);
        created_by_business_local_nonprim = NULL;
    }
    if (created_by_user_local_nonprim) {
        business_access_user_summary_free(created_by_user_local_nonprim);
        created_by_user_local_nonprim = NULL;
    }
    if (user_local_nonprim) {
        business_access_user_summary_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
