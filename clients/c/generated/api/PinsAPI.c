#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "PinsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum APPTYPES for PinsAPI_pinsAnalytics

static char* pinsAnalytics_APPTYPES_ToString(pinterest_rest_api_pinsAnalytics_app_types_e APPTYPES){
    char *APPTYPESArray[] =  { "NULL", "ALL", "MOBILE", "TABLET", "WEB" };
    return APPTYPESArray[APPTYPES];
}

static pinterest_rest_api_pinsAnalytics_app_types_e pinsAnalytics_APPTYPES_FromString(char* APPTYPES){
    int stringToReturn = 0;
    char *APPTYPESArray[] =  { "NULL", "ALL", "MOBILE", "TABLET", "WEB" };
    size_t sizeofArray = sizeof(APPTYPESArray) / sizeof(APPTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(APPTYPES, APPTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function pinsAnalytics_APPTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *pinsAnalytics_APPTYPES_convertToJSON(pinterest_rest_api_pinsAnalytics_app_types_e APPTYPES) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "app_types", pinsAnalytics_APPTYPES_ToString(APPTYPES)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function pinsAnalytics_APPTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_pinsAnalytics_app_types_e pinsAnalytics_APPTYPES_parseFromJSON(cJSON* APPTYPESJSON) {
    pinterest_rest_api_pinsAnalytics_app_types_e APPTYPESVariable = 0;
    cJSON *APPTYPESVar = cJSON_GetObjectItemCaseSensitive(APPTYPESJSON, "app_types");
    if(!cJSON_IsString(APPTYPESVar) || (APPTYPESVar->valuestring == NULL))
    {
        goto end;
    }
    APPTYPESVariable = pinsAnalytics_APPTYPES_FromString(APPTYPESVar->valuestring);
    return APPTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum SPLITFIELD for PinsAPI_pinsAnalytics

static char* pinsAnalytics_SPLITFIELD_ToString(pinterest_rest_api_pinsAnalytics_split_field_e SPLITFIELD){
    char *SPLITFIELDArray[] =  { "NULL", "NO_SPLIT", "APP_TYPE" };
    return SPLITFIELDArray[SPLITFIELD];
}

static pinterest_rest_api_pinsAnalytics_split_field_e pinsAnalytics_SPLITFIELD_FromString(char* SPLITFIELD){
    int stringToReturn = 0;
    char *SPLITFIELDArray[] =  { "NULL", "NO_SPLIT", "APP_TYPE" };
    size_t sizeofArray = sizeof(SPLITFIELDArray) / sizeof(SPLITFIELDArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SPLITFIELD, SPLITFIELDArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function pinsAnalytics_SPLITFIELD_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *pinsAnalytics_SPLITFIELD_convertToJSON(pinterest_rest_api_pinsAnalytics_split_field_e SPLITFIELD) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "split_field", pinsAnalytics_SPLITFIELD_ToString(SPLITFIELD)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function pinsAnalytics_SPLITFIELD_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_pinsAnalytics_split_field_e pinsAnalytics_SPLITFIELD_parseFromJSON(cJSON* SPLITFIELDJSON) {
    pinterest_rest_api_pinsAnalytics_split_field_e SPLITFIELDVariable = 0;
    cJSON *SPLITFIELDVar = cJSON_GetObjectItemCaseSensitive(SPLITFIELDJSON, "split_field");
    if(!cJSON_IsString(SPLITFIELDVar) || (SPLITFIELDVar->valuestring == NULL))
    {
        goto end;
    }
    SPLITFIELDVariable = pinsAnalytics_SPLITFIELD_FromString(SPLITFIELDVar->valuestring);
    return SPLITFIELDVariable;
end:
    return 0;
}
*/

// Functions for enum PINFILTER for PinsAPI_pinsList

static char* pinsList_PINFILTER_ToString(pinterest_rest_api_pinsList_pin_filter_e PINFILTER){
    char *PINFILTERArray[] =  { "NULL", "exclude_native", "exclude_repins", "has_been_promoted" };
    return PINFILTERArray[PINFILTER];
}

static pinterest_rest_api_pinsList_pin_filter_e pinsList_PINFILTER_FromString(char* PINFILTER){
    int stringToReturn = 0;
    char *PINFILTERArray[] =  { "NULL", "exclude_native", "exclude_repins", "has_been_promoted" };
    size_t sizeofArray = sizeof(PINFILTERArray) / sizeof(PINFILTERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PINFILTER, PINFILTERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function pinsList_PINFILTER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *pinsList_PINFILTER_convertToJSON(pinterest_rest_api_pinsList_pin_filter_e PINFILTER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pin_filter", pinsList_PINFILTER_ToString(PINFILTER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function pinsList_PINFILTER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_pinsList_pin_filter_e pinsList_PINFILTER_parseFromJSON(cJSON* PINFILTERJSON) {
    pinterest_rest_api_pinsList_pin_filter_e PINFILTERVariable = 0;
    cJSON *PINFILTERVar = cJSON_GetObjectItemCaseSensitive(PINFILTERJSON, "pin_filter");
    if(!cJSON_IsString(PINFILTERVar) || (PINFILTERVar->valuestring == NULL))
    {
        goto end;
    }
    PINFILTERVariable = pinsList_PINFILTER_FromString(PINFILTERVar->valuestring);
    return PINFILTERVariable;
end:
    return 0;
}
*/

// Functions for enum PINTYPE for PinsAPI_pinsList

static char* pinsList_PINTYPE_ToString(pinterest_rest_api_pinsList_pin_type_e PINTYPE){
    char *PINTYPEArray[] =  { "NULL", "PRIVATE" };
    return PINTYPEArray[PINTYPE];
}

static pinterest_rest_api_pinsList_pin_type_e pinsList_PINTYPE_FromString(char* PINTYPE){
    int stringToReturn = 0;
    char *PINTYPEArray[] =  { "NULL", "PRIVATE" };
    size_t sizeofArray = sizeof(PINTYPEArray) / sizeof(PINTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PINTYPE, PINTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function pinsList_PINTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *pinsList_PINTYPE_convertToJSON(pinterest_rest_api_pinsList_pin_type_e PINTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pin_type", pinsList_PINTYPE_ToString(PINTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function pinsList_PINTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_pinsList_pin_type_e pinsList_PINTYPE_parseFromJSON(cJSON* PINTYPEJSON) {
    pinterest_rest_api_pinsList_pin_type_e PINTYPEVariable = 0;
    cJSON *PINTYPEVar = cJSON_GetObjectItemCaseSensitive(PINTYPEJSON, "pin_type");
    if(!cJSON_IsString(PINTYPEVar) || (PINTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    PINTYPEVariable = pinsList_PINTYPE_FromString(PINTYPEVar->valuestring);
    return PINTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum CREATIVETYPES for PinsAPI_pinsList

static char* pinsList_CREATIVETYPES_ToString(pinterest_rest_api_pinsList_creative_types_e CREATIVETYPES){
    char *CREATIVETYPESArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    return CREATIVETYPESArray[CREATIVETYPES];
}

static pinterest_rest_api_pinsList_creative_types_e pinsList_CREATIVETYPES_FromString(char* CREATIVETYPES){
    int stringToReturn = 0;
    char *CREATIVETYPESArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    size_t sizeofArray = sizeof(CREATIVETYPESArray) / sizeof(CREATIVETYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CREATIVETYPES, CREATIVETYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function pinsList_CREATIVETYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *pinsList_CREATIVETYPES_convertToJSON(pinterest_rest_api_pinsList_creative_types_e CREATIVETYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function pinsList_CREATIVETYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_pinsList_creative_types_e pinsList_CREATIVETYPES_parseFromJSON(cJSON* CREATIVETYPESJSON) {
    pinterest_rest_api_pinsList_creative_types_e CREATIVETYPESVariable = 0;
    return CREATIVETYPESVariable;
end:
    return 0;
}
*/


// Get Pin analytics
//
// Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
//
list_t*_t*
PinsAPI_pinsAnalytics(apiClient_t *apiClient, char *pin_id, char start_date, char end_date, list_t *metric_types, pinterest_rest_api_pinsAnalytics_app_types_e app_types, pinterest_rest_api_pinsAnalytics_split_field_e split_field, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/pins/{pin_id}/analytics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/pins/{pin_id}/analytics");


    // Path Params
    long sizeOfPathParams_pin_id = strlen(pin_id)+3 + strlen("{ pin_id }");
    if(pin_id == NULL) {
        goto end;
    }
    char* localVarToReplace_pin_id = malloc(sizeOfPathParams_pin_id);
    sprintf(localVarToReplace_pin_id, "{%s}", "pin_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_pin_id, pin_id);



    // query parameters
    char *keyQuery_start_date = NULL;
    char valueQuery_start_date ;
    keyValuePair_t *keyPairQuery_start_date = 0;
    if (start_date)
    {
        keyQuery_start_date = strdup("start_date");
        valueQuery_start_date = (start_date);
        keyPairQuery_start_date = keyValuePair_create(keyQuery_start_date, &valueQuery_start_date);
        list_addElement(localVarQueryParameters,keyPairQuery_start_date);
    }

    // query parameters
    char *keyQuery_end_date = NULL;
    char valueQuery_end_date ;
    keyValuePair_t *keyPairQuery_end_date = 0;
    if (end_date)
    {
        keyQuery_end_date = strdup("end_date");
        valueQuery_end_date = (end_date);
        keyPairQuery_end_date = keyValuePair_create(keyQuery_end_date, &valueQuery_end_date);
        list_addElement(localVarQueryParameters,keyPairQuery_end_date);
    }

    // query parameters
    char *keyQuery_app_types = NULL;
    pinterest_rest_api_pinsAnalytics_app_types_e valueQuery_app_types ;
    keyValuePair_t *keyPairQuery_app_types = 0;
    if (app_types)
    {
        keyQuery_app_types = strdup("app_types");
        valueQuery_app_types = (app_types);
        keyPairQuery_app_types = keyValuePair_create(keyQuery_app_types, (void *)strdup(pinsAnalytics_APPTYPES_ToString(
        valueQuery_app_types)));
        list_addElement(localVarQueryParameters,keyPairQuery_app_types);
    }

    // query parameters
    if (metric_types)
    {
        list_addElement(localVarQueryParameters,metric_types);
    }

    // query parameters
    char *keyQuery_split_field = NULL;
    pinterest_rest_api_pinsAnalytics_split_field_e valueQuery_split_field ;
    keyValuePair_t *keyPairQuery_split_field = 0;
    if (split_field)
    {
        keyQuery_split_field = strdup("split_field");
        valueQuery_split_field = (split_field);
        keyPairQuery_split_field = keyValuePair_create(keyQuery_split_field, (void *)strdup(pinsAnalytics_SPLITFIELD_ToString(
        valueQuery_split_field)));
        list_addElement(localVarQueryParameters,keyPairQuery_split_field);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
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
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid pins analytics parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access board or Pin.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Pin not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    cJSON *PinsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(PinsAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_createList();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, PinsAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( PinsAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_pin_id);
    if(keyQuery_start_date){
        free(keyQuery_start_date);
        keyQuery_start_date = NULL;
    }
    if(keyPairQuery_start_date){
        keyValuePair_free(keyPairQuery_start_date);
        keyPairQuery_start_date = NULL;
    }
    if(keyQuery_end_date){
        free(keyQuery_end_date);
        keyQuery_end_date = NULL;
    }
    if(keyPairQuery_end_date){
        keyValuePair_free(keyPairQuery_end_date);
        keyPairQuery_end_date = NULL;
    }
    if(keyQuery_app_types){
        free(keyQuery_app_types);
        keyQuery_app_types = NULL;
    }
    if(keyPairQuery_app_types){
        keyValuePair_free(keyPairQuery_app_types);
        keyPairQuery_app_types = NULL;
    }
    if(keyQuery_split_field){
        free(keyQuery_split_field);
        keyQuery_split_field = NULL;
    }
    if(keyPairQuery_split_field){
        keyValuePair_free(keyPairQuery_split_field);
        keyPairQuery_split_field = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create Pin
//
// Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
//
pin_t*
PinsAPI_pinsCreate(apiClient_t *apiClient, pin_create_t *pin_create, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/pins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/pins");




    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_pin_create = NULL;
    if (pin_create != NULL)
    {
        //string
        localVarSingleItemJSON_pin_create = pin_create_convertToJSON(pin_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_pin_create);
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
    //if (apiClient->response_code == 201) {
    //    printf("%s\n","Successful pin creation.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid Pin parameters response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The Pin&#39;s image is too small, too large or is broken");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Board or section not found");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *PinsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    pin_t *elementToReturn = pin_parseFromJSON(PinsAPIlocalVarJSON);
    cJSON_Delete(PinsAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_pin_create) {
        cJSON_Delete(localVarSingleItemJSON_pin_create);
        localVarSingleItemJSON_pin_create = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete Pin
//
// Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
//
void
PinsAPI_pinsDelete(apiClient_t *apiClient, char *pin_id, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/pins/{pin_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/pins/{pin_id}");


    // Path Params
    long sizeOfPathParams_pin_id = strlen(pin_id)+3 + strlen("{ pin_id }");
    if(pin_id == NULL) {
        goto end;
    }
    char* localVarToReplace_pin_id = malloc(sizeOfPathParams_pin_id);
    sprintf(localVarToReplace_pin_id, "{%s}", "pin_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_pin_id, pin_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 204) {
    //    printf("%s\n","Successfully deleted Pin");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access board or Pin.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Pin not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_pin_id);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }

}

// Get Pin
//
// Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
//
pin_t*
PinsAPI_pinsGet(apiClient_t *apiClient, char *pin_id, int *pin_metrics, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/pins/{pin_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/pins/{pin_id}");


    // Path Params
    long sizeOfPathParams_pin_id = strlen(pin_id)+3 + strlen("{ pin_id }");
    if(pin_id == NULL) {
        goto end;
    }
    char* localVarToReplace_pin_id = malloc(sizeOfPathParams_pin_id);
    sprintf(localVarToReplace_pin_id, "{%s}", "pin_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_pin_id, pin_id);



    // query parameters
    char *keyQuery_pin_metrics = NULL;
    char * valueQuery_pin_metrics = NULL;
    keyValuePair_t *keyPairQuery_pin_metrics = 0;
    if (pin_metrics)
    {
        keyQuery_pin_metrics = strdup("pin_metrics");
        valueQuery_pin_metrics = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_pin_metrics, MAX_NUMBER_LENGTH, "%d", *pin_metrics);
        keyPairQuery_pin_metrics = keyValuePair_create(keyQuery_pin_metrics, valueQuery_pin_metrics);
        list_addElement(localVarQueryParameters,keyPairQuery_pin_metrics);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
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
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access board or Pin.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Pin not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *PinsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    pin_t *elementToReturn = pin_parseFromJSON(PinsAPIlocalVarJSON);
    cJSON_Delete(PinsAPIlocalVarJSON);
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
    free(localVarToReplace_pin_id);
    if(keyQuery_pin_metrics){
        free(keyQuery_pin_metrics);
        keyQuery_pin_metrics = NULL;
    }
    if(valueQuery_pin_metrics){
        free(valueQuery_pin_metrics);
        valueQuery_pin_metrics = NULL;
    }
    if(keyPairQuery_pin_metrics){
        keyValuePair_free(keyPairQuery_pin_metrics);
        keyPairQuery_pin_metrics = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List Pins
//
// Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
//
pins_list_200_response_t*
PinsAPI_pinsList(apiClient_t *apiClient, char *bookmark, int *page_size, pinterest_rest_api_pinsList_pin_filter_e pin_filter, int *include_protected_pins, pinterest_rest_api_pinsList_pin_type_e pin_type, list_t *creative_types, char *ad_account_id, int *pin_metrics)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/pins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/pins");




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
    char *keyQuery_pin_filter = NULL;
    pinterest_rest_api_pinsList_pin_filter_e valueQuery_pin_filter ;
    keyValuePair_t *keyPairQuery_pin_filter = 0;
    if (pin_filter)
    {
        keyQuery_pin_filter = strdup("pin_filter");
        valueQuery_pin_filter = (pin_filter);
        keyPairQuery_pin_filter = keyValuePair_create(keyQuery_pin_filter, (void *)strdup(pinsList_PINFILTER_ToString(
        valueQuery_pin_filter)));
        list_addElement(localVarQueryParameters,keyPairQuery_pin_filter);
    }

    // query parameters
    char *keyQuery_include_protected_pins = NULL;
    char * valueQuery_include_protected_pins = NULL;
    keyValuePair_t *keyPairQuery_include_protected_pins = 0;
    if (include_protected_pins)
    {
        keyQuery_include_protected_pins = strdup("include_protected_pins");
        valueQuery_include_protected_pins = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_protected_pins, MAX_NUMBER_LENGTH, "%d", *include_protected_pins);
        keyPairQuery_include_protected_pins = keyValuePair_create(keyQuery_include_protected_pins, valueQuery_include_protected_pins);
        list_addElement(localVarQueryParameters,keyPairQuery_include_protected_pins);
    }

    // query parameters
    char *keyQuery_pin_type = NULL;
    pinterest_rest_api_pinsList_pin_type_e valueQuery_pin_type ;
    keyValuePair_t *keyPairQuery_pin_type = 0;
    if (pin_type)
    {
        keyQuery_pin_type = strdup("pin_type");
        valueQuery_pin_type = (pin_type);
        keyPairQuery_pin_type = keyValuePair_create(keyQuery_pin_type, (void *)strdup(pinsList_PINTYPE_ToString(
        valueQuery_pin_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_pin_type);
    }

    // query parameters
    if (creative_types)
    {
        list_addElement(localVarQueryParameters,creative_types);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // query parameters
    char *keyQuery_pin_metrics = NULL;
    char * valueQuery_pin_metrics = NULL;
    keyValuePair_t *keyPairQuery_pin_metrics = 0;
    if (pin_metrics)
    {
        keyQuery_pin_metrics = strdup("pin_metrics");
        valueQuery_pin_metrics = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_pin_metrics, MAX_NUMBER_LENGTH, "%d", *pin_metrics);
        keyPairQuery_pin_metrics = keyValuePair_create(keyQuery_pin_metrics, valueQuery_pin_metrics);
        list_addElement(localVarQueryParameters,keyPairQuery_pin_metrics);
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
    //    printf("%s\n","Invalid pin filter value");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *PinsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    pins_list_200_response_t *elementToReturn = pins_list_200_response_parseFromJSON(PinsAPIlocalVarJSON);
    cJSON_Delete(PinsAPIlocalVarJSON);
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
    if(keyQuery_pin_filter){
        free(keyQuery_pin_filter);
        keyQuery_pin_filter = NULL;
    }
    if(keyPairQuery_pin_filter){
        keyValuePair_free(keyPairQuery_pin_filter);
        keyPairQuery_pin_filter = NULL;
    }
    if(keyQuery_include_protected_pins){
        free(keyQuery_include_protected_pins);
        keyQuery_include_protected_pins = NULL;
    }
    if(valueQuery_include_protected_pins){
        free(valueQuery_include_protected_pins);
        valueQuery_include_protected_pins = NULL;
    }
    if(keyPairQuery_include_protected_pins){
        keyValuePair_free(keyPairQuery_include_protected_pins);
        keyPairQuery_include_protected_pins = NULL;
    }
    if(keyQuery_pin_type){
        free(keyQuery_pin_type);
        keyQuery_pin_type = NULL;
    }
    if(keyPairQuery_pin_type){
        keyValuePair_free(keyPairQuery_pin_type);
        keyPairQuery_pin_type = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_pin_metrics){
        free(keyQuery_pin_metrics);
        keyQuery_pin_metrics = NULL;
    }
    if(valueQuery_pin_metrics){
        free(valueQuery_pin_metrics);
        valueQuery_pin_metrics = NULL;
    }
    if(keyPairQuery_pin_metrics){
        keyValuePair_free(keyPairQuery_pin_metrics);
        keyPairQuery_pin_metrics = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Save Pin
//
// Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
//
pin_t*
PinsAPI_pinsSave(apiClient_t *apiClient, char *pin_id, pins_save_request_t *pins_save_request, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/pins/{pin_id}/save")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/pins/{pin_id}/save");


    // Path Params
    long sizeOfPathParams_pin_id = strlen(pin_id)+3 + strlen("{ pin_id }");
    if(pin_id == NULL) {
        goto end;
    }
    char* localVarToReplace_pin_id = malloc(sizeOfPathParams_pin_id);
    sprintf(localVarToReplace_pin_id, "{%s}", "pin_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_pin_id, pin_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_pins_save_request = NULL;
    if (pins_save_request != NULL)
    {
        //string
        localVarSingleItemJSON_pins_save_request = pins_save_request_convertToJSON(pins_save_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_pins_save_request);
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
    //if (apiClient->response_code == 201) {
    //    printf("%s\n","Successfully saved pin.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access Board or Pin.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Board or Pin not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *PinsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    pin_t *elementToReturn = pin_parseFromJSON(PinsAPIlocalVarJSON);
    cJSON_Delete(PinsAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_pin_id);
    if (localVarSingleItemJSON_pins_save_request) {
        cJSON_Delete(localVarSingleItemJSON_pins_save_request);
        localVarSingleItemJSON_pins_save_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update Pin
//
// Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
//
pin_t*
PinsAPI_pinsUpdate(apiClient_t *apiClient, char *pin_id, pin_update_t *pin_update, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/pins/{pin_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/pins/{pin_id}");


    // Path Params
    long sizeOfPathParams_pin_id = strlen(pin_id)+3 + strlen("{ pin_id }");
    if(pin_id == NULL) {
        goto end;
    }
    char* localVarToReplace_pin_id = malloc(sizeOfPathParams_pin_id);
    sprintf(localVarToReplace_pin_id, "{%s}", "pin_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_pin_id, pin_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_pin_update = NULL;
    if (pin_update != NULL)
    {
        //string
        localVarSingleItemJSON_pin_update = pin_update_convertToJSON(pin_update);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_pin_update);
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
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to update Pin.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Pin not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *PinsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    pin_t *elementToReturn = pin_parseFromJSON(PinsAPIlocalVarJSON);
    cJSON_Delete(PinsAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_pin_id);
    if (localVarSingleItemJSON_pin_update) {
        cJSON_Delete(localVarSingleItemJSON_pin_update);
        localVarSingleItemJSON_pin_update = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

