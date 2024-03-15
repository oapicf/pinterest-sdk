#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "BulkAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Get advertiser entities in bulk
//
// Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
//
bulk_download_response_t*
BulkAPI_bulkDownloadCreate(apiClient_t *apiClient, char *ad_account_id, bulk_download_request_t *bulk_download_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/bulk/download")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/bulk/download");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_bulk_download_request = NULL;
    if (bulk_download_request != NULL)
    {
        //string
        localVarSingleItemJSON_bulk_download_request = bulk_download_request_convertToJSON(bulk_download_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_bulk_download_request);
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
    cJSON *BulkAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    bulk_download_response_t *elementToReturn = bulk_download_response_parseFromJSON(BulkAPIlocalVarJSON);
    cJSON_Delete(BulkAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_bulk_download_request) {
        cJSON_Delete(localVarSingleItemJSON_bulk_download_request);
        localVarSingleItemJSON_bulk_download_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Download advertiser entities in bulk
//
// Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
//
bulk_upsert_status_response_t*
BulkAPI_bulkRequestGet(apiClient_t *apiClient, char *ad_account_id, char *bulk_request_id, int *include_details)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(bulk_request_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_bulk_request_id = strlen(ad_account_id)+3 + strlen(bulk_request_id)+3 + strlen("{ bulk_request_id }");
    if(bulk_request_id == NULL) {
        goto end;
    }
    char* localVarToReplace_bulk_request_id = malloc(sizeOfPathParams_bulk_request_id);
    sprintf(localVarToReplace_bulk_request_id, "{%s}", "bulk_request_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_bulk_request_id, bulk_request_id);



    // query parameters
    char *keyQuery_include_details = NULL;
    char * valueQuery_include_details = NULL;
    keyValuePair_t *keyPairQuery_include_details = 0;
    if (include_details)
    {
        keyQuery_include_details = strdup("include_details");
        valueQuery_include_details = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_details, MAX_NUMBER_LENGTH, "%d", *include_details);
        keyPairQuery_include_details = keyValuePair_create(keyQuery_include_details, valueQuery_include_details);
        list_addElement(localVarQueryParameters,keyPairQuery_include_details);
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
    cJSON *BulkAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    bulk_upsert_status_response_t *elementToReturn = bulk_upsert_status_response_parseFromJSON(BulkAPIlocalVarJSON);
    cJSON_Delete(BulkAPIlocalVarJSON);
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
    free(localVarToReplace_bulk_request_id);
    if(keyQuery_include_details){
        free(keyQuery_include_details);
        keyQuery_include_details = NULL;
    }
    if(valueQuery_include_details){
        free(valueQuery_include_details);
        valueQuery_include_details = NULL;
    }
    if(keyPairQuery_include_details){
        keyValuePair_free(keyPairQuery_include_details);
        keyPairQuery_include_details = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create/update ad entities in bulk
//
// Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
//
bulk_upsert_response_t*
BulkAPI_bulkUpsertCreate(apiClient_t *apiClient, char *ad_account_id, bulk_upsert_request_t *bulk_upsert_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/bulk/upsert")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/bulk/upsert");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_bulk_upsert_request = NULL;
    if (bulk_upsert_request != NULL)
    {
        //string
        localVarSingleItemJSON_bulk_upsert_request = bulk_upsert_request_convertToJSON(bulk_upsert_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_bulk_upsert_request);
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
    cJSON *BulkAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    bulk_upsert_response_t *elementToReturn = bulk_upsert_response_parseFromJSON(BulkAPIlocalVarJSON);
    cJSON_Delete(BulkAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_bulk_upsert_request) {
        cJSON_Delete(localVarSingleItemJSON_bulk_upsert_request);
        localVarSingleItemJSON_bulk_upsert_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

