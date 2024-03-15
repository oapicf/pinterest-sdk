/*
 * catalogs_feed_validation_warnings.h
 *
 * 
 */

#ifndef _catalogs_feed_validation_warnings_H_
#define _catalogs_feed_validation_warnings_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_validation_warnings_t catalogs_feed_validation_warnings_t;


// Enum FETCHSAMESIGNATURE for catalogs_feed_validation_warnings

typedef enum  { pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_NULL = 0, pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE__1 } pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_e;

char* catalogs_feed_validation_warnings_fetch_same_signature_ToString(pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_e fetch_same_signature);

pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_e catalogs_feed_validation_warnings_fetch_same_signature_FromString(char* fetch_same_signature);



typedef struct catalogs_feed_validation_warnings_t {
    int ad_link_format_warning; //numeric
    int ad_link_same_as_link; //numeric
    int title_length_too_long; //numeric
    int description_length_too_long; //numeric
    int gender_invalid; //numeric
    int age_group_invalid; //numeric
    int size_type_invalid; //numeric
    int size_system_invalid; //numeric
    int link_format_warning; //numeric
    int sales_price_invalid; //numeric
    int product_category_depth_warning; //numeric
    int adwords_format_warning; //numeric
    int adwords_same_as_link; //numeric
    int duplicate_headers; //numeric
    int fetch_same_signature; //numeric
    int additional_image_link_length_too_long; //numeric
    int additional_image_link_warning; //numeric
    int image_link_warning; //numeric
    int shipping_invalid; //numeric
    int tax_invalid; //numeric
    int shipping_weight_invalid; //numeric
    int expiration_date_invalid; //numeric
    int availability_date_invalid; //numeric
    int sale_date_invalid; //numeric
    int weight_unit_invalid; //numeric
    int is_bundle_invalid; //numeric
    int updated_time_invalid; //numeric
    int custom_label_length_too_long; //numeric
    int product_type_length_too_long; //numeric
    int too_many_additional_image_links; //numeric
    int multipack_invalid; //numeric
    int indexed_product_count_large_delta; //numeric
    int item_additional_image_download_failure; //numeric
    int optional_product_category_missing; //numeric
    int optional_product_category_invalid; //numeric
    int optional_condition_missing; //numeric
    int optional_condition_invalid; //numeric
    int ios_deep_link_invalid; //numeric
    int android_deep_link_invalid; //numeric
    int utm_source_auto_corrected; //numeric
    int country_does_not_map_to_currency; //numeric
    int min_ad_price_invalid; //numeric
    int gtin_invalid; //numeric
    int inconsistent_currency_values; //numeric
    int sales_price_too_low; //numeric
    int shipping_width_invalid; //numeric
    int shipping_height_invalid; //numeric
    int sales_price_too_high; //numeric
    int mpn_invalid; //numeric

} catalogs_feed_validation_warnings_t;

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
);

void catalogs_feed_validation_warnings_free(catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings);

catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_parseFromJSON(cJSON *catalogs_feed_validation_warningsJSON);

cJSON *catalogs_feed_validation_warnings_convertToJSON(catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings);

#endif /* _catalogs_feed_validation_warnings_H_ */

