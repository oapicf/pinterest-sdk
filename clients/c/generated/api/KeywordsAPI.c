#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "KeywordsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum MATCHTYPES for KeywordsAPI_keywordsGet

static char* keywordsGet_MATCHTYPES_ToString(pinterest_rest_api_keywordsGet_match_types_e MATCHTYPES){
    char *MATCHTYPESArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE" };
    return MATCHTYPESArray[MATCHTYPES];
}

static pinterest_rest_api_keywordsGet_match_types_e keywordsGet_MATCHTYPES_FromString(char* MATCHTYPES){
    int stringToReturn = 0;
    char *MATCHTYPESArray[] =  { "NULL", "BROAD", "PHRASE", "EXACT", "EXACT_NEGATIVE", "PHRASE_NEGATIVE" };
    size_t sizeofArray = sizeof(MATCHTYPESArray) / sizeof(MATCHTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(MATCHTYPES, MATCHTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function keywordsGet_MATCHTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *keywordsGet_MATCHTYPES_convertToJSON(pinterest_rest_api_keywordsGet_match_types_e MATCHTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function keywordsGet_MATCHTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_keywordsGet_match_types_e keywordsGet_MATCHTYPES_parseFromJSON(cJSON* MATCHTYPESJSON) {
    pinterest_rest_api_keywordsGet_match_types_e MATCHTYPESVariable = 0;
    return MATCHTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum  for KeywordsAPI_trendingKeywordsList

static char* trendingKeywordsList__ToString(pinterest_rest_api_trendingKeywordsList_region_e ){
    char *Array[] =  { "NULL", "US", "CA", "DE", "FR", "ES", "IT", "DE+AT+CH", "GB+IE", "IT+ES+PT+GR+MT", "PL+RO+HU+SK+CZ", "SE+DK+FI+NO", "NL+BE+LU", "AR", "BR", "CO", "MX", "MX+AR+CO+CL", "AU+NZ" };
    return Array[];
}

static pinterest_rest_api_trendingKeywordsList_region_e trendingKeywordsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "US", "CA", "DE", "FR", "ES", "IT", "DE+AT+CH", "GB+IE", "IT+ES+PT+GR+MT", "PL+RO+HU+SK+CZ", "SE+DK+FI+NO", "NL+BE+LU", "AR", "BR", "CO", "MX", "MX+AR+CO+CL", "AU+NZ" };
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
// Function trendingKeywordsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendingKeywordsList__convertToJSON(pinterest_rest_api_trendingKeywordsList_region_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendingKeywordsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendingKeywordsList_region_e trendingKeywordsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendingKeywordsList_region_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for KeywordsAPI_trendingKeywordsList

static char* trendingKeywordsList__ToString(pinterest_rest_api_trendingKeywordsList_trend_type_e ){
    char *Array[] =  { "NULL", "growing", "monthly", "yearly", "seasonal" };
    return Array[];
}

static pinterest_rest_api_trendingKeywordsList_trend_type_e trendingKeywordsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "growing", "monthly", "yearly", "seasonal" };
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
// Function trendingKeywordsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendingKeywordsList__convertToJSON(pinterest_rest_api_trendingKeywordsList_trend_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendingKeywordsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendingKeywordsList_trend_type_e trendingKeywordsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendingKeywordsList_trend_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum INTERESTS for KeywordsAPI_trendingKeywordsList

static char* trendingKeywordsList_INTERESTS_ToString(pinterest_rest_api_trendingKeywordsList_interests_e INTERESTS){
    char *INTERESTSArray[] =  { "NULL", "animals", "architecture", "art", "beauty", "childrens_fashion", "design", "diy_and_crafts", "education", "electronics", "entertainment", "event_planning", "finance", "food_and_drinks", "gardening", "health", "home_decor", "mens_fashion", "parenting", "quotes", "sport", "travel", "vehicles", "wedding", "womens_fashion" };
    return INTERESTSArray[INTERESTS];
}

static pinterest_rest_api_trendingKeywordsList_interests_e trendingKeywordsList_INTERESTS_FromString(char* INTERESTS){
    int stringToReturn = 0;
    char *INTERESTSArray[] =  { "NULL", "animals", "architecture", "art", "beauty", "childrens_fashion", "design", "diy_and_crafts", "education", "electronics", "entertainment", "event_planning", "finance", "food_and_drinks", "gardening", "health", "home_decor", "mens_fashion", "parenting", "quotes", "sport", "travel", "vehicles", "wedding", "womens_fashion" };
    size_t sizeofArray = sizeof(INTERESTSArray) / sizeof(INTERESTSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(INTERESTS, INTERESTSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendingKeywordsList_INTERESTS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendingKeywordsList_INTERESTS_convertToJSON(pinterest_rest_api_trendingKeywordsList_interests_e INTERESTS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendingKeywordsList_INTERESTS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendingKeywordsList_interests_e trendingKeywordsList_INTERESTS_parseFromJSON(cJSON* INTERESTSJSON) {
    pinterest_rest_api_trendingKeywordsList_interests_e INTERESTSVariable = 0;
    return INTERESTSVariable;
end:
    return 0;
}
*/

// Functions for enum GENDERS for KeywordsAPI_trendingKeywordsList

static char* trendingKeywordsList_GENDERS_ToString(pinterest_rest_api_trendingKeywordsList_genders_e GENDERS){
    char *GENDERSArray[] =  { "NULL", "female", "male", "unknown" };
    return GENDERSArray[GENDERS];
}

static pinterest_rest_api_trendingKeywordsList_genders_e trendingKeywordsList_GENDERS_FromString(char* GENDERS){
    int stringToReturn = 0;
    char *GENDERSArray[] =  { "NULL", "female", "male", "unknown" };
    size_t sizeofArray = sizeof(GENDERSArray) / sizeof(GENDERSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GENDERS, GENDERSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendingKeywordsList_GENDERS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendingKeywordsList_GENDERS_convertToJSON(pinterest_rest_api_trendingKeywordsList_genders_e GENDERS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendingKeywordsList_GENDERS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendingKeywordsList_genders_e trendingKeywordsList_GENDERS_parseFromJSON(cJSON* GENDERSJSON) {
    pinterest_rest_api_trendingKeywordsList_genders_e GENDERSVariable = 0;
    return GENDERSVariable;
end:
    return 0;
}
*/

// Functions for enum AGES for KeywordsAPI_trendingKeywordsList

static char* trendingKeywordsList_AGES_ToString(pinterest_rest_api_trendingKeywordsList_ages_e AGES){
    char *AGESArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return AGESArray[AGES];
}

static pinterest_rest_api_trendingKeywordsList_ages_e trendingKeywordsList_AGES_FromString(char* AGES){
    int stringToReturn = 0;
    char *AGESArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(AGESArray) / sizeof(AGESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(AGES, AGESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendingKeywordsList_AGES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendingKeywordsList_AGES_convertToJSON(pinterest_rest_api_trendingKeywordsList_ages_e AGES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendingKeywordsList_AGES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendingKeywordsList_ages_e trendingKeywordsList_AGES_parseFromJSON(cJSON* AGESJSON) {
    pinterest_rest_api_trendingKeywordsList_ages_e AGESVariable = 0;
    return AGESVariable;
end:
    return 0;
}
*/


// Get country's keyword metrics
//
// See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
//
keywords_metrics_array_response_t*
KeywordsAPI_countryKeywordsMetricsGet(apiClient_t *apiClient, char *ad_account_id, char *country_code, list_t *keywords)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/keywords/metrics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/keywords/metrics");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    char *keyQuery_country_code = NULL;
    char * valueQuery_country_code = NULL;
    keyValuePair_t *keyPairQuery_country_code = 0;
    if (country_code)
    {
        keyQuery_country_code = strdup("country_code");
        valueQuery_country_code = strdup((country_code));
        keyPairQuery_country_code = keyValuePair_create(keyQuery_country_code, valueQuery_country_code);
        list_addElement(localVarQueryParameters,keyPairQuery_country_code);
    }

    // query parameters
    if (keywords)
    {
        list_addElement(localVarQueryParameters,keywords);
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
    cJSON *KeywordsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    keywords_metrics_array_response_t *elementToReturn = keywords_metrics_array_response_parseFromJSON(KeywordsAPIlocalVarJSON);
    cJSON_Delete(KeywordsAPIlocalVarJSON);
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
    if(keyQuery_country_code){
        free(keyQuery_country_code);
        keyQuery_country_code = NULL;
    }
    if(valueQuery_country_code){
        free(valueQuery_country_code);
        valueQuery_country_code = NULL;
    }
    if(keyPairQuery_country_code){
        keyValuePair_free(keyPairQuery_country_code);
        keyPairQuery_country_code = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create keywords
//
// <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p>
//
keywords_response_t*
KeywordsAPI_keywordsCreate(apiClient_t *apiClient, char *ad_account_id, keywords_request_t *keywords_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/keywords")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/keywords");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_keywords_request = NULL;
    if (keywords_request != NULL)
    {
        //string
        localVarSingleItemJSON_keywords_request = keywords_request_convertToJSON(keywords_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_keywords_request);
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
    cJSON *KeywordsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    keywords_response_t *elementToReturn = keywords_response_parseFromJSON(KeywordsAPIlocalVarJSON);
    cJSON_Delete(KeywordsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_keywords_request) {
        cJSON_Delete(localVarSingleItemJSON_keywords_request);
        localVarSingleItemJSON_keywords_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get keywords
//
// <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
//
keywords_get_200_response_t*
KeywordsAPI_keywordsGet(apiClient_t *apiClient, char *ad_account_id, char *campaign_id, char *ad_group_id, list_t *match_types, int *page_size, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/keywords")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/keywords");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    char *keyQuery_campaign_id = NULL;
    char * valueQuery_campaign_id = NULL;
    keyValuePair_t *keyPairQuery_campaign_id = 0;
    if (campaign_id)
    {
        keyQuery_campaign_id = strdup("campaign_id");
        valueQuery_campaign_id = strdup((campaign_id));
        keyPairQuery_campaign_id = keyValuePair_create(keyQuery_campaign_id, valueQuery_campaign_id);
        list_addElement(localVarQueryParameters,keyPairQuery_campaign_id);
    }

    // query parameters
    char *keyQuery_ad_group_id = NULL;
    char * valueQuery_ad_group_id = NULL;
    keyValuePair_t *keyPairQuery_ad_group_id = 0;
    if (ad_group_id)
    {
        keyQuery_ad_group_id = strdup("ad_group_id");
        valueQuery_ad_group_id = strdup((ad_group_id));
        keyPairQuery_ad_group_id = keyValuePair_create(keyQuery_ad_group_id, valueQuery_ad_group_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_group_id);
    }

    // query parameters
    if (match_types)
    {
        list_addElement(localVarQueryParameters,match_types);
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
    cJSON *KeywordsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    keywords_get_200_response_t *elementToReturn = keywords_get_200_response_parseFromJSON(KeywordsAPIlocalVarJSON);
    cJSON_Delete(KeywordsAPIlocalVarJSON);
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
    if(keyQuery_campaign_id){
        free(keyQuery_campaign_id);
        keyQuery_campaign_id = NULL;
    }
    if(valueQuery_campaign_id){
        free(valueQuery_campaign_id);
        valueQuery_campaign_id = NULL;
    }
    if(keyPairQuery_campaign_id){
        keyValuePair_free(keyPairQuery_campaign_id);
        keyPairQuery_campaign_id = NULL;
    }
    if(keyQuery_ad_group_id){
        free(keyQuery_ad_group_id);
        keyQuery_ad_group_id = NULL;
    }
    if(valueQuery_ad_group_id){
        free(valueQuery_ad_group_id);
        valueQuery_ad_group_id = NULL;
    }
    if(keyPairQuery_ad_group_id){
        keyValuePair_free(keyPairQuery_ad_group_id);
        keyPairQuery_ad_group_id = NULL;
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

// Update keywords
//
// <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
//
keywords_response_t*
KeywordsAPI_keywordsUpdate(apiClient_t *apiClient, char *ad_account_id, keyword_update_body_t *keyword_update_body)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/keywords")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/keywords");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_keyword_update_body = NULL;
    if (keyword_update_body != NULL)
    {
        //string
        localVarSingleItemJSON_keyword_update_body = keyword_update_body_convertToJSON(keyword_update_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_keyword_update_body);
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
    cJSON *KeywordsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    keywords_response_t *elementToReturn = keywords_response_parseFromJSON(KeywordsAPIlocalVarJSON);
    cJSON_Delete(KeywordsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_keyword_update_body) {
        cJSON_Delete(localVarSingleItemJSON_keyword_update_body);
        localVarSingleItemJSON_keyword_update_body = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List trending keywords
//
// <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>. 
//
trending_keywords_response_t*
KeywordsAPI_trendingKeywordsList(apiClient_t *apiClient, trends_supported_region_e region, trend_type_e trend_type, list_t *interests, list_t *genders, list_t *ages, list_t *include_keywords, int *normalize_against_group, int *limit)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/trends/keywords/{region}/top/{trend_type}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/trends/keywords/{region}/top/{trend_type}");


    // Path Params
    long sizeOfPathParams_region =  +  + strlen("{ region }");

    // Path Params
    long sizeOfPathParams_trend_type =  +  + strlen("{ trend_type }");



    // query parameters
    if (interests)
    {
        list_addElement(localVarQueryParameters,interests);
    }

    // query parameters
    if (genders)
    {
        list_addElement(localVarQueryParameters,genders);
    }

    // query parameters
    if (ages)
    {
        list_addElement(localVarQueryParameters,ages);
    }

    // query parameters
    if (include_keywords)
    {
        list_addElement(localVarQueryParameters,include_keywords);
    }

    // query parameters
    char *keyQuery_normalize_against_group = NULL;
    char * valueQuery_normalize_against_group = NULL;
    keyValuePair_t *keyPairQuery_normalize_against_group = 0;
    if (normalize_against_group)
    {
        keyQuery_normalize_against_group = strdup("normalize_against_group");
        valueQuery_normalize_against_group = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_normalize_against_group, MAX_NUMBER_LENGTH, "%d", *normalize_against_group);
        keyPairQuery_normalize_against_group = keyValuePair_create(keyQuery_normalize_against_group, valueQuery_normalize_against_group);
        list_addElement(localVarQueryParameters,keyPairQuery_normalize_against_group);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
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
    //    printf("%s\n","Invalid trending keywords request parameters");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *KeywordsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    trending_keywords_response_t *elementToReturn = trending_keywords_response_parseFromJSON(KeywordsAPIlocalVarJSON);
    cJSON_Delete(KeywordsAPIlocalVarJSON);
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
    free(localVarToReplace_region);
    free(localVarToReplace_trend_type);
    if(keyQuery_normalize_against_group){
        free(keyQuery_normalize_against_group);
        keyQuery_normalize_against_group = NULL;
    }
    if(valueQuery_normalize_against_group){
        free(valueQuery_normalize_against_group);
        valueQuery_normalize_against_group = NULL;
    }
    if(keyPairQuery_normalize_against_group){
        keyValuePair_free(keyPairQuery_normalize_against_group);
        keyPairQuery_normalize_against_group = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

