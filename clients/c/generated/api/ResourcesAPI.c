#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "ResourcesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for ResourcesAPI_deliveryMetricsGet

static char* deliveryMetricsGet__ToString(pinterest_rest_api_deliveryMetricsGet_report_type_e ){
    char *Array[] =  { "NULL", "SYNC", "ASYNC" };
    return Array[];
}

static pinterest_rest_api_deliveryMetricsGet_report_type_e deliveryMetricsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "SYNC", "ASYNC" };
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
// Function deliveryMetricsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *deliveryMetricsGet__convertToJSON(pinterest_rest_api_deliveryMetricsGet_report_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function deliveryMetricsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_deliveryMetricsGet_report_type_e deliveryMetricsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_deliveryMetricsGet_report_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ResourcesAPI_targetingOptionsGet

static char* targetingOptionsGet__ToString(pinterest_rest_api_targetingOptionsGet_targeting_type_e ){
    char *Array[] =  { "NULL", "APPTYPE", "GENDER", "LOCALE", "AGE_BUCKET", "LOCATION", "GEO", "INTEREST", "KEYWORD", "AUDIENCE_INCLUDE", "AUDIENCE_EXCLUDE" };
    return Array[];
}

static pinterest_rest_api_targetingOptionsGet_targeting_type_e targetingOptionsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "APPTYPE", "GENDER", "LOCALE", "AGE_BUCKET", "LOCATION", "GEO", "INTEREST", "KEYWORD", "AUDIENCE_INCLUDE", "AUDIENCE_EXCLUDE" };
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
// Function targetingOptionsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *targetingOptionsGet__convertToJSON(pinterest_rest_api_targetingOptionsGet_targeting_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function targetingOptionsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_targetingOptionsGet_targeting_type_e targetingOptionsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_targetingOptionsGet_targeting_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Get ad accounts countries
//
// Get Ad Accounts countries
//
ad_account_countries_get_200_response_t*
ResourcesAPI_adAccountCountriesGet(apiClient_t *apiClient)
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
    char *localVarPath = strdup("/resources/ad_account_countries");




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
    ad_account_countries_get_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_account_countries_get_200_response_parseFromJSON(ResourcesAPIlocalVarJSON);
        cJSON_Delete(ResourcesAPIlocalVarJSON);
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

// Get available metrics' definitions
//
// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
//
delivery_metrics_get_200_response_t*
ResourcesAPI_deliveryMetricsGet(apiClient_t *apiClient, report_type_e report_type)
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
    char *localVarPath = strdup("/resources/delivery_metrics");





    // query parameters
    char *keyQuery_report_type = NULL;
    report_type_e valueQuery_report_type ;
    keyValuePair_t *keyPairQuery_report_type = 0;
    if (report_type)
    {
        keyQuery_report_type = strdup("report_type");
        valueQuery_report_type = (report_type);
        keyPairQuery_report_type = keyValuePair_create(keyQuery_report_type, strdup(deliveryMetricsGet__ToString(
        &valueQuery_report_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_report_type);
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
    delivery_metrics_get_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delivery_metrics_get_200_response_parseFromJSON(ResourcesAPIlocalVarJSON);
        cJSON_Delete(ResourcesAPIlocalVarJSON);
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
    if(keyQuery_report_type){
        free(keyQuery_report_type);
        keyQuery_report_type = NULL;
    }
    if(keyPairQuery_report_type){
        keyValuePair_free(keyPairQuery_report_type);
        keyPairQuery_report_type = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get interest details
//
// Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
//
single_interest_targeting_option_t*
ResourcesAPI_interestTargetingOptionsGet(apiClient_t *apiClient, char *interest_id)
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
    char *localVarPath = strdup("/resources/targeting/interests/{interest_id}");

    if(!interest_id)
        goto end;


    // Path Params
    long sizeOfPathParams_interest_id = strlen(interest_id)+3 + sizeof("{ interest_id }") - 1;
    if(interest_id == NULL) {
        goto end;
    }
    char* localVarToReplace_interest_id = malloc(sizeOfPathParams_interest_id);
    sprintf(localVarToReplace_interest_id, "{%s}", "interest_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_interest_id, interest_id);


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
    single_interest_targeting_option_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = single_interest_targeting_option_parseFromJSON(ResourcesAPIlocalVarJSON);
        cJSON_Delete(ResourcesAPIlocalVarJSON);
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
    free(localVarToReplace_interest_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get lead form questions
//
// Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
void
ResourcesAPI_leadFormQuestionsGet(apiClient_t *apiClient)
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
    char *localVarPath = strdup("/resources/lead_form_questions");




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
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);

}

// Get metrics ready state
//
// Learn whether conversion or non-conversion metrics are finalized and ready to query.
//
book_closed_t*
ResourcesAPI_metricsReadyStateGet(apiClient_t *apiClient, char *date)
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
    char *localVarPath = strdup("/resources/metrics_ready_state");





    // query parameters
    char *keyQuery_date = NULL;
    char * valueQuery_date = NULL;
    keyValuePair_t *keyPairQuery_date = 0;
    if (date)
    {
        keyQuery_date = strdup("date");
        valueQuery_date = strdup((date));
        keyPairQuery_date = keyValuePair_create(keyQuery_date, valueQuery_date);
        list_addElement(localVarQueryParameters,keyPairQuery_date);
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
    book_closed_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = book_closed_parseFromJSON(ResourcesAPIlocalVarJSON);
        cJSON_Delete(ResourcesAPIlocalVarJSON);
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
    if(keyQuery_date){
        free(keyQuery_date);
        keyQuery_date = NULL;
    }
    if(valueQuery_date){
        free(valueQuery_date);
        valueQuery_date = NULL;
    }
    if(keyPairQuery_date){
        keyValuePair_free(keyPairQuery_date);
        keyPairQuery_date = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get targeting options
//
//     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
//
list_t*
ResourcesAPI_targetingOptionsGet(apiClient_t *apiClient, public_targeting_type_e targeting_type, char *ad_account_id, char *client_id, char *oauth_signature, char *timestamp)
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
    char *localVarPath = strdup("/resources/targeting/{targeting_type}");



    // Path Params
    long sizeOfPathParams_targeting_type =  + sizeof("{ targeting_type }") - 1;



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // query parameters
    char *keyQuery_client_id = NULL;
    char * valueQuery_client_id = NULL;
    keyValuePair_t *keyPairQuery_client_id = 0;
    if (client_id)
    {
        keyQuery_client_id = strdup("client_id");
        valueQuery_client_id = strdup((client_id));
        keyPairQuery_client_id = keyValuePair_create(keyQuery_client_id, valueQuery_client_id);
        list_addElement(localVarQueryParameters,keyPairQuery_client_id);
    }

    // query parameters
    char *keyQuery_oauth_signature = NULL;
    char * valueQuery_oauth_signature = NULL;
    keyValuePair_t *keyPairQuery_oauth_signature = 0;
    if (oauth_signature)
    {
        keyQuery_oauth_signature = strdup("oauth_signature");
        valueQuery_oauth_signature = strdup((oauth_signature));
        keyPairQuery_oauth_signature = keyValuePair_create(keyQuery_oauth_signature, valueQuery_oauth_signature);
        list_addElement(localVarQueryParameters,keyPairQuery_oauth_signature);
    }

    // query parameters
    char *keyQuery_timestamp = NULL;
    char * valueQuery_timestamp = NULL;
    keyValuePair_t *keyPairQuery_timestamp = 0;
    if (timestamp)
    {
        keyQuery_timestamp = strdup("timestamp");
        valueQuery_timestamp = strdup((timestamp));
        keyPairQuery_timestamp = keyValuePair_create(keyQuery_timestamp, valueQuery_timestamp);
        list_addElement(localVarQueryParameters,keyPairQuery_timestamp);
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
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(ResourcesAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, ResourcesAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( ResourcesAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
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
    free(localVarToReplace_targeting_type);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_client_id){
        free(keyQuery_client_id);
        keyQuery_client_id = NULL;
    }
    if(valueQuery_client_id){
        free(valueQuery_client_id);
        valueQuery_client_id = NULL;
    }
    if(keyPairQuery_client_id){
        keyValuePair_free(keyPairQuery_client_id);
        keyPairQuery_client_id = NULL;
    }
    if(keyQuery_oauth_signature){
        free(keyQuery_oauth_signature);
        keyQuery_oauth_signature = NULL;
    }
    if(valueQuery_oauth_signature){
        free(valueQuery_oauth_signature);
        valueQuery_oauth_signature = NULL;
    }
    if(keyPairQuery_oauth_signature){
        keyValuePair_free(keyPairQuery_oauth_signature);
        keyPairQuery_oauth_signature = NULL;
    }
    if(keyQuery_timestamp){
        free(keyQuery_timestamp);
        keyQuery_timestamp = NULL;
    }
    if(valueQuery_timestamp){
        free(valueQuery_timestamp);
        valueQuery_timestamp = NULL;
    }
    if(keyPairQuery_timestamp){
        keyValuePair_free(keyPairQuery_timestamp);
        keyPairQuery_timestamp = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

