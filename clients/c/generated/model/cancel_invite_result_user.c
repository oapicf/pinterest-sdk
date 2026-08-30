#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cancel_invite_result_user.h"



static cancel_invite_result_user_t *cancel_invite_result_user_create_internal(
    char *email,
    char *id,
    char *username
    ) {
    cancel_invite_result_user_t *cancel_invite_result_user_local_var = malloc(sizeof(cancel_invite_result_user_t));
    if (!cancel_invite_result_user_local_var) {
        return NULL;
    }
    memset(cancel_invite_result_user_local_var, 0, sizeof(cancel_invite_result_user_t));
    cancel_invite_result_user_local_var->_library_owned = 1;
    cancel_invite_result_user_local_var->email = email;
    cancel_invite_result_user_local_var->id = id;
    cancel_invite_result_user_local_var->username = username;
    return cancel_invite_result_user_local_var;
}

__attribute__((deprecated)) cancel_invite_result_user_t *cancel_invite_result_user_create(
    char *email,
    char *id,
    char *username
    ) {
    cancel_invite_result_user_t *result = cancel_invite_result_user_create_internal (
        email,
        id,
        username
        );
    if (!result) {
    }
    return result;
}

void cancel_invite_result_user_free(cancel_invite_result_user_t *cancel_invite_result_user) {
    if(NULL == cancel_invite_result_user){
        return ;
    }
    if(cancel_invite_result_user->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cancel_invite_result_user_free");
        return ;
    }
    listEntry_t *listEntry;
    if (cancel_invite_result_user->email) {
        free(cancel_invite_result_user->email);
        cancel_invite_result_user->email = NULL;
    }
    if (cancel_invite_result_user->id) {
        free(cancel_invite_result_user->id);
        cancel_invite_result_user->id = NULL;
    }
    if (cancel_invite_result_user->username) {
        free(cancel_invite_result_user->username);
        cancel_invite_result_user->username = NULL;
    }
    free(cancel_invite_result_user);
}

cJSON *cancel_invite_result_user_convertToJSON(cancel_invite_result_user_t *cancel_invite_result_user) {
    cJSON *item = cJSON_CreateObject();

    // cancel_invite_result_user->email
    if(cancel_invite_result_user->email) {
    if(cJSON_AddStringToObject(item, "email", cancel_invite_result_user->email) == NULL) {
    goto fail; //String
    }
    }


    // cancel_invite_result_user->id
    if(cancel_invite_result_user->id) {
    if(cJSON_AddStringToObject(item, "id", cancel_invite_result_user->id) == NULL) {
    goto fail; //String
    }
    }


    // cancel_invite_result_user->username
    if(cancel_invite_result_user->username) {
    if(cJSON_AddStringToObject(item, "username", cancel_invite_result_user->username) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cancel_invite_result_user_t *cancel_invite_result_user_parseFromJSON(cJSON *cancel_invite_result_userJSON){

    cancel_invite_result_user_t *cancel_invite_result_user_local_var = NULL;

    char *email_local_str = NULL;

    char *id_local_str = NULL;

    char *username_local_str = NULL;

    // cancel_invite_result_user->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(cancel_invite_result_userJSON, "email");
    if (cJSON_IsNull(email)) {
        email = NULL;
    }
    if (email) { 
    if(!cJSON_IsString(email) && !cJSON_IsNull(email))
    {
    goto end; //String
    }
    }

    // cancel_invite_result_user->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(cancel_invite_result_userJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // cancel_invite_result_user->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(cancel_invite_result_userJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }


    if (email && !cJSON_IsNull(email)) email_local_str = strdup(email->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (username && !cJSON_IsNull(username)) username_local_str = strdup(username->valuestring);

    cancel_invite_result_user_local_var = cancel_invite_result_user_create_internal (
        email_local_str,
        id_local_str,
        username_local_str
        );

    if (!cancel_invite_result_user_local_var) {
        goto end;
    }

    return cancel_invite_result_user_local_var;
end:
    if (email_local_str) {
        free(email_local_str);
        email_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (username_local_str) {
        free(username_local_str);
        username_local_str = NULL;
    }
    return NULL;

}
