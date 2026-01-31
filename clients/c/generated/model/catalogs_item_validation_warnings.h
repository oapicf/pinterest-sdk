/*
 * catalogs_item_validation_warnings.h
 *
 * 
 */

#ifndef _catalogs_item_validation_warnings_H_
#define _catalogs_item_validation_warnings_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_item_validation_warnings_t catalogs_item_validation_warnings_t;

#include "catalogs_item_validation_details.h"



typedef struct catalogs_item_validation_warnings_t {
    struct catalogs_item_validation_details_t *ad_image_0_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_0_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_0_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_0_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_0_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_0_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_0_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_10_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_10_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_10_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_10_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_10_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_10_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_10_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_11_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_11_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_11_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_11_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_11_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_11_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_11_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_12_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_12_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_12_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_12_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_12_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_12_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_12_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_13_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_13_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_13_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_13_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_13_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_13_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_13_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_14_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_14_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_14_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_14_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_14_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_14_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_14_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_15_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_15_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_15_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_15_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_15_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_15_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_15_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_16_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_16_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_16_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_16_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_16_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_16_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_16_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_17_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_17_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_17_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_17_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_17_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_17_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_17_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_18_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_18_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_18_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_18_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_18_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_18_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_18_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_19_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_19_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_19_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_19_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_19_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_19_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_19_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_1_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_1_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_1_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_1_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_1_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_1_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_1_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_2_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_2_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_2_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_2_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_2_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_2_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_2_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_3_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_3_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_3_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_3_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_3_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_3_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_3_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_4_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_4_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_4_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_4_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_4_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_4_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_4_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_5_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_5_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_5_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_5_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_5_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_5_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_5_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_6_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_6_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_6_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_6_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_6_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_6_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_6_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_7_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_7_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_7_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_7_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_7_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_7_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_7_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_8_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_8_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_8_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_8_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_8_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_8_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_8_tag_required; //model
    struct catalogs_item_validation_details_t *ad_image_9_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_9_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_9_link_required; //model
    struct catalogs_item_validation_details_t *ad_image_9_link_warning; //model
    struct catalogs_item_validation_details_t *ad_image_9_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_image_9_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_image_9_tag_required; //model
    struct catalogs_item_validation_details_t *ad_link_format_warning; //model
    struct catalogs_item_validation_details_t *ad_link_same_as_link; //model
    struct catalogs_item_validation_details_t *ad_video_0_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_video_0_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_video_0_link_required; //model
    struct catalogs_item_validation_details_t *ad_video_0_link_warning; //model
    struct catalogs_item_validation_details_t *ad_video_0_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_video_0_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_video_0_tag_required; //model
    struct catalogs_item_validation_details_t *ad_video_1_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_video_1_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_video_1_link_required; //model
    struct catalogs_item_validation_details_t *ad_video_1_link_warning; //model
    struct catalogs_item_validation_details_t *ad_video_1_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_video_1_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_video_1_tag_required; //model
    struct catalogs_item_validation_details_t *ad_video_2_link_duplicated; //model
    struct catalogs_item_validation_details_t *ad_video_2_link_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_video_2_link_required; //model
    struct catalogs_item_validation_details_t *ad_video_2_link_warning; //model
    struct catalogs_item_validation_details_t *ad_video_2_tag_duplicated; //model
    struct catalogs_item_validation_details_t *ad_video_2_tag_length_too_long; //model
    struct catalogs_item_validation_details_t *ad_video_2_tag_required; //model
    struct catalogs_item_validation_details_t *additional_image_link_length_too_long; //model
    struct catalogs_item_validation_details_t *additional_image_link_warning; //model
    struct catalogs_item_validation_details_t *adwords_format_warning; //model
    struct catalogs_item_validation_details_t *adwords_same_as_link; //model
    struct catalogs_item_validation_details_t *age_group_invalid; //model
    struct catalogs_item_validation_details_t *android_deep_link_invalid; //model
    struct catalogs_item_validation_details_t *availability_date_invalid; //model
    struct catalogs_item_validation_details_t *country_does_not_map_to_currency; //model
    struct catalogs_item_validation_details_t *custom_label_length_too_long; //model
    struct catalogs_item_validation_details_t *description_length_too_long; //model
    struct catalogs_item_validation_details_t *expiration_date_invalid; //model
    struct catalogs_item_validation_details_t *gender_invalid; //model
    struct catalogs_item_validation_details_t *gtin_invalid; //model
    struct catalogs_item_validation_details_t *image_link_warning; //model
    struct catalogs_item_validation_details_t *ios_deep_link_invalid; //model
    struct catalogs_item_validation_details_t *is_bundle_invalid; //model
    struct catalogs_item_validation_details_t *item_additional_image_download_failure; //model
    struct catalogs_item_validation_details_t *link_format_warning; //model
    struct catalogs_item_validation_details_t *min_ad_price_invalid; //model
    struct catalogs_item_validation_details_t *mpn_invalid; //model
    struct catalogs_item_validation_details_t *multipack_invalid; //model
    struct catalogs_item_validation_details_t *optional_condition_invalid; //model
    struct catalogs_item_validation_details_t *optional_condition_missing; //model
    struct catalogs_item_validation_details_t *optional_product_category_invalid; //model
    struct catalogs_item_validation_details_t *optional_product_category_missing; //model
    struct catalogs_item_validation_details_t *product_category_depth_warning; //model
    struct catalogs_item_validation_details_t *product_type_length_too_long; //model
    struct catalogs_item_validation_details_t *sale_date_invalid; //model
    struct catalogs_item_validation_details_t *sales_price_invalid; //model
    struct catalogs_item_validation_details_t *sales_price_too_high; //model
    struct catalogs_item_validation_details_t *sales_price_too_low; //model
    struct catalogs_item_validation_details_t *shipping_height_invalid; //model
    struct catalogs_item_validation_details_t *shipping_invalid; //model
    struct catalogs_item_validation_details_t *shipping_weight_invalid; //model
    struct catalogs_item_validation_details_t *shipping_width_invalid; //model
    struct catalogs_item_validation_details_t *size_system_invalid; //model
    struct catalogs_item_validation_details_t *size_type_invalid; //model
    struct catalogs_item_validation_details_t *tax_invalid; //model
    struct catalogs_item_validation_details_t *title_length_too_long; //model
    struct catalogs_item_validation_details_t *too_many_additional_image_links; //model
    struct catalogs_item_validation_details_t *utm_source_auto_corrected; //model
    struct catalogs_item_validation_details_t *video_required_when_ad_video_provided; //model
    struct catalogs_item_validation_details_t *weight_unit_invalid; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_item_validation_warnings_t;

__attribute__((deprecated)) catalogs_item_validation_warnings_t *catalogs_item_validation_warnings_create(
    catalogs_item_validation_details_t *ad_image_0_link_duplicated,
    catalogs_item_validation_details_t *ad_image_0_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_0_link_required,
    catalogs_item_validation_details_t *ad_image_0_link_warning,
    catalogs_item_validation_details_t *ad_image_0_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_0_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_0_tag_required,
    catalogs_item_validation_details_t *ad_image_10_link_duplicated,
    catalogs_item_validation_details_t *ad_image_10_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_10_link_required,
    catalogs_item_validation_details_t *ad_image_10_link_warning,
    catalogs_item_validation_details_t *ad_image_10_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_10_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_10_tag_required,
    catalogs_item_validation_details_t *ad_image_11_link_duplicated,
    catalogs_item_validation_details_t *ad_image_11_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_11_link_required,
    catalogs_item_validation_details_t *ad_image_11_link_warning,
    catalogs_item_validation_details_t *ad_image_11_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_11_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_11_tag_required,
    catalogs_item_validation_details_t *ad_image_12_link_duplicated,
    catalogs_item_validation_details_t *ad_image_12_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_12_link_required,
    catalogs_item_validation_details_t *ad_image_12_link_warning,
    catalogs_item_validation_details_t *ad_image_12_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_12_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_12_tag_required,
    catalogs_item_validation_details_t *ad_image_13_link_duplicated,
    catalogs_item_validation_details_t *ad_image_13_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_13_link_required,
    catalogs_item_validation_details_t *ad_image_13_link_warning,
    catalogs_item_validation_details_t *ad_image_13_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_13_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_13_tag_required,
    catalogs_item_validation_details_t *ad_image_14_link_duplicated,
    catalogs_item_validation_details_t *ad_image_14_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_14_link_required,
    catalogs_item_validation_details_t *ad_image_14_link_warning,
    catalogs_item_validation_details_t *ad_image_14_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_14_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_14_tag_required,
    catalogs_item_validation_details_t *ad_image_15_link_duplicated,
    catalogs_item_validation_details_t *ad_image_15_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_15_link_required,
    catalogs_item_validation_details_t *ad_image_15_link_warning,
    catalogs_item_validation_details_t *ad_image_15_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_15_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_15_tag_required,
    catalogs_item_validation_details_t *ad_image_16_link_duplicated,
    catalogs_item_validation_details_t *ad_image_16_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_16_link_required,
    catalogs_item_validation_details_t *ad_image_16_link_warning,
    catalogs_item_validation_details_t *ad_image_16_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_16_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_16_tag_required,
    catalogs_item_validation_details_t *ad_image_17_link_duplicated,
    catalogs_item_validation_details_t *ad_image_17_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_17_link_required,
    catalogs_item_validation_details_t *ad_image_17_link_warning,
    catalogs_item_validation_details_t *ad_image_17_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_17_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_17_tag_required,
    catalogs_item_validation_details_t *ad_image_18_link_duplicated,
    catalogs_item_validation_details_t *ad_image_18_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_18_link_required,
    catalogs_item_validation_details_t *ad_image_18_link_warning,
    catalogs_item_validation_details_t *ad_image_18_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_18_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_18_tag_required,
    catalogs_item_validation_details_t *ad_image_19_link_duplicated,
    catalogs_item_validation_details_t *ad_image_19_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_19_link_required,
    catalogs_item_validation_details_t *ad_image_19_link_warning,
    catalogs_item_validation_details_t *ad_image_19_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_19_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_19_tag_required,
    catalogs_item_validation_details_t *ad_image_1_link_duplicated,
    catalogs_item_validation_details_t *ad_image_1_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_1_link_required,
    catalogs_item_validation_details_t *ad_image_1_link_warning,
    catalogs_item_validation_details_t *ad_image_1_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_1_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_1_tag_required,
    catalogs_item_validation_details_t *ad_image_2_link_duplicated,
    catalogs_item_validation_details_t *ad_image_2_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_2_link_required,
    catalogs_item_validation_details_t *ad_image_2_link_warning,
    catalogs_item_validation_details_t *ad_image_2_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_2_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_2_tag_required,
    catalogs_item_validation_details_t *ad_image_3_link_duplicated,
    catalogs_item_validation_details_t *ad_image_3_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_3_link_required,
    catalogs_item_validation_details_t *ad_image_3_link_warning,
    catalogs_item_validation_details_t *ad_image_3_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_3_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_3_tag_required,
    catalogs_item_validation_details_t *ad_image_4_link_duplicated,
    catalogs_item_validation_details_t *ad_image_4_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_4_link_required,
    catalogs_item_validation_details_t *ad_image_4_link_warning,
    catalogs_item_validation_details_t *ad_image_4_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_4_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_4_tag_required,
    catalogs_item_validation_details_t *ad_image_5_link_duplicated,
    catalogs_item_validation_details_t *ad_image_5_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_5_link_required,
    catalogs_item_validation_details_t *ad_image_5_link_warning,
    catalogs_item_validation_details_t *ad_image_5_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_5_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_5_tag_required,
    catalogs_item_validation_details_t *ad_image_6_link_duplicated,
    catalogs_item_validation_details_t *ad_image_6_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_6_link_required,
    catalogs_item_validation_details_t *ad_image_6_link_warning,
    catalogs_item_validation_details_t *ad_image_6_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_6_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_6_tag_required,
    catalogs_item_validation_details_t *ad_image_7_link_duplicated,
    catalogs_item_validation_details_t *ad_image_7_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_7_link_required,
    catalogs_item_validation_details_t *ad_image_7_link_warning,
    catalogs_item_validation_details_t *ad_image_7_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_7_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_7_tag_required,
    catalogs_item_validation_details_t *ad_image_8_link_duplicated,
    catalogs_item_validation_details_t *ad_image_8_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_8_link_required,
    catalogs_item_validation_details_t *ad_image_8_link_warning,
    catalogs_item_validation_details_t *ad_image_8_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_8_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_8_tag_required,
    catalogs_item_validation_details_t *ad_image_9_link_duplicated,
    catalogs_item_validation_details_t *ad_image_9_link_length_too_long,
    catalogs_item_validation_details_t *ad_image_9_link_required,
    catalogs_item_validation_details_t *ad_image_9_link_warning,
    catalogs_item_validation_details_t *ad_image_9_tag_duplicated,
    catalogs_item_validation_details_t *ad_image_9_tag_length_too_long,
    catalogs_item_validation_details_t *ad_image_9_tag_required,
    catalogs_item_validation_details_t *ad_link_format_warning,
    catalogs_item_validation_details_t *ad_link_same_as_link,
    catalogs_item_validation_details_t *ad_video_0_link_duplicated,
    catalogs_item_validation_details_t *ad_video_0_link_length_too_long,
    catalogs_item_validation_details_t *ad_video_0_link_required,
    catalogs_item_validation_details_t *ad_video_0_link_warning,
    catalogs_item_validation_details_t *ad_video_0_tag_duplicated,
    catalogs_item_validation_details_t *ad_video_0_tag_length_too_long,
    catalogs_item_validation_details_t *ad_video_0_tag_required,
    catalogs_item_validation_details_t *ad_video_1_link_duplicated,
    catalogs_item_validation_details_t *ad_video_1_link_length_too_long,
    catalogs_item_validation_details_t *ad_video_1_link_required,
    catalogs_item_validation_details_t *ad_video_1_link_warning,
    catalogs_item_validation_details_t *ad_video_1_tag_duplicated,
    catalogs_item_validation_details_t *ad_video_1_tag_length_too_long,
    catalogs_item_validation_details_t *ad_video_1_tag_required,
    catalogs_item_validation_details_t *ad_video_2_link_duplicated,
    catalogs_item_validation_details_t *ad_video_2_link_length_too_long,
    catalogs_item_validation_details_t *ad_video_2_link_required,
    catalogs_item_validation_details_t *ad_video_2_link_warning,
    catalogs_item_validation_details_t *ad_video_2_tag_duplicated,
    catalogs_item_validation_details_t *ad_video_2_tag_length_too_long,
    catalogs_item_validation_details_t *ad_video_2_tag_required,
    catalogs_item_validation_details_t *additional_image_link_length_too_long,
    catalogs_item_validation_details_t *additional_image_link_warning,
    catalogs_item_validation_details_t *adwords_format_warning,
    catalogs_item_validation_details_t *adwords_same_as_link,
    catalogs_item_validation_details_t *age_group_invalid,
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
    catalogs_item_validation_details_t *sale_date_invalid,
    catalogs_item_validation_details_t *sales_price_invalid,
    catalogs_item_validation_details_t *sales_price_too_high,
    catalogs_item_validation_details_t *sales_price_too_low,
    catalogs_item_validation_details_t *shipping_height_invalid,
    catalogs_item_validation_details_t *shipping_invalid,
    catalogs_item_validation_details_t *shipping_weight_invalid,
    catalogs_item_validation_details_t *shipping_width_invalid,
    catalogs_item_validation_details_t *size_system_invalid,
    catalogs_item_validation_details_t *size_type_invalid,
    catalogs_item_validation_details_t *tax_invalid,
    catalogs_item_validation_details_t *title_length_too_long,
    catalogs_item_validation_details_t *too_many_additional_image_links,
    catalogs_item_validation_details_t *utm_source_auto_corrected,
    catalogs_item_validation_details_t *video_required_when_ad_video_provided,
    catalogs_item_validation_details_t *weight_unit_invalid
);

void catalogs_item_validation_warnings_free(catalogs_item_validation_warnings_t *catalogs_item_validation_warnings);

catalogs_item_validation_warnings_t *catalogs_item_validation_warnings_parseFromJSON(cJSON *catalogs_item_validation_warningsJSON);

cJSON *catalogs_item_validation_warnings_convertToJSON(catalogs_item_validation_warnings_t *catalogs_item_validation_warnings);

#endif /* _catalogs_item_validation_warnings_H_ */

