#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "follow_user.h"



static follow_user_t *follow_user_create_internal(
    char *type,
    char *username
    ) {
    follow_user_t *follow_user_local_var = malloc(sizeof(follow_user_t));
    if (!follow_user_local_var) {
        return NULL;
    }
    memset(follow_user_local_var, 0, sizeof(follow_user_t));
    follow_user_local_var->_library_owned = 1;
    follow_user_local_var->type = type;
    follow_user_local_var->username = username;
    return follow_user_local_var;
}

__attribute__((deprecated)) follow_user_t *follow_user_create(
    char *type,
    char *username
    ) {
    follow_user_t *result = follow_user_create_internal (
        type,
        username
        );
    if (!result) {
    }
    return result;
}

void follow_user_free(follow_user_t *follow_user) {
    if(NULL == follow_user){
        return ;
    }
    if(follow_user->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "follow_user_free");
        return ;
    }
    listEntry_t *listEntry;
    if (follow_user->type) {
        free(follow_user->type);
        follow_user->type = NULL;
    }
    if (follow_user->username) {
        free(follow_user->username);
        follow_user->username = NULL;
    }
    free(follow_user);
}

cJSON *follow_user_convertToJSON(follow_user_t *follow_user) {
    cJSON *item = cJSON_CreateObject();

    // follow_user->type
    if(follow_user->type) {
    if(cJSON_AddStringToObject(item, "type", follow_user->type) == NULL) {
    goto fail; //String
    }
    }


    // follow_user->username
    if(follow_user->username) {
    if(cJSON_AddStringToObject(item, "username", follow_user->username) == NULL) {
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

follow_user_t *follow_user_parseFromJSON(cJSON *follow_userJSON){

    follow_user_t *follow_user_local_var = NULL;

    char *type_local_str = NULL;

    char *username_local_str = NULL;

    // follow_user->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(follow_userJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // follow_user->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(follow_userJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }


    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);
    if (username && !cJSON_IsNull(username)) username_local_str = strdup(username->valuestring);

    follow_user_local_var = follow_user_create_internal (
        type_local_str,
        username_local_str
        );

    if (!follow_user_local_var) {
        goto end;
    }

    return follow_user_local_var;
end:
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    if (username_local_str) {
        free(username_local_str);
        username_local_str = NULL;
    }
    return NULL;

}
