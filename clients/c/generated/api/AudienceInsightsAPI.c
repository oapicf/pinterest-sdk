#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AudienceInsightsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum  for AudienceInsightsAPI_audienceInsightsGet

static char* audienceInsightsGet__ToString(pinterest_rest_api_audienceInsightsGet_audience_insight_type_e ){
    char *Array[] =  { "NULL", "YOUR_TOTAL_AUDIENCE", "YOUR_ENGAGED_AUDIENCE", "PINTEREST_TOTAL_AUDIENCE" };
    return Array[];
}

static pinterest_rest_api_audienceInsightsGet_audience_insight_type_e audienceInsightsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "YOUR_TOTAL_AUDIENCE", "YOUR_ENGAGED_AUDIENCE", "PINTEREST_TOTAL_AUDIENCE" };
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
// Function audienceInsightsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *audienceInsightsGet__convertToJSON(pinterest_rest_api_audienceInsightsGet_audience_insight_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function audienceInsightsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_audienceInsightsGet_audience_insight_type_e audienceInsightsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_audienceInsightsGet_audience_insight_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Get audience insights
//
// Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
//
audience_insights_response_t*
AudienceInsightsAPI_audienceInsightsGet(apiClient_t *apiClient, char *ad_account_id, audience_insight_type_e audience_insight_type)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audience_insights")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audience_insights");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    char *keyQuery_audience_insight_type = NULL;
    audience_insight_type_e valueQuery_audience_insight_type ;
    keyValuePair_t *keyPairQuery_audience_insight_type = 0;
    if (audience_insight_type)
    {
        keyQuery_audience_insight_type = strdup("audience_insight_type");
        valueQuery_audience_insight_type = (audience_insight_type);
        keyPairQuery_audience_insight_type = keyValuePair_create(keyQuery_audience_insight_type, (void *)strdup(audienceInsightsGet__ToString(
        &valueQuery_audience_insight_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_audience_insight_type);
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
    cJSON *AudienceInsightsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    audience_insights_response_t *elementToReturn = audience_insights_response_parseFromJSON(AudienceInsightsAPIlocalVarJSON);
    cJSON_Delete(AudienceInsightsAPIlocalVarJSON);
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
    if(keyQuery_audience_insight_type){
        free(keyQuery_audience_insight_type);
        keyQuery_audience_insight_type = NULL;
    }
    if(keyPairQuery_audience_insight_type){
        keyValuePair_free(keyPairQuery_audience_insight_type);
        keyPairQuery_audience_insight_type = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get audience insights scope and type
//
// Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
//
audience_definition_response_t*
AudienceInsightsAPI_audienceInsightsScopeAndTypeGet(apiClient_t *apiClient, char *ad_account_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/insights/audiences")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/insights/audiences");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);


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
    cJSON *AudienceInsightsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    audience_definition_response_t *elementToReturn = audience_definition_response_parseFromJSON(AudienceInsightsAPIlocalVarJSON);
    cJSON_Delete(AudienceInsightsAPIlocalVarJSON);
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
    free(localVarToReplace_ad_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

