#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AdvancedAuctionAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Get item bid options (POST)
//
// Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
//
advanced_auction_items_t*
AdvancedAuctionAPI_advancedAuctionItemsGetPost(apiClient_t *apiClient, advanced_auction_items_get_request_t *advanced_auction_items_get_request, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/advanced_auction/items/get")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/advanced_auction/items/get");




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

    // Body Param
    cJSON *localVarSingleItemJSON_advanced_auction_items_get_request = NULL;
    if (advanced_auction_items_get_request != NULL)
    {
        //string
        localVarSingleItemJSON_advanced_auction_items_get_request = advanced_auction_items_get_request_convertToJSON(advanced_auction_items_get_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_advanced_auction_items_get_request);
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
    //    printf("%s\n","Response containing the bid option values for the requested retail catalog items. Items that don&#39;t exist or do not have bid options set won&#39;t be present in the response.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid request parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Not authenticated to get item bid options");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to get item bid options");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Internal error");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdvancedAuctionAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    advanced_auction_items_t *elementToReturn = advanced_auction_items_parseFromJSON(AdvancedAuctionAPIlocalVarJSON);
    cJSON_Delete(AdvancedAuctionAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_advanced_auction_items_get_request) {
        cJSON_Delete(localVarSingleItemJSON_advanced_auction_items_get_request);
        localVarSingleItemJSON_advanced_auction_items_get_request = NULL;
    }
    free(localVarBodyParameters);
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

// Operate on item level bid options
//
// This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
//
advanced_auction_processed_items_t*
AdvancedAuctionAPI_advancedAuctionItemsSubmitPost(apiClient_t *apiClient, advanced_auction_items_submit_request_t *advanced_auction_items_submit_request, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/advanced_auction/items/submit")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/advanced_auction/items/submit");




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

    // Body Param
    cJSON *localVarSingleItemJSON_advanced_auction_items_submit_request = NULL;
    if (advanced_auction_items_submit_request != NULL)
    {
        //string
        localVarSingleItemJSON_advanced_auction_items_submit_request = advanced_auction_items_submit_request_convertToJSON(advanced_auction_items_submit_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_advanced_auction_items_submit_request);
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
    //    printf("%s\n","Response containing the results of the item bid options operations");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid request parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Not authenticated to post item bid options");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to post item bid options");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Internal error");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdvancedAuctionAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    advanced_auction_processed_items_t *elementToReturn = advanced_auction_processed_items_parseFromJSON(AdvancedAuctionAPIlocalVarJSON);
    cJSON_Delete(AdvancedAuctionAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_advanced_auction_items_submit_request) {
        cJSON_Delete(localVarSingleItemJSON_advanced_auction_items_submit_request);
        localVarSingleItemJSON_advanced_auction_items_submit_request = NULL;
    }
    free(localVarBodyParameters);
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

