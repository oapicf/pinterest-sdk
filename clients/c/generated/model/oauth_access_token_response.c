#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "oauth_access_token_response.h"


char* oauth_access_token_response_response_type_ToString(pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e response_type) {
    char* response_typeArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    return response_typeArray[response_type];
}

pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e oauth_access_token_response_response_type_FromString(char* response_type){
    int stringToReturn = 0;
    char *response_typeArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    size_t sizeofArray = sizeof(response_typeArray) / sizeof(response_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(response_type, response_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static oauth_access_token_response_t *oauth_access_token_response_create_internal(
    char *access_token,
    int expires_in,
    pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e response_type,
    char *scope,
    char *token_type
    ) {
    oauth_access_token_response_t *oauth_access_token_response_local_var = malloc(sizeof(oauth_access_token_response_t));
    if (!oauth_access_token_response_local_var) {
        return NULL;
    }
    oauth_access_token_response_local_var->access_token = access_token;
    oauth_access_token_response_local_var->expires_in = expires_in;
    oauth_access_token_response_local_var->response_type = response_type;
    oauth_access_token_response_local_var->scope = scope;
    oauth_access_token_response_local_var->token_type = token_type;

    oauth_access_token_response_local_var->_library_owned = 1;
    return oauth_access_token_response_local_var;
}

__attribute__((deprecated)) oauth_access_token_response_t *oauth_access_token_response_create(
    char *access_token,
    int expires_in,
    pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e response_type,
    char *scope,
    char *token_type
    ) {
    return oauth_access_token_response_create_internal (
        access_token,
        expires_in,
        response_type,
        scope,
        token_type
        );
}

void oauth_access_token_response_free(oauth_access_token_response_t *oauth_access_token_response) {
    if(NULL == oauth_access_token_response){
        return ;
    }
    if(oauth_access_token_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "oauth_access_token_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (oauth_access_token_response->access_token) {
        free(oauth_access_token_response->access_token);
        oauth_access_token_response->access_token = NULL;
    }
    if (oauth_access_token_response->scope) {
        free(oauth_access_token_response->scope);
        oauth_access_token_response->scope = NULL;
    }
    if (oauth_access_token_response->token_type) {
        free(oauth_access_token_response->token_type);
        oauth_access_token_response->token_type = NULL;
    }
    free(oauth_access_token_response);
}

cJSON *oauth_access_token_response_convertToJSON(oauth_access_token_response_t *oauth_access_token_response) {
    cJSON *item = cJSON_CreateObject();

    // oauth_access_token_response->access_token
    if (!oauth_access_token_response->access_token) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "access_token", oauth_access_token_response->access_token) == NULL) {
    goto fail; //String
    }


    // oauth_access_token_response->expires_in
    if (!oauth_access_token_response->expires_in) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_in", oauth_access_token_response->expires_in) == NULL) {
    goto fail; //Numeric
    }


    // oauth_access_token_response->response_type
    if(oauth_access_token_response->response_type != pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_NULL) {
    if(cJSON_AddStringToObject(item, "response_type", oauth_access_token_response_response_type_ToString(oauth_access_token_response->response_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // oauth_access_token_response->scope
    if (!oauth_access_token_response->scope) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "scope", oauth_access_token_response->scope) == NULL) {
    goto fail; //String
    }


    // oauth_access_token_response->token_type
    if (!oauth_access_token_response->token_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "token_type", oauth_access_token_response->token_type) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

oauth_access_token_response_t *oauth_access_token_response_parseFromJSON(cJSON *oauth_access_token_responseJSON){

    oauth_access_token_response_t *oauth_access_token_response_local_var = NULL;

    // oauth_access_token_response->access_token
    cJSON *access_token = cJSON_GetObjectItemCaseSensitive(oauth_access_token_responseJSON, "access_token");
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

    // oauth_access_token_response->expires_in
    cJSON *expires_in = cJSON_GetObjectItemCaseSensitive(oauth_access_token_responseJSON, "expires_in");
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

    // oauth_access_token_response->response_type
    cJSON *response_type = cJSON_GetObjectItemCaseSensitive(oauth_access_token_responseJSON, "response_type");
    if (cJSON_IsNull(response_type)) {
        response_type = NULL;
    }
    pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e response_typeVariable;
    if (response_type) { 
    if(!cJSON_IsString(response_type))
    {
    goto end; //Enum
    }
    response_typeVariable = oauth_access_token_response_response_type_FromString(response_type->valuestring);
    }

    // oauth_access_token_response->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(oauth_access_token_responseJSON, "scope");
    if (cJSON_IsNull(scope)) {
        scope = NULL;
    }
    if (!scope) {
        goto end;
    }

    
    if(!cJSON_IsString(scope))
    {
    goto end; //String
    }

    // oauth_access_token_response->token_type
    cJSON *token_type = cJSON_GetObjectItemCaseSensitive(oauth_access_token_responseJSON, "token_type");
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


    oauth_access_token_response_local_var = oauth_access_token_response_create_internal (
        strdup(access_token->valuestring),
        expires_in->valuedouble,
        response_type ? response_typeVariable : pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_NULL,
        strdup(scope->valuestring),
        strdup(token_type->valuestring)
        );

    return oauth_access_token_response_local_var;
end:
    return NULL;

}
