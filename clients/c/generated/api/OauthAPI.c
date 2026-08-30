#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "OauthAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for OauthAPI_oauthToken

static char* oauthToken__ToString(pinterest_rest_api_oauthToken_grant_type_e ){
    char *Array[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    return Array[];
}

static pinterest_rest_api_oauthToken_grant_type_e oauthToken__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "authorization_code", "refresh_token", "client_credentials" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function oauthToken__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *oauthToken__convertToJSON(pinterest_rest_api_oauthToken_grant_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function oauthToken__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_oauthToken_grant_type_e oauthToken__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_oauthToken_grant_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Generate OAuth access token for conversion API
//
// Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
//
conversion_access_token_t*
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
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    conversion_access_token_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *OauthAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = conversion_access_token_parseFromJSON(OauthAPIlocalVarJSON);
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
// Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
//
oauth_access_token_t*
OauthAPI_oauthToken(apiClient_t *apiClient, token_grant_type_e grant_type, char *code, char *continuous_refresh, char *redirect_uri, char *refresh_token, char *scope)
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
    char *keyForm_code = NULL;
    char * valueForm_code = 0;
    keyValuePair_t *keyPairForm_code = 0;
    if (code != NULL)
    {
        keyForm_code = strdup("code");
        valueForm_code = strdup((code));
        keyPairForm_code = keyValuePair_create(keyForm_code,valueForm_code);
        list_addElement(localVarFormParameters,keyPairForm_code);
    }

    // form parameters
    char *keyForm_continuous_refresh = NULL;
    char * valueForm_continuous_refresh = 0;
    keyValuePair_t *keyPairForm_continuous_refresh = 0;
    if (continuous_refresh != NULL)
    {
        keyForm_continuous_refresh = strdup("continuous_refresh");
        valueForm_continuous_refresh = strdup((continuous_refresh));
        keyPairForm_continuous_refresh = keyValuePair_create(keyForm_continuous_refresh,valueForm_continuous_refresh);
        list_addElement(localVarFormParameters,keyPairForm_continuous_refresh);
    }

    // form parameters
    char *keyForm_grant_type = NULL;
    token_grant_type_e valueForm_grant_type = 0;
    keyValuePair_t *keyPairForm_grant_type = 0;
    if (grant_type != 0)
    {
        keyForm_grant_type = strdup("grant_type");
        valueForm_grant_type = (grant_type);
        keyPairForm_grant_type = keyValuePair_create(keyForm_grant_type,&valueForm_grant_type);
        list_addElement(localVarFormParameters,keyPairForm_grant_type);
    }

    // form parameters
    char *keyForm_redirect_uri = NULL;
    char * valueForm_redirect_uri = 0;
    keyValuePair_t *keyPairForm_redirect_uri = 0;
    if (redirect_uri != NULL)
    {
        keyForm_redirect_uri = strdup("redirect_uri");
        valueForm_redirect_uri = strdup((redirect_uri));
        keyPairForm_redirect_uri = keyValuePair_create(keyForm_redirect_uri,valueForm_redirect_uri);
        list_addElement(localVarFormParameters,keyPairForm_redirect_uri);
    }

    // form parameters
    char *keyForm_refresh_token = NULL;
    char * valueForm_refresh_token = 0;
    keyValuePair_t *keyPairForm_refresh_token = 0;
    if (refresh_token != NULL)
    {
        keyForm_refresh_token = strdup("refresh_token");
        valueForm_refresh_token = strdup((refresh_token));
        keyPairForm_refresh_token = keyValuePair_create(keyForm_refresh_token,valueForm_refresh_token);
        list_addElement(localVarFormParameters,keyPairForm_refresh_token);
    }

    // form parameters
    char *keyForm_scope = NULL;
    char * valueForm_scope = 0;
    keyValuePair_t *keyPairForm_scope = 0;
    if (scope != NULL)
    {
        keyForm_scope = strdup("scope");
        valueForm_scope = strdup((scope));
        keyPairForm_scope = keyValuePair_create(keyForm_scope,valueForm_scope);
        list_addElement(localVarFormParameters,keyPairForm_scope);
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
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 201) {
    //    printf("%s\n","Resource create operation completed successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    oauth_access_token_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *OauthAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = oauth_access_token_parseFromJSON(OauthAPIlocalVarJSON);
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
    if (keyForm_code) {
        free(keyForm_code);
        keyForm_code = NULL;
    }
    if (valueForm_code) {
        free(valueForm_code);
        valueForm_code = NULL;
    }
    free(keyPairForm_code);
    if (keyForm_continuous_refresh) {
        free(keyForm_continuous_refresh);
        keyForm_continuous_refresh = NULL;
    }
    if (valueForm_continuous_refresh) {
        free(valueForm_continuous_refresh);
        valueForm_continuous_refresh = NULL;
    }
    free(keyPairForm_continuous_refresh);
    if (keyForm_grant_type) {
        free(keyForm_grant_type);
        keyForm_grant_type = NULL;
    }
    free(keyPairForm_grant_type);
    if (keyForm_redirect_uri) {
        free(keyForm_redirect_uri);
        keyForm_redirect_uri = NULL;
    }
    if (valueForm_redirect_uri) {
        free(valueForm_redirect_uri);
        valueForm_redirect_uri = NULL;
    }
    free(keyPairForm_redirect_uri);
    if (keyForm_refresh_token) {
        free(keyForm_refresh_token);
        keyForm_refresh_token = NULL;
    }
    if (valueForm_refresh_token) {
        free(valueForm_refresh_token);
        valueForm_refresh_token = NULL;
    }
    free(keyPairForm_refresh_token);
    if (keyForm_scope) {
        free(keyForm_scope);
        keyForm_scope = NULL;
    }
    if (valueForm_scope) {
        free(valueForm_scope);
        valueForm_scope = NULL;
    }
    free(keyPairForm_scope);
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
OauthAPI_tokenRevoke(apiClient_t *apiClient, char *token, token_type_hint)
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
     valueForm_token_type_hint = 0;
    keyValuePair_t *keyPairForm_token_type_hint = 0;
    if (token_type_hint != NULL)
    {
        keyForm_token_type_hint = strdup("token_type_hint");
        valueForm_token_type_hint = (token_type_hint);
        keyPairForm_token_type_hint = keyValuePair_create(keyForm_token_type_hint,&valueForm_token_type_hint);
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
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
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
    free(keyPairForm_token_type_hint);

}

