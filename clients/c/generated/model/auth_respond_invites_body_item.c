#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "auth_respond_invites_body_item.h"



static auth_respond_invites_body_item_t *auth_respond_invites_body_item_create_internal(
    auth_respond_invite_action_t *action,
    char *invite_id
    ) {
    auth_respond_invites_body_item_t *auth_respond_invites_body_item_local_var = malloc(sizeof(auth_respond_invites_body_item_t));
    if (!auth_respond_invites_body_item_local_var) {
        return NULL;
    }
    memset(auth_respond_invites_body_item_local_var, 0, sizeof(auth_respond_invites_body_item_t));
    auth_respond_invites_body_item_local_var->_library_owned = 1;
    auth_respond_invites_body_item_local_var->action = action;
    auth_respond_invites_body_item_local_var->invite_id = invite_id;
    return auth_respond_invites_body_item_local_var;
}

__attribute__((deprecated)) auth_respond_invites_body_item_t *auth_respond_invites_body_item_create(
    auth_respond_invite_action_t *action,
    char *invite_id
    ) {
    auth_respond_invites_body_item_t *result = auth_respond_invites_body_item_create_internal (
        action,
        invite_id
        );
    if (!result) {
    }
    return result;
}

void auth_respond_invites_body_item_free(auth_respond_invites_body_item_t *auth_respond_invites_body_item) {
    if(NULL == auth_respond_invites_body_item){
        return ;
    }
    if(auth_respond_invites_body_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "auth_respond_invites_body_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (auth_respond_invites_body_item->action) {
        auth_respond_invite_action_free(auth_respond_invites_body_item->action);
        auth_respond_invites_body_item->action = NULL;
    }
    if (auth_respond_invites_body_item->invite_id) {
        free(auth_respond_invites_body_item->invite_id);
        auth_respond_invites_body_item->invite_id = NULL;
    }
    free(auth_respond_invites_body_item);
}

cJSON *auth_respond_invites_body_item_convertToJSON(auth_respond_invites_body_item_t *auth_respond_invites_body_item) {
    cJSON *item = cJSON_CreateObject();

    // auth_respond_invites_body_item->action
    if (!auth_respond_invites_body_item->action) {
        goto fail;
    }
    cJSON *action_local_JSON = auth_respond_invite_action_convertToJSON(auth_respond_invites_body_item->action);
    if(action_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "action", action_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // auth_respond_invites_body_item->invite_id
    if (!auth_respond_invites_body_item->invite_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "invite_id", auth_respond_invites_body_item->invite_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

auth_respond_invites_body_item_t *auth_respond_invites_body_item_parseFromJSON(cJSON *auth_respond_invites_body_itemJSON){

    auth_respond_invites_body_item_t *auth_respond_invites_body_item_local_var = NULL;

    // define the local variable for auth_respond_invites_body_item->action
    auth_respond_invite_action_t *action_local_nonprim = NULL;

    char *invite_id_local_str = NULL;

    // auth_respond_invites_body_item->action
    cJSON *action = cJSON_GetObjectItemCaseSensitive(auth_respond_invites_body_itemJSON, "action");
    if (cJSON_IsNull(action)) {
        action = NULL;
    }
    if (!action) {
        goto end;
    }

    
    action_local_nonprim = auth_respond_invite_action_parseFromJSON(action); //nonprimitive

    // auth_respond_invites_body_item->invite_id
    cJSON *invite_id = cJSON_GetObjectItemCaseSensitive(auth_respond_invites_body_itemJSON, "invite_id");
    if (cJSON_IsNull(invite_id)) {
        invite_id = NULL;
    }
    if (!invite_id) {
        goto end;
    }

    
    if(!cJSON_IsString(invite_id))
    {
    goto end; //String
    }


    if (invite_id && !cJSON_IsNull(invite_id)) invite_id_local_str = strdup(invite_id->valuestring);

    auth_respond_invites_body_item_local_var = auth_respond_invites_body_item_create_internal (
        action_local_nonprim,
        invite_id_local_str
        );

    if (!auth_respond_invites_body_item_local_var) {
        goto end;
    }

    return auth_respond_invites_body_item_local_var;
end:
    if (action_local_nonprim) {
        auth_respond_invite_action_free(action_local_nonprim);
        action_local_nonprim = NULL;
    }
    if (invite_id_local_str) {
        free(invite_id_local_str);
        invite_id_local_str = NULL;
    }
    return NULL;

}
