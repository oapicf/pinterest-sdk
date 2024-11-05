#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ResourcesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum REPORTTYPE for ResourcesAPI_deliveryMetricsGet

static char* deliveryMetricsGet_REPORTTYPE_ToString(pinterest_rest_api_deliveryMetricsGet_report_type_e REPORTTYPE){
    char *REPORTTYPEArray[] =  { "NULL", "SYNC", "ASYNC" };
    return REPORTTYPEArray[REPORTTYPE];
}

static pinterest_rest_api_deliveryMetricsGet_report_type_e deliveryMetricsGet_REPORTTYPE_FromString(char* REPORTTYPE){
    int stringToReturn = 0;
    char *REPORTTYPEArray[] =  { "NULL", "SYNC", "ASYNC" };
    size_t sizeofArray = sizeof(REPORTTYPEArray) / sizeof(REPORTTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(REPORTTYPE, REPORTTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function deliveryMetricsGet_REPORTTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *deliveryMetricsGet_REPORTTYPE_convertToJSON(pinterest_rest_api_deliveryMetricsGet_report_type_e REPORTTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "report_type", deliveryMetricsGet_REPORTTYPE_ToString(REPORTTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function deliveryMetricsGet_REPORTTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_deliveryMetricsGet_report_type_e deliveryMetricsGet_REPORTTYPE_parseFromJSON(cJSON* REPORTTYPEJSON) {
    pinterest_rest_api_deliveryMetricsGet_report_type_e REPORTTYPEVariable = 0;
    cJSON *REPORTTYPEVar = cJSON_GetObjectItemCaseSensitive(REPORTTYPEJSON, "report_type");
    if(!cJSON_IsString(REPORTTYPEVar) || (REPORTTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    REPORTTYPEVariable = deliveryMetricsGet_REPORTTYPE_FromString(REPORTTYPEVar->valuestring);
    return REPORTTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum TARGETINGTYPE for ResourcesAPI_targetingOptionsGet

static char* targetingOptionsGet_TARGETINGTYPE_ToString(pinterest_rest_api_targetingOptionsGet_targeting_type_e TARGETINGTYPE){
    char *TARGETINGTYPEArray[] =  { "NULL", "APPTYPE", "GENDER", "LOCALE", "AGE_BUCKET", "LOCATION", "GEO", "INTEREST", "KEYWORD", "AUDIENCE_INCLUDE", "AUDIENCE_EXCLUDE" };
    return TARGETINGTYPEArray[TARGETINGTYPE];
}

static pinterest_rest_api_targetingOptionsGet_targeting_type_e targetingOptionsGet_TARGETINGTYPE_FromString(char* TARGETINGTYPE){
    int stringToReturn = 0;
    char *TARGETINGTYPEArray[] =  { "NULL", "APPTYPE", "GENDER", "LOCALE", "AGE_BUCKET", "LOCATION", "GEO", "INTEREST", "KEYWORD", "AUDIENCE_INCLUDE", "AUDIENCE_EXCLUDE" };
    size_t sizeofArray = sizeof(TARGETINGTYPEArray) / sizeof(TARGETINGTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(TARGETINGTYPE, TARGETINGTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function targetingOptionsGet_TARGETINGTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *targetingOptionsGet_TARGETINGTYPE_convertToJSON(pinterest_rest_api_targetingOptionsGet_targeting_type_e TARGETINGTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_type", targetingOptionsGet_TARGETINGTYPE_ToString(TARGETINGTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function targetingOptionsGet_TARGETINGTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_targetingOptionsGet_targeting_type_e targetingOptionsGet_TARGETINGTYPE_parseFromJSON(cJSON* TARGETINGTYPEJSON) {
    pinterest_rest_api_targetingOptionsGet_targeting_type_e TARGETINGTYPEVariable = 0;
    cJSON *TARGETINGTYPEVar = cJSON_GetObjectItemCaseSensitive(TARGETINGTYPEJSON, "targeting_type");
    if(!cJSON_IsString(TARGETINGTYPEVar) || (TARGETINGTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    TARGETINGTYPEVariable = targetingOptionsGet_TARGETINGTYPE_FromString(TARGETINGTYPEVar->valuestring);
    return TARGETINGTYPEVariable;
end:
    return 0;
}
*/


// Get ad accounts countries
//
// Get Ad Accounts countries
//
ad_accounts_country_response_t*
ResourcesAPI_adAccountCountriesGet(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/resources/ad_account_countries")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/resources/ad_account_countries");



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
    cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_accounts_country_response_t *elementToReturn = ad_accounts_country_response_parseFromJSON(ResourcesAPIlocalVarJSON);
    cJSON_Delete(ResourcesAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/api-features/analytics-overview/'>Organic Analytics</a> and <a href='/docs/api-features/ads-reporting/'>Ads Analytics</a> for more information.
//
delivery_metrics_response_t*
ResourcesAPI_deliveryMetricsGet(apiClient_t *apiClient, pinterest_rest_api_deliveryMetricsGet_report_type_e report_type)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/resources/delivery_metrics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/resources/delivery_metrics");




    // query parameters
    char *keyQuery_report_type = NULL;
    pinterest_rest_api_deliveryMetricsGet_report_type_e valueQuery_report_type ;
    keyValuePair_t *keyPairQuery_report_type = 0;
    if (report_type)
    {
        keyQuery_report_type = strdup("report_type");
        valueQuery_report_type = (report_type);
        keyPairQuery_report_type = keyValuePair_create(keyQuery_report_type, (void *)strdup(deliveryMetricsGet_REPORTTYPE_ToString(
        valueQuery_report_type)));
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
    cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delivery_metrics_response_t *elementToReturn = delivery_metrics_response_parseFromJSON(ResourcesAPIlocalVarJSON);
    cJSON_Delete(ResourcesAPIlocalVarJSON);
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
// <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
//
single_interest_targeting_option_response_t*
ResourcesAPI_interestTargetingOptionsGet(apiClient_t *apiClient, char *interest_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/resources/targeting/interests/{interest_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/resources/targeting/interests/{interest_id}");


    // Path Params
    long sizeOfPathParams_interest_id = strlen(interest_id)+3 + strlen("{ interest_id }");
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
    cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    single_interest_targeting_option_response_t *elementToReturn = single_interest_targeting_option_response_parseFromJSON(ResourcesAPIlocalVarJSON);
    cJSON_Delete(ResourcesAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
// Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
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

    // create the path
    long sizeOfPath = strlen("/resources/lead_form_questions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/resources/lead_form_questions");



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
book_closed_response_t*
ResourcesAPI_metricsReadyStateGet(apiClient_t *apiClient, char *date)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/resources/metrics_ready_state")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/resources/metrics_ready_state");




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
    cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    book_closed_response_t *elementToReturn = book_closed_response_parseFromJSON(ResourcesAPIlocalVarJSON);
    cJSON_Delete(ResourcesAPIlocalVarJSON);
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
// <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
//
list_t*
ResourcesAPI_targetingOptionsGet(apiClient_t *apiClient, pinterest_rest_api_targetingOptionsGet_targeting_type_e targeting_type, char *client_id, char *oauth_signature, char *timestamp, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/resources/targeting/{targeting_type}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/resources/targeting/{targeting_type}");


    // Path Params
    long sizeOfPathParams_targeting_type = strlen(targeting_type)+3 + strlen("{ targeting_type }");
    if(targeting_type == NULL) {
        goto end;
    }
    char* localVarToReplace_targeting_type = malloc(sizeOfPathParams_targeting_type);
    sprintf(localVarToReplace_targeting_type, "{%s}", "targeting_type");

    localVarPath = strReplace(localVarPath, localVarToReplace_targeting_type, targeting_type);



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
    cJSON *ResourcesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(ResourcesAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_createList();
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

