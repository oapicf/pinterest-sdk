#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_access_token.h"



static conversion_access_token_t *conversion_access_token_create_internal(
    char *access_token,
    char *token_type
    ) {
    conversion_access_token_t *conversion_access_token_local_var = malloc(sizeof(conversion_access_token_t));
    if (!conversion_access_token_local_var) {
        return NULL;
    }
    memset(conversion_access_token_local_var, 0, sizeof(conversion_access_token_t));
    conversion_access_token_local_var->_library_owned = 1;
    conversion_access_token_local_var->access_token = access_token;
    conversion_access_token_local_var->token_type = token_type;
    return conversion_access_token_local_var;
}

__attribute__((deprecated)) conversion_access_token_t *conversion_access_token_create(
    char *access_token,
    char *token_type
    ) {
    conversion_access_token_t *result = conversion_access_token_create_internal (
        access_token,
        token_type
        );
    if (!result) {
    }
    return result;
}

void conversion_access_token_free(conversion_access_token_t *conversion_access_token) {
    if(NULL == conversion_access_token){
        return ;
    }
    if(conversion_access_token->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_access_token_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_access_token->access_token) {
        free(conversion_access_token->access_token);
        conversion_access_token->access_token = NULL;
    }
    if (conversion_access_token->token_type) {
        free(conversion_access_token->token_type);
        conversion_access_token->token_type = NULL;
    }
    free(conversion_access_token);
}

cJSON *conversion_access_token_convertToJSON(conversion_access_token_t *conversion_access_token) {
    cJSON *item = cJSON_CreateObject();

    // conversion_access_token->access_token
    if (!conversion_access_token->access_token) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "access_token", conversion_access_token->access_token) == NULL) {
    goto fail; //String
    }


    // conversion_access_token->token_type
    if(conversion_access_token->token_type) {
    if(cJSON_AddStringToObject(item, "token_type", conversion_access_token->token_type) == NULL) {
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

conversion_access_token_t *conversion_access_token_parseFromJSON(cJSON *conversion_access_tokenJSON){

    conversion_access_token_t *conversion_access_token_local_var = NULL;

    char *access_token_local_str = NULL;

    char *token_type_local_str = NULL;

    // conversion_access_token->access_token
    cJSON *access_token = cJSON_GetObjectItemCaseSensitive(conversion_access_tokenJSON, "access_token");
    if (cJSON_IsNull(access_token)) {
        access_token = NULL;
    }
    if (!access_token) {
        goto end;
    }

    
    if(!cJSON_IsString(access_token))
    {
    goto end; //String
    }

    // conversion_access_token->token_type
    cJSON *token_type = cJSON_GetObjectItemCaseSensitive(conversion_access_tokenJSON, "token_type");
    if (cJSON_IsNull(token_type)) {
        token_type = NULL;
    }
    if (token_type) { 
    if(!cJSON_IsString(token_type) && !cJSON_IsNull(token_type))
    {
    goto end; //String
    }
    }


    if (access_token && !cJSON_IsNull(access_token)) access_token_local_str = strdup(access_token->valuestring);
    if (token_type && !cJSON_IsNull(token_type)) token_type_local_str = strdup(token_type->valuestring);

    conversion_access_token_local_var = conversion_access_token_create_internal (
        access_token_local_str,
        token_type_local_str
        );

    if (!conversion_access_token_local_var) {
        goto end;
    }

    return conversion_access_token_local_var;
end:
    if (access_token_local_str) {
        free(access_token_local_str);
        access_token_local_str = NULL;
    }
    if (token_type_local_str) {
        free(token_type_local_str);
        token_type_local_str = NULL;
    }
    return NULL;

}
