#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "oauth_access_token_response_client_credentials.h"


char* oauth_access_token_response_client_credentials_response_type_ToString(pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e response_type) {
    char* response_typeArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    return response_typeArray[response_type];
}

pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e oauth_access_token_response_client_credentials_response_type_FromString(char* response_type){
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

oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials_create(
    pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e response_type,
    char *access_token,
    char *token_type,
    int expires_in,
    char *scope
    ) {
    oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials_local_var = malloc(sizeof(oauth_access_token_response_client_credentials_t));
    if (!oauth_access_token_response_client_credentials_local_var) {
        return NULL;
    }
    oauth_access_token_response_client_credentials_local_var->response_type = response_type;
    oauth_access_token_response_client_credentials_local_var->access_token = access_token;
    oauth_access_token_response_client_credentials_local_var->token_type = token_type;
    oauth_access_token_response_client_credentials_local_var->expires_in = expires_in;
    oauth_access_token_response_client_credentials_local_var->scope = scope;

    return oauth_access_token_response_client_credentials_local_var;
}


void oauth_access_token_response_client_credentials_free(oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials) {
    if(NULL == oauth_access_token_response_client_credentials){
        return ;
    }
    listEntry_t *listEntry;
    if (oauth_access_token_response_client_credentials->access_token) {
        free(oauth_access_token_response_client_credentials->access_token);
        oauth_access_token_response_client_credentials->access_token = NULL;
    }
    if (oauth_access_token_response_client_credentials->token_type) {
        free(oauth_access_token_response_client_credentials->token_type);
        oauth_access_token_response_client_credentials->token_type = NULL;
    }
    if (oauth_access_token_response_client_credentials->scope) {
        free(oauth_access_token_response_client_credentials->scope);
        oauth_access_token_response_client_credentials->scope = NULL;
    }
    free(oauth_access_token_response_client_credentials);
}

cJSON *oauth_access_token_response_client_credentials_convertToJSON(oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials) {
    cJSON *item = cJSON_CreateObject();

    // oauth_access_token_response_client_credentials->response_type
    if(oauth_access_token_response_client_credentials->response_type != pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_NULL) {
    if(cJSON_AddStringToObject(item, "response_type", response_typeoauth_access_token_response_client_credentials_ToString(oauth_access_token_response_client_credentials->response_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // oauth_access_token_response_client_credentials->access_token
    if (!oauth_access_token_response_client_credentials->access_token) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "access_token", oauth_access_token_response_client_credentials->access_token) == NULL) {
    goto fail; //String
    }


    // oauth_access_token_response_client_credentials->token_type
    if (!oauth_access_token_response_client_credentials->token_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "token_type", oauth_access_token_response_client_credentials->token_type) == NULL) {
    goto fail; //String
    }


    // oauth_access_token_response_client_credentials->expires_in
    if (!oauth_access_token_response_client_credentials->expires_in) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_in", oauth_access_token_response_client_credentials->expires_in) == NULL) {
    goto fail; //Numeric
    }


    // oauth_access_token_response_client_credentials->scope
    if (!oauth_access_token_response_client_credentials->scope) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "scope", oauth_access_token_response_client_credentials->scope) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials_parseFromJSON(cJSON *oauth_access_token_response_client_credentialsJSON){

    oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials_local_var = NULL;

    // oauth_access_token_response_client_credentials->response_type
    cJSON *response_type = cJSON_GetObjectItemCaseSensitive(oauth_access_token_response_client_credentialsJSON, "response_type");
    pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e response_typeVariable;
    if (response_type) { 
    if(!cJSON_IsString(response_type))
    {
    goto end; //Enum
    }
    response_typeVariable = oauth_access_token_response_client_credentials_response_type_FromString(response_type->valuestring);
    }

    // oauth_access_token_response_client_credentials->access_token
    cJSON *access_token = cJSON_GetObjectItemCaseSensitive(oauth_access_token_response_client_credentialsJSON, "access_token");
    if (!access_token) {
        goto end;
    }

    
    if(!cJSON_IsString(access_token))
    {
    goto end; //String
    }

    // oauth_access_token_response_client_credentials->token_type
    cJSON *token_type = cJSON_GetObjectItemCaseSensitive(oauth_access_token_response_client_credentialsJSON, "token_type");
    if (!token_type) {
        goto end;
    }

    
    if(!cJSON_IsString(token_type))
    {
    goto end; //String
    }

    // oauth_access_token_response_client_credentials->expires_in
    cJSON *expires_in = cJSON_GetObjectItemCaseSensitive(oauth_access_token_response_client_credentialsJSON, "expires_in");
    if (!expires_in) {
        goto end;
    }

    
    if(!cJSON_IsNumber(expires_in))
    {
    goto end; //Numeric
    }

    // oauth_access_token_response_client_credentials->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(oauth_access_token_response_client_credentialsJSON, "scope");
    if (!scope) {
        goto end;
    }

    
    if(!cJSON_IsString(scope))
    {
    goto end; //String
    }


    oauth_access_token_response_client_credentials_local_var = oauth_access_token_response_client_credentials_create (
        response_type ? response_typeVariable : pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_NULL,
        strdup(access_token->valuestring),
        strdup(token_type->valuestring),
        expires_in->valuedouble,
        strdup(scope->valuestring)
        );

    return oauth_access_token_response_client_credentials_local_var;
end:
    return NULL;

}
