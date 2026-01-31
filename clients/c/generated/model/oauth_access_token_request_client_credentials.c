#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "oauth_access_token_request_client_credentials.h"


char* oauth_access_token_request_client_credentials_grant_type_ToString(pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e grant_type) {
    char* grant_typeArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    return grant_typeArray[grant_type];
}

pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e oauth_access_token_request_client_credentials_grant_type_FromString(char* grant_type){
    int stringToReturn = 0;
    char *grant_typeArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    size_t sizeofArray = sizeof(grant_typeArray) / sizeof(grant_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(grant_type, grant_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials_create_internal(
    char *scope,
    pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e grant_type
    ) {
    oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials_local_var = malloc(sizeof(oauth_access_token_request_client_credentials_t));
    if (!oauth_access_token_request_client_credentials_local_var) {
        return NULL;
    }
    oauth_access_token_request_client_credentials_local_var->scope = scope;
    oauth_access_token_request_client_credentials_local_var->grant_type = grant_type;

    oauth_access_token_request_client_credentials_local_var->_library_owned = 1;
    return oauth_access_token_request_client_credentials_local_var;
}

__attribute__((deprecated)) oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials_create(
    char *scope,
    pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e grant_type
    ) {
    return oauth_access_token_request_client_credentials_create_internal (
        scope,
        grant_type
        );
}

void oauth_access_token_request_client_credentials_free(oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials) {
    if(NULL == oauth_access_token_request_client_credentials){
        return ;
    }
    if(oauth_access_token_request_client_credentials->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "oauth_access_token_request_client_credentials_free");
        return ;
    }
    listEntry_t *listEntry;
    if (oauth_access_token_request_client_credentials->scope) {
        free(oauth_access_token_request_client_credentials->scope);
        oauth_access_token_request_client_credentials->scope = NULL;
    }
    free(oauth_access_token_request_client_credentials);
}

cJSON *oauth_access_token_request_client_credentials_convertToJSON(oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials) {
    cJSON *item = cJSON_CreateObject();

    // oauth_access_token_request_client_credentials->scope
    if (!oauth_access_token_request_client_credentials->scope) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "scope", oauth_access_token_request_client_credentials->scope) == NULL) {
    goto fail; //String
    }


    // oauth_access_token_request_client_credentials->grant_type
    if (pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_NULL == oauth_access_token_request_client_credentials->grant_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "grant_type", oauth_access_token_request_client_credentials_grant_type_ToString(oauth_access_token_request_client_credentials->grant_type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials_parseFromJSON(cJSON *oauth_access_token_request_client_credentialsJSON){

    oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials_local_var = NULL;

    // oauth_access_token_request_client_credentials->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_client_credentialsJSON, "scope");
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

    // oauth_access_token_request_client_credentials->grant_type
    cJSON *grant_type = cJSON_GetObjectItemCaseSensitive(oauth_access_token_request_client_credentialsJSON, "grant_type");
    if (cJSON_IsNull(grant_type)) {
        grant_type = NULL;
    }
    if (!grant_type) {
        goto end;
    }

    pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e grant_typeVariable;
    
    if(!cJSON_IsString(grant_type))
    {
    goto end; //Enum
    }
    grant_typeVariable = oauth_access_token_request_client_credentials_grant_type_FromString(grant_type->valuestring);


    oauth_access_token_request_client_credentials_local_var = oauth_access_token_request_client_credentials_create_internal (
        strdup(scope->valuestring),
        grant_typeVariable
        );

    return oauth_access_token_request_client_credentials_local_var;
end:
    return NULL;

}
