#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "BusinessAccessRelationshipsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum BUSINESSROLES for BusinessAccessRelationshipsAPI_getBusinessMembers

static char* getBusinessMembers_BUSINESSROLES_ToString(pinterest_rest_api_getBusinessMembers_business_roles_e BUSINESSROLES){
    char *BUSINESSROLESArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    return BUSINESSROLESArray[BUSINESSROLES];
}

static pinterest_rest_api_getBusinessMembers_business_roles_e getBusinessMembers_BUSINESSROLES_FromString(char* BUSINESSROLES){
    int stringToReturn = 0;
    char *BUSINESSROLESArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    size_t sizeofArray = sizeof(BUSINESSROLESArray) / sizeof(BUSINESSROLESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUSINESSROLES, BUSINESSROLESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getBusinessMembers_BUSINESSROLES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getBusinessMembers_BUSINESSROLES_convertToJSON(pinterest_rest_api_getBusinessMembers_business_roles_e BUSINESSROLES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getBusinessMembers_BUSINESSROLES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_getBusinessMembers_business_roles_e getBusinessMembers_BUSINESSROLES_parseFromJSON(cJSON* BUSINESSROLESJSON) {
    pinterest_rest_api_getBusinessMembers_business_roles_e BUSINESSROLESVariable = 0;
    return BUSINESSROLESVariable;
end:
    return 0;
}
*/

// Functions for enum  for BusinessAccessRelationshipsAPI_getBusinessPartners

static char* getBusinessPartners__ToString(pinterest_rest_api_getBusinessPartners_partner_type_e ){
    char *Array[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    return Array[];
}

static pinterest_rest_api_getBusinessPartners_partner_type_e getBusinessPartners__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "INTERNAL", "EXTERNAL" };
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
// Function getBusinessPartners__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getBusinessPartners__convertToJSON(pinterest_rest_api_getBusinessPartners_partner_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getBusinessPartners__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_getBusinessPartners_partner_type_e getBusinessPartners__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_getBusinessPartners_partner_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Terminate business memberships
//
// Terminate memberships between the specified members and your business.
//
deleted_members_response_t*
BusinessAccessRelationshipsAPI_deleteBusinessMembership(apiClient_t *apiClient, char *business_id, members_to_delete_body_t *members_to_delete_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/members")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/members");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_members_to_delete_body = NULL;
    if (members_to_delete_body != NULL)
    {
        //string
        localVarSingleItemJSON_members_to_delete_body = members_to_delete_body_convertToJSON(members_to_delete_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_members_to_delete_body);
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessRelationshipsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    deleted_members_response_t *elementToReturn = deleted_members_response_parseFromJSON(BusinessAccessRelationshipsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessRelationshipsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_members_to_delete_body) {
        cJSON_Delete(localVarSingleItemJSON_members_to_delete_body);
        localVarSingleItemJSON_members_to_delete_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Terminate business partnerships
//
// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
//
delete_partners_response_t*
BusinessAccessRelationshipsAPI_deleteBusinessPartners(apiClient_t *apiClient, char *business_id, delete_partners_request_t *delete_partners_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/partners")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/partners");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_delete_partners_request = NULL;
    if (delete_partners_request != NULL)
    {
        //string
        localVarSingleItemJSON_delete_partners_request = delete_partners_request_convertToJSON(delete_partners_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_partners_request);
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","A supplied partner id doesn&#39;t exist");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessRelationshipsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_partners_response_t *elementToReturn = delete_partners_response_parseFromJSON(BusinessAccessRelationshipsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessRelationshipsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_delete_partners_request) {
        cJSON_Delete(localVarSingleItemJSON_delete_partners_request);
        localVarSingleItemJSON_delete_partners_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List business employers for user
//
// Get all of the viewing user's business employers.
//
get_business_employers_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessEmployers(apiClient_t *apiClient, int *page_size, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/employers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/employers");




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
    cJSON *BusinessAccessRelationshipsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_business_employers_200_response_t *elementToReturn = get_business_employers_200_response_parseFromJSON(BusinessAccessRelationshipsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessRelationshipsAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get business members
//
// Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
//
get_business_members_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessMembers(apiClient_t *apiClient, char *business_id, int *assets_summary, list_t *business_roles, char *member_ids, int *start_index, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/members")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/members");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // query parameters
    char *keyQuery_assets_summary = NULL;
    char * valueQuery_assets_summary = NULL;
    keyValuePair_t *keyPairQuery_assets_summary = 0;
    if (assets_summary)
    {
        keyQuery_assets_summary = strdup("assets_summary");
        valueQuery_assets_summary = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_assets_summary, MAX_NUMBER_LENGTH, "%d", *assets_summary);
        keyPairQuery_assets_summary = keyValuePair_create(keyQuery_assets_summary, valueQuery_assets_summary);
        list_addElement(localVarQueryParameters,keyPairQuery_assets_summary);
    }

    // query parameters
    if (business_roles)
    {
        list_addElement(localVarQueryParameters,business_roles);
    }

    // query parameters
    char *keyQuery_member_ids = NULL;
    char * valueQuery_member_ids = NULL;
    keyValuePair_t *keyPairQuery_member_ids = 0;
    if (member_ids)
    {
        keyQuery_member_ids = strdup("member_ids");
        valueQuery_member_ids = strdup((member_ids));
        keyPairQuery_member_ids = keyValuePair_create(keyQuery_member_ids, valueQuery_member_ids);
        list_addElement(localVarQueryParameters,keyPairQuery_member_ids);
    }

    // query parameters
    char *keyQuery_start_index = NULL;
    char * valueQuery_start_index = NULL;
    keyValuePair_t *keyPairQuery_start_index = 0;
    if (start_index)
    {
        keyQuery_start_index = strdup("start_index");
        valueQuery_start_index = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_index, MAX_NUMBER_LENGTH, "%d", *start_index);
        keyPairQuery_start_index = keyValuePair_create(keyQuery_start_index, valueQuery_start_index);
        list_addElement(localVarQueryParameters,keyPairQuery_start_index);
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
    cJSON *BusinessAccessRelationshipsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_business_members_200_response_t *elementToReturn = get_business_members_200_response_parseFromJSON(BusinessAccessRelationshipsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessRelationshipsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if(keyQuery_assets_summary){
        free(keyQuery_assets_summary);
        keyQuery_assets_summary = NULL;
    }
    if(valueQuery_assets_summary){
        free(valueQuery_assets_summary);
        valueQuery_assets_summary = NULL;
    }
    if(keyPairQuery_assets_summary){
        keyValuePair_free(keyPairQuery_assets_summary);
        keyPairQuery_assets_summary = NULL;
    }
    if(keyQuery_member_ids){
        free(keyQuery_member_ids);
        keyQuery_member_ids = NULL;
    }
    if(valueQuery_member_ids){
        free(valueQuery_member_ids);
        valueQuery_member_ids = NULL;
    }
    if(keyPairQuery_member_ids){
        keyValuePair_free(keyPairQuery_member_ids);
        keyPairQuery_member_ids = NULL;
    }
    if(keyQuery_start_index){
        free(keyQuery_start_index);
        keyQuery_start_index = NULL;
    }
    if(valueQuery_start_index){
        free(valueQuery_start_index);
        valueQuery_start_index = NULL;
    }
    if(keyPairQuery_start_index){
        keyValuePair_free(keyPairQuery_start_index);
        keyPairQuery_start_index = NULL;
    }
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

// Get business partners
//
// Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
//
get_business_partners_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessPartners(apiClient_t *apiClient, char *business_id, int *assets_summary, partner_type_e partner_type, char *partner_ids, int *start_index, int *page_size, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/partners")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/partners");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // query parameters
    char *keyQuery_assets_summary = NULL;
    char * valueQuery_assets_summary = NULL;
    keyValuePair_t *keyPairQuery_assets_summary = 0;
    if (assets_summary)
    {
        keyQuery_assets_summary = strdup("assets_summary");
        valueQuery_assets_summary = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_assets_summary, MAX_NUMBER_LENGTH, "%d", *assets_summary);
        keyPairQuery_assets_summary = keyValuePair_create(keyQuery_assets_summary, valueQuery_assets_summary);
        list_addElement(localVarQueryParameters,keyPairQuery_assets_summary);
    }

    // query parameters
    char *keyQuery_partner_type = NULL;
    partner_type_e valueQuery_partner_type ;
    keyValuePair_t *keyPairQuery_partner_type = 0;
    if (partner_type)
    {
        keyQuery_partner_type = strdup("partner_type");
        valueQuery_partner_type = (partner_type);
        keyPairQuery_partner_type = keyValuePair_create(keyQuery_partner_type, (void *)strdup(getBusinessPartners__ToString(
        &valueQuery_partner_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_partner_type);
    }

    // query parameters
    char *keyQuery_partner_ids = NULL;
    char * valueQuery_partner_ids = NULL;
    keyValuePair_t *keyPairQuery_partner_ids = 0;
    if (partner_ids)
    {
        keyQuery_partner_ids = strdup("partner_ids");
        valueQuery_partner_ids = strdup((partner_ids));
        keyPairQuery_partner_ids = keyValuePair_create(keyQuery_partner_ids, valueQuery_partner_ids);
        list_addElement(localVarQueryParameters,keyPairQuery_partner_ids);
    }

    // query parameters
    char *keyQuery_start_index = NULL;
    char * valueQuery_start_index = NULL;
    keyValuePair_t *keyPairQuery_start_index = 0;
    if (start_index)
    {
        keyQuery_start_index = strdup("start_index");
        valueQuery_start_index = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_index, MAX_NUMBER_LENGTH, "%d", *start_index);
        keyPairQuery_start_index = keyValuePair_create(keyQuery_start_index, valueQuery_start_index);
        list_addElement(localVarQueryParameters,keyPairQuery_start_index);
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
    cJSON *BusinessAccessRelationshipsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_business_partners_200_response_t *elementToReturn = get_business_partners_200_response_parseFromJSON(BusinessAccessRelationshipsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessRelationshipsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if(keyQuery_assets_summary){
        free(keyQuery_assets_summary);
        keyQuery_assets_summary = NULL;
    }
    if(valueQuery_assets_summary){
        free(valueQuery_assets_summary);
        valueQuery_assets_summary = NULL;
    }
    if(keyPairQuery_assets_summary){
        keyValuePair_free(keyPairQuery_assets_summary);
        keyPairQuery_assets_summary = NULL;
    }
    if(keyQuery_partner_type){
        free(keyQuery_partner_type);
        keyQuery_partner_type = NULL;
    }
    if(keyPairQuery_partner_type){
        keyValuePair_free(keyPairQuery_partner_type);
        keyPairQuery_partner_type = NULL;
    }
    if(keyQuery_partner_ids){
        free(keyQuery_partner_ids);
        keyQuery_partner_ids = NULL;
    }
    if(valueQuery_partner_ids){
        free(valueQuery_partner_ids);
        valueQuery_partner_ids = NULL;
    }
    if(keyPairQuery_partner_ids){
        keyValuePair_free(keyPairQuery_partner_ids);
        keyPairQuery_partner_ids = NULL;
    }
    if(keyQuery_start_index){
        free(keyQuery_start_index);
        keyQuery_start_index = NULL;
    }
    if(valueQuery_start_index){
        free(valueQuery_start_index);
        valueQuery_start_index = NULL;
    }
    if(keyPairQuery_start_index){
        keyValuePair_free(keyPairQuery_start_index);
        keyPairQuery_start_index = NULL;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update member's business role
//
// Update a member's business role within the business.
//
update_member_results_response_array_t*
BusinessAccessRelationshipsAPI_updateBusinessMemberships(apiClient_t *apiClient, char *business_id, list_t *update_member_business_role_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/members")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/members");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    //notstring
    cJSON *localVar_update_member_business_role_body = NULL;
    cJSON *localVarItemJSON_update_member_business_role_body = NULL;
    cJSON *localVarSingleItemJSON_update_member_business_role_body = NULL;
    if (update_member_business_role_body != NULL)
    {
        localVarItemJSON_update_member_business_role_body = cJSON_CreateObject();
        localVarSingleItemJSON_update_member_business_role_body = cJSON_AddArrayToObject(localVarItemJSON_update_member_business_role_body, "update_member_business_role_body");
        if (localVarSingleItemJSON_update_member_business_role_body == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *update_member_business_role_bodyBodyListEntry;
    list_ForEach(update_member_business_role_bodyBodyListEntry, update_member_business_role_body)
    {
        localVar_update_member_business_role_body = update_member_business_role_body_convertToJSON(update_member_business_role_bodyBodyListEntry->data);
        if(localVar_update_member_business_role_body == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_update_member_business_role_body, localVar_update_member_business_role_body);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_update_member_business_role_body);
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
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessRelationshipsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_member_results_response_array_t *elementToReturn = update_member_results_response_array_parseFromJSON(BusinessAccessRelationshipsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessRelationshipsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarItemJSON_update_member_business_role_body) {
        cJSON_Delete(localVarItemJSON_update_member_business_role_body);
        localVarItemJSON_update_member_business_role_body = NULL;
    }
    if (localVarSingleItemJSON_update_member_business_role_body) {
        cJSON_Delete(localVarSingleItemJSON_update_member_business_role_body);
        localVarSingleItemJSON_update_member_business_role_body = NULL;
    }
    if (localVar_update_member_business_role_body) {
        cJSON_Delete(localVar_update_member_business_role_body);
        localVar_update_member_business_role_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

