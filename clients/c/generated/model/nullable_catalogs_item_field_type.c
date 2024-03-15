#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nullable_catalogs_item_field_type.h"


char* nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_ToString(pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_type) {
    char *nullable_catalogs_item_field_typeArray[] =  { "NULL", "ITEM_ID", "ITEM_GROUP_ID", "TITLE", "DESCRIPTION", "ITEM_LINK", "ORGANIC_LINK", "IMAGE_LINK", "ADWORDS_REDIRECT_LINK", "AD_LINK", "SIZE", "GOOGLE_PRODUCT_CATEGORY", "PRODUCT_CATEGORY", "CONDITION", "AVAILABILITY", "GENDER", "AGE_GROUP", "SIZE_TYPE", "SIZE_SYSTEM", "ADULT", "SHIPPING", "SHIPPING_WEIGHT", "TAX", "MULTIPACK", "ADDITIONAL_IMAGE_LINK", "PRICE", "SALE_PRICE", "IS_BUNDLE", "EXPIRATION_DATE", "SALE_PRICE_EFFECTIVE_DATE", "AVAILABILITY_DATE", "WEIGHT_UNIT", "PRODUCT_TYPE", "CUSTOM_LABEL_0", "CUSTOM_LABEL_1", "CUSTOM_LABEL_2", "CUSTOM_LABEL_3", "CUSTOM_LABEL_4", "MATERIAL", "PATTERN", "COLOR", "BRAND", "GTIN", "MPN", "IOS_DEEP_LINK", "ANDROID_DEEP_LINK", "FREE_SHIPPING_LABEL", "FREE_SHIPPING_LIMIT", "AVG_REVIEW_RATING", "NUM_RATINGS", "NUM_REVIEWS", "ALT_TEXT", "VARIANT_NAMES", "VARIANT_VALUES", "MIN_AD_PRICE", "SHIPPING_WIDTH", "SHIPPING_HEIGHT", "" };
    return nullable_catalogs_item_field_typeArray[nullable_catalogs_item_field_type];
}

pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_FromString(char* nullable_catalogs_item_field_type) {
    int stringToReturn = 0;
    char *nullable_catalogs_item_field_typeArray[] =  { "NULL", "ITEM_ID", "ITEM_GROUP_ID", "TITLE", "DESCRIPTION", "ITEM_LINK", "ORGANIC_LINK", "IMAGE_LINK", "ADWORDS_REDIRECT_LINK", "AD_LINK", "SIZE", "GOOGLE_PRODUCT_CATEGORY", "PRODUCT_CATEGORY", "CONDITION", "AVAILABILITY", "GENDER", "AGE_GROUP", "SIZE_TYPE", "SIZE_SYSTEM", "ADULT", "SHIPPING", "SHIPPING_WEIGHT", "TAX", "MULTIPACK", "ADDITIONAL_IMAGE_LINK", "PRICE", "SALE_PRICE", "IS_BUNDLE", "EXPIRATION_DATE", "SALE_PRICE_EFFECTIVE_DATE", "AVAILABILITY_DATE", "WEIGHT_UNIT", "PRODUCT_TYPE", "CUSTOM_LABEL_0", "CUSTOM_LABEL_1", "CUSTOM_LABEL_2", "CUSTOM_LABEL_3", "CUSTOM_LABEL_4", "MATERIAL", "PATTERN", "COLOR", "BRAND", "GTIN", "MPN", "IOS_DEEP_LINK", "ANDROID_DEEP_LINK", "FREE_SHIPPING_LABEL", "FREE_SHIPPING_LIMIT", "AVG_REVIEW_RATING", "NUM_RATINGS", "NUM_REVIEWS", "ALT_TEXT", "VARIANT_NAMES", "VARIANT_VALUES", "MIN_AD_PRICE", "SHIPPING_WIDTH", "SHIPPING_HEIGHT", "" };
    size_t sizeofArray = sizeof(nullable_catalogs_item_field_typeArray) / sizeof(nullable_catalogs_item_field_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(nullable_catalogs_item_field_type, nullable_catalogs_item_field_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_convertToJSON(pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "nullable_catalogs_item_field_type", nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_ToString(nullable_catalogs_item_field_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_parseFromJSON(cJSON *nullable_catalogs_item_field_typeJSON) {
    pinterest_rest_api_nullable_catalogs_item_field_type__e *nullable_catalogs_item_field_type = NULL;
    pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_typeVariable;
    cJSON *nullable_catalogs_item_field_typeVar = cJSON_GetObjectItemCaseSensitive(nullable_catalogs_item_field_typeJSON, "nullable_catalogs_item_field_type");
    if(!cJSON_IsString(nullable_catalogs_item_field_typeVar) || (nullable_catalogs_item_field_typeVar->valuestring == NULL)){
        goto end;
    }
    nullable_catalogs_item_field_typeVariable = nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_FromString(nullable_catalogs_item_field_typeVar->valuestring);
    return nullable_catalogs_item_field_typeVariable;
end:
    return 0;
}
