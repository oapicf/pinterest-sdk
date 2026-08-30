#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "BusinessAccessAssetsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum PERMISSIONS for BusinessAccessAssetsAPI_businessAssetsGet

static char* businessAssetsGet_PERMISSIONS_ToString(pinterest_rest_api_businessAssetsGet_permissions_e PERMISSIONS){
    char *PERMISSIONSArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "OWNER" };
    return PERMISSIONSArray[PERMISSIONS];
}

static pinterest_rest_api_businessAssetsGet_permissions_e businessAssetsGet_PERMISSIONS_FromString(char* PERMISSIONS){
    int stringToReturn = 0;
    char *PERMISSIONSArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "OWNER" };
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
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP", "CATALOG", "CONSUMER" };
    return ASSETTYPEArray[ASSETTYPE];
}

static pinterest_rest_api_businessAssetsGet_asset_type_e businessAssetsGet_ASSETTYPE_FromString(char* ASSETTYPE){
    int stringToReturn = 0;
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP", "CATALOG", "CONSUMER" };
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
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP", "CATALOG", "CONSUMER", "CONVERSION_TAG" };
    return ASSETTYPEArray[ASSETTYPE];
}

static pinterest_rest_api_businessMemberAssetsGet_asset_type_e businessMemberAssetsGet_ASSETTYPE_FromString(char* ASSETTYPE){
    int stringToReturn = 0;
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP", "CATALOG", "CONSUMER", "CONVERSION_TAG" };
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

// Functions for enum  for BusinessAccessAssetsAPI_businessMemberAssetsGet

static char* businessMemberAssetsGet__ToString(pinterest_rest_api_businessMemberAssetsGet_sort_by_e ){
    char *Array[] =  { "NULL", "NAME", "ID", "PERMISSIONS" };
    return Array[];
}

static pinterest_rest_api_businessMemberAssetsGet_sort_by_e businessMemberAssetsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "NAME", "ID", "PERMISSIONS" };
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
// Function businessMemberAssetsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessMemberAssetsGet__convertToJSON(pinterest_rest_api_businessMemberAssetsGet_sort_by_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessMemberAssetsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessMemberAssetsGet_sort_by_e businessMemberAssetsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_businessMemberAssetsGet_sort_by_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for BusinessAccessAssetsAPI_businessMemberAssetsGet

static char* businessMemberAssetsGet__ToString(pinterest_rest_api_businessMemberAssetsGet_search_by_e ){
    char *Array[] =  { "NULL", "NAME", "ID", "NAME_OR_ID", "OWNER_NAME", "NAME_OR_OWNER" };
    return Array[];
}

static pinterest_rest_api_businessMemberAssetsGet_search_by_e businessMemberAssetsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "NAME", "ID", "NAME_OR_ID", "OWNER_NAME", "NAME_OR_OWNER" };
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
// Function businessMemberAssetsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessMemberAssetsGet__convertToJSON(pinterest_rest_api_businessMemberAssetsGet_search_by_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessMemberAssetsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessMemberAssetsGet_search_by_e businessMemberAssetsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_businessMemberAssetsGet_search_by_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for BusinessAccessAssetsAPI_businessMemberAssetsGet

static char* businessMemberAssetsGet__ToString(pinterest_rest_api_businessMemberAssetsGet_asset_permission_type_e ){
    char *Array[] =  { "NULL", "AGGREGATED_PERMISSION", "DIRECT_PERMISSION" };
    return Array[];
}

static pinterest_rest_api_businessMemberAssetsGet_asset_permission_type_e businessMemberAssetsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "AGGREGATED_PERMISSION", "DIRECT_PERMISSION" };
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
// Function businessMemberAssetsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessMemberAssetsGet__convertToJSON(pinterest_rest_api_businessMemberAssetsGet_asset_permission_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessMemberAssetsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessMemberAssetsGet_asset_permission_type_e businessMemberAssetsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_businessMemberAssetsGet_asset_permission_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum ADACCOUNTSTATUSES for BusinessAccessAssetsAPI_businessMemberAssetsGet

static char* businessMemberAssetsGet_ADACCOUNTSTATUSES_ToString(pinterest_rest_api_businessMemberAssetsGet_ad_account_statuses_e ADACCOUNTSTATUSES){
    char *ADACCOUNTSTATUSESArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED" };
    return ADACCOUNTSTATUSESArray[ADACCOUNTSTATUSES];
}

static pinterest_rest_api_businessMemberAssetsGet_ad_account_statuses_e businessMemberAssetsGet_ADACCOUNTSTATUSES_FromString(char* ADACCOUNTSTATUSES){
    int stringToReturn = 0;
    char *ADACCOUNTSTATUSESArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED" };
    size_t sizeofArray = sizeof(ADACCOUNTSTATUSESArray) / sizeof(ADACCOUNTSTATUSESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ADACCOUNTSTATUSES, ADACCOUNTSTATUSESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function businessMemberAssetsGet_ADACCOUNTSTATUSES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessMemberAssetsGet_ADACCOUNTSTATUSES_convertToJSON(pinterest_rest_api_businessMemberAssetsGet_ad_account_statuses_e ADACCOUNTSTATUSES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessMemberAssetsGet_ADACCOUNTSTATUSES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessMemberAssetsGet_ad_account_statuses_e businessMemberAssetsGet_ADACCOUNTSTATUSES_parseFromJSON(cJSON* ADACCOUNTSTATUSESJSON) {
    pinterest_rest_api_businessMemberAssetsGet_ad_account_statuses_e ADACCOUNTSTATUSESVariable = 0;
    return ADACCOUNTSTATUSESVariable;
end:
    return 0;
}
*/

// Functions for enum PARTNERTYPE for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet

static char* businessPartnerAssetAccessGet_PARTNERTYPE_ToString(pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e PARTNERTYPE){
    char *PARTNERTYPEArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    return PARTNERTYPEArray[PARTNERTYPE];
}

static pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e businessPartnerAssetAccessGet_PARTNERTYPE_FromString(char* PARTNERTYPE){
    int stringToReturn = 0;
    char *PARTNERTYPEArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    size_t sizeofArray = sizeof(PARTNERTYPEArray) / sizeof(PARTNERTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PARTNERTYPE, PARTNERTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function businessPartnerAssetAccessGet_PARTNERTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessPartnerAssetAccessGet_PARTNERTYPE_convertToJSON(pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e PARTNERTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "partner_type", businessPartnerAssetAccessGet_PARTNERTYPE_ToString(PARTNERTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessPartnerAssetAccessGet_PARTNERTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e businessPartnerAssetAccessGet_PARTNERTYPE_parseFromJSON(cJSON* PARTNERTYPEJSON) {
    pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e PARTNERTYPEVariable = 0;
    cJSON *PARTNERTYPEVar = cJSON_GetObjectItemCaseSensitive(PARTNERTYPEJSON, "partner_type");
    if(!cJSON_IsString(PARTNERTYPEVar) || (PARTNERTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    PARTNERTYPEVariable = businessPartnerAssetAccessGet_PARTNERTYPE_FromString(PARTNERTYPEVar->valuestring);
    return PARTNERTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum ASSETTYPE for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet

static char* businessPartnerAssetAccessGet_ASSETTYPE_ToString(pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e ASSETTYPE){
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP", "PINNER_LIST", "CONVERSION_TAG", "CATALOG", "CONSUMER", "CONVERSION_SEGMENT" };
    return ASSETTYPEArray[ASSETTYPE];
}

static pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e businessPartnerAssetAccessGet_ASSETTYPE_FromString(char* ASSETTYPE){
    int stringToReturn = 0;
    char *ASSETTYPEArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP", "PINNER_LIST", "CONVERSION_TAG", "CATALOG", "CONSUMER", "CONVERSION_SEGMENT" };
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

// Functions for enum  for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet

static char* businessPartnerAssetAccessGet__ToString(pinterest_rest_api_businessPartnerAssetAccessGet_sort_by_e ){
    char *Array[] =  { "NULL", "NAME", "ID", "PERMISSIONS" };
    return Array[];
}

static pinterest_rest_api_businessPartnerAssetAccessGet_sort_by_e businessPartnerAssetAccessGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "NAME", "ID", "PERMISSIONS" };
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
// Function businessPartnerAssetAccessGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessPartnerAssetAccessGet__convertToJSON(pinterest_rest_api_businessPartnerAssetAccessGet_sort_by_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessPartnerAssetAccessGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessPartnerAssetAccessGet_sort_by_e businessPartnerAssetAccessGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_businessPartnerAssetAccessGet_sort_by_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet

static char* businessPartnerAssetAccessGet__ToString(pinterest_rest_api_businessPartnerAssetAccessGet_search_by_e ){
    char *Array[] =  { "NULL", "NAME", "ID", "NAME_OR_ID", "OWNER_NAME", "NAME_OR_OWNER" };
    return Array[];
}

static pinterest_rest_api_businessPartnerAssetAccessGet_search_by_e businessPartnerAssetAccessGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "NAME", "ID", "NAME_OR_ID", "OWNER_NAME", "NAME_OR_OWNER" };
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
// Function businessPartnerAssetAccessGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *businessPartnerAssetAccessGet__convertToJSON(pinterest_rest_api_businessPartnerAssetAccessGet_search_by_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function businessPartnerAssetAccessGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_businessPartnerAssetAccessGet_search_by_e businessPartnerAssetAccessGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_businessPartnerAssetAccessGet_search_by_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Create a new asset group.
//
// Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
//
asset_group_input_t*
BusinessAccessAssetsAPI_assetGroupCreate(apiClient_t *apiClient, char *business_id, asset_group_input_create_t *asset_group_input_create)
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
    char *localVarPath = strdup("/businesses/{business_id}/asset_groups");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_asset_group_input_create = NULL;
    if (asset_group_input_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_asset_group_input_create = asset_group_input_create_convertToJSON(asset_group_input_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_asset_group_input_create);
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
    asset_group_input_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = asset_group_input_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_asset_group_input_create) {
        cJSON_Delete(localVarSingleItemJSON_asset_group_input_create);
        localVarSingleItemJSON_asset_group_input_create = NULL;
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
asset_group_deletion_t*
BusinessAccessAssetsAPI_assetGroupDelete(apiClient_t *apiClient, char *business_id, asset_group_deletion_delete_t *asset_group_deletion_delete)
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
    char *localVarPath = strdup("/businesses/{business_id}/asset_groups");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_asset_group_deletion_delete = NULL;
    if (asset_group_deletion_delete != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_asset_group_deletion_delete = asset_group_deletion_delete_convertToJSON(asset_group_deletion_delete);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_asset_group_deletion_delete);
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    asset_group_deletion_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = asset_group_deletion_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_asset_group_deletion_delete) {
        cJSON_Delete(localVarSingleItemJSON_asset_group_deletion_delete);
        localVarSingleItemJSON_asset_group_deletion_delete = NULL;
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
asset_group_modification_t*
BusinessAccessAssetsAPI_assetGroupUpdate(apiClient_t *apiClient, char *business_id, asset_group_modification_read_or_update_t *asset_group_modification_read_or_update)
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
    char *localVarPath = strdup("/businesses/{business_id}/asset_groups");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_asset_group_modification_read_or_update = NULL;
    if (asset_group_modification_read_or_update != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_asset_group_modification_read_or_update = asset_group_modification_read_or_update_convertToJSON(asset_group_modification_read_or_update);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_asset_group_modification_read_or_update);
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
    asset_group_modification_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = asset_group_modification_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_asset_group_modification_read_or_update) {
        cJSON_Delete(localVarSingleItemJSON_asset_group_modification_read_or_update);
        localVarSingleItemJSON_asset_group_modification_read_or_update = NULL;
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
BusinessAccessAssetsAPI_businessAssetMembersGet(apiClient_t *apiClient, char *business_id, char *asset_id, int *start_index, int *fetch_system_users, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/businesses/{business_id}/assets/{asset_id}/members");

    if(!business_id)
        goto end;
    if(!asset_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen(asset_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);

    // Path Params
    long sizeOfPathParams_asset_id = strlen(business_id)+3 + strlen(asset_id)+3 + sizeof("{ asset_id }") - 1;
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
    char *keyQuery_fetch_system_users = NULL;
    char * valueQuery_fetch_system_users = NULL;
    keyValuePair_t *keyPairQuery_fetch_system_users = 0;
    if (fetch_system_users)
    {
        keyQuery_fetch_system_users = strdup("fetch_system_users");
        valueQuery_fetch_system_users = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_fetch_system_users, MAX_NUMBER_LENGTH, "%d", *fetch_system_users);
        keyPairQuery_fetch_system_users = keyValuePair_create(keyQuery_fetch_system_users, valueQuery_fetch_system_users);
        list_addElement(localVarQueryParameters,keyPairQuery_fetch_system_users);
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
    business_asset_members_get_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = business_asset_members_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if(keyQuery_fetch_system_users){
        free(keyQuery_fetch_system_users);
        keyQuery_fetch_system_users = NULL;
    }
    if(valueQuery_fetch_system_users){
        free(valueQuery_fetch_system_users);
        valueQuery_fetch_system_users = NULL;
    }
    if(keyPairQuery_fetch_system_users){
        keyValuePair_free(keyPairQuery_fetch_system_users);
        keyPairQuery_fetch_system_users = NULL;
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

// Get partners with access to asset
//
// Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
//
business_asset_members_get_200_response_t*
BusinessAccessAssetsAPI_businessAssetPartnersGet(apiClient_t *apiClient, char *business_id, char *asset_id, int *start_index, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/businesses/{business_id}/assets/{asset_id}/partners");

    if(!business_id)
        goto end;
    if(!asset_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen(asset_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);

    // Path Params
    long sizeOfPathParams_asset_id = strlen(business_id)+3 + strlen(asset_id)+3 + sizeof("{ asset_id }") - 1;
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
    business_asset_members_get_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = business_asset_members_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/businesses/{business_id}/assets");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
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
        keyPairQuery_asset_type = keyValuePair_create(keyQuery_asset_type, strdup(businessAssetsGet_ASSETTYPE_ToString(
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
    business_assets_get_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = business_assets_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
business_member_assets_get_response_t*
BusinessAccessAssetsAPI_businessMemberAssetsGet(apiClient_t *apiClient, char *business_id, char *member_id, pinterest_rest_api_businessMemberAssetsGet_asset_type_e asset_type, int *start_index, asset_sort_by_e sort_by, int *sort_ascending, asset_search_by_e search_by, char *search_value, asset_permission_type_e asset_permission_type, list_t *ad_account_statuses, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/businesses/{business_id}/members/{member_id}/assets");

    if(!business_id)
        goto end;
    if(!member_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen(member_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);

    // Path Params
    long sizeOfPathParams_member_id = strlen(business_id)+3 + strlen(member_id)+3 + sizeof("{ member_id }") - 1;
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
        keyPairQuery_asset_type = keyValuePair_create(keyQuery_asset_type, strdup(businessMemberAssetsGet_ASSETTYPE_ToString(
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
    char *keyQuery_sort_by = NULL;
    asset_sort_by_e valueQuery_sort_by ;
    keyValuePair_t *keyPairQuery_sort_by = 0;
    if (sort_by)
    {
        keyQuery_sort_by = strdup("sort_by");
        valueQuery_sort_by = (sort_by);
        keyPairQuery_sort_by = keyValuePair_create(keyQuery_sort_by, strdup(businessMemberAssetsGet__ToString(
        &valueQuery_sort_by)));
        list_addElement(localVarQueryParameters,keyPairQuery_sort_by);
    }

    // query parameters
    char *keyQuery_sort_ascending = NULL;
    char * valueQuery_sort_ascending = NULL;
    keyValuePair_t *keyPairQuery_sort_ascending = 0;
    if (sort_ascending)
    {
        keyQuery_sort_ascending = strdup("sort_ascending");
        valueQuery_sort_ascending = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_sort_ascending, MAX_NUMBER_LENGTH, "%d", *sort_ascending);
        keyPairQuery_sort_ascending = keyValuePair_create(keyQuery_sort_ascending, valueQuery_sort_ascending);
        list_addElement(localVarQueryParameters,keyPairQuery_sort_ascending);
    }

    // query parameters
    char *keyQuery_search_by = NULL;
    asset_search_by_e valueQuery_search_by ;
    keyValuePair_t *keyPairQuery_search_by = 0;
    if (search_by)
    {
        keyQuery_search_by = strdup("search_by");
        valueQuery_search_by = (search_by);
        keyPairQuery_search_by = keyValuePair_create(keyQuery_search_by, strdup(businessMemberAssetsGet__ToString(
        &valueQuery_search_by)));
        list_addElement(localVarQueryParameters,keyPairQuery_search_by);
    }

    // query parameters
    char *keyQuery_search_value = NULL;
    char * valueQuery_search_value = NULL;
    keyValuePair_t *keyPairQuery_search_value = 0;
    if (search_value)
    {
        keyQuery_search_value = strdup("search_value");
        valueQuery_search_value = strdup((search_value));
        keyPairQuery_search_value = keyValuePair_create(keyQuery_search_value, valueQuery_search_value);
        list_addElement(localVarQueryParameters,keyPairQuery_search_value);
    }

    // query parameters
    char *keyQuery_asset_permission_type = NULL;
    asset_permission_type_e valueQuery_asset_permission_type ;
    keyValuePair_t *keyPairQuery_asset_permission_type = 0;
    if (asset_permission_type)
    {
        keyQuery_asset_permission_type = strdup("asset_permission_type");
        valueQuery_asset_permission_type = (asset_permission_type);
        keyPairQuery_asset_permission_type = keyValuePair_create(keyQuery_asset_permission_type, strdup(businessMemberAssetsGet__ToString(
        &valueQuery_asset_permission_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_asset_permission_type);
    }

    // query parameters
    if (ad_account_statuses)
    {
        list_addElement(localVarQueryParameters,ad_account_statuses);
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
    business_member_assets_get_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = business_member_assets_get_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if(keyQuery_sort_by){
        free(keyQuery_sort_by);
        keyQuery_sort_by = NULL;
    }
    if(keyPairQuery_sort_by){
        keyValuePair_free(keyPairQuery_sort_by);
        keyPairQuery_sort_by = NULL;
    }
    if(keyQuery_sort_ascending){
        free(keyQuery_sort_ascending);
        keyQuery_sort_ascending = NULL;
    }
    if(valueQuery_sort_ascending){
        free(valueQuery_sort_ascending);
        valueQuery_sort_ascending = NULL;
    }
    if(keyPairQuery_sort_ascending){
        keyValuePair_free(keyPairQuery_sort_ascending);
        keyPairQuery_sort_ascending = NULL;
    }
    if(keyQuery_search_by){
        free(keyQuery_search_by);
        keyQuery_search_by = NULL;
    }
    if(keyPairQuery_search_by){
        keyValuePair_free(keyPairQuery_search_by);
        keyPairQuery_search_by = NULL;
    }
    if(keyQuery_search_value){
        free(keyQuery_search_value);
        keyQuery_search_value = NULL;
    }
    if(valueQuery_search_value){
        free(valueQuery_search_value);
        valueQuery_search_value = NULL;
    }
    if(keyPairQuery_search_value){
        keyValuePair_free(keyPairQuery_search_value);
        keyPairQuery_search_value = NULL;
    }
    if(keyQuery_asset_permission_type){
        free(keyQuery_asset_permission_type);
        keyQuery_asset_permission_type = NULL;
    }
    if(keyPairQuery_asset_permission_type){
        keyValuePair_free(keyPairQuery_asset_permission_type);
        keyPairQuery_asset_permission_type = NULL;
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
BusinessAccessAssetsAPI_businessMembersAssetAccessDelete(apiClient_t *apiClient, char *business_id, business_members_asset_access_delete_body_t *business_members_asset_access_delete_body)
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
    char *localVarPath = strdup("/businesses/{business_id}/members/assets/access");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);



    // Body Param
    cJSON *localVarSingleItemJSON_business_members_asset_access_delete_body = NULL;
    if (business_members_asset_access_delete_body != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_business_members_asset_access_delete_body = business_members_asset_access_delete_body_convertToJSON(business_members_asset_access_delete_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_business_members_asset_access_delete_body);
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    delete_member_access_results_response_array_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delete_member_access_results_response_array_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    free(localVarToReplace_business_id);
    if (localVarSingleItemJSON_business_members_asset_access_delete_body) {
        cJSON_Delete(localVarSingleItemJSON_business_members_asset_access_delete_body);
        localVarSingleItemJSON_business_members_asset_access_delete_body = NULL;
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
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/businesses/{business_id}/members/assets/access");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
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
        //not string, not binary
        localVarSingleItemJSON_update_member_asset_access_body = update_member_asset_access_body_convertToJSON(update_member_asset_access_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_member_asset_access_body);
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
    update_member_assets_results_response_array_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = update_member_assets_results_response_array_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
BusinessAccessAssetsAPI_businessPartnerAssetAccessGet(apiClient_t *apiClient, char *business_id, char *partner_id, pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e partner_type, pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e asset_type, int *start_index, asset_sort_by_e sort_by, int *sort_ascending, asset_search_by_e search_by, char *search_value, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/businesses/{business_id}/partners/{partner_id}/assets");

    if(!business_id)
        goto end;
    if(!partner_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + strlen(partner_id)+3 + sizeof("{ business_id }") - 1;
    if(business_id == NULL) {
        goto end;
    }
    char* localVarToReplace_business_id = malloc(sizeOfPathParams_business_id);
    sprintf(localVarToReplace_business_id, "{%s}", "business_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_business_id, business_id);

    // Path Params
    long sizeOfPathParams_partner_id = strlen(business_id)+3 + strlen(partner_id)+3 + sizeof("{ partner_id }") - 1;
    if(partner_id == NULL) {
        goto end;
    }
    char* localVarToReplace_partner_id = malloc(sizeOfPathParams_partner_id);
    sprintf(localVarToReplace_partner_id, "{%s}", "partner_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_partner_id, partner_id);



    // query parameters
    char *keyQuery_partner_type = NULL;
    pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e valueQuery_partner_type ;
    keyValuePair_t *keyPairQuery_partner_type = 0;
    if (partner_type)
    {
        keyQuery_partner_type = strdup("partner_type");
        valueQuery_partner_type = (partner_type);
        keyPairQuery_partner_type = keyValuePair_create(keyQuery_partner_type, strdup(businessPartnerAssetAccessGet_PARTNERTYPE_ToString(
        valueQuery_partner_type)));
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
        keyPairQuery_asset_type = keyValuePair_create(keyQuery_asset_type, strdup(businessPartnerAssetAccessGet_ASSETTYPE_ToString(
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
    char *keyQuery_sort_by = NULL;
    asset_sort_by_e valueQuery_sort_by ;
    keyValuePair_t *keyPairQuery_sort_by = 0;
    if (sort_by)
    {
        keyQuery_sort_by = strdup("sort_by");
        valueQuery_sort_by = (sort_by);
        keyPairQuery_sort_by = keyValuePair_create(keyQuery_sort_by, strdup(businessPartnerAssetAccessGet__ToString(
        &valueQuery_sort_by)));
        list_addElement(localVarQueryParameters,keyPairQuery_sort_by);
    }

    // query parameters
    char *keyQuery_sort_ascending = NULL;
    char * valueQuery_sort_ascending = NULL;
    keyValuePair_t *keyPairQuery_sort_ascending = 0;
    if (sort_ascending)
    {
        keyQuery_sort_ascending = strdup("sort_ascending");
        valueQuery_sort_ascending = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_sort_ascending, MAX_NUMBER_LENGTH, "%d", *sort_ascending);
        keyPairQuery_sort_ascending = keyValuePair_create(keyQuery_sort_ascending, valueQuery_sort_ascending);
        list_addElement(localVarQueryParameters,keyPairQuery_sort_ascending);
    }

    // query parameters
    char *keyQuery_search_by = NULL;
    asset_search_by_e valueQuery_search_by ;
    keyValuePair_t *keyPairQuery_search_by = 0;
    if (search_by)
    {
        keyQuery_search_by = strdup("search_by");
        valueQuery_search_by = (search_by);
        keyPairQuery_search_by = keyValuePair_create(keyQuery_search_by, strdup(businessPartnerAssetAccessGet__ToString(
        &valueQuery_search_by)));
        list_addElement(localVarQueryParameters,keyPairQuery_search_by);
    }

    // query parameters
    char *keyQuery_search_value = NULL;
    char * valueQuery_search_value = NULL;
    keyValuePair_t *keyPairQuery_search_value = 0;
    if (search_value)
    {
        keyQuery_search_value = strdup("search_value");
        valueQuery_search_value = strdup((search_value));
        keyPairQuery_search_value = keyValuePair_create(keyQuery_search_value, valueQuery_search_value);
        list_addElement(localVarQueryParameters,keyPairQuery_search_value);
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
    business_partner_asset_access_get_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = business_partner_asset_access_get_200_response_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    if(keyQuery_sort_by){
        free(keyQuery_sort_by);
        keyQuery_sort_by = NULL;
    }
    if(keyPairQuery_sort_by){
        keyValuePair_free(keyPairQuery_sort_by);
        keyPairQuery_sort_by = NULL;
    }
    if(keyQuery_sort_ascending){
        free(keyQuery_sort_ascending);
        keyQuery_sort_ascending = NULL;
    }
    if(valueQuery_sort_ascending){
        free(valueQuery_sort_ascending);
        valueQuery_sort_ascending = NULL;
    }
    if(keyPairQuery_sort_ascending){
        keyValuePair_free(keyPairQuery_sort_ascending);
        keyPairQuery_sort_ascending = NULL;
    }
    if(keyQuery_search_by){
        free(keyQuery_search_by);
        keyQuery_search_by = NULL;
    }
    if(keyPairQuery_search_by){
        keyValuePair_free(keyPairQuery_search_by);
        keyPairQuery_search_by = NULL;
    }
    if(keyQuery_search_value){
        free(keyQuery_search_value);
        keyQuery_search_value = NULL;
    }
    if(valueQuery_search_value){
        free(valueQuery_search_value);
        valueQuery_search_value = NULL;
    }
    if(keyPairQuery_search_value){
        keyValuePair_free(keyPairQuery_search_value);
        keyPairQuery_search_value = NULL;
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

// Delete partner access to asset
//
// Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
//
delete_partner_asset_access_results_response_array_t*
BusinessAccessAssetsAPI_deletePartnerAssetAccessHandlerImpl(apiClient_t *apiClient, char *business_id, delete_partner_asset_access_body_t *delete_partner_asset_access_body)
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
    char *localVarPath = strdup("/businesses/{business_id}/partners/assets");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
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
        //not string, not binary
        localVarSingleItemJSON_delete_partner_asset_access_body = delete_partner_asset_access_body_convertToJSON(delete_partner_asset_access_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_delete_partner_asset_access_body);
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    delete_partner_asset_access_results_response_array_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delete_partner_asset_access_results_response_array_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/businesses/{business_id}/partners/assets");

    if(!business_id)
        goto end;


    // Path Params
    long sizeOfPathParams_business_id = strlen(business_id)+3 + sizeof("{ business_id }") - 1;
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
        //not string, not binary
        localVarSingleItemJSON_update_partner_asset_access_body = update_partner_asset_access_body_convertToJSON(update_partner_asset_access_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_update_partner_asset_access_body);
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
    update_partner_assets_results_response_array_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *BusinessAccessAssetsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = update_partner_assets_results_response_array_parseFromJSON(BusinessAccessAssetsAPIlocalVarJSON);
        cJSON_Delete(BusinessAccessAssetsAPIlocalVarJSON);
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

