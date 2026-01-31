#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "CustomerListUploadsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Create customer list upload
//
// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
//
customer_list_upload_create_response_t*
CustomerListUploadsAPI_customerListUploadsCreate(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, customer_list_upload_create_request_t *customer_list_upload_create_request)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads");

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
    cJSON *localVarSingleItemJSON_customer_list_upload_create_request = NULL;
    if (customer_list_upload_create_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_customer_list_upload_create_request = customer_list_upload_create_request_convertToJSON(customer_list_upload_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_customer_list_upload_create_request);
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
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    customer_list_upload_create_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListUploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_list_upload_create_response_parseFromJSON(CustomerListUploadsAPIlocalVarJSON);
        cJSON_Delete(CustomerListUploadsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_customer_list_upload_create_request) {
        cJSON_Delete(localVarSingleItemJSON_customer_list_upload_create_request);
        localVarSingleItemJSON_customer_list_upload_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get customer list upload
//
// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
//
customer_list_upload_response_t*
CustomerListUploadsAPI_customerListUploadsGet(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, char *customer_list_upload_id)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}");

    if(!ad_account_id)
        goto end;
    if(!customer_list_id)
        goto end;
    if(!customer_list_upload_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen(customer_list_upload_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_customer_list_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen(customer_list_upload_id)+3 + sizeof("{ customer_list_id }") - 1;
    if(customer_list_id == NULL) {
        goto end;
    }
    char* localVarToReplace_customer_list_id = malloc(sizeOfPathParams_customer_list_id);
    sprintf(localVarToReplace_customer_list_id, "{%s}", "customer_list_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_customer_list_id, customer_list_id);

    // Path Params
    long sizeOfPathParams_customer_list_upload_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen(customer_list_upload_id)+3 + sizeof("{ customer_list_upload_id }") - 1;
    if(customer_list_upload_id == NULL) {
        goto end;
    }
    char* localVarToReplace_customer_list_upload_id = malloc(sizeOfPathParams_customer_list_upload_id);
    sprintf(localVarToReplace_customer_list_upload_id, "{%s}", "customer_list_upload_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_customer_list_upload_id, customer_list_upload_id);


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
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    customer_list_upload_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListUploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_list_upload_response_parseFromJSON(CustomerListUploadsAPIlocalVarJSON);
        cJSON_Delete(CustomerListUploadsAPIlocalVarJSON);
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
    free(localVarToReplace_customer_list_upload_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Run customer list upload
//
// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
//
customer_list_upload_response_t*
CustomerListUploadsAPI_customerListUploadsRun(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, char *customer_list_upload_id)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run");

    if(!ad_account_id)
        goto end;
    if(!customer_list_id)
        goto end;
    if(!customer_list_upload_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen(customer_list_upload_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_customer_list_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen(customer_list_upload_id)+3 + sizeof("{ customer_list_id }") - 1;
    if(customer_list_id == NULL) {
        goto end;
    }
    char* localVarToReplace_customer_list_id = malloc(sizeOfPathParams_customer_list_id);
    sprintf(localVarToReplace_customer_list_id, "{%s}", "customer_list_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_customer_list_id, customer_list_id);

    // Path Params
    long sizeOfPathParams_customer_list_upload_id = strlen(ad_account_id)+3 + strlen(customer_list_id)+3 + strlen(customer_list_upload_id)+3 + sizeof("{ customer_list_upload_id }") - 1;
    if(customer_list_upload_id == NULL) {
        goto end;
    }
    char* localVarToReplace_customer_list_upload_id = malloc(sizeOfPathParams_customer_list_upload_id);
    sprintf(localVarToReplace_customer_list_upload_id, "{%s}", "customer_list_upload_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_customer_list_upload_id, customer_list_upload_id);


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
    customer_list_upload_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListUploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_list_upload_response_parseFromJSON(CustomerListUploadsAPIlocalVarJSON);
        cJSON_Delete(CustomerListUploadsAPIlocalVarJSON);
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
    free(localVarToReplace_customer_list_upload_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

