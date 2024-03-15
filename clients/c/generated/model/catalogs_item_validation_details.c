#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_item_validation_details.h"


char* catalogs_item_validation_details_attribute_name_ToString(pinterest_rest_api_catalogs_item_validation_details__e attribute_name) {
    char* attribute_nameArray[] =  { "NULL", "ITEM_ID", "ITEM_GROUP_ID", "TITLE", "DESCRIPTION", "ITEM_LINK", "ORGANIC_LINK", "IMAGE_LINK", "ADWORDS_REDIRECT_LINK", "AD_LINK", "SIZE", "GOOGLE_PRODUCT_CATEGORY", "PRODUCT_CATEGORY", "CONDITION", "AVAILABILITY", "GENDER", "AGE_GROUP", "SIZE_TYPE", "SIZE_SYSTEM", "ADULT", "SHIPPING", "SHIPPING_WEIGHT", "TAX", "MULTIPACK", "ADDITIONAL_IMAGE_LINK", "PRICE", "SALE_PRICE", "IS_BUNDLE", "EXPIRATION_DATE", "SALE_PRICE_EFFECTIVE_DATE", "AVAILABILITY_DATE", "WEIGHT_UNIT", "PRODUCT_TYPE", "CUSTOM_LABEL_0", "CUSTOM_LABEL_1", "CUSTOM_LABEL_2", "CUSTOM_LABEL_3", "CUSTOM_LABEL_4", "MATERIAL", "PATTERN", "COLOR", "BRAND", "GTIN", "MPN", "IOS_DEEP_LINK", "ANDROID_DEEP_LINK", "FREE_SHIPPING_LABEL", "FREE_SHIPPING_LIMIT", "AVG_REVIEW_RATING", "NUM_RATINGS", "NUM_REVIEWS", "ALT_TEXT", "VARIANT_NAMES", "VARIANT_VALUES", "MIN_AD_PRICE", "SHIPPING_WIDTH", "SHIPPING_HEIGHT", "" };
    return attribute_nameArray[attribute_name];
}

pinterest_rest_api_catalogs_item_validation_details__e catalogs_item_validation_details_attribute_name_FromString(char* attribute_name){
    int stringToReturn = 0;
    char *attribute_nameArray[] =  { "NULL", "ITEM_ID", "ITEM_GROUP_ID", "TITLE", "DESCRIPTION", "ITEM_LINK", "ORGANIC_LINK", "IMAGE_LINK", "ADWORDS_REDIRECT_LINK", "AD_LINK", "SIZE", "GOOGLE_PRODUCT_CATEGORY", "PRODUCT_CATEGORY", "CONDITION", "AVAILABILITY", "GENDER", "AGE_GROUP", "SIZE_TYPE", "SIZE_SYSTEM", "ADULT", "SHIPPING", "SHIPPING_WEIGHT", "TAX", "MULTIPACK", "ADDITIONAL_IMAGE_LINK", "PRICE", "SALE_PRICE", "IS_BUNDLE", "EXPIRATION_DATE", "SALE_PRICE_EFFECTIVE_DATE", "AVAILABILITY_DATE", "WEIGHT_UNIT", "PRODUCT_TYPE", "CUSTOM_LABEL_0", "CUSTOM_LABEL_1", "CUSTOM_LABEL_2", "CUSTOM_LABEL_3", "CUSTOM_LABEL_4", "MATERIAL", "PATTERN", "COLOR", "BRAND", "GTIN", "MPN", "IOS_DEEP_LINK", "ANDROID_DEEP_LINK", "FREE_SHIPPING_LABEL", "FREE_SHIPPING_LIMIT", "AVG_REVIEW_RATING", "NUM_RATINGS", "NUM_REVIEWS", "ALT_TEXT", "VARIANT_NAMES", "VARIANT_VALUES", "MIN_AD_PRICE", "SHIPPING_WIDTH", "SHIPPING_HEIGHT", "" };
    size_t sizeofArray = sizeof(attribute_nameArray) / sizeof(attribute_nameArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(attribute_name, attribute_nameArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_item_validation_details_t *catalogs_item_validation_details_create(
    nullable_catalogs_item_field_type_t *attribute_name,
    char *provided_value
    ) {
    catalogs_item_validation_details_t *catalogs_item_validation_details_local_var = malloc(sizeof(catalogs_item_validation_details_t));
    if (!catalogs_item_validation_details_local_var) {
        return NULL;
    }
    catalogs_item_validation_details_local_var->attribute_name = attribute_name;
    catalogs_item_validation_details_local_var->provided_value = provided_value;

    return catalogs_item_validation_details_local_var;
}


void catalogs_item_validation_details_free(catalogs_item_validation_details_t *catalogs_item_validation_details) {
    if(NULL == catalogs_item_validation_details){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_item_validation_details->attribute_name) {
        nullable_catalogs_item_field_type_free(catalogs_item_validation_details->attribute_name);
        catalogs_item_validation_details->attribute_name = NULL;
    }
    if (catalogs_item_validation_details->provided_value) {
        free(catalogs_item_validation_details->provided_value);
        catalogs_item_validation_details->provided_value = NULL;
    }
    free(catalogs_item_validation_details);
}

cJSON *catalogs_item_validation_details_convertToJSON(catalogs_item_validation_details_t *catalogs_item_validation_details) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_item_validation_details->attribute_name
    if (pinterest_rest_api_catalogs_item_validation_details__NULL == catalogs_item_validation_details->attribute_name) {
        goto fail;
    }
    cJSON *attribute_name_local_JSON = nullable_catalogs_item_field_type_convertToJSON(catalogs_item_validation_details->attribute_name);
    if(attribute_name_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "attribute_name", attribute_name_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_item_validation_details->provided_value
    if (!catalogs_item_validation_details->provided_value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "provided_value", catalogs_item_validation_details->provided_value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_item_validation_details_t *catalogs_item_validation_details_parseFromJSON(cJSON *catalogs_item_validation_detailsJSON){

    catalogs_item_validation_details_t *catalogs_item_validation_details_local_var = NULL;

    // define the local variable for catalogs_item_validation_details->attribute_name
    nullable_catalogs_item_field_type_t *attribute_name_local_nonprim = NULL;

    // catalogs_item_validation_details->attribute_name
    cJSON *attribute_name = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_detailsJSON, "attribute_name");
    if (!attribute_name) {
        goto end;
    }

    
    attribute_name_local_nonprim = nullable_catalogs_item_field_type_parseFromJSON(attribute_name); //custom

    // catalogs_item_validation_details->provided_value
    cJSON *provided_value = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_detailsJSON, "provided_value");
    if (!provided_value) {
        goto end;
    }

    
    if(!cJSON_IsString(provided_value))
    {
    goto end; //String
    }


    catalogs_item_validation_details_local_var = catalogs_item_validation_details_create (
        attribute_name_local_nonprim,
        strdup(provided_value->valuestring)
        );

    return catalogs_item_validation_details_local_var;
end:
    if (attribute_name_local_nonprim) {
        nullable_catalogs_item_field_type_free(attribute_name_local_nonprim);
        attribute_name_local_nonprim = NULL;
    }
    return NULL;

}
