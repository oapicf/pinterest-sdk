#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_item_validation_issue.h"


char* catalogs_item_validation_issue_catalogs_item_validation_issue_ToString(pinterest_rest_api_catalogs_item_validation_issue__e catalogs_item_validation_issue) {
    char *catalogs_item_validation_issueArray[] =  { "NULL", "AD_LINK_FORMAT_WARNING", "AD_LINK_SAME_AS_LINK", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", "ADDITIONAL_IMAGE_LINK_WARNING", "ADULT_INVALID", "ADWORDS_FORMAT_INVALID", "ADWORDS_FORMAT_WARNING", "ADWORDS_SAME_AS_LINK", "AGE_GROUP_INVALID", "ANDROID_DEEP_LINK_INVALID", "AVAILABILITY_DATE_INVALID", "AVAILABILITY_INVALID", "BLOCKLISTED_IMAGE_SIGNATURE", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", "CUSTOM_LABEL_LENGTH_TOO_LONG", "DESCRIPTION_LENGTH_TOO_LONG", "DESCRIPTION_MISSING", "DUPLICATE_PRODUCTS", "EXPIRATION_DATE_INVALID", "GENDER_INVALID", "GTIN_INVALID", "IMAGE_LINK_INVALID", "IMAGE_LINK_LENGTH_TOO_LONG", "IMAGE_LINK_MISSING", "IMAGE_LINK_WARNING", "INVALID_DOMAIN", "IOS_DEEP_LINK_INVALID", "IS_BUNDLE_INVALID", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", "ITEMID_MISSING", "LINK_FORMAT_INVALID", "LINK_FORMAT_WARNING", "LINK_LENGTH_TOO_LONG", "LIST_PRICE_INVALID", "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", "MIN_AD_PRICE_INVALID", "MPN_INVALID", "MULTIPACK_INVALID", "OPTIONAL_CONDITION_INVALID", "OPTIONAL_CONDITION_MISSING", "OPTIONAL_PRODUCT_CATEGORY_INVALID", "OPTIONAL_PRODUCT_CATEGORY_MISSING", "PARSE_LINE_ERROR", "PINJOIN_CONTENT_UNSAFE", "PRICE_CANNOT_BE_DETERMINED", "PRICE_MISSING", "PRODUCT_CATEGORY_DEPTH_WARNING", "PRODUCT_LINK_MISSING", "PRODUCT_PRICE_INVALID", "PRODUCT_TYPE_LENGTH_TOO_LONG", "SALE_DATE_INVALID", "SALES_PRICE_INVALID", "SALES_PRICE_TOO_HIGH", "SALES_PRICE_TOO_LOW", "SHIPPING_INVALID", "SHIPPING_HEIGHT_INVALID", "SHIPPING_WEIGHT_INVALID", "SHIPPING_WIDTH_INVALID", "SIZE_SYSTEM_INVALID", "SIZE_TYPE_INVALID", "TAX_INVALID", "TITLE_LENGTH_TOO_LONG", "TITLE_MISSING", "TOO_MANY_ADDITIONAL_IMAGE_LINKS", "UTM_SOURCE_AUTO_CORRECTED", "WEIGHT_UNIT_INVALID" };
    return catalogs_item_validation_issueArray[catalogs_item_validation_issue];
}

pinterest_rest_api_catalogs_item_validation_issue__e catalogs_item_validation_issue_catalogs_item_validation_issue_FromString(char* catalogs_item_validation_issue) {
    int stringToReturn = 0;
    char *catalogs_item_validation_issueArray[] =  { "NULL", "AD_LINK_FORMAT_WARNING", "AD_LINK_SAME_AS_LINK", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", "ADDITIONAL_IMAGE_LINK_WARNING", "ADULT_INVALID", "ADWORDS_FORMAT_INVALID", "ADWORDS_FORMAT_WARNING", "ADWORDS_SAME_AS_LINK", "AGE_GROUP_INVALID", "ANDROID_DEEP_LINK_INVALID", "AVAILABILITY_DATE_INVALID", "AVAILABILITY_INVALID", "BLOCKLISTED_IMAGE_SIGNATURE", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", "CUSTOM_LABEL_LENGTH_TOO_LONG", "DESCRIPTION_LENGTH_TOO_LONG", "DESCRIPTION_MISSING", "DUPLICATE_PRODUCTS", "EXPIRATION_DATE_INVALID", "GENDER_INVALID", "GTIN_INVALID", "IMAGE_LINK_INVALID", "IMAGE_LINK_LENGTH_TOO_LONG", "IMAGE_LINK_MISSING", "IMAGE_LINK_WARNING", "INVALID_DOMAIN", "IOS_DEEP_LINK_INVALID", "IS_BUNDLE_INVALID", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", "ITEMID_MISSING", "LINK_FORMAT_INVALID", "LINK_FORMAT_WARNING", "LINK_LENGTH_TOO_LONG", "LIST_PRICE_INVALID", "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", "MIN_AD_PRICE_INVALID", "MPN_INVALID", "MULTIPACK_INVALID", "OPTIONAL_CONDITION_INVALID", "OPTIONAL_CONDITION_MISSING", "OPTIONAL_PRODUCT_CATEGORY_INVALID", "OPTIONAL_PRODUCT_CATEGORY_MISSING", "PARSE_LINE_ERROR", "PINJOIN_CONTENT_UNSAFE", "PRICE_CANNOT_BE_DETERMINED", "PRICE_MISSING", "PRODUCT_CATEGORY_DEPTH_WARNING", "PRODUCT_LINK_MISSING", "PRODUCT_PRICE_INVALID", "PRODUCT_TYPE_LENGTH_TOO_LONG", "SALE_DATE_INVALID", "SALES_PRICE_INVALID", "SALES_PRICE_TOO_HIGH", "SALES_PRICE_TOO_LOW", "SHIPPING_INVALID", "SHIPPING_HEIGHT_INVALID", "SHIPPING_WEIGHT_INVALID", "SHIPPING_WIDTH_INVALID", "SIZE_SYSTEM_INVALID", "SIZE_TYPE_INVALID", "TAX_INVALID", "TITLE_LENGTH_TOO_LONG", "TITLE_MISSING", "TOO_MANY_ADDITIONAL_IMAGE_LINKS", "UTM_SOURCE_AUTO_CORRECTED", "WEIGHT_UNIT_INVALID" };
    size_t sizeofArray = sizeof(catalogs_item_validation_issueArray) / sizeof(catalogs_item_validation_issueArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_item_validation_issue, catalogs_item_validation_issueArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_item_validation_issue_catalogs_item_validation_issue_convertToJSON(pinterest_rest_api_catalogs_item_validation_issue__e catalogs_item_validation_issue) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_item_validation_issue", catalogs_item_validation_issue_catalogs_item_validation_issue_ToString(catalogs_item_validation_issue)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_item_validation_issue__e catalogs_item_validation_issue_catalogs_item_validation_issue_parseFromJSON(cJSON *catalogs_item_validation_issueJSON) {
    pinterest_rest_api_catalogs_item_validation_issue__e *catalogs_item_validation_issue = NULL;
    pinterest_rest_api_catalogs_item_validation_issue__e catalogs_item_validation_issueVariable;
    cJSON *catalogs_item_validation_issueVar = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issueJSON, "catalogs_item_validation_issue");
    if(!cJSON_IsString(catalogs_item_validation_issueVar) || (catalogs_item_validation_issueVar->valuestring == NULL)){
        goto end;
    }
    catalogs_item_validation_issueVariable = catalogs_item_validation_issue_catalogs_item_validation_issue_FromString(catalogs_item_validation_issueVar->valuestring);
    return catalogs_item_validation_issueVariable;
end:
    return 0;
}
