#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "CustomerListsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for CustomerListsAPI_customerListsList

static char* customerListsList__ToString(pinterest_rest_api_customerListsList_order_e ){
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return Array[];
}

static pinterest_rest_api_customerListsList_order_e customerListsList__FromString(char* ){
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
// Function customerListsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *customerListsList__convertToJSON(pinterest_rest_api_customerListsList_order_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function customerListsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_customerListsList_order_e customerListsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_customerListsList_order_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Create customer lists
//
// Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
//
customer_list_t*
CustomerListsAPI_customerListsCreate(apiClient_t *apiClient, char *ad_account_id, customer_list_create_t *customer_list_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/customer_lists");

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
    cJSON *localVarSingleItemJSON_customer_list_create = NULL;
    if (customer_list_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_customer_list_create = customer_list_create_convertToJSON(customer_list_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_customer_list_create);
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
    //if (apiClient->response_code == 201) {
    //    printf("%s\n","Resource create operation completed successfully.");
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
    customer_list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_list_parseFromJSON(CustomerListsAPIlocalVarJSON);
        cJSON_Delete(CustomerListsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_customer_list_create) {
        cJSON_Delete(localVarSingleItemJSON_customer_list_create);
        localVarSingleItemJSON_customer_list_create = NULL;
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
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}");

    if(!ad_account_id)
        goto end;
    if(!customer_list_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_customer_list_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + sizeof("{ customer_list_id }") - 1;
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
    customer_list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_list_parseFromJSON(CustomerListsAPIlocalVarJSON);
        cJSON_Delete(CustomerListsAPIlocalVarJSON);
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
    free(localVarToReplace_ad_account_id);
    free(localVarToReplace_customer_list_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get customer lists
//
// Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
//
customer_lists_list_200_response_t*
CustomerListsAPI_customerListsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, int *exclude_nca)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/customer_lists");

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

    // query parameters
    char *keyQuery_order = NULL;
    pinterest_lib_pagination_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(customerListsList__ToString(
        &valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_exclude_nca = NULL;
    char * valueQuery_exclude_nca = NULL;
    keyValuePair_t *keyPairQuery_exclude_nca = 0;
    if (exclude_nca)
    {
        keyQuery_exclude_nca = strdup("exclude_nca");
        valueQuery_exclude_nca = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_exclude_nca, MAX_NUMBER_LENGTH, "%d", *exclude_nca);
        keyPairQuery_exclude_nca = keyValuePair_create(keyQuery_exclude_nca, valueQuery_exclude_nca);
        list_addElement(localVarQueryParameters,keyPairQuery_exclude_nca);
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
    customer_lists_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_lists_list_200_response_parseFromJSON(CustomerListsAPIlocalVarJSON);
        cJSON_Delete(CustomerListsAPIlocalVarJSON);
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
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_exclude_nca){
        free(keyQuery_exclude_nca);
        keyQuery_exclude_nca = NULL;
    }
    if(valueQuery_exclude_nca){
        free(valueQuery_exclude_nca);
        valueQuery_exclude_nca = NULL;
    }
    if(keyPairQuery_exclude_nca){
        keyValuePair_free(keyPairQuery_exclude_nca);
        keyPairQuery_exclude_nca = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update customer list
//
// Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
//
customer_list_t*
CustomerListsAPI_customerListsUpdate(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, customer_list_update_with_required_body_t *customer_list_update_with_required_body)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}");

    if(!ad_account_id)
        goto end;
    if(!customer_list_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_customer_list_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + sizeof("{ customer_list_id }") - 1;
    if(customer_list_id == NULL) {
        goto end;
    }
    char* localVarToReplace_customer_list_id = malloc(sizeOfPathParams_customer_list_id);
    sprintf(localVarToReplace_customer_list_id, "{%s}", "customer_list_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_customer_list_id, customer_list_id);



    // Body Param
    cJSON *localVarSingleItemJSON_customer_list_update_with_required_body = NULL;
    if (customer_list_update_with_required_body != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_customer_list_update_with_required_body = customer_list_update_with_required_body_convertToJSON(customer_list_update_with_required_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_customer_list_update_with_required_body);
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
    customer_list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_list_parseFromJSON(CustomerListsAPIlocalVarJSON);
        cJSON_Delete(CustomerListsAPIlocalVarJSON);
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
    free(localVarToReplace_customer_list_id);
    if (localVarSingleItemJSON_customer_list_update_with_required_body) {
        cJSON_Delete(localVarSingleItemJSON_customer_list_update_with_required_body);
        localVarSingleItemJSON_customer_list_update_with_required_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

