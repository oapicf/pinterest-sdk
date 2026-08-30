#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "AudienceSharingAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for AudienceSharingAPI_adAccountsAudiencesSharedAccountsList

static char* adAccountsAudiencesSharedAccountsList__ToString(pinterest_rest_api_adAccountsAudiencesSharedAccountsList_account_type_e ){
    char *Array[] =  { "NULL", "AD_ACCOUNT", "BUSINESS_ACCOUNT" };
    return Array[];
}

static pinterest_rest_api_adAccountsAudiencesSharedAccountsList_account_type_e adAccountsAudiencesSharedAccountsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "AD_ACCOUNT", "BUSINESS_ACCOUNT" };
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
// Function adAccountsAudiencesSharedAccountsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountsAudiencesSharedAccountsList__convertToJSON(pinterest_rest_api_adAccountsAudiencesSharedAccountsList_account_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountsAudiencesSharedAccountsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountsAudiencesSharedAccountsList_account_type_e adAccountsAudiencesSharedAccountsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adAccountsAudiencesSharedAccountsList_account_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AudienceSharingAPI_businessAccountAudiencesSharedAccountsList

static char* businessAccountAudiencesSharedAccountsList__ToString(pinterest_rest_api_businessAccountAudiencesSharedAccountsList_account_type_e ){
    char *Array[] =  { "NULL", "AD_ACCOUNT", "BUSINESS_ACCOUNT" };
    return Array[];
}

static pinterest_rest_api_businessAccountAudiencesSharedAccountsList_account_type_e businessAccountAudiencesSharedAccountsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "AD_ACCOUNT", "BUSINESS_ACCOUNT" };
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
// Function businessAccountAudiencesSharedAccountsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessAccountAudiencesSharedAccountsList__convertToJSON(pinterest_rest_api_businessAccountAudiencesSharedAccountsList_account_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessAccountAudiencesSharedAccountsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessAccountAudiencesSharedAccountsList_account_type_e businessAccountAudiencesSharedAccountsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_businessAccountAudiencesSharedAccountsList_account_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AudienceSharingAPI_sharedAudiencesForBusinessList

static char* sharedAudiencesForBusinessList__ToString(pinterest_rest_api_sharedAudiencesForBusinessList_order_e ){
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return Array[];
}

static pinterest_rest_api_sharedAudiencesForBusinessList_order_e sharedAudiencesForBusinessList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
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
// Function sharedAudiencesForBusinessList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *sharedAudiencesForBusinessList__convertToJSON(pinterest_rest_api_sharedAudiencesForBusinessList_order_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function sharedAudiencesForBusinessList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_sharedAudiencesForBusinessList_order_e sharedAudiencesForBusinessList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_sharedAudiencesForBusinessList_order_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// List accounts with access to an audience owned by an ad account
//
// List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
//
ad_accounts_audiences_shared_accounts_list_200_response_t*
AudienceSharingAPI_adAccountsAudiencesSharedAccountsList(apiClient_t *apiClient, char *audience_id, audience_account_type_e account_type, char *ad_account_id, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/audiences/shared/accounts");

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
    char *keyQuery_audience_id = NULL;
    char * valueQuery_audience_id = NULL;
    keyValuePair_t *keyPairQuery_audience_id = 0;
    if (audience_id)
    {
        keyQuery_audience_id = strdup("audience_id");
        valueQuery_audience_id = strdup((audience_id));
        keyPairQuery_audience_id = keyValuePair_create(keyQuery_audience_id, valueQuery_audience_id);
        list_addElement(localVarQueryParameters,keyPairQuery_audience_id);
    }

    // query parameters
    char *keyQuery_account_type = NULL;
    audience_account_type_e valueQuery_account_type ;
    keyValuePair_t *keyPairQuery_account_type = 0;
    if (account_type)
    {
        keyQuery_account_type = strdup("account_type");
        valueQuery_account_type = (account_type);
        keyPairQuery_account_type = keyValuePair_create(keyQuery_account_type, strdup(adAccountsAudiencesSharedAccountsList__ToString(
        &valueQuery_account_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_account_type);
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
    ad_accounts_audiences_shared_accounts_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_accounts_audiences_shared_accounts_list_200_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
        cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    if(keyQuery_audience_id){
        free(keyQuery_audience_id);
        keyQuery_audience_id = NULL;
    }
    if(valueQuery_audience_id){
        free(valueQuery_audience_id);
        valueQuery_audience_id = NULL;
    }
    if(keyPairQuery_audience_id){
        keyValuePair_free(keyPairQuery_audience_id);
        keyPairQuery_audience_id = NULL;
    }
    if(keyQuery_account_type){
        free(keyQuery_account_type);
        keyQuery_account_type = NULL;
    }
    if(keyPairQuery_account_type){
        keyValuePair_free(keyPairQuery_account_type);
        keyPairQuery_account_type = NULL;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List accounts with access to an audience owned by a business
//
// List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
//
ad_accounts_audiences_shared_accounts_list_200_response_t*
AudienceSharingAPI_businessAccountAudiencesSharedAccountsList(apiClient_t *apiClient, char *business_id, char *audience_id, audience_account_type_e account_type, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/businesses/{business_id}/audiences/shared/accounts");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // query parameters
    char *keyQuery_audience_id = NULL;
    char * valueQuery_audience_id = NULL;
    keyValuePair_t *keyPairQuery_audience_id = 0;
    if (audience_id)
    {
        keyQuery_audience_id = strdup("audience_id");
        valueQuery_audience_id = strdup((audience_id));
        keyPairQuery_audience_id = keyValuePair_create(keyQuery_audience_id, valueQuery_audience_id);
        list_addElement(localVarQueryParameters,keyPairQuery_audience_id);
    }

    // query parameters
    char *keyQuery_account_type = NULL;
    audience_account_type_e valueQuery_account_type ;
    keyValuePair_t *keyPairQuery_account_type = 0;
    if (account_type)
    {
        keyQuery_account_type = strdup("account_type");
        valueQuery_account_type = (account_type);
        keyPairQuery_account_type = keyValuePair_create(keyQuery_account_type, strdup(businessAccountAudiencesSharedAccountsList__ToString(
        &valueQuery_account_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_account_type);
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
    ad_accounts_audiences_shared_accounts_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_accounts_audiences_shared_accounts_list_200_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
        cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if(keyQuery_audience_id){
        free(keyQuery_audience_id);
        keyQuery_audience_id = NULL;
    }
    if(valueQuery_audience_id){
        free(valueQuery_audience_id);
        valueQuery_audience_id = NULL;
    }
    if(keyPairQuery_audience_id){
        keyValuePair_free(keyPairQuery_audience_id);
        keyPairQuery_audience_id = NULL;
    }
    if(keyQuery_account_type){
        free(keyQuery_account_type);
        keyQuery_account_type = NULL;
    }
    if(keyPairQuery_account_type){
        keyValuePair_free(keyPairQuery_account_type);
        keyPairQuery_account_type = NULL;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List received audiences for a business
//
// Get a list of received audiences for the given business.
//
shared_audiences_for_business_list_200_response_t*
AudienceSharingAPI_sharedAudiencesForBusinessList(apiClient_t *apiClient, char *business_id, order_e order, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/businesses/{business_id}/audiences");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // query parameters
    char *keyQuery_order = NULL;
    order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(sharedAudiencesForBusinessList__ToString(
        &valueQuery_order)));
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
    shared_audiences_for_business_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = shared_audiences_for_business_list_200_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
        cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update audience sharing between ad accounts
//
// From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
//
ad_account_to_ad_account_shared_audience_t*
AudienceSharingAPI_updateAdAccountToAdAccountSharedAudience(apiClient_t *apiClient, char *ad_account_id, ad_account_to_ad_account_shared_audience_update_with_required_body_t *ad_account_to_ad_account_shared_audience_update_with_required_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared");

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



    // Body Param
    cJSON *localVarSingleItemJSON_ad_account_to_ad_account_shared_audience_update_with_required_body = NULL;
    if (ad_account_to_ad_account_shared_audience_update_with_required_body != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_ad_account_to_ad_account_shared_audience_update_with_required_body = ad_account_to_ad_account_shared_audience_update_with_required_body_convertToJSON(ad_account_to_ad_account_shared_audience_update_with_required_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ad_account_to_ad_account_shared_audience_update_with_required_body);
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
                    "PATCH");

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
    ad_account_to_ad_account_shared_audience_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_account_to_ad_account_shared_audience_parseFromJSON(AudienceSharingAPIlocalVarJSON);
        cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if (localVarSingleItemJSON_ad_account_to_ad_account_shared_audience_update_with_required_body) {
        cJSON_Delete(localVarSingleItemJSON_ad_account_to_ad_account_shared_audience_update_with_required_body);
        localVarSingleItemJSON_ad_account_to_ad_account_shared_audience_update_with_required_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update audience sharing from an ad account to businesses
//
// From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
//
ad_account_to_business_shared_audience_t*
AudienceSharingAPI_updateAdAccountToBusinessSharedAudience(apiClient_t *apiClient, char *ad_account_id, ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/audiences/businesses/shared");

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



    // Body Param
    cJSON *localVarSingleItemJSON_ad_account_to_business_shared_audience_update_with_required_body = NULL;
    if (ad_account_to_business_shared_audience_update_with_required_body != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_ad_account_to_business_shared_audience_update_with_required_body = ad_account_to_business_shared_audience_update_with_required_body_convertToJSON(ad_account_to_business_shared_audience_update_with_required_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ad_account_to_business_shared_audience_update_with_required_body);
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
                    "PATCH");

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
    ad_account_to_business_shared_audience_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_account_to_business_shared_audience_parseFromJSON(AudienceSharingAPIlocalVarJSON);
        cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if (localVarSingleItemJSON_ad_account_to_business_shared_audience_update_with_required_body) {
        cJSON_Delete(localVarSingleItemJSON_ad_account_to_business_shared_audience_update_with_required_body);
        localVarSingleItemJSON_ad_account_to_business_shared_audience_update_with_required_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update audience sharing from a business to ad accounts
//
// From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
//
business_to_ad_account_shared_audience_t*
AudienceSharingAPI_updateBusinessToAdAccountSharedAudience(apiClient_t *apiClient, char *business_id, business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/businesses/{business_id}/audiences/ad_accounts/shared");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_business_to_ad_account_shared_audience_update_with_required_body = NULL;
    if (business_to_ad_account_shared_audience_update_with_required_body != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_business_to_ad_account_shared_audience_update_with_required_body = business_to_ad_account_shared_audience_update_with_required_body_convertToJSON(business_to_ad_account_shared_audience_update_with_required_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_business_to_ad_account_shared_audience_update_with_required_body);
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
                    "PATCH");

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
    business_to_ad_account_shared_audience_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = business_to_ad_account_shared_audience_parseFromJSON(AudienceSharingAPIlocalVarJSON);
        cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_business_to_ad_account_shared_audience_update_with_required_body) {
        cJSON_Delete(localVarSingleItemJSON_business_to_ad_account_shared_audience_update_with_required_body);
        localVarSingleItemJSON_business_to_ad_account_shared_audience_update_with_required_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update audience sharing between businesses
//
// From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
//
business_to_business_shared_audience_t*
AudienceSharingAPI_updateBusinessToBusinessSharedAudience(apiClient_t *apiClient, char *business_id, business_to_business_shared_audience_update_with_required_body_t *business_to_business_shared_audience_update_with_required_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/businesses/{business_id}/audiences/businesses/shared");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_business_to_business_shared_audience_update_with_required_body = NULL;
    if (business_to_business_shared_audience_update_with_required_body != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_business_to_business_shared_audience_update_with_required_body = business_to_business_shared_audience_update_with_required_body_convertToJSON(business_to_business_shared_audience_update_with_required_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_business_to_business_shared_audience_update_with_required_body);
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
                    "PATCH");

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
    business_to_business_shared_audience_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = business_to_business_shared_audience_parseFromJSON(AudienceSharingAPIlocalVarJSON);
        cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_business_to_business_shared_audience_update_with_required_body) {
        cJSON_Delete(localVarSingleItemJSON_business_to_business_shared_audience_update_with_required_body);
        localVarSingleItemJSON_business_to_business_shared_audience_update_with_required_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

