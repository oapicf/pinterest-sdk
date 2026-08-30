#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "LeadFormsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for LeadFormsAPI_leadFormsList

static char* leadFormsList__ToString(pinterest_rest_api_leadFormsList_order_e ){
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return Array[];
}

static pinterest_rest_api_leadFormsList_order_e leadFormsList__FromString(char* ){
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
// Function leadFormsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *leadFormsList__convertToJSON(pinterest_rest_api_leadFormsList_order_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function leadFormsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_leadFormsList_order_e leadFormsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_leadFormsList_order_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Get lead form by id
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_form_t*
LeadFormsAPI_leadFormGet(apiClient_t *apiClient, char *lead_form_id, char *ad_account_id)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}");

    if(!lead_form_id)
        goto end;
    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_lead_form_id = strlen(lead_form_id)+3 + strlen(ad_account_id)+3 + sizeof("{ lead_form_id }") - 1;
    if(lead_form_id == NULL) {
        goto end;
    }
    char* localVarToReplace_lead_form_id = malloc(sizeOfPathParams_lead_form_id);
    sprintf(localVarToReplace_lead_form_id, "{%s}", "lead_form_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_lead_form_id, lead_form_id);

    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(lead_form_id)+3 + strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
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
    lead_form_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LeadFormsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = lead_form_parseFromJSON(LeadFormsAPIlocalVarJSON);
        cJSON_Delete(LeadFormsAPIlocalVarJSON);
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
    free(localVarToReplace_lead_form_id);
    free(localVarToReplace_ad_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create lead form test data
//
// Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
//
lead_form_test_t*
LeadFormsAPI_leadFormTestCreate(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id, lead_form_test_create_t *lead_form_test_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test");

    if(!ad_account_id)
        goto end;
    if(!lead_form_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(lead_form_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_lead_form_id = strlen(ad_account_id)+3 + strlen(lead_form_id)+3 + sizeof("{ lead_form_id }") - 1;
    if(lead_form_id == NULL) {
        goto end;
    }
    char* localVarToReplace_lead_form_id = malloc(sizeOfPathParams_lead_form_id);
    sprintf(localVarToReplace_lead_form_id, "{%s}", "lead_form_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_lead_form_id, lead_form_id);



    // Body Param
    cJSON *localVarSingleItemJSON_lead_form_test_create = NULL;
    if (lead_form_test_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_lead_form_test_create = lead_form_test_create_convertToJSON(lead_form_test_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_lead_form_test_create);
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
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    lead_form_test_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LeadFormsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = lead_form_test_parseFromJSON(LeadFormsAPIlocalVarJSON);
        cJSON_Delete(LeadFormsAPIlocalVarJSON);
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
    free(localVarToReplace_lead_form_id);
    if (localVarSingleItemJSON_lead_form_test_create) {
        cJSON_Delete(localVarSingleItemJSON_lead_form_test_create);
        localVarSingleItemJSON_lead_form_test_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_create_200_response_t*
LeadFormsAPI_leadFormsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *lead_form_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/lead_forms");

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
    //notstring
    cJSON *localVar_lead_form_create = NULL;
    cJSON *localVarItemJSON_lead_form_create = NULL;
    cJSON *localVarSingleItemJSON_lead_form_create = NULL;
    if (lead_form_create != NULL)
    {
        localVarItemJSON_lead_form_create = cJSON_CreateObject();
        localVarSingleItemJSON_lead_form_create = cJSON_AddArrayToObject(localVarItemJSON_lead_form_create, "lead_form_create");
        if (localVarSingleItemJSON_lead_form_create == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *lead_form_createBodyListEntry;
    list_ForEach(lead_form_createBodyListEntry, lead_form_create)
    {
        localVar_lead_form_create = lead_form_create_convertToJSON(lead_form_createBodyListEntry->data);
        if(localVar_lead_form_create == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_lead_form_create, localVar_lead_form_create);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_lead_form_create);
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
    lead_forms_create_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LeadFormsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = lead_forms_create_200_response_parseFromJSON(LeadFormsAPIlocalVarJSON);
        cJSON_Delete(LeadFormsAPIlocalVarJSON);
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
    if (localVarItemJSON_lead_form_create) {
        cJSON_Delete(localVarItemJSON_lead_form_create);
        localVarItemJSON_lead_form_create = NULL;
    }
    if (localVarSingleItemJSON_lead_form_create) {
        cJSON_Delete(localVarSingleItemJSON_lead_form_create);
        localVarSingleItemJSON_lead_form_create = NULL;
    }
    if (localVar_lead_form_create) {
        cJSON_Delete(localVar_lead_form_create);
        localVar_lead_form_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_list_200_response_t*
LeadFormsAPI_leadFormsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/lead_forms");

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
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(leadFormsList__ToString(
        &valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
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
    lead_forms_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LeadFormsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = lead_forms_list_200_response_parseFromJSON(LeadFormsAPIlocalVarJSON);
        cJSON_Delete(LeadFormsAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_create_200_response_t*
LeadFormsAPI_leadFormsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *lead_form_batch_update)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/lead_forms");

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
    //notstring
    cJSON *localVar_lead_form_batch_update = NULL;
    cJSON *localVarItemJSON_lead_form_batch_update = NULL;
    cJSON *localVarSingleItemJSON_lead_form_batch_update = NULL;
    if (lead_form_batch_update != NULL)
    {
        localVarItemJSON_lead_form_batch_update = cJSON_CreateObject();
        localVarSingleItemJSON_lead_form_batch_update = cJSON_AddArrayToObject(localVarItemJSON_lead_form_batch_update, "lead_form_batch_update");
        if (localVarSingleItemJSON_lead_form_batch_update == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *lead_form_batch_updateBodyListEntry;
    list_ForEach(lead_form_batch_updateBodyListEntry, lead_form_batch_update)
    {
        localVar_lead_form_batch_update = lead_form_batch_update_convertToJSON(lead_form_batch_updateBodyListEntry->data);
        if(localVar_lead_form_batch_update == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_lead_form_batch_update, localVar_lead_form_batch_update);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_lead_form_batch_update);
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
    lead_forms_create_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LeadFormsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = lead_forms_create_200_response_parseFromJSON(LeadFormsAPIlocalVarJSON);
        cJSON_Delete(LeadFormsAPIlocalVarJSON);
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
    if (localVarItemJSON_lead_form_batch_update) {
        cJSON_Delete(localVarItemJSON_lead_form_batch_update);
        localVarItemJSON_lead_form_batch_update = NULL;
    }
    if (localVarSingleItemJSON_lead_form_batch_update) {
        cJSON_Delete(localVarSingleItemJSON_lead_form_batch_update);
        localVarSingleItemJSON_lead_form_batch_update = NULL;
    }
    if (localVar_lead_form_batch_update) {
        cJSON_Delete(localVar_lead_form_batch_update);
        localVar_lead_form_batch_update = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

