#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "CatalogFeedsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for CatalogFeedsAPI_itemsIssuesList

static char* itemsIssuesList__ToString(pinterest_rest_api_itemsIssuesList_item_validation_issue_e ){
    char *Array[] =  { "NULL", "AD_IMAGE_0_LINK_LENGTH_TOO_LONG", "AD_IMAGE_1_LINK_LENGTH_TOO_LONG", "AD_IMAGE_2_LINK_LENGTH_TOO_LONG", "AD_IMAGE_3_LINK_LENGTH_TOO_LONG", "AD_IMAGE_4_LINK_LENGTH_TOO_LONG", "AD_IMAGE_5_LINK_LENGTH_TOO_LONG", "AD_IMAGE_6_LINK_LENGTH_TOO_LONG", "AD_IMAGE_7_LINK_LENGTH_TOO_LONG", "AD_IMAGE_8_LINK_LENGTH_TOO_LONG", "AD_IMAGE_9_LINK_LENGTH_TOO_LONG", "AD_IMAGE_10_LINK_LENGTH_TOO_LONG", "AD_IMAGE_11_LINK_LENGTH_TOO_LONG", "AD_IMAGE_12_LINK_LENGTH_TOO_LONG", "AD_IMAGE_13_LINK_LENGTH_TOO_LONG", "AD_IMAGE_14_LINK_LENGTH_TOO_LONG", "AD_IMAGE_15_LINK_LENGTH_TOO_LONG", "AD_IMAGE_16_LINK_LENGTH_TOO_LONG", "AD_IMAGE_17_LINK_LENGTH_TOO_LONG", "AD_IMAGE_18_LINK_LENGTH_TOO_LONG", "AD_IMAGE_19_LINK_LENGTH_TOO_LONG", "AD_IMAGE_0_LINK_WARNING", "AD_IMAGE_1_LINK_WARNING", "AD_IMAGE_2_LINK_WARNING", "AD_IMAGE_3_LINK_WARNING", "AD_IMAGE_4_LINK_WARNING", "AD_IMAGE_5_LINK_WARNING", "AD_IMAGE_6_LINK_WARNING", "AD_IMAGE_7_LINK_WARNING", "AD_IMAGE_8_LINK_WARNING", "AD_IMAGE_9_LINK_WARNING", "AD_IMAGE_10_LINK_WARNING", "AD_IMAGE_11_LINK_WARNING", "AD_IMAGE_12_LINK_WARNING", "AD_IMAGE_13_LINK_WARNING", "AD_IMAGE_14_LINK_WARNING", "AD_IMAGE_15_LINK_WARNING", "AD_IMAGE_16_LINK_WARNING", "AD_IMAGE_17_LINK_WARNING", "AD_IMAGE_18_LINK_WARNING", "AD_IMAGE_19_LINK_WARNING", "AD_IMAGE_0_LINK_REQUIRED", "AD_IMAGE_1_LINK_REQUIRED", "AD_IMAGE_2_LINK_REQUIRED", "AD_IMAGE_3_LINK_REQUIRED", "AD_IMAGE_4_LINK_REQUIRED", "AD_IMAGE_5_LINK_REQUIRED", "AD_IMAGE_6_LINK_REQUIRED", "AD_IMAGE_7_LINK_REQUIRED", "AD_IMAGE_8_LINK_REQUIRED", "AD_IMAGE_9_LINK_REQUIRED", "AD_IMAGE_10_LINK_REQUIRED", "AD_IMAGE_11_LINK_REQUIRED", "AD_IMAGE_12_LINK_REQUIRED", "AD_IMAGE_13_LINK_REQUIRED", "AD_IMAGE_14_LINK_REQUIRED", "AD_IMAGE_15_LINK_REQUIRED", "AD_IMAGE_16_LINK_REQUIRED", "AD_IMAGE_17_LINK_REQUIRED", "AD_IMAGE_18_LINK_REQUIRED", "AD_IMAGE_19_LINK_REQUIRED", "AD_IMAGE_0_TAG_LENGTH_TOO_LONG", "AD_IMAGE_1_TAG_LENGTH_TOO_LONG", "AD_IMAGE_2_TAG_LENGTH_TOO_LONG", "AD_IMAGE_3_TAG_LENGTH_TOO_LONG", "AD_IMAGE_4_TAG_LENGTH_TOO_LONG", "AD_IMAGE_5_TAG_LENGTH_TOO_LONG", "AD_IMAGE_6_TAG_LENGTH_TOO_LONG", "AD_IMAGE_7_TAG_LENGTH_TOO_LONG", "AD_IMAGE_8_TAG_LENGTH_TOO_LONG", "AD_IMAGE_9_TAG_LENGTH_TOO_LONG", "AD_IMAGE_10_TAG_LENGTH_TOO_LONG", "AD_IMAGE_11_TAG_LENGTH_TOO_LONG", "AD_IMAGE_12_TAG_LENGTH_TOO_LONG", "AD_IMAGE_13_TAG_LENGTH_TOO_LONG", "AD_IMAGE_14_TAG_LENGTH_TOO_LONG", "AD_IMAGE_15_TAG_LENGTH_TOO_LONG", "AD_IMAGE_16_TAG_LENGTH_TOO_LONG", "AD_IMAGE_17_TAG_LENGTH_TOO_LONG", "AD_IMAGE_18_TAG_LENGTH_TOO_LONG", "AD_IMAGE_19_TAG_LENGTH_TOO_LONG", "AD_IMAGE_0_TAG_REQUIRED", "AD_IMAGE_1_TAG_REQUIRED", "AD_IMAGE_2_TAG_REQUIRED", "AD_IMAGE_3_TAG_REQUIRED", "AD_IMAGE_4_TAG_REQUIRED", "AD_IMAGE_5_TAG_REQUIRED", "AD_IMAGE_6_TAG_REQUIRED", "AD_IMAGE_7_TAG_REQUIRED", "AD_IMAGE_8_TAG_REQUIRED", "AD_IMAGE_9_TAG_REQUIRED", "AD_IMAGE_10_TAG_REQUIRED", "AD_IMAGE_11_TAG_REQUIRED", "AD_IMAGE_12_TAG_REQUIRED", "AD_IMAGE_13_TAG_REQUIRED", "AD_IMAGE_14_TAG_REQUIRED", "AD_IMAGE_15_TAG_REQUIRED", "AD_IMAGE_16_TAG_REQUIRED", "AD_IMAGE_17_TAG_REQUIRED", "AD_IMAGE_18_TAG_REQUIRED", "AD_IMAGE_19_TAG_REQUIRED", "AD_IMAGE_0_LINK_DUPLICATED", "AD_IMAGE_1_LINK_DUPLICATED", "AD_IMAGE_2_LINK_DUPLICATED", "AD_IMAGE_3_LINK_DUPLICATED", "AD_IMAGE_4_LINK_DUPLICATED", "AD_IMAGE_5_LINK_DUPLICATED", "AD_IMAGE_6_LINK_DUPLICATED", "AD_IMAGE_7_LINK_DUPLICATED", "AD_IMAGE_8_LINK_DUPLICATED", "AD_IMAGE_9_LINK_DUPLICATED", "AD_IMAGE_10_LINK_DUPLICATED", "AD_IMAGE_11_LINK_DUPLICATED", "AD_IMAGE_12_LINK_DUPLICATED", "AD_IMAGE_13_LINK_DUPLICATED", "AD_IMAGE_14_LINK_DUPLICATED", "AD_IMAGE_15_LINK_DUPLICATED", "AD_IMAGE_16_LINK_DUPLICATED", "AD_IMAGE_17_LINK_DUPLICATED", "AD_IMAGE_18_LINK_DUPLICATED", "AD_IMAGE_19_LINK_DUPLICATED", "AD_IMAGE_0_TAG_DUPLICATED", "AD_IMAGE_1_TAG_DUPLICATED", "AD_IMAGE_2_TAG_DUPLICATED", "AD_IMAGE_3_TAG_DUPLICATED", "AD_IMAGE_4_TAG_DUPLICATED", "AD_IMAGE_5_TAG_DUPLICATED", "AD_IMAGE_6_TAG_DUPLICATED", "AD_IMAGE_7_TAG_DUPLICATED", "AD_IMAGE_8_TAG_DUPLICATED", "AD_IMAGE_9_TAG_DUPLICATED", "AD_IMAGE_10_TAG_DUPLICATED", "AD_IMAGE_11_TAG_DUPLICATED", "AD_IMAGE_12_TAG_DUPLICATED", "AD_IMAGE_13_TAG_DUPLICATED", "AD_IMAGE_14_TAG_DUPLICATED", "AD_IMAGE_15_TAG_DUPLICATED", "AD_IMAGE_16_TAG_DUPLICATED", "AD_IMAGE_17_TAG_DUPLICATED", "AD_IMAGE_18_TAG_DUPLICATED", "AD_IMAGE_19_TAG_DUPLICATED", "AD_VIDEO_0_LINK_LENGTH_TOO_LONG", "AD_VIDEO_1_LINK_LENGTH_TOO_LONG", "AD_VIDEO_2_LINK_LENGTH_TOO_LONG", "AD_VIDEO_0_LINK_WARNING", "AD_VIDEO_1_LINK_WARNING", "AD_VIDEO_2_LINK_WARNING", "AD_VIDEO_0_LINK_REQUIRED", "AD_VIDEO_1_LINK_REQUIRED", "AD_VIDEO_2_LINK_REQUIRED", "AD_VIDEO_0_LINK_DUPLICATED", "AD_VIDEO_1_LINK_DUPLICATED", "AD_VIDEO_2_LINK_DUPLICATED", "AD_VIDEO_0_TAG_LENGTH_TOO_LONG", "AD_VIDEO_1_TAG_LENGTH_TOO_LONG", "AD_VIDEO_2_TAG_LENGTH_TOO_LONG", "AD_VIDEO_0_TAG_REQUIRED", "AD_VIDEO_1_TAG_REQUIRED", "AD_VIDEO_2_TAG_REQUIRED", "AD_VIDEO_0_TAG_DUPLICATED", "AD_VIDEO_1_TAG_DUPLICATED", "AD_VIDEO_2_TAG_DUPLICATED", "VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED", "AD_LINK_FORMAT_WARNING", "AD_LINK_SAME_AS_LINK", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", "ADDITIONAL_IMAGE_LINK_WARNING", "ADULT_INVALID", "ADWORDS_FORMAT_INVALID", "ADWORDS_FORMAT_WARNING", "ADWORDS_SAME_AS_LINK", "AGE_GROUP_INVALID", "ANDROID_DEEP_LINK_INVALID", "AVAILABILITY_DATE_INVALID", "AVAILABILITY_INVALID", "BLOCKLISTED_IMAGE_SIGNATURE", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", "CUSTOM_LABEL_LENGTH_TOO_LONG", "DESCRIPTION_LENGTH_TOO_LONG", "DESCRIPTION_MISSING", "DUPLICATE_PRODUCTS", "EXPIRATION_DATE_INVALID", "GENDER_INVALID", "GTIN_INVALID", "IMAGE_LINK_INVALID", "IMAGE_LINK_LENGTH_TOO_LONG", "IMAGE_LINK_MISSING", "IMAGE_LINK_WARNING", "INVALID_DOMAIN", "IOS_DEEP_LINK_INVALID", "IS_BUNDLE_INVALID", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", "ITEMID_MISSING", "LINK_FORMAT_INVALID", "LINK_FORMAT_WARNING", "LINK_LENGTH_TOO_LONG", "LIST_PRICE_INVALID", "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", "MIN_AD_PRICE_INVALID", "MPN_INVALID", "MULTIPACK_INVALID", "OPTIONAL_CONDITION_INVALID", "OPTIONAL_CONDITION_MISSING", "OPTIONAL_PRODUCT_CATEGORY_INVALID", "OPTIONAL_PRODUCT_CATEGORY_MISSING", "PARSE_LINE_ERROR", "PINJOIN_CONTENT_UNSAFE", "PRICE_CANNOT_BE_DETERMINED", "PRICE_MISSING", "PRODUCT_CATEGORY_DEPTH_WARNING", "PRODUCT_LINK_MISSING", "PRODUCT_PRICE_INVALID", "PRODUCT_TYPE_LENGTH_TOO_LONG", "SALE_DATE_INVALID", "SALES_PRICE_INVALID", "SALES_PRICE_TOO_HIGH", "SALES_PRICE_TOO_LOW", "SHIPPING_INVALID", "SHIPPING_HEIGHT_INVALID", "SHIPPING_WEIGHT_INVALID", "SHIPPING_WIDTH_INVALID", "SIZE_SYSTEM_INVALID", "SIZE_TYPE_INVALID", "TAX_INVALID", "TITLE_LENGTH_TOO_LONG", "TITLE_MISSING", "TOO_MANY_ADDITIONAL_IMAGE_LINKS", "UTM_SOURCE_AUTO_CORRECTED", "WEIGHT_UNIT_INVALID" };
    return Array[];
}

static pinterest_rest_api_itemsIssuesList_item_validation_issue_e itemsIssuesList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "AD_IMAGE_0_LINK_LENGTH_TOO_LONG", "AD_IMAGE_1_LINK_LENGTH_TOO_LONG", "AD_IMAGE_2_LINK_LENGTH_TOO_LONG", "AD_IMAGE_3_LINK_LENGTH_TOO_LONG", "AD_IMAGE_4_LINK_LENGTH_TOO_LONG", "AD_IMAGE_5_LINK_LENGTH_TOO_LONG", "AD_IMAGE_6_LINK_LENGTH_TOO_LONG", "AD_IMAGE_7_LINK_LENGTH_TOO_LONG", "AD_IMAGE_8_LINK_LENGTH_TOO_LONG", "AD_IMAGE_9_LINK_LENGTH_TOO_LONG", "AD_IMAGE_10_LINK_LENGTH_TOO_LONG", "AD_IMAGE_11_LINK_LENGTH_TOO_LONG", "AD_IMAGE_12_LINK_LENGTH_TOO_LONG", "AD_IMAGE_13_LINK_LENGTH_TOO_LONG", "AD_IMAGE_14_LINK_LENGTH_TOO_LONG", "AD_IMAGE_15_LINK_LENGTH_TOO_LONG", "AD_IMAGE_16_LINK_LENGTH_TOO_LONG", "AD_IMAGE_17_LINK_LENGTH_TOO_LONG", "AD_IMAGE_18_LINK_LENGTH_TOO_LONG", "AD_IMAGE_19_LINK_LENGTH_TOO_LONG", "AD_IMAGE_0_LINK_WARNING", "AD_IMAGE_1_LINK_WARNING", "AD_IMAGE_2_LINK_WARNING", "AD_IMAGE_3_LINK_WARNING", "AD_IMAGE_4_LINK_WARNING", "AD_IMAGE_5_LINK_WARNING", "AD_IMAGE_6_LINK_WARNING", "AD_IMAGE_7_LINK_WARNING", "AD_IMAGE_8_LINK_WARNING", "AD_IMAGE_9_LINK_WARNING", "AD_IMAGE_10_LINK_WARNING", "AD_IMAGE_11_LINK_WARNING", "AD_IMAGE_12_LINK_WARNING", "AD_IMAGE_13_LINK_WARNING", "AD_IMAGE_14_LINK_WARNING", "AD_IMAGE_15_LINK_WARNING", "AD_IMAGE_16_LINK_WARNING", "AD_IMAGE_17_LINK_WARNING", "AD_IMAGE_18_LINK_WARNING", "AD_IMAGE_19_LINK_WARNING", "AD_IMAGE_0_LINK_REQUIRED", "AD_IMAGE_1_LINK_REQUIRED", "AD_IMAGE_2_LINK_REQUIRED", "AD_IMAGE_3_LINK_REQUIRED", "AD_IMAGE_4_LINK_REQUIRED", "AD_IMAGE_5_LINK_REQUIRED", "AD_IMAGE_6_LINK_REQUIRED", "AD_IMAGE_7_LINK_REQUIRED", "AD_IMAGE_8_LINK_REQUIRED", "AD_IMAGE_9_LINK_REQUIRED", "AD_IMAGE_10_LINK_REQUIRED", "AD_IMAGE_11_LINK_REQUIRED", "AD_IMAGE_12_LINK_REQUIRED", "AD_IMAGE_13_LINK_REQUIRED", "AD_IMAGE_14_LINK_REQUIRED", "AD_IMAGE_15_LINK_REQUIRED", "AD_IMAGE_16_LINK_REQUIRED", "AD_IMAGE_17_LINK_REQUIRED", "AD_IMAGE_18_LINK_REQUIRED", "AD_IMAGE_19_LINK_REQUIRED", "AD_IMAGE_0_TAG_LENGTH_TOO_LONG", "AD_IMAGE_1_TAG_LENGTH_TOO_LONG", "AD_IMAGE_2_TAG_LENGTH_TOO_LONG", "AD_IMAGE_3_TAG_LENGTH_TOO_LONG", "AD_IMAGE_4_TAG_LENGTH_TOO_LONG", "AD_IMAGE_5_TAG_LENGTH_TOO_LONG", "AD_IMAGE_6_TAG_LENGTH_TOO_LONG", "AD_IMAGE_7_TAG_LENGTH_TOO_LONG", "AD_IMAGE_8_TAG_LENGTH_TOO_LONG", "AD_IMAGE_9_TAG_LENGTH_TOO_LONG", "AD_IMAGE_10_TAG_LENGTH_TOO_LONG", "AD_IMAGE_11_TAG_LENGTH_TOO_LONG", "AD_IMAGE_12_TAG_LENGTH_TOO_LONG", "AD_IMAGE_13_TAG_LENGTH_TOO_LONG", "AD_IMAGE_14_TAG_LENGTH_TOO_LONG", "AD_IMAGE_15_TAG_LENGTH_TOO_LONG", "AD_IMAGE_16_TAG_LENGTH_TOO_LONG", "AD_IMAGE_17_TAG_LENGTH_TOO_LONG", "AD_IMAGE_18_TAG_LENGTH_TOO_LONG", "AD_IMAGE_19_TAG_LENGTH_TOO_LONG", "AD_IMAGE_0_TAG_REQUIRED", "AD_IMAGE_1_TAG_REQUIRED", "AD_IMAGE_2_TAG_REQUIRED", "AD_IMAGE_3_TAG_REQUIRED", "AD_IMAGE_4_TAG_REQUIRED", "AD_IMAGE_5_TAG_REQUIRED", "AD_IMAGE_6_TAG_REQUIRED", "AD_IMAGE_7_TAG_REQUIRED", "AD_IMAGE_8_TAG_REQUIRED", "AD_IMAGE_9_TAG_REQUIRED", "AD_IMAGE_10_TAG_REQUIRED", "AD_IMAGE_11_TAG_REQUIRED", "AD_IMAGE_12_TAG_REQUIRED", "AD_IMAGE_13_TAG_REQUIRED", "AD_IMAGE_14_TAG_REQUIRED", "AD_IMAGE_15_TAG_REQUIRED", "AD_IMAGE_16_TAG_REQUIRED", "AD_IMAGE_17_TAG_REQUIRED", "AD_IMAGE_18_TAG_REQUIRED", "AD_IMAGE_19_TAG_REQUIRED", "AD_IMAGE_0_LINK_DUPLICATED", "AD_IMAGE_1_LINK_DUPLICATED", "AD_IMAGE_2_LINK_DUPLICATED", "AD_IMAGE_3_LINK_DUPLICATED", "AD_IMAGE_4_LINK_DUPLICATED", "AD_IMAGE_5_LINK_DUPLICATED", "AD_IMAGE_6_LINK_DUPLICATED", "AD_IMAGE_7_LINK_DUPLICATED", "AD_IMAGE_8_LINK_DUPLICATED", "AD_IMAGE_9_LINK_DUPLICATED", "AD_IMAGE_10_LINK_DUPLICATED", "AD_IMAGE_11_LINK_DUPLICATED", "AD_IMAGE_12_LINK_DUPLICATED", "AD_IMAGE_13_LINK_DUPLICATED", "AD_IMAGE_14_LINK_DUPLICATED", "AD_IMAGE_15_LINK_DUPLICATED", "AD_IMAGE_16_LINK_DUPLICATED", "AD_IMAGE_17_LINK_DUPLICATED", "AD_IMAGE_18_LINK_DUPLICATED", "AD_IMAGE_19_LINK_DUPLICATED", "AD_IMAGE_0_TAG_DUPLICATED", "AD_IMAGE_1_TAG_DUPLICATED", "AD_IMAGE_2_TAG_DUPLICATED", "AD_IMAGE_3_TAG_DUPLICATED", "AD_IMAGE_4_TAG_DUPLICATED", "AD_IMAGE_5_TAG_DUPLICATED", "AD_IMAGE_6_TAG_DUPLICATED", "AD_IMAGE_7_TAG_DUPLICATED", "AD_IMAGE_8_TAG_DUPLICATED", "AD_IMAGE_9_TAG_DUPLICATED", "AD_IMAGE_10_TAG_DUPLICATED", "AD_IMAGE_11_TAG_DUPLICATED", "AD_IMAGE_12_TAG_DUPLICATED", "AD_IMAGE_13_TAG_DUPLICATED", "AD_IMAGE_14_TAG_DUPLICATED", "AD_IMAGE_15_TAG_DUPLICATED", "AD_IMAGE_16_TAG_DUPLICATED", "AD_IMAGE_17_TAG_DUPLICATED", "AD_IMAGE_18_TAG_DUPLICATED", "AD_IMAGE_19_TAG_DUPLICATED", "AD_VIDEO_0_LINK_LENGTH_TOO_LONG", "AD_VIDEO_1_LINK_LENGTH_TOO_LONG", "AD_VIDEO_2_LINK_LENGTH_TOO_LONG", "AD_VIDEO_0_LINK_WARNING", "AD_VIDEO_1_LINK_WARNING", "AD_VIDEO_2_LINK_WARNING", "AD_VIDEO_0_LINK_REQUIRED", "AD_VIDEO_1_LINK_REQUIRED", "AD_VIDEO_2_LINK_REQUIRED", "AD_VIDEO_0_LINK_DUPLICATED", "AD_VIDEO_1_LINK_DUPLICATED", "AD_VIDEO_2_LINK_DUPLICATED", "AD_VIDEO_0_TAG_LENGTH_TOO_LONG", "AD_VIDEO_1_TAG_LENGTH_TOO_LONG", "AD_VIDEO_2_TAG_LENGTH_TOO_LONG", "AD_VIDEO_0_TAG_REQUIRED", "AD_VIDEO_1_TAG_REQUIRED", "AD_VIDEO_2_TAG_REQUIRED", "AD_VIDEO_0_TAG_DUPLICATED", "AD_VIDEO_1_TAG_DUPLICATED", "AD_VIDEO_2_TAG_DUPLICATED", "VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED", "AD_LINK_FORMAT_WARNING", "AD_LINK_SAME_AS_LINK", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", "ADDITIONAL_IMAGE_LINK_WARNING", "ADULT_INVALID", "ADWORDS_FORMAT_INVALID", "ADWORDS_FORMAT_WARNING", "ADWORDS_SAME_AS_LINK", "AGE_GROUP_INVALID", "ANDROID_DEEP_LINK_INVALID", "AVAILABILITY_DATE_INVALID", "AVAILABILITY_INVALID", "BLOCKLISTED_IMAGE_SIGNATURE", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", "CUSTOM_LABEL_LENGTH_TOO_LONG", "DESCRIPTION_LENGTH_TOO_LONG", "DESCRIPTION_MISSING", "DUPLICATE_PRODUCTS", "EXPIRATION_DATE_INVALID", "GENDER_INVALID", "GTIN_INVALID", "IMAGE_LINK_INVALID", "IMAGE_LINK_LENGTH_TOO_LONG", "IMAGE_LINK_MISSING", "IMAGE_LINK_WARNING", "INVALID_DOMAIN", "IOS_DEEP_LINK_INVALID", "IS_BUNDLE_INVALID", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", "ITEMID_MISSING", "LINK_FORMAT_INVALID", "LINK_FORMAT_WARNING", "LINK_LENGTH_TOO_LONG", "LIST_PRICE_INVALID", "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", "MIN_AD_PRICE_INVALID", "MPN_INVALID", "MULTIPACK_INVALID", "OPTIONAL_CONDITION_INVALID", "OPTIONAL_CONDITION_MISSING", "OPTIONAL_PRODUCT_CATEGORY_INVALID", "OPTIONAL_PRODUCT_CATEGORY_MISSING", "PARSE_LINE_ERROR", "PINJOIN_CONTENT_UNSAFE", "PRICE_CANNOT_BE_DETERMINED", "PRICE_MISSING", "PRODUCT_CATEGORY_DEPTH_WARNING", "PRODUCT_LINK_MISSING", "PRODUCT_PRICE_INVALID", "PRODUCT_TYPE_LENGTH_TOO_LONG", "SALE_DATE_INVALID", "SALES_PRICE_INVALID", "SALES_PRICE_TOO_HIGH", "SALES_PRICE_TOO_LOW", "SHIPPING_INVALID", "SHIPPING_HEIGHT_INVALID", "SHIPPING_WEIGHT_INVALID", "SHIPPING_WIDTH_INVALID", "SIZE_SYSTEM_INVALID", "SIZE_TYPE_INVALID", "TAX_INVALID", "TITLE_LENGTH_TOO_LONG", "TITLE_MISSING", "TOO_MANY_ADDITIONAL_IMAGE_LINKS", "UTM_SOURCE_AUTO_CORRECTED", "WEIGHT_UNIT_INVALID" };
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
// Function itemsIssuesList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *itemsIssuesList__convertToJSON(pinterest_rest_api_itemsIssuesList_item_validation_issue_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function itemsIssuesList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_itemsIssuesList_item_validation_issue_e itemsIssuesList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_itemsIssuesList_item_validation_issue_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// List feed processing results
//
// Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
feed_processing_results_list_200_response_t*
CatalogFeedsAPI_feedProcessingResultsList(apiClient_t *apiClient, char *feed_id, char *ad_account_id, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/catalogs/feeds/{feed_id}/processing_results");

    if(!feed_id)
        goto end;


    // Path Params
    long sizeOfPathParams_feed_id = strlen(feed_id)+3 + sizeof("{ feed_id }") - 1;
    if(feed_id == NULL) {
        goto end;
    }
    char* localVarToReplace_feed_id = malloc(sizeOfPathParams_feed_id);
    sprintf(localVarToReplace_feed_id, "{%s}", "feed_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_feed_id, feed_id);



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
    feed_processing_results_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CatalogFeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = feed_processing_results_list_200_response_parseFromJSON(CatalogFeedsAPIlocalVarJSON);
        cJSON_Delete(CatalogFeedsAPIlocalVarJSON);
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
    free(localVarToReplace_feed_id);
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

// Create feed
//
// Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_t*
CatalogFeedsAPI_feedsCreate(apiClient_t *apiClient, catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/catalogs/feeds");





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
    cJSON *localVarSingleItemJSON_catalogs_feed_create_request_schema = NULL;
    if (catalogs_feed_create_request_schema != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_catalogs_feed_create_request_schema = catalogs_feed_create_request_schema_convertToJSON(catalogs_feed_create_request_schema);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_catalogs_feed_create_request_schema);
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
    catalogs_feed_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CatalogFeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = catalogs_feed_parseFromJSON(CatalogFeedsAPIlocalVarJSON);
        cJSON_Delete(CatalogFeedsAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_catalogs_feed_create_request_schema) {
        cJSON_Delete(localVarSingleItemJSON_catalogs_feed_create_request_schema);
        localVarSingleItemJSON_catalogs_feed_create_request_schema = NULL;
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

// Delete feed
//
// Delete a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
//
catalogs_feed_t*
CatalogFeedsAPI_feedsDelete(apiClient_t *apiClient, char *feed_id, char *ad_account_id)
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
    char *localVarPath = strdup("/catalogs/feeds/{feed_id}");

    if(!feed_id)
        goto end;


    // Path Params
    long sizeOfPathParams_feed_id = strlen(feed_id)+3 + sizeof("{ feed_id }") - 1;
    if(feed_id == NULL) {
        goto end;
    }
    char* localVarToReplace_feed_id = malloc(sizeOfPathParams_feed_id);
    sprintf(localVarToReplace_feed_id, "{%s}", "feed_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_feed_id, feed_id);



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
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 204) {
    //    printf("%s\n","Resource deleted successfully.");
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
    catalogs_feed_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CatalogFeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = catalogs_feed_parseFromJSON(CatalogFeedsAPIlocalVarJSON);
        cJSON_Delete(CatalogFeedsAPIlocalVarJSON);
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
    free(localVarToReplace_feed_id);
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

// Get feed
//
// Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
//
catalogs_feed_t*
CatalogFeedsAPI_feedsGet(apiClient_t *apiClient, char *feed_id, char *ad_account_id)
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
    char *localVarPath = strdup("/catalogs/feeds/{feed_id}");

    if(!feed_id)
        goto end;


    // Path Params
    long sizeOfPathParams_feed_id = strlen(feed_id)+3 + sizeof("{ feed_id }") - 1;
    if(feed_id == NULL) {
        goto end;
    }
    char* localVarToReplace_feed_id = malloc(sizeOfPathParams_feed_id);
    sprintf(localVarToReplace_feed_id, "{%s}", "feed_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_feed_id, feed_id);



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
    catalogs_feed_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CatalogFeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = catalogs_feed_parseFromJSON(CatalogFeedsAPIlocalVarJSON);
        cJSON_Delete(CatalogFeedsAPIlocalVarJSON);
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
    free(localVarToReplace_feed_id);
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

// Ingest feed items
//
// Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_ingestion_t*
CatalogFeedsAPI_feedsIngest(apiClient_t *apiClient, char *feed_id, char *ad_account_id)
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
    char *localVarPath = strdup("/catalogs/feeds/{feed_id}/ingest");

    if(!feed_id)
        goto end;


    // Path Params
    long sizeOfPathParams_feed_id = strlen(feed_id)+3 + sizeof("{ feed_id }") - 1;
    if(feed_id == NULL) {
        goto end;
    }
    char* localVarToReplace_feed_id = malloc(sizeOfPathParams_feed_id);
    sprintf(localVarToReplace_feed_id, "{%s}", "feed_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_feed_id, feed_id);



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
    catalogs_feed_ingestion_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CatalogFeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = catalogs_feed_ingestion_parseFromJSON(CatalogFeedsAPIlocalVarJSON);
        cJSON_Delete(CatalogFeedsAPIlocalVarJSON);
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
    free(localVarToReplace_feed_id);
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

// List feeds
//
// Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
//
feeds_list_200_response_t*
CatalogFeedsAPI_feedsList(apiClient_t *apiClient, char *catalog_id, char *ad_account_id, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/catalogs/feeds");





    // query parameters
    char *keyQuery_catalog_id = NULL;
    char * valueQuery_catalog_id = NULL;
    keyValuePair_t *keyPairQuery_catalog_id = 0;
    if (catalog_id)
    {
        keyQuery_catalog_id = strdup("catalog_id");
        valueQuery_catalog_id = strdup((catalog_id));
        keyPairQuery_catalog_id = keyValuePair_create(keyQuery_catalog_id, valueQuery_catalog_id);
        list_addElement(localVarQueryParameters,keyPairQuery_catalog_id);
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
    feeds_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CatalogFeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = feeds_list_200_response_parseFromJSON(CatalogFeedsAPIlocalVarJSON);
        cJSON_Delete(CatalogFeedsAPIlocalVarJSON);
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
    if(keyQuery_catalog_id){
        free(keyQuery_catalog_id);
        keyQuery_catalog_id = NULL;
    }
    if(valueQuery_catalog_id){
        free(valueQuery_catalog_id);
        valueQuery_catalog_id = NULL;
    }
    if(keyPairQuery_catalog_id){
        keyValuePair_free(keyPairQuery_catalog_id);
        keyPairQuery_catalog_id = NULL;
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

// Update feed
//
// Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_t*
CatalogFeedsAPI_feedsUpdate(apiClient_t *apiClient, char *feed_id, catalogs_feed_update_request_schema_t *catalogs_feed_update_request_schema, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/catalogs/feeds/{feed_id}");

    if(!feed_id)
        goto end;


    // Path Params
    long sizeOfPathParams_feed_id = strlen(feed_id)+3 + sizeof("{ feed_id }") - 1;
    if(feed_id == NULL) {
        goto end;
    }
    char* localVarToReplace_feed_id = malloc(sizeOfPathParams_feed_id);
    sprintf(localVarToReplace_feed_id, "{%s}", "feed_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_feed_id, feed_id);



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
    cJSON *localVarSingleItemJSON_catalogs_feed_update_request_schema = NULL;
    if (catalogs_feed_update_request_schema != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_catalogs_feed_update_request_schema = catalogs_feed_update_request_schema_convertToJSON(catalogs_feed_update_request_schema);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_catalogs_feed_update_request_schema);
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
    catalogs_feed_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CatalogFeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = catalogs_feed_parseFromJSON(CatalogFeedsAPIlocalVarJSON);
        cJSON_Delete(CatalogFeedsAPIlocalVarJSON);
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
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_feed_id);
    if (localVarSingleItemJSON_catalogs_feed_update_request_schema) {
        cJSON_Delete(localVarSingleItemJSON_catalogs_feed_update_request_schema);
        localVarSingleItemJSON_catalogs_feed_update_request_schema = NULL;
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

// List item issues
//
// List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)
//
items_issues_list_200_response_t*
CatalogFeedsAPI_itemsIssuesList(apiClient_t *apiClient, char *processing_result_id, list_t *item_numbers, catalogs_item_validation_issue_e item_validation_issue, char *ad_account_id, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/catalogs/processing_results/{processing_result_id}/item_issues");

    if(!processing_result_id)
        goto end;


    // Path Params
    long sizeOfPathParams_processing_result_id = strlen(processing_result_id)+3 + sizeof("{ processing_result_id }") - 1;
    if(processing_result_id == NULL) {
        goto end;
    }
    char* localVarToReplace_processing_result_id = malloc(sizeOfPathParams_processing_result_id);
    sprintf(localVarToReplace_processing_result_id, "{%s}", "processing_result_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_processing_result_id, processing_result_id);



    // query parameters
    if (item_numbers)
    {
        list_addElement(localVarQueryParameters,item_numbers);
    }

    // query parameters
    char *keyQuery_item_validation_issue = NULL;
    catalogs_item_validation_issue_e valueQuery_item_validation_issue ;
    keyValuePair_t *keyPairQuery_item_validation_issue = 0;
    if (item_validation_issue)
    {
        keyQuery_item_validation_issue = strdup("item_validation_issue");
        valueQuery_item_validation_issue = (item_validation_issue);
        keyPairQuery_item_validation_issue = keyValuePair_create(keyQuery_item_validation_issue, strdup(itemsIssuesList__ToString(
        &valueQuery_item_validation_issue)));
        list_addElement(localVarQueryParameters,keyPairQuery_item_validation_issue);
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
    items_issues_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CatalogFeedsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = items_issues_list_200_response_parseFromJSON(CatalogFeedsAPIlocalVarJSON);
        cJSON_Delete(CatalogFeedsAPIlocalVarJSON);
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
    free(localVarToReplace_processing_result_id);
    if(keyQuery_item_validation_issue){
        free(keyQuery_item_validation_issue);
        keyQuery_item_validation_issue = NULL;
    }
    if(keyPairQuery_item_validation_issue){
        keyValuePair_free(keyPairQuery_item_validation_issue);
        keyPairQuery_item_validation_issue = NULL;
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

