#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AudienceSharingAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

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

// Functions for enum ORDER for AudienceSharingAPI_sharedAudiencesForBusinessList

static char* sharedAudiencesForBusinessList_ORDER_ToString(pinterest_rest_api_sharedAudiencesForBusinessList_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return ORDERArray[ORDER];
}

static pinterest_rest_api_sharedAudiencesForBusinessList_order_e sharedAudiencesForBusinessList_ORDER_FromString(char* ORDER){
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
// Function sharedAudiencesForBusinessList_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *sharedAudiencesForBusinessList_ORDER_convertToJSON(pinterest_rest_api_sharedAudiencesForBusinessList_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", sharedAudiencesForBusinessList_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function sharedAudiencesForBusinessList_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_sharedAudiencesForBusinessList_order_e sharedAudiencesForBusinessList_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    pinterest_rest_api_sharedAudiencesForBusinessList_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = sharedAudiencesForBusinessList_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/


// List accounts with access to an audience owned by an ad account
//
// List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
//
ad_accounts_audiences_shared_accounts_list_200_response_t*
AudienceSharingAPI_adAccountsAudiencesSharedAccountsList(apiClient_t *apiClient, char *ad_account_id, char *audience_id, audience_account_type_e account_type, int *page_size, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audiences/shared/accounts")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audiences/shared/accounts");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
        keyPairQuery_account_type = keyValuePair_create(keyQuery_account_type, (void *)strdup(adAccountsAudiencesSharedAccountsList__ToString(
        &valueQuery_account_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_account_type);
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
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account audiences shared accounts parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Shared accounts not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error.");
    //}
    //nonprimitive not container
    cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_accounts_audiences_shared_accounts_list_200_response_t *elementToReturn = ad_accounts_audiences_shared_accounts_list_200_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
    cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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

// List accounts with access to an audience owned by a business
//
// List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
//
ad_accounts_audiences_shared_accounts_list_200_response_t*
AudienceSharingAPI_businessAccountAudiencesSharedAccountsList(apiClient_t *apiClient, char *business_id, char *audience_id, audience_account_type_e account_type, int *page_size, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/audiences/shared/accounts")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/audiences/shared/accounts");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
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
        keyPairQuery_account_type = keyValuePair_create(keyQuery_account_type, (void *)strdup(businessAccountAudiencesSharedAccountsList__ToString(
        &valueQuery_account_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_account_type);
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
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid business audiences shared accounts parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Shared accounts not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error.");
    //}
    //nonprimitive not container
    cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_accounts_audiences_shared_accounts_list_200_response_t *elementToReturn = ad_accounts_audiences_shared_accounts_list_200_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
    cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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

// List received audiences for a business
//
// Get a list of received audiences for the given business.
//
audiences_list_200_response_t*
AudienceSharingAPI_sharedAudiencesForBusinessList(apiClient_t *apiClient, char *business_id, char *bookmark, pinterest_rest_api_sharedAudiencesForBusinessList_order_e order, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/audiences")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/audiences");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



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
    char *keyQuery_order = NULL;
    pinterest_rest_api_sharedAudiencesForBusinessList_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, (void *)strdup(sharedAudiencesForBusinessList_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    audiences_list_200_response_t *elementToReturn = audiences_list_200_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
    cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
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
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
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
// From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
//
shared_audience_response_t*
AudienceSharingAPI_updateAdAccountToAdAccountSharedAudience(apiClient_t *apiClient, char *ad_account_id, shared_audience_t *shared_audience)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_shared_audience = NULL;
    if (shared_audience != NULL)
    {
        //string
        localVarSingleItemJSON_shared_audience = shared_audience_convertToJSON(shared_audience);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_shared_audience);
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
                    "PATCH");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account id.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    shared_audience_response_t *elementToReturn = shared_audience_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
    cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_shared_audience) {
        cJSON_Delete(localVarSingleItemJSON_shared_audience);
        localVarSingleItemJSON_shared_audience = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update audience sharing from an ad account to businesses
//
// From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
//
business_shared_audience_response_t*
AudienceSharingAPI_updateAdAccountToBusinessSharedAudience(apiClient_t *apiClient, char *ad_account_id, business_shared_audience_t *business_shared_audience)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audiences/businesses/shared")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audiences/businesses/shared");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_business_shared_audience = NULL;
    if (business_shared_audience != NULL)
    {
        //string
        localVarSingleItemJSON_business_shared_audience = business_shared_audience_convertToJSON(business_shared_audience);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_business_shared_audience);
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
                    "PATCH");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account id.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    business_shared_audience_response_t *elementToReturn = business_shared_audience_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
    cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_business_shared_audience) {
        cJSON_Delete(localVarSingleItemJSON_business_shared_audience);
        localVarSingleItemJSON_business_shared_audience = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update audience sharing from a business to ad accounts
//
// From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
//
shared_audience_response_t*
AudienceSharingAPI_updateBusinessToAdAccountSharedAudience(apiClient_t *apiClient, char *business_id, shared_audience_t *shared_audience)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/audiences/ad_accounts/shared")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/audiences/ad_accounts/shared");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_shared_audience = NULL;
    if (shared_audience != NULL)
    {
        //string
        localVarSingleItemJSON_shared_audience = shared_audience_convertToJSON(shared_audience);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_shared_audience);
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
                    "PATCH");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    shared_audience_response_t *elementToReturn = shared_audience_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
    cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_shared_audience) {
        cJSON_Delete(localVarSingleItemJSON_shared_audience);
        localVarSingleItemJSON_shared_audience = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update audience sharing between businesses
//
// From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
//
business_shared_audience_response_t*
AudienceSharingAPI_updateBusinessToBusinessSharedAudience(apiClient_t *apiClient, char *business_id, business_shared_audience_t *business_shared_audience)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/audiences/businesses/shared")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/audiences/businesses/shared");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_business_shared_audience = NULL;
    if (business_shared_audience != NULL)
    {
        //string
        localVarSingleItemJSON_business_shared_audience = business_shared_audience_convertToJSON(business_shared_audience);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_business_shared_audience);
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
                    "PATCH");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AudienceSharingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    business_shared_audience_response_t *elementToReturn = business_shared_audience_response_parseFromJSON(AudienceSharingAPIlocalVarJSON);
    cJSON_Delete(AudienceSharingAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_business_shared_audience) {
        cJSON_Delete(localVarSingleItemJSON_business_shared_audience);
        localVarSingleItemJSON_business_shared_audience = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

