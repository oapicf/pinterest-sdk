#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "OauthAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

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


// Generate OAuth access token
//
// Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication-and-scopes/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  <strong>Grant type <i>client_credentials</i> and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.</strong>
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

    // create the path
    long sizeOfPath = strlen("/oauth/token")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/oauth/token");




    // form parameters
    char *keyForm_grant_type = NULL;
    pinterest_rest_api_oauthToken_grant_type_e valueForm_grant_type = 0;
    keyValuePair_t *keyPairForm_grant_type = 0;
    if (grant_type != NULL)
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
    cJSON *OauthAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    oauth_access_token_response_t *elementToReturn = oauth_access_token_response_parseFromJSON(OauthAPIlocalVarJSON);
    cJSON_Delete(OauthAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
        free(valueForm_grant_type);
        valueForm_grant_type = NULL;
    }
    free(keyPairForm_grant_type);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

