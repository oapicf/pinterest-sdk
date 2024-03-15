#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "CustomerListsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum ORDER for CustomerListsAPI_customerListsList

static char* customerListsList_ORDER_ToString(pinterest_rest_api_customerListsList_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return ORDERArray[ORDER];
}

static pinterest_rest_api_customerListsList_order_e customerListsList_ORDER_FromString(char* ORDER){
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
// Function customerListsList_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *customerListsList_ORDER_convertToJSON(pinterest_rest_api_customerListsList_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", customerListsList_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function customerListsList_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_customerListsList_order_e customerListsList_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    pinterest_rest_api_customerListsList_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = customerListsList_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/


// Create customer lists
//
// <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
//
customer_list_t*
CustomerListsAPI_customerListsCreate(apiClient_t *apiClient, char *ad_account_id, customer_list_request_t *customer_list_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/customer_lists")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/customer_lists");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_customer_list_request = NULL;
    if (customer_list_request != NULL)
    {
        //string
        localVarSingleItemJSON_customer_list_request = customer_list_request_convertToJSON(customer_list_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_customer_list_request);
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
    cJSON *CustomerListsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    customer_list_t *elementToReturn = customer_list_parseFromJSON(CustomerListsAPIlocalVarJSON);
    cJSON_Delete(CustomerListsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_customer_list_request) {
        cJSON_Delete(localVarSingleItemJSON_customer_list_request);
        localVarSingleItemJSON_customer_list_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get customer list
//
// Gets a specific customer list given the customer list ID.
//
customer_list_t*
CustomerListsAPI_customerListsGet(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_customer_list_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen("{ customer_list_id }");
    if(customer_list_id == NULL) {
        goto end;
    }
    char* localVarToReplace_customer_list_id = malloc(sizeOfPathParams_customer_list_id);
    sprintf(localVarToReplace_customer_list_id, "{%s}", "customer_list_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_customer_list_id, customer_list_id);


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
    cJSON *CustomerListsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    customer_list_t *elementToReturn = customer_list_parseFromJSON(CustomerListsAPIlocalVarJSON);
    cJSON_Delete(CustomerListsAPIlocalVarJSON);
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
    free(localVarToReplace_customer_list_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get customer lists
//
// <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
//
customer_lists_list_200_response_t*
CustomerListsAPI_customerListsList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_customerListsList_order_e order, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/customer_lists")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/customer_lists");


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
    pinterest_rest_api_customerListsList_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, (void *)strdup(customerListsList_ORDER_ToString(
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
    cJSON *CustomerListsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    customer_lists_list_200_response_t *elementToReturn = customer_lists_list_200_response_parseFromJSON(CustomerListsAPIlocalVarJSON);
    cJSON_Delete(CustomerListsAPIlocalVarJSON);
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

// Update customer list
//
// <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
//
customer_list_t*
CustomerListsAPI_customerListsUpdate(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, customer_list_update_request_t *customer_list_update_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_customer_list_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen("{ customer_list_id }");
    if(customer_list_id == NULL) {
        goto end;
    }
    char* localVarToReplace_customer_list_id = malloc(sizeOfPathParams_customer_list_id);
    sprintf(localVarToReplace_customer_list_id, "{%s}", "customer_list_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_customer_list_id, customer_list_id);



    // Body Param
    cJSON *localVarSingleItemJSON_customer_list_update_request = NULL;
    if (customer_list_update_request != NULL)
    {
        //string
        localVarSingleItemJSON_customer_list_update_request = customer_list_update_request_convertToJSON(customer_list_update_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_customer_list_update_request);
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
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *CustomerListsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    customer_list_t *elementToReturn = customer_list_parseFromJSON(CustomerListsAPIlocalVarJSON);
    cJSON_Delete(CustomerListsAPIlocalVarJSON);
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
    free(localVarToReplace_customer_list_id);
    if (localVarSingleItemJSON_customer_list_update_request) {
        cJSON_Delete(localVarSingleItemJSON_customer_list_update_request);
        localVarSingleItemJSON_customer_list_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

