#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ConversionTagsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum ORDER for ConversionTagsAPI_pageVisitConversionTagsGet

static char* pageVisitConversionTagsGet_ORDER_ToString(pinterest_rest_api_pageVisitConversionTagsGet_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return ORDERArray[ORDER];
}

static pinterest_rest_api_pageVisitConversionTagsGet_order_e pageVisitConversionTagsGet_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function pageVisitConversionTagsGet_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *pageVisitConversionTagsGet_ORDER_convertToJSON(pinterest_rest_api_pageVisitConversionTagsGet_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", pageVisitConversionTagsGet_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function pageVisitConversionTagsGet_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_pageVisitConversionTagsGet_order_e pageVisitConversionTagsGet_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    pinterest_rest_api_pageVisitConversionTagsGet_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = pageVisitConversionTagsGet_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/


// Create conversion tag
//
// Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>
//
conversion_tag_response_t*
ConversionTagsAPI_conversionTagsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_tag_create_t *conversion_tag_create)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/conversion_tags")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/conversion_tags");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_conversion_tag_create = NULL;
    if (conversion_tag_create != NULL)
    {
        //string
        localVarSingleItemJSON_conversion_tag_create = conversion_tag_create_convertToJSON(conversion_tag_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_conversion_tag_create);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *ConversionTagsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    conversion_tag_response_t *elementToReturn = conversion_tag_response_parseFromJSON(ConversionTagsAPIlocalVarJSON);
    cJSON_Delete(ConversionTagsAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if (localVarSingleItemJSON_conversion_tag_create) {
        cJSON_Delete(localVarSingleItemJSON_conversion_tag_create);
        localVarSingleItemJSON_conversion_tag_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get conversion tag
//
// Get information about an existing conversion tag.
//
conversion_tag_response_t*
ConversionTagsAPI_conversionTagsGet(apiClient_t *apiClient, char *ad_account_id, char *conversion_tag_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(conversion_tag_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_conversion_tag_id = strlen(ad_account_id)+3 + strlen(conversion_tag_id)+3 + strlen("{ conversion_tag_id }");
    if(conversion_tag_id == NULL) {
        goto end;
    }
    char* localVarToReplace_conversion_tag_id = malloc(sizeOfPathParams_conversion_tag_id);
    sprintf(localVarToReplace_conversion_tag_id, "{%s}", "conversion_tag_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_conversion_tag_id, conversion_tag_id);


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
    cJSON *ConversionTagsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    conversion_tag_response_t *elementToReturn = conversion_tag_response_parseFromJSON(ConversionTagsAPIlocalVarJSON);
    cJSON_Delete(ConversionTagsAPIlocalVarJSON);
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
    free(localVarToReplace_conversion_tag_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get conversion tags
//
// List conversion tags associated with an ad account.
//
conversion_tag_list_response_t*
ConversionTagsAPI_conversionTagsList(apiClient_t *apiClient, char *ad_account_id, int *filter_deleted)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/conversion_tags")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/conversion_tags");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    char *keyQuery_filter_deleted = NULL;
    char * valueQuery_filter_deleted = NULL;
    keyValuePair_t *keyPairQuery_filter_deleted = 0;
    if (filter_deleted)
    {
        keyQuery_filter_deleted = strdup("filter_deleted");
        valueQuery_filter_deleted = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_filter_deleted, MAX_NUMBER_LENGTH, "%d", *filter_deleted);
        keyPairQuery_filter_deleted = keyValuePair_create(keyQuery_filter_deleted, valueQuery_filter_deleted);
        list_addElement(localVarQueryParameters,keyPairQuery_filter_deleted);
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
    cJSON *ConversionTagsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    conversion_tag_list_response_t *elementToReturn = conversion_tag_list_response_parseFromJSON(ConversionTagsAPIlocalVarJSON);
    cJSON_Delete(ConversionTagsAPIlocalVarJSON);
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
    if(keyQuery_filter_deleted){
        free(keyQuery_filter_deleted);
        keyQuery_filter_deleted = NULL;
    }
    if(valueQuery_filter_deleted){
        free(valueQuery_filter_deleted);
        valueQuery_filter_deleted = NULL;
    }
    if(keyPairQuery_filter_deleted){
        keyValuePair_free(keyPairQuery_filter_deleted);
        keyPairQuery_filter_deleted = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get Ocpm eligible conversion tags
//
// Get Ocpm eligible conversion tag events for an ad account.
//
list_t*
ConversionTagsAPI_ocpmEligibleConversionTagsGet(apiClient_t *apiClient, char *ad_account_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible");


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
    //    printf("%s\n","Unexpected errors");
    //}
    //primitive return type not simple
    cJSON *localVarJSON = cJSON_Parse(apiClient->dataReceived);
    cJSON *VarJSON;
    list_t *elementToReturn = list_createList();
    cJSON_ArrayForEach(VarJSON, localVarJSON){
        keyValuePair_t *keyPair = keyValuePair_create(strdup(VarJSON->string), cJSON_Print(VarJSON));
        list_addElement(elementToReturn, keyPair);
    }
    cJSON_Delete(localVarJSON);

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

// Get page visit conversion tags
//
// Get all page visit conversion tag events for an ad account.
//
page_visit_conversion_tags_get_200_response_t*
ConversionTagsAPI_pageVisitConversionTagsGet(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_pageVisitConversionTagsGet_order_e order, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/conversion_tags/page_visit")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/conversion_tags/page_visit");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }

    // query parameters
    char *keyQuery_order = NULL;
    pinterest_rest_api_pageVisitConversionTagsGet_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, (void *)strdup(pageVisitConversionTagsGet_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
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
    cJSON *ConversionTagsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    page_visit_conversion_tags_get_200_response_t *elementToReturn = page_visit_conversion_tags_get_200_response_parseFromJSON(ConversionTagsAPIlocalVarJSON);
    cJSON_Delete(ConversionTagsAPIlocalVarJSON);
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
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

