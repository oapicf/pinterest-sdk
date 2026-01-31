#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nullable_catalogs_item_field_type.h"


char* nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_ToString(pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_type) {
    char *nullable_catalogs_item_field_typeArray[] =  { "NULL", "ITEM_ID", "ITEM_GROUP_ID", "TITLE", "DESCRIPTION", "ITEM_LINK", "ORGANIC_LINK", "IMAGE_LINK", "ADWORDS_REDIRECT_LINK", "AD_LINK", "SIZE", "GOOGLE_PRODUCT_CATEGORY", "PRODUCT_CATEGORY", "CONDITION", "AVAILABILITY", "GENDER", "AGE_GROUP", "SIZE_TYPE", "SIZE_SYSTEM", "ADULT", "SHIPPING", "SHIPPING_WEIGHT", "TAX", "MULTIPACK", "ADDITIONAL_IMAGE_LINK", "PRICE", "SALE_PRICE", "IS_BUNDLE", "EXPIRATION_DATE", "AVAILABILITY_DATE", "WEIGHT_UNIT", "PRODUCT_TYPE", "CUSTOM_LABEL_0", "CUSTOM_LABEL_1", "CUSTOM_LABEL_2", "CUSTOM_LABEL_3", "CUSTOM_LABEL_4", "MATERIAL", "PATTERN", "COLOR", "BRAND", "GTIN", "MPN", "IOS_DEEP_LINK", "ANDROID_DEEP_LINK", "FREE_SHIPPING_LABEL", "FREE_SHIPPING_LIMIT", "AVG_REVIEW_RATING", "NUM_RATINGS", "NUM_REVIEWS", "ALT_TEXT", "VARIANT_NAMES", "VARIANT_VALUES", "MIN_AD_PRICE", "SHIPPING_WIDTH", "SHIPPING_HEIGHT", "AD_IMAGE_0_LINK", "AD_IMAGE_1_LINK", "AD_IMAGE_2_LINK", "AD_IMAGE_3_LINK", "AD_IMAGE_4_LINK", "AD_IMAGE_5_LINK", "AD_IMAGE_6_LINK", "AD_IMAGE_7_LINK", "AD_IMAGE_8_LINK", "AD_IMAGE_9_LINK", "AD_IMAGE_10_LINK", "AD_IMAGE_11_LINK", "AD_IMAGE_12_LINK", "AD_IMAGE_13_LINK", "AD_IMAGE_14_LINK", "AD_IMAGE_15_LINK", "AD_IMAGE_16_LINK", "AD_IMAGE_17_LINK", "AD_IMAGE_18_LINK", "AD_IMAGE_19_LINK", "AD_IMAGE_0_TAG", "AD_IMAGE_1_TAG", "AD_IMAGE_2_TAG", "AD_IMAGE_3_TAG", "AD_IMAGE_4_TAG", "AD_IMAGE_5_TAG", "AD_IMAGE_6_TAG", "AD_IMAGE_7_TAG", "AD_IMAGE_8_TAG", "AD_IMAGE_9_TAG", "AD_IMAGE_10_TAG", "AD_IMAGE_11_TAG", "AD_IMAGE_12_TAG", "AD_IMAGE_13_TAG", "AD_IMAGE_14_TAG", "AD_IMAGE_15_TAG", "AD_IMAGE_16_TAG", "AD_IMAGE_17_TAG", "AD_IMAGE_18_TAG", "AD_IMAGE_19_TAG", "AD_VIDEO_0_LINK", "AD_VIDEO_1_LINK", "AD_VIDEO_2_LINK", "AD_VIDEO_0_TAG", "AD_VIDEO_1_TAG", "AD_VIDEO_2_TAG", "INSTALLMENT_PRICE", "UNIT_PRICE_TOTAL_MEASURE", "UNIT_PRICE_BASE_MEASURE", "SALE_PRICE_EFFECTIVE_DATE", "" };
    return nullable_catalogs_item_field_typeArray[nullable_catalogs_item_field_type];
}

pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_FromString(char* nullable_catalogs_item_field_type) {
    int stringToReturn = 0;
    char *nullable_catalogs_item_field_typeArray[] =  { "NULL", "ITEM_ID", "ITEM_GROUP_ID", "TITLE", "DESCRIPTION", "ITEM_LINK", "ORGANIC_LINK", "IMAGE_LINK", "ADWORDS_REDIRECT_LINK", "AD_LINK", "SIZE", "GOOGLE_PRODUCT_CATEGORY", "PRODUCT_CATEGORY", "CONDITION", "AVAILABILITY", "GENDER", "AGE_GROUP", "SIZE_TYPE", "SIZE_SYSTEM", "ADULT", "SHIPPING", "SHIPPING_WEIGHT", "TAX", "MULTIPACK", "ADDITIONAL_IMAGE_LINK", "PRICE", "SALE_PRICE", "IS_BUNDLE", "EXPIRATION_DATE", "AVAILABILITY_DATE", "WEIGHT_UNIT", "PRODUCT_TYPE", "CUSTOM_LABEL_0", "CUSTOM_LABEL_1", "CUSTOM_LABEL_2", "CUSTOM_LABEL_3", "CUSTOM_LABEL_4", "MATERIAL", "PATTERN", "COLOR", "BRAND", "GTIN", "MPN", "IOS_DEEP_LINK", "ANDROID_DEEP_LINK", "FREE_SHIPPING_LABEL", "FREE_SHIPPING_LIMIT", "AVG_REVIEW_RATING", "NUM_RATINGS", "NUM_REVIEWS", "ALT_TEXT", "VARIANT_NAMES", "VARIANT_VALUES", "MIN_AD_PRICE", "SHIPPING_WIDTH", "SHIPPING_HEIGHT", "AD_IMAGE_0_LINK", "AD_IMAGE_1_LINK", "AD_IMAGE_2_LINK", "AD_IMAGE_3_LINK", "AD_IMAGE_4_LINK", "AD_IMAGE_5_LINK", "AD_IMAGE_6_LINK", "AD_IMAGE_7_LINK", "AD_IMAGE_8_LINK", "AD_IMAGE_9_LINK", "AD_IMAGE_10_LINK", "AD_IMAGE_11_LINK", "AD_IMAGE_12_LINK", "AD_IMAGE_13_LINK", "AD_IMAGE_14_LINK", "AD_IMAGE_15_LINK", "AD_IMAGE_16_LINK", "AD_IMAGE_17_LINK", "AD_IMAGE_18_LINK", "AD_IMAGE_19_LINK", "AD_IMAGE_0_TAG", "AD_IMAGE_1_TAG", "AD_IMAGE_2_TAG", "AD_IMAGE_3_TAG", "AD_IMAGE_4_TAG", "AD_IMAGE_5_TAG", "AD_IMAGE_6_TAG", "AD_IMAGE_7_TAG", "AD_IMAGE_8_TAG", "AD_IMAGE_9_TAG", "AD_IMAGE_10_TAG", "AD_IMAGE_11_TAG", "AD_IMAGE_12_TAG", "AD_IMAGE_13_TAG", "AD_IMAGE_14_TAG", "AD_IMAGE_15_TAG", "AD_IMAGE_16_TAG", "AD_IMAGE_17_TAG", "AD_IMAGE_18_TAG", "AD_IMAGE_19_TAG", "AD_VIDEO_0_LINK", "AD_VIDEO_1_LINK", "AD_VIDEO_2_LINK", "AD_VIDEO_0_TAG", "AD_VIDEO_1_TAG", "AD_VIDEO_2_TAG", "INSTALLMENT_PRICE", "UNIT_PRICE_TOTAL_MEASURE", "UNIT_PRICE_BASE_MEASURE", "SALE_PRICE_EFFECTIVE_DATE", "" };
    size_t sizeofArray = sizeof(nullable_catalogs_item_field_typeArray) / sizeof(nullable_catalogs_item_field_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(nullable_catalogs_item_field_type, nullable_catalogs_item_field_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *nullable_catalogs_item_field_type_convertToJSON(pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "nullable_catalogs_item_field_type", nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_ToString(nullable_catalogs_item_field_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_nullable_catalogs_item_field_type__e nullable_catalogs_item_field_type_parseFromJSON(cJSON *nullable_catalogs_item_field_typeJSON) {
    if(!cJSON_IsString(nullable_catalogs_item_field_typeJSON) || (nullable_catalogs_item_field_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return nullable_catalogs_item_field_type_nullable_catalogs_item_field_type_FromString(nullable_catalogs_item_field_typeJSON->valuestring);
}
