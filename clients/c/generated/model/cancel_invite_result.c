#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cancel_invite_result.h"



static cancel_invite_result_t *cancel_invite_result_create_internal(
    char *id,
    invite_data_response_t *invite_data,
    int *is_received_invite,
    cancel_invite_result_user_t *user
    ) {
    cancel_invite_result_t *cancel_invite_result_local_var = malloc(sizeof(cancel_invite_result_t));
    if (!cancel_invite_result_local_var) {
        return NULL;
    }
    memset(cancel_invite_result_local_var, 0, sizeof(cancel_invite_result_t));
    cancel_invite_result_local_var->_library_owned = 1;
    cancel_invite_result_local_var->id = id;
    cancel_invite_result_local_var->invite_data = invite_data;
    cancel_invite_result_local_var->is_received_invite = is_received_invite;
    cancel_invite_result_local_var->user = user;
    return cancel_invite_result_local_var;
}

__attribute__((deprecated)) cancel_invite_result_t *cancel_invite_result_create(
    char *id,
    invite_data_response_t *invite_data,
    int *is_received_invite,
    cancel_invite_result_user_t *user
    ) {
    int *is_received_invite_copy = NULL;
    if (is_received_invite) {
        is_received_invite_copy = malloc(sizeof(int));
        if (is_received_invite_copy) *is_received_invite_copy = *is_received_invite;
    }
    cancel_invite_result_t *result = cancel_invite_result_create_internal (
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

void cancel_invite_result_free(cancel_invite_result_t *cancel_invite_result) {
    if(NULL == cancel_invite_result){
        return ;
    }
    if(cancel_invite_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cancel_invite_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (cancel_invite_result->id) {
        free(cancel_invite_result->id);
        cancel_invite_result->id = NULL;
    }
    if (cancel_invite_result->invite_data) {
        invite_data_response_free(cancel_invite_result->invite_data);
        cancel_invite_result->invite_data = NULL;
    }
    if (cancel_invite_result->is_received_invite) {
        free(cancel_invite_result->is_received_invite);
        cancel_invite_result->is_received_invite = NULL;
    }
    if (cancel_invite_result->user) {
        cancel_invite_result_user_free(cancel_invite_result->user);
        cancel_invite_result->user = NULL;
    }
    free(cancel_invite_result);
}

cJSON *cancel_invite_result_convertToJSON(cancel_invite_result_t *cancel_invite_result) {
    cJSON *item = cJSON_CreateObject();

    // cancel_invite_result->id
    if(cancel_invite_result->id) {
    if(cJSON_AddStringToObject(item, "id", cancel_invite_result->id) == NULL) {
    goto fail; //String
    }
    }


    // cancel_invite_result->invite_data
    if(cancel_invite_result->invite_data) {
    cJSON *invite_data_local_JSON = invite_data_response_convertToJSON(cancel_invite_result->invite_data);
    if(invite_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invite_data", invite_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // cancel_invite_result->is_received_invite
    if(cancel_invite_result->is_received_invite) {
    if(cJSON_AddBoolToObject(item, "is_received_invite", *cancel_invite_result->is_received_invite) == NULL) {
    goto fail; //Bool
    }
    }


    // cancel_invite_result->user
    if(cancel_invite_result->user) {
    cJSON *user_local_JSON = cancel_invite_result_user_convertToJSON(cancel_invite_result->user);
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

cancel_invite_result_t *cancel_invite_result_parseFromJSON(cJSON *cancel_invite_resultJSON){

    cancel_invite_result_t *cancel_invite_result_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for cancel_invite_result->invite_data
    invite_data_response_t *invite_data_local_nonprim = NULL;

    // define the local variable for cancel_invite_result->is_received_invite
    int *is_received_invite_local_var = NULL;

    // define the local variable for cancel_invite_result->user
    cancel_invite_result_user_t *user_local_nonprim = NULL;

    // cancel_invite_result->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(cancel_invite_resultJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // cancel_invite_result->invite_data
    cJSON *invite_data = cJSON_GetObjectItemCaseSensitive(cancel_invite_resultJSON, "invite_data");
    if (cJSON_IsNull(invite_data)) {
        invite_data = NULL;
    }
    if (invite_data) { 
    invite_data_local_nonprim = invite_data_response_parseFromJSON(invite_data); //nonprimitive
    }

    // cancel_invite_result->is_received_invite
    cJSON *is_received_invite = cJSON_GetObjectItemCaseSensitive(cancel_invite_resultJSON, "is_received_invite");
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

    // cancel_invite_result->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(cancel_invite_resultJSON, "user");
    if (cJSON_IsNull(user)) {
        user = NULL;
    }
    if (user) { 
    user_local_nonprim = cancel_invite_result_user_parseFromJSON(user); //nonprimitive
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    cancel_invite_result_local_var = cancel_invite_result_create_internal (
        id_local_str,
        invite_data ? invite_data_local_nonprim : NULL,
        is_received_invite_local_var,
        user ? user_local_nonprim : NULL
        );

    if (!cancel_invite_result_local_var) {
        goto end;
    }

    return cancel_invite_result_local_var;
end:
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
        cancel_invite_result_user_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
