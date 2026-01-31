#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "ConversionEqsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for ConversionEqsAPI_conversionEqsList

static char* conversionEqsList__ToString(pinterest_rest_api_conversionEqsList_lookback_period_e ){
    char *Array[] =  { "NULL", "1d", "14d" };
    return Array[];
}

static pinterest_rest_api_conversionEqsList_lookback_period_e conversionEqsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "1d", "14d" };
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
// Function conversionEqsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *conversionEqsList__convertToJSON(pinterest_rest_api_conversionEqsList_lookback_period_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function conversionEqsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_conversionEqsList_lookback_period_e conversionEqsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_conversionEqsList_lookback_period_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ConversionEqsAPI_conversionEqsList

static char* conversionEqsList__ToString(pinterest_rest_api_conversionEqsList_source_platform_e ){
    char *Array[] =  { "NULL", "WEB", "MOBILE", "MOBILE_ANDROID", "MOBILE_IOS", "OFFLINE", "PINTEREST_WEB", "PINTEREST_ANDROID", "PINTEREST_IOS", "POINT_OF_SALE" };
    return Array[];
}

static pinterest_rest_api_conversionEqsList_source_platform_e conversionEqsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "WEB", "MOBILE", "MOBILE_ANDROID", "MOBILE_IOS", "OFFLINE", "PINTEREST_WEB", "PINTEREST_ANDROID", "PINTEREST_IOS", "POINT_OF_SALE" };
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
// Function conversionEqsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *conversionEqsList__convertToJSON(pinterest_rest_api_conversionEqsList_source_platform_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function conversionEqsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_conversionEqsList_source_platform_e conversionEqsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_conversionEqsList_source_platform_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ConversionEqsAPI_conversionEqsList

static char* conversionEqsList__ToString(pinterest_rest_api_conversionEqsList_ingestion_source_e ){
    char *Array[] =  { "NULL", "TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE" };
    return Array[];
}

static pinterest_rest_api_conversionEqsList_ingestion_source_e conversionEqsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE" };
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
// Function conversionEqsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *conversionEqsList__convertToJSON(pinterest_rest_api_conversionEqsList_ingestion_source_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function conversionEqsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_conversionEqsList_ingestion_source_e conversionEqsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_conversionEqsList_ingestion_source_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Get event quality score (EQS)
//
// Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
//
list_t*
ConversionEqsAPI_conversionEqsList(apiClient_t *apiClient, lookback_period_options_e lookback_period, char *ad_account_id, source_platform_options_e source_platform, ingestion_source_options_e ingestion_source)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/conversion_eqs");

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
    char *keyQuery_lookback_period = NULL;
    lookback_period_options_e valueQuery_lookback_period ;
    keyValuePair_t *keyPairQuery_lookback_period = 0;
    if (lookback_period)
    {
        keyQuery_lookback_period = strdup("lookback_period");
        valueQuery_lookback_period = (lookback_period);
        keyPairQuery_lookback_period = keyValuePair_create(keyQuery_lookback_period, strdup(conversionEqsList__ToString(
        &valueQuery_lookback_period)));
        list_addElement(localVarQueryParameters,keyPairQuery_lookback_period);
    }

    // query parameters
    char *keyQuery_source_platform = NULL;
    source_platform_options_e valueQuery_source_platform ;
    keyValuePair_t *keyPairQuery_source_platform = 0;
    if (source_platform)
    {
        keyQuery_source_platform = strdup("source_platform");
        valueQuery_source_platform = (source_platform);
        keyPairQuery_source_platform = keyValuePair_create(keyQuery_source_platform, strdup(conversionEqsList__ToString(
        &valueQuery_source_platform)));
        list_addElement(localVarQueryParameters,keyPairQuery_source_platform);
    }

    // query parameters
    char *keyQuery_ingestion_source = NULL;
    ingestion_source_options_e valueQuery_ingestion_source ;
    keyValuePair_t *keyPairQuery_ingestion_source = 0;
    if (ingestion_source)
    {
        keyQuery_ingestion_source = strdup("ingestion_source");
        valueQuery_ingestion_source = (ingestion_source);
        keyPairQuery_ingestion_source = keyValuePair_create(keyQuery_ingestion_source, strdup(conversionEqsList__ToString(
        &valueQuery_ingestion_source)));
        list_addElement(localVarQueryParameters,keyPairQuery_ingestion_source);
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
        cJSON *ConversionEqsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(ConversionEqsAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, ConversionEqsAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( ConversionEqsAPIlocalVarJSON);
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
    free(localVarToReplace_ad_account_id);
    if(keyQuery_lookback_period){
        free(keyQuery_lookback_period);
        keyQuery_lookback_period = NULL;
    }
    if(keyPairQuery_lookback_period){
        keyValuePair_free(keyPairQuery_lookback_period);
        keyPairQuery_lookback_period = NULL;
    }
    if(keyQuery_source_platform){
        free(keyQuery_source_platform);
        keyQuery_source_platform = NULL;
    }
    if(keyPairQuery_source_platform){
        keyValuePair_free(keyPairQuery_source_platform);
        keyPairQuery_source_platform = NULL;
    }
    if(keyQuery_ingestion_source){
        free(keyQuery_ingestion_source);
        keyQuery_ingestion_source = NULL;
    }
    if(keyPairQuery_ingestion_source){
        keyValuePair_free(keyPairQuery_ingestion_source);
        keyPairQuery_ingestion_source = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

