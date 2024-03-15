#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "IntegrationsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Delete commerce integration
//
// Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
void
IntegrationsAPI_integrationsCommerceDel(apiClient_t *apiClient, char *external_business_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/integrations/commerce/{external_business_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/integrations/commerce/{external_business_id}");


    // Path Params
    long sizeOfPathParams_external_business_id = strlen(external_business_id)+3 + strlen("{ external_business_id }");
    if(external_business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_external_business_id = malloc(sizeOfPathParams_external_business_id);
    sprintf(localVarToReplace_external_business_id, "{%s}", "external_business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_external_business_id, external_business_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 204) {
    //    printf("%s\n","Commerce Integration deleted successfully");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error.");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_external_business_id);

}

// Get commerce integration
//
// Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t*
IntegrationsAPI_integrationsCommerceGet(apiClient_t *apiClient, char *external_business_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/integrations/commerce/{external_business_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/integrations/commerce/{external_business_id}");


    // Path Params
    long sizeOfPathParams_external_business_id = strlen(external_business_id)+3 + strlen("{ external_business_id }");
    if(external_business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_external_business_id = malloc(sizeOfPathParams_external_business_id);
    sprintf(localVarToReplace_external_business_id, "{%s}", "external_business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_external_business_id, external_business_id);


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
    //    printf("%s\n","Integration not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 409) {
    //    printf("%s\n","Can&#39;t access this integration metadata.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error.");
    //}
    //nonprimitive not container
    cJSON *IntegrationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    integration_metadata_t *elementToReturn = integration_metadata_parseFromJSON(IntegrationsAPIlocalVarJSON);
    cJSON_Delete(IntegrationsAPIlocalVarJSON);
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
    free(localVarToReplace_external_business_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update commerce integration
//
// Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t*
IntegrationsAPI_integrationsCommercePatch(apiClient_t *apiClient, char *external_business_id, integration_request_patch_t *integration_request_patch)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/integrations/commerce/{external_business_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/integrations/commerce/{external_business_id}");


    // Path Params
    long sizeOfPathParams_external_business_id = strlen(external_business_id)+3 + strlen("{ external_business_id }");
    if(external_business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_external_business_id = malloc(sizeOfPathParams_external_business_id);
    sprintf(localVarToReplace_external_business_id, "{%s}", "external_business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_external_business_id, external_business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_integration_request_patch = NULL;
    if (integration_request_patch != NULL)
    {
        //string
        localVarSingleItemJSON_integration_request_patch = integration_request_patch_convertToJSON(integration_request_patch);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_integration_request_patch);
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
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Integration not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 409) {
    //    printf("%s\n","Can&#39;t access this integration metadata.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error.");
    //}
    //nonprimitive not container
    cJSON *IntegrationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    integration_metadata_t *elementToReturn = integration_metadata_parseFromJSON(IntegrationsAPIlocalVarJSON);
    cJSON_Delete(IntegrationsAPIlocalVarJSON);
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
    free(localVarToReplace_external_business_id);
    if (localVarSingleItemJSON_integration_request_patch) {
        cJSON_Delete(localVarSingleItemJSON_integration_request_patch);
        localVarSingleItemJSON_integration_request_patch = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create commerce integration
//
// Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t*
IntegrationsAPI_integrationsCommercePost(apiClient_t *apiClient, integration_request_t *integration_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/integrations/commerce")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/integrations/commerce");




    // Body Param
    cJSON *localVarSingleItemJSON_integration_request = NULL;
    if (integration_request != NULL)
    {
        //string
        localVarSingleItemJSON_integration_request = integration_request_convertToJSON(integration_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_integration_request);
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
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Integration not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 409) {
    //    printf("%s\n","Can&#39;t access this integration metadata.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error.");
    //}
    //nonprimitive not container
    cJSON *IntegrationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    integration_metadata_t *elementToReturn = integration_metadata_parseFromJSON(IntegrationsAPIlocalVarJSON);
    cJSON_Delete(IntegrationsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_integration_request) {
        cJSON_Delete(localVarSingleItemJSON_integration_request);
        localVarSingleItemJSON_integration_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get integration metadata
//
// Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_record_t*
IntegrationsAPI_integrationsGetById(apiClient_t *apiClient, char *id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/integrations/{id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/integrations/{id}");


    // Path Params
    long sizeOfPathParams_id = strlen(id)+3 + strlen("{ id }");
    if(id == NULL) {
        goto end;
    }
    char* localVarToReplace_id = malloc(sizeOfPathParams_id);
    sprintf(localVarToReplace_id, "{%s}", "id");

    localVarPath = strReplace(localVarPath, localVarToReplace_id, id);


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
    //    printf("%s\n","Integration not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error.");
    //}
    //nonprimitive not container
    cJSON *IntegrationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    integration_record_t *elementToReturn = integration_record_parseFromJSON(IntegrationsAPIlocalVarJSON);
    cJSON_Delete(IntegrationsAPIlocalVarJSON);
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
    free(localVarToReplace_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get integration metadata list
//
// Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integrations_get_list_200_response_t*
IntegrationsAPI_integrationsGetList(apiClient_t *apiClient, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/integrations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/integrations");




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
    //    printf("%s\n","Unexpected error.");
    //}
    //nonprimitive not container
    cJSON *IntegrationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    integrations_get_list_200_response_t *elementToReturn = integrations_get_list_200_response_parseFromJSON(IntegrationsAPIlocalVarJSON);
    cJSON_Delete(IntegrationsAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Receives batched logs from integration applications.
//
// This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_logs_success_response_t*
IntegrationsAPI_integrationsLogsPost(apiClient_t *apiClient, integration_logs_request_t *integration_logs_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/integrations/logs")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/integrations/logs");




    // Body Param
    cJSON *localVarSingleItemJSON_integration_logs_request = NULL;
    if (integration_logs_request != NULL)
    {
        //string
        localVarSingleItemJSON_integration_logs_request = integration_logs_request_convertToJSON(integration_logs_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_integration_logs_request);
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
    //    printf("%s\n","Success.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Bad request.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *IntegrationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    integration_logs_success_response_t *elementToReturn = integration_logs_success_response_parseFromJSON(IntegrationsAPIlocalVarJSON);
    cJSON_Delete(IntegrationsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_integration_logs_request) {
        cJSON_Delete(localVarSingleItemJSON_integration_logs_request);
        localVarSingleItemJSON_integration_logs_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

