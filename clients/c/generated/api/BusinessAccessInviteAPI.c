#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "BusinessAccessInviteAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum INVITESTATUS for BusinessAccessInviteAPI_getInvites

static char* getInvites_INVITESTATUS_ToString(pinterest_rest_api_getInvites_invite_status_e INVITESTATUS){
    char *INVITESTATUSArray[] =  { "NULL", "PENDING", "EXPIRED" };
    return INVITESTATUSArray[INVITESTATUS];
}

static pinterest_rest_api_getInvites_invite_status_e getInvites_INVITESTATUS_FromString(char* INVITESTATUS){
    int stringToReturn = 0;
    char *INVITESTATUSArray[] =  { "NULL", "PENDING", "EXPIRED" };
    size_t sizeofArray = sizeof(INVITESTATUSArray) / sizeof(INVITESTATUSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(INVITESTATUS, INVITESTATUSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getInvites_INVITESTATUS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getInvites_INVITESTATUS_convertToJSON(pinterest_rest_api_getInvites_invite_status_e INVITESTATUS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getInvites_INVITESTATUS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_getInvites_invite_status_e getInvites_INVITESTATUS_parseFromJSON(cJSON* INVITESTATUSJSON) {
    pinterest_rest_api_getInvites_invite_status_e INVITESTATUSVariable = 0;
    return INVITESTATUSVariable;
end:
    return 0;
}
*/

// Functions for enum  for BusinessAccessInviteAPI_getInvites

static char* getInvites__ToString(pinterest_rest_api_getInvites_invite_type_e ){
    char *Array[] =  { "NULL", "MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST" };
    return Array[];
}

static pinterest_rest_api_getInvites_invite_type_e getInvites__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST" };
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
// Function getInvites__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getInvites__convertToJSON(pinterest_rest_api_getInvites_invite_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getInvites__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_getInvites_invite_type_e getInvites__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_getInvites_invite_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Create a request to access an existing partner's assets.
//
// Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
//
create_asset_access_request_response_t*
BusinessAccessInviteAPI_assetAccessRequestsCreate(apiClient_t *apiClient, char *business_id, create_asset_access_request_body_t *create_asset_access_request_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/requests/assets/access")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/requests/assets/access");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_asset_access_request_body = NULL;
    if (create_asset_access_request_body != NULL)
    {
        //string
        localVarSingleItemJSON_create_asset_access_request_body = create_asset_access_request_body_convertToJSON(create_asset_access_request_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_asset_access_request_body);
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
    cJSON *BusinessAccessInviteAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_asset_access_request_response_t *elementToReturn = create_asset_access_request_response_parseFromJSON(BusinessAccessInviteAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessInviteAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_asset_access_request_body) {
        cJSON_Delete(localVarSingleItemJSON_create_asset_access_request_body);
        localVarSingleItemJSON_create_asset_access_request_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Cancel invites/requests
//
// Cancel membership/partnership invites and/or requests.
//
delete_invites_results_response_array_t*
BusinessAccessInviteAPI_cancelInvitesOrRequests(apiClient_t *apiClient, char *business_id, cancel_invites_body_t *cancel_invites_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/invites")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/invites");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_cancel_invites_body = NULL;
    if (cancel_invites_body != NULL)
    {
        //string
        localVarSingleItemJSON_cancel_invites_body = cancel_invites_body_convertToJSON(cancel_invites_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_cancel_invites_body);
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
    cJSON *BusinessAccessInviteAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_invites_results_response_array_t *elementToReturn = delete_invites_results_response_array_parseFromJSON(BusinessAccessInviteAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessInviteAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_cancel_invites_body) {
        cJSON_Delete(localVarSingleItemJSON_cancel_invites_body);
        localVarSingleItemJSON_cancel_invites_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update invite/request with an asset permission
//
// Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
//
update_invites_results_response_array_t*
BusinessAccessInviteAPI_createAssetInvites(apiClient_t *apiClient, char *business_id, create_asset_invites_request_t *create_asset_invites_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/invites/assets/access")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/invites/assets/access");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_asset_invites_request = NULL;
    if (create_asset_invites_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_asset_invites_request = create_asset_invites_request_convertToJSON(create_asset_invites_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_asset_invites_request);
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
    cJSON *BusinessAccessInviteAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_invites_results_response_array_t *elementToReturn = update_invites_results_response_array_parseFromJSON(BusinessAccessInviteAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessInviteAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_asset_invites_request) {
        cJSON_Delete(localVarSingleItemJSON_create_asset_invites_request);
        localVarSingleItemJSON_create_asset_invites_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create invites or requests
//
// Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
//
create_invites_results_response_array_t*
BusinessAccessInviteAPI_createMembershipOrPartnershipInvites(apiClient_t *apiClient, char *business_id, create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/invites")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/invites");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_membership_or_partnership_invites_body = NULL;
    if (create_membership_or_partnership_invites_body != NULL)
    {
        //string
        localVarSingleItemJSON_create_membership_or_partnership_invites_body = create_membership_or_partnership_invites_body_convertToJSON(create_membership_or_partnership_invites_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_membership_or_partnership_invites_body);
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
    cJSON *BusinessAccessInviteAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_invites_results_response_array_t *elementToReturn = create_invites_results_response_array_parseFromJSON(BusinessAccessInviteAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessInviteAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_membership_or_partnership_invites_body) {
        cJSON_Delete(localVarSingleItemJSON_create_membership_or_partnership_invites_body);
        localVarSingleItemJSON_create_membership_or_partnership_invites_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get invites/requests
//
// Get the membership/partnership invites and/or requests for the authorized user.
//
get_invites_200_response_t*
BusinessAccessInviteAPI_getInvites(apiClient_t *apiClient, char *business_id, int *is_member, list_t *invite_status, invite_type_e invite_type, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/invites")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/invites");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // query parameters
    char *keyQuery_is_member = NULL;
    char * valueQuery_is_member = NULL;
    keyValuePair_t *keyPairQuery_is_member = 0;
    if (is_member)
    {
        keyQuery_is_member = strdup("is_member");
        valueQuery_is_member = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_is_member, MAX_NUMBER_LENGTH, "%d", *is_member);
        keyPairQuery_is_member = keyValuePair_create(keyQuery_is_member, valueQuery_is_member);
        list_addElement(localVarQueryParameters,keyPairQuery_is_member);
    }

    // query parameters
    if (invite_status)
    {
        list_addElement(localVarQueryParameters,invite_status);
    }

    // query parameters
    char *keyQuery_invite_type = NULL;
    invite_type_e valueQuery_invite_type ;
    keyValuePair_t *keyPairQuery_invite_type = 0;
    if (invite_type)
    {
        keyQuery_invite_type = strdup("invite_type");
        valueQuery_invite_type = (invite_type);
        keyPairQuery_invite_type = keyValuePair_create(keyQuery_invite_type, (void *)strdup(getInvites__ToString(
        &valueQuery_invite_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_invite_type);
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
    cJSON *BusinessAccessInviteAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_invites_200_response_t *elementToReturn = get_invites_200_response_parseFromJSON(BusinessAccessInviteAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessInviteAPIlocalVarJSON);
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
    if(keyQuery_is_member){
        free(keyQuery_is_member);
        keyQuery_is_member = NULL;
    }
    if(valueQuery_is_member){
        free(valueQuery_is_member);
        valueQuery_is_member = NULL;
    }
    if(keyPairQuery_is_member){
        keyValuePair_free(keyPairQuery_is_member);
        keyPairQuery_is_member = NULL;
    }
    if(keyQuery_invite_type){
        free(keyQuery_invite_type);
        keyQuery_invite_type = NULL;
    }
    if(keyPairQuery_invite_type){
        keyValuePair_free(keyPairQuery_invite_type);
        keyPairQuery_invite_type = NULL;
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

// Accept or decline an invite/request
//
// Accept or decline invites or requests.
//
respond_to_invites_response_array_t*
BusinessAccessInviteAPI_respondBusinessAccessInvites(apiClient_t *apiClient, auth_respond_invites_body_t *auth_respond_invites_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/invites")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/invites");




    // Body Param
    cJSON *localVarSingleItemJSON_auth_respond_invites_body = NULL;
    if (auth_respond_invites_body != NULL)
    {
        //string
        localVarSingleItemJSON_auth_respond_invites_body = auth_respond_invites_body_convertToJSON(auth_respond_invites_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_auth_respond_invites_body);
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
    cJSON *BusinessAccessInviteAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    respond_to_invites_response_array_t *elementToReturn = respond_to_invites_response_array_parseFromJSON(BusinessAccessInviteAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessInviteAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_auth_respond_invites_body) {
        cJSON_Delete(localVarSingleItemJSON_auth_respond_invites_body);
        localVarSingleItemJSON_auth_respond_invites_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

