#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ProductGroupsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Get catalog product groups
//
// This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.
//
ad_accounts_catalogs_product_groups_list_200_response_t*
ProductGroupsAPI_adAccountsCatalogsProductGroupsList(apiClient_t *apiClient, char *ad_account_id, char *feed_profile_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/product_groups/catalogs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/product_groups/catalogs");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    char *keyQuery_feed_profile_id = NULL;
    char * valueQuery_feed_profile_id = NULL;
    keyValuePair_t *keyPairQuery_feed_profile_id = 0;
    if (feed_profile_id)
    {
        keyQuery_feed_profile_id = strdup("feed_profile_id");
        valueQuery_feed_profile_id = strdup((feed_profile_id));
        keyPairQuery_feed_profile_id = keyValuePair_create(keyQuery_feed_profile_id, valueQuery_feed_profile_id);
        list_addElement(localVarQueryParameters,keyPairQuery_feed_profile_id);
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
    //    printf("%s\n","Invalid ad account ads parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Merchant data not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *ProductGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_accounts_catalogs_product_groups_list_200_response_t *elementToReturn = ad_accounts_catalogs_product_groups_list_200_response_parseFromJSON(ProductGroupsAPIlocalVarJSON);
    cJSON_Delete(ProductGroupsAPIlocalVarJSON);
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
    if(keyQuery_feed_profile_id){
        free(keyQuery_feed_profile_id);
        keyQuery_feed_profile_id = NULL;
    }
    if(valueQuery_feed_profile_id){
        free(valueQuery_feed_profile_id);
        valueQuery_feed_profile_id = NULL;
    }
    if(keyPairQuery_feed_profile_id){
        keyValuePair_free(keyPairQuery_feed_profile_id);
        keyPairQuery_feed_profile_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

