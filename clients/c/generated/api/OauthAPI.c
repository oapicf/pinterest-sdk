#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "OauthAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum GRANTTYPE for OauthAPI_oauthToken

static char* oauthToken_GRANTTYPE_ToString(pinterest_rest_api_oauthToken_grant_type_e GRANTTYPE){
    char *GRANTTYPEArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    return GRANTTYPEArray[GRANTTYPE];
}

static pinterest_rest_api_oauthToken_grant_type_e oauthToken_GRANTTYPE_FromString(char* GRANTTYPE){
    int stringToReturn = 0;
    char *GRANTTYPEArray[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    size_t sizeofArray = sizeof(GRANTTYPEArray) / sizeof(GRANTTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GRANTTYPE, GRANTTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function oauthToken_GRANTTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *oauthToken_GRANTTYPE_convertToJSON(pinterest_rest_api_oauthToken_grant_type_e GRANTTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "grant_type", oauthToken_GRANTTYPE_ToString(GRANTTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function oauthToken_GRANTTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_oauthToken_grant_type_e oauthToken_GRANTTYPE_parseFromJSON(cJSON* GRANTTYPEJSON) {
    pinterest_rest_api_oauthToken_grant_type_e GRANTTYPEVariable = 0;
    cJSON *GRANTTYPEVar = cJSON_GetObjectItemCaseSensitive(GRANTTYPEJSON, "grant_type");
    if(!cJSON_IsString(GRANTTYPEVar) || (GRANTTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    GRANTTYPEVariable = oauthToken_GRANTTYPE_FromString(GRANTTYPEVar->valuestring);
    return GRANTTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum TOKENTYPEHINT for OauthAPI_tokenRevoke

static char* tokenRevoke_TOKENTYPEHINT_ToString(pinterest_rest_api_tokenRevoke_token_type_hint_e TOKENTYPEHINT){
    char *TOKENTYPEHINTArray[] =  { "NULL", "access_token", "refresh_token" };
    return TOKENTYPEHINTArray[TOKENTYPEHINT];
}

static pinterest_rest_api_tokenRevoke_token_type_hint_e tokenRevoke_TOKENTYPEHINT_FromString(char* TOKENTYPEHINT){
    int stringToReturn = 0;
    char *TOKENTYPEHINTArray[] =  { "NULL", "access_token", "refresh_token" };
    size_t sizeofArray = sizeof(TOKENTYPEHINTArray) / sizeof(TOKENTYPEHINTArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(TOKENTYPEHINT, TOKENTYPEHINTArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function tokenRevoke_TOKENTYPEHINT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *tokenRevoke_TOKENTYPEHINT_convertToJSON(pinterest_rest_api_tokenRevoke_token_type_hint_e TOKENTYPEHINT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "token_type_hint", tokenRevoke_TOKENTYPEHINT_ToString(TOKENTYPEHINT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function tokenRevoke_TOKENTYPEHINT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_tokenRevoke_token_type_hint_e tokenRevoke_TOKENTYPEHINT_parseFromJSON(cJSON* TOKENTYPEHINTJSON) {
    pinterest_rest_api_tokenRevoke_token_type_hint_e TOKENTYPEHINTVariable = 0;
    cJSON *TOKENTYPEHINTVar = cJSON_GetObjectItemCaseSensitive(TOKENTYPEHINTJSON, "token_type_hint");
    if(!cJSON_IsString(TOKENTYPEHINTVar) || (TOKENTYPEHINTVar->valuestring == NULL))
    {
        goto end;
    }
    TOKENTYPEHINTVariable = tokenRevoke_TOKENTYPEHINT_FromString(TOKENTYPEHINTVar->valuestring);
    return TOKENTYPEHINTVariable;
end:
    return 0;
}
*/


// Generate OAuth access token for conversion API
//
// Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
//
conversion_access_token_response_t*
OauthAPI_oauthConversionToken(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/oauth/conversion_token");




    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    conversion_access_token_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *OauthAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = conversion_access_token_response_parseFromJSON(OauthAPIlocalVarJSON);
        cJSON_Delete(OauthAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Generate OAuth access token
//
// Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
//
oauth_access_token_response_t*
OauthAPI_oauthToken(apiClient_t *apiClient, pinterest_rest_api_oauthToken_grant_type_e grant_type)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/oauth/token");





    // form parameters
    char *keyForm_grant_type = NULL;
    pinterest_rest_api_oauthToken_grant_type_e valueForm_grant_type = 0;
    keyValuePair_t *keyPairForm_grant_type = 0;
    if (grant_type != 0)
    {
        keyForm_grant_type = strdup("grant_type");
        valueForm_grant_type = (grant_type);
        keyPairForm_grant_type = keyValuePair_create(keyForm_grant_type,(void *)valueForm_grant_type);
        list_addElement(localVarFormParameters,keyPairForm_grant_type);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/x-www-form-urlencoded"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    oauth_access_token_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *OauthAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = oauth_access_token_response_parseFromJSON(OauthAPIlocalVarJSON);
        cJSON_Delete(OauthAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (keyForm_grant_type) {
        free(keyForm_grant_type);
        keyForm_grant_type = NULL;
    }
    if (valueForm_grant_type) {
        valueForm_grant_type = 0;
    }
    free(keyPairForm_grant_type);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Revoke a token
//
// Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
//
void
OauthAPI_tokenRevoke(apiClient_t *apiClient, char *token, pinterest_rest_api_tokenRevoke_token_type_hint_e token_type_hint)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/oauth/token/revoke");





    // form parameters
    char *keyForm_token = NULL;
    char * valueForm_token = 0;
    keyValuePair_t *keyPairForm_token = 0;
    if (token != NULL)
    {
        keyForm_token = strdup("token");
        valueForm_token = strdup((token));
        keyPairForm_token = keyValuePair_create(keyForm_token,valueForm_token);
        list_addElement(localVarFormParameters,keyPairForm_token);
    }

    // form parameters
    char *keyForm_token_type_hint = NULL;
    pinterest_rest_api_tokenRevoke_token_type_hint_e valueForm_token_type_hint = 0;
    keyValuePair_t *keyPairForm_token_type_hint = 0;
    if (token_type_hint != 0)
    {
        keyForm_token_type_hint = strdup("token_type_hint");
        valueForm_token_type_hint = (token_type_hint);
        keyPairForm_token_type_hint = keyValuePair_create(keyForm_token_type_hint,(void *)valueForm_token_type_hint);
        list_addElement(localVarFormParameters,keyPairForm_token_type_hint);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/x-www-form-urlencoded"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Successful token revocation. No content is returned.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Client authentication error.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Client is not allowed to revoke token.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (keyForm_token) {
        free(keyForm_token);
        keyForm_token = NULL;
    }
    if (valueForm_token) {
        free(valueForm_token);
        valueForm_token = NULL;
    }
    keyValuePair_free(keyPairForm_token);
    if (keyForm_token_type_hint) {
        free(keyForm_token_type_hint);
        keyForm_token_type_hint = NULL;
    }
    if (valueForm_token_type_hint) {
        free(valueForm_token_type_hint);
        valueForm_token_type_hint = NULL;
    }
    keyValuePair_free(keyPairForm_token_type_hint);

}

