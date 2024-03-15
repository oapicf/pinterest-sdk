#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "SearchAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Search pins by a given search term
//
// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
//
search_partner_pins_200_response_t*
SearchAPI_searchPartnerPins(apiClient_t *apiClient, char *term, char *country_code, char *bookmark, char *locale, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/search/partner/pins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/search/partner/pins");




    // query parameters
    char *keyQuery_term = NULL;
    char * valueQuery_term = NULL;
    keyValuePair_t *keyPairQuery_term = 0;
    if (term)
    {
        keyQuery_term = strdup("term");
        valueQuery_term = strdup((term));
        keyPairQuery_term = keyValuePair_create(keyQuery_term, valueQuery_term);
        list_addElement(localVarQueryParameters,keyPairQuery_term);
    }

    // query parameters
    char *keyQuery_country_code = NULL;
    char * valueQuery_country_code = NULL;
    keyValuePair_t *keyPairQuery_country_code = 0;
    if (country_code)
    {
        keyQuery_country_code = strdup("country_code");
        valueQuery_country_code = strdup((country_code));
        keyPairQuery_country_code = keyValuePair_create(keyQuery_country_code, valueQuery_country_code);
        list_addElement(localVarQueryParameters,keyPairQuery_country_code);
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
    char *keyQuery_locale = NULL;
    char * valueQuery_locale = NULL;
    keyValuePair_t *keyPairQuery_locale = 0;
    if (locale)
    {
        keyQuery_locale = strdup("locale");
        valueQuery_locale = strdup((locale));
        keyPairQuery_locale = keyValuePair_create(keyQuery_locale, valueQuery_locale);
        list_addElement(localVarQueryParameters,keyPairQuery_locale);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
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
    //    printf("%s\n","Invalid pins");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *SearchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    search_partner_pins_200_response_t *elementToReturn = search_partner_pins_200_response_parseFromJSON(SearchAPIlocalVarJSON);
    cJSON_Delete(SearchAPIlocalVarJSON);
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
    if(keyQuery_term){
        free(keyQuery_term);
        keyQuery_term = NULL;
    }
    if(valueQuery_term){
        free(valueQuery_term);
        valueQuery_term = NULL;
    }
    if(keyPairQuery_term){
        keyValuePair_free(keyPairQuery_term);
        keyPairQuery_term = NULL;
    }
    if(keyQuery_country_code){
        free(keyQuery_country_code);
        keyQuery_country_code = NULL;
    }
    if(valueQuery_country_code){
        free(valueQuery_country_code);
        valueQuery_country_code = NULL;
    }
    if(keyPairQuery_country_code){
        keyValuePair_free(keyPairQuery_country_code);
        keyPairQuery_country_code = NULL;
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
    if(keyQuery_locale){
        free(keyQuery_locale);
        keyQuery_locale = NULL;
    }
    if(valueQuery_locale){
        free(valueQuery_locale);
        valueQuery_locale = NULL;
    }
    if(keyPairQuery_locale){
        keyValuePair_free(keyPairQuery_locale);
        keyPairQuery_locale = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Search user's boards
//
// Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
//
search_user_boards_get_200_response_t*
SearchAPI_searchUserBoardsGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, char *query)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/search/boards")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/search/boards");




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
    char *keyQuery_query = NULL;
    char * valueQuery_query = NULL;
    keyValuePair_t *keyPairQuery_query = 0;
    if (query)
    {
        keyQuery_query = strdup("query");
        valueQuery_query = strdup((query));
        keyPairQuery_query = keyValuePair_create(keyQuery_query, valueQuery_query);
        list_addElement(localVarQueryParameters,keyPairQuery_query);
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
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *SearchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    search_user_boards_get_200_response_t *elementToReturn = search_user_boards_get_200_response_parseFromJSON(SearchAPIlocalVarJSON);
    cJSON_Delete(SearchAPIlocalVarJSON);
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
    if(keyQuery_query){
        free(keyQuery_query);
        keyQuery_query = NULL;
    }
    if(valueQuery_query){
        free(valueQuery_query);
        valueQuery_query = NULL;
    }
    if(keyPairQuery_query){
        keyValuePair_free(keyPairQuery_query);
        keyPairQuery_query = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Search user's Pins
//
// Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
//
pins_list_200_response_t*
SearchAPI_searchUserPinsList(apiClient_t *apiClient, char *query, char *ad_account_id, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/search/pins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/search/pins");




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
    char *keyQuery_query = NULL;
    char * valueQuery_query = NULL;
    keyValuePair_t *keyPairQuery_query = 0;
    if (query)
    {
        keyQuery_query = strdup("query");
        valueQuery_query = strdup((query));
        keyPairQuery_query = keyValuePair_create(keyQuery_query, valueQuery_query);
        list_addElement(localVarQueryParameters,keyPairQuery_query);
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
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","User not found");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *SearchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    pins_list_200_response_t *elementToReturn = pins_list_200_response_parseFromJSON(SearchAPIlocalVarJSON);
    cJSON_Delete(SearchAPIlocalVarJSON);
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
    if(keyQuery_query){
        free(keyQuery_query);
        keyQuery_query = NULL;
    }
    if(valueQuery_query){
        free(valueQuery_query);
        valueQuery_query = NULL;
    }
    if(keyPairQuery_query){
        keyValuePair_free(keyPairQuery_query);
        keyPairQuery_query = NULL;
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

