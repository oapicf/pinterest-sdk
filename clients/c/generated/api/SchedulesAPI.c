#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "SchedulesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for SchedulesAPI_schedulesList

static char* schedulesList__ToString(pinterest_rest_api_schedulesList_order_e ){
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return Array[];
}

static pinterest_rest_api_schedulesList_order_e schedulesList__FromString(char* ){
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
// Function schedulesList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *schedulesList__convertToJSON(pinterest_rest_api_schedulesList_order_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function schedulesList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_schedulesList_order_e schedulesList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_schedulesList_order_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum SCHEDULESTATUSES for SchedulesAPI_schedulesList

static char* schedulesList_SCHEDULESTATUSES_ToString(pinterest_rest_api_schedulesList_schedule_statuses_e SCHEDULESTATUSES){
    char *SCHEDULESTATUSESArray[] =  { "NULL", "DRAFT", "CREATED", "SCHEDULED", "ACTIVE", "COMPLETED", "FAILED", "CANCELED" };
    return SCHEDULESTATUSESArray[SCHEDULESTATUSES];
}

static pinterest_rest_api_schedulesList_schedule_statuses_e schedulesList_SCHEDULESTATUSES_FromString(char* SCHEDULESTATUSES){
    int stringToReturn = 0;
    char *SCHEDULESTATUSESArray[] =  { "NULL", "DRAFT", "CREATED", "SCHEDULED", "ACTIVE", "COMPLETED", "FAILED", "CANCELED" };
    size_t sizeofArray = sizeof(SCHEDULESTATUSESArray) / sizeof(SCHEDULESTATUSESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SCHEDULESTATUSES, SCHEDULESTATUSESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function schedulesList_SCHEDULESTATUSES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *schedulesList_SCHEDULESTATUSES_convertToJSON(pinterest_rest_api_schedulesList_schedule_statuses_e SCHEDULESTATUSES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function schedulesList_SCHEDULESTATUSES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_schedulesList_schedule_statuses_e schedulesList_SCHEDULESTATUSES_parseFromJSON(cJSON* SCHEDULESTATUSESJSON) {
    pinterest_rest_api_schedulesList_schedule_statuses_e SCHEDULESTATUSESVariable = 0;
    return SCHEDULESTATUSESVariable;
end:
    return 0;
}
*/

// Functions for enum  for SchedulesAPI_schedulesList

static char* schedulesList__ToString(pinterest_rest_api_schedulesList_schedule_type_e ){
    char *Array[] =  { "NULL", "CAMPAIGN_BUDGET_CHANGE", "CAMPAIGN_BID_MULTIPLIERS" };
    return Array[];
}

static pinterest_rest_api_schedulesList_schedule_type_e schedulesList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "CAMPAIGN_BUDGET_CHANGE", "CAMPAIGN_BID_MULTIPLIERS" };
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
// Function schedulesList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *schedulesList__convertToJSON(pinterest_rest_api_schedulesList_schedule_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function schedulesList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_schedulesList_schedule_type_e schedulesList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_schedulesList_schedule_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Create schedules
//
// Batch create schedules
//
list_t*
SchedulesAPI_schedulesCreate(apiClient_t *apiClient, char *ad_account_id, list_t *schedule_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/schedules");

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
    cJSON *localVar_schedule_create = NULL;
    cJSON *localVarItemJSON_schedule_create = NULL;
    cJSON *localVarSingleItemJSON_schedule_create = NULL;
    if (schedule_create != NULL)
    {
        localVarItemJSON_schedule_create = cJSON_CreateObject();
        localVarSingleItemJSON_schedule_create = cJSON_AddArrayToObject(localVarItemJSON_schedule_create, "schedule_create");
        if (localVarSingleItemJSON_schedule_create == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *schedule_createBodyListEntry;
    list_ForEach(schedule_createBodyListEntry, schedule_create)
    {
        localVar_schedule_create = schedule_create_convertToJSON(schedule_createBodyListEntry->data);
        if(localVar_schedule_create == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_schedule_create, localVar_schedule_create);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_schedule_create);
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
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *SchedulesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(SchedulesAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, SchedulesAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( SchedulesAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
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
    if (localVarItemJSON_schedule_create) {
        cJSON_Delete(localVarItemJSON_schedule_create);
        localVarItemJSON_schedule_create = NULL;
    }
    if (localVarSingleItemJSON_schedule_create) {
        cJSON_Delete(localVarSingleItemJSON_schedule_create);
        localVarSingleItemJSON_schedule_create = NULL;
    }
    if (localVar_schedule_create) {
        cJSON_Delete(localVar_schedule_create);
        localVar_schedule_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get Schedules
//
// Get schedules for a specific advertiser
//
schedules_list_200_response_t*
SchedulesAPI_schedulesList(apiClient_t *apiClient, char *ad_account_id, list_t *entity_ids, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, list_t *schedule_statuses, schedule_type_e schedule_type)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/schedules");

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
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(schedulesList__ToString(
        &valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    if (schedule_statuses)
    {
        list_addElement(localVarQueryParameters,schedule_statuses);
    }

    // query parameters
    char *keyQuery_schedule_type = NULL;
    schedule_type_e valueQuery_schedule_type ;
    keyValuePair_t *keyPairQuery_schedule_type = 0;
    if (schedule_type)
    {
        keyQuery_schedule_type = strdup("schedule_type");
        valueQuery_schedule_type = (schedule_type);
        keyPairQuery_schedule_type = keyValuePair_create(keyQuery_schedule_type, strdup(schedulesList__ToString(
        &valueQuery_schedule_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_schedule_type);
    }

    // query parameters
    if (entity_ids)
    {
        list_addElement(localVarQueryParameters,entity_ids);
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
    schedules_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *SchedulesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = schedules_list_200_response_parseFromJSON(SchedulesAPIlocalVarJSON);
        cJSON_Delete(SchedulesAPIlocalVarJSON);
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
    if(keyQuery_schedule_type){
        free(keyQuery_schedule_type);
        keyQuery_schedule_type = NULL;
    }
    if(keyPairQuery_schedule_type){
        keyValuePair_free(keyPairQuery_schedule_type);
        keyPairQuery_schedule_type = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update schedules
//
// Update one or more schedules
//
list_t*
SchedulesAPI_schedulesUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *schedule_batch_update)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/schedules");

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
    cJSON *localVar_schedule_batch_update = NULL;
    cJSON *localVarItemJSON_schedule_batch_update = NULL;
    cJSON *localVarSingleItemJSON_schedule_batch_update = NULL;
    if (schedule_batch_update != NULL)
    {
        localVarItemJSON_schedule_batch_update = cJSON_CreateObject();
        localVarSingleItemJSON_schedule_batch_update = cJSON_AddArrayToObject(localVarItemJSON_schedule_batch_update, "schedule_batch_update");
        if (localVarSingleItemJSON_schedule_batch_update == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *schedule_batch_updateBodyListEntry;
    list_ForEach(schedule_batch_updateBodyListEntry, schedule_batch_update)
    {
        localVar_schedule_batch_update = schedule_batch_update_convertToJSON(schedule_batch_updateBodyListEntry->data);
        if(localVar_schedule_batch_update == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_schedule_batch_update, localVar_schedule_batch_update);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_schedule_batch_update);
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
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *SchedulesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(SchedulesAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, SchedulesAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( SchedulesAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
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
    if (localVarItemJSON_schedule_batch_update) {
        cJSON_Delete(localVarItemJSON_schedule_batch_update);
        localVarItemJSON_schedule_batch_update = NULL;
    }
    if (localVarSingleItemJSON_schedule_batch_update) {
        cJSON_Delete(localVarSingleItemJSON_schedule_batch_update);
        localVarSingleItemJSON_schedule_batch_update = NULL;
    }
    if (localVar_schedule_batch_update) {
        cJSON_Delete(localVar_schedule_batch_update);
        localVar_schedule_batch_update = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

