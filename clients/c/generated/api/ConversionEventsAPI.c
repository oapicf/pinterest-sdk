#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "ConversionEventsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Send conversions
//
// The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
//
conversion_api_response_t*
ConversionEventsAPI_eventsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_events_t *conversion_events, int *test)
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
    cJSON *localVarSingleItemJSON_conversion_events = NULL;
    if (conversion_events != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_conversion_events = conversion_events_convertToJSON(conversion_events);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_conversion_events);
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
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request was invalid.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Not authorized to send conversion events");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Unauthorized access.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 422) {
    //    printf("%s\n","Not all events were successfully processed.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 503) {
    //    printf("%s\n","The endpoint has been ramped down and is currently not accepting any traffic.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected errors");
    //}
    //nonprimitive not container
    conversion_api_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ConversionEventsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = conversion_api_response_parseFromJSON(ConversionEventsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_conversion_events) {
        cJSON_Delete(localVarSingleItemJSON_conversion_events);
        localVarSingleItemJSON_conversion_events = NULL;
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

