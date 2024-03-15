#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_item_validation_warnings.h"



catalogs_item_validation_warnings_t *catalogs_item_validation_warnings_create(
    catalogs_item_validation_details_t *ad_link_format_warning,
    catalogs_item_validation_details_t *ad_link_same_as_link,
    catalogs_item_validation_details_t *additional_image_link_length_too_long,
    catalogs_item_validation_details_t *additional_image_link_warning,
    catalogs_item_validation_details_t *adwords_format_warning,
    catalogs_item_validation_details_t *adwords_same_as_link,
    catalogs_item_validation_details_t *age_group_invalid,
    catalogs_item_validation_details_t *size_system_invalid,
    catalogs_item_validation_details_t *android_deep_link_invalid,
    catalogs_item_validation_details_t *availability_date_invalid,
    catalogs_item_validation_details_t *country_does_not_map_to_currency,
    catalogs_item_validation_details_t *custom_label_length_too_long,
    catalogs_item_validation_details_t *description_length_too_long,
    catalogs_item_validation_details_t *expiration_date_invalid,
    catalogs_item_validation_details_t *gender_invalid,
    catalogs_item_validation_details_t *gtin_invalid,
    catalogs_item_validation_details_t *image_link_warning,
    catalogs_item_validation_details_t *ios_deep_link_invalid,
    catalogs_item_validation_details_t *is_bundle_invalid,
    catalogs_item_validation_details_t *item_additional_image_download_failure,
    catalogs_item_validation_details_t *link_format_warning,
    catalogs_item_validation_details_t *min_ad_price_invalid,
    catalogs_item_validation_details_t *mpn_invalid,
    catalogs_item_validation_details_t *multipack_invalid,
    catalogs_item_validation_details_t *optional_condition_invalid,
    catalogs_item_validation_details_t *optional_condition_missing,
    catalogs_item_validation_details_t *optional_product_category_invalid,
    catalogs_item_validation_details_t *optional_product_category_missing,
    catalogs_item_validation_details_t *product_category_depth_warning,
    catalogs_item_validation_details_t *product_type_length_too_long,
    catalogs_item_validation_details_t *sales_price_invalid,
    catalogs_item_validation_details_t *sales_price_too_low,
    catalogs_item_validation_details_t *sales_price_too_high,
    catalogs_item_validation_details_t *sale_date_invalid,
    catalogs_item_validation_details_t *shipping_invalid,
    catalogs_item_validation_details_t *shipping_height_invalid,
    catalogs_item_validation_details_t *shipping_weight_invalid,
    catalogs_item_validation_details_t *shipping_width_invalid,
    catalogs_item_validation_details_t *size_type_invalid,
    catalogs_item_validation_details_t *tax_invalid,
    catalogs_item_validation_details_t *title_length_too_long,
    catalogs_item_validation_details_t *too_many_additional_image_links,
    catalogs_item_validation_details_t *utm_source_auto_corrected,
    catalogs_item_validation_details_t *weight_unit_invalid
    ) {
    catalogs_item_validation_warnings_t *catalogs_item_validation_warnings_local_var = malloc(sizeof(catalogs_item_validation_warnings_t));
    if (!catalogs_item_validation_warnings_local_var) {
        return NULL;
    }
    catalogs_item_validation_warnings_local_var->ad_link_format_warning = ad_link_format_warning;
    catalogs_item_validation_warnings_local_var->ad_link_same_as_link = ad_link_same_as_link;
    catalogs_item_validation_warnings_local_var->additional_image_link_length_too_long = additional_image_link_length_too_long;
    catalogs_item_validation_warnings_local_var->additional_image_link_warning = additional_image_link_warning;
    catalogs_item_validation_warnings_local_var->adwords_format_warning = adwords_format_warning;
    catalogs_item_validation_warnings_local_var->adwords_same_as_link = adwords_same_as_link;
    catalogs_item_validation_warnings_local_var->age_group_invalid = age_group_invalid;
    catalogs_item_validation_warnings_local_var->size_system_invalid = size_system_invalid;
    catalogs_item_validation_warnings_local_var->android_deep_link_invalid = android_deep_link_invalid;
    catalogs_item_validation_warnings_local_var->availability_date_invalid = availability_date_invalid;
    catalogs_item_validation_warnings_local_var->country_does_not_map_to_currency = country_does_not_map_to_currency;
    catalogs_item_validation_warnings_local_var->custom_label_length_too_long = custom_label_length_too_long;
    catalogs_item_validation_warnings_local_var->description_length_too_long = description_length_too_long;
    catalogs_item_validation_warnings_local_var->expiration_date_invalid = expiration_date_invalid;
    catalogs_item_validation_warnings_local_var->gender_invalid = gender_invalid;
    catalogs_item_validation_warnings_local_var->gtin_invalid = gtin_invalid;
    catalogs_item_validation_warnings_local_var->image_link_warning = image_link_warning;
    catalogs_item_validation_warnings_local_var->ios_deep_link_invalid = ios_deep_link_invalid;
    catalogs_item_validation_warnings_local_var->is_bundle_invalid = is_bundle_invalid;
    catalogs_item_validation_warnings_local_var->item_additional_image_download_failure = item_additional_image_download_failure;
    catalogs_item_validation_warnings_local_var->link_format_warning = link_format_warning;
    catalogs_item_validation_warnings_local_var->min_ad_price_invalid = min_ad_price_invalid;
    catalogs_item_validation_warnings_local_var->mpn_invalid = mpn_invalid;
    catalogs_item_validation_warnings_local_var->multipack_invalid = multipack_invalid;
    catalogs_item_validation_warnings_local_var->optional_condition_invalid = optional_condition_invalid;
    catalogs_item_validation_warnings_local_var->optional_condition_missing = optional_condition_missing;
    catalogs_item_validation_warnings_local_var->optional_product_category_invalid = optional_product_category_invalid;
    catalogs_item_validation_warnings_local_var->optional_product_category_missing = optional_product_category_missing;
    catalogs_item_validation_warnings_local_var->product_category_depth_warning = product_category_depth_warning;
    catalogs_item_validation_warnings_local_var->product_type_length_too_long = product_type_length_too_long;
    catalogs_item_validation_warnings_local_var->sales_price_invalid = sales_price_invalid;
    catalogs_item_validation_warnings_local_var->sales_price_too_low = sales_price_too_low;
    catalogs_item_validation_warnings_local_var->sales_price_too_high = sales_price_too_high;
    catalogs_item_validation_warnings_local_var->sale_date_invalid = sale_date_invalid;
    catalogs_item_validation_warnings_local_var->shipping_invalid = shipping_invalid;
    catalogs_item_validation_warnings_local_var->shipping_height_invalid = shipping_height_invalid;
    catalogs_item_validation_warnings_local_var->shipping_weight_invalid = shipping_weight_invalid;
    catalogs_item_validation_warnings_local_var->shipping_width_invalid = shipping_width_invalid;
    catalogs_item_validation_warnings_local_var->size_type_invalid = size_type_invalid;
    catalogs_item_validation_warnings_local_var->tax_invalid = tax_invalid;
    catalogs_item_validation_warnings_local_var->title_length_too_long = title_length_too_long;
    catalogs_item_validation_warnings_local_var->too_many_additional_image_links = too_many_additional_image_links;
    catalogs_item_validation_warnings_local_var->utm_source_auto_corrected = utm_source_auto_corrected;
    catalogs_item_validation_warnings_local_var->weight_unit_invalid = weight_unit_invalid;

    return catalogs_item_validation_warnings_local_var;
}


void catalogs_item_validation_warnings_free(catalogs_item_validation_warnings_t *catalogs_item_validation_warnings) {
    if(NULL == catalogs_item_validation_warnings){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_item_validation_warnings->ad_link_format_warning) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->ad_link_format_warning);
        catalogs_item_validation_warnings->ad_link_format_warning = NULL;
    }
    if (catalogs_item_validation_warnings->ad_link_same_as_link) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->ad_link_same_as_link);
        catalogs_item_validation_warnings->ad_link_same_as_link = NULL;
    }
    if (catalogs_item_validation_warnings->additional_image_link_length_too_long) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->additional_image_link_length_too_long);
        catalogs_item_validation_warnings->additional_image_link_length_too_long = NULL;
    }
    if (catalogs_item_validation_warnings->additional_image_link_warning) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->additional_image_link_warning);
        catalogs_item_validation_warnings->additional_image_link_warning = NULL;
    }
    if (catalogs_item_validation_warnings->adwords_format_warning) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->adwords_format_warning);
        catalogs_item_validation_warnings->adwords_format_warning = NULL;
    }
    if (catalogs_item_validation_warnings->adwords_same_as_link) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->adwords_same_as_link);
        catalogs_item_validation_warnings->adwords_same_as_link = NULL;
    }
    if (catalogs_item_validation_warnings->age_group_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->age_group_invalid);
        catalogs_item_validation_warnings->age_group_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->size_system_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->size_system_invalid);
        catalogs_item_validation_warnings->size_system_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->android_deep_link_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->android_deep_link_invalid);
        catalogs_item_validation_warnings->android_deep_link_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->availability_date_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->availability_date_invalid);
        catalogs_item_validation_warnings->availability_date_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->country_does_not_map_to_currency) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->country_does_not_map_to_currency);
        catalogs_item_validation_warnings->country_does_not_map_to_currency = NULL;
    }
    if (catalogs_item_validation_warnings->custom_label_length_too_long) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->custom_label_length_too_long);
        catalogs_item_validation_warnings->custom_label_length_too_long = NULL;
    }
    if (catalogs_item_validation_warnings->description_length_too_long) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->description_length_too_long);
        catalogs_item_validation_warnings->description_length_too_long = NULL;
    }
    if (catalogs_item_validation_warnings->expiration_date_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->expiration_date_invalid);
        catalogs_item_validation_warnings->expiration_date_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->gender_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->gender_invalid);
        catalogs_item_validation_warnings->gender_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->gtin_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->gtin_invalid);
        catalogs_item_validation_warnings->gtin_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->image_link_warning) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->image_link_warning);
        catalogs_item_validation_warnings->image_link_warning = NULL;
    }
    if (catalogs_item_validation_warnings->ios_deep_link_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->ios_deep_link_invalid);
        catalogs_item_validation_warnings->ios_deep_link_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->is_bundle_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->is_bundle_invalid);
        catalogs_item_validation_warnings->is_bundle_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->item_additional_image_download_failure) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->item_additional_image_download_failure);
        catalogs_item_validation_warnings->item_additional_image_download_failure = NULL;
    }
    if (catalogs_item_validation_warnings->link_format_warning) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->link_format_warning);
        catalogs_item_validation_warnings->link_format_warning = NULL;
    }
    if (catalogs_item_validation_warnings->min_ad_price_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->min_ad_price_invalid);
        catalogs_item_validation_warnings->min_ad_price_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->mpn_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->mpn_invalid);
        catalogs_item_validation_warnings->mpn_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->multipack_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->multipack_invalid);
        catalogs_item_validation_warnings->multipack_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->optional_condition_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->optional_condition_invalid);
        catalogs_item_validation_warnings->optional_condition_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->optional_condition_missing) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->optional_condition_missing);
        catalogs_item_validation_warnings->optional_condition_missing = NULL;
    }
    if (catalogs_item_validation_warnings->optional_product_category_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->optional_product_category_invalid);
        catalogs_item_validation_warnings->optional_product_category_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->optional_product_category_missing) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->optional_product_category_missing);
        catalogs_item_validation_warnings->optional_product_category_missing = NULL;
    }
    if (catalogs_item_validation_warnings->product_category_depth_warning) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->product_category_depth_warning);
        catalogs_item_validation_warnings->product_category_depth_warning = NULL;
    }
    if (catalogs_item_validation_warnings->product_type_length_too_long) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->product_type_length_too_long);
        catalogs_item_validation_warnings->product_type_length_too_long = NULL;
    }
    if (catalogs_item_validation_warnings->sales_price_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->sales_price_invalid);
        catalogs_item_validation_warnings->sales_price_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->sales_price_too_low) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->sales_price_too_low);
        catalogs_item_validation_warnings->sales_price_too_low = NULL;
    }
    if (catalogs_item_validation_warnings->sales_price_too_high) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->sales_price_too_high);
        catalogs_item_validation_warnings->sales_price_too_high = NULL;
    }
    if (catalogs_item_validation_warnings->sale_date_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->sale_date_invalid);
        catalogs_item_validation_warnings->sale_date_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->shipping_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->shipping_invalid);
        catalogs_item_validation_warnings->shipping_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->shipping_height_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->shipping_height_invalid);
        catalogs_item_validation_warnings->shipping_height_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->shipping_weight_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->shipping_weight_invalid);
        catalogs_item_validation_warnings->shipping_weight_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->shipping_width_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->shipping_width_invalid);
        catalogs_item_validation_warnings->shipping_width_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->size_type_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->size_type_invalid);
        catalogs_item_validation_warnings->size_type_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->tax_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->tax_invalid);
        catalogs_item_validation_warnings->tax_invalid = NULL;
    }
    if (catalogs_item_validation_warnings->title_length_too_long) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->title_length_too_long);
        catalogs_item_validation_warnings->title_length_too_long = NULL;
    }
    if (catalogs_item_validation_warnings->too_many_additional_image_links) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->too_many_additional_image_links);
        catalogs_item_validation_warnings->too_many_additional_image_links = NULL;
    }
    if (catalogs_item_validation_warnings->utm_source_auto_corrected) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->utm_source_auto_corrected);
        catalogs_item_validation_warnings->utm_source_auto_corrected = NULL;
    }
    if (catalogs_item_validation_warnings->weight_unit_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_warnings->weight_unit_invalid);
        catalogs_item_validation_warnings->weight_unit_invalid = NULL;
    }
    free(catalogs_item_validation_warnings);
}

cJSON *catalogs_item_validation_warnings_convertToJSON(catalogs_item_validation_warnings_t *catalogs_item_validation_warnings) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_item_validation_warnings->ad_link_format_warning
    if(catalogs_item_validation_warnings->ad_link_format_warning) {
    cJSON *ad_link_format_warning_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->ad_link_format_warning);
    if(ad_link_format_warning_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AD_LINK_FORMAT_WARNING", ad_link_format_warning_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->ad_link_same_as_link
    if(catalogs_item_validation_warnings->ad_link_same_as_link) {
    cJSON *ad_link_same_as_link_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->ad_link_same_as_link);
    if(ad_link_same_as_link_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AD_LINK_SAME_AS_LINK", ad_link_same_as_link_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->additional_image_link_length_too_long
    if(catalogs_item_validation_warnings->additional_image_link_length_too_long) {
    cJSON *additional_image_link_length_too_long_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->additional_image_link_length_too_long);
    if(additional_image_link_length_too_long_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", additional_image_link_length_too_long_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->additional_image_link_warning
    if(catalogs_item_validation_warnings->additional_image_link_warning) {
    cJSON *additional_image_link_warning_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->additional_image_link_warning);
    if(additional_image_link_warning_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ADDITIONAL_IMAGE_LINK_WARNING", additional_image_link_warning_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->adwords_format_warning
    if(catalogs_item_validation_warnings->adwords_format_warning) {
    cJSON *adwords_format_warning_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->adwords_format_warning);
    if(adwords_format_warning_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ADWORDS_FORMAT_WARNING", adwords_format_warning_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->adwords_same_as_link
    if(catalogs_item_validation_warnings->adwords_same_as_link) {
    cJSON *adwords_same_as_link_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->adwords_same_as_link);
    if(adwords_same_as_link_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ADWORDS_SAME_AS_LINK", adwords_same_as_link_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->age_group_invalid
    if(catalogs_item_validation_warnings->age_group_invalid) {
    cJSON *age_group_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->age_group_invalid);
    if(age_group_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AGE_GROUP_INVALID", age_group_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->size_system_invalid
    if(catalogs_item_validation_warnings->size_system_invalid) {
    cJSON *size_system_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->size_system_invalid);
    if(size_system_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SIZE_SYSTEM_INVALID", size_system_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->android_deep_link_invalid
    if(catalogs_item_validation_warnings->android_deep_link_invalid) {
    cJSON *android_deep_link_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->android_deep_link_invalid);
    if(android_deep_link_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ANDROID_DEEP_LINK_INVALID", android_deep_link_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->availability_date_invalid
    if(catalogs_item_validation_warnings->availability_date_invalid) {
    cJSON *availability_date_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->availability_date_invalid);
    if(availability_date_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AVAILABILITY_DATE_INVALID", availability_date_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->country_does_not_map_to_currency
    if(catalogs_item_validation_warnings->country_does_not_map_to_currency) {
    cJSON *country_does_not_map_to_currency_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->country_does_not_map_to_currency);
    if(country_does_not_map_to_currency_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", country_does_not_map_to_currency_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->custom_label_length_too_long
    if(catalogs_item_validation_warnings->custom_label_length_too_long) {
    cJSON *custom_label_length_too_long_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->custom_label_length_too_long);
    if(custom_label_length_too_long_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_LENGTH_TOO_LONG", custom_label_length_too_long_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->description_length_too_long
    if(catalogs_item_validation_warnings->description_length_too_long) {
    cJSON *description_length_too_long_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->description_length_too_long);
    if(description_length_too_long_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "DESCRIPTION_LENGTH_TOO_LONG", description_length_too_long_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->expiration_date_invalid
    if(catalogs_item_validation_warnings->expiration_date_invalid) {
    cJSON *expiration_date_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->expiration_date_invalid);
    if(expiration_date_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "EXPIRATION_DATE_INVALID", expiration_date_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->gender_invalid
    if(catalogs_item_validation_warnings->gender_invalid) {
    cJSON *gender_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->gender_invalid);
    if(gender_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GENDER_INVALID", gender_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->gtin_invalid
    if(catalogs_item_validation_warnings->gtin_invalid) {
    cJSON *gtin_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->gtin_invalid);
    if(gtin_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GTIN_INVALID", gtin_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->image_link_warning
    if(catalogs_item_validation_warnings->image_link_warning) {
    cJSON *image_link_warning_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->image_link_warning);
    if(image_link_warning_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "IMAGE_LINK_WARNING", image_link_warning_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->ios_deep_link_invalid
    if(catalogs_item_validation_warnings->ios_deep_link_invalid) {
    cJSON *ios_deep_link_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->ios_deep_link_invalid);
    if(ios_deep_link_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "IOS_DEEP_LINK_INVALID", ios_deep_link_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->is_bundle_invalid
    if(catalogs_item_validation_warnings->is_bundle_invalid) {
    cJSON *is_bundle_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->is_bundle_invalid);
    if(is_bundle_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "IS_BUNDLE_INVALID", is_bundle_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->item_additional_image_download_failure
    if(catalogs_item_validation_warnings->item_additional_image_download_failure) {
    cJSON *item_additional_image_download_failure_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->item_additional_image_download_failure);
    if(item_additional_image_download_failure_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", item_additional_image_download_failure_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->link_format_warning
    if(catalogs_item_validation_warnings->link_format_warning) {
    cJSON *link_format_warning_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->link_format_warning);
    if(link_format_warning_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "LINK_FORMAT_WARNING", link_format_warning_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->min_ad_price_invalid
    if(catalogs_item_validation_warnings->min_ad_price_invalid) {
    cJSON *min_ad_price_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->min_ad_price_invalid);
    if(min_ad_price_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MIN_AD_PRICE_INVALID", min_ad_price_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->mpn_invalid
    if(catalogs_item_validation_warnings->mpn_invalid) {
    cJSON *mpn_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->mpn_invalid);
    if(mpn_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MPN_INVALID", mpn_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->multipack_invalid
    if(catalogs_item_validation_warnings->multipack_invalid) {
    cJSON *multipack_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->multipack_invalid);
    if(multipack_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MULTIPACK_INVALID", multipack_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->optional_condition_invalid
    if(catalogs_item_validation_warnings->optional_condition_invalid) {
    cJSON *optional_condition_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->optional_condition_invalid);
    if(optional_condition_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "OPTIONAL_CONDITION_INVALID", optional_condition_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->optional_condition_missing
    if(catalogs_item_validation_warnings->optional_condition_missing) {
    cJSON *optional_condition_missing_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->optional_condition_missing);
    if(optional_condition_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "OPTIONAL_CONDITION_MISSING", optional_condition_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->optional_product_category_invalid
    if(catalogs_item_validation_warnings->optional_product_category_invalid) {
    cJSON *optional_product_category_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->optional_product_category_invalid);
    if(optional_product_category_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "OPTIONAL_PRODUCT_CATEGORY_INVALID", optional_product_category_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->optional_product_category_missing
    if(catalogs_item_validation_warnings->optional_product_category_missing) {
    cJSON *optional_product_category_missing_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->optional_product_category_missing);
    if(optional_product_category_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "OPTIONAL_PRODUCT_CATEGORY_MISSING", optional_product_category_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->product_category_depth_warning
    if(catalogs_item_validation_warnings->product_category_depth_warning) {
    cJSON *product_category_depth_warning_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->product_category_depth_warning);
    if(product_category_depth_warning_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_CATEGORY_DEPTH_WARNING", product_category_depth_warning_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->product_type_length_too_long
    if(catalogs_item_validation_warnings->product_type_length_too_long) {
    cJSON *product_type_length_too_long_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->product_type_length_too_long);
    if(product_type_length_too_long_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_TYPE_LENGTH_TOO_LONG", product_type_length_too_long_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->sales_price_invalid
    if(catalogs_item_validation_warnings->sales_price_invalid) {
    cJSON *sales_price_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->sales_price_invalid);
    if(sales_price_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SALES_PRICE_INVALID", sales_price_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->sales_price_too_low
    if(catalogs_item_validation_warnings->sales_price_too_low) {
    cJSON *sales_price_too_low_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->sales_price_too_low);
    if(sales_price_too_low_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SALES_PRICE_TOO_LOW", sales_price_too_low_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->sales_price_too_high
    if(catalogs_item_validation_warnings->sales_price_too_high) {
    cJSON *sales_price_too_high_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->sales_price_too_high);
    if(sales_price_too_high_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SALES_PRICE_TOO_HIGH", sales_price_too_high_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->sale_date_invalid
    if(catalogs_item_validation_warnings->sale_date_invalid) {
    cJSON *sale_date_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->sale_date_invalid);
    if(sale_date_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SALE_DATE_INVALID", sale_date_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->shipping_invalid
    if(catalogs_item_validation_warnings->shipping_invalid) {
    cJSON *shipping_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->shipping_invalid);
    if(shipping_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SHIPPING_INVALID", shipping_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->shipping_height_invalid
    if(catalogs_item_validation_warnings->shipping_height_invalid) {
    cJSON *shipping_height_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->shipping_height_invalid);
    if(shipping_height_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SHIPPING_HEIGHT_INVALID", shipping_height_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->shipping_weight_invalid
    if(catalogs_item_validation_warnings->shipping_weight_invalid) {
    cJSON *shipping_weight_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->shipping_weight_invalid);
    if(shipping_weight_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SHIPPING_WEIGHT_INVALID", shipping_weight_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->shipping_width_invalid
    if(catalogs_item_validation_warnings->shipping_width_invalid) {
    cJSON *shipping_width_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->shipping_width_invalid);
    if(shipping_width_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SHIPPING_WIDTH_INVALID", shipping_width_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->size_type_invalid
    if(catalogs_item_validation_warnings->size_type_invalid) {
    cJSON *size_type_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->size_type_invalid);
    if(size_type_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "SIZE_TYPE_INVALID", size_type_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->tax_invalid
    if(catalogs_item_validation_warnings->tax_invalid) {
    cJSON *tax_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->tax_invalid);
    if(tax_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "TAX_INVALID", tax_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->title_length_too_long
    if(catalogs_item_validation_warnings->title_length_too_long) {
    cJSON *title_length_too_long_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->title_length_too_long);
    if(title_length_too_long_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "TITLE_LENGTH_TOO_LONG", title_length_too_long_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->too_many_additional_image_links
    if(catalogs_item_validation_warnings->too_many_additional_image_links) {
    cJSON *too_many_additional_image_links_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->too_many_additional_image_links);
    if(too_many_additional_image_links_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "TOO_MANY_ADDITIONAL_IMAGE_LINKS", too_many_additional_image_links_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->utm_source_auto_corrected
    if(catalogs_item_validation_warnings->utm_source_auto_corrected) {
    cJSON *utm_source_auto_corrected_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->utm_source_auto_corrected);
    if(utm_source_auto_corrected_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "UTM_SOURCE_AUTO_CORRECTED", utm_source_auto_corrected_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_warnings->weight_unit_invalid
    if(catalogs_item_validation_warnings->weight_unit_invalid) {
    cJSON *weight_unit_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_warnings->weight_unit_invalid);
    if(weight_unit_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "WEIGHT_UNIT_INVALID", weight_unit_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_item_validation_warnings_t *catalogs_item_validation_warnings_parseFromJSON(cJSON *catalogs_item_validation_warningsJSON){

    catalogs_item_validation_warnings_t *catalogs_item_validation_warnings_local_var = NULL;

    // define the local variable for catalogs_item_validation_warnings->ad_link_format_warning
    catalogs_item_validation_details_t *ad_link_format_warning_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->ad_link_same_as_link
    catalogs_item_validation_details_t *ad_link_same_as_link_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->additional_image_link_length_too_long
    catalogs_item_validation_details_t *additional_image_link_length_too_long_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->additional_image_link_warning
    catalogs_item_validation_details_t *additional_image_link_warning_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->adwords_format_warning
    catalogs_item_validation_details_t *adwords_format_warning_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->adwords_same_as_link
    catalogs_item_validation_details_t *adwords_same_as_link_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->age_group_invalid
    catalogs_item_validation_details_t *age_group_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->size_system_invalid
    catalogs_item_validation_details_t *size_system_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->android_deep_link_invalid
    catalogs_item_validation_details_t *android_deep_link_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->availability_date_invalid
    catalogs_item_validation_details_t *availability_date_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->country_does_not_map_to_currency
    catalogs_item_validation_details_t *country_does_not_map_to_currency_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->custom_label_length_too_long
    catalogs_item_validation_details_t *custom_label_length_too_long_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->description_length_too_long
    catalogs_item_validation_details_t *description_length_too_long_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->expiration_date_invalid
    catalogs_item_validation_details_t *expiration_date_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->gender_invalid
    catalogs_item_validation_details_t *gender_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->gtin_invalid
    catalogs_item_validation_details_t *gtin_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->image_link_warning
    catalogs_item_validation_details_t *image_link_warning_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->ios_deep_link_invalid
    catalogs_item_validation_details_t *ios_deep_link_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->is_bundle_invalid
    catalogs_item_validation_details_t *is_bundle_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->item_additional_image_download_failure
    catalogs_item_validation_details_t *item_additional_image_download_failure_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->link_format_warning
    catalogs_item_validation_details_t *link_format_warning_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->min_ad_price_invalid
    catalogs_item_validation_details_t *min_ad_price_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->mpn_invalid
    catalogs_item_validation_details_t *mpn_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->multipack_invalid
    catalogs_item_validation_details_t *multipack_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->optional_condition_invalid
    catalogs_item_validation_details_t *optional_condition_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->optional_condition_missing
    catalogs_item_validation_details_t *optional_condition_missing_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->optional_product_category_invalid
    catalogs_item_validation_details_t *optional_product_category_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->optional_product_category_missing
    catalogs_item_validation_details_t *optional_product_category_missing_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->product_category_depth_warning
    catalogs_item_validation_details_t *product_category_depth_warning_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->product_type_length_too_long
    catalogs_item_validation_details_t *product_type_length_too_long_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->sales_price_invalid
    catalogs_item_validation_details_t *sales_price_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->sales_price_too_low
    catalogs_item_validation_details_t *sales_price_too_low_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->sales_price_too_high
    catalogs_item_validation_details_t *sales_price_too_high_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->sale_date_invalid
    catalogs_item_validation_details_t *sale_date_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->shipping_invalid
    catalogs_item_validation_details_t *shipping_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->shipping_height_invalid
    catalogs_item_validation_details_t *shipping_height_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->shipping_weight_invalid
    catalogs_item_validation_details_t *shipping_weight_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->shipping_width_invalid
    catalogs_item_validation_details_t *shipping_width_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->size_type_invalid
    catalogs_item_validation_details_t *size_type_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->tax_invalid
    catalogs_item_validation_details_t *tax_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->title_length_too_long
    catalogs_item_validation_details_t *title_length_too_long_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->too_many_additional_image_links
    catalogs_item_validation_details_t *too_many_additional_image_links_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->utm_source_auto_corrected
    catalogs_item_validation_details_t *utm_source_auto_corrected_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_warnings->weight_unit_invalid
    catalogs_item_validation_details_t *weight_unit_invalid_local_nonprim = NULL;

    // catalogs_item_validation_warnings->ad_link_format_warning
    cJSON *ad_link_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "AD_LINK_FORMAT_WARNING");
    if (ad_link_format_warning) { 
    ad_link_format_warning_local_nonprim = catalogs_item_validation_details_parseFromJSON(ad_link_format_warning); //nonprimitive
    }

    // catalogs_item_validation_warnings->ad_link_same_as_link
    cJSON *ad_link_same_as_link = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "AD_LINK_SAME_AS_LINK");
    if (ad_link_same_as_link) { 
    ad_link_same_as_link_local_nonprim = catalogs_item_validation_details_parseFromJSON(ad_link_same_as_link); //nonprimitive
    }

    // catalogs_item_validation_warnings->additional_image_link_length_too_long
    cJSON *additional_image_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG");
    if (additional_image_link_length_too_long) { 
    additional_image_link_length_too_long_local_nonprim = catalogs_item_validation_details_parseFromJSON(additional_image_link_length_too_long); //nonprimitive
    }

    // catalogs_item_validation_warnings->additional_image_link_warning
    cJSON *additional_image_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "ADDITIONAL_IMAGE_LINK_WARNING");
    if (additional_image_link_warning) { 
    additional_image_link_warning_local_nonprim = catalogs_item_validation_details_parseFromJSON(additional_image_link_warning); //nonprimitive
    }

    // catalogs_item_validation_warnings->adwords_format_warning
    cJSON *adwords_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "ADWORDS_FORMAT_WARNING");
    if (adwords_format_warning) { 
    adwords_format_warning_local_nonprim = catalogs_item_validation_details_parseFromJSON(adwords_format_warning); //nonprimitive
    }

    // catalogs_item_validation_warnings->adwords_same_as_link
    cJSON *adwords_same_as_link = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "ADWORDS_SAME_AS_LINK");
    if (adwords_same_as_link) { 
    adwords_same_as_link_local_nonprim = catalogs_item_validation_details_parseFromJSON(adwords_same_as_link); //nonprimitive
    }

    // catalogs_item_validation_warnings->age_group_invalid
    cJSON *age_group_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "AGE_GROUP_INVALID");
    if (age_group_invalid) { 
    age_group_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(age_group_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->size_system_invalid
    cJSON *size_system_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SIZE_SYSTEM_INVALID");
    if (size_system_invalid) { 
    size_system_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(size_system_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->android_deep_link_invalid
    cJSON *android_deep_link_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "ANDROID_DEEP_LINK_INVALID");
    if (android_deep_link_invalid) { 
    android_deep_link_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(android_deep_link_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->availability_date_invalid
    cJSON *availability_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "AVAILABILITY_DATE_INVALID");
    if (availability_date_invalid) { 
    availability_date_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(availability_date_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->country_does_not_map_to_currency
    cJSON *country_does_not_map_to_currency = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "COUNTRY_DOES_NOT_MAP_TO_CURRENCY");
    if (country_does_not_map_to_currency) { 
    country_does_not_map_to_currency_local_nonprim = catalogs_item_validation_details_parseFromJSON(country_does_not_map_to_currency); //nonprimitive
    }

    // catalogs_item_validation_warnings->custom_label_length_too_long
    cJSON *custom_label_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "CUSTOM_LABEL_LENGTH_TOO_LONG");
    if (custom_label_length_too_long) { 
    custom_label_length_too_long_local_nonprim = catalogs_item_validation_details_parseFromJSON(custom_label_length_too_long); //nonprimitive
    }

    // catalogs_item_validation_warnings->description_length_too_long
    cJSON *description_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "DESCRIPTION_LENGTH_TOO_LONG");
    if (description_length_too_long) { 
    description_length_too_long_local_nonprim = catalogs_item_validation_details_parseFromJSON(description_length_too_long); //nonprimitive
    }

    // catalogs_item_validation_warnings->expiration_date_invalid
    cJSON *expiration_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "EXPIRATION_DATE_INVALID");
    if (expiration_date_invalid) { 
    expiration_date_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(expiration_date_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->gender_invalid
    cJSON *gender_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "GENDER_INVALID");
    if (gender_invalid) { 
    gender_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(gender_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->gtin_invalid
    cJSON *gtin_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "GTIN_INVALID");
    if (gtin_invalid) { 
    gtin_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(gtin_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->image_link_warning
    cJSON *image_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "IMAGE_LINK_WARNING");
    if (image_link_warning) { 
    image_link_warning_local_nonprim = catalogs_item_validation_details_parseFromJSON(image_link_warning); //nonprimitive
    }

    // catalogs_item_validation_warnings->ios_deep_link_invalid
    cJSON *ios_deep_link_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "IOS_DEEP_LINK_INVALID");
    if (ios_deep_link_invalid) { 
    ios_deep_link_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(ios_deep_link_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->is_bundle_invalid
    cJSON *is_bundle_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "IS_BUNDLE_INVALID");
    if (is_bundle_invalid) { 
    is_bundle_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(is_bundle_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->item_additional_image_download_failure
    cJSON *item_additional_image_download_failure = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE");
    if (item_additional_image_download_failure) { 
    item_additional_image_download_failure_local_nonprim = catalogs_item_validation_details_parseFromJSON(item_additional_image_download_failure); //nonprimitive
    }

    // catalogs_item_validation_warnings->link_format_warning
    cJSON *link_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "LINK_FORMAT_WARNING");
    if (link_format_warning) { 
    link_format_warning_local_nonprim = catalogs_item_validation_details_parseFromJSON(link_format_warning); //nonprimitive
    }

    // catalogs_item_validation_warnings->min_ad_price_invalid
    cJSON *min_ad_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "MIN_AD_PRICE_INVALID");
    if (min_ad_price_invalid) { 
    min_ad_price_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(min_ad_price_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->mpn_invalid
    cJSON *mpn_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "MPN_INVALID");
    if (mpn_invalid) { 
    mpn_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(mpn_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->multipack_invalid
    cJSON *multipack_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "MULTIPACK_INVALID");
    if (multipack_invalid) { 
    multipack_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(multipack_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->optional_condition_invalid
    cJSON *optional_condition_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "OPTIONAL_CONDITION_INVALID");
    if (optional_condition_invalid) { 
    optional_condition_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(optional_condition_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->optional_condition_missing
    cJSON *optional_condition_missing = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "OPTIONAL_CONDITION_MISSING");
    if (optional_condition_missing) { 
    optional_condition_missing_local_nonprim = catalogs_item_validation_details_parseFromJSON(optional_condition_missing); //nonprimitive
    }

    // catalogs_item_validation_warnings->optional_product_category_invalid
    cJSON *optional_product_category_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "OPTIONAL_PRODUCT_CATEGORY_INVALID");
    if (optional_product_category_invalid) { 
    optional_product_category_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(optional_product_category_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->optional_product_category_missing
    cJSON *optional_product_category_missing = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "OPTIONAL_PRODUCT_CATEGORY_MISSING");
    if (optional_product_category_missing) { 
    optional_product_category_missing_local_nonprim = catalogs_item_validation_details_parseFromJSON(optional_product_category_missing); //nonprimitive
    }

    // catalogs_item_validation_warnings->product_category_depth_warning
    cJSON *product_category_depth_warning = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "PRODUCT_CATEGORY_DEPTH_WARNING");
    if (product_category_depth_warning) { 
    product_category_depth_warning_local_nonprim = catalogs_item_validation_details_parseFromJSON(product_category_depth_warning); //nonprimitive
    }

    // catalogs_item_validation_warnings->product_type_length_too_long
    cJSON *product_type_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "PRODUCT_TYPE_LENGTH_TOO_LONG");
    if (product_type_length_too_long) { 
    product_type_length_too_long_local_nonprim = catalogs_item_validation_details_parseFromJSON(product_type_length_too_long); //nonprimitive
    }

    // catalogs_item_validation_warnings->sales_price_invalid
    cJSON *sales_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SALES_PRICE_INVALID");
    if (sales_price_invalid) { 
    sales_price_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(sales_price_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->sales_price_too_low
    cJSON *sales_price_too_low = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SALES_PRICE_TOO_LOW");
    if (sales_price_too_low) { 
    sales_price_too_low_local_nonprim = catalogs_item_validation_details_parseFromJSON(sales_price_too_low); //nonprimitive
    }

    // catalogs_item_validation_warnings->sales_price_too_high
    cJSON *sales_price_too_high = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SALES_PRICE_TOO_HIGH");
    if (sales_price_too_high) { 
    sales_price_too_high_local_nonprim = catalogs_item_validation_details_parseFromJSON(sales_price_too_high); //nonprimitive
    }

    // catalogs_item_validation_warnings->sale_date_invalid
    cJSON *sale_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SALE_DATE_INVALID");
    if (sale_date_invalid) { 
    sale_date_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(sale_date_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->shipping_invalid
    cJSON *shipping_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SHIPPING_INVALID");
    if (shipping_invalid) { 
    shipping_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(shipping_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->shipping_height_invalid
    cJSON *shipping_height_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SHIPPING_HEIGHT_INVALID");
    if (shipping_height_invalid) { 
    shipping_height_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(shipping_height_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->shipping_weight_invalid
    cJSON *shipping_weight_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SHIPPING_WEIGHT_INVALID");
    if (shipping_weight_invalid) { 
    shipping_weight_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(shipping_weight_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->shipping_width_invalid
    cJSON *shipping_width_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SHIPPING_WIDTH_INVALID");
    if (shipping_width_invalid) { 
    shipping_width_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(shipping_width_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->size_type_invalid
    cJSON *size_type_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "SIZE_TYPE_INVALID");
    if (size_type_invalid) { 
    size_type_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(size_type_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->tax_invalid
    cJSON *tax_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "TAX_INVALID");
    if (tax_invalid) { 
    tax_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(tax_invalid); //nonprimitive
    }

    // catalogs_item_validation_warnings->title_length_too_long
    cJSON *title_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "TITLE_LENGTH_TOO_LONG");
    if (title_length_too_long) { 
    title_length_too_long_local_nonprim = catalogs_item_validation_details_parseFromJSON(title_length_too_long); //nonprimitive
    }

    // catalogs_item_validation_warnings->too_many_additional_image_links
    cJSON *too_many_additional_image_links = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "TOO_MANY_ADDITIONAL_IMAGE_LINKS");
    if (too_many_additional_image_links) { 
    too_many_additional_image_links_local_nonprim = catalogs_item_validation_details_parseFromJSON(too_many_additional_image_links); //nonprimitive
    }

    // catalogs_item_validation_warnings->utm_source_auto_corrected
    cJSON *utm_source_auto_corrected = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "UTM_SOURCE_AUTO_CORRECTED");
    if (utm_source_auto_corrected) { 
    utm_source_auto_corrected_local_nonprim = catalogs_item_validation_details_parseFromJSON(utm_source_auto_corrected); //nonprimitive
    }

    // catalogs_item_validation_warnings->weight_unit_invalid
    cJSON *weight_unit_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_warningsJSON, "WEIGHT_UNIT_INVALID");
    if (weight_unit_invalid) { 
    weight_unit_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(weight_unit_invalid); //nonprimitive
    }


    catalogs_item_validation_warnings_local_var = catalogs_item_validation_warnings_create (
        ad_link_format_warning ? ad_link_format_warning_local_nonprim : NULL,
        ad_link_same_as_link ? ad_link_same_as_link_local_nonprim : NULL,
        additional_image_link_length_too_long ? additional_image_link_length_too_long_local_nonprim : NULL,
        additional_image_link_warning ? additional_image_link_warning_local_nonprim : NULL,
        adwords_format_warning ? adwords_format_warning_local_nonprim : NULL,
        adwords_same_as_link ? adwords_same_as_link_local_nonprim : NULL,
        age_group_invalid ? age_group_invalid_local_nonprim : NULL,
        size_system_invalid ? size_system_invalid_local_nonprim : NULL,
        android_deep_link_invalid ? android_deep_link_invalid_local_nonprim : NULL,
        availability_date_invalid ? availability_date_invalid_local_nonprim : NULL,
        country_does_not_map_to_currency ? country_does_not_map_to_currency_local_nonprim : NULL,
        custom_label_length_too_long ? custom_label_length_too_long_local_nonprim : NULL,
        description_length_too_long ? description_length_too_long_local_nonprim : NULL,
        expiration_date_invalid ? expiration_date_invalid_local_nonprim : NULL,
        gender_invalid ? gender_invalid_local_nonprim : NULL,
        gtin_invalid ? gtin_invalid_local_nonprim : NULL,
        image_link_warning ? image_link_warning_local_nonprim : NULL,
        ios_deep_link_invalid ? ios_deep_link_invalid_local_nonprim : NULL,
        is_bundle_invalid ? is_bundle_invalid_local_nonprim : NULL,
        item_additional_image_download_failure ? item_additional_image_download_failure_local_nonprim : NULL,
        link_format_warning ? link_format_warning_local_nonprim : NULL,
        min_ad_price_invalid ? min_ad_price_invalid_local_nonprim : NULL,
        mpn_invalid ? mpn_invalid_local_nonprim : NULL,
        multipack_invalid ? multipack_invalid_local_nonprim : NULL,
        optional_condition_invalid ? optional_condition_invalid_local_nonprim : NULL,
        optional_condition_missing ? optional_condition_missing_local_nonprim : NULL,
        optional_product_category_invalid ? optional_product_category_invalid_local_nonprim : NULL,
        optional_product_category_missing ? optional_product_category_missing_local_nonprim : NULL,
        product_category_depth_warning ? product_category_depth_warning_local_nonprim : NULL,
        product_type_length_too_long ? product_type_length_too_long_local_nonprim : NULL,
        sales_price_invalid ? sales_price_invalid_local_nonprim : NULL,
        sales_price_too_low ? sales_price_too_low_local_nonprim : NULL,
        sales_price_too_high ? sales_price_too_high_local_nonprim : NULL,
        sale_date_invalid ? sale_date_invalid_local_nonprim : NULL,
        shipping_invalid ? shipping_invalid_local_nonprim : NULL,
        shipping_height_invalid ? shipping_height_invalid_local_nonprim : NULL,
        shipping_weight_invalid ? shipping_weight_invalid_local_nonprim : NULL,
        shipping_width_invalid ? shipping_width_invalid_local_nonprim : NULL,
        size_type_invalid ? size_type_invalid_local_nonprim : NULL,
        tax_invalid ? tax_invalid_local_nonprim : NULL,
        title_length_too_long ? title_length_too_long_local_nonprim : NULL,
        too_many_additional_image_links ? too_many_additional_image_links_local_nonprim : NULL,
        utm_source_auto_corrected ? utm_source_auto_corrected_local_nonprim : NULL,
        weight_unit_invalid ? weight_unit_invalid_local_nonprim : NULL
        );

    return catalogs_item_validation_warnings_local_var;
end:
    if (ad_link_format_warning_local_nonprim) {
        catalogs_item_validation_details_free(ad_link_format_warning_local_nonprim);
        ad_link_format_warning_local_nonprim = NULL;
    }
    if (ad_link_same_as_link_local_nonprim) {
        catalogs_item_validation_details_free(ad_link_same_as_link_local_nonprim);
        ad_link_same_as_link_local_nonprim = NULL;
    }
    if (additional_image_link_length_too_long_local_nonprim) {
        catalogs_item_validation_details_free(additional_image_link_length_too_long_local_nonprim);
        additional_image_link_length_too_long_local_nonprim = NULL;
    }
    if (additional_image_link_warning_local_nonprim) {
        catalogs_item_validation_details_free(additional_image_link_warning_local_nonprim);
        additional_image_link_warning_local_nonprim = NULL;
    }
    if (adwords_format_warning_local_nonprim) {
        catalogs_item_validation_details_free(adwords_format_warning_local_nonprim);
        adwords_format_warning_local_nonprim = NULL;
    }
    if (adwords_same_as_link_local_nonprim) {
        catalogs_item_validation_details_free(adwords_same_as_link_local_nonprim);
        adwords_same_as_link_local_nonprim = NULL;
    }
    if (age_group_invalid_local_nonprim) {
        catalogs_item_validation_details_free(age_group_invalid_local_nonprim);
        age_group_invalid_local_nonprim = NULL;
    }
    if (size_system_invalid_local_nonprim) {
        catalogs_item_validation_details_free(size_system_invalid_local_nonprim);
        size_system_invalid_local_nonprim = NULL;
    }
    if (android_deep_link_invalid_local_nonprim) {
        catalogs_item_validation_details_free(android_deep_link_invalid_local_nonprim);
        android_deep_link_invalid_local_nonprim = NULL;
    }
    if (availability_date_invalid_local_nonprim) {
        catalogs_item_validation_details_free(availability_date_invalid_local_nonprim);
        availability_date_invalid_local_nonprim = NULL;
    }
    if (country_does_not_map_to_currency_local_nonprim) {
        catalogs_item_validation_details_free(country_does_not_map_to_currency_local_nonprim);
        country_does_not_map_to_currency_local_nonprim = NULL;
    }
    if (custom_label_length_too_long_local_nonprim) {
        catalogs_item_validation_details_free(custom_label_length_too_long_local_nonprim);
        custom_label_length_too_long_local_nonprim = NULL;
    }
    if (description_length_too_long_local_nonprim) {
        catalogs_item_validation_details_free(description_length_too_long_local_nonprim);
        description_length_too_long_local_nonprim = NULL;
    }
    if (expiration_date_invalid_local_nonprim) {
        catalogs_item_validation_details_free(expiration_date_invalid_local_nonprim);
        expiration_date_invalid_local_nonprim = NULL;
    }
    if (gender_invalid_local_nonprim) {
        catalogs_item_validation_details_free(gender_invalid_local_nonprim);
        gender_invalid_local_nonprim = NULL;
    }
    if (gtin_invalid_local_nonprim) {
        catalogs_item_validation_details_free(gtin_invalid_local_nonprim);
        gtin_invalid_local_nonprim = NULL;
    }
    if (image_link_warning_local_nonprim) {
        catalogs_item_validation_details_free(image_link_warning_local_nonprim);
        image_link_warning_local_nonprim = NULL;
    }
    if (ios_deep_link_invalid_local_nonprim) {
        catalogs_item_validation_details_free(ios_deep_link_invalid_local_nonprim);
        ios_deep_link_invalid_local_nonprim = NULL;
    }
    if (is_bundle_invalid_local_nonprim) {
        catalogs_item_validation_details_free(is_bundle_invalid_local_nonprim);
        is_bundle_invalid_local_nonprim = NULL;
    }
    if (item_additional_image_download_failure_local_nonprim) {
        catalogs_item_validation_details_free(item_additional_image_download_failure_local_nonprim);
        item_additional_image_download_failure_local_nonprim = NULL;
    }
    if (link_format_warning_local_nonprim) {
        catalogs_item_validation_details_free(link_format_warning_local_nonprim);
        link_format_warning_local_nonprim = NULL;
    }
    if (min_ad_price_invalid_local_nonprim) {
        catalogs_item_validation_details_free(min_ad_price_invalid_local_nonprim);
        min_ad_price_invalid_local_nonprim = NULL;
    }
    if (mpn_invalid_local_nonprim) {
        catalogs_item_validation_details_free(mpn_invalid_local_nonprim);
        mpn_invalid_local_nonprim = NULL;
    }
    if (multipack_invalid_local_nonprim) {
        catalogs_item_validation_details_free(multipack_invalid_local_nonprim);
        multipack_invalid_local_nonprim = NULL;
    }
    if (optional_condition_invalid_local_nonprim) {
        catalogs_item_validation_details_free(optional_condition_invalid_local_nonprim);
        optional_condition_invalid_local_nonprim = NULL;
    }
    if (optional_condition_missing_local_nonprim) {
        catalogs_item_validation_details_free(optional_condition_missing_local_nonprim);
        optional_condition_missing_local_nonprim = NULL;
    }
    if (optional_product_category_invalid_local_nonprim) {
        catalogs_item_validation_details_free(optional_product_category_invalid_local_nonprim);
        optional_product_category_invalid_local_nonprim = NULL;
    }
    if (optional_product_category_missing_local_nonprim) {
        catalogs_item_validation_details_free(optional_product_category_missing_local_nonprim);
        optional_product_category_missing_local_nonprim = NULL;
    }
    if (product_category_depth_warning_local_nonprim) {
        catalogs_item_validation_details_free(product_category_depth_warning_local_nonprim);
        product_category_depth_warning_local_nonprim = NULL;
    }
    if (product_type_length_too_long_local_nonprim) {
        catalogs_item_validation_details_free(product_type_length_too_long_local_nonprim);
        product_type_length_too_long_local_nonprim = NULL;
    }
    if (sales_price_invalid_local_nonprim) {
        catalogs_item_validation_details_free(sales_price_invalid_local_nonprim);
        sales_price_invalid_local_nonprim = NULL;
    }
    if (sales_price_too_low_local_nonprim) {
        catalogs_item_validation_details_free(sales_price_too_low_local_nonprim);
        sales_price_too_low_local_nonprim = NULL;
    }
    if (sales_price_too_high_local_nonprim) {
        catalogs_item_validation_details_free(sales_price_too_high_local_nonprim);
        sales_price_too_high_local_nonprim = NULL;
    }
    if (sale_date_invalid_local_nonprim) {
        catalogs_item_validation_details_free(sale_date_invalid_local_nonprim);
        sale_date_invalid_local_nonprim = NULL;
    }
    if (shipping_invalid_local_nonprim) {
        catalogs_item_validation_details_free(shipping_invalid_local_nonprim);
        shipping_invalid_local_nonprim = NULL;
    }
    if (shipping_height_invalid_local_nonprim) {
        catalogs_item_validation_details_free(shipping_height_invalid_local_nonprim);
        shipping_height_invalid_local_nonprim = NULL;
    }
    if (shipping_weight_invalid_local_nonprim) {
        catalogs_item_validation_details_free(shipping_weight_invalid_local_nonprim);
        shipping_weight_invalid_local_nonprim = NULL;
    }
    if (shipping_width_invalid_local_nonprim) {
        catalogs_item_validation_details_free(shipping_width_invalid_local_nonprim);
        shipping_width_invalid_local_nonprim = NULL;
    }
    if (size_type_invalid_local_nonprim) {
        catalogs_item_validation_details_free(size_type_invalid_local_nonprim);
        size_type_invalid_local_nonprim = NULL;
    }
    if (tax_invalid_local_nonprim) {
        catalogs_item_validation_details_free(tax_invalid_local_nonprim);
        tax_invalid_local_nonprim = NULL;
    }
    if (title_length_too_long_local_nonprim) {
        catalogs_item_validation_details_free(title_length_too_long_local_nonprim);
        title_length_too_long_local_nonprim = NULL;
    }
    if (too_many_additional_image_links_local_nonprim) {
        catalogs_item_validation_details_free(too_many_additional_image_links_local_nonprim);
        too_many_additional_image_links_local_nonprim = NULL;
    }
    if (utm_source_auto_corrected_local_nonprim) {
        catalogs_item_validation_details_free(utm_source_auto_corrected_local_nonprim);
        utm_source_auto_corrected_local_nonprim = NULL;
    }
    if (weight_unit_invalid_local_nonprim) {
        catalogs_item_validation_details_free(weight_unit_invalid_local_nonprim);
        weight_unit_invalid_local_nonprim = NULL;
    }
    return NULL;

}
