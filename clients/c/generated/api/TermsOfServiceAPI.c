#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "TermsOfServiceAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


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

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/terms_of_service")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/terms_of_service");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *TermsOfServiceAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    terms_of_service_t *elementToReturn = terms_of_service_parseFromJSON(TermsOfServiceAPIlocalVarJSON);
    cJSON_Delete(TermsOfServiceAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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

