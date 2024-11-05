#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "base_invite_data_response.h"



base_invite_data_response_t *base_invite_data_response_create(
    char *id,
    base_invite_data_response_invite_data_t *invite_data,
    int is_received_invite,
    business_access_user_summary_t *user
    ) {
    base_invite_data_response_t *base_invite_data_response_local_var = malloc(sizeof(base_invite_data_response_t));
    if (!base_invite_data_response_local_var) {
        return NULL;
    }
    base_invite_data_response_local_var->id = id;
    base_invite_data_response_local_var->invite_data = invite_data;
    base_invite_data_response_local_var->is_received_invite = is_received_invite;
    base_invite_data_response_local_var->user = user;

    return base_invite_data_response_local_var;
}


void base_invite_data_response_free(base_invite_data_response_t *base_invite_data_response) {
    if(NULL == base_invite_data_response){
        return ;
    }
    listEntry_t *listEntry;
    if (base_invite_data_response->id) {
        free(base_invite_data_response->id);
        base_invite_data_response->id = NULL;
    }
    if (base_invite_data_response->invite_data) {
        base_invite_data_response_invite_data_free(base_invite_data_response->invite_data);
        base_invite_data_response->invite_data = NULL;
    }
    if (base_invite_data_response->user) {
        business_access_user_summary_free(base_invite_data_response->user);
        base_invite_data_response->user = NULL;
    }
    free(base_invite_data_response);
}

cJSON *base_invite_data_response_convertToJSON(base_invite_data_response_t *base_invite_data_response) {
    cJSON *item = cJSON_CreateObject();

    // base_invite_data_response->id
    if(base_invite_data_response->id) {
    if(cJSON_AddStringToObject(item, "id", base_invite_data_response->id) == NULL) {
    goto fail; //String
    }
    }


    // base_invite_data_response->invite_data
    if(base_invite_data_response->invite_data) {
    cJSON *invite_data_local_JSON = base_invite_data_response_invite_data_convertToJSON(base_invite_data_response->invite_data);
    if(invite_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invite_data", invite_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // base_invite_data_response->is_received_invite
    if(base_invite_data_response->is_received_invite) {
    if(cJSON_AddBoolToObject(item, "is_received_invite", base_invite_data_response->is_received_invite) == NULL) {
    goto fail; //Bool
    }
    }


    // base_invite_data_response->user
    if(base_invite_data_response->user) {
    cJSON *user_local_JSON = business_access_user_summary_convertToJSON(base_invite_data_response->user);
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

base_invite_data_response_t *base_invite_data_response_parseFromJSON(cJSON *base_invite_data_responseJSON){

    base_invite_data_response_t *base_invite_data_response_local_var = NULL;

    // define the local variable for base_invite_data_response->invite_data
    base_invite_data_response_invite_data_t *invite_data_local_nonprim = NULL;

    // define the local variable for base_invite_data_response->user
    business_access_user_summary_t *user_local_nonprim = NULL;

    // base_invite_data_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(base_invite_data_responseJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // base_invite_data_response->invite_data
    cJSON *invite_data = cJSON_GetObjectItemCaseSensitive(base_invite_data_responseJSON, "invite_data");
    if (invite_data) { 
    invite_data_local_nonprim = base_invite_data_response_invite_data_parseFromJSON(invite_data); //nonprimitive
    }

    // base_invite_data_response->is_received_invite
    cJSON *is_received_invite = cJSON_GetObjectItemCaseSensitive(base_invite_data_responseJSON, "is_received_invite");
    if (is_received_invite) { 
    if(!cJSON_IsBool(is_received_invite))
    {
    goto end; //Bool
    }
    }

    // base_invite_data_response->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(base_invite_data_responseJSON, "user");
    if (user) { 
    user_local_nonprim = business_access_user_summary_parseFromJSON(user); //nonprimitive
    }


    base_invite_data_response_local_var = base_invite_data_response_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        invite_data ? invite_data_local_nonprim : NULL,
        is_received_invite ? is_received_invite->valueint : 0,
        user ? user_local_nonprim : NULL
        );

    return base_invite_data_response_local_var;
end:
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
