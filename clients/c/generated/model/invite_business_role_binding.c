#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_business_role_binding.h"



static invite_business_role_binding_t *invite_business_role_binding_create_internal(
    char *created_by_business_id,
    char *created_by_user_id,
    char *id,
    invite_data_response_t *invite_data,
    int *is_received_invite,
    business_access_user_summary_t *user
    ) {
    invite_business_role_binding_t *invite_business_role_binding_local_var = malloc(sizeof(invite_business_role_binding_t));
    if (!invite_business_role_binding_local_var) {
        return NULL;
    }
    memset(invite_business_role_binding_local_var, 0, sizeof(invite_business_role_binding_t));
    invite_business_role_binding_local_var->_library_owned = 1;
    invite_business_role_binding_local_var->created_by_business_id = created_by_business_id;
    invite_business_role_binding_local_var->created_by_user_id = created_by_user_id;
    invite_business_role_binding_local_var->id = id;
    invite_business_role_binding_local_var->invite_data = invite_data;
    invite_business_role_binding_local_var->is_received_invite = is_received_invite;
    invite_business_role_binding_local_var->user = user;
    return invite_business_role_binding_local_var;
}

__attribute__((deprecated)) invite_business_role_binding_t *invite_business_role_binding_create(
    char *created_by_business_id,
    char *created_by_user_id,
    char *id,
    invite_data_response_t *invite_data,
    int *is_received_invite,
    business_access_user_summary_t *user
    ) {
    int *is_received_invite_copy = NULL;
    if (is_received_invite) {
        is_received_invite_copy = malloc(sizeof(int));
        if (is_received_invite_copy) *is_received_invite_copy = *is_received_invite;
    }
    invite_business_role_binding_t *result = invite_business_role_binding_create_internal (
        created_by_business_id,
        created_by_user_id,
        id,
        invite_data,
        is_received_invite_copy,
        user
        );
    if (!result) {
        free(is_received_invite_copy);
    }
    return result;
}

void invite_business_role_binding_free(invite_business_role_binding_t *invite_business_role_binding) {
    if(NULL == invite_business_role_binding){
        return ;
    }
    if(invite_business_role_binding->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_business_role_binding_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_business_role_binding->created_by_business_id) {
        free(invite_business_role_binding->created_by_business_id);
        invite_business_role_binding->created_by_business_id = NULL;
    }
    if (invite_business_role_binding->created_by_user_id) {
        free(invite_business_role_binding->created_by_user_id);
        invite_business_role_binding->created_by_user_id = NULL;
    }
    if (invite_business_role_binding->id) {
        free(invite_business_role_binding->id);
        invite_business_role_binding->id = NULL;
    }
    if (invite_business_role_binding->invite_data) {
        invite_data_response_free(invite_business_role_binding->invite_data);
        invite_business_role_binding->invite_data = NULL;
    }
    if (invite_business_role_binding->is_received_invite) {
        free(invite_business_role_binding->is_received_invite);
        invite_business_role_binding->is_received_invite = NULL;
    }
    if (invite_business_role_binding->user) {
        business_access_user_summary_free(invite_business_role_binding->user);
        invite_business_role_binding->user = NULL;
    }
    free(invite_business_role_binding);
}

cJSON *invite_business_role_binding_convertToJSON(invite_business_role_binding_t *invite_business_role_binding) {
    cJSON *item = cJSON_CreateObject();

    // invite_business_role_binding->created_by_business_id
    if(invite_business_role_binding->created_by_business_id) {
    if(cJSON_AddStringToObject(item, "created_by_business_id", invite_business_role_binding->created_by_business_id) == NULL) {
    goto fail; //String
    }
    }


    // invite_business_role_binding->created_by_user_id
    if(invite_business_role_binding->created_by_user_id) {
    if(cJSON_AddStringToObject(item, "created_by_user_id", invite_business_role_binding->created_by_user_id) == NULL) {
    goto fail; //String
    }
    }


    // invite_business_role_binding->id
    if(invite_business_role_binding->id) {
    if(cJSON_AddStringToObject(item, "id", invite_business_role_binding->id) == NULL) {
    goto fail; //String
    }
    }


    // invite_business_role_binding->invite_data
    if(invite_business_role_binding->invite_data) {
    cJSON *invite_data_local_JSON = invite_data_response_convertToJSON(invite_business_role_binding->invite_data);
    if(invite_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invite_data", invite_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // invite_business_role_binding->is_received_invite
    if(invite_business_role_binding->is_received_invite) {
    if(cJSON_AddBoolToObject(item, "is_received_invite", *invite_business_role_binding->is_received_invite) == NULL) {
    goto fail; //Bool
    }
    }


    // invite_business_role_binding->user
    if(invite_business_role_binding->user) {
    cJSON *user_local_JSON = business_access_user_summary_convertToJSON(invite_business_role_binding->user);
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

invite_business_role_binding_t *invite_business_role_binding_parseFromJSON(cJSON *invite_business_role_bindingJSON){

    invite_business_role_binding_t *invite_business_role_binding_local_var = NULL;

    char *created_by_business_id_local_str = NULL;

    char *created_by_user_id_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for invite_business_role_binding->invite_data
    invite_data_response_t *invite_data_local_nonprim = NULL;

    // define the local variable for invite_business_role_binding->is_received_invite
    int *is_received_invite_local_var = NULL;

    // define the local variable for invite_business_role_binding->user
    business_access_user_summary_t *user_local_nonprim = NULL;

    // invite_business_role_binding->created_by_business_id
    cJSON *created_by_business_id = cJSON_GetObjectItemCaseSensitive(invite_business_role_bindingJSON, "created_by_business_id");
    if (cJSON_IsNull(created_by_business_id)) {
        created_by_business_id = NULL;
    }
    if (created_by_business_id) { 
    if(!cJSON_IsString(created_by_business_id) && !cJSON_IsNull(created_by_business_id))
    {
    goto end; //String
    }
    }

    // invite_business_role_binding->created_by_user_id
    cJSON *created_by_user_id = cJSON_GetObjectItemCaseSensitive(invite_business_role_bindingJSON, "created_by_user_id");
    if (cJSON_IsNull(created_by_user_id)) {
        created_by_user_id = NULL;
    }
    if (created_by_user_id) { 
    if(!cJSON_IsString(created_by_user_id) && !cJSON_IsNull(created_by_user_id))
    {
    goto end; //String
    }
    }

    // invite_business_role_binding->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(invite_business_role_bindingJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // invite_business_role_binding->invite_data
    cJSON *invite_data = cJSON_GetObjectItemCaseSensitive(invite_business_role_bindingJSON, "invite_data");
    if (cJSON_IsNull(invite_data)) {
        invite_data = NULL;
    }
    if (invite_data) { 
    invite_data_local_nonprim = invite_data_response_parseFromJSON(invite_data); //nonprimitive
    }

    // invite_business_role_binding->is_received_invite
    cJSON *is_received_invite = cJSON_GetObjectItemCaseSensitive(invite_business_role_bindingJSON, "is_received_invite");
    if (cJSON_IsNull(is_received_invite)) {
        is_received_invite = NULL;
    }
    if (is_received_invite) { 
    if(!cJSON_IsBool(is_received_invite))
    {
    goto end; //Bool
    }
    is_received_invite_local_var = malloc(sizeof(int));
    if(!is_received_invite_local_var)
    {
        goto end;
    }
    *is_received_invite_local_var = is_received_invite->valueint;
    }

    // invite_business_role_binding->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(invite_business_role_bindingJSON, "user");
    if (cJSON_IsNull(user)) {
        user = NULL;
    }
    if (user) { 
    user_local_nonprim = business_access_user_summary_parseFromJSON(user); //nonprimitive
    }


    if (created_by_business_id && !cJSON_IsNull(created_by_business_id)) created_by_business_id_local_str = strdup(created_by_business_id->valuestring);
    if (created_by_user_id && !cJSON_IsNull(created_by_user_id)) created_by_user_id_local_str = strdup(created_by_user_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    invite_business_role_binding_local_var = invite_business_role_binding_create_internal (
        created_by_business_id_local_str,
        created_by_user_id_local_str,
        id_local_str,
        invite_data ? invite_data_local_nonprim : NULL,
        is_received_invite_local_var,
        user ? user_local_nonprim : NULL
        );

    if (!invite_business_role_binding_local_var) {
        goto end;
    }

    return invite_business_role_binding_local_var;
end:
    if (created_by_business_id_local_str) {
        free(created_by_business_id_local_str);
        created_by_business_id_local_str = NULL;
    }
    if (created_by_user_id_local_str) {
        free(created_by_user_id_local_str);
        created_by_user_id_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (invite_data_local_nonprim) {
        invite_data_response_free(invite_data_local_nonprim);
        invite_data_local_nonprim = NULL;
    }
    if (is_received_invite_local_var) {
        free(is_received_invite_local_var);
        is_received_invite_local_var = NULL;
    }
    if (user_local_nonprim) {
        business_access_user_summary_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
