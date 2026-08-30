#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "CustomerListUploadsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Create customer list upload
//
// Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
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
// Get the metadata for a given upload by its ID.
//
customer_list_upload_t*
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
    customer_list_upload_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListUploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_list_upload_parseFromJSON(CustomerListUploadsAPIlocalVarJSON);
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
// Begin processing a customer list upload.
//
customer_list_upload_t*
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
    customer_list_upload_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CustomerListUploadsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = customer_list_upload_parseFromJSON(CustomerListUploadsAPIlocalVarJSON);
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

