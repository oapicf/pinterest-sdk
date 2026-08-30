#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "oauth_access_token.h"



static oauth_access_token_t *oauth_access_token_create_internal(
    char *access_token,
    int *expires_in,
    char *refresh_token,
    int *refresh_token_expires_at,
    int *refresh_token_expires_in,
    token_grant_type_t *response_type,
    char *scope,
    char *token_type
    ) {
    oauth_access_token_t *oauth_access_token_local_var = malloc(sizeof(oauth_access_token_t));
    if (!oauth_access_token_local_var) {
        return NULL;
    }
    memset(oauth_access_token_local_var, 0, sizeof(oauth_access_token_t));
    oauth_access_token_local_var->_library_owned = 1;
    oauth_access_token_local_var->access_token = access_token;
    oauth_access_token_local_var->expires_in = expires_in;
    oauth_access_token_local_var->refresh_token = refresh_token;
    oauth_access_token_local_var->refresh_token_expires_at = refresh_token_expires_at;
    oauth_access_token_local_var->refresh_token_expires_in = refresh_token_expires_in;
    oauth_access_token_local_var->response_type = response_type;
    oauth_access_token_local_var->scope = scope;
    oauth_access_token_local_var->token_type = token_type;
    return oauth_access_token_local_var;
}

__attribute__((deprecated)) oauth_access_token_t *oauth_access_token_create(
    char *access_token,
    int *expires_in,
    char *refresh_token,
    int *refresh_token_expires_at,
    int *refresh_token_expires_in,
    token_grant_type_t *response_type,
    char *scope,
    char *token_type
    ) {
    int *expires_in_copy = NULL;
    if (expires_in) {
        expires_in_copy = malloc(sizeof(int));
        if (expires_in_copy) *expires_in_copy = *expires_in;
    }
    int *refresh_token_expires_at_copy = NULL;
    if (refresh_token_expires_at) {
        refresh_token_expires_at_copy = malloc(sizeof(int));
        if (refresh_token_expires_at_copy) *refresh_token_expires_at_copy = *refresh_token_expires_at;
    }
    int *refresh_token_expires_in_copy = NULL;
    if (refresh_token_expires_in) {
        refresh_token_expires_in_copy = malloc(sizeof(int));
        if (refresh_token_expires_in_copy) *refresh_token_expires_in_copy = *refresh_token_expires_in;
    }
    oauth_access_token_t *result = oauth_access_token_create_internal (
        access_token,
        expires_in_copy,
        refresh_token,
        refresh_token_expires_at_copy,
        refresh_token_expires_in_copy,
        response_type,
        scope,
        token_type
        );
    if (!result) {
        free(expires_in_copy);
        free(refresh_token_expires_at_copy);
        free(refresh_token_expires_in_copy);
    }
    return result;
}

void oauth_access_token_free(oauth_access_token_t *oauth_access_token) {
    if(NULL == oauth_access_token){
        return ;
    }
    if(oauth_access_token->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "oauth_access_token_free");
        return ;
    }
    listEntry_t *listEntry;
    if (oauth_access_token->access_token) {
        free(oauth_access_token->access_token);
        oauth_access_token->access_token = NULL;
    }
    if (oauth_access_token->expires_in) {
        free(oauth_access_token->expires_in);
        oauth_access_token->expires_in = NULL;
    }
    if (oauth_access_token->refresh_token) {
        free(oauth_access_token->refresh_token);
        oauth_access_token->refresh_token = NULL;
    }
    if (oauth_access_token->refresh_token_expires_at) {
        free(oauth_access_token->refresh_token_expires_at);
        oauth_access_token->refresh_token_expires_at = NULL;
    }
    if (oauth_access_token->refresh_token_expires_in) {
        free(oauth_access_token->refresh_token_expires_in);
        oauth_access_token->refresh_token_expires_in = NULL;
    }
    if (oauth_access_token->response_type) {
        token_grant_type_free(oauth_access_token->response_type);
        oauth_access_token->response_type = NULL;
    }
    if (oauth_access_token->scope) {
        free(oauth_access_token->scope);
        oauth_access_token->scope = NULL;
    }
    if (oauth_access_token->token_type) {
        free(oauth_access_token->token_type);
        oauth_access_token->token_type = NULL;
    }
    free(oauth_access_token);
}

cJSON *oauth_access_token_convertToJSON(oauth_access_token_t *oauth_access_token) {
    cJSON *item = cJSON_CreateObject();

    // oauth_access_token->access_token
    if (!oauth_access_token->access_token) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "access_token", oauth_access_token->access_token) == NULL) {
    goto fail; //String
    }


    // oauth_access_token->expires_in
    if (!oauth_access_token->expires_in) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_in", *oauth_access_token->expires_in) == NULL) {
    goto fail; //Numeric
    }


    // oauth_access_token->refresh_token
    if(oauth_access_token->refresh_token) {
    if(cJSON_AddStringToObject(item, "refresh_token", oauth_access_token->refresh_token) == NULL) {
    goto fail; //String
    }
    }


    // oauth_access_token->refresh_token_expires_at
    if(oauth_access_token->refresh_token_expires_at) {
    if(cJSON_AddNumberToObject(item, "refresh_token_expires_at", *oauth_access_token->refresh_token_expires_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // oauth_access_token->refresh_token_expires_in
    if(oauth_access_token->refresh_token_expires_in) {
    if(cJSON_AddNumberToObject(item, "refresh_token_expires_in", *oauth_access_token->refresh_token_expires_in) == NULL) {
    goto fail; //Numeric
    }
    }


    // oauth_access_token->response_type
    if(oauth_access_token->response_type) {
    cJSON *response_type_local_JSON = token_grant_type_convertToJSON(oauth_access_token->response_type);
    if(response_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "response_type", response_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // oauth_access_token->scope
    if(oauth_access_token->scope) {
    if(cJSON_AddStringToObject(item, "scope", oauth_access_token->scope) == NULL) {
    goto fail; //String
    }
    }


    // oauth_access_token->token_type
    if (!oauth_access_token->token_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "token_type", oauth_access_token->token_type) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

oauth_access_token_t *oauth_access_token_parseFromJSON(cJSON *oauth_access_tokenJSON){

    oauth_access_token_t *oauth_access_token_local_var = NULL;

    char *access_token_local_str = NULL;

    // define the local variable for oauth_access_token->expires_in
    int *expires_in_local_var = NULL;

    char *refresh_token_local_str = NULL;

    // define the local variable for oauth_access_token->refresh_token_expires_at
    int *refresh_token_expires_at_local_var = NULL;

    // define the local variable for oauth_access_token->refresh_token_expires_in
    int *refresh_token_expires_in_local_var = NULL;

    // define the local variable for oauth_access_token->response_type
    token_grant_type_t *response_type_local_nonprim = NULL;

    char *scope_local_str = NULL;

    char *token_type_local_str = NULL;

    // oauth_access_token->access_token
    cJSON *access_token = cJSON_GetObjectItemCaseSensitive(oauth_access_tokenJSON, "access_token");
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

    // oauth_access_token->expires_in
    cJSON *expires_in = cJSON_GetObjectItemCaseSensitive(oauth_access_tokenJSON, "expires_in");
    if (cJSON_IsNull(expires_in)) {
        expires_in = NULL;
    }
    if (!expires_in) {
        goto end;
    }

    
    if(!cJSON_IsNumber(expires_in))
    {
    goto end; //Numeric
    }
    expires_in_local_var = malloc(sizeof(int));
    if(!expires_in_local_var)
    {
        goto end;
    }
    *expires_in_local_var = expires_in->valuedouble;

    // oauth_access_token->refresh_token
    cJSON *refresh_token = cJSON_GetObjectItemCaseSensitive(oauth_access_tokenJSON, "refresh_token");
    if (cJSON_IsNull(refresh_token)) {
        refresh_token = NULL;
    }
    if (refresh_token) { 
    if(!cJSON_IsString(refresh_token) && !cJSON_IsNull(refresh_token))
    {
    goto end; //String
    }
    }

    // oauth_access_token->refresh_token_expires_at
    cJSON *refresh_token_expires_at = cJSON_GetObjectItemCaseSensitive(oauth_access_tokenJSON, "refresh_token_expires_at");
    if (cJSON_IsNull(refresh_token_expires_at)) {
        refresh_token_expires_at = NULL;
    }
    if (refresh_token_expires_at) { 
    if(!cJSON_IsNumber(refresh_token_expires_at))
    {
    goto end; //Numeric
    }
    refresh_token_expires_at_local_var = malloc(sizeof(int));
    if(!refresh_token_expires_at_local_var)
    {
        goto end;
    }
    *refresh_token_expires_at_local_var = refresh_token_expires_at->valuedouble;
    }

    // oauth_access_token->refresh_token_expires_in
    cJSON *refresh_token_expires_in = cJSON_GetObjectItemCaseSensitive(oauth_access_tokenJSON, "refresh_token_expires_in");
    if (cJSON_IsNull(refresh_token_expires_in)) {
        refresh_token_expires_in = NULL;
    }
    if (refresh_token_expires_in) { 
    if(!cJSON_IsNumber(refresh_token_expires_in))
    {
    goto end; //Numeric
    }
    refresh_token_expires_in_local_var = malloc(sizeof(int));
    if(!refresh_token_expires_in_local_var)
    {
        goto end;
    }
    *refresh_token_expires_in_local_var = refresh_token_expires_in->valuedouble;
    }

    // oauth_access_token->response_type
    cJSON *response_type = cJSON_GetObjectItemCaseSensitive(oauth_access_tokenJSON, "response_type");
    if (cJSON_IsNull(response_type)) {
        response_type = NULL;
    }
    if (response_type) { 
    response_type_local_nonprim = token_grant_type_parseFromJSON(response_type); //custom
    }

    // oauth_access_token->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(oauth_access_tokenJSON, "scope");
    if (cJSON_IsNull(scope)) {
        scope = NULL;
    }
    if (scope) { 
    if(!cJSON_IsString(scope) && !cJSON_IsNull(scope))
    {
    goto end; //String
    }
    }

    // oauth_access_token->token_type
    cJSON *token_type = cJSON_GetObjectItemCaseSensitive(oauth_access_tokenJSON, "token_type");
    if (cJSON_IsNull(token_type)) {
        token_type = NULL;
    }
    if (!token_type) {
        goto end;
    }

    
    if(!cJSON_IsString(token_type))
    {
    goto end; //String
    }


    if (access_token && !cJSON_IsNull(access_token)) access_token_local_str = strdup(access_token->valuestring);
    if (refresh_token && !cJSON_IsNull(refresh_token)) refresh_token_local_str = strdup(refresh_token->valuestring);
    if (scope && !cJSON_IsNull(scope)) scope_local_str = strdup(scope->valuestring);
    if (token_type && !cJSON_IsNull(token_type)) token_type_local_str = strdup(token_type->valuestring);

    oauth_access_token_local_var = oauth_access_token_create_internal (
        access_token_local_str,
        expires_in_local_var,
        refresh_token_local_str,
        refresh_token_expires_at_local_var,
        refresh_token_expires_in_local_var,
        response_type ? response_type_local_nonprim : NULL,
        scope_local_str,
        token_type_local_str
        );

    if (!oauth_access_token_local_var) {
        goto end;
    }

    return oauth_access_token_local_var;
end:
    if (access_token_local_str) {
        free(access_token_local_str);
        access_token_local_str = NULL;
    }
    if (expires_in_local_var) {
        free(expires_in_local_var);
        expires_in_local_var = NULL;
    }
    if (refresh_token_local_str) {
        free(refresh_token_local_str);
        refresh_token_local_str = NULL;
    }
    if (refresh_token_expires_at_local_var) {
        free(refresh_token_expires_at_local_var);
        refresh_token_expires_at_local_var = NULL;
    }
    if (refresh_token_expires_in_local_var) {
        free(refresh_token_expires_in_local_var);
        refresh_token_expires_in_local_var = NULL;
    }
    if (response_type_local_nonprim) {
        token_grant_type_free(response_type_local_nonprim);
        response_type_local_nonprim = NULL;
    }
    if (scope_local_str) {
        free(scope_local_str);
        scope_local_str = NULL;
    }
    if (token_type_local_str) {
        free(token_type_local_str);
        token_type_local_str = NULL;
    }
    return NULL;

}
