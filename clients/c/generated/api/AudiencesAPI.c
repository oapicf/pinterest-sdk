#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AudiencesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum ORDER for AudiencesAPI_audiencesList

static char* audiencesList_ORDER_ToString(pinterest_rest_api_audiencesList_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return ORDERArray[ORDER];
}

static pinterest_rest_api_audiencesList_order_e audiencesList_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function audiencesList_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *audiencesList_ORDER_convertToJSON(pinterest_rest_api_audiencesList_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", audiencesList_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function audiencesList_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_audiencesList_order_e audiencesList_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    pinterest_rest_api_audiencesList_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = audiencesList_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum OWNERSHIPTYPE for AudiencesAPI_audiencesList

static char* audiencesList_OWNERSHIPTYPE_ToString(pinterest_rest_api_audiencesList_ownership_type_e OWNERSHIPTYPE){
    char *OWNERSHIPTYPEArray[] =  { "NULL", "OWNED", "RECEIVED" };
    return OWNERSHIPTYPEArray[OWNERSHIPTYPE];
}

static pinterest_rest_api_audiencesList_ownership_type_e audiencesList_OWNERSHIPTYPE_FromString(char* OWNERSHIPTYPE){
    int stringToReturn = 0;
    char *OWNERSHIPTYPEArray[] =  { "NULL", "OWNED", "RECEIVED" };
    size_t sizeofArray = sizeof(OWNERSHIPTYPEArray) / sizeof(OWNERSHIPTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(OWNERSHIPTYPE, OWNERSHIPTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function audiencesList_OWNERSHIPTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *audiencesList_OWNERSHIPTYPE_convertToJSON(pinterest_rest_api_audiencesList_ownership_type_e OWNERSHIPTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ownership_type", audiencesList_OWNERSHIPTYPE_ToString(OWNERSHIPTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function audiencesList_OWNERSHIPTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_audiencesList_ownership_type_e audiencesList_OWNERSHIPTYPE_parseFromJSON(cJSON* OWNERSHIPTYPEJSON) {
    pinterest_rest_api_audiencesList_ownership_type_e OWNERSHIPTYPEVariable = 0;
    cJSON *OWNERSHIPTYPEVar = cJSON_GetObjectItemCaseSensitive(OWNERSHIPTYPEJSON, "ownership_type");
    if(!cJSON_IsString(OWNERSHIPTYPEVar) || (OWNERSHIPTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    OWNERSHIPTYPEVariable = audiencesList_OWNERSHIPTYPE_FromString(OWNERSHIPTYPEVar->valuestring);
    return OWNERSHIPTYPEVariable;
end:
    return 0;
}
*/


// Create audience
//
// Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
//
audience_t*
AudiencesAPI_audiencesCreate(apiClient_t *apiClient, char *ad_account_id, audience_create_request_t *audience_create_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audiences")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audiences");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_audience_create_request = NULL;
    if (audience_create_request != NULL)
    {
        //string
        localVarSingleItemJSON_audience_create_request = audience_create_request_convertToJSON(audience_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_audience_create_request);
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
    cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    audience_t *elementToReturn = audience_parseFromJSON(AudiencesAPIlocalVarJSON);
    cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_audience_create_request) {
        cJSON_Delete(localVarSingleItemJSON_audience_create_request);
        localVarSingleItemJSON_audience_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create custom audience
//
// Create a custom audience and find the audiences you want your ads to reach.
//
audience_t*
AudiencesAPI_audiencesCreateCustom(apiClient_t *apiClient, char *ad_account_id, audience_create_custom_request_t *audience_create_custom_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audiences/custom")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audiences/custom");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_audience_create_custom_request = NULL;
    if (audience_create_custom_request != NULL)
    {
        //string
        localVarSingleItemJSON_audience_create_custom_request = audience_create_custom_request_convertToJSON(audience_create_custom_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_audience_create_custom_request);
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
    cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    audience_t *elementToReturn = audience_parseFromJSON(AudiencesAPIlocalVarJSON);
    cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_audience_create_custom_request) {
        cJSON_Delete(localVarSingleItemJSON_audience_create_custom_request);
        localVarSingleItemJSON_audience_create_custom_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get audience
//
// Get a specific audience given the audience ID.
//
audience_t*
AudiencesAPI_audiencesGet(apiClient_t *apiClient, char *ad_account_id, char *audience_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audiences/{audience_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audiences/{audience_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(audience_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_audience_id = strlen(ad_account_id)+3 + strlen(audience_id)+3 + strlen("{ audience_id }");
    if(audience_id == NULL) {
        goto end;
    }
    char* localVarToReplace_audience_id = malloc(sizeOfPathParams_audience_id);
    sprintf(localVarToReplace_audience_id, "{%s}", "audience_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_audience_id, audience_id);


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
    //    printf("%s\n","Audience not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error.");
    //}
    //nonprimitive not container
    cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    audience_t *elementToReturn = audience_parseFromJSON(AudiencesAPIlocalVarJSON);
    cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    free(localVarToReplace_ad_account_id);
    free(localVarToReplace_audience_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List audiences
//
// Get list of audiences for the ad account.
//
audiences_list_200_response_t*
AudiencesAPI_audiencesList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, pinterest_rest_api_audiencesList_order_e order, int *page_size, pinterest_rest_api_audiencesList_ownership_type_e ownership_type)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audiences")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audiences");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
    char *keyQuery_order = NULL;
    pinterest_rest_api_audiencesList_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, (void *)strdup(audiencesList_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
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
    char *keyQuery_ownership_type = NULL;
    pinterest_rest_api_audiencesList_ownership_type_e valueQuery_ownership_type ;
    keyValuePair_t *keyPairQuery_ownership_type = 0;
    if (ownership_type)
    {
        keyQuery_ownership_type = strdup("ownership_type");
        valueQuery_ownership_type = (ownership_type);
        keyPairQuery_ownership_type = keyValuePair_create(keyQuery_ownership_type, (void *)strdup(audiencesList_OWNERSHIPTYPE_ToString(
        valueQuery_ownership_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_ownership_type);
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
    //    printf("%s\n","Invalid ad account audience parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    audiences_list_200_response_t *elementToReturn = audiences_list_200_response_parseFromJSON(AudiencesAPIlocalVarJSON);
    cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
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
    if(keyQuery_ownership_type){
        free(keyQuery_ownership_type);
        keyQuery_ownership_type = NULL;
    }
    if(keyPairQuery_ownership_type){
        keyValuePair_free(keyPairQuery_ownership_type);
        keyPairQuery_ownership_type = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update audience
//
// Update (edit or remove) an existing targeting audience.
//
audience_t*
AudiencesAPI_audiencesUpdate(apiClient_t *apiClient, char *ad_account_id, char *audience_id, audience_update_request_t *audience_update_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/audiences/{audience_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/audiences/{audience_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(audience_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_audience_id = strlen(ad_account_id)+3 + strlen(audience_id)+3 + strlen("{ audience_id }");
    if(audience_id == NULL) {
        goto end;
    }
    char* localVarToReplace_audience_id = malloc(sizeOfPathParams_audience_id);
    sprintf(localVarToReplace_audience_id, "{%s}", "audience_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_audience_id, audience_id);



    // Body Param
    cJSON *localVarSingleItemJSON_audience_update_request = NULL;
    if (audience_update_request != NULL)
    {
        //string
        localVarSingleItemJSON_audience_update_request = audience_update_request_convertToJSON(audience_update_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_audience_update_request);
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
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AudiencesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    audience_t *elementToReturn = audience_parseFromJSON(AudiencesAPIlocalVarJSON);
    cJSON_Delete(AudiencesAPIlocalVarJSON);
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
    free(localVarToReplace_audience_id);
    if (localVarSingleItemJSON_audience_update_request) {
        cJSON_Delete(localVarSingleItemJSON_audience_update_request);
        localVarSingleItemJSON_audience_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

