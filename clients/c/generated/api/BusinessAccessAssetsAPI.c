#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "BusinessAccessAssetsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum PERMISSIONS for BusinessAccessAssetsAPI_businessAssetsGet

static char* businessAssetsGet_PERMISSIONS_ToString(pinterest_rest_api_businessAssetsGet_permissions_e PERMISSIONS){
    char *PERMISSIONSArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "OWNER" };
    return PERMISSIONSArray[PERMISSIONS];
}

static pinterest_rest_api_businessAssetsGet_permissions_e businessAssetsGet_PERMISSIONS_FromString(char* PERMISSIONS){
    int stringToReturn = 0;
    char *PERMISSIONSArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "OWNER" };
    size_t sizeofArray = sizeof(PERMISSIONSArray) / sizeof(PERMISSIONSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PERMISSIONS, PERMISSIONSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function businessAssetsGet_PERMISSIONS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessAssetsGet_PERMISSIONS_convertToJSON(pinterest_rest_api_businessAssetsGet_permissions_e PERMISSIONS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessAssetsGet_PERMISSIONS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessAssetsGet_permissions_e businessAssetsGet_PERMISSIONS_parseFromJSON(cJSON* PERMISSIONSJSON) {
    pinterest_rest_api_businessAssetsGet_permissions_e PERMISSIONSVariable = 0;
    return PERMISSIONSVariable;
end:
    return 0;
}
*/

// Functions for enum ASSETTYPE for BusinessAccessAssetsAPI_businessAssetsGet

static char* businessAssetsGet_ASSETTYPE_ToString(pinterest_rest_api_businessAssetsGet_asset_type_e ASSETTYPE){
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP" };
    return ASSETTYPEArray[ASSETTYPE];
}

static pinterest_rest_api_businessAssetsGet_asset_type_e businessAssetsGet_ASSETTYPE_FromString(char* ASSETTYPE){
    int stringToReturn = 0;
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP" };
    size_t sizeofArray = sizeof(ASSETTYPEArray) / sizeof(ASSETTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ASSETTYPE, ASSETTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function businessAssetsGet_ASSETTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessAssetsGet_ASSETTYPE_convertToJSON(pinterest_rest_api_businessAssetsGet_asset_type_e ASSETTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "asset_type", businessAssetsGet_ASSETTYPE_ToString(ASSETTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessAssetsGet_ASSETTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessAssetsGet_asset_type_e businessAssetsGet_ASSETTYPE_parseFromJSON(cJSON* ASSETTYPEJSON) {
    pinterest_rest_api_businessAssetsGet_asset_type_e ASSETTYPEVariable = 0;
    cJSON *ASSETTYPEVar = cJSON_GetObjectItemCaseSensitive(ASSETTYPEJSON, "asset_type");
    if(!cJSON_IsString(ASSETTYPEVar) || (ASSETTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    ASSETTYPEVariable = businessAssetsGet_ASSETTYPE_FromString(ASSETTYPEVar->valuestring);
    return ASSETTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum ASSETTYPE for BusinessAccessAssetsAPI_businessMemberAssetsGet

static char* businessMemberAssetsGet_ASSETTYPE_ToString(pinterest_rest_api_businessMemberAssetsGet_asset_type_e ASSETTYPE){
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP" };
    return ASSETTYPEArray[ASSETTYPE];
}

static pinterest_rest_api_businessMemberAssetsGet_asset_type_e businessMemberAssetsGet_ASSETTYPE_FromString(char* ASSETTYPE){
    int stringToReturn = 0;
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP" };
    size_t sizeofArray = sizeof(ASSETTYPEArray) / sizeof(ASSETTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ASSETTYPE, ASSETTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function businessMemberAssetsGet_ASSETTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessMemberAssetsGet_ASSETTYPE_convertToJSON(pinterest_rest_api_businessMemberAssetsGet_asset_type_e ASSETTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "asset_type", businessMemberAssetsGet_ASSETTYPE_ToString(ASSETTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessMemberAssetsGet_ASSETTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessMemberAssetsGet_asset_type_e businessMemberAssetsGet_ASSETTYPE_parseFromJSON(cJSON* ASSETTYPEJSON) {
    pinterest_rest_api_businessMemberAssetsGet_asset_type_e ASSETTYPEVariable = 0;
    cJSON *ASSETTYPEVar = cJSON_GetObjectItemCaseSensitive(ASSETTYPEJSON, "asset_type");
    if(!cJSON_IsString(ASSETTYPEVar) || (ASSETTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    ASSETTYPEVariable = businessMemberAssetsGet_ASSETTYPE_FromString(ASSETTYPEVar->valuestring);
    return ASSETTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum ASSETTYPE for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet

static char* businessPartnerAssetAccessGet_ASSETTYPE_ToString(pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e ASSETTYPE){
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP" };
    return ASSETTYPEArray[ASSETTYPE];
}

static pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e businessPartnerAssetAccessGet_ASSETTYPE_FromString(char* ASSETTYPE){
    int stringToReturn = 0;
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP" };
    size_t sizeofArray = sizeof(ASSETTYPEArray) / sizeof(ASSETTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ASSETTYPE, ASSETTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function businessPartnerAssetAccessGet_ASSETTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessPartnerAssetAccessGet_ASSETTYPE_convertToJSON(pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e ASSETTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "asset_type", businessPartnerAssetAccessGet_ASSETTYPE_ToString(ASSETTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessPartnerAssetAccessGet_ASSETTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e businessPartnerAssetAccessGet_ASSETTYPE_parseFromJSON(cJSON* ASSETTYPEJSON) {
    pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e ASSETTYPEVariable = 0;
    cJSON *ASSETTYPEVar = cJSON_GetObjectItemCaseSensitive(ASSETTYPEJSON, "asset_type");
    if(!cJSON_IsString(ASSETTYPEVar) || (ASSETTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    ASSETTYPEVariable = businessPartnerAssetAccessGet_ASSETTYPE_FromString(ASSETTYPEVar->valuestring);
    return ASSETTYPEVariable;
end:
    return 0;
}
*/


// Create a new asset group.
//
// Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
//
create_asset_group_response_t*
BusinessAccessAssetsAPI_assetGroupCreate(apiClient_t *apiClient, char *business_id, create_asset_group_body_t *create_asset_group_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/asset_groups")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/asset_groups");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_asset_group_body = NULL;
    if (create_asset_group_body != NULL)
    {
        //string
        localVarSingleItemJSON_create_asset_group_body = create_asset_group_body_convertToJSON(create_asset_group_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_asset_group_body);
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
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_asset_group_response_t *elementToReturn = create_asset_group_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_asset_group_body) {
        cJSON_Delete(localVarSingleItemJSON_create_asset_group_body);
        localVarSingleItemJSON_create_asset_group_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete asset groups.
//
// Delete a batch of asset groups.
//
delete_asset_group_response_t*
BusinessAccessAssetsAPI_assetGroupDelete(apiClient_t *apiClient, char *business_id, delete_asset_group_body_t *delete_asset_group_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/asset_groups")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/asset_groups");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_delete_asset_group_body = NULL;
    if (delete_asset_group_body != NULL)
    {
        //string
        localVarSingleItemJSON_delete_asset_group_body = delete_asset_group_body_convertToJSON(delete_asset_group_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_asset_group_body);
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
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_asset_group_response_t *elementToReturn = delete_asset_group_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_delete_asset_group_body) {
        cJSON_Delete(localVarSingleItemJSON_delete_asset_group_body);
        localVarSingleItemJSON_delete_asset_group_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update asset groups.
//
// Update a batch of asset groups with the specified parameters.
//
update_asset_group_response_t*
BusinessAccessAssetsAPI_assetGroupUpdate(apiClient_t *apiClient, char *business_id, update_asset_group_body_t *update_asset_group_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/asset_groups")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/asset_groups");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_update_asset_group_body = NULL;
    if (update_asset_group_body != NULL)
    {
        //string
        localVarSingleItemJSON_update_asset_group_body = update_asset_group_body_convertToJSON(update_asset_group_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_asset_group_body);
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
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_asset_group_response_t *elementToReturn = update_asset_group_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_update_asset_group_body) {
        cJSON_Delete(localVarSingleItemJSON_update_asset_group_body);
        localVarSingleItemJSON_update_asset_group_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get members with access to asset
//
// Get all the members the requesting business has granted access to on the given asset.
//
business_asset_members_get_200_response_t*
BusinessAccessAssetsAPI_businessAssetMembersGet(apiClient_t *apiClient, char *business_id, char *asset_id, char *bookmark, int *page_size, int *start_index)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/assets/{asset_id}/members")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/assets/{asset_id}/members");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen(asset_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);

    // Path Params
    long sizeOfPathParams_asset_id = strlen(business_id)+3 + strlen(asset_id)+3 + strlen("{ asset_id }");
    if(asset_id == NULL) {
        goto end;
    }
    char* localVarToReplace_asset_id = malloc(sizeOfPathParams_asset_id);
    sprintf(localVarToReplace_asset_id, "{%s}", "asset_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_asset_id, asset_id);



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
    //    printf("%s\n","Sucess");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    business_asset_members_get_200_response_t *elementToReturn = business_asset_members_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    free(localVarToReplace_asset_id);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get partners with access to asset
//
// Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
//
business_asset_partners_get_200_response_t*
BusinessAccessAssetsAPI_businessAssetPartnersGet(apiClient_t *apiClient, char *business_id, char *asset_id, int *start_index, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/assets/{asset_id}/partners")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/assets/{asset_id}/partners");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen(asset_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);

    // Path Params
    long sizeOfPathParams_asset_id = strlen(business_id)+3 + strlen(asset_id)+3 + strlen("{ asset_id }");
    if(asset_id == NULL) {
        goto end;
    }
    char* localVarToReplace_asset_id = malloc(sizeOfPathParams_asset_id);
    sprintf(localVarToReplace_asset_id, "{%s}", "asset_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_asset_id, asset_id);



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
    //    printf("%s\n","Sucess");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    business_asset_partners_get_200_response_t *elementToReturn = business_asset_partners_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    free(localVarToReplace_asset_id);
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

// List business assets
//
// Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
//
business_assets_get_200_response_t*
BusinessAccessAssetsAPI_businessAssetsGet(apiClient_t *apiClient, char *business_id, list_t *permissions, char *child_asset_id, char *asset_group_id, pinterest_rest_api_businessAssetsGet_asset_type_e asset_type, int *start_index, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/assets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/assets");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // query parameters
    if (permissions)
    {
        list_addElement(localVarQueryParameters,permissions);
    }

    // query parameters
    char *keyQuery_child_asset_id = NULL;
    char * valueQuery_child_asset_id = NULL;
    keyValuePair_t *keyPairQuery_child_asset_id = 0;
    if (child_asset_id)
    {
        keyQuery_child_asset_id = strdup("child_asset_id");
        valueQuery_child_asset_id = strdup((child_asset_id));
        keyPairQuery_child_asset_id = keyValuePair_create(keyQuery_child_asset_id, valueQuery_child_asset_id);
        list_addElement(localVarQueryParameters,keyPairQuery_child_asset_id);
    }

    // query parameters
    char *keyQuery_asset_group_id = NULL;
    char * valueQuery_asset_group_id = NULL;
    keyValuePair_t *keyPairQuery_asset_group_id = 0;
    if (asset_group_id)
    {
        keyQuery_asset_group_id = strdup("asset_group_id");
        valueQuery_asset_group_id = strdup((asset_group_id));
        keyPairQuery_asset_group_id = keyValuePair_create(keyQuery_asset_group_id, valueQuery_asset_group_id);
        list_addElement(localVarQueryParameters,keyPairQuery_asset_group_id);
    }

    // query parameters
    char *keyQuery_asset_type = NULL;
    pinterest_rest_api_businessAssetsGet_asset_type_e valueQuery_asset_type ;
    keyValuePair_t *keyPairQuery_asset_type = 0;
    if (asset_type)
    {
        keyQuery_asset_type = strdup("asset_type");
        valueQuery_asset_type = (asset_type);
        keyPairQuery_asset_type = keyValuePair_create(keyQuery_asset_type, (void *)strdup(businessAssetsGet_ASSETTYPE_ToString(
        valueQuery_asset_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_asset_type);
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
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    business_assets_get_200_response_t *elementToReturn = business_assets_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if(keyQuery_child_asset_id){
        free(keyQuery_child_asset_id);
        keyQuery_child_asset_id = NULL;
    }
    if(valueQuery_child_asset_id){
        free(valueQuery_child_asset_id);
        valueQuery_child_asset_id = NULL;
    }
    if(keyPairQuery_child_asset_id){
        keyValuePair_free(keyPairQuery_child_asset_id);
        keyPairQuery_child_asset_id = NULL;
    }
    if(keyQuery_asset_group_id){
        free(keyQuery_asset_group_id);
        keyQuery_asset_group_id = NULL;
    }
    if(valueQuery_asset_group_id){
        free(valueQuery_asset_group_id);
        valueQuery_asset_group_id = NULL;
    }
    if(keyPairQuery_asset_group_id){
        keyValuePair_free(keyPairQuery_asset_group_id);
        keyPairQuery_asset_group_id = NULL;
    }
    if(keyQuery_asset_type){
        free(keyQuery_asset_type);
        keyQuery_asset_type = NULL;
    }
    if(keyPairQuery_asset_type){
        keyValuePair_free(keyPairQuery_asset_type);
        keyPairQuery_asset_type = NULL;
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

// Get assets assigned to a member
//
// Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
//
business_member_assets_get_200_response_t*
BusinessAccessAssetsAPI_businessMemberAssetsGet(apiClient_t *apiClient, char *business_id, char *member_id, pinterest_rest_api_businessMemberAssetsGet_asset_type_e asset_type, int *start_index, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/members/{member_id}/assets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/members/{member_id}/assets");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen(member_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);

    // Path Params
    long sizeOfPathParams_member_id = strlen(business_id)+3 + strlen(member_id)+3 + strlen("{ member_id }");
    if(member_id == NULL) {
        goto end;
    }
    char* localVarToReplace_member_id = malloc(sizeOfPathParams_member_id);
    sprintf(localVarToReplace_member_id, "{%s}", "member_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_member_id, member_id);



    // query parameters
    char *keyQuery_asset_type = NULL;
    pinterest_rest_api_businessMemberAssetsGet_asset_type_e valueQuery_asset_type ;
    keyValuePair_t *keyPairQuery_asset_type = 0;
    if (asset_type)
    {
        keyQuery_asset_type = strdup("asset_type");
        valueQuery_asset_type = (asset_type);
        keyPairQuery_asset_type = keyValuePair_create(keyQuery_asset_type, (void *)strdup(businessMemberAssetsGet_ASSETTYPE_ToString(
        valueQuery_asset_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_asset_type);
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
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    business_member_assets_get_200_response_t *elementToReturn = business_member_assets_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    free(localVarToReplace_member_id);
    if(keyQuery_asset_type){
        free(keyQuery_asset_type);
        keyQuery_asset_type = NULL;
    }
    if(keyPairQuery_asset_type){
        keyValuePair_free(keyPairQuery_asset_type);
        keyPairQuery_asset_type = NULL;
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

// Delete member access to asset
//
// Terminate multiple members' access to an asset.
//
delete_member_access_results_response_array_t*
BusinessAccessAssetsAPI_businessMembersAssetAccessDelete(apiClient_t *apiClient, char *business_id, business_members_asset_access_delete_request_t *business_members_asset_access_delete_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/members/assets/access")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/members/assets/access");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_business_members_asset_access_delete_request = NULL;
    if (business_members_asset_access_delete_request != NULL)
    {
        //string
        localVarSingleItemJSON_business_members_asset_access_delete_request = business_members_asset_access_delete_request_convertToJSON(business_members_asset_access_delete_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_business_members_asset_access_delete_request);
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
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_member_access_results_response_array_t *elementToReturn = delete_member_access_results_response_array_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_business_members_asset_access_delete_request) {
        cJSON_Delete(localVarSingleItemJSON_business_members_asset_access_delete_request);
        localVarSingleItemJSON_business_members_asset_access_delete_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Assign/Update member asset permissions
//
// Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
//
update_member_assets_results_response_array_t*
BusinessAccessAssetsAPI_businessMembersAssetAccessUpdate(apiClient_t *apiClient, char *business_id, update_member_asset_access_body_t *update_member_asset_access_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/members/assets/access")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/members/assets/access");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_update_member_asset_access_body = NULL;
    if (update_member_asset_access_body != NULL)
    {
        //string
        localVarSingleItemJSON_update_member_asset_access_body = update_member_asset_access_body_convertToJSON(update_member_asset_access_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_member_asset_access_body);
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
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_member_assets_results_response_array_t *elementToReturn = update_member_assets_results_response_array_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_update_member_asset_access_body) {
        cJSON_Delete(localVarSingleItemJSON_update_member_asset_access_body);
        localVarSingleItemJSON_update_member_asset_access_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get assets assigned to a partner or assets assigned by a partner
//
// Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
//
business_partner_asset_access_get_200_response_t*
BusinessAccessAssetsAPI_businessPartnerAssetAccessGet(apiClient_t *apiClient, char *business_id, char *partner_id, partner_type_t *partner_type, pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e asset_type, int *start_index, int *page_size, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/partners/{partner_id}/assets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/partners/{partner_id}/assets");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen(partner_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);

    // Path Params
    long sizeOfPathParams_partner_id = strlen(business_id)+3 + strlen(partner_id)+3 + strlen("{ partner_id }");
    if(partner_id == NULL) {
        goto end;
    }
    char* localVarToReplace_partner_id = malloc(sizeOfPathParams_partner_id);
    sprintf(localVarToReplace_partner_id, "{%s}", "partner_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_partner_id, partner_id);



    // query parameters
    char *keyQuery_partner_type = NULL;
    partner_type_t * valueQuery_partner_type ;
    keyValuePair_t *keyPairQuery_partner_type = 0;
    if (partner_type)
    {
        keyQuery_partner_type = strdup("partner_type");
        valueQuery_partner_type = (partner_type);
        keyPairQuery_partner_type = keyValuePair_create(keyQuery_partner_type, &valueQuery_partner_type);
        list_addElement(localVarQueryParameters,keyPairQuery_partner_type);
    }

    // query parameters
    char *keyQuery_asset_type = NULL;
    pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e valueQuery_asset_type ;
    keyValuePair_t *keyPairQuery_asset_type = 0;
    if (asset_type)
    {
        keyQuery_asset_type = strdup("asset_type");
        valueQuery_asset_type = (asset_type);
        keyPairQuery_asset_type = keyValuePair_create(keyQuery_asset_type, (void *)strdup(businessPartnerAssetAccessGet_ASSETTYPE_ToString(
        valueQuery_asset_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_asset_type);
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
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    business_partner_asset_access_get_200_response_t *elementToReturn = business_partner_asset_access_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    free(localVarToReplace_partner_id);
    if(keyQuery_partner_type){
        free(keyQuery_partner_type);
        keyQuery_partner_type = NULL;
    }
    if(keyPairQuery_partner_type){
        keyValuePair_free(keyPairQuery_partner_type);
        keyPairQuery_partner_type = NULL;
    }
    if(keyQuery_asset_type){
        free(keyQuery_asset_type);
        keyQuery_asset_type = NULL;
    }
    if(keyPairQuery_asset_type){
        keyValuePair_free(keyPairQuery_asset_type);
        keyPairQuery_asset_type = NULL;
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

// Delete partner access to asset
//
// Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
//
delete_partner_assets_results_response_array_t*
BusinessAccessAssetsAPI_deletePartnerAssetAccessHandlerImpl(apiClient_t *apiClient, char *business_id, delete_partner_asset_access_body_t *delete_partner_asset_access_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/partners/assets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/partners/assets");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_delete_partner_asset_access_body = NULL;
    if (delete_partner_asset_access_body != NULL)
    {
        //string
        localVarSingleItemJSON_delete_partner_asset_access_body = delete_partner_asset_access_body_convertToJSON(delete_partner_asset_access_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_partner_asset_access_body);
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
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    delete_partner_assets_results_response_array_t *elementToReturn = delete_partner_assets_results_response_array_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_delete_partner_asset_access_body) {
        cJSON_Delete(localVarSingleItemJSON_delete_partner_asset_access_body);
        localVarSingleItemJSON_delete_partner_asset_access_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Assign/Update partner asset permissions
//
// Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
//
update_partner_assets_results_response_array_t*
BusinessAccessAssetsAPI_updatePartnerAssetAccessHandlerImpl(apiClient_t *apiClient, char *business_id, update_partner_asset_access_body_t *update_partner_asset_access_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/businesses/{business_id}/partners/assets")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/businesses/{business_id}/partners/assets");


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen("{ business_id }");
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_update_partner_asset_access_body = NULL;
    if (update_partner_asset_access_body != NULL)
    {
        //string
        localVarSingleItemJSON_update_partner_asset_access_body = update_partner_asset_access_body_convertToJSON(update_partner_asset_access_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_partner_asset_access_body);
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
    cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    update_partner_assets_results_response_array_t *elementToReturn = update_partner_assets_results_response_array_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
    cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_update_partner_asset_access_body) {
        cJSON_Delete(localVarSingleItemJSON_update_partner_asset_access_body);
        localVarSingleItemJSON_update_partner_asset_access_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

