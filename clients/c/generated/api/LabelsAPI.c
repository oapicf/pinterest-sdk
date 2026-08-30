#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "LabelsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum ENTITYSTATUSES for LabelsAPI_labelsList

static char* labelsList_ENTITYSTATUSES_ToString(pinterest_rest_api_labelsList_entity_statuses_e ENTITYSTATUSES){
    char *ENTITYSTATUSESArray[] =  { "NULL", "ACTIVE", "ARCHIVED" };
    return ENTITYSTATUSESArray[ENTITYSTATUSES];
}

static pinterest_rest_api_labelsList_entity_statuses_e labelsList_ENTITYSTATUSES_FromString(char* ENTITYSTATUSES){
    int stringToReturn = 0;
    char *ENTITYSTATUSESArray[] =  { "NULL", "ACTIVE", "ARCHIVED" };
    size_t sizeofArray = sizeof(ENTITYSTATUSESArray) / sizeof(ENTITYSTATUSESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ENTITYSTATUSES, ENTITYSTATUSESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function labelsList_ENTITYSTATUSES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *labelsList_ENTITYSTATUSES_convertToJSON(pinterest_rest_api_labelsList_entity_statuses_e ENTITYSTATUSES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function labelsList_ENTITYSTATUSES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_labelsList_entity_statuses_e labelsList_ENTITYSTATUSES_parseFromJSON(cJSON* ENTITYSTATUSESJSON) {
    pinterest_rest_api_labelsList_entity_statuses_e ENTITYSTATUSESVariable = 0;
    return ENTITYSTATUSESVariable;
end:
    return 0;
}
*/

// Functions for enum LABELTYPES for LabelsAPI_labelsList

static char* labelsList_LABELTYPES_ToString(pinterest_rest_api_labelsList_label_types_e LABELTYPES){
    char *LABELTYPESArray[] =  { "NULL", "BRAND", "CUSTOM" };
    return LABELTYPESArray[LABELTYPES];
}

static pinterest_rest_api_labelsList_label_types_e labelsList_LABELTYPES_FromString(char* LABELTYPES){
    int stringToReturn = 0;
    char *LABELTYPESArray[] =  { "NULL", "BRAND", "CUSTOM" };
    size_t sizeofArray = sizeof(LABELTYPESArray) / sizeof(LABELTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(LABELTYPES, LABELTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function labelsList_LABELTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *labelsList_LABELTYPES_convertToJSON(pinterest_rest_api_labelsList_label_types_e LABELTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function labelsList_LABELTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_labelsList_label_types_e labelsList_LABELTYPES_parseFromJSON(cJSON* LABELTYPESJSON) {
    pinterest_rest_api_labelsList_label_types_e LABELTYPESVariable = 0;
    return LABELTYPESVariable;
end:
    return 0;
}
*/


// Apply label to entity
//
//   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
//
labeled_entities_t*
LabelsAPI_labelsApply(apiClient_t *apiClient, char *ad_account_id, char *label_id, labeled_entities_create_t *labeled_entities_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/labels/{label_id}/apply");

    if(!ad_account_id)
        goto end;
    if(!label_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(label_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_label_id = strlen(ad_account_id)+3 + strlen(label_id)+3 + sizeof("{ label_id }") - 1;
    if(label_id == NULL) {
        goto end;
    }
    char* localVarToReplace_label_id = malloc(sizeOfPathParams_label_id);
    sprintf(localVarToReplace_label_id, "{%s}", "label_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_label_id, label_id);



    // Body Param
    cJSON *localVarSingleItemJSON_labeled_entities_create = NULL;
    if (labeled_entities_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_labeled_entities_create = labeled_entities_create_convertToJSON(labeled_entities_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_labeled_entities_create);
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
    labeled_entities_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LabelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = labeled_entities_parseFromJSON(LabelsAPIlocalVarJSON);
        cJSON_Delete(LabelsAPIlocalVarJSON);
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
    free(localVarToReplace_label_id);
    if (localVarSingleItemJSON_labeled_entities_create) {
        cJSON_Delete(localVarSingleItemJSON_labeled_entities_create);
        localVarSingleItemJSON_labeled_entities_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
//
labels_response_t*
LabelsAPI_labelsCreate(apiClient_t *apiClient, char *ad_account_id, label_create_request_t *label_create_request)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/labels");

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
    cJSON *localVarSingleItemJSON_label_create_request = NULL;
    if (label_create_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_label_create_request = label_create_request_convertToJSON(label_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_label_create_request);
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
    labels_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LabelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = labels_response_parseFromJSON(LabelsAPIlocalVarJSON);
        cJSON_Delete(LabelsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_label_create_request) {
        cJSON_Delete(localVarSingleItemJSON_label_create_request);
        localVarSingleItemJSON_label_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
//
labels_list_200_response_t*
LabelsAPI_labelsList(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ids, list_t *label_ids, list_t *entity_statuses, list_t *label_types, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/labels");

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
    if (campaign_ids)
    {
        list_addElement(localVarQueryParameters,campaign_ids);
    }

    // query parameters
    if (label_ids)
    {
        list_addElement(localVarQueryParameters,label_ids);
    }

    // query parameters
    if (entity_statuses)
    {
        list_addElement(localVarQueryParameters,entity_statuses);
    }

    // query parameters
    if (label_types)
    {
        list_addElement(localVarQueryParameters,label_types);
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
    labels_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LabelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = labels_list_200_response_parseFromJSON(LabelsAPIlocalVarJSON);
        cJSON_Delete(LabelsAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Remove label from entities
//
//   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
//
labeled_entities_t*
LabelsAPI_labelsRemove(apiClient_t *apiClient, char *ad_account_id, char *label_id, labeled_entities_create_t *labeled_entities_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/labels/{label_id}/remove");

    if(!ad_account_id)
        goto end;
    if(!label_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(label_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_label_id = strlen(ad_account_id)+3 + strlen(label_id)+3 + sizeof("{ label_id }") - 1;
    if(label_id == NULL) {
        goto end;
    }
    char* localVarToReplace_label_id = malloc(sizeOfPathParams_label_id);
    sprintf(localVarToReplace_label_id, "{%s}", "label_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_label_id, label_id);



    // Body Param
    cJSON *localVarSingleItemJSON_labeled_entities_create = NULL;
    if (labeled_entities_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_labeled_entities_create = labeled_entities_create_convertToJSON(labeled_entities_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_labeled_entities_create);
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
    labeled_entities_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LabelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = labeled_entities_parseFromJSON(LabelsAPIlocalVarJSON);
        cJSON_Delete(LabelsAPIlocalVarJSON);
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
    free(localVarToReplace_label_id);
    if (localVarSingleItemJSON_labeled_entities_create) {
        cJSON_Delete(localVarSingleItemJSON_labeled_entities_create);
        localVarSingleItemJSON_labeled_entities_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
//
labels_response_t*
LabelsAPI_labelsUpdate(apiClient_t *apiClient, char *ad_account_id, label_update_request_t *label_update_request)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/labels");

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
    cJSON *localVarSingleItemJSON_label_update_request = NULL;
    if (label_update_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_label_update_request = label_update_request_convertToJSON(label_update_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_label_update_request);
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
    labels_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *LabelsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = labels_response_parseFromJSON(LabelsAPIlocalVarJSON);
        cJSON_Delete(LabelsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_label_update_request) {
        cJSON_Delete(localVarSingleItemJSON_label_update_request);
        localVarSingleItemJSON_label_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

