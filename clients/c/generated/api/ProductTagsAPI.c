#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "ProductTagsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Add product tags to pin
//
// Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
//
product_tags_response_t*
ProductTagsAPI_productTagsBulkAdd(apiClient_t *apiClient, char *pin_id, product_tags_bulk_add_request_t *product_tags_bulk_add_request)
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
    char *localVarPath = strdup("/pins/{pin_id}/product_tags");

    if(!pin_id)
        goto end;


    // Path Params
    long sizeOfPathParams_pin_id = strlen(pin_id)+3 + sizeof("{ pin_id }") - 1;
    if(pin_id == NULL) {
        goto end;
    }
    char* localVarToReplace_pin_id = malloc(sizeOfPathParams_pin_id);
    sprintf(localVarToReplace_pin_id, "{%s}", "pin_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_pin_id, pin_id);



    // Body Param
    cJSON *localVarSingleItemJSON_product_tags_bulk_add_request = NULL;
    if (product_tags_bulk_add_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_product_tags_bulk_add_request = product_tags_bulk_add_request_convertToJSON(product_tags_bulk_add_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_product_tags_bulk_add_request);
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
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request contains ineligible product tags.");
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
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    product_tags_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProductTagsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = product_tags_response_parseFromJSON(ProductTagsAPIlocalVarJSON);
        cJSON_Delete(ProductTagsAPIlocalVarJSON);
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
    free(localVarToReplace_pin_id);
    if (localVarSingleItemJSON_product_tags_bulk_add_request) {
        cJSON_Delete(localVarSingleItemJSON_product_tags_bulk_add_request);
        localVarSingleItemJSON_product_tags_bulk_add_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete product tags from pin
//
// Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
//
void
ProductTagsAPI_productTagsBulkDelete(apiClient_t *apiClient, char *pin_id, product_tags_bulk_delete_request_t *product_tags_bulk_delete_request)
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
    char *localVarPath = strdup("/pins/{pin_id}/product_tags/bulk-delete");

    if(!pin_id)
        goto end;


    // Path Params
    long sizeOfPathParams_pin_id = strlen(pin_id)+3 + sizeof("{ pin_id }") - 1;
    if(pin_id == NULL) {
        goto end;
    }
    char* localVarToReplace_pin_id = malloc(sizeOfPathParams_pin_id);
    sprintf(localVarToReplace_pin_id, "{%s}", "pin_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_pin_id, pin_id);



    // Body Param
    cJSON *localVarSingleItemJSON_product_tags_bulk_delete_request = NULL;
    if (product_tags_bulk_delete_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_product_tags_bulk_delete_request = product_tags_bulk_delete_request_convertToJSON(product_tags_bulk_delete_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_product_tags_bulk_delete_request);
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
    //if (apiClient->response_code == 204) {
    //    printf("%s\n","Resource deleted successfully.");
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
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_pin_id);
    if (localVarSingleItemJSON_product_tags_bulk_delete_request) {
        cJSON_Delete(localVarSingleItemJSON_product_tags_bulk_delete_request);
        localVarSingleItemJSON_product_tags_bulk_delete_request = NULL;
    }
    free(localVarBodyParameters);

}

// Get product tags for pin
//
// Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
//
product_tags_response_t*
ProductTagsAPI_productTagsList(apiClient_t *apiClient, char *pin_id)
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
    char *localVarPath = strdup("/pins/{pin_id}/product_tags");

    if(!pin_id)
        goto end;


    // Path Params
    long sizeOfPathParams_pin_id = strlen(pin_id)+3 + sizeof("{ pin_id }") - 1;
    if(pin_id == NULL) {
        goto end;
    }
    char* localVarToReplace_pin_id = malloc(sizeOfPathParams_pin_id);
    sprintf(localVarToReplace_pin_id, "{%s}", "pin_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_pin_id, pin_id);


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
    product_tags_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProductTagsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = product_tags_response_parseFromJSON(ProductTagsAPIlocalVarJSON);
        cJSON_Delete(ProductTagsAPIlocalVarJSON);
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
    free(localVarToReplace_pin_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

