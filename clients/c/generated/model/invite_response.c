#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_response.h"



invite_response_t *invite_response_create(
    invite_assets_summary_t *assets_summary,
    list_t *business_roles,
    business_access_user_summary_t *created_by_business,
    business_access_user_summary_t *created_by_user,
    int created_time,
    char *id,
    base_invite_data_response_invite_data_t *invite_data,
    int is_received_invite,
    business_access_user_summary_t *user
    ) {
    invite_response_t *invite_response_local_var = malloc(sizeof(invite_response_t));
    if (!invite_response_local_var) {
        return NULL;
    }
    invite_response_local_var->assets_summary = assets_summary;
    invite_response_local_var->business_roles = business_roles;
    invite_response_local_var->created_by_business = created_by_business;
    invite_response_local_var->created_by_user = created_by_user;
    invite_response_local_var->created_time = created_time;
    invite_response_local_var->id = id;
    invite_response_local_var->invite_data = invite_data;
    invite_response_local_var->is_received_invite = is_received_invite;
    invite_response_local_var->user = user;

    return invite_response_local_var;
}


void invite_response_free(invite_response_t *invite_response) {
    if(NULL == invite_response){
        return ;
    }
    listEntry_t *listEntry;
    if (invite_response->assets_summary) {
        invite_assets_summary_free(invite_response->assets_summary);
        invite_response->assets_summary = NULL;
    }
    if (invite_response->business_roles) {
        list_ForEach(listEntry, invite_response->business_roles) {
            free(listEntry->data);
        }
        list_freeList(invite_response->business_roles);
        invite_response->business_roles = NULL;
    }
    if (invite_response->created_by_business) {
        business_access_user_summary_free(invite_response->created_by_business);
        invite_response->created_by_business = NULL;
    }
    if (invite_response->created_by_user) {
        business_access_user_summary_free(invite_response->created_by_user);
        invite_response->created_by_user = NULL;
    }
    if (invite_response->id) {
        free(invite_response->id);
        invite_response->id = NULL;
    }
    if (invite_response->invite_data) {
        base_invite_data_response_invite_data_free(invite_response->invite_data);
        invite_response->invite_data = NULL;
    }
    if (invite_response->user) {
        business_access_user_summary_free(invite_response->user);
        invite_response->user = NULL;
    }
    free(invite_response);
}

cJSON *invite_response_convertToJSON(invite_response_t *invite_response) {
    cJSON *item = cJSON_CreateObject();

    // invite_response->assets_summary
    if(invite_response->assets_summary) {
    cJSON *assets_summary_local_JSON = invite_assets_summary_convertToJSON(invite_response->assets_summary);
    if(assets_summary_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "assets_summary", assets_summary_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // invite_response->business_roles
    if(invite_response->business_roles) {
    cJSON *business_roles = cJSON_AddArrayToObject(item, "business_roles");
    if(business_roles == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *business_rolesListEntry;
    list_ForEach(business_rolesListEntry, invite_response->business_roles) {
    if(cJSON_AddStringToObject(business_roles, "", (char*)business_rolesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // invite_response->created_by_business
    if(invite_response->created_by_business) {
    cJSON *created_by_business_local_JSON = business_access_user_summary_convertToJSON(invite_response->created_by_business);
    if(created_by_business_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "created_by_business", created_by_business_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // invite_response->created_by_user
    if(invite_response->created_by_user) {
    cJSON *created_by_user_local_JSON = business_access_user_summary_convertToJSON(invite_response->created_by_user);
    if(created_by_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "created_by_user", created_by_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // invite_response->created_time
    if(invite_response->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", invite_response->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // invite_response->id
    if(invite_response->id) {
    if(cJSON_AddStringToObject(item, "id", invite_response->id) == NULL) {
    goto fail; //String
    }
    }


    // invite_response->invite_data
    if(invite_response->invite_data) {
    cJSON *invite_data_local_JSON = base_invite_data_response_invite_data_convertToJSON(invite_response->invite_data);
    if(invite_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invite_data", invite_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // invite_response->is_received_invite
    if(invite_response->is_received_invite) {
    if(cJSON_AddBoolToObject(item, "is_received_invite", invite_response->is_received_invite) == NULL) {
    goto fail; //Bool
    }
    }


    // invite_response->user
    if(invite_response->user) {
    cJSON *user_local_JSON = business_access_user_summary_convertToJSON(invite_response->user);
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

invite_response_t *invite_response_parseFromJSON(cJSON *invite_responseJSON){

    invite_response_t *invite_response_local_var = NULL;

    // define the local variable for invite_response->assets_summary
    invite_assets_summary_t *assets_summary_local_nonprim = NULL;

    // define the local list for invite_response->business_roles
    list_t *business_rolesList = NULL;

    // define the local variable for invite_response->created_by_business
    business_access_user_summary_t *created_by_business_local_nonprim = NULL;

    // define the local variable for invite_response->created_by_user
    business_access_user_summary_t *created_by_user_local_nonprim = NULL;

    // define the local variable for invite_response->invite_data
    base_invite_data_response_invite_data_t *invite_data_local_nonprim = NULL;

    // define the local variable for invite_response->user
    business_access_user_summary_t *user_local_nonprim = NULL;

    // invite_response->assets_summary
    cJSON *assets_summary = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "assets_summary");
    if (assets_summary) { 
    assets_summary_local_nonprim = invite_assets_summary_parseFromJSON(assets_summary); //nonprimitive
    }

    // invite_response->business_roles
    cJSON *business_roles = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "business_roles");
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

    // invite_response->created_by_business
    cJSON *created_by_business = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "created_by_business");
    if (created_by_business) { 
    created_by_business_local_nonprim = business_access_user_summary_parseFromJSON(created_by_business); //nonprimitive
    }

    // invite_response->created_by_user
    cJSON *created_by_user = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "created_by_user");
    if (created_by_user) { 
    created_by_user_local_nonprim = business_access_user_summary_parseFromJSON(created_by_user); //nonprimitive
    }

    // invite_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // invite_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // invite_response->invite_data
    cJSON *invite_data = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "invite_data");
    if (invite_data) { 
    invite_data_local_nonprim = base_invite_data_response_invite_data_parseFromJSON(invite_data); //nonprimitive
    }

    // invite_response->is_received_invite
    cJSON *is_received_invite = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "is_received_invite");
    if (is_received_invite) { 
    if(!cJSON_IsBool(is_received_invite))
    {
    goto end; //Bool
    }
    }

    // invite_response->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(invite_responseJSON, "user");
    if (user) { 
    user_local_nonprim = business_access_user_summary_parseFromJSON(user); //nonprimitive
    }


    invite_response_local_var = invite_response_create (
        assets_summary ? assets_summary_local_nonprim : NULL,
        business_roles ? business_rolesList : NULL,
        created_by_business ? created_by_business_local_nonprim : NULL,
        created_by_user ? created_by_user_local_nonprim : NULL,
        created_time ? created_time->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        invite_data ? invite_data_local_nonprim : NULL,
        is_received_invite ? is_received_invite->valueint : 0,
        user ? user_local_nonprim : NULL
        );

    return invite_response_local_var;
end:
    if (assets_summary_local_nonprim) {
        invite_assets_summary_free(assets_summary_local_nonprim);
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
    if (invite_data_local_nonprim) {
        base_invite_data_response_invite_data_free(invite_data_local_nonprim);
        invite_data_local_nonprim = NULL;
    }
    if (user_local_nonprim) {
        business_access_user_summary_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
