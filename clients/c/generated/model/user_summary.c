#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_summary.h"



static user_summary_t *user_summary_create_internal(
    char *username,
    char *type
    ) {
    user_summary_t *user_summary_local_var = malloc(sizeof(user_summary_t));
    if (!user_summary_local_var) {
        return NULL;
    }
    user_summary_local_var->username = username;
    user_summary_local_var->type = type;

    user_summary_local_var->_library_owned = 1;
    return user_summary_local_var;
}

__attribute__((deprecated)) user_summary_t *user_summary_create(
    char *username,
    char *type
    ) {
    return user_summary_create_internal (
        username,
        type
        );
}

void user_summary_free(user_summary_t *user_summary) {
    if(NULL == user_summary){
        return ;
    }
    if(user_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (user_summary->username) {
        free(user_summary->username);
        user_summary->username = NULL;
    }
    if (user_summary->type) {
        free(user_summary->type);
        user_summary->type = NULL;
    }
    free(user_summary);
}

cJSON *user_summary_convertToJSON(user_summary_t *user_summary) {
    cJSON *item = cJSON_CreateObject();

    // user_summary->username
    if(user_summary->username) {
    if(cJSON_AddStringToObject(item, "username", user_summary->username) == NULL) {
    goto fail; //String
    }
    }


    // user_summary->type
    if(user_summary->type) {
    if(cJSON_AddStringToObject(item, "type", user_summary->type) == NULL) {
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

user_summary_t *user_summary_parseFromJSON(cJSON *user_summaryJSON){

    user_summary_t *user_summary_local_var = NULL;

    // user_summary->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(user_summaryJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }

    // user_summary->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(user_summaryJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }


    user_summary_local_var = user_summary_create_internal (
        username && !cJSON_IsNull(username) ? strdup(username->valuestring) : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL
        );

    return user_summary_local_var;
end:
    return NULL;

}
