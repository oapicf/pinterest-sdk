#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "ConversionEventsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Send conversions
//
// The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
//
conversion_events_t*
ConversionEventsAPI_eventsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_events_create_t *conversion_events_create, int *test)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/events");

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
    char *keyQuery_test = NULL;
    char * valueQuery_test = NULL;
    keyValuePair_t *keyPairQuery_test = 0;
    if (test)
    {
        keyQuery_test = strdup("test");
        valueQuery_test = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_test, MAX_NUMBER_LENGTH, "%d", *test);
        keyPairQuery_test = keyValuePair_create(keyQuery_test, valueQuery_test);
        list_addElement(localVarQueryParameters,keyPairQuery_test);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_conversion_events_create = NULL;
    if (conversion_events_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_conversion_events_create = conversion_events_create_convertToJSON(conversion_events_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_conversion_events_create);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
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
    //if (apiClient->response_code == 422) {
    //    printf("%s\n","The request was well-formed but was unable to be followed due to semantic errors.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 503) {
    //    printf("%s\n","The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    conversion_events_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ConversionEventsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = conversion_events_parseFromJSON(ConversionEventsAPIlocalVarJSON);
        cJSON_Delete(ConversionEventsAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if (localVarSingleItemJSON_conversion_events_create) {
        cJSON_Delete(localVarSingleItemJSON_conversion_events_create);
        localVarSingleItemJSON_conversion_events_create = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_test){
        free(keyQuery_test);
        keyQuery_test = NULL;
    }
    if(valueQuery_test){
        free(valueQuery_test);
        valueQuery_test = NULL;
    }
    if(keyPairQuery_test){
        keyValuePair_free(keyPairQuery_test);
        keyPairQuery_test = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

