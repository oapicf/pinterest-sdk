#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "TermsOfServiceAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Get terms of service
//
// Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
//
terms_of_service_t*
TermsOfServiceAPI_termsOfServiceGet(apiClient_t *apiClient, char *ad_account_id, int *include_html, char *tos_type)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/terms_of_service");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    char *keyQuery_include_html = NULL;
    char * valueQuery_include_html = NULL;
    keyValuePair_t *keyPairQuery_include_html = 0;
    if (include_html)
    {
        keyQuery_include_html = strdup("include_html");
        valueQuery_include_html = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_html, MAX_NUMBER_LENGTH, "%d", *include_html);
        keyPairQuery_include_html = keyValuePair_create(keyQuery_include_html, valueQuery_include_html);
        list_addElement(localVarQueryParameters,keyPairQuery_include_html);
    }

    // query parameters
    char *keyQuery_tos_type = NULL;
    char * valueQuery_tos_type = NULL;
    keyValuePair_t *keyPairQuery_tos_type = 0;
    if (tos_type)
    {
        keyQuery_tos_type = strdup("tos_type");
        valueQuery_tos_type = strdup((tos_type));
        keyPairQuery_tos_type = keyValuePair_create(keyQuery_tos_type, valueQuery_tos_type);
        list_addElement(localVarQueryParameters,keyPairQuery_tos_type);
    }
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
                    "GET");

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
    terms_of_service_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *TermsOfServiceAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = terms_of_service_parseFromJSON(TermsOfServiceAPIlocalVarJSON);
        cJSON_Delete(TermsOfServiceAPIlocalVarJSON);
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
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if(keyQuery_include_html){
        free(keyQuery_include_html);
        keyQuery_include_html = NULL;
    }
    if(valueQuery_include_html){
        free(valueQuery_include_html);
        valueQuery_include_html = NULL;
    }
    if(keyPairQuery_include_html){
        keyValuePair_free(keyPairQuery_include_html);
        keyPairQuery_include_html = NULL;
    }
    if(keyQuery_tos_type){
        free(keyQuery_tos_type);
        keyQuery_tos_type = NULL;
    }
    if(valueQuery_tos_type){
        free(valueQuery_tos_type);
        valueQuery_tos_type = NULL;
    }
    if(keyPairQuery_tos_type){
        keyValuePair_free(keyPairQuery_tos_type);
        keyPairQuery_tos_type = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

