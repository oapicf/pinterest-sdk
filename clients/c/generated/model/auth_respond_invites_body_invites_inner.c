#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "auth_respond_invites_body_invites_inner.h"



auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner_create(
    auth_respond_invites_body_invites_inner_action_t *action,
    char *invite_id
    ) {
    auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner_local_var = malloc(sizeof(auth_respond_invites_body_invites_inner_t));
    if (!auth_respond_invites_body_invites_inner_local_var) {
        return NULL;
    }
    auth_respond_invites_body_invites_inner_local_var->action = action;
    auth_respond_invites_body_invites_inner_local_var->invite_id = invite_id;

    return auth_respond_invites_body_invites_inner_local_var;
}


void auth_respond_invites_body_invites_inner_free(auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner) {
    if(NULL == auth_respond_invites_body_invites_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (auth_respond_invites_body_invites_inner->action) {
        auth_respond_invites_body_invites_inner_action_free(auth_respond_invites_body_invites_inner->action);
        auth_respond_invites_body_invites_inner->action = NULL;
    }
    if (auth_respond_invites_body_invites_inner->invite_id) {
        free(auth_respond_invites_body_invites_inner->invite_id);
        auth_respond_invites_body_invites_inner->invite_id = NULL;
    }
    free(auth_respond_invites_body_invites_inner);
}

cJSON *auth_respond_invites_body_invites_inner_convertToJSON(auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner) {
    cJSON *item = cJSON_CreateObject();

    // auth_respond_invites_body_invites_inner->action
    if (!auth_respond_invites_body_invites_inner->action) {
        goto fail;
    }
    cJSON *action_local_JSON = auth_respond_invites_body_invites_inner_action_convertToJSON(auth_respond_invites_body_invites_inner->action);
    if(action_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "action", action_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // auth_respond_invites_body_invites_inner->invite_id
    if (!auth_respond_invites_body_invites_inner->invite_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "invite_id", auth_respond_invites_body_invites_inner->invite_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner_parseFromJSON(cJSON *auth_respond_invites_body_invites_innerJSON){

    auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner_local_var = NULL;

    // define the local variable for auth_respond_invites_body_invites_inner->action
    auth_respond_invites_body_invites_inner_action_t *action_local_nonprim = NULL;

    // auth_respond_invites_body_invites_inner->action
    cJSON *action = cJSON_GetObjectItemCaseSensitive(auth_respond_invites_body_invites_innerJSON, "action");
    if (!action) {
        goto end;
    }

    
    action_local_nonprim = auth_respond_invites_body_invites_inner_action_parseFromJSON(action); //nonprimitive

    // auth_respond_invites_body_invites_inner->invite_id
    cJSON *invite_id = cJSON_GetObjectItemCaseSensitive(auth_respond_invites_body_invites_innerJSON, "invite_id");
    if (!invite_id) {
        goto end;
    }

    
    if(!cJSON_IsString(invite_id))
    {
    goto end; //String
    }


    auth_respond_invites_body_invites_inner_local_var = auth_respond_invites_body_invites_inner_create (
        action_local_nonprim,
        strdup(invite_id->valuestring)
        );

    return auth_respond_invites_body_invites_inner_local_var;
end:
    if (action_local_nonprim) {
        auth_respond_invites_body_invites_inner_action_free(action_local_nonprim);
        action_local_nonprim = NULL;
    }
    return NULL;

}
