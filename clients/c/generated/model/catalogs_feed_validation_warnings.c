#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_validation_warnings.h"


char* catalogs_feed_validation_warnings_fetch_same_signature_ToString(pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_e fetch_same_signature) {
    char* fetch_same_signatureArray[] =  { "NULL", "1" };
    return fetch_same_signatureArray[fetch_same_signature];
}

pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_e catalogs_feed_validation_warnings_fetch_same_signature_FromString(char* fetch_same_signature){
    int stringToReturn = 0;
    char *fetch_same_signatureArray[] =  { "NULL", "1" };
    size_t sizeofArray = sizeof(fetch_same_signatureArray) / sizeof(fetch_same_signatureArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(fetch_same_signature, fetch_same_signatureArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_create(
    int ad_link_format_warning,
    int ad_link_same_as_link,
    int title_length_too_long,
    int description_length_too_long,
    int gender_invalid,
    int age_group_invalid,
    int size_type_invalid,
    int size_system_invalid,
    int link_format_warning,
    int sales_price_invalid,
    int product_category_depth_warning,
    int adwords_format_warning,
    int adwords_same_as_link,
    int duplicate_headers,
    int fetch_same_signature,
    int additional_image_link_length_too_long,
    int additional_image_link_warning,
    int image_link_warning,
    int shipping_invalid,
    int tax_invalid,
    int shipping_weight_invalid,
    int expiration_date_invalid,
    int availability_date_invalid,
    int sale_date_invalid,
    int weight_unit_invalid,
    int is_bundle_invalid,
    int updated_time_invalid,
    int custom_label_length_too_long,
    int product_type_length_too_long,
    int too_many_additional_image_links,
    int multipack_invalid,
    int indexed_product_count_large_delta,
    int item_additional_image_download_failure,
    int optional_product_category_missing,
    int optional_product_category_invalid,
    int optional_condition_missing,
    int optional_condition_invalid,
    int ios_deep_link_invalid,
    int android_deep_link_invalid,
    int utm_source_auto_corrected,
    int country_does_not_map_to_currency,
    int min_ad_price_invalid,
    int gtin_invalid,
    int inconsistent_currency_values,
    int sales_price_too_low,
    int shipping_width_invalid,
    int shipping_height_invalid,
    int sales_price_too_high,
    int mpn_invalid
    ) {
    catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_local_var = malloc(sizeof(catalogs_feed_validation_warnings_t));
    if (!catalogs_feed_validation_warnings_local_var) {
        return NULL;
    }
    catalogs_feed_validation_warnings_local_var->ad_link_format_warning = ad_link_format_warning;
    catalogs_feed_validation_warnings_local_var->ad_link_same_as_link = ad_link_same_as_link;
    catalogs_feed_validation_warnings_local_var->title_length_too_long = title_length_too_long;
    catalogs_feed_validation_warnings_local_var->description_length_too_long = description_length_too_long;
    catalogs_feed_validation_warnings_local_var->gender_invalid = gender_invalid;
    catalogs_feed_validation_warnings_local_var->age_group_invalid = age_group_invalid;
    catalogs_feed_validation_warnings_local_var->size_type_invalid = size_type_invalid;
    catalogs_feed_validation_warnings_local_var->size_system_invalid = size_system_invalid;
    catalogs_feed_validation_warnings_local_var->link_format_warning = link_format_warning;
    catalogs_feed_validation_warnings_local_var->sales_price_invalid = sales_price_invalid;
    catalogs_feed_validation_warnings_local_var->product_category_depth_warning = product_category_depth_warning;
    catalogs_feed_validation_warnings_local_var->adwords_format_warning = adwords_format_warning;
    catalogs_feed_validation_warnings_local_var->adwords_same_as_link = adwords_same_as_link;
    catalogs_feed_validation_warnings_local_var->duplicate_headers = duplicate_headers;
    catalogs_feed_validation_warnings_local_var->fetch_same_signature = fetch_same_signature;
    catalogs_feed_validation_warnings_local_var->additional_image_link_length_too_long = additional_image_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->additional_image_link_warning = additional_image_link_warning;
    catalogs_feed_validation_warnings_local_var->image_link_warning = image_link_warning;
    catalogs_feed_validation_warnings_local_var->shipping_invalid = shipping_invalid;
    catalogs_feed_validation_warnings_local_var->tax_invalid = tax_invalid;
    catalogs_feed_validation_warnings_local_var->shipping_weight_invalid = shipping_weight_invalid;
    catalogs_feed_validation_warnings_local_var->expiration_date_invalid = expiration_date_invalid;
    catalogs_feed_validation_warnings_local_var->availability_date_invalid = availability_date_invalid;
    catalogs_feed_validation_warnings_local_var->sale_date_invalid = sale_date_invalid;
    catalogs_feed_validation_warnings_local_var->weight_unit_invalid = weight_unit_invalid;
    catalogs_feed_validation_warnings_local_var->is_bundle_invalid = is_bundle_invalid;
    catalogs_feed_validation_warnings_local_var->updated_time_invalid = updated_time_invalid;
    catalogs_feed_validation_warnings_local_var->custom_label_length_too_long = custom_label_length_too_long;
    catalogs_feed_validation_warnings_local_var->product_type_length_too_long = product_type_length_too_long;
    catalogs_feed_validation_warnings_local_var->too_many_additional_image_links = too_many_additional_image_links;
    catalogs_feed_validation_warnings_local_var->multipack_invalid = multipack_invalid;
    catalogs_feed_validation_warnings_local_var->indexed_product_count_large_delta = indexed_product_count_large_delta;
    catalogs_feed_validation_warnings_local_var->item_additional_image_download_failure = item_additional_image_download_failure;
    catalogs_feed_validation_warnings_local_var->optional_product_category_missing = optional_product_category_missing;
    catalogs_feed_validation_warnings_local_var->optional_product_category_invalid = optional_product_category_invalid;
    catalogs_feed_validation_warnings_local_var->optional_condition_missing = optional_condition_missing;
    catalogs_feed_validation_warnings_local_var->optional_condition_invalid = optional_condition_invalid;
    catalogs_feed_validation_warnings_local_var->ios_deep_link_invalid = ios_deep_link_invalid;
    catalogs_feed_validation_warnings_local_var->android_deep_link_invalid = android_deep_link_invalid;
    catalogs_feed_validation_warnings_local_var->utm_source_auto_corrected = utm_source_auto_corrected;
    catalogs_feed_validation_warnings_local_var->country_does_not_map_to_currency = country_does_not_map_to_currency;
    catalogs_feed_validation_warnings_local_var->min_ad_price_invalid = min_ad_price_invalid;
    catalogs_feed_validation_warnings_local_var->gtin_invalid = gtin_invalid;
    catalogs_feed_validation_warnings_local_var->inconsistent_currency_values = inconsistent_currency_values;
    catalogs_feed_validation_warnings_local_var->sales_price_too_low = sales_price_too_low;
    catalogs_feed_validation_warnings_local_var->shipping_width_invalid = shipping_width_invalid;
    catalogs_feed_validation_warnings_local_var->shipping_height_invalid = shipping_height_invalid;
    catalogs_feed_validation_warnings_local_var->sales_price_too_high = sales_price_too_high;
    catalogs_feed_validation_warnings_local_var->mpn_invalid = mpn_invalid;

    return catalogs_feed_validation_warnings_local_var;
}


void catalogs_feed_validation_warnings_free(catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings) {
    if(NULL == catalogs_feed_validation_warnings){
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_feed_validation_warnings);
}

cJSON *catalogs_feed_validation_warnings_convertToJSON(catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_validation_warnings->ad_link_format_warning
    if(catalogs_feed_validation_warnings->ad_link_format_warning) {
    if(cJSON_AddNumberToObject(item, "AD_LINK_FORMAT_WARNING", catalogs_feed_validation_warnings->ad_link_format_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_link_same_as_link
    if(catalogs_feed_validation_warnings->ad_link_same_as_link) {
    if(cJSON_AddNumberToObject(item, "AD_LINK_SAME_AS_LINK", catalogs_feed_validation_warnings->ad_link_same_as_link) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->title_length_too_long
    if(catalogs_feed_validation_warnings->title_length_too_long) {
    if(cJSON_AddNumberToObject(item, "TITLE_LENGTH_TOO_LONG", catalogs_feed_validation_warnings->title_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->description_length_too_long
    if(catalogs_feed_validation_warnings->description_length_too_long) {
    if(cJSON_AddNumberToObject(item, "DESCRIPTION_LENGTH_TOO_LONG", catalogs_feed_validation_warnings->description_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->gender_invalid
    if(catalogs_feed_validation_warnings->gender_invalid) {
    if(cJSON_AddNumberToObject(item, "GENDER_INVALID", catalogs_feed_validation_warnings->gender_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->age_group_invalid
    if(catalogs_feed_validation_warnings->age_group_invalid) {
    if(cJSON_AddNumberToObject(item, "AGE_GROUP_INVALID", catalogs_feed_validation_warnings->age_group_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->size_type_invalid
    if(catalogs_feed_validation_warnings->size_type_invalid) {
    if(cJSON_AddNumberToObject(item, "SIZE_TYPE_INVALID", catalogs_feed_validation_warnings->size_type_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->size_system_invalid
    if(catalogs_feed_validation_warnings->size_system_invalid) {
    if(cJSON_AddNumberToObject(item, "SIZE_SYSTEM_INVALID", catalogs_feed_validation_warnings->size_system_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->link_format_warning
    if(catalogs_feed_validation_warnings->link_format_warning) {
    if(cJSON_AddNumberToObject(item, "LINK_FORMAT_WARNING", catalogs_feed_validation_warnings->link_format_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->sales_price_invalid
    if(catalogs_feed_validation_warnings->sales_price_invalid) {
    if(cJSON_AddNumberToObject(item, "SALES_PRICE_INVALID", catalogs_feed_validation_warnings->sales_price_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->product_category_depth_warning
    if(catalogs_feed_validation_warnings->product_category_depth_warning) {
    if(cJSON_AddNumberToObject(item, "PRODUCT_CATEGORY_DEPTH_WARNING", catalogs_feed_validation_warnings->product_category_depth_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->adwords_format_warning
    if(catalogs_feed_validation_warnings->adwords_format_warning) {
    if(cJSON_AddNumberToObject(item, "ADWORDS_FORMAT_WARNING", catalogs_feed_validation_warnings->adwords_format_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->adwords_same_as_link
    if(catalogs_feed_validation_warnings->adwords_same_as_link) {
    if(cJSON_AddNumberToObject(item, "ADWORDS_SAME_AS_LINK", catalogs_feed_validation_warnings->adwords_same_as_link) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->duplicate_headers
    if(catalogs_feed_validation_warnings->duplicate_headers) {
    if(cJSON_AddNumberToObject(item, "DUPLICATE_HEADERS", catalogs_feed_validation_warnings->duplicate_headers) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->fetch_same_signature
    if(catalogs_feed_validation_warnings->fetch_same_signature != pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_NULL) {
    if(cJSON_AddNumberToObject(item, "FETCH_SAME_SIGNATURE", catalogs_feed_validation_warnings->fetch_same_signature) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->additional_image_link_length_too_long
    if(catalogs_feed_validation_warnings->additional_image_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", catalogs_feed_validation_warnings->additional_image_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->additional_image_link_warning
    if(catalogs_feed_validation_warnings->additional_image_link_warning) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_LINK_WARNING", catalogs_feed_validation_warnings->additional_image_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->image_link_warning
    if(catalogs_feed_validation_warnings->image_link_warning) {
    if(cJSON_AddNumberToObject(item, "IMAGE_LINK_WARNING", catalogs_feed_validation_warnings->image_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->shipping_invalid
    if(catalogs_feed_validation_warnings->shipping_invalid) {
    if(cJSON_AddNumberToObject(item, "SHIPPING_INVALID", catalogs_feed_validation_warnings->shipping_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->tax_invalid
    if(catalogs_feed_validation_warnings->tax_invalid) {
    if(cJSON_AddNumberToObject(item, "TAX_INVALID", catalogs_feed_validation_warnings->tax_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->shipping_weight_invalid
    if(catalogs_feed_validation_warnings->shipping_weight_invalid) {
    if(cJSON_AddNumberToObject(item, "SHIPPING_WEIGHT_INVALID", catalogs_feed_validation_warnings->shipping_weight_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->expiration_date_invalid
    if(catalogs_feed_validation_warnings->expiration_date_invalid) {
    if(cJSON_AddNumberToObject(item, "EXPIRATION_DATE_INVALID", catalogs_feed_validation_warnings->expiration_date_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->availability_date_invalid
    if(catalogs_feed_validation_warnings->availability_date_invalid) {
    if(cJSON_AddNumberToObject(item, "AVAILABILITY_DATE_INVALID", catalogs_feed_validation_warnings->availability_date_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->sale_date_invalid
    if(catalogs_feed_validation_warnings->sale_date_invalid) {
    if(cJSON_AddNumberToObject(item, "SALE_DATE_INVALID", catalogs_feed_validation_warnings->sale_date_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->weight_unit_invalid
    if(catalogs_feed_validation_warnings->weight_unit_invalid) {
    if(cJSON_AddNumberToObject(item, "WEIGHT_UNIT_INVALID", catalogs_feed_validation_warnings->weight_unit_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->is_bundle_invalid
    if(catalogs_feed_validation_warnings->is_bundle_invalid) {
    if(cJSON_AddNumberToObject(item, "IS_BUNDLE_INVALID", catalogs_feed_validation_warnings->is_bundle_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->updated_time_invalid
    if(catalogs_feed_validation_warnings->updated_time_invalid) {
    if(cJSON_AddNumberToObject(item, "UPDATED_TIME_INVALID", catalogs_feed_validation_warnings->updated_time_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->custom_label_length_too_long
    if(catalogs_feed_validation_warnings->custom_label_length_too_long) {
    if(cJSON_AddNumberToObject(item, "CUSTOM_LABEL_LENGTH_TOO_LONG", catalogs_feed_validation_warnings->custom_label_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->product_type_length_too_long
    if(catalogs_feed_validation_warnings->product_type_length_too_long) {
    if(cJSON_AddNumberToObject(item, "PRODUCT_TYPE_LENGTH_TOO_LONG", catalogs_feed_validation_warnings->product_type_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->too_many_additional_image_links
    if(catalogs_feed_validation_warnings->too_many_additional_image_links) {
    if(cJSON_AddNumberToObject(item, "TOO_MANY_ADDITIONAL_IMAGE_LINKS", catalogs_feed_validation_warnings->too_many_additional_image_links) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->multipack_invalid
    if(catalogs_feed_validation_warnings->multipack_invalid) {
    if(cJSON_AddNumberToObject(item, "MULTIPACK_INVALID", catalogs_feed_validation_warnings->multipack_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->indexed_product_count_large_delta
    if(catalogs_feed_validation_warnings->indexed_product_count_large_delta) {
    if(cJSON_AddNumberToObject(item, "INDEXED_PRODUCT_COUNT_LARGE_DELTA", catalogs_feed_validation_warnings->indexed_product_count_large_delta) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->item_additional_image_download_failure
    if(catalogs_feed_validation_warnings->item_additional_image_download_failure) {
    if(cJSON_AddNumberToObject(item, "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", catalogs_feed_validation_warnings->item_additional_image_download_failure) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->optional_product_category_missing
    if(catalogs_feed_validation_warnings->optional_product_category_missing) {
    if(cJSON_AddNumberToObject(item, "OPTIONAL_PRODUCT_CATEGORY_MISSING", catalogs_feed_validation_warnings->optional_product_category_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->optional_product_category_invalid
    if(catalogs_feed_validation_warnings->optional_product_category_invalid) {
    if(cJSON_AddNumberToObject(item, "OPTIONAL_PRODUCT_CATEGORY_INVALID", catalogs_feed_validation_warnings->optional_product_category_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->optional_condition_missing
    if(catalogs_feed_validation_warnings->optional_condition_missing) {
    if(cJSON_AddNumberToObject(item, "OPTIONAL_CONDITION_MISSING", catalogs_feed_validation_warnings->optional_condition_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->optional_condition_invalid
    if(catalogs_feed_validation_warnings->optional_condition_invalid) {
    if(cJSON_AddNumberToObject(item, "OPTIONAL_CONDITION_INVALID", catalogs_feed_validation_warnings->optional_condition_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ios_deep_link_invalid
    if(catalogs_feed_validation_warnings->ios_deep_link_invalid) {
    if(cJSON_AddNumberToObject(item, "IOS_DEEP_LINK_INVALID", catalogs_feed_validation_warnings->ios_deep_link_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->android_deep_link_invalid
    if(catalogs_feed_validation_warnings->android_deep_link_invalid) {
    if(cJSON_AddNumberToObject(item, "ANDROID_DEEP_LINK_INVALID", catalogs_feed_validation_warnings->android_deep_link_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->utm_source_auto_corrected
    if(catalogs_feed_validation_warnings->utm_source_auto_corrected) {
    if(cJSON_AddNumberToObject(item, "UTM_SOURCE_AUTO_CORRECTED", catalogs_feed_validation_warnings->utm_source_auto_corrected) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->country_does_not_map_to_currency
    if(catalogs_feed_validation_warnings->country_does_not_map_to_currency) {
    if(cJSON_AddNumberToObject(item, "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", catalogs_feed_validation_warnings->country_does_not_map_to_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->min_ad_price_invalid
    if(catalogs_feed_validation_warnings->min_ad_price_invalid) {
    if(cJSON_AddNumberToObject(item, "MIN_AD_PRICE_INVALID", catalogs_feed_validation_warnings->min_ad_price_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->gtin_invalid
    if(catalogs_feed_validation_warnings->gtin_invalid) {
    if(cJSON_AddNumberToObject(item, "GTIN_INVALID", catalogs_feed_validation_warnings->gtin_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->inconsistent_currency_values
    if(catalogs_feed_validation_warnings->inconsistent_currency_values) {
    if(cJSON_AddNumberToObject(item, "INCONSISTENT_CURRENCY_VALUES", catalogs_feed_validation_warnings->inconsistent_currency_values) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->sales_price_too_low
    if(catalogs_feed_validation_warnings->sales_price_too_low) {
    if(cJSON_AddNumberToObject(item, "SALES_PRICE_TOO_LOW", catalogs_feed_validation_warnings->sales_price_too_low) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->shipping_width_invalid
    if(catalogs_feed_validation_warnings->shipping_width_invalid) {
    if(cJSON_AddNumberToObject(item, "SHIPPING_WIDTH_INVALID", catalogs_feed_validation_warnings->shipping_width_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->shipping_height_invalid
    if(catalogs_feed_validation_warnings->shipping_height_invalid) {
    if(cJSON_AddNumberToObject(item, "SHIPPING_HEIGHT_INVALID", catalogs_feed_validation_warnings->shipping_height_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->sales_price_too_high
    if(catalogs_feed_validation_warnings->sales_price_too_high) {
    if(cJSON_AddNumberToObject(item, "SALES_PRICE_TOO_HIGH", catalogs_feed_validation_warnings->sales_price_too_high) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->mpn_invalid
    if(catalogs_feed_validation_warnings->mpn_invalid) {
    if(cJSON_AddNumberToObject(item, "MPN_INVALID", catalogs_feed_validation_warnings->mpn_invalid) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_parseFromJSON(cJSON *catalogs_feed_validation_warningsJSON){

    catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_local_var = NULL;

    // catalogs_feed_validation_warnings->ad_link_format_warning
    cJSON *ad_link_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_LINK_FORMAT_WARNING");
    if (ad_link_format_warning) { 
    if(!cJSON_IsNumber(ad_link_format_warning))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->ad_link_same_as_link
    cJSON *ad_link_same_as_link = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_LINK_SAME_AS_LINK");
    if (ad_link_same_as_link) { 
    if(!cJSON_IsNumber(ad_link_same_as_link))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->title_length_too_long
    cJSON *title_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "TITLE_LENGTH_TOO_LONG");
    if (title_length_too_long) { 
    if(!cJSON_IsNumber(title_length_too_long))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->description_length_too_long
    cJSON *description_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "DESCRIPTION_LENGTH_TOO_LONG");
    if (description_length_too_long) { 
    if(!cJSON_IsNumber(description_length_too_long))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->gender_invalid
    cJSON *gender_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "GENDER_INVALID");
    if (gender_invalid) { 
    if(!cJSON_IsNumber(gender_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->age_group_invalid
    cJSON *age_group_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AGE_GROUP_INVALID");
    if (age_group_invalid) { 
    if(!cJSON_IsNumber(age_group_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->size_type_invalid
    cJSON *size_type_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SIZE_TYPE_INVALID");
    if (size_type_invalid) { 
    if(!cJSON_IsNumber(size_type_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->size_system_invalid
    cJSON *size_system_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SIZE_SYSTEM_INVALID");
    if (size_system_invalid) { 
    if(!cJSON_IsNumber(size_system_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->link_format_warning
    cJSON *link_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "LINK_FORMAT_WARNING");
    if (link_format_warning) { 
    if(!cJSON_IsNumber(link_format_warning))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->sales_price_invalid
    cJSON *sales_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SALES_PRICE_INVALID");
    if (sales_price_invalid) { 
    if(!cJSON_IsNumber(sales_price_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->product_category_depth_warning
    cJSON *product_category_depth_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "PRODUCT_CATEGORY_DEPTH_WARNING");
    if (product_category_depth_warning) { 
    if(!cJSON_IsNumber(product_category_depth_warning))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->adwords_format_warning
    cJSON *adwords_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ADWORDS_FORMAT_WARNING");
    if (adwords_format_warning) { 
    if(!cJSON_IsNumber(adwords_format_warning))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->adwords_same_as_link
    cJSON *adwords_same_as_link = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ADWORDS_SAME_AS_LINK");
    if (adwords_same_as_link) { 
    if(!cJSON_IsNumber(adwords_same_as_link))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->duplicate_headers
    cJSON *duplicate_headers = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "DUPLICATE_HEADERS");
    if (duplicate_headers) { 
    if(!cJSON_IsNumber(duplicate_headers))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->fetch_same_signature
    cJSON *fetch_same_signature = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "FETCH_SAME_SIGNATURE");
    if (fetch_same_signature) { 
    if(!cJSON_IsNumber(fetch_same_signature))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->additional_image_link_length_too_long
    cJSON *additional_image_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG");
    if (additional_image_link_length_too_long) { 
    if(!cJSON_IsNumber(additional_image_link_length_too_long))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->additional_image_link_warning
    cJSON *additional_image_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ADDITIONAL_IMAGE_LINK_WARNING");
    if (additional_image_link_warning) { 
    if(!cJSON_IsNumber(additional_image_link_warning))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->image_link_warning
    cJSON *image_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "IMAGE_LINK_WARNING");
    if (image_link_warning) { 
    if(!cJSON_IsNumber(image_link_warning))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->shipping_invalid
    cJSON *shipping_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SHIPPING_INVALID");
    if (shipping_invalid) { 
    if(!cJSON_IsNumber(shipping_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->tax_invalid
    cJSON *tax_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "TAX_INVALID");
    if (tax_invalid) { 
    if(!cJSON_IsNumber(tax_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->shipping_weight_invalid
    cJSON *shipping_weight_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SHIPPING_WEIGHT_INVALID");
    if (shipping_weight_invalid) { 
    if(!cJSON_IsNumber(shipping_weight_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->expiration_date_invalid
    cJSON *expiration_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "EXPIRATION_DATE_INVALID");
    if (expiration_date_invalid) { 
    if(!cJSON_IsNumber(expiration_date_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->availability_date_invalid
    cJSON *availability_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AVAILABILITY_DATE_INVALID");
    if (availability_date_invalid) { 
    if(!cJSON_IsNumber(availability_date_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->sale_date_invalid
    cJSON *sale_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SALE_DATE_INVALID");
    if (sale_date_invalid) { 
    if(!cJSON_IsNumber(sale_date_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->weight_unit_invalid
    cJSON *weight_unit_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "WEIGHT_UNIT_INVALID");
    if (weight_unit_invalid) { 
    if(!cJSON_IsNumber(weight_unit_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->is_bundle_invalid
    cJSON *is_bundle_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "IS_BUNDLE_INVALID");
    if (is_bundle_invalid) { 
    if(!cJSON_IsNumber(is_bundle_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->updated_time_invalid
    cJSON *updated_time_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "UPDATED_TIME_INVALID");
    if (updated_time_invalid) { 
    if(!cJSON_IsNumber(updated_time_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->custom_label_length_too_long
    cJSON *custom_label_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "CUSTOM_LABEL_LENGTH_TOO_LONG");
    if (custom_label_length_too_long) { 
    if(!cJSON_IsNumber(custom_label_length_too_long))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->product_type_length_too_long
    cJSON *product_type_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "PRODUCT_TYPE_LENGTH_TOO_LONG");
    if (product_type_length_too_long) { 
    if(!cJSON_IsNumber(product_type_length_too_long))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->too_many_additional_image_links
    cJSON *too_many_additional_image_links = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "TOO_MANY_ADDITIONAL_IMAGE_LINKS");
    if (too_many_additional_image_links) { 
    if(!cJSON_IsNumber(too_many_additional_image_links))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->multipack_invalid
    cJSON *multipack_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "MULTIPACK_INVALID");
    if (multipack_invalid) { 
    if(!cJSON_IsNumber(multipack_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->indexed_product_count_large_delta
    cJSON *indexed_product_count_large_delta = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "INDEXED_PRODUCT_COUNT_LARGE_DELTA");
    if (indexed_product_count_large_delta) { 
    if(!cJSON_IsNumber(indexed_product_count_large_delta))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->item_additional_image_download_failure
    cJSON *item_additional_image_download_failure = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE");
    if (item_additional_image_download_failure) { 
    if(!cJSON_IsNumber(item_additional_image_download_failure))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->optional_product_category_missing
    cJSON *optional_product_category_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "OPTIONAL_PRODUCT_CATEGORY_MISSING");
    if (optional_product_category_missing) { 
    if(!cJSON_IsNumber(optional_product_category_missing))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->optional_product_category_invalid
    cJSON *optional_product_category_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "OPTIONAL_PRODUCT_CATEGORY_INVALID");
    if (optional_product_category_invalid) { 
    if(!cJSON_IsNumber(optional_product_category_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->optional_condition_missing
    cJSON *optional_condition_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "OPTIONAL_CONDITION_MISSING");
    if (optional_condition_missing) { 
    if(!cJSON_IsNumber(optional_condition_missing))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->optional_condition_invalid
    cJSON *optional_condition_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "OPTIONAL_CONDITION_INVALID");
    if (optional_condition_invalid) { 
    if(!cJSON_IsNumber(optional_condition_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->ios_deep_link_invalid
    cJSON *ios_deep_link_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "IOS_DEEP_LINK_INVALID");
    if (ios_deep_link_invalid) { 
    if(!cJSON_IsNumber(ios_deep_link_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->android_deep_link_invalid
    cJSON *android_deep_link_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ANDROID_DEEP_LINK_INVALID");
    if (android_deep_link_invalid) { 
    if(!cJSON_IsNumber(android_deep_link_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->utm_source_auto_corrected
    cJSON *utm_source_auto_corrected = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "UTM_SOURCE_AUTO_CORRECTED");
    if (utm_source_auto_corrected) { 
    if(!cJSON_IsNumber(utm_source_auto_corrected))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->country_does_not_map_to_currency
    cJSON *country_does_not_map_to_currency = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "COUNTRY_DOES_NOT_MAP_TO_CURRENCY");
    if (country_does_not_map_to_currency) { 
    if(!cJSON_IsNumber(country_does_not_map_to_currency))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->min_ad_price_invalid
    cJSON *min_ad_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "MIN_AD_PRICE_INVALID");
    if (min_ad_price_invalid) { 
    if(!cJSON_IsNumber(min_ad_price_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->gtin_invalid
    cJSON *gtin_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "GTIN_INVALID");
    if (gtin_invalid) { 
    if(!cJSON_IsNumber(gtin_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->inconsistent_currency_values
    cJSON *inconsistent_currency_values = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "INCONSISTENT_CURRENCY_VALUES");
    if (inconsistent_currency_values) { 
    if(!cJSON_IsNumber(inconsistent_currency_values))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->sales_price_too_low
    cJSON *sales_price_too_low = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SALES_PRICE_TOO_LOW");
    if (sales_price_too_low) { 
    if(!cJSON_IsNumber(sales_price_too_low))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->shipping_width_invalid
    cJSON *shipping_width_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SHIPPING_WIDTH_INVALID");
    if (shipping_width_invalid) { 
    if(!cJSON_IsNumber(shipping_width_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->shipping_height_invalid
    cJSON *shipping_height_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SHIPPING_HEIGHT_INVALID");
    if (shipping_height_invalid) { 
    if(!cJSON_IsNumber(shipping_height_invalid))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->sales_price_too_high
    cJSON *sales_price_too_high = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SALES_PRICE_TOO_HIGH");
    if (sales_price_too_high) { 
    if(!cJSON_IsNumber(sales_price_too_high))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_validation_warnings->mpn_invalid
    cJSON *mpn_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "MPN_INVALID");
    if (mpn_invalid) { 
    if(!cJSON_IsNumber(mpn_invalid))
    {
    goto end; //Numeric
    }
    }


    catalogs_feed_validation_warnings_local_var = catalogs_feed_validation_warnings_create (
        ad_link_format_warning ? ad_link_format_warning->valuedouble : 0,
        ad_link_same_as_link ? ad_link_same_as_link->valuedouble : 0,
        title_length_too_long ? title_length_too_long->valuedouble : 0,
        description_length_too_long ? description_length_too_long->valuedouble : 0,
        gender_invalid ? gender_invalid->valuedouble : 0,
        age_group_invalid ? age_group_invalid->valuedouble : 0,
        size_type_invalid ? size_type_invalid->valuedouble : 0,
        size_system_invalid ? size_system_invalid->valuedouble : 0,
        link_format_warning ? link_format_warning->valuedouble : 0,
        sales_price_invalid ? sales_price_invalid->valuedouble : 0,
        product_category_depth_warning ? product_category_depth_warning->valuedouble : 0,
        adwords_format_warning ? adwords_format_warning->valuedouble : 0,
        adwords_same_as_link ? adwords_same_as_link->valuedouble : 0,
        duplicate_headers ? duplicate_headers->valuedouble : 0,
        fetch_same_signature ? fetch_same_signature->valuedouble : 0,
        additional_image_link_length_too_long ? additional_image_link_length_too_long->valuedouble : 0,
        additional_image_link_warning ? additional_image_link_warning->valuedouble : 0,
        image_link_warning ? image_link_warning->valuedouble : 0,
        shipping_invalid ? shipping_invalid->valuedouble : 0,
        tax_invalid ? tax_invalid->valuedouble : 0,
        shipping_weight_invalid ? shipping_weight_invalid->valuedouble : 0,
        expiration_date_invalid ? expiration_date_invalid->valuedouble : 0,
        availability_date_invalid ? availability_date_invalid->valuedouble : 0,
        sale_date_invalid ? sale_date_invalid->valuedouble : 0,
        weight_unit_invalid ? weight_unit_invalid->valuedouble : 0,
        is_bundle_invalid ? is_bundle_invalid->valuedouble : 0,
        updated_time_invalid ? updated_time_invalid->valuedouble : 0,
        custom_label_length_too_long ? custom_label_length_too_long->valuedouble : 0,
        product_type_length_too_long ? product_type_length_too_long->valuedouble : 0,
        too_many_additional_image_links ? too_many_additional_image_links->valuedouble : 0,
        multipack_invalid ? multipack_invalid->valuedouble : 0,
        indexed_product_count_large_delta ? indexed_product_count_large_delta->valuedouble : 0,
        item_additional_image_download_failure ? item_additional_image_download_failure->valuedouble : 0,
        optional_product_category_missing ? optional_product_category_missing->valuedouble : 0,
        optional_product_category_invalid ? optional_product_category_invalid->valuedouble : 0,
        optional_condition_missing ? optional_condition_missing->valuedouble : 0,
        optional_condition_invalid ? optional_condition_invalid->valuedouble : 0,
        ios_deep_link_invalid ? ios_deep_link_invalid->valuedouble : 0,
        android_deep_link_invalid ? android_deep_link_invalid->valuedouble : 0,
        utm_source_auto_corrected ? utm_source_auto_corrected->valuedouble : 0,
        country_does_not_map_to_currency ? country_does_not_map_to_currency->valuedouble : 0,
        min_ad_price_invalid ? min_ad_price_invalid->valuedouble : 0,
        gtin_invalid ? gtin_invalid->valuedouble : 0,
        inconsistent_currency_values ? inconsistent_currency_values->valuedouble : 0,
        sales_price_too_low ? sales_price_too_low->valuedouble : 0,
        shipping_width_invalid ? shipping_width_invalid->valuedouble : 0,
        shipping_height_invalid ? shipping_height_invalid->valuedouble : 0,
        sales_price_too_high ? sales_price_too_high->valuedouble : 0,
        mpn_invalid ? mpn_invalid->valuedouble : 0
        );

    return catalogs_feed_validation_warnings_local_var;
end:
    return NULL;

}
