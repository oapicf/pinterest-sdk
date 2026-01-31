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
    int ad_image_0_link_duplicated; //numeric
    int ad_image_0_link_length_too_long; //numeric
    int ad_image_0_link_required; //numeric
    int ad_image_0_link_warning; //numeric
    int ad_image_0_tag_duplicated; //numeric
    int ad_image_0_tag_length_too_long; //numeric
    int ad_image_0_tag_required; //numeric
    int ad_image_10_link_duplicated; //numeric
    int ad_image_10_link_length_too_long; //numeric
    int ad_image_10_link_required; //numeric
    int ad_image_10_link_warning; //numeric
    int ad_image_10_tag_duplicated; //numeric
    int ad_image_10_tag_length_too_long; //numeric
    int ad_image_10_tag_required; //numeric
    int ad_image_11_link_duplicated; //numeric
    int ad_image_11_link_length_too_long; //numeric
    int ad_image_11_link_required; //numeric
    int ad_image_11_link_warning; //numeric
    int ad_image_11_tag_duplicated; //numeric
    int ad_image_11_tag_length_too_long; //numeric
    int ad_image_11_tag_required; //numeric
    int ad_image_12_link_duplicated; //numeric
    int ad_image_12_link_length_too_long; //numeric
    int ad_image_12_link_required; //numeric
    int ad_image_12_link_warning; //numeric
    int ad_image_12_tag_duplicated; //numeric
    int ad_image_12_tag_length_too_long; //numeric
    int ad_image_12_tag_required; //numeric
    int ad_image_13_link_duplicated; //numeric
    int ad_image_13_link_length_too_long; //numeric
    int ad_image_13_link_required; //numeric
    int ad_image_13_link_warning; //numeric
    int ad_image_13_tag_duplicated; //numeric
    int ad_image_13_tag_length_too_long; //numeric
    int ad_image_13_tag_required; //numeric
    int ad_image_14_link_duplicated; //numeric
    int ad_image_14_link_length_too_long; //numeric
    int ad_image_14_link_required; //numeric
    int ad_image_14_link_warning; //numeric
    int ad_image_14_tag_duplicated; //numeric
    int ad_image_14_tag_length_too_long; //numeric
    int ad_image_14_tag_required; //numeric
    int ad_image_15_link_duplicated; //numeric
    int ad_image_15_link_length_too_long; //numeric
    int ad_image_15_link_required; //numeric
    int ad_image_15_link_warning; //numeric
    int ad_image_15_tag_duplicated; //numeric
    int ad_image_15_tag_length_too_long; //numeric
    int ad_image_15_tag_required; //numeric
    int ad_image_16_link_duplicated; //numeric
    int ad_image_16_link_length_too_long; //numeric
    int ad_image_16_link_required; //numeric
    int ad_image_16_link_warning; //numeric
    int ad_image_16_tag_duplicated; //numeric
    int ad_image_16_tag_length_too_long; //numeric
    int ad_image_16_tag_required; //numeric
    int ad_image_17_link_duplicated; //numeric
    int ad_image_17_link_length_too_long; //numeric
    int ad_image_17_link_required; //numeric
    int ad_image_17_link_warning; //numeric
    int ad_image_17_tag_duplicated; //numeric
    int ad_image_17_tag_length_too_long; //numeric
    int ad_image_17_tag_required; //numeric
    int ad_image_18_link_duplicated; //numeric
    int ad_image_18_link_length_too_long; //numeric
    int ad_image_18_link_required; //numeric
    int ad_image_18_link_warning; //numeric
    int ad_image_18_tag_duplicated; //numeric
    int ad_image_18_tag_length_too_long; //numeric
    int ad_image_18_tag_required; //numeric
    int ad_image_19_link_duplicated; //numeric
    int ad_image_19_link_length_too_long; //numeric
    int ad_image_19_link_required; //numeric
    int ad_image_19_link_warning; //numeric
    int ad_image_19_tag_duplicated; //numeric
    int ad_image_19_tag_length_too_long; //numeric
    int ad_image_19_tag_required; //numeric
    int ad_image_1_link_duplicated; //numeric
    int ad_image_1_link_length_too_long; //numeric
    int ad_image_1_link_required; //numeric
    int ad_image_1_link_warning; //numeric
    int ad_image_1_tag_duplicated; //numeric
    int ad_image_1_tag_length_too_long; //numeric
    int ad_image_1_tag_required; //numeric
    int ad_image_2_link_duplicated; //numeric
    int ad_image_2_link_length_too_long; //numeric
    int ad_image_2_link_required; //numeric
    int ad_image_2_link_warning; //numeric
    int ad_image_2_tag_duplicated; //numeric
    int ad_image_2_tag_length_too_long; //numeric
    int ad_image_2_tag_required; //numeric
    int ad_image_3_link_duplicated; //numeric
    int ad_image_3_link_length_too_long; //numeric
    int ad_image_3_link_required; //numeric
    int ad_image_3_link_warning; //numeric
    int ad_image_3_tag_duplicated; //numeric
    int ad_image_3_tag_length_too_long; //numeric
    int ad_image_3_tag_required; //numeric
    int ad_image_4_link_duplicated; //numeric
    int ad_image_4_link_length_too_long; //numeric
    int ad_image_4_link_required; //numeric
    int ad_image_4_link_warning; //numeric
    int ad_image_4_tag_duplicated; //numeric
    int ad_image_4_tag_length_too_long; //numeric
    int ad_image_4_tag_required; //numeric
    int ad_image_5_link_duplicated; //numeric
    int ad_image_5_link_length_too_long; //numeric
    int ad_image_5_link_required; //numeric
    int ad_image_5_link_warning; //numeric
    int ad_image_5_tag_duplicated; //numeric
    int ad_image_5_tag_length_too_long; //numeric
    int ad_image_5_tag_required; //numeric
    int ad_image_6_link_duplicated; //numeric
    int ad_image_6_link_length_too_long; //numeric
    int ad_image_6_link_required; //numeric
    int ad_image_6_link_warning; //numeric
    int ad_image_6_tag_duplicated; //numeric
    int ad_image_6_tag_length_too_long; //numeric
    int ad_image_6_tag_required; //numeric
    int ad_image_7_link_duplicated; //numeric
    int ad_image_7_link_length_too_long; //numeric
    int ad_image_7_link_required; //numeric
    int ad_image_7_link_warning; //numeric
    int ad_image_7_tag_duplicated; //numeric
    int ad_image_7_tag_length_too_long; //numeric
    int ad_image_7_tag_required; //numeric
    int ad_image_8_link_duplicated; //numeric
    int ad_image_8_link_length_too_long; //numeric
    int ad_image_8_link_required; //numeric
    int ad_image_8_link_warning; //numeric
    int ad_image_8_tag_duplicated; //numeric
    int ad_image_8_tag_length_too_long; //numeric
    int ad_image_8_tag_required; //numeric
    int ad_image_9_link_duplicated; //numeric
    int ad_image_9_link_length_too_long; //numeric
    int ad_image_9_link_required; //numeric
    int ad_image_9_link_warning; //numeric
    int ad_image_9_tag_duplicated; //numeric
    int ad_image_9_tag_length_too_long; //numeric
    int ad_image_9_tag_required; //numeric
    int ad_link_format_warning; //numeric
    int ad_link_same_as_link; //numeric
    int ad_video_0_link_duplicated; //numeric
    int ad_video_0_link_length_too_long; //numeric
    int ad_video_0_link_required; //numeric
    int ad_video_0_link_warning; //numeric
    int ad_video_0_tag_duplicated; //numeric
    int ad_video_0_tag_length_too_long; //numeric
    int ad_video_0_tag_required; //numeric
    int ad_video_1_link_duplicated; //numeric
    int ad_video_1_link_length_too_long; //numeric
    int ad_video_1_link_required; //numeric
    int ad_video_1_link_warning; //numeric
    int ad_video_1_tag_duplicated; //numeric
    int ad_video_1_tag_length_too_long; //numeric
    int ad_video_1_tag_required; //numeric
    int ad_video_2_link_duplicated; //numeric
    int ad_video_2_link_length_too_long; //numeric
    int ad_video_2_link_required; //numeric
    int ad_video_2_link_warning; //numeric
    int ad_video_2_tag_duplicated; //numeric
    int ad_video_2_tag_length_too_long; //numeric
    int ad_video_2_tag_required; //numeric
    int additional_image_link_length_too_long; //numeric
    int additional_image_link_warning; //numeric
    int adwords_format_warning; //numeric
    int adwords_same_as_link; //numeric
    int age_group_invalid; //numeric
    int android_deep_link_invalid; //numeric
    int availability_date_invalid; //numeric
    int country_does_not_map_to_currency; //numeric
    int custom_label_length_too_long; //numeric
    int description_length_too_long; //numeric
    int duplicate_headers; //numeric
    int expiration_date_invalid; //numeric
    int fetch_same_signature; //numeric
    int gender_invalid; //numeric
    int gtin_invalid; //numeric
    int image_link_warning; //numeric
    int inconsistent_currency_values; //numeric
    int indexed_product_count_large_delta; //numeric
    int ios_deep_link_invalid; //numeric
    int is_bundle_invalid; //numeric
    int item_additional_image_download_failure; //numeric
    int link_format_warning; //numeric
    int min_ad_price_invalid; //numeric
    int mpn_invalid; //numeric
    int multipack_invalid; //numeric
    int optional_condition_invalid; //numeric
    int optional_condition_missing; //numeric
    int optional_product_category_invalid; //numeric
    int optional_product_category_missing; //numeric
    int product_category_depth_warning; //numeric
    int product_type_length_too_long; //numeric
    int sale_date_invalid; //numeric
    int sales_price_invalid; //numeric
    int sales_price_too_high; //numeric
    int sales_price_too_low; //numeric
    int shipping_height_invalid; //numeric
    int shipping_invalid; //numeric
    int shipping_weight_invalid; //numeric
    int shipping_width_invalid; //numeric
    int size_system_invalid; //numeric
    int size_type_invalid; //numeric
    int tax_invalid; //numeric
    int title_length_too_long; //numeric
    int too_many_additional_image_links; //numeric
    int updated_time_invalid; //numeric
    int utm_source_auto_corrected; //numeric
    int video_required_when_ad_video_provided; //numeric
    int weight_unit_invalid; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_validation_warnings_t;

__attribute__((deprecated)) catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_create(
    int ad_image_0_link_duplicated,
    int ad_image_0_link_length_too_long,
    int ad_image_0_link_required,
    int ad_image_0_link_warning,
    int ad_image_0_tag_duplicated,
    int ad_image_0_tag_length_too_long,
    int ad_image_0_tag_required,
    int ad_image_10_link_duplicated,
    int ad_image_10_link_length_too_long,
    int ad_image_10_link_required,
    int ad_image_10_link_warning,
    int ad_image_10_tag_duplicated,
    int ad_image_10_tag_length_too_long,
    int ad_image_10_tag_required,
    int ad_image_11_link_duplicated,
    int ad_image_11_link_length_too_long,
    int ad_image_11_link_required,
    int ad_image_11_link_warning,
    int ad_image_11_tag_duplicated,
    int ad_image_11_tag_length_too_long,
    int ad_image_11_tag_required,
    int ad_image_12_link_duplicated,
    int ad_image_12_link_length_too_long,
    int ad_image_12_link_required,
    int ad_image_12_link_warning,
    int ad_image_12_tag_duplicated,
    int ad_image_12_tag_length_too_long,
    int ad_image_12_tag_required,
    int ad_image_13_link_duplicated,
    int ad_image_13_link_length_too_long,
    int ad_image_13_link_required,
    int ad_image_13_link_warning,
    int ad_image_13_tag_duplicated,
    int ad_image_13_tag_length_too_long,
    int ad_image_13_tag_required,
    int ad_image_14_link_duplicated,
    int ad_image_14_link_length_too_long,
    int ad_image_14_link_required,
    int ad_image_14_link_warning,
    int ad_image_14_tag_duplicated,
    int ad_image_14_tag_length_too_long,
    int ad_image_14_tag_required,
    int ad_image_15_link_duplicated,
    int ad_image_15_link_length_too_long,
    int ad_image_15_link_required,
    int ad_image_15_link_warning,
    int ad_image_15_tag_duplicated,
    int ad_image_15_tag_length_too_long,
    int ad_image_15_tag_required,
    int ad_image_16_link_duplicated,
    int ad_image_16_link_length_too_long,
    int ad_image_16_link_required,
    int ad_image_16_link_warning,
    int ad_image_16_tag_duplicated,
    int ad_image_16_tag_length_too_long,
    int ad_image_16_tag_required,
    int ad_image_17_link_duplicated,
    int ad_image_17_link_length_too_long,
    int ad_image_17_link_required,
    int ad_image_17_link_warning,
    int ad_image_17_tag_duplicated,
    int ad_image_17_tag_length_too_long,
    int ad_image_17_tag_required,
    int ad_image_18_link_duplicated,
    int ad_image_18_link_length_too_long,
    int ad_image_18_link_required,
    int ad_image_18_link_warning,
    int ad_image_18_tag_duplicated,
    int ad_image_18_tag_length_too_long,
    int ad_image_18_tag_required,
    int ad_image_19_link_duplicated,
    int ad_image_19_link_length_too_long,
    int ad_image_19_link_required,
    int ad_image_19_link_warning,
    int ad_image_19_tag_duplicated,
    int ad_image_19_tag_length_too_long,
    int ad_image_19_tag_required,
    int ad_image_1_link_duplicated,
    int ad_image_1_link_length_too_long,
    int ad_image_1_link_required,
    int ad_image_1_link_warning,
    int ad_image_1_tag_duplicated,
    int ad_image_1_tag_length_too_long,
    int ad_image_1_tag_required,
    int ad_image_2_link_duplicated,
    int ad_image_2_link_length_too_long,
    int ad_image_2_link_required,
    int ad_image_2_link_warning,
    int ad_image_2_tag_duplicated,
    int ad_image_2_tag_length_too_long,
    int ad_image_2_tag_required,
    int ad_image_3_link_duplicated,
    int ad_image_3_link_length_too_long,
    int ad_image_3_link_required,
    int ad_image_3_link_warning,
    int ad_image_3_tag_duplicated,
    int ad_image_3_tag_length_too_long,
    int ad_image_3_tag_required,
    int ad_image_4_link_duplicated,
    int ad_image_4_link_length_too_long,
    int ad_image_4_link_required,
    int ad_image_4_link_warning,
    int ad_image_4_tag_duplicated,
    int ad_image_4_tag_length_too_long,
    int ad_image_4_tag_required,
    int ad_image_5_link_duplicated,
    int ad_image_5_link_length_too_long,
    int ad_image_5_link_required,
    int ad_image_5_link_warning,
    int ad_image_5_tag_duplicated,
    int ad_image_5_tag_length_too_long,
    int ad_image_5_tag_required,
    int ad_image_6_link_duplicated,
    int ad_image_6_link_length_too_long,
    int ad_image_6_link_required,
    int ad_image_6_link_warning,
    int ad_image_6_tag_duplicated,
    int ad_image_6_tag_length_too_long,
    int ad_image_6_tag_required,
    int ad_image_7_link_duplicated,
    int ad_image_7_link_length_too_long,
    int ad_image_7_link_required,
    int ad_image_7_link_warning,
    int ad_image_7_tag_duplicated,
    int ad_image_7_tag_length_too_long,
    int ad_image_7_tag_required,
    int ad_image_8_link_duplicated,
    int ad_image_8_link_length_too_long,
    int ad_image_8_link_required,
    int ad_image_8_link_warning,
    int ad_image_8_tag_duplicated,
    int ad_image_8_tag_length_too_long,
    int ad_image_8_tag_required,
    int ad_image_9_link_duplicated,
    int ad_image_9_link_length_too_long,
    int ad_image_9_link_required,
    int ad_image_9_link_warning,
    int ad_image_9_tag_duplicated,
    int ad_image_9_tag_length_too_long,
    int ad_image_9_tag_required,
    int ad_link_format_warning,
    int ad_link_same_as_link,
    int ad_video_0_link_duplicated,
    int ad_video_0_link_length_too_long,
    int ad_video_0_link_required,
    int ad_video_0_link_warning,
    int ad_video_0_tag_duplicated,
    int ad_video_0_tag_length_too_long,
    int ad_video_0_tag_required,
    int ad_video_1_link_duplicated,
    int ad_video_1_link_length_too_long,
    int ad_video_1_link_required,
    int ad_video_1_link_warning,
    int ad_video_1_tag_duplicated,
    int ad_video_1_tag_length_too_long,
    int ad_video_1_tag_required,
    int ad_video_2_link_duplicated,
    int ad_video_2_link_length_too_long,
    int ad_video_2_link_required,
    int ad_video_2_link_warning,
    int ad_video_2_tag_duplicated,
    int ad_video_2_tag_length_too_long,
    int ad_video_2_tag_required,
    int additional_image_link_length_too_long,
    int additional_image_link_warning,
    int adwords_format_warning,
    int adwords_same_as_link,
    int age_group_invalid,
    int android_deep_link_invalid,
    int availability_date_invalid,
    int country_does_not_map_to_currency,
    int custom_label_length_too_long,
    int description_length_too_long,
    int duplicate_headers,
    int expiration_date_invalid,
    int fetch_same_signature,
    int gender_invalid,
    int gtin_invalid,
    int image_link_warning,
    int inconsistent_currency_values,
    int indexed_product_count_large_delta,
    int ios_deep_link_invalid,
    int is_bundle_invalid,
    int item_additional_image_download_failure,
    int link_format_warning,
    int min_ad_price_invalid,
    int mpn_invalid,
    int multipack_invalid,
    int optional_condition_invalid,
    int optional_condition_missing,
    int optional_product_category_invalid,
    int optional_product_category_missing,
    int product_category_depth_warning,
    int product_type_length_too_long,
    int sale_date_invalid,
    int sales_price_invalid,
    int sales_price_too_high,
    int sales_price_too_low,
    int shipping_height_invalid,
    int shipping_invalid,
    int shipping_weight_invalid,
    int shipping_width_invalid,
    int size_system_invalid,
    int size_type_invalid,
    int tax_invalid,
    int title_length_too_long,
    int too_many_additional_image_links,
    int updated_time_invalid,
    int utm_source_auto_corrected,
    int video_required_when_ad_video_provided,
    int weight_unit_invalid
);

void catalogs_feed_validation_warnings_free(catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings);

catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_parseFromJSON(cJSON *catalogs_feed_validation_warningsJSON);

cJSON *catalogs_feed_validation_warnings_convertToJSON(catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings);

#endif /* _catalogs_feed_validation_warnings_H_ */

