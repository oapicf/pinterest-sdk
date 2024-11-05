#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_invites_results_response_array_items_inner_invite.h"



create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite_create(
    char *id,
    business_access_user_summary_t *user
    ) {
    create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite_local_var = malloc(sizeof(create_invites_results_response_array_items_inner_invite_t));
    if (!create_invites_results_response_array_items_inner_invite_local_var) {
        return NULL;
    }
    create_invites_results_response_array_items_inner_invite_local_var->id = id;
    create_invites_results_response_array_items_inner_invite_local_var->user = user;

    return create_invites_results_response_array_items_inner_invite_local_var;
}


void create_invites_results_response_array_items_inner_invite_free(create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite) {
    if(NULL == create_invites_results_response_array_items_inner_invite){
        return ;
    }
    listEntry_t *listEntry;
    if (create_invites_results_response_array_items_inner_invite->id) {
        free(create_invites_results_response_array_items_inner_invite->id);
        create_invites_results_response_array_items_inner_invite->id = NULL;
    }
    if (create_invites_results_response_array_items_inner_invite->user) {
        business_access_user_summary_free(create_invites_results_response_array_items_inner_invite->user);
        create_invites_results_response_array_items_inner_invite->user = NULL;
    }
    free(create_invites_results_response_array_items_inner_invite);
}

cJSON *create_invites_results_response_array_items_inner_invite_convertToJSON(create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite) {
    cJSON *item = cJSON_CreateObject();

    // create_invites_results_response_array_items_inner_invite->id
    if(create_invites_results_response_array_items_inner_invite->id) {
    if(cJSON_AddStringToObject(item, "id", create_invites_results_response_array_items_inner_invite->id) == NULL) {
    goto fail; //String
    }
    }


    // create_invites_results_response_array_items_inner_invite->user
    if(create_invites_results_response_array_items_inner_invite->user) {
    cJSON *user_local_JSON = business_access_user_summary_convertToJSON(create_invites_results_response_array_items_inner_invite->user);
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

create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite_parseFromJSON(cJSON *create_invites_results_response_array_items_inner_inviteJSON){

    create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite_local_var = NULL;

    // define the local variable for create_invites_results_response_array_items_inner_invite->user
    business_access_user_summary_t *user_local_nonprim = NULL;

    // create_invites_results_response_array_items_inner_invite->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(create_invites_results_response_array_items_inner_inviteJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // create_invites_results_response_array_items_inner_invite->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(create_invites_results_response_array_items_inner_inviteJSON, "user");
    if (user) { 
    user_local_nonprim = business_access_user_summary_parseFromJSON(user); //nonprimitive
    }


    create_invites_results_response_array_items_inner_invite_local_var = create_invites_results_response_array_items_inner_invite_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        user ? user_local_nonprim : NULL
        );

    return create_invites_results_response_array_items_inner_invite_local_var;
end:
    if (user_local_nonprim) {
        business_access_user_summary_free(user_local_nonprim);
        user_local_nonprim = NULL;
    }
    return NULL;

}
