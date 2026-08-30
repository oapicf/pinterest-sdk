#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "AudiencesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for AudiencesAPI_audiencesList

static char* audiencesList__ToString(pinterest_rest_api_audiencesList_order_e ){
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return Array[];
}

static pinterest_rest_api_audiencesList_order_e audiencesList__FromString(char* ){
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
// Function audiencesList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *audiencesList__convertToJSON(pinterest_rest_api_audiencesList_order_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function audiencesList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_audiencesList_order_e audiencesList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_audiencesList_order_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AudiencesAPI_audiencesList

static char* audiencesList__ToString(pinterest_rest_api_audiencesList_ownership_type_e ){
    char *Array[] =  { "NULL", "OWNED", "RECEIVED" };
    return Array[];
}

static pinterest_rest_api_audiencesList_ownership_type_e audiencesList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "OWNED", "RECEIVED" };
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
// Function audiencesList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *audiencesList__convertToJSON(pinterest_rest_api_audiencesList_ownership_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function audiencesList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_audiencesList_ownership_type_e audiencesList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_audiencesList_ownership_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Create audience
//
// Create a new audience for the ad account.
//
ad_accounts_audience_t*
AudiencesAPI_audiencesCreate(apiClient_t *apiClient, char *ad_account_id, ad_accounts_audience_create_t *ad_accounts_audience_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/audiences");

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
    cJSON *localVarSingleItemJSON_ad_accounts_audience_create = NULL;
    if (ad_accounts_audience_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_ad_accounts_audience_create = ad_accounts_audience_create_convertToJSON(ad_accounts_audience_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ad_accounts_audience_create);
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
    ad_accounts_audience_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_accounts_audience_parseFromJSON(AudiencesAPIlocalVarJSON);
        cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_ad_accounts_audience_create) {
        cJSON_Delete(localVarSingleItemJSON_ad_accounts_audience_create);
        localVarSingleItemJSON_ad_accounts_audience_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get audience
//
// Get a specific audience given the audience ID.
//
ad_accounts_audience_t*
AudiencesAPI_audiencesGet(apiClient_t *apiClient, char *audience_id, char *ad_account_id)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/audiences/{audience_id}");

    if(!audience_id)
        goto end;
    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_audience_id = strlen(audience_id)+3 + strlen(ad_account_id)+3 + sizeof("{ audience_id }") - 1;
    if(audience_id == NULL) {
        goto end;
    }
    char* localVarToReplace_audience_id = malloc(sizeOfPathParams_audience_id);
    sprintf(localVarToReplace_audience_id, "{%s}", "audience_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_audience_id, audience_id);

    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(audience_id)+3 + strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
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
    ad_accounts_audience_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_accounts_audience_parseFromJSON(AudiencesAPIlocalVarJSON);
        cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    free(localVarToReplace_audience_id);
    free(localVarToReplace_ad_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List audiences
//
// Get list of audiences for the ad account.
//
audiences_list_200_response_t*
AudiencesAPI_audiencesList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, audience_ownership_type_e ownership_type, int *exclude_nca)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/audiences");

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
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(audiencesList__ToString(
        &valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_ownership_type = NULL;
    audience_ownership_type_e valueQuery_ownership_type ;
    keyValuePair_t *keyPairQuery_ownership_type = 0;
    if (ownership_type)
    {
        keyQuery_ownership_type = strdup("ownership_type");
        valueQuery_ownership_type = (ownership_type);
        keyPairQuery_ownership_type = keyValuePair_create(keyQuery_ownership_type, strdup(audiencesList__ToString(
        &valueQuery_ownership_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_ownership_type);
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
    audiences_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = audiences_list_200_response_parseFromJSON(AudiencesAPIlocalVarJSON);
        cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    if(keyQuery_ownership_type){
        free(keyQuery_ownership_type);
        keyQuery_ownership_type = NULL;
    }
    if(keyPairQuery_ownership_type){
        keyValuePair_free(keyPairQuery_ownership_type);
        keyPairQuery_ownership_type = NULL;
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

// Update audience
//
// Update an existing audience for the ad account.
//
ad_accounts_audience_t*
AudiencesAPI_audiencesUpdate(apiClient_t *apiClient, char *audience_id, char *ad_account_id, ad_accounts_audience_update_t *ad_accounts_audience_update)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/audiences/{audience_id}");

    if(!audience_id)
        goto end;
    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_audience_id = strlen(audience_id)+3 + strlen(ad_account_id)+3 + sizeof("{ audience_id }") - 1;
    if(audience_id == NULL) {
        goto end;
    }
    char* localVarToReplace_audience_id = malloc(sizeOfPathParams_audience_id);
    sprintf(localVarToReplace_audience_id, "{%s}", "audience_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_audience_id, audience_id);

    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(audience_id)+3 + strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_ad_accounts_audience_update = NULL;
    if (ad_accounts_audience_update != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_ad_accounts_audience_update = ad_accounts_audience_update_convertToJSON(ad_accounts_audience_update);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ad_accounts_audience_update);
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
    ad_accounts_audience_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_accounts_audience_parseFromJSON(AudiencesAPIlocalVarJSON);
        cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    free(localVarToReplace_audience_id);
    free(localVarToReplace_ad_account_id);
    if (localVarSingleItemJSON_ad_accounts_audience_update) {
        cJSON_Delete(localVarSingleItemJSON_ad_accounts_audience_update);
        localVarSingleItemJSON_ad_accounts_audience_update = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

