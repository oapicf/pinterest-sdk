#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_validation_warnings.h"



static catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_create_internal(
    int *ad_image_0_link_duplicated,
    int *ad_image_0_link_length_too_long,
    int *ad_image_0_link_required,
    int *ad_image_0_link_warning,
    int *ad_image_0_tag_duplicated,
    int *ad_image_0_tag_length_too_long,
    int *ad_image_0_tag_required,
    int *ad_image_10_link_duplicated,
    int *ad_image_10_link_length_too_long,
    int *ad_image_10_link_required,
    int *ad_image_10_link_warning,
    int *ad_image_10_tag_duplicated,
    int *ad_image_10_tag_length_too_long,
    int *ad_image_10_tag_required,
    int *ad_image_11_link_duplicated,
    int *ad_image_11_link_length_too_long,
    int *ad_image_11_link_required,
    int *ad_image_11_link_warning,
    int *ad_image_11_tag_duplicated,
    int *ad_image_11_tag_length_too_long,
    int *ad_image_11_tag_required,
    int *ad_image_12_link_duplicated,
    int *ad_image_12_link_length_too_long,
    int *ad_image_12_link_required,
    int *ad_image_12_link_warning,
    int *ad_image_12_tag_duplicated,
    int *ad_image_12_tag_length_too_long,
    int *ad_image_12_tag_required,
    int *ad_image_13_link_duplicated,
    int *ad_image_13_link_length_too_long,
    int *ad_image_13_link_required,
    int *ad_image_13_link_warning,
    int *ad_image_13_tag_duplicated,
    int *ad_image_13_tag_length_too_long,
    int *ad_image_13_tag_required,
    int *ad_image_14_link_duplicated,
    int *ad_image_14_link_length_too_long,
    int *ad_image_14_link_required,
    int *ad_image_14_link_warning,
    int *ad_image_14_tag_duplicated,
    int *ad_image_14_tag_length_too_long,
    int *ad_image_14_tag_required,
    int *ad_image_15_link_duplicated,
    int *ad_image_15_link_length_too_long,
    int *ad_image_15_link_required,
    int *ad_image_15_link_warning,
    int *ad_image_15_tag_duplicated,
    int *ad_image_15_tag_length_too_long,
    int *ad_image_15_tag_required,
    int *ad_image_16_link_duplicated,
    int *ad_image_16_link_length_too_long,
    int *ad_image_16_link_required,
    int *ad_image_16_link_warning,
    int *ad_image_16_tag_duplicated,
    int *ad_image_16_tag_length_too_long,
    int *ad_image_16_tag_required,
    int *ad_image_17_link_duplicated,
    int *ad_image_17_link_length_too_long,
    int *ad_image_17_link_required,
    int *ad_image_17_link_warning,
    int *ad_image_17_tag_duplicated,
    int *ad_image_17_tag_length_too_long,
    int *ad_image_17_tag_required,
    int *ad_image_18_link_duplicated,
    int *ad_image_18_link_length_too_long,
    int *ad_image_18_link_required,
    int *ad_image_18_link_warning,
    int *ad_image_18_tag_duplicated,
    int *ad_image_18_tag_length_too_long,
    int *ad_image_18_tag_required,
    int *ad_image_19_link_duplicated,
    int *ad_image_19_link_length_too_long,
    int *ad_image_19_link_required,
    int *ad_image_19_link_warning,
    int *ad_image_19_tag_duplicated,
    int *ad_image_19_tag_length_too_long,
    int *ad_image_19_tag_required,
    int *ad_image_1_link_duplicated,
    int *ad_image_1_link_length_too_long,
    int *ad_image_1_link_required,
    int *ad_image_1_link_warning,
    int *ad_image_1_tag_duplicated,
    int *ad_image_1_tag_length_too_long,
    int *ad_image_1_tag_required,
    int *ad_image_2_link_duplicated,
    int *ad_image_2_link_length_too_long,
    int *ad_image_2_link_required,
    int *ad_image_2_link_warning,
    int *ad_image_2_tag_duplicated,
    int *ad_image_2_tag_length_too_long,
    int *ad_image_2_tag_required,
    int *ad_image_3_link_duplicated,
    int *ad_image_3_link_length_too_long,
    int *ad_image_3_link_required,
    int *ad_image_3_link_warning,
    int *ad_image_3_tag_duplicated,
    int *ad_image_3_tag_length_too_long,
    int *ad_image_3_tag_required,
    int *ad_image_4_link_duplicated,
    int *ad_image_4_link_length_too_long,
    int *ad_image_4_link_required,
    int *ad_image_4_link_warning,
    int *ad_image_4_tag_duplicated,
    int *ad_image_4_tag_length_too_long,
    int *ad_image_4_tag_required,
    int *ad_image_5_link_duplicated,
    int *ad_image_5_link_length_too_long,
    int *ad_image_5_link_required,
    int *ad_image_5_link_warning,
    int *ad_image_5_tag_duplicated,
    int *ad_image_5_tag_length_too_long,
    int *ad_image_5_tag_required,
    int *ad_image_6_link_duplicated,
    int *ad_image_6_link_length_too_long,
    int *ad_image_6_link_required,
    int *ad_image_6_link_warning,
    int *ad_image_6_tag_duplicated,
    int *ad_image_6_tag_length_too_long,
    int *ad_image_6_tag_required,
    int *ad_image_7_link_duplicated,
    int *ad_image_7_link_length_too_long,
    int *ad_image_7_link_required,
    int *ad_image_7_link_warning,
    int *ad_image_7_tag_duplicated,
    int *ad_image_7_tag_length_too_long,
    int *ad_image_7_tag_required,
    int *ad_image_8_link_duplicated,
    int *ad_image_8_link_length_too_long,
    int *ad_image_8_link_required,
    int *ad_image_8_link_warning,
    int *ad_image_8_tag_duplicated,
    int *ad_image_8_tag_length_too_long,
    int *ad_image_8_tag_required,
    int *ad_image_9_link_duplicated,
    int *ad_image_9_link_length_too_long,
    int *ad_image_9_link_required,
    int *ad_image_9_link_warning,
    int *ad_image_9_tag_duplicated,
    int *ad_image_9_tag_length_too_long,
    int *ad_image_9_tag_required,
    int *ad_link_format_warning,
    int *ad_link_same_as_link,
    int *ad_video_0_link_duplicated,
    int *ad_video_0_link_length_too_long,
    int *ad_video_0_link_required,
    int *ad_video_0_link_warning,
    int *ad_video_0_tag_duplicated,
    int *ad_video_0_tag_length_too_long,
    int *ad_video_0_tag_required,
    int *ad_video_1_link_duplicated,
    int *ad_video_1_link_length_too_long,
    int *ad_video_1_link_required,
    int *ad_video_1_link_warning,
    int *ad_video_1_tag_duplicated,
    int *ad_video_1_tag_length_too_long,
    int *ad_video_1_tag_required,
    int *ad_video_2_link_duplicated,
    int *ad_video_2_link_length_too_long,
    int *ad_video_2_link_required,
    int *ad_video_2_link_warning,
    int *ad_video_2_tag_duplicated,
    int *ad_video_2_tag_length_too_long,
    int *ad_video_2_tag_required,
    int *additional_image_link_length_too_long,
    int *additional_image_link_warning,
    int *adwords_format_warning,
    int *adwords_same_as_link,
    int *age_group_invalid,
    int *android_deep_link_invalid,
    int *availability_date_invalid,
    int *country_does_not_map_to_currency,
    int *custom_label_length_too_long,
    int *description_length_too_long,
    int *duplicate_headers,
    int *expiration_date_invalid,
    int *fetch_same_signature,
    int *gender_invalid,
    int *gtin_invalid,
    int *image_link_warning,
    int *inconsistent_currency_values,
    int *indexed_product_count_large_delta,
    int *ios_deep_link_invalid,
    int *is_bundle_invalid,
    int *item_additional_image_download_failure,
    int *link_format_warning,
    int *min_ad_price_invalid,
    int *mpn_invalid,
    int *multipack_invalid,
    int *optional_condition_invalid,
    int *optional_condition_missing,
    int *optional_product_category_invalid,
    int *optional_product_category_missing,
    int *product_category_depth_warning,
    int *product_type_length_too_long,
    int *sale_date_invalid,
    int *sales_price_invalid,
    int *sales_price_too_high,
    int *sales_price_too_low,
    int *shipping_height_invalid,
    int *shipping_invalid,
    int *shipping_weight_invalid,
    int *shipping_width_invalid,
    int *size_system_invalid,
    int *size_type_invalid,
    int *tax_invalid,
    int *title_length_too_long,
    int *too_many_additional_image_links,
    int *updated_time_invalid,
    int *utm_source_auto_corrected,
    int *video_required_when_ad_video_provided,
    int *weight_unit_invalid
    ) {
    catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_local_var = malloc(sizeof(catalogs_feed_validation_warnings_t));
    if (!catalogs_feed_validation_warnings_local_var) {
        return NULL;
    }
    memset(catalogs_feed_validation_warnings_local_var, 0, sizeof(catalogs_feed_validation_warnings_t));
    catalogs_feed_validation_warnings_local_var->_library_owned = 1;
    catalogs_feed_validation_warnings_local_var->ad_image_0_link_duplicated = ad_image_0_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_0_link_length_too_long = ad_image_0_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_0_link_required = ad_image_0_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_0_link_warning = ad_image_0_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_0_tag_duplicated = ad_image_0_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_0_tag_length_too_long = ad_image_0_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_0_tag_required = ad_image_0_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_10_link_duplicated = ad_image_10_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_10_link_length_too_long = ad_image_10_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_10_link_required = ad_image_10_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_10_link_warning = ad_image_10_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_10_tag_duplicated = ad_image_10_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_10_tag_length_too_long = ad_image_10_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_10_tag_required = ad_image_10_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_11_link_duplicated = ad_image_11_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_11_link_length_too_long = ad_image_11_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_11_link_required = ad_image_11_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_11_link_warning = ad_image_11_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_11_tag_duplicated = ad_image_11_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_11_tag_length_too_long = ad_image_11_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_11_tag_required = ad_image_11_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_12_link_duplicated = ad_image_12_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_12_link_length_too_long = ad_image_12_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_12_link_required = ad_image_12_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_12_link_warning = ad_image_12_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_12_tag_duplicated = ad_image_12_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_12_tag_length_too_long = ad_image_12_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_12_tag_required = ad_image_12_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_13_link_duplicated = ad_image_13_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_13_link_length_too_long = ad_image_13_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_13_link_required = ad_image_13_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_13_link_warning = ad_image_13_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_13_tag_duplicated = ad_image_13_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_13_tag_length_too_long = ad_image_13_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_13_tag_required = ad_image_13_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_14_link_duplicated = ad_image_14_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_14_link_length_too_long = ad_image_14_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_14_link_required = ad_image_14_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_14_link_warning = ad_image_14_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_14_tag_duplicated = ad_image_14_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_14_tag_length_too_long = ad_image_14_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_14_tag_required = ad_image_14_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_15_link_duplicated = ad_image_15_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_15_link_length_too_long = ad_image_15_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_15_link_required = ad_image_15_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_15_link_warning = ad_image_15_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_15_tag_duplicated = ad_image_15_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_15_tag_length_too_long = ad_image_15_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_15_tag_required = ad_image_15_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_16_link_duplicated = ad_image_16_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_16_link_length_too_long = ad_image_16_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_16_link_required = ad_image_16_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_16_link_warning = ad_image_16_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_16_tag_duplicated = ad_image_16_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_16_tag_length_too_long = ad_image_16_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_16_tag_required = ad_image_16_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_17_link_duplicated = ad_image_17_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_17_link_length_too_long = ad_image_17_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_17_link_required = ad_image_17_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_17_link_warning = ad_image_17_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_17_tag_duplicated = ad_image_17_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_17_tag_length_too_long = ad_image_17_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_17_tag_required = ad_image_17_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_18_link_duplicated = ad_image_18_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_18_link_length_too_long = ad_image_18_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_18_link_required = ad_image_18_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_18_link_warning = ad_image_18_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_18_tag_duplicated = ad_image_18_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_18_tag_length_too_long = ad_image_18_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_18_tag_required = ad_image_18_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_19_link_duplicated = ad_image_19_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_19_link_length_too_long = ad_image_19_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_19_link_required = ad_image_19_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_19_link_warning = ad_image_19_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_19_tag_duplicated = ad_image_19_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_19_tag_length_too_long = ad_image_19_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_19_tag_required = ad_image_19_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_1_link_duplicated = ad_image_1_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_1_link_length_too_long = ad_image_1_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_1_link_required = ad_image_1_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_1_link_warning = ad_image_1_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_1_tag_duplicated = ad_image_1_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_1_tag_length_too_long = ad_image_1_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_1_tag_required = ad_image_1_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_2_link_duplicated = ad_image_2_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_2_link_length_too_long = ad_image_2_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_2_link_required = ad_image_2_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_2_link_warning = ad_image_2_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_2_tag_duplicated = ad_image_2_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_2_tag_length_too_long = ad_image_2_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_2_tag_required = ad_image_2_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_3_link_duplicated = ad_image_3_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_3_link_length_too_long = ad_image_3_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_3_link_required = ad_image_3_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_3_link_warning = ad_image_3_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_3_tag_duplicated = ad_image_3_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_3_tag_length_too_long = ad_image_3_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_3_tag_required = ad_image_3_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_4_link_duplicated = ad_image_4_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_4_link_length_too_long = ad_image_4_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_4_link_required = ad_image_4_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_4_link_warning = ad_image_4_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_4_tag_duplicated = ad_image_4_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_4_tag_length_too_long = ad_image_4_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_4_tag_required = ad_image_4_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_5_link_duplicated = ad_image_5_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_5_link_length_too_long = ad_image_5_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_5_link_required = ad_image_5_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_5_link_warning = ad_image_5_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_5_tag_duplicated = ad_image_5_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_5_tag_length_too_long = ad_image_5_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_5_tag_required = ad_image_5_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_6_link_duplicated = ad_image_6_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_6_link_length_too_long = ad_image_6_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_6_link_required = ad_image_6_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_6_link_warning = ad_image_6_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_6_tag_duplicated = ad_image_6_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_6_tag_length_too_long = ad_image_6_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_6_tag_required = ad_image_6_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_7_link_duplicated = ad_image_7_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_7_link_length_too_long = ad_image_7_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_7_link_required = ad_image_7_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_7_link_warning = ad_image_7_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_7_tag_duplicated = ad_image_7_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_7_tag_length_too_long = ad_image_7_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_7_tag_required = ad_image_7_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_8_link_duplicated = ad_image_8_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_8_link_length_too_long = ad_image_8_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_8_link_required = ad_image_8_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_8_link_warning = ad_image_8_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_8_tag_duplicated = ad_image_8_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_8_tag_length_too_long = ad_image_8_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_8_tag_required = ad_image_8_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_image_9_link_duplicated = ad_image_9_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_9_link_length_too_long = ad_image_9_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_9_link_required = ad_image_9_link_required;
    catalogs_feed_validation_warnings_local_var->ad_image_9_link_warning = ad_image_9_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_image_9_tag_duplicated = ad_image_9_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_image_9_tag_length_too_long = ad_image_9_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_image_9_tag_required = ad_image_9_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_link_format_warning = ad_link_format_warning;
    catalogs_feed_validation_warnings_local_var->ad_link_same_as_link = ad_link_same_as_link;
    catalogs_feed_validation_warnings_local_var->ad_video_0_link_duplicated = ad_video_0_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_video_0_link_length_too_long = ad_video_0_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_video_0_link_required = ad_video_0_link_required;
    catalogs_feed_validation_warnings_local_var->ad_video_0_link_warning = ad_video_0_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_video_0_tag_duplicated = ad_video_0_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_video_0_tag_length_too_long = ad_video_0_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_video_0_tag_required = ad_video_0_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_video_1_link_duplicated = ad_video_1_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_video_1_link_length_too_long = ad_video_1_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_video_1_link_required = ad_video_1_link_required;
    catalogs_feed_validation_warnings_local_var->ad_video_1_link_warning = ad_video_1_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_video_1_tag_duplicated = ad_video_1_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_video_1_tag_length_too_long = ad_video_1_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_video_1_tag_required = ad_video_1_tag_required;
    catalogs_feed_validation_warnings_local_var->ad_video_2_link_duplicated = ad_video_2_link_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_video_2_link_length_too_long = ad_video_2_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_video_2_link_required = ad_video_2_link_required;
    catalogs_feed_validation_warnings_local_var->ad_video_2_link_warning = ad_video_2_link_warning;
    catalogs_feed_validation_warnings_local_var->ad_video_2_tag_duplicated = ad_video_2_tag_duplicated;
    catalogs_feed_validation_warnings_local_var->ad_video_2_tag_length_too_long = ad_video_2_tag_length_too_long;
    catalogs_feed_validation_warnings_local_var->ad_video_2_tag_required = ad_video_2_tag_required;
    catalogs_feed_validation_warnings_local_var->additional_image_link_length_too_long = additional_image_link_length_too_long;
    catalogs_feed_validation_warnings_local_var->additional_image_link_warning = additional_image_link_warning;
    catalogs_feed_validation_warnings_local_var->adwords_format_warning = adwords_format_warning;
    catalogs_feed_validation_warnings_local_var->adwords_same_as_link = adwords_same_as_link;
    catalogs_feed_validation_warnings_local_var->age_group_invalid = age_group_invalid;
    catalogs_feed_validation_warnings_local_var->android_deep_link_invalid = android_deep_link_invalid;
    catalogs_feed_validation_warnings_local_var->availability_date_invalid = availability_date_invalid;
    catalogs_feed_validation_warnings_local_var->country_does_not_map_to_currency = country_does_not_map_to_currency;
    catalogs_feed_validation_warnings_local_var->custom_label_length_too_long = custom_label_length_too_long;
    catalogs_feed_validation_warnings_local_var->description_length_too_long = description_length_too_long;
    catalogs_feed_validation_warnings_local_var->duplicate_headers = duplicate_headers;
    catalogs_feed_validation_warnings_local_var->expiration_date_invalid = expiration_date_invalid;
    catalogs_feed_validation_warnings_local_var->fetch_same_signature = fetch_same_signature;
    catalogs_feed_validation_warnings_local_var->gender_invalid = gender_invalid;
    catalogs_feed_validation_warnings_local_var->gtin_invalid = gtin_invalid;
    catalogs_feed_validation_warnings_local_var->image_link_warning = image_link_warning;
    catalogs_feed_validation_warnings_local_var->inconsistent_currency_values = inconsistent_currency_values;
    catalogs_feed_validation_warnings_local_var->indexed_product_count_large_delta = indexed_product_count_large_delta;
    catalogs_feed_validation_warnings_local_var->ios_deep_link_invalid = ios_deep_link_invalid;
    catalogs_feed_validation_warnings_local_var->is_bundle_invalid = is_bundle_invalid;
    catalogs_feed_validation_warnings_local_var->item_additional_image_download_failure = item_additional_image_download_failure;
    catalogs_feed_validation_warnings_local_var->link_format_warning = link_format_warning;
    catalogs_feed_validation_warnings_local_var->min_ad_price_invalid = min_ad_price_invalid;
    catalogs_feed_validation_warnings_local_var->mpn_invalid = mpn_invalid;
    catalogs_feed_validation_warnings_local_var->multipack_invalid = multipack_invalid;
    catalogs_feed_validation_warnings_local_var->optional_condition_invalid = optional_condition_invalid;
    catalogs_feed_validation_warnings_local_var->optional_condition_missing = optional_condition_missing;
    catalogs_feed_validation_warnings_local_var->optional_product_category_invalid = optional_product_category_invalid;
    catalogs_feed_validation_warnings_local_var->optional_product_category_missing = optional_product_category_missing;
    catalogs_feed_validation_warnings_local_var->product_category_depth_warning = product_category_depth_warning;
    catalogs_feed_validation_warnings_local_var->product_type_length_too_long = product_type_length_too_long;
    catalogs_feed_validation_warnings_local_var->sale_date_invalid = sale_date_invalid;
    catalogs_feed_validation_warnings_local_var->sales_price_invalid = sales_price_invalid;
    catalogs_feed_validation_warnings_local_var->sales_price_too_high = sales_price_too_high;
    catalogs_feed_validation_warnings_local_var->sales_price_too_low = sales_price_too_low;
    catalogs_feed_validation_warnings_local_var->shipping_height_invalid = shipping_height_invalid;
    catalogs_feed_validation_warnings_local_var->shipping_invalid = shipping_invalid;
    catalogs_feed_validation_warnings_local_var->shipping_weight_invalid = shipping_weight_invalid;
    catalogs_feed_validation_warnings_local_var->shipping_width_invalid = shipping_width_invalid;
    catalogs_feed_validation_warnings_local_var->size_system_invalid = size_system_invalid;
    catalogs_feed_validation_warnings_local_var->size_type_invalid = size_type_invalid;
    catalogs_feed_validation_warnings_local_var->tax_invalid = tax_invalid;
    catalogs_feed_validation_warnings_local_var->title_length_too_long = title_length_too_long;
    catalogs_feed_validation_warnings_local_var->too_many_additional_image_links = too_many_additional_image_links;
    catalogs_feed_validation_warnings_local_var->updated_time_invalid = updated_time_invalid;
    catalogs_feed_validation_warnings_local_var->utm_source_auto_corrected = utm_source_auto_corrected;
    catalogs_feed_validation_warnings_local_var->video_required_when_ad_video_provided = video_required_when_ad_video_provided;
    catalogs_feed_validation_warnings_local_var->weight_unit_invalid = weight_unit_invalid;
    return catalogs_feed_validation_warnings_local_var;
}

__attribute__((deprecated)) catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings_create(
    int *ad_image_0_link_duplicated,
    int *ad_image_0_link_length_too_long,
    int *ad_image_0_link_required,
    int *ad_image_0_link_warning,
    int *ad_image_0_tag_duplicated,
    int *ad_image_0_tag_length_too_long,
    int *ad_image_0_tag_required,
    int *ad_image_10_link_duplicated,
    int *ad_image_10_link_length_too_long,
    int *ad_image_10_link_required,
    int *ad_image_10_link_warning,
    int *ad_image_10_tag_duplicated,
    int *ad_image_10_tag_length_too_long,
    int *ad_image_10_tag_required,
    int *ad_image_11_link_duplicated,
    int *ad_image_11_link_length_too_long,
    int *ad_image_11_link_required,
    int *ad_image_11_link_warning,
    int *ad_image_11_tag_duplicated,
    int *ad_image_11_tag_length_too_long,
    int *ad_image_11_tag_required,
    int *ad_image_12_link_duplicated,
    int *ad_image_12_link_length_too_long,
    int *ad_image_12_link_required,
    int *ad_image_12_link_warning,
    int *ad_image_12_tag_duplicated,
    int *ad_image_12_tag_length_too_long,
    int *ad_image_12_tag_required,
    int *ad_image_13_link_duplicated,
    int *ad_image_13_link_length_too_long,
    int *ad_image_13_link_required,
    int *ad_image_13_link_warning,
    int *ad_image_13_tag_duplicated,
    int *ad_image_13_tag_length_too_long,
    int *ad_image_13_tag_required,
    int *ad_image_14_link_duplicated,
    int *ad_image_14_link_length_too_long,
    int *ad_image_14_link_required,
    int *ad_image_14_link_warning,
    int *ad_image_14_tag_duplicated,
    int *ad_image_14_tag_length_too_long,
    int *ad_image_14_tag_required,
    int *ad_image_15_link_duplicated,
    int *ad_image_15_link_length_too_long,
    int *ad_image_15_link_required,
    int *ad_image_15_link_warning,
    int *ad_image_15_tag_duplicated,
    int *ad_image_15_tag_length_too_long,
    int *ad_image_15_tag_required,
    int *ad_image_16_link_duplicated,
    int *ad_image_16_link_length_too_long,
    int *ad_image_16_link_required,
    int *ad_image_16_link_warning,
    int *ad_image_16_tag_duplicated,
    int *ad_image_16_tag_length_too_long,
    int *ad_image_16_tag_required,
    int *ad_image_17_link_duplicated,
    int *ad_image_17_link_length_too_long,
    int *ad_image_17_link_required,
    int *ad_image_17_link_warning,
    int *ad_image_17_tag_duplicated,
    int *ad_image_17_tag_length_too_long,
    int *ad_image_17_tag_required,
    int *ad_image_18_link_duplicated,
    int *ad_image_18_link_length_too_long,
    int *ad_image_18_link_required,
    int *ad_image_18_link_warning,
    int *ad_image_18_tag_duplicated,
    int *ad_image_18_tag_length_too_long,
    int *ad_image_18_tag_required,
    int *ad_image_19_link_duplicated,
    int *ad_image_19_link_length_too_long,
    int *ad_image_19_link_required,
    int *ad_image_19_link_warning,
    int *ad_image_19_tag_duplicated,
    int *ad_image_19_tag_length_too_long,
    int *ad_image_19_tag_required,
    int *ad_image_1_link_duplicated,
    int *ad_image_1_link_length_too_long,
    int *ad_image_1_link_required,
    int *ad_image_1_link_warning,
    int *ad_image_1_tag_duplicated,
    int *ad_image_1_tag_length_too_long,
    int *ad_image_1_tag_required,
    int *ad_image_2_link_duplicated,
    int *ad_image_2_link_length_too_long,
    int *ad_image_2_link_required,
    int *ad_image_2_link_warning,
    int *ad_image_2_tag_duplicated,
    int *ad_image_2_tag_length_too_long,
    int *ad_image_2_tag_required,
    int *ad_image_3_link_duplicated,
    int *ad_image_3_link_length_too_long,
    int *ad_image_3_link_required,
    int *ad_image_3_link_warning,
    int *ad_image_3_tag_duplicated,
    int *ad_image_3_tag_length_too_long,
    int *ad_image_3_tag_required,
    int *ad_image_4_link_duplicated,
    int *ad_image_4_link_length_too_long,
    int *ad_image_4_link_required,
    int *ad_image_4_link_warning,
    int *ad_image_4_tag_duplicated,
    int *ad_image_4_tag_length_too_long,
    int *ad_image_4_tag_required,
    int *ad_image_5_link_duplicated,
    int *ad_image_5_link_length_too_long,
    int *ad_image_5_link_required,
    int *ad_image_5_link_warning,
    int *ad_image_5_tag_duplicated,
    int *ad_image_5_tag_length_too_long,
    int *ad_image_5_tag_required,
    int *ad_image_6_link_duplicated,
    int *ad_image_6_link_length_too_long,
    int *ad_image_6_link_required,
    int *ad_image_6_link_warning,
    int *ad_image_6_tag_duplicated,
    int *ad_image_6_tag_length_too_long,
    int *ad_image_6_tag_required,
    int *ad_image_7_link_duplicated,
    int *ad_image_7_link_length_too_long,
    int *ad_image_7_link_required,
    int *ad_image_7_link_warning,
    int *ad_image_7_tag_duplicated,
    int *ad_image_7_tag_length_too_long,
    int *ad_image_7_tag_required,
    int *ad_image_8_link_duplicated,
    int *ad_image_8_link_length_too_long,
    int *ad_image_8_link_required,
    int *ad_image_8_link_warning,
    int *ad_image_8_tag_duplicated,
    int *ad_image_8_tag_length_too_long,
    int *ad_image_8_tag_required,
    int *ad_image_9_link_duplicated,
    int *ad_image_9_link_length_too_long,
    int *ad_image_9_link_required,
    int *ad_image_9_link_warning,
    int *ad_image_9_tag_duplicated,
    int *ad_image_9_tag_length_too_long,
    int *ad_image_9_tag_required,
    int *ad_link_format_warning,
    int *ad_link_same_as_link,
    int *ad_video_0_link_duplicated,
    int *ad_video_0_link_length_too_long,
    int *ad_video_0_link_required,
    int *ad_video_0_link_warning,
    int *ad_video_0_tag_duplicated,
    int *ad_video_0_tag_length_too_long,
    int *ad_video_0_tag_required,
    int *ad_video_1_link_duplicated,
    int *ad_video_1_link_length_too_long,
    int *ad_video_1_link_required,
    int *ad_video_1_link_warning,
    int *ad_video_1_tag_duplicated,
    int *ad_video_1_tag_length_too_long,
    int *ad_video_1_tag_required,
    int *ad_video_2_link_duplicated,
    int *ad_video_2_link_length_too_long,
    int *ad_video_2_link_required,
    int *ad_video_2_link_warning,
    int *ad_video_2_tag_duplicated,
    int *ad_video_2_tag_length_too_long,
    int *ad_video_2_tag_required,
    int *additional_image_link_length_too_long,
    int *additional_image_link_warning,
    int *adwords_format_warning,
    int *adwords_same_as_link,
    int *age_group_invalid,
    int *android_deep_link_invalid,
    int *availability_date_invalid,
    int *country_does_not_map_to_currency,
    int *custom_label_length_too_long,
    int *description_length_too_long,
    int *duplicate_headers,
    int *expiration_date_invalid,
    int *fetch_same_signature,
    int *gender_invalid,
    int *gtin_invalid,
    int *image_link_warning,
    int *inconsistent_currency_values,
    int *indexed_product_count_large_delta,
    int *ios_deep_link_invalid,
    int *is_bundle_invalid,
    int *item_additional_image_download_failure,
    int *link_format_warning,
    int *min_ad_price_invalid,
    int *mpn_invalid,
    int *multipack_invalid,
    int *optional_condition_invalid,
    int *optional_condition_missing,
    int *optional_product_category_invalid,
    int *optional_product_category_missing,
    int *product_category_depth_warning,
    int *product_type_length_too_long,
    int *sale_date_invalid,
    int *sales_price_invalid,
    int *sales_price_too_high,
    int *sales_price_too_low,
    int *shipping_height_invalid,
    int *shipping_invalid,
    int *shipping_weight_invalid,
    int *shipping_width_invalid,
    int *size_system_invalid,
    int *size_type_invalid,
    int *tax_invalid,
    int *title_length_too_long,
    int *too_many_additional_image_links,
    int *updated_time_invalid,
    int *utm_source_auto_corrected,
    int *video_required_when_ad_video_provided,
    int *weight_unit_invalid
    ) {
    int *ad_image_0_link_duplicated_copy = NULL;
    if (ad_image_0_link_duplicated) {
        ad_image_0_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_0_link_duplicated_copy) *ad_image_0_link_duplicated_copy = *ad_image_0_link_duplicated;
    }
    int *ad_image_0_link_length_too_long_copy = NULL;
    if (ad_image_0_link_length_too_long) {
        ad_image_0_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_0_link_length_too_long_copy) *ad_image_0_link_length_too_long_copy = *ad_image_0_link_length_too_long;
    }
    int *ad_image_0_link_required_copy = NULL;
    if (ad_image_0_link_required) {
        ad_image_0_link_required_copy = malloc(sizeof(int));
        if (ad_image_0_link_required_copy) *ad_image_0_link_required_copy = *ad_image_0_link_required;
    }
    int *ad_image_0_link_warning_copy = NULL;
    if (ad_image_0_link_warning) {
        ad_image_0_link_warning_copy = malloc(sizeof(int));
        if (ad_image_0_link_warning_copy) *ad_image_0_link_warning_copy = *ad_image_0_link_warning;
    }
    int *ad_image_0_tag_duplicated_copy = NULL;
    if (ad_image_0_tag_duplicated) {
        ad_image_0_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_0_tag_duplicated_copy) *ad_image_0_tag_duplicated_copy = *ad_image_0_tag_duplicated;
    }
    int *ad_image_0_tag_length_too_long_copy = NULL;
    if (ad_image_0_tag_length_too_long) {
        ad_image_0_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_0_tag_length_too_long_copy) *ad_image_0_tag_length_too_long_copy = *ad_image_0_tag_length_too_long;
    }
    int *ad_image_0_tag_required_copy = NULL;
    if (ad_image_0_tag_required) {
        ad_image_0_tag_required_copy = malloc(sizeof(int));
        if (ad_image_0_tag_required_copy) *ad_image_0_tag_required_copy = *ad_image_0_tag_required;
    }
    int *ad_image_10_link_duplicated_copy = NULL;
    if (ad_image_10_link_duplicated) {
        ad_image_10_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_10_link_duplicated_copy) *ad_image_10_link_duplicated_copy = *ad_image_10_link_duplicated;
    }
    int *ad_image_10_link_length_too_long_copy = NULL;
    if (ad_image_10_link_length_too_long) {
        ad_image_10_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_10_link_length_too_long_copy) *ad_image_10_link_length_too_long_copy = *ad_image_10_link_length_too_long;
    }
    int *ad_image_10_link_required_copy = NULL;
    if (ad_image_10_link_required) {
        ad_image_10_link_required_copy = malloc(sizeof(int));
        if (ad_image_10_link_required_copy) *ad_image_10_link_required_copy = *ad_image_10_link_required;
    }
    int *ad_image_10_link_warning_copy = NULL;
    if (ad_image_10_link_warning) {
        ad_image_10_link_warning_copy = malloc(sizeof(int));
        if (ad_image_10_link_warning_copy) *ad_image_10_link_warning_copy = *ad_image_10_link_warning;
    }
    int *ad_image_10_tag_duplicated_copy = NULL;
    if (ad_image_10_tag_duplicated) {
        ad_image_10_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_10_tag_duplicated_copy) *ad_image_10_tag_duplicated_copy = *ad_image_10_tag_duplicated;
    }
    int *ad_image_10_tag_length_too_long_copy = NULL;
    if (ad_image_10_tag_length_too_long) {
        ad_image_10_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_10_tag_length_too_long_copy) *ad_image_10_tag_length_too_long_copy = *ad_image_10_tag_length_too_long;
    }
    int *ad_image_10_tag_required_copy = NULL;
    if (ad_image_10_tag_required) {
        ad_image_10_tag_required_copy = malloc(sizeof(int));
        if (ad_image_10_tag_required_copy) *ad_image_10_tag_required_copy = *ad_image_10_tag_required;
    }
    int *ad_image_11_link_duplicated_copy = NULL;
    if (ad_image_11_link_duplicated) {
        ad_image_11_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_11_link_duplicated_copy) *ad_image_11_link_duplicated_copy = *ad_image_11_link_duplicated;
    }
    int *ad_image_11_link_length_too_long_copy = NULL;
    if (ad_image_11_link_length_too_long) {
        ad_image_11_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_11_link_length_too_long_copy) *ad_image_11_link_length_too_long_copy = *ad_image_11_link_length_too_long;
    }
    int *ad_image_11_link_required_copy = NULL;
    if (ad_image_11_link_required) {
        ad_image_11_link_required_copy = malloc(sizeof(int));
        if (ad_image_11_link_required_copy) *ad_image_11_link_required_copy = *ad_image_11_link_required;
    }
    int *ad_image_11_link_warning_copy = NULL;
    if (ad_image_11_link_warning) {
        ad_image_11_link_warning_copy = malloc(sizeof(int));
        if (ad_image_11_link_warning_copy) *ad_image_11_link_warning_copy = *ad_image_11_link_warning;
    }
    int *ad_image_11_tag_duplicated_copy = NULL;
    if (ad_image_11_tag_duplicated) {
        ad_image_11_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_11_tag_duplicated_copy) *ad_image_11_tag_duplicated_copy = *ad_image_11_tag_duplicated;
    }
    int *ad_image_11_tag_length_too_long_copy = NULL;
    if (ad_image_11_tag_length_too_long) {
        ad_image_11_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_11_tag_length_too_long_copy) *ad_image_11_tag_length_too_long_copy = *ad_image_11_tag_length_too_long;
    }
    int *ad_image_11_tag_required_copy = NULL;
    if (ad_image_11_tag_required) {
        ad_image_11_tag_required_copy = malloc(sizeof(int));
        if (ad_image_11_tag_required_copy) *ad_image_11_tag_required_copy = *ad_image_11_tag_required;
    }
    int *ad_image_12_link_duplicated_copy = NULL;
    if (ad_image_12_link_duplicated) {
        ad_image_12_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_12_link_duplicated_copy) *ad_image_12_link_duplicated_copy = *ad_image_12_link_duplicated;
    }
    int *ad_image_12_link_length_too_long_copy = NULL;
    if (ad_image_12_link_length_too_long) {
        ad_image_12_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_12_link_length_too_long_copy) *ad_image_12_link_length_too_long_copy = *ad_image_12_link_length_too_long;
    }
    int *ad_image_12_link_required_copy = NULL;
    if (ad_image_12_link_required) {
        ad_image_12_link_required_copy = malloc(sizeof(int));
        if (ad_image_12_link_required_copy) *ad_image_12_link_required_copy = *ad_image_12_link_required;
    }
    int *ad_image_12_link_warning_copy = NULL;
    if (ad_image_12_link_warning) {
        ad_image_12_link_warning_copy = malloc(sizeof(int));
        if (ad_image_12_link_warning_copy) *ad_image_12_link_warning_copy = *ad_image_12_link_warning;
    }
    int *ad_image_12_tag_duplicated_copy = NULL;
    if (ad_image_12_tag_duplicated) {
        ad_image_12_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_12_tag_duplicated_copy) *ad_image_12_tag_duplicated_copy = *ad_image_12_tag_duplicated;
    }
    int *ad_image_12_tag_length_too_long_copy = NULL;
    if (ad_image_12_tag_length_too_long) {
        ad_image_12_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_12_tag_length_too_long_copy) *ad_image_12_tag_length_too_long_copy = *ad_image_12_tag_length_too_long;
    }
    int *ad_image_12_tag_required_copy = NULL;
    if (ad_image_12_tag_required) {
        ad_image_12_tag_required_copy = malloc(sizeof(int));
        if (ad_image_12_tag_required_copy) *ad_image_12_tag_required_copy = *ad_image_12_tag_required;
    }
    int *ad_image_13_link_duplicated_copy = NULL;
    if (ad_image_13_link_duplicated) {
        ad_image_13_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_13_link_duplicated_copy) *ad_image_13_link_duplicated_copy = *ad_image_13_link_duplicated;
    }
    int *ad_image_13_link_length_too_long_copy = NULL;
    if (ad_image_13_link_length_too_long) {
        ad_image_13_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_13_link_length_too_long_copy) *ad_image_13_link_length_too_long_copy = *ad_image_13_link_length_too_long;
    }
    int *ad_image_13_link_required_copy = NULL;
    if (ad_image_13_link_required) {
        ad_image_13_link_required_copy = malloc(sizeof(int));
        if (ad_image_13_link_required_copy) *ad_image_13_link_required_copy = *ad_image_13_link_required;
    }
    int *ad_image_13_link_warning_copy = NULL;
    if (ad_image_13_link_warning) {
        ad_image_13_link_warning_copy = malloc(sizeof(int));
        if (ad_image_13_link_warning_copy) *ad_image_13_link_warning_copy = *ad_image_13_link_warning;
    }
    int *ad_image_13_tag_duplicated_copy = NULL;
    if (ad_image_13_tag_duplicated) {
        ad_image_13_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_13_tag_duplicated_copy) *ad_image_13_tag_duplicated_copy = *ad_image_13_tag_duplicated;
    }
    int *ad_image_13_tag_length_too_long_copy = NULL;
    if (ad_image_13_tag_length_too_long) {
        ad_image_13_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_13_tag_length_too_long_copy) *ad_image_13_tag_length_too_long_copy = *ad_image_13_tag_length_too_long;
    }
    int *ad_image_13_tag_required_copy = NULL;
    if (ad_image_13_tag_required) {
        ad_image_13_tag_required_copy = malloc(sizeof(int));
        if (ad_image_13_tag_required_copy) *ad_image_13_tag_required_copy = *ad_image_13_tag_required;
    }
    int *ad_image_14_link_duplicated_copy = NULL;
    if (ad_image_14_link_duplicated) {
        ad_image_14_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_14_link_duplicated_copy) *ad_image_14_link_duplicated_copy = *ad_image_14_link_duplicated;
    }
    int *ad_image_14_link_length_too_long_copy = NULL;
    if (ad_image_14_link_length_too_long) {
        ad_image_14_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_14_link_length_too_long_copy) *ad_image_14_link_length_too_long_copy = *ad_image_14_link_length_too_long;
    }
    int *ad_image_14_link_required_copy = NULL;
    if (ad_image_14_link_required) {
        ad_image_14_link_required_copy = malloc(sizeof(int));
        if (ad_image_14_link_required_copy) *ad_image_14_link_required_copy = *ad_image_14_link_required;
    }
    int *ad_image_14_link_warning_copy = NULL;
    if (ad_image_14_link_warning) {
        ad_image_14_link_warning_copy = malloc(sizeof(int));
        if (ad_image_14_link_warning_copy) *ad_image_14_link_warning_copy = *ad_image_14_link_warning;
    }
    int *ad_image_14_tag_duplicated_copy = NULL;
    if (ad_image_14_tag_duplicated) {
        ad_image_14_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_14_tag_duplicated_copy) *ad_image_14_tag_duplicated_copy = *ad_image_14_tag_duplicated;
    }
    int *ad_image_14_tag_length_too_long_copy = NULL;
    if (ad_image_14_tag_length_too_long) {
        ad_image_14_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_14_tag_length_too_long_copy) *ad_image_14_tag_length_too_long_copy = *ad_image_14_tag_length_too_long;
    }
    int *ad_image_14_tag_required_copy = NULL;
    if (ad_image_14_tag_required) {
        ad_image_14_tag_required_copy = malloc(sizeof(int));
        if (ad_image_14_tag_required_copy) *ad_image_14_tag_required_copy = *ad_image_14_tag_required;
    }
    int *ad_image_15_link_duplicated_copy = NULL;
    if (ad_image_15_link_duplicated) {
        ad_image_15_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_15_link_duplicated_copy) *ad_image_15_link_duplicated_copy = *ad_image_15_link_duplicated;
    }
    int *ad_image_15_link_length_too_long_copy = NULL;
    if (ad_image_15_link_length_too_long) {
        ad_image_15_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_15_link_length_too_long_copy) *ad_image_15_link_length_too_long_copy = *ad_image_15_link_length_too_long;
    }
    int *ad_image_15_link_required_copy = NULL;
    if (ad_image_15_link_required) {
        ad_image_15_link_required_copy = malloc(sizeof(int));
        if (ad_image_15_link_required_copy) *ad_image_15_link_required_copy = *ad_image_15_link_required;
    }
    int *ad_image_15_link_warning_copy = NULL;
    if (ad_image_15_link_warning) {
        ad_image_15_link_warning_copy = malloc(sizeof(int));
        if (ad_image_15_link_warning_copy) *ad_image_15_link_warning_copy = *ad_image_15_link_warning;
    }
    int *ad_image_15_tag_duplicated_copy = NULL;
    if (ad_image_15_tag_duplicated) {
        ad_image_15_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_15_tag_duplicated_copy) *ad_image_15_tag_duplicated_copy = *ad_image_15_tag_duplicated;
    }
    int *ad_image_15_tag_length_too_long_copy = NULL;
    if (ad_image_15_tag_length_too_long) {
        ad_image_15_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_15_tag_length_too_long_copy) *ad_image_15_tag_length_too_long_copy = *ad_image_15_tag_length_too_long;
    }
    int *ad_image_15_tag_required_copy = NULL;
    if (ad_image_15_tag_required) {
        ad_image_15_tag_required_copy = malloc(sizeof(int));
        if (ad_image_15_tag_required_copy) *ad_image_15_tag_required_copy = *ad_image_15_tag_required;
    }
    int *ad_image_16_link_duplicated_copy = NULL;
    if (ad_image_16_link_duplicated) {
        ad_image_16_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_16_link_duplicated_copy) *ad_image_16_link_duplicated_copy = *ad_image_16_link_duplicated;
    }
    int *ad_image_16_link_length_too_long_copy = NULL;
    if (ad_image_16_link_length_too_long) {
        ad_image_16_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_16_link_length_too_long_copy) *ad_image_16_link_length_too_long_copy = *ad_image_16_link_length_too_long;
    }
    int *ad_image_16_link_required_copy = NULL;
    if (ad_image_16_link_required) {
        ad_image_16_link_required_copy = malloc(sizeof(int));
        if (ad_image_16_link_required_copy) *ad_image_16_link_required_copy = *ad_image_16_link_required;
    }
    int *ad_image_16_link_warning_copy = NULL;
    if (ad_image_16_link_warning) {
        ad_image_16_link_warning_copy = malloc(sizeof(int));
        if (ad_image_16_link_warning_copy) *ad_image_16_link_warning_copy = *ad_image_16_link_warning;
    }
    int *ad_image_16_tag_duplicated_copy = NULL;
    if (ad_image_16_tag_duplicated) {
        ad_image_16_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_16_tag_duplicated_copy) *ad_image_16_tag_duplicated_copy = *ad_image_16_tag_duplicated;
    }
    int *ad_image_16_tag_length_too_long_copy = NULL;
    if (ad_image_16_tag_length_too_long) {
        ad_image_16_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_16_tag_length_too_long_copy) *ad_image_16_tag_length_too_long_copy = *ad_image_16_tag_length_too_long;
    }
    int *ad_image_16_tag_required_copy = NULL;
    if (ad_image_16_tag_required) {
        ad_image_16_tag_required_copy = malloc(sizeof(int));
        if (ad_image_16_tag_required_copy) *ad_image_16_tag_required_copy = *ad_image_16_tag_required;
    }
    int *ad_image_17_link_duplicated_copy = NULL;
    if (ad_image_17_link_duplicated) {
        ad_image_17_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_17_link_duplicated_copy) *ad_image_17_link_duplicated_copy = *ad_image_17_link_duplicated;
    }
    int *ad_image_17_link_length_too_long_copy = NULL;
    if (ad_image_17_link_length_too_long) {
        ad_image_17_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_17_link_length_too_long_copy) *ad_image_17_link_length_too_long_copy = *ad_image_17_link_length_too_long;
    }
    int *ad_image_17_link_required_copy = NULL;
    if (ad_image_17_link_required) {
        ad_image_17_link_required_copy = malloc(sizeof(int));
        if (ad_image_17_link_required_copy) *ad_image_17_link_required_copy = *ad_image_17_link_required;
    }
    int *ad_image_17_link_warning_copy = NULL;
    if (ad_image_17_link_warning) {
        ad_image_17_link_warning_copy = malloc(sizeof(int));
        if (ad_image_17_link_warning_copy) *ad_image_17_link_warning_copy = *ad_image_17_link_warning;
    }
    int *ad_image_17_tag_duplicated_copy = NULL;
    if (ad_image_17_tag_duplicated) {
        ad_image_17_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_17_tag_duplicated_copy) *ad_image_17_tag_duplicated_copy = *ad_image_17_tag_duplicated;
    }
    int *ad_image_17_tag_length_too_long_copy = NULL;
    if (ad_image_17_tag_length_too_long) {
        ad_image_17_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_17_tag_length_too_long_copy) *ad_image_17_tag_length_too_long_copy = *ad_image_17_tag_length_too_long;
    }
    int *ad_image_17_tag_required_copy = NULL;
    if (ad_image_17_tag_required) {
        ad_image_17_tag_required_copy = malloc(sizeof(int));
        if (ad_image_17_tag_required_copy) *ad_image_17_tag_required_copy = *ad_image_17_tag_required;
    }
    int *ad_image_18_link_duplicated_copy = NULL;
    if (ad_image_18_link_duplicated) {
        ad_image_18_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_18_link_duplicated_copy) *ad_image_18_link_duplicated_copy = *ad_image_18_link_duplicated;
    }
    int *ad_image_18_link_length_too_long_copy = NULL;
    if (ad_image_18_link_length_too_long) {
        ad_image_18_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_18_link_length_too_long_copy) *ad_image_18_link_length_too_long_copy = *ad_image_18_link_length_too_long;
    }
    int *ad_image_18_link_required_copy = NULL;
    if (ad_image_18_link_required) {
        ad_image_18_link_required_copy = malloc(sizeof(int));
        if (ad_image_18_link_required_copy) *ad_image_18_link_required_copy = *ad_image_18_link_required;
    }
    int *ad_image_18_link_warning_copy = NULL;
    if (ad_image_18_link_warning) {
        ad_image_18_link_warning_copy = malloc(sizeof(int));
        if (ad_image_18_link_warning_copy) *ad_image_18_link_warning_copy = *ad_image_18_link_warning;
    }
    int *ad_image_18_tag_duplicated_copy = NULL;
    if (ad_image_18_tag_duplicated) {
        ad_image_18_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_18_tag_duplicated_copy) *ad_image_18_tag_duplicated_copy = *ad_image_18_tag_duplicated;
    }
    int *ad_image_18_tag_length_too_long_copy = NULL;
    if (ad_image_18_tag_length_too_long) {
        ad_image_18_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_18_tag_length_too_long_copy) *ad_image_18_tag_length_too_long_copy = *ad_image_18_tag_length_too_long;
    }
    int *ad_image_18_tag_required_copy = NULL;
    if (ad_image_18_tag_required) {
        ad_image_18_tag_required_copy = malloc(sizeof(int));
        if (ad_image_18_tag_required_copy) *ad_image_18_tag_required_copy = *ad_image_18_tag_required;
    }
    int *ad_image_19_link_duplicated_copy = NULL;
    if (ad_image_19_link_duplicated) {
        ad_image_19_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_19_link_duplicated_copy) *ad_image_19_link_duplicated_copy = *ad_image_19_link_duplicated;
    }
    int *ad_image_19_link_length_too_long_copy = NULL;
    if (ad_image_19_link_length_too_long) {
        ad_image_19_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_19_link_length_too_long_copy) *ad_image_19_link_length_too_long_copy = *ad_image_19_link_length_too_long;
    }
    int *ad_image_19_link_required_copy = NULL;
    if (ad_image_19_link_required) {
        ad_image_19_link_required_copy = malloc(sizeof(int));
        if (ad_image_19_link_required_copy) *ad_image_19_link_required_copy = *ad_image_19_link_required;
    }
    int *ad_image_19_link_warning_copy = NULL;
    if (ad_image_19_link_warning) {
        ad_image_19_link_warning_copy = malloc(sizeof(int));
        if (ad_image_19_link_warning_copy) *ad_image_19_link_warning_copy = *ad_image_19_link_warning;
    }
    int *ad_image_19_tag_duplicated_copy = NULL;
    if (ad_image_19_tag_duplicated) {
        ad_image_19_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_19_tag_duplicated_copy) *ad_image_19_tag_duplicated_copy = *ad_image_19_tag_duplicated;
    }
    int *ad_image_19_tag_length_too_long_copy = NULL;
    if (ad_image_19_tag_length_too_long) {
        ad_image_19_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_19_tag_length_too_long_copy) *ad_image_19_tag_length_too_long_copy = *ad_image_19_tag_length_too_long;
    }
    int *ad_image_19_tag_required_copy = NULL;
    if (ad_image_19_tag_required) {
        ad_image_19_tag_required_copy = malloc(sizeof(int));
        if (ad_image_19_tag_required_copy) *ad_image_19_tag_required_copy = *ad_image_19_tag_required;
    }
    int *ad_image_1_link_duplicated_copy = NULL;
    if (ad_image_1_link_duplicated) {
        ad_image_1_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_1_link_duplicated_copy) *ad_image_1_link_duplicated_copy = *ad_image_1_link_duplicated;
    }
    int *ad_image_1_link_length_too_long_copy = NULL;
    if (ad_image_1_link_length_too_long) {
        ad_image_1_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_1_link_length_too_long_copy) *ad_image_1_link_length_too_long_copy = *ad_image_1_link_length_too_long;
    }
    int *ad_image_1_link_required_copy = NULL;
    if (ad_image_1_link_required) {
        ad_image_1_link_required_copy = malloc(sizeof(int));
        if (ad_image_1_link_required_copy) *ad_image_1_link_required_copy = *ad_image_1_link_required;
    }
    int *ad_image_1_link_warning_copy = NULL;
    if (ad_image_1_link_warning) {
        ad_image_1_link_warning_copy = malloc(sizeof(int));
        if (ad_image_1_link_warning_copy) *ad_image_1_link_warning_copy = *ad_image_1_link_warning;
    }
    int *ad_image_1_tag_duplicated_copy = NULL;
    if (ad_image_1_tag_duplicated) {
        ad_image_1_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_1_tag_duplicated_copy) *ad_image_1_tag_duplicated_copy = *ad_image_1_tag_duplicated;
    }
    int *ad_image_1_tag_length_too_long_copy = NULL;
    if (ad_image_1_tag_length_too_long) {
        ad_image_1_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_1_tag_length_too_long_copy) *ad_image_1_tag_length_too_long_copy = *ad_image_1_tag_length_too_long;
    }
    int *ad_image_1_tag_required_copy = NULL;
    if (ad_image_1_tag_required) {
        ad_image_1_tag_required_copy = malloc(sizeof(int));
        if (ad_image_1_tag_required_copy) *ad_image_1_tag_required_copy = *ad_image_1_tag_required;
    }
    int *ad_image_2_link_duplicated_copy = NULL;
    if (ad_image_2_link_duplicated) {
        ad_image_2_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_2_link_duplicated_copy) *ad_image_2_link_duplicated_copy = *ad_image_2_link_duplicated;
    }
    int *ad_image_2_link_length_too_long_copy = NULL;
    if (ad_image_2_link_length_too_long) {
        ad_image_2_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_2_link_length_too_long_copy) *ad_image_2_link_length_too_long_copy = *ad_image_2_link_length_too_long;
    }
    int *ad_image_2_link_required_copy = NULL;
    if (ad_image_2_link_required) {
        ad_image_2_link_required_copy = malloc(sizeof(int));
        if (ad_image_2_link_required_copy) *ad_image_2_link_required_copy = *ad_image_2_link_required;
    }
    int *ad_image_2_link_warning_copy = NULL;
    if (ad_image_2_link_warning) {
        ad_image_2_link_warning_copy = malloc(sizeof(int));
        if (ad_image_2_link_warning_copy) *ad_image_2_link_warning_copy = *ad_image_2_link_warning;
    }
    int *ad_image_2_tag_duplicated_copy = NULL;
    if (ad_image_2_tag_duplicated) {
        ad_image_2_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_2_tag_duplicated_copy) *ad_image_2_tag_duplicated_copy = *ad_image_2_tag_duplicated;
    }
    int *ad_image_2_tag_length_too_long_copy = NULL;
    if (ad_image_2_tag_length_too_long) {
        ad_image_2_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_2_tag_length_too_long_copy) *ad_image_2_tag_length_too_long_copy = *ad_image_2_tag_length_too_long;
    }
    int *ad_image_2_tag_required_copy = NULL;
    if (ad_image_2_tag_required) {
        ad_image_2_tag_required_copy = malloc(sizeof(int));
        if (ad_image_2_tag_required_copy) *ad_image_2_tag_required_copy = *ad_image_2_tag_required;
    }
    int *ad_image_3_link_duplicated_copy = NULL;
    if (ad_image_3_link_duplicated) {
        ad_image_3_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_3_link_duplicated_copy) *ad_image_3_link_duplicated_copy = *ad_image_3_link_duplicated;
    }
    int *ad_image_3_link_length_too_long_copy = NULL;
    if (ad_image_3_link_length_too_long) {
        ad_image_3_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_3_link_length_too_long_copy) *ad_image_3_link_length_too_long_copy = *ad_image_3_link_length_too_long;
    }
    int *ad_image_3_link_required_copy = NULL;
    if (ad_image_3_link_required) {
        ad_image_3_link_required_copy = malloc(sizeof(int));
        if (ad_image_3_link_required_copy) *ad_image_3_link_required_copy = *ad_image_3_link_required;
    }
    int *ad_image_3_link_warning_copy = NULL;
    if (ad_image_3_link_warning) {
        ad_image_3_link_warning_copy = malloc(sizeof(int));
        if (ad_image_3_link_warning_copy) *ad_image_3_link_warning_copy = *ad_image_3_link_warning;
    }
    int *ad_image_3_tag_duplicated_copy = NULL;
    if (ad_image_3_tag_duplicated) {
        ad_image_3_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_3_tag_duplicated_copy) *ad_image_3_tag_duplicated_copy = *ad_image_3_tag_duplicated;
    }
    int *ad_image_3_tag_length_too_long_copy = NULL;
    if (ad_image_3_tag_length_too_long) {
        ad_image_3_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_3_tag_length_too_long_copy) *ad_image_3_tag_length_too_long_copy = *ad_image_3_tag_length_too_long;
    }
    int *ad_image_3_tag_required_copy = NULL;
    if (ad_image_3_tag_required) {
        ad_image_3_tag_required_copy = malloc(sizeof(int));
        if (ad_image_3_tag_required_copy) *ad_image_3_tag_required_copy = *ad_image_3_tag_required;
    }
    int *ad_image_4_link_duplicated_copy = NULL;
    if (ad_image_4_link_duplicated) {
        ad_image_4_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_4_link_duplicated_copy) *ad_image_4_link_duplicated_copy = *ad_image_4_link_duplicated;
    }
    int *ad_image_4_link_length_too_long_copy = NULL;
    if (ad_image_4_link_length_too_long) {
        ad_image_4_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_4_link_length_too_long_copy) *ad_image_4_link_length_too_long_copy = *ad_image_4_link_length_too_long;
    }
    int *ad_image_4_link_required_copy = NULL;
    if (ad_image_4_link_required) {
        ad_image_4_link_required_copy = malloc(sizeof(int));
        if (ad_image_4_link_required_copy) *ad_image_4_link_required_copy = *ad_image_4_link_required;
    }
    int *ad_image_4_link_warning_copy = NULL;
    if (ad_image_4_link_warning) {
        ad_image_4_link_warning_copy = malloc(sizeof(int));
        if (ad_image_4_link_warning_copy) *ad_image_4_link_warning_copy = *ad_image_4_link_warning;
    }
    int *ad_image_4_tag_duplicated_copy = NULL;
    if (ad_image_4_tag_duplicated) {
        ad_image_4_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_4_tag_duplicated_copy) *ad_image_4_tag_duplicated_copy = *ad_image_4_tag_duplicated;
    }
    int *ad_image_4_tag_length_too_long_copy = NULL;
    if (ad_image_4_tag_length_too_long) {
        ad_image_4_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_4_tag_length_too_long_copy) *ad_image_4_tag_length_too_long_copy = *ad_image_4_tag_length_too_long;
    }
    int *ad_image_4_tag_required_copy = NULL;
    if (ad_image_4_tag_required) {
        ad_image_4_tag_required_copy = malloc(sizeof(int));
        if (ad_image_4_tag_required_copy) *ad_image_4_tag_required_copy = *ad_image_4_tag_required;
    }
    int *ad_image_5_link_duplicated_copy = NULL;
    if (ad_image_5_link_duplicated) {
        ad_image_5_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_5_link_duplicated_copy) *ad_image_5_link_duplicated_copy = *ad_image_5_link_duplicated;
    }
    int *ad_image_5_link_length_too_long_copy = NULL;
    if (ad_image_5_link_length_too_long) {
        ad_image_5_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_5_link_length_too_long_copy) *ad_image_5_link_length_too_long_copy = *ad_image_5_link_length_too_long;
    }
    int *ad_image_5_link_required_copy = NULL;
    if (ad_image_5_link_required) {
        ad_image_5_link_required_copy = malloc(sizeof(int));
        if (ad_image_5_link_required_copy) *ad_image_5_link_required_copy = *ad_image_5_link_required;
    }
    int *ad_image_5_link_warning_copy = NULL;
    if (ad_image_5_link_warning) {
        ad_image_5_link_warning_copy = malloc(sizeof(int));
        if (ad_image_5_link_warning_copy) *ad_image_5_link_warning_copy = *ad_image_5_link_warning;
    }
    int *ad_image_5_tag_duplicated_copy = NULL;
    if (ad_image_5_tag_duplicated) {
        ad_image_5_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_5_tag_duplicated_copy) *ad_image_5_tag_duplicated_copy = *ad_image_5_tag_duplicated;
    }
    int *ad_image_5_tag_length_too_long_copy = NULL;
    if (ad_image_5_tag_length_too_long) {
        ad_image_5_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_5_tag_length_too_long_copy) *ad_image_5_tag_length_too_long_copy = *ad_image_5_tag_length_too_long;
    }
    int *ad_image_5_tag_required_copy = NULL;
    if (ad_image_5_tag_required) {
        ad_image_5_tag_required_copy = malloc(sizeof(int));
        if (ad_image_5_tag_required_copy) *ad_image_5_tag_required_copy = *ad_image_5_tag_required;
    }
    int *ad_image_6_link_duplicated_copy = NULL;
    if (ad_image_6_link_duplicated) {
        ad_image_6_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_6_link_duplicated_copy) *ad_image_6_link_duplicated_copy = *ad_image_6_link_duplicated;
    }
    int *ad_image_6_link_length_too_long_copy = NULL;
    if (ad_image_6_link_length_too_long) {
        ad_image_6_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_6_link_length_too_long_copy) *ad_image_6_link_length_too_long_copy = *ad_image_6_link_length_too_long;
    }
    int *ad_image_6_link_required_copy = NULL;
    if (ad_image_6_link_required) {
        ad_image_6_link_required_copy = malloc(sizeof(int));
        if (ad_image_6_link_required_copy) *ad_image_6_link_required_copy = *ad_image_6_link_required;
    }
    int *ad_image_6_link_warning_copy = NULL;
    if (ad_image_6_link_warning) {
        ad_image_6_link_warning_copy = malloc(sizeof(int));
        if (ad_image_6_link_warning_copy) *ad_image_6_link_warning_copy = *ad_image_6_link_warning;
    }
    int *ad_image_6_tag_duplicated_copy = NULL;
    if (ad_image_6_tag_duplicated) {
        ad_image_6_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_6_tag_duplicated_copy) *ad_image_6_tag_duplicated_copy = *ad_image_6_tag_duplicated;
    }
    int *ad_image_6_tag_length_too_long_copy = NULL;
    if (ad_image_6_tag_length_too_long) {
        ad_image_6_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_6_tag_length_too_long_copy) *ad_image_6_tag_length_too_long_copy = *ad_image_6_tag_length_too_long;
    }
    int *ad_image_6_tag_required_copy = NULL;
    if (ad_image_6_tag_required) {
        ad_image_6_tag_required_copy = malloc(sizeof(int));
        if (ad_image_6_tag_required_copy) *ad_image_6_tag_required_copy = *ad_image_6_tag_required;
    }
    int *ad_image_7_link_duplicated_copy = NULL;
    if (ad_image_7_link_duplicated) {
        ad_image_7_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_7_link_duplicated_copy) *ad_image_7_link_duplicated_copy = *ad_image_7_link_duplicated;
    }
    int *ad_image_7_link_length_too_long_copy = NULL;
    if (ad_image_7_link_length_too_long) {
        ad_image_7_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_7_link_length_too_long_copy) *ad_image_7_link_length_too_long_copy = *ad_image_7_link_length_too_long;
    }
    int *ad_image_7_link_required_copy = NULL;
    if (ad_image_7_link_required) {
        ad_image_7_link_required_copy = malloc(sizeof(int));
        if (ad_image_7_link_required_copy) *ad_image_7_link_required_copy = *ad_image_7_link_required;
    }
    int *ad_image_7_link_warning_copy = NULL;
    if (ad_image_7_link_warning) {
        ad_image_7_link_warning_copy = malloc(sizeof(int));
        if (ad_image_7_link_warning_copy) *ad_image_7_link_warning_copy = *ad_image_7_link_warning;
    }
    int *ad_image_7_tag_duplicated_copy = NULL;
    if (ad_image_7_tag_duplicated) {
        ad_image_7_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_7_tag_duplicated_copy) *ad_image_7_tag_duplicated_copy = *ad_image_7_tag_duplicated;
    }
    int *ad_image_7_tag_length_too_long_copy = NULL;
    if (ad_image_7_tag_length_too_long) {
        ad_image_7_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_7_tag_length_too_long_copy) *ad_image_7_tag_length_too_long_copy = *ad_image_7_tag_length_too_long;
    }
    int *ad_image_7_tag_required_copy = NULL;
    if (ad_image_7_tag_required) {
        ad_image_7_tag_required_copy = malloc(sizeof(int));
        if (ad_image_7_tag_required_copy) *ad_image_7_tag_required_copy = *ad_image_7_tag_required;
    }
    int *ad_image_8_link_duplicated_copy = NULL;
    if (ad_image_8_link_duplicated) {
        ad_image_8_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_8_link_duplicated_copy) *ad_image_8_link_duplicated_copy = *ad_image_8_link_duplicated;
    }
    int *ad_image_8_link_length_too_long_copy = NULL;
    if (ad_image_8_link_length_too_long) {
        ad_image_8_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_8_link_length_too_long_copy) *ad_image_8_link_length_too_long_copy = *ad_image_8_link_length_too_long;
    }
    int *ad_image_8_link_required_copy = NULL;
    if (ad_image_8_link_required) {
        ad_image_8_link_required_copy = malloc(sizeof(int));
        if (ad_image_8_link_required_copy) *ad_image_8_link_required_copy = *ad_image_8_link_required;
    }
    int *ad_image_8_link_warning_copy = NULL;
    if (ad_image_8_link_warning) {
        ad_image_8_link_warning_copy = malloc(sizeof(int));
        if (ad_image_8_link_warning_copy) *ad_image_8_link_warning_copy = *ad_image_8_link_warning;
    }
    int *ad_image_8_tag_duplicated_copy = NULL;
    if (ad_image_8_tag_duplicated) {
        ad_image_8_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_8_tag_duplicated_copy) *ad_image_8_tag_duplicated_copy = *ad_image_8_tag_duplicated;
    }
    int *ad_image_8_tag_length_too_long_copy = NULL;
    if (ad_image_8_tag_length_too_long) {
        ad_image_8_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_8_tag_length_too_long_copy) *ad_image_8_tag_length_too_long_copy = *ad_image_8_tag_length_too_long;
    }
    int *ad_image_8_tag_required_copy = NULL;
    if (ad_image_8_tag_required) {
        ad_image_8_tag_required_copy = malloc(sizeof(int));
        if (ad_image_8_tag_required_copy) *ad_image_8_tag_required_copy = *ad_image_8_tag_required;
    }
    int *ad_image_9_link_duplicated_copy = NULL;
    if (ad_image_9_link_duplicated) {
        ad_image_9_link_duplicated_copy = malloc(sizeof(int));
        if (ad_image_9_link_duplicated_copy) *ad_image_9_link_duplicated_copy = *ad_image_9_link_duplicated;
    }
    int *ad_image_9_link_length_too_long_copy = NULL;
    if (ad_image_9_link_length_too_long) {
        ad_image_9_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_9_link_length_too_long_copy) *ad_image_9_link_length_too_long_copy = *ad_image_9_link_length_too_long;
    }
    int *ad_image_9_link_required_copy = NULL;
    if (ad_image_9_link_required) {
        ad_image_9_link_required_copy = malloc(sizeof(int));
        if (ad_image_9_link_required_copy) *ad_image_9_link_required_copy = *ad_image_9_link_required;
    }
    int *ad_image_9_link_warning_copy = NULL;
    if (ad_image_9_link_warning) {
        ad_image_9_link_warning_copy = malloc(sizeof(int));
        if (ad_image_9_link_warning_copy) *ad_image_9_link_warning_copy = *ad_image_9_link_warning;
    }
    int *ad_image_9_tag_duplicated_copy = NULL;
    if (ad_image_9_tag_duplicated) {
        ad_image_9_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_image_9_tag_duplicated_copy) *ad_image_9_tag_duplicated_copy = *ad_image_9_tag_duplicated;
    }
    int *ad_image_9_tag_length_too_long_copy = NULL;
    if (ad_image_9_tag_length_too_long) {
        ad_image_9_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_image_9_tag_length_too_long_copy) *ad_image_9_tag_length_too_long_copy = *ad_image_9_tag_length_too_long;
    }
    int *ad_image_9_tag_required_copy = NULL;
    if (ad_image_9_tag_required) {
        ad_image_9_tag_required_copy = malloc(sizeof(int));
        if (ad_image_9_tag_required_copy) *ad_image_9_tag_required_copy = *ad_image_9_tag_required;
    }
    int *ad_link_format_warning_copy = NULL;
    if (ad_link_format_warning) {
        ad_link_format_warning_copy = malloc(sizeof(int));
        if (ad_link_format_warning_copy) *ad_link_format_warning_copy = *ad_link_format_warning;
    }
    int *ad_link_same_as_link_copy = NULL;
    if (ad_link_same_as_link) {
        ad_link_same_as_link_copy = malloc(sizeof(int));
        if (ad_link_same_as_link_copy) *ad_link_same_as_link_copy = *ad_link_same_as_link;
    }
    int *ad_video_0_link_duplicated_copy = NULL;
    if (ad_video_0_link_duplicated) {
        ad_video_0_link_duplicated_copy = malloc(sizeof(int));
        if (ad_video_0_link_duplicated_copy) *ad_video_0_link_duplicated_copy = *ad_video_0_link_duplicated;
    }
    int *ad_video_0_link_length_too_long_copy = NULL;
    if (ad_video_0_link_length_too_long) {
        ad_video_0_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_video_0_link_length_too_long_copy) *ad_video_0_link_length_too_long_copy = *ad_video_0_link_length_too_long;
    }
    int *ad_video_0_link_required_copy = NULL;
    if (ad_video_0_link_required) {
        ad_video_0_link_required_copy = malloc(sizeof(int));
        if (ad_video_0_link_required_copy) *ad_video_0_link_required_copy = *ad_video_0_link_required;
    }
    int *ad_video_0_link_warning_copy = NULL;
    if (ad_video_0_link_warning) {
        ad_video_0_link_warning_copy = malloc(sizeof(int));
        if (ad_video_0_link_warning_copy) *ad_video_0_link_warning_copy = *ad_video_0_link_warning;
    }
    int *ad_video_0_tag_duplicated_copy = NULL;
    if (ad_video_0_tag_duplicated) {
        ad_video_0_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_video_0_tag_duplicated_copy) *ad_video_0_tag_duplicated_copy = *ad_video_0_tag_duplicated;
    }
    int *ad_video_0_tag_length_too_long_copy = NULL;
    if (ad_video_0_tag_length_too_long) {
        ad_video_0_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_video_0_tag_length_too_long_copy) *ad_video_0_tag_length_too_long_copy = *ad_video_0_tag_length_too_long;
    }
    int *ad_video_0_tag_required_copy = NULL;
    if (ad_video_0_tag_required) {
        ad_video_0_tag_required_copy = malloc(sizeof(int));
        if (ad_video_0_tag_required_copy) *ad_video_0_tag_required_copy = *ad_video_0_tag_required;
    }
    int *ad_video_1_link_duplicated_copy = NULL;
    if (ad_video_1_link_duplicated) {
        ad_video_1_link_duplicated_copy = malloc(sizeof(int));
        if (ad_video_1_link_duplicated_copy) *ad_video_1_link_duplicated_copy = *ad_video_1_link_duplicated;
    }
    int *ad_video_1_link_length_too_long_copy = NULL;
    if (ad_video_1_link_length_too_long) {
        ad_video_1_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_video_1_link_length_too_long_copy) *ad_video_1_link_length_too_long_copy = *ad_video_1_link_length_too_long;
    }
    int *ad_video_1_link_required_copy = NULL;
    if (ad_video_1_link_required) {
        ad_video_1_link_required_copy = malloc(sizeof(int));
        if (ad_video_1_link_required_copy) *ad_video_1_link_required_copy = *ad_video_1_link_required;
    }
    int *ad_video_1_link_warning_copy = NULL;
    if (ad_video_1_link_warning) {
        ad_video_1_link_warning_copy = malloc(sizeof(int));
        if (ad_video_1_link_warning_copy) *ad_video_1_link_warning_copy = *ad_video_1_link_warning;
    }
    int *ad_video_1_tag_duplicated_copy = NULL;
    if (ad_video_1_tag_duplicated) {
        ad_video_1_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_video_1_tag_duplicated_copy) *ad_video_1_tag_duplicated_copy = *ad_video_1_tag_duplicated;
    }
    int *ad_video_1_tag_length_too_long_copy = NULL;
    if (ad_video_1_tag_length_too_long) {
        ad_video_1_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_video_1_tag_length_too_long_copy) *ad_video_1_tag_length_too_long_copy = *ad_video_1_tag_length_too_long;
    }
    int *ad_video_1_tag_required_copy = NULL;
    if (ad_video_1_tag_required) {
        ad_video_1_tag_required_copy = malloc(sizeof(int));
        if (ad_video_1_tag_required_copy) *ad_video_1_tag_required_copy = *ad_video_1_tag_required;
    }
    int *ad_video_2_link_duplicated_copy = NULL;
    if (ad_video_2_link_duplicated) {
        ad_video_2_link_duplicated_copy = malloc(sizeof(int));
        if (ad_video_2_link_duplicated_copy) *ad_video_2_link_duplicated_copy = *ad_video_2_link_duplicated;
    }
    int *ad_video_2_link_length_too_long_copy = NULL;
    if (ad_video_2_link_length_too_long) {
        ad_video_2_link_length_too_long_copy = malloc(sizeof(int));
        if (ad_video_2_link_length_too_long_copy) *ad_video_2_link_length_too_long_copy = *ad_video_2_link_length_too_long;
    }
    int *ad_video_2_link_required_copy = NULL;
    if (ad_video_2_link_required) {
        ad_video_2_link_required_copy = malloc(sizeof(int));
        if (ad_video_2_link_required_copy) *ad_video_2_link_required_copy = *ad_video_2_link_required;
    }
    int *ad_video_2_link_warning_copy = NULL;
    if (ad_video_2_link_warning) {
        ad_video_2_link_warning_copy = malloc(sizeof(int));
        if (ad_video_2_link_warning_copy) *ad_video_2_link_warning_copy = *ad_video_2_link_warning;
    }
    int *ad_video_2_tag_duplicated_copy = NULL;
    if (ad_video_2_tag_duplicated) {
        ad_video_2_tag_duplicated_copy = malloc(sizeof(int));
        if (ad_video_2_tag_duplicated_copy) *ad_video_2_tag_duplicated_copy = *ad_video_2_tag_duplicated;
    }
    int *ad_video_2_tag_length_too_long_copy = NULL;
    if (ad_video_2_tag_length_too_long) {
        ad_video_2_tag_length_too_long_copy = malloc(sizeof(int));
        if (ad_video_2_tag_length_too_long_copy) *ad_video_2_tag_length_too_long_copy = *ad_video_2_tag_length_too_long;
    }
    int *ad_video_2_tag_required_copy = NULL;
    if (ad_video_2_tag_required) {
        ad_video_2_tag_required_copy = malloc(sizeof(int));
        if (ad_video_2_tag_required_copy) *ad_video_2_tag_required_copy = *ad_video_2_tag_required;
    }
    int *additional_image_link_length_too_long_copy = NULL;
    if (additional_image_link_length_too_long) {
        additional_image_link_length_too_long_copy = malloc(sizeof(int));
        if (additional_image_link_length_too_long_copy) *additional_image_link_length_too_long_copy = *additional_image_link_length_too_long;
    }
    int *additional_image_link_warning_copy = NULL;
    if (additional_image_link_warning) {
        additional_image_link_warning_copy = malloc(sizeof(int));
        if (additional_image_link_warning_copy) *additional_image_link_warning_copy = *additional_image_link_warning;
    }
    int *adwords_format_warning_copy = NULL;
    if (adwords_format_warning) {
        adwords_format_warning_copy = malloc(sizeof(int));
        if (adwords_format_warning_copy) *adwords_format_warning_copy = *adwords_format_warning;
    }
    int *adwords_same_as_link_copy = NULL;
    if (adwords_same_as_link) {
        adwords_same_as_link_copy = malloc(sizeof(int));
        if (adwords_same_as_link_copy) *adwords_same_as_link_copy = *adwords_same_as_link;
    }
    int *age_group_invalid_copy = NULL;
    if (age_group_invalid) {
        age_group_invalid_copy = malloc(sizeof(int));
        if (age_group_invalid_copy) *age_group_invalid_copy = *age_group_invalid;
    }
    int *android_deep_link_invalid_copy = NULL;
    if (android_deep_link_invalid) {
        android_deep_link_invalid_copy = malloc(sizeof(int));
        if (android_deep_link_invalid_copy) *android_deep_link_invalid_copy = *android_deep_link_invalid;
    }
    int *availability_date_invalid_copy = NULL;
    if (availability_date_invalid) {
        availability_date_invalid_copy = malloc(sizeof(int));
        if (availability_date_invalid_copy) *availability_date_invalid_copy = *availability_date_invalid;
    }
    int *country_does_not_map_to_currency_copy = NULL;
    if (country_does_not_map_to_currency) {
        country_does_not_map_to_currency_copy = malloc(sizeof(int));
        if (country_does_not_map_to_currency_copy) *country_does_not_map_to_currency_copy = *country_does_not_map_to_currency;
    }
    int *custom_label_length_too_long_copy = NULL;
    if (custom_label_length_too_long) {
        custom_label_length_too_long_copy = malloc(sizeof(int));
        if (custom_label_length_too_long_copy) *custom_label_length_too_long_copy = *custom_label_length_too_long;
    }
    int *description_length_too_long_copy = NULL;
    if (description_length_too_long) {
        description_length_too_long_copy = malloc(sizeof(int));
        if (description_length_too_long_copy) *description_length_too_long_copy = *description_length_too_long;
    }
    int *duplicate_headers_copy = NULL;
    if (duplicate_headers) {
        duplicate_headers_copy = malloc(sizeof(int));
        if (duplicate_headers_copy) *duplicate_headers_copy = *duplicate_headers;
    }
    int *expiration_date_invalid_copy = NULL;
    if (expiration_date_invalid) {
        expiration_date_invalid_copy = malloc(sizeof(int));
        if (expiration_date_invalid_copy) *expiration_date_invalid_copy = *expiration_date_invalid;
    }
    int *fetch_same_signature_copy = NULL;
    if (fetch_same_signature) {
        fetch_same_signature_copy = malloc(sizeof(int));
        if (fetch_same_signature_copy) *fetch_same_signature_copy = *fetch_same_signature;
    }
    int *gender_invalid_copy = NULL;
    if (gender_invalid) {
        gender_invalid_copy = malloc(sizeof(int));
        if (gender_invalid_copy) *gender_invalid_copy = *gender_invalid;
    }
    int *gtin_invalid_copy = NULL;
    if (gtin_invalid) {
        gtin_invalid_copy = malloc(sizeof(int));
        if (gtin_invalid_copy) *gtin_invalid_copy = *gtin_invalid;
    }
    int *image_link_warning_copy = NULL;
    if (image_link_warning) {
        image_link_warning_copy = malloc(sizeof(int));
        if (image_link_warning_copy) *image_link_warning_copy = *image_link_warning;
    }
    int *inconsistent_currency_values_copy = NULL;
    if (inconsistent_currency_values) {
        inconsistent_currency_values_copy = malloc(sizeof(int));
        if (inconsistent_currency_values_copy) *inconsistent_currency_values_copy = *inconsistent_currency_values;
    }
    int *indexed_product_count_large_delta_copy = NULL;
    if (indexed_product_count_large_delta) {
        indexed_product_count_large_delta_copy = malloc(sizeof(int));
        if (indexed_product_count_large_delta_copy) *indexed_product_count_large_delta_copy = *indexed_product_count_large_delta;
    }
    int *ios_deep_link_invalid_copy = NULL;
    if (ios_deep_link_invalid) {
        ios_deep_link_invalid_copy = malloc(sizeof(int));
        if (ios_deep_link_invalid_copy) *ios_deep_link_invalid_copy = *ios_deep_link_invalid;
    }
    int *is_bundle_invalid_copy = NULL;
    if (is_bundle_invalid) {
        is_bundle_invalid_copy = malloc(sizeof(int));
        if (is_bundle_invalid_copy) *is_bundle_invalid_copy = *is_bundle_invalid;
    }
    int *item_additional_image_download_failure_copy = NULL;
    if (item_additional_image_download_failure) {
        item_additional_image_download_failure_copy = malloc(sizeof(int));
        if (item_additional_image_download_failure_copy) *item_additional_image_download_failure_copy = *item_additional_image_download_failure;
    }
    int *link_format_warning_copy = NULL;
    if (link_format_warning) {
        link_format_warning_copy = malloc(sizeof(int));
        if (link_format_warning_copy) *link_format_warning_copy = *link_format_warning;
    }
    int *min_ad_price_invalid_copy = NULL;
    if (min_ad_price_invalid) {
        min_ad_price_invalid_copy = malloc(sizeof(int));
        if (min_ad_price_invalid_copy) *min_ad_price_invalid_copy = *min_ad_price_invalid;
    }
    int *mpn_invalid_copy = NULL;
    if (mpn_invalid) {
        mpn_invalid_copy = malloc(sizeof(int));
        if (mpn_invalid_copy) *mpn_invalid_copy = *mpn_invalid;
    }
    int *multipack_invalid_copy = NULL;
    if (multipack_invalid) {
        multipack_invalid_copy = malloc(sizeof(int));
        if (multipack_invalid_copy) *multipack_invalid_copy = *multipack_invalid;
    }
    int *optional_condition_invalid_copy = NULL;
    if (optional_condition_invalid) {
        optional_condition_invalid_copy = malloc(sizeof(int));
        if (optional_condition_invalid_copy) *optional_condition_invalid_copy = *optional_condition_invalid;
    }
    int *optional_condition_missing_copy = NULL;
    if (optional_condition_missing) {
        optional_condition_missing_copy = malloc(sizeof(int));
        if (optional_condition_missing_copy) *optional_condition_missing_copy = *optional_condition_missing;
    }
    int *optional_product_category_invalid_copy = NULL;
    if (optional_product_category_invalid) {
        optional_product_category_invalid_copy = malloc(sizeof(int));
        if (optional_product_category_invalid_copy) *optional_product_category_invalid_copy = *optional_product_category_invalid;
    }
    int *optional_product_category_missing_copy = NULL;
    if (optional_product_category_missing) {
        optional_product_category_missing_copy = malloc(sizeof(int));
        if (optional_product_category_missing_copy) *optional_product_category_missing_copy = *optional_product_category_missing;
    }
    int *product_category_depth_warning_copy = NULL;
    if (product_category_depth_warning) {
        product_category_depth_warning_copy = malloc(sizeof(int));
        if (product_category_depth_warning_copy) *product_category_depth_warning_copy = *product_category_depth_warning;
    }
    int *product_type_length_too_long_copy = NULL;
    if (product_type_length_too_long) {
        product_type_length_too_long_copy = malloc(sizeof(int));
        if (product_type_length_too_long_copy) *product_type_length_too_long_copy = *product_type_length_too_long;
    }
    int *sale_date_invalid_copy = NULL;
    if (sale_date_invalid) {
        sale_date_invalid_copy = malloc(sizeof(int));
        if (sale_date_invalid_copy) *sale_date_invalid_copy = *sale_date_invalid;
    }
    int *sales_price_invalid_copy = NULL;
    if (sales_price_invalid) {
        sales_price_invalid_copy = malloc(sizeof(int));
        if (sales_price_invalid_copy) *sales_price_invalid_copy = *sales_price_invalid;
    }
    int *sales_price_too_high_copy = NULL;
    if (sales_price_too_high) {
        sales_price_too_high_copy = malloc(sizeof(int));
        if (sales_price_too_high_copy) *sales_price_too_high_copy = *sales_price_too_high;
    }
    int *sales_price_too_low_copy = NULL;
    if (sales_price_too_low) {
        sales_price_too_low_copy = malloc(sizeof(int));
        if (sales_price_too_low_copy) *sales_price_too_low_copy = *sales_price_too_low;
    }
    int *shipping_height_invalid_copy = NULL;
    if (shipping_height_invalid) {
        shipping_height_invalid_copy = malloc(sizeof(int));
        if (shipping_height_invalid_copy) *shipping_height_invalid_copy = *shipping_height_invalid;
    }
    int *shipping_invalid_copy = NULL;
    if (shipping_invalid) {
        shipping_invalid_copy = malloc(sizeof(int));
        if (shipping_invalid_copy) *shipping_invalid_copy = *shipping_invalid;
    }
    int *shipping_weight_invalid_copy = NULL;
    if (shipping_weight_invalid) {
        shipping_weight_invalid_copy = malloc(sizeof(int));
        if (shipping_weight_invalid_copy) *shipping_weight_invalid_copy = *shipping_weight_invalid;
    }
    int *shipping_width_invalid_copy = NULL;
    if (shipping_width_invalid) {
        shipping_width_invalid_copy = malloc(sizeof(int));
        if (shipping_width_invalid_copy) *shipping_width_invalid_copy = *shipping_width_invalid;
    }
    int *size_system_invalid_copy = NULL;
    if (size_system_invalid) {
        size_system_invalid_copy = malloc(sizeof(int));
        if (size_system_invalid_copy) *size_system_invalid_copy = *size_system_invalid;
    }
    int *size_type_invalid_copy = NULL;
    if (size_type_invalid) {
        size_type_invalid_copy = malloc(sizeof(int));
        if (size_type_invalid_copy) *size_type_invalid_copy = *size_type_invalid;
    }
    int *tax_invalid_copy = NULL;
    if (tax_invalid) {
        tax_invalid_copy = malloc(sizeof(int));
        if (tax_invalid_copy) *tax_invalid_copy = *tax_invalid;
    }
    int *title_length_too_long_copy = NULL;
    if (title_length_too_long) {
        title_length_too_long_copy = malloc(sizeof(int));
        if (title_length_too_long_copy) *title_length_too_long_copy = *title_length_too_long;
    }
    int *too_many_additional_image_links_copy = NULL;
    if (too_many_additional_image_links) {
        too_many_additional_image_links_copy = malloc(sizeof(int));
        if (too_many_additional_image_links_copy) *too_many_additional_image_links_copy = *too_many_additional_image_links;
    }
    int *updated_time_invalid_copy = NULL;
    if (updated_time_invalid) {
        updated_time_invalid_copy = malloc(sizeof(int));
        if (updated_time_invalid_copy) *updated_time_invalid_copy = *updated_time_invalid;
    }
    int *utm_source_auto_corrected_copy = NULL;
    if (utm_source_auto_corrected) {
        utm_source_auto_corrected_copy = malloc(sizeof(int));
        if (utm_source_auto_corrected_copy) *utm_source_auto_corrected_copy = *utm_source_auto_corrected;
    }
    int *video_required_when_ad_video_provided_copy = NULL;
    if (video_required_when_ad_video_provided) {
        video_required_when_ad_video_provided_copy = malloc(sizeof(int));
        if (video_required_when_ad_video_provided_copy) *video_required_when_ad_video_provided_copy = *video_required_when_ad_video_provided;
    }
    int *weight_unit_invalid_copy = NULL;
    if (weight_unit_invalid) {
        weight_unit_invalid_copy = malloc(sizeof(int));
        if (weight_unit_invalid_copy) *weight_unit_invalid_copy = *weight_unit_invalid;
    }
    catalogs_feed_validation_warnings_t *result = catalogs_feed_validation_warnings_create_internal (
        ad_image_0_link_duplicated_copy,
        ad_image_0_link_length_too_long_copy,
        ad_image_0_link_required_copy,
        ad_image_0_link_warning_copy,
        ad_image_0_tag_duplicated_copy,
        ad_image_0_tag_length_too_long_copy,
        ad_image_0_tag_required_copy,
        ad_image_10_link_duplicated_copy,
        ad_image_10_link_length_too_long_copy,
        ad_image_10_link_required_copy,
        ad_image_10_link_warning_copy,
        ad_image_10_tag_duplicated_copy,
        ad_image_10_tag_length_too_long_copy,
        ad_image_10_tag_required_copy,
        ad_image_11_link_duplicated_copy,
        ad_image_11_link_length_too_long_copy,
        ad_image_11_link_required_copy,
        ad_image_11_link_warning_copy,
        ad_image_11_tag_duplicated_copy,
        ad_image_11_tag_length_too_long_copy,
        ad_image_11_tag_required_copy,
        ad_image_12_link_duplicated_copy,
        ad_image_12_link_length_too_long_copy,
        ad_image_12_link_required_copy,
        ad_image_12_link_warning_copy,
        ad_image_12_tag_duplicated_copy,
        ad_image_12_tag_length_too_long_copy,
        ad_image_12_tag_required_copy,
        ad_image_13_link_duplicated_copy,
        ad_image_13_link_length_too_long_copy,
        ad_image_13_link_required_copy,
        ad_image_13_link_warning_copy,
        ad_image_13_tag_duplicated_copy,
        ad_image_13_tag_length_too_long_copy,
        ad_image_13_tag_required_copy,
        ad_image_14_link_duplicated_copy,
        ad_image_14_link_length_too_long_copy,
        ad_image_14_link_required_copy,
        ad_image_14_link_warning_copy,
        ad_image_14_tag_duplicated_copy,
        ad_image_14_tag_length_too_long_copy,
        ad_image_14_tag_required_copy,
        ad_image_15_link_duplicated_copy,
        ad_image_15_link_length_too_long_copy,
        ad_image_15_link_required_copy,
        ad_image_15_link_warning_copy,
        ad_image_15_tag_duplicated_copy,
        ad_image_15_tag_length_too_long_copy,
        ad_image_15_tag_required_copy,
        ad_image_16_link_duplicated_copy,
        ad_image_16_link_length_too_long_copy,
        ad_image_16_link_required_copy,
        ad_image_16_link_warning_copy,
        ad_image_16_tag_duplicated_copy,
        ad_image_16_tag_length_too_long_copy,
        ad_image_16_tag_required_copy,
        ad_image_17_link_duplicated_copy,
        ad_image_17_link_length_too_long_copy,
        ad_image_17_link_required_copy,
        ad_image_17_link_warning_copy,
        ad_image_17_tag_duplicated_copy,
        ad_image_17_tag_length_too_long_copy,
        ad_image_17_tag_required_copy,
        ad_image_18_link_duplicated_copy,
        ad_image_18_link_length_too_long_copy,
        ad_image_18_link_required_copy,
        ad_image_18_link_warning_copy,
        ad_image_18_tag_duplicated_copy,
        ad_image_18_tag_length_too_long_copy,
        ad_image_18_tag_required_copy,
        ad_image_19_link_duplicated_copy,
        ad_image_19_link_length_too_long_copy,
        ad_image_19_link_required_copy,
        ad_image_19_link_warning_copy,
        ad_image_19_tag_duplicated_copy,
        ad_image_19_tag_length_too_long_copy,
        ad_image_19_tag_required_copy,
        ad_image_1_link_duplicated_copy,
        ad_image_1_link_length_too_long_copy,
        ad_image_1_link_required_copy,
        ad_image_1_link_warning_copy,
        ad_image_1_tag_duplicated_copy,
        ad_image_1_tag_length_too_long_copy,
        ad_image_1_tag_required_copy,
        ad_image_2_link_duplicated_copy,
        ad_image_2_link_length_too_long_copy,
        ad_image_2_link_required_copy,
        ad_image_2_link_warning_copy,
        ad_image_2_tag_duplicated_copy,
        ad_image_2_tag_length_too_long_copy,
        ad_image_2_tag_required_copy,
        ad_image_3_link_duplicated_copy,
        ad_image_3_link_length_too_long_copy,
        ad_image_3_link_required_copy,
        ad_image_3_link_warning_copy,
        ad_image_3_tag_duplicated_copy,
        ad_image_3_tag_length_too_long_copy,
        ad_image_3_tag_required_copy,
        ad_image_4_link_duplicated_copy,
        ad_image_4_link_length_too_long_copy,
        ad_image_4_link_required_copy,
        ad_image_4_link_warning_copy,
        ad_image_4_tag_duplicated_copy,
        ad_image_4_tag_length_too_long_copy,
        ad_image_4_tag_required_copy,
        ad_image_5_link_duplicated_copy,
        ad_image_5_link_length_too_long_copy,
        ad_image_5_link_required_copy,
        ad_image_5_link_warning_copy,
        ad_image_5_tag_duplicated_copy,
        ad_image_5_tag_length_too_long_copy,
        ad_image_5_tag_required_copy,
        ad_image_6_link_duplicated_copy,
        ad_image_6_link_length_too_long_copy,
        ad_image_6_link_required_copy,
        ad_image_6_link_warning_copy,
        ad_image_6_tag_duplicated_copy,
        ad_image_6_tag_length_too_long_copy,
        ad_image_6_tag_required_copy,
        ad_image_7_link_duplicated_copy,
        ad_image_7_link_length_too_long_copy,
        ad_image_7_link_required_copy,
        ad_image_7_link_warning_copy,
        ad_image_7_tag_duplicated_copy,
        ad_image_7_tag_length_too_long_copy,
        ad_image_7_tag_required_copy,
        ad_image_8_link_duplicated_copy,
        ad_image_8_link_length_too_long_copy,
        ad_image_8_link_required_copy,
        ad_image_8_link_warning_copy,
        ad_image_8_tag_duplicated_copy,
        ad_image_8_tag_length_too_long_copy,
        ad_image_8_tag_required_copy,
        ad_image_9_link_duplicated_copy,
        ad_image_9_link_length_too_long_copy,
        ad_image_9_link_required_copy,
        ad_image_9_link_warning_copy,
        ad_image_9_tag_duplicated_copy,
        ad_image_9_tag_length_too_long_copy,
        ad_image_9_tag_required_copy,
        ad_link_format_warning_copy,
        ad_link_same_as_link_copy,
        ad_video_0_link_duplicated_copy,
        ad_video_0_link_length_too_long_copy,
        ad_video_0_link_required_copy,
        ad_video_0_link_warning_copy,
        ad_video_0_tag_duplicated_copy,
        ad_video_0_tag_length_too_long_copy,
        ad_video_0_tag_required_copy,
        ad_video_1_link_duplicated_copy,
        ad_video_1_link_length_too_long_copy,
        ad_video_1_link_required_copy,
        ad_video_1_link_warning_copy,
        ad_video_1_tag_duplicated_copy,
        ad_video_1_tag_length_too_long_copy,
        ad_video_1_tag_required_copy,
        ad_video_2_link_duplicated_copy,
        ad_video_2_link_length_too_long_copy,
        ad_video_2_link_required_copy,
        ad_video_2_link_warning_copy,
        ad_video_2_tag_duplicated_copy,
        ad_video_2_tag_length_too_long_copy,
        ad_video_2_tag_required_copy,
        additional_image_link_length_too_long_copy,
        additional_image_link_warning_copy,
        adwords_format_warning_copy,
        adwords_same_as_link_copy,
        age_group_invalid_copy,
        android_deep_link_invalid_copy,
        availability_date_invalid_copy,
        country_does_not_map_to_currency_copy,
        custom_label_length_too_long_copy,
        description_length_too_long_copy,
        duplicate_headers_copy,
        expiration_date_invalid_copy,
        fetch_same_signature_copy,
        gender_invalid_copy,
        gtin_invalid_copy,
        image_link_warning_copy,
        inconsistent_currency_values_copy,
        indexed_product_count_large_delta_copy,
        ios_deep_link_invalid_copy,
        is_bundle_invalid_copy,
        item_additional_image_download_failure_copy,
        link_format_warning_copy,
        min_ad_price_invalid_copy,
        mpn_invalid_copy,
        multipack_invalid_copy,
        optional_condition_invalid_copy,
        optional_condition_missing_copy,
        optional_product_category_invalid_copy,
        optional_product_category_missing_copy,
        product_category_depth_warning_copy,
        product_type_length_too_long_copy,
        sale_date_invalid_copy,
        sales_price_invalid_copy,
        sales_price_too_high_copy,
        sales_price_too_low_copy,
        shipping_height_invalid_copy,
        shipping_invalid_copy,
        shipping_weight_invalid_copy,
        shipping_width_invalid_copy,
        size_system_invalid_copy,
        size_type_invalid_copy,
        tax_invalid_copy,
        title_length_too_long_copy,
        too_many_additional_image_links_copy,
        updated_time_invalid_copy,
        utm_source_auto_corrected_copy,
        video_required_when_ad_video_provided_copy,
        weight_unit_invalid_copy
        );
    if (!result) {
        free(ad_image_0_link_duplicated_copy);
        free(ad_image_0_link_length_too_long_copy);
        free(ad_image_0_link_required_copy);
        free(ad_image_0_link_warning_copy);
        free(ad_image_0_tag_duplicated_copy);
        free(ad_image_0_tag_length_too_long_copy);
        free(ad_image_0_tag_required_copy);
        free(ad_image_10_link_duplicated_copy);
        free(ad_image_10_link_length_too_long_copy);
        free(ad_image_10_link_required_copy);
        free(ad_image_10_link_warning_copy);
        free(ad_image_10_tag_duplicated_copy);
        free(ad_image_10_tag_length_too_long_copy);
        free(ad_image_10_tag_required_copy);
        free(ad_image_11_link_duplicated_copy);
        free(ad_image_11_link_length_too_long_copy);
        free(ad_image_11_link_required_copy);
        free(ad_image_11_link_warning_copy);
        free(ad_image_11_tag_duplicated_copy);
        free(ad_image_11_tag_length_too_long_copy);
        free(ad_image_11_tag_required_copy);
        free(ad_image_12_link_duplicated_copy);
        free(ad_image_12_link_length_too_long_copy);
        free(ad_image_12_link_required_copy);
        free(ad_image_12_link_warning_copy);
        free(ad_image_12_tag_duplicated_copy);
        free(ad_image_12_tag_length_too_long_copy);
        free(ad_image_12_tag_required_copy);
        free(ad_image_13_link_duplicated_copy);
        free(ad_image_13_link_length_too_long_copy);
        free(ad_image_13_link_required_copy);
        free(ad_image_13_link_warning_copy);
        free(ad_image_13_tag_duplicated_copy);
        free(ad_image_13_tag_length_too_long_copy);
        free(ad_image_13_tag_required_copy);
        free(ad_image_14_link_duplicated_copy);
        free(ad_image_14_link_length_too_long_copy);
        free(ad_image_14_link_required_copy);
        free(ad_image_14_link_warning_copy);
        free(ad_image_14_tag_duplicated_copy);
        free(ad_image_14_tag_length_too_long_copy);
        free(ad_image_14_tag_required_copy);
        free(ad_image_15_link_duplicated_copy);
        free(ad_image_15_link_length_too_long_copy);
        free(ad_image_15_link_required_copy);
        free(ad_image_15_link_warning_copy);
        free(ad_image_15_tag_duplicated_copy);
        free(ad_image_15_tag_length_too_long_copy);
        free(ad_image_15_tag_required_copy);
        free(ad_image_16_link_duplicated_copy);
        free(ad_image_16_link_length_too_long_copy);
        free(ad_image_16_link_required_copy);
        free(ad_image_16_link_warning_copy);
        free(ad_image_16_tag_duplicated_copy);
        free(ad_image_16_tag_length_too_long_copy);
        free(ad_image_16_tag_required_copy);
        free(ad_image_17_link_duplicated_copy);
        free(ad_image_17_link_length_too_long_copy);
        free(ad_image_17_link_required_copy);
        free(ad_image_17_link_warning_copy);
        free(ad_image_17_tag_duplicated_copy);
        free(ad_image_17_tag_length_too_long_copy);
        free(ad_image_17_tag_required_copy);
        free(ad_image_18_link_duplicated_copy);
        free(ad_image_18_link_length_too_long_copy);
        free(ad_image_18_link_required_copy);
        free(ad_image_18_link_warning_copy);
        free(ad_image_18_tag_duplicated_copy);
        free(ad_image_18_tag_length_too_long_copy);
        free(ad_image_18_tag_required_copy);
        free(ad_image_19_link_duplicated_copy);
        free(ad_image_19_link_length_too_long_copy);
        free(ad_image_19_link_required_copy);
        free(ad_image_19_link_warning_copy);
        free(ad_image_19_tag_duplicated_copy);
        free(ad_image_19_tag_length_too_long_copy);
        free(ad_image_19_tag_required_copy);
        free(ad_image_1_link_duplicated_copy);
        free(ad_image_1_link_length_too_long_copy);
        free(ad_image_1_link_required_copy);
        free(ad_image_1_link_warning_copy);
        free(ad_image_1_tag_duplicated_copy);
        free(ad_image_1_tag_length_too_long_copy);
        free(ad_image_1_tag_required_copy);
        free(ad_image_2_link_duplicated_copy);
        free(ad_image_2_link_length_too_long_copy);
        free(ad_image_2_link_required_copy);
        free(ad_image_2_link_warning_copy);
        free(ad_image_2_tag_duplicated_copy);
        free(ad_image_2_tag_length_too_long_copy);
        free(ad_image_2_tag_required_copy);
        free(ad_image_3_link_duplicated_copy);
        free(ad_image_3_link_length_too_long_copy);
        free(ad_image_3_link_required_copy);
        free(ad_image_3_link_warning_copy);
        free(ad_image_3_tag_duplicated_copy);
        free(ad_image_3_tag_length_too_long_copy);
        free(ad_image_3_tag_required_copy);
        free(ad_image_4_link_duplicated_copy);
        free(ad_image_4_link_length_too_long_copy);
        free(ad_image_4_link_required_copy);
        free(ad_image_4_link_warning_copy);
        free(ad_image_4_tag_duplicated_copy);
        free(ad_image_4_tag_length_too_long_copy);
        free(ad_image_4_tag_required_copy);
        free(ad_image_5_link_duplicated_copy);
        free(ad_image_5_link_length_too_long_copy);
        free(ad_image_5_link_required_copy);
        free(ad_image_5_link_warning_copy);
        free(ad_image_5_tag_duplicated_copy);
        free(ad_image_5_tag_length_too_long_copy);
        free(ad_image_5_tag_required_copy);
        free(ad_image_6_link_duplicated_copy);
        free(ad_image_6_link_length_too_long_copy);
        free(ad_image_6_link_required_copy);
        free(ad_image_6_link_warning_copy);
        free(ad_image_6_tag_duplicated_copy);
        free(ad_image_6_tag_length_too_long_copy);
        free(ad_image_6_tag_required_copy);
        free(ad_image_7_link_duplicated_copy);
        free(ad_image_7_link_length_too_long_copy);
        free(ad_image_7_link_required_copy);
        free(ad_image_7_link_warning_copy);
        free(ad_image_7_tag_duplicated_copy);
        free(ad_image_7_tag_length_too_long_copy);
        free(ad_image_7_tag_required_copy);
        free(ad_image_8_link_duplicated_copy);
        free(ad_image_8_link_length_too_long_copy);
        free(ad_image_8_link_required_copy);
        free(ad_image_8_link_warning_copy);
        free(ad_image_8_tag_duplicated_copy);
        free(ad_image_8_tag_length_too_long_copy);
        free(ad_image_8_tag_required_copy);
        free(ad_image_9_link_duplicated_copy);
        free(ad_image_9_link_length_too_long_copy);
        free(ad_image_9_link_required_copy);
        free(ad_image_9_link_warning_copy);
        free(ad_image_9_tag_duplicated_copy);
        free(ad_image_9_tag_length_too_long_copy);
        free(ad_image_9_tag_required_copy);
        free(ad_link_format_warning_copy);
        free(ad_link_same_as_link_copy);
        free(ad_video_0_link_duplicated_copy);
        free(ad_video_0_link_length_too_long_copy);
        free(ad_video_0_link_required_copy);
        free(ad_video_0_link_warning_copy);
        free(ad_video_0_tag_duplicated_copy);
        free(ad_video_0_tag_length_too_long_copy);
        free(ad_video_0_tag_required_copy);
        free(ad_video_1_link_duplicated_copy);
        free(ad_video_1_link_length_too_long_copy);
        free(ad_video_1_link_required_copy);
        free(ad_video_1_link_warning_copy);
        free(ad_video_1_tag_duplicated_copy);
        free(ad_video_1_tag_length_too_long_copy);
        free(ad_video_1_tag_required_copy);
        free(ad_video_2_link_duplicated_copy);
        free(ad_video_2_link_length_too_long_copy);
        free(ad_video_2_link_required_copy);
        free(ad_video_2_link_warning_copy);
        free(ad_video_2_tag_duplicated_copy);
        free(ad_video_2_tag_length_too_long_copy);
        free(ad_video_2_tag_required_copy);
        free(additional_image_link_length_too_long_copy);
        free(additional_image_link_warning_copy);
        free(adwords_format_warning_copy);
        free(adwords_same_as_link_copy);
        free(age_group_invalid_copy);
        free(android_deep_link_invalid_copy);
        free(availability_date_invalid_copy);
        free(country_does_not_map_to_currency_copy);
        free(custom_label_length_too_long_copy);
        free(description_length_too_long_copy);
        free(duplicate_headers_copy);
        free(expiration_date_invalid_copy);
        free(fetch_same_signature_copy);
        free(gender_invalid_copy);
        free(gtin_invalid_copy);
        free(image_link_warning_copy);
        free(inconsistent_currency_values_copy);
        free(indexed_product_count_large_delta_copy);
        free(ios_deep_link_invalid_copy);
        free(is_bundle_invalid_copy);
        free(item_additional_image_download_failure_copy);
        free(link_format_warning_copy);
        free(min_ad_price_invalid_copy);
        free(mpn_invalid_copy);
        free(multipack_invalid_copy);
        free(optional_condition_invalid_copy);
        free(optional_condition_missing_copy);
        free(optional_product_category_invalid_copy);
        free(optional_product_category_missing_copy);
        free(product_category_depth_warning_copy);
        free(product_type_length_too_long_copy);
        free(sale_date_invalid_copy);
        free(sales_price_invalid_copy);
        free(sales_price_too_high_copy);
        free(sales_price_too_low_copy);
        free(shipping_height_invalid_copy);
        free(shipping_invalid_copy);
        free(shipping_weight_invalid_copy);
        free(shipping_width_invalid_copy);
        free(size_system_invalid_copy);
        free(size_type_invalid_copy);
        free(tax_invalid_copy);
        free(title_length_too_long_copy);
        free(too_many_additional_image_links_copy);
        free(updated_time_invalid_copy);
        free(utm_source_auto_corrected_copy);
        free(video_required_when_ad_video_provided_copy);
        free(weight_unit_invalid_copy);
    }
    return result;
}

void catalogs_feed_validation_warnings_free(catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings) {
    if(NULL == catalogs_feed_validation_warnings){
        return ;
    }
    if(catalogs_feed_validation_warnings->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_validation_warnings_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_validation_warnings->ad_image_0_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_0_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_0_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_0_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_0_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_0_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_0_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_0_link_required);
        catalogs_feed_validation_warnings->ad_image_0_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_0_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_0_link_warning);
        catalogs_feed_validation_warnings->ad_image_0_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_0_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_0_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_0_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_0_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_0_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_0_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_0_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_0_tag_required);
        catalogs_feed_validation_warnings->ad_image_0_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_10_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_10_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_10_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_10_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_10_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_10_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_10_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_10_link_required);
        catalogs_feed_validation_warnings->ad_image_10_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_10_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_10_link_warning);
        catalogs_feed_validation_warnings->ad_image_10_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_10_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_10_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_10_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_10_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_10_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_10_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_10_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_10_tag_required);
        catalogs_feed_validation_warnings->ad_image_10_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_11_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_11_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_11_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_11_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_11_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_11_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_11_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_11_link_required);
        catalogs_feed_validation_warnings->ad_image_11_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_11_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_11_link_warning);
        catalogs_feed_validation_warnings->ad_image_11_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_11_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_11_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_11_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_11_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_11_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_11_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_11_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_11_tag_required);
        catalogs_feed_validation_warnings->ad_image_11_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_12_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_12_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_12_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_12_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_12_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_12_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_12_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_12_link_required);
        catalogs_feed_validation_warnings->ad_image_12_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_12_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_12_link_warning);
        catalogs_feed_validation_warnings->ad_image_12_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_12_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_12_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_12_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_12_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_12_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_12_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_12_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_12_tag_required);
        catalogs_feed_validation_warnings->ad_image_12_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_13_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_13_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_13_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_13_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_13_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_13_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_13_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_13_link_required);
        catalogs_feed_validation_warnings->ad_image_13_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_13_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_13_link_warning);
        catalogs_feed_validation_warnings->ad_image_13_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_13_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_13_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_13_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_13_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_13_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_13_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_13_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_13_tag_required);
        catalogs_feed_validation_warnings->ad_image_13_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_14_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_14_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_14_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_14_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_14_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_14_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_14_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_14_link_required);
        catalogs_feed_validation_warnings->ad_image_14_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_14_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_14_link_warning);
        catalogs_feed_validation_warnings->ad_image_14_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_14_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_14_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_14_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_14_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_14_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_14_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_14_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_14_tag_required);
        catalogs_feed_validation_warnings->ad_image_14_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_15_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_15_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_15_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_15_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_15_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_15_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_15_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_15_link_required);
        catalogs_feed_validation_warnings->ad_image_15_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_15_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_15_link_warning);
        catalogs_feed_validation_warnings->ad_image_15_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_15_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_15_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_15_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_15_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_15_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_15_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_15_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_15_tag_required);
        catalogs_feed_validation_warnings->ad_image_15_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_16_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_16_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_16_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_16_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_16_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_16_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_16_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_16_link_required);
        catalogs_feed_validation_warnings->ad_image_16_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_16_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_16_link_warning);
        catalogs_feed_validation_warnings->ad_image_16_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_16_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_16_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_16_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_16_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_16_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_16_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_16_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_16_tag_required);
        catalogs_feed_validation_warnings->ad_image_16_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_17_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_17_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_17_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_17_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_17_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_17_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_17_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_17_link_required);
        catalogs_feed_validation_warnings->ad_image_17_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_17_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_17_link_warning);
        catalogs_feed_validation_warnings->ad_image_17_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_17_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_17_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_17_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_17_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_17_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_17_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_17_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_17_tag_required);
        catalogs_feed_validation_warnings->ad_image_17_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_18_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_18_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_18_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_18_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_18_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_18_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_18_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_18_link_required);
        catalogs_feed_validation_warnings->ad_image_18_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_18_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_18_link_warning);
        catalogs_feed_validation_warnings->ad_image_18_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_18_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_18_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_18_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_18_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_18_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_18_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_18_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_18_tag_required);
        catalogs_feed_validation_warnings->ad_image_18_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_19_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_19_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_19_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_19_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_19_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_19_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_19_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_19_link_required);
        catalogs_feed_validation_warnings->ad_image_19_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_19_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_19_link_warning);
        catalogs_feed_validation_warnings->ad_image_19_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_19_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_19_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_19_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_19_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_19_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_19_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_19_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_19_tag_required);
        catalogs_feed_validation_warnings->ad_image_19_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_1_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_1_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_1_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_1_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_1_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_1_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_1_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_1_link_required);
        catalogs_feed_validation_warnings->ad_image_1_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_1_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_1_link_warning);
        catalogs_feed_validation_warnings->ad_image_1_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_1_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_1_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_1_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_1_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_1_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_1_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_1_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_1_tag_required);
        catalogs_feed_validation_warnings->ad_image_1_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_2_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_2_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_2_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_2_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_2_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_2_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_2_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_2_link_required);
        catalogs_feed_validation_warnings->ad_image_2_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_2_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_2_link_warning);
        catalogs_feed_validation_warnings->ad_image_2_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_2_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_2_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_2_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_2_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_2_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_2_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_2_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_2_tag_required);
        catalogs_feed_validation_warnings->ad_image_2_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_3_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_3_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_3_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_3_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_3_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_3_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_3_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_3_link_required);
        catalogs_feed_validation_warnings->ad_image_3_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_3_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_3_link_warning);
        catalogs_feed_validation_warnings->ad_image_3_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_3_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_3_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_3_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_3_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_3_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_3_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_3_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_3_tag_required);
        catalogs_feed_validation_warnings->ad_image_3_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_4_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_4_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_4_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_4_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_4_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_4_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_4_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_4_link_required);
        catalogs_feed_validation_warnings->ad_image_4_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_4_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_4_link_warning);
        catalogs_feed_validation_warnings->ad_image_4_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_4_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_4_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_4_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_4_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_4_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_4_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_4_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_4_tag_required);
        catalogs_feed_validation_warnings->ad_image_4_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_5_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_5_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_5_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_5_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_5_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_5_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_5_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_5_link_required);
        catalogs_feed_validation_warnings->ad_image_5_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_5_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_5_link_warning);
        catalogs_feed_validation_warnings->ad_image_5_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_5_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_5_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_5_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_5_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_5_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_5_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_5_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_5_tag_required);
        catalogs_feed_validation_warnings->ad_image_5_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_6_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_6_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_6_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_6_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_6_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_6_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_6_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_6_link_required);
        catalogs_feed_validation_warnings->ad_image_6_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_6_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_6_link_warning);
        catalogs_feed_validation_warnings->ad_image_6_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_6_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_6_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_6_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_6_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_6_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_6_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_6_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_6_tag_required);
        catalogs_feed_validation_warnings->ad_image_6_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_7_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_7_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_7_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_7_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_7_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_7_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_7_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_7_link_required);
        catalogs_feed_validation_warnings->ad_image_7_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_7_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_7_link_warning);
        catalogs_feed_validation_warnings->ad_image_7_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_7_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_7_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_7_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_7_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_7_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_7_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_7_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_7_tag_required);
        catalogs_feed_validation_warnings->ad_image_7_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_8_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_8_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_8_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_8_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_8_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_8_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_8_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_8_link_required);
        catalogs_feed_validation_warnings->ad_image_8_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_8_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_8_link_warning);
        catalogs_feed_validation_warnings->ad_image_8_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_8_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_8_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_8_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_8_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_8_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_8_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_8_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_8_tag_required);
        catalogs_feed_validation_warnings->ad_image_8_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_9_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_9_link_duplicated);
        catalogs_feed_validation_warnings->ad_image_9_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_9_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_9_link_length_too_long);
        catalogs_feed_validation_warnings->ad_image_9_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_9_link_required) {
        free(catalogs_feed_validation_warnings->ad_image_9_link_required);
        catalogs_feed_validation_warnings->ad_image_9_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_9_link_warning) {
        free(catalogs_feed_validation_warnings->ad_image_9_link_warning);
        catalogs_feed_validation_warnings->ad_image_9_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_9_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_image_9_tag_duplicated);
        catalogs_feed_validation_warnings->ad_image_9_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_9_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_image_9_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_image_9_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_image_9_tag_required) {
        free(catalogs_feed_validation_warnings->ad_image_9_tag_required);
        catalogs_feed_validation_warnings->ad_image_9_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_link_format_warning) {
        free(catalogs_feed_validation_warnings->ad_link_format_warning);
        catalogs_feed_validation_warnings->ad_link_format_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_link_same_as_link) {
        free(catalogs_feed_validation_warnings->ad_link_same_as_link);
        catalogs_feed_validation_warnings->ad_link_same_as_link = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_0_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_video_0_link_duplicated);
        catalogs_feed_validation_warnings->ad_video_0_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_0_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_video_0_link_length_too_long);
        catalogs_feed_validation_warnings->ad_video_0_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_0_link_required) {
        free(catalogs_feed_validation_warnings->ad_video_0_link_required);
        catalogs_feed_validation_warnings->ad_video_0_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_0_link_warning) {
        free(catalogs_feed_validation_warnings->ad_video_0_link_warning);
        catalogs_feed_validation_warnings->ad_video_0_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_0_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_video_0_tag_duplicated);
        catalogs_feed_validation_warnings->ad_video_0_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_0_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_video_0_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_video_0_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_0_tag_required) {
        free(catalogs_feed_validation_warnings->ad_video_0_tag_required);
        catalogs_feed_validation_warnings->ad_video_0_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_1_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_video_1_link_duplicated);
        catalogs_feed_validation_warnings->ad_video_1_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_1_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_video_1_link_length_too_long);
        catalogs_feed_validation_warnings->ad_video_1_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_1_link_required) {
        free(catalogs_feed_validation_warnings->ad_video_1_link_required);
        catalogs_feed_validation_warnings->ad_video_1_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_1_link_warning) {
        free(catalogs_feed_validation_warnings->ad_video_1_link_warning);
        catalogs_feed_validation_warnings->ad_video_1_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_1_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_video_1_tag_duplicated);
        catalogs_feed_validation_warnings->ad_video_1_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_1_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_video_1_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_video_1_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_1_tag_required) {
        free(catalogs_feed_validation_warnings->ad_video_1_tag_required);
        catalogs_feed_validation_warnings->ad_video_1_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_2_link_duplicated) {
        free(catalogs_feed_validation_warnings->ad_video_2_link_duplicated);
        catalogs_feed_validation_warnings->ad_video_2_link_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_2_link_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_video_2_link_length_too_long);
        catalogs_feed_validation_warnings->ad_video_2_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_2_link_required) {
        free(catalogs_feed_validation_warnings->ad_video_2_link_required);
        catalogs_feed_validation_warnings->ad_video_2_link_required = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_2_link_warning) {
        free(catalogs_feed_validation_warnings->ad_video_2_link_warning);
        catalogs_feed_validation_warnings->ad_video_2_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_2_tag_duplicated) {
        free(catalogs_feed_validation_warnings->ad_video_2_tag_duplicated);
        catalogs_feed_validation_warnings->ad_video_2_tag_duplicated = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_2_tag_length_too_long) {
        free(catalogs_feed_validation_warnings->ad_video_2_tag_length_too_long);
        catalogs_feed_validation_warnings->ad_video_2_tag_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->ad_video_2_tag_required) {
        free(catalogs_feed_validation_warnings->ad_video_2_tag_required);
        catalogs_feed_validation_warnings->ad_video_2_tag_required = NULL;
    }
    if (catalogs_feed_validation_warnings->additional_image_link_length_too_long) {
        free(catalogs_feed_validation_warnings->additional_image_link_length_too_long);
        catalogs_feed_validation_warnings->additional_image_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->additional_image_link_warning) {
        free(catalogs_feed_validation_warnings->additional_image_link_warning);
        catalogs_feed_validation_warnings->additional_image_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->adwords_format_warning) {
        free(catalogs_feed_validation_warnings->adwords_format_warning);
        catalogs_feed_validation_warnings->adwords_format_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->adwords_same_as_link) {
        free(catalogs_feed_validation_warnings->adwords_same_as_link);
        catalogs_feed_validation_warnings->adwords_same_as_link = NULL;
    }
    if (catalogs_feed_validation_warnings->age_group_invalid) {
        free(catalogs_feed_validation_warnings->age_group_invalid);
        catalogs_feed_validation_warnings->age_group_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->android_deep_link_invalid) {
        free(catalogs_feed_validation_warnings->android_deep_link_invalid);
        catalogs_feed_validation_warnings->android_deep_link_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->availability_date_invalid) {
        free(catalogs_feed_validation_warnings->availability_date_invalid);
        catalogs_feed_validation_warnings->availability_date_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->country_does_not_map_to_currency) {
        free(catalogs_feed_validation_warnings->country_does_not_map_to_currency);
        catalogs_feed_validation_warnings->country_does_not_map_to_currency = NULL;
    }
    if (catalogs_feed_validation_warnings->custom_label_length_too_long) {
        free(catalogs_feed_validation_warnings->custom_label_length_too_long);
        catalogs_feed_validation_warnings->custom_label_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->description_length_too_long) {
        free(catalogs_feed_validation_warnings->description_length_too_long);
        catalogs_feed_validation_warnings->description_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->duplicate_headers) {
        free(catalogs_feed_validation_warnings->duplicate_headers);
        catalogs_feed_validation_warnings->duplicate_headers = NULL;
    }
    if (catalogs_feed_validation_warnings->expiration_date_invalid) {
        free(catalogs_feed_validation_warnings->expiration_date_invalid);
        catalogs_feed_validation_warnings->expiration_date_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->fetch_same_signature) {
        free(catalogs_feed_validation_warnings->fetch_same_signature);
        catalogs_feed_validation_warnings->fetch_same_signature = NULL;
    }
    if (catalogs_feed_validation_warnings->gender_invalid) {
        free(catalogs_feed_validation_warnings->gender_invalid);
        catalogs_feed_validation_warnings->gender_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->gtin_invalid) {
        free(catalogs_feed_validation_warnings->gtin_invalid);
        catalogs_feed_validation_warnings->gtin_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->image_link_warning) {
        free(catalogs_feed_validation_warnings->image_link_warning);
        catalogs_feed_validation_warnings->image_link_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->inconsistent_currency_values) {
        free(catalogs_feed_validation_warnings->inconsistent_currency_values);
        catalogs_feed_validation_warnings->inconsistent_currency_values = NULL;
    }
    if (catalogs_feed_validation_warnings->indexed_product_count_large_delta) {
        free(catalogs_feed_validation_warnings->indexed_product_count_large_delta);
        catalogs_feed_validation_warnings->indexed_product_count_large_delta = NULL;
    }
    if (catalogs_feed_validation_warnings->ios_deep_link_invalid) {
        free(catalogs_feed_validation_warnings->ios_deep_link_invalid);
        catalogs_feed_validation_warnings->ios_deep_link_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->is_bundle_invalid) {
        free(catalogs_feed_validation_warnings->is_bundle_invalid);
        catalogs_feed_validation_warnings->is_bundle_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->item_additional_image_download_failure) {
        free(catalogs_feed_validation_warnings->item_additional_image_download_failure);
        catalogs_feed_validation_warnings->item_additional_image_download_failure = NULL;
    }
    if (catalogs_feed_validation_warnings->link_format_warning) {
        free(catalogs_feed_validation_warnings->link_format_warning);
        catalogs_feed_validation_warnings->link_format_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->min_ad_price_invalid) {
        free(catalogs_feed_validation_warnings->min_ad_price_invalid);
        catalogs_feed_validation_warnings->min_ad_price_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->mpn_invalid) {
        free(catalogs_feed_validation_warnings->mpn_invalid);
        catalogs_feed_validation_warnings->mpn_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->multipack_invalid) {
        free(catalogs_feed_validation_warnings->multipack_invalid);
        catalogs_feed_validation_warnings->multipack_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->optional_condition_invalid) {
        free(catalogs_feed_validation_warnings->optional_condition_invalid);
        catalogs_feed_validation_warnings->optional_condition_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->optional_condition_missing) {
        free(catalogs_feed_validation_warnings->optional_condition_missing);
        catalogs_feed_validation_warnings->optional_condition_missing = NULL;
    }
    if (catalogs_feed_validation_warnings->optional_product_category_invalid) {
        free(catalogs_feed_validation_warnings->optional_product_category_invalid);
        catalogs_feed_validation_warnings->optional_product_category_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->optional_product_category_missing) {
        free(catalogs_feed_validation_warnings->optional_product_category_missing);
        catalogs_feed_validation_warnings->optional_product_category_missing = NULL;
    }
    if (catalogs_feed_validation_warnings->product_category_depth_warning) {
        free(catalogs_feed_validation_warnings->product_category_depth_warning);
        catalogs_feed_validation_warnings->product_category_depth_warning = NULL;
    }
    if (catalogs_feed_validation_warnings->product_type_length_too_long) {
        free(catalogs_feed_validation_warnings->product_type_length_too_long);
        catalogs_feed_validation_warnings->product_type_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->sale_date_invalid) {
        free(catalogs_feed_validation_warnings->sale_date_invalid);
        catalogs_feed_validation_warnings->sale_date_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->sales_price_invalid) {
        free(catalogs_feed_validation_warnings->sales_price_invalid);
        catalogs_feed_validation_warnings->sales_price_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->sales_price_too_high) {
        free(catalogs_feed_validation_warnings->sales_price_too_high);
        catalogs_feed_validation_warnings->sales_price_too_high = NULL;
    }
    if (catalogs_feed_validation_warnings->sales_price_too_low) {
        free(catalogs_feed_validation_warnings->sales_price_too_low);
        catalogs_feed_validation_warnings->sales_price_too_low = NULL;
    }
    if (catalogs_feed_validation_warnings->shipping_height_invalid) {
        free(catalogs_feed_validation_warnings->shipping_height_invalid);
        catalogs_feed_validation_warnings->shipping_height_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->shipping_invalid) {
        free(catalogs_feed_validation_warnings->shipping_invalid);
        catalogs_feed_validation_warnings->shipping_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->shipping_weight_invalid) {
        free(catalogs_feed_validation_warnings->shipping_weight_invalid);
        catalogs_feed_validation_warnings->shipping_weight_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->shipping_width_invalid) {
        free(catalogs_feed_validation_warnings->shipping_width_invalid);
        catalogs_feed_validation_warnings->shipping_width_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->size_system_invalid) {
        free(catalogs_feed_validation_warnings->size_system_invalid);
        catalogs_feed_validation_warnings->size_system_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->size_type_invalid) {
        free(catalogs_feed_validation_warnings->size_type_invalid);
        catalogs_feed_validation_warnings->size_type_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->tax_invalid) {
        free(catalogs_feed_validation_warnings->tax_invalid);
        catalogs_feed_validation_warnings->tax_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->title_length_too_long) {
        free(catalogs_feed_validation_warnings->title_length_too_long);
        catalogs_feed_validation_warnings->title_length_too_long = NULL;
    }
    if (catalogs_feed_validation_warnings->too_many_additional_image_links) {
        free(catalogs_feed_validation_warnings->too_many_additional_image_links);
        catalogs_feed_validation_warnings->too_many_additional_image_links = NULL;
    }
    if (catalogs_feed_validation_warnings->updated_time_invalid) {
        free(catalogs_feed_validation_warnings->updated_time_invalid);
        catalogs_feed_validation_warnings->updated_time_invalid = NULL;
    }
    if (catalogs_feed_validation_warnings->utm_source_auto_corrected) {
        free(catalogs_feed_validation_warnings->utm_source_auto_corrected);
        catalogs_feed_validation_warnings->utm_source_auto_corrected = NULL;
    }
    if (catalogs_feed_validation_warnings->video_required_when_ad_video_provided) {
        free(catalogs_feed_validation_warnings->video_required_when_ad_video_provided);
        catalogs_feed_validation_warnings->video_required_when_ad_video_provided = NULL;
    }
    if (catalogs_feed_validation_warnings->weight_unit_invalid) {
        free(catalogs_feed_validation_warnings->weight_unit_invalid);
        catalogs_feed_validation_warnings->weight_unit_invalid = NULL;
    }
    free(catalogs_feed_validation_warnings);
}

cJSON *catalogs_feed_validation_warnings_convertToJSON(catalogs_feed_validation_warnings_t *catalogs_feed_validation_warnings) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_validation_warnings->ad_image_0_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_0_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_0_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_0_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_0_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_0_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_0_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_0_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_0_link_required
    if(catalogs_feed_validation_warnings->ad_image_0_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_0_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_0_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_0_link_warning
    if(catalogs_feed_validation_warnings->ad_image_0_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_0_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_0_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_0_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_0_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_0_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_0_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_0_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_0_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_0_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_0_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_0_tag_required
    if(catalogs_feed_validation_warnings->ad_image_0_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_0_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_0_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_10_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_10_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_10_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_10_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_10_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_10_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_10_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_10_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_10_link_required
    if(catalogs_feed_validation_warnings->ad_image_10_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_10_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_10_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_10_link_warning
    if(catalogs_feed_validation_warnings->ad_image_10_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_10_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_10_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_10_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_10_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_10_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_10_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_10_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_10_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_10_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_10_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_10_tag_required
    if(catalogs_feed_validation_warnings->ad_image_10_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_10_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_10_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_11_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_11_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_11_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_11_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_11_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_11_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_11_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_11_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_11_link_required
    if(catalogs_feed_validation_warnings->ad_image_11_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_11_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_11_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_11_link_warning
    if(catalogs_feed_validation_warnings->ad_image_11_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_11_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_11_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_11_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_11_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_11_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_11_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_11_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_11_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_11_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_11_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_11_tag_required
    if(catalogs_feed_validation_warnings->ad_image_11_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_11_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_11_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_12_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_12_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_12_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_12_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_12_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_12_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_12_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_12_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_12_link_required
    if(catalogs_feed_validation_warnings->ad_image_12_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_12_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_12_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_12_link_warning
    if(catalogs_feed_validation_warnings->ad_image_12_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_12_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_12_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_12_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_12_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_12_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_12_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_12_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_12_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_12_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_12_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_12_tag_required
    if(catalogs_feed_validation_warnings->ad_image_12_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_12_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_12_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_13_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_13_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_13_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_13_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_13_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_13_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_13_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_13_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_13_link_required
    if(catalogs_feed_validation_warnings->ad_image_13_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_13_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_13_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_13_link_warning
    if(catalogs_feed_validation_warnings->ad_image_13_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_13_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_13_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_13_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_13_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_13_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_13_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_13_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_13_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_13_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_13_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_13_tag_required
    if(catalogs_feed_validation_warnings->ad_image_13_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_13_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_13_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_14_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_14_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_14_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_14_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_14_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_14_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_14_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_14_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_14_link_required
    if(catalogs_feed_validation_warnings->ad_image_14_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_14_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_14_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_14_link_warning
    if(catalogs_feed_validation_warnings->ad_image_14_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_14_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_14_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_14_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_14_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_14_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_14_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_14_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_14_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_14_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_14_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_14_tag_required
    if(catalogs_feed_validation_warnings->ad_image_14_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_14_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_14_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_15_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_15_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_15_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_15_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_15_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_15_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_15_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_15_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_15_link_required
    if(catalogs_feed_validation_warnings->ad_image_15_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_15_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_15_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_15_link_warning
    if(catalogs_feed_validation_warnings->ad_image_15_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_15_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_15_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_15_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_15_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_15_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_15_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_15_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_15_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_15_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_15_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_15_tag_required
    if(catalogs_feed_validation_warnings->ad_image_15_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_15_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_15_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_16_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_16_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_16_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_16_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_16_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_16_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_16_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_16_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_16_link_required
    if(catalogs_feed_validation_warnings->ad_image_16_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_16_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_16_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_16_link_warning
    if(catalogs_feed_validation_warnings->ad_image_16_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_16_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_16_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_16_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_16_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_16_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_16_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_16_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_16_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_16_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_16_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_16_tag_required
    if(catalogs_feed_validation_warnings->ad_image_16_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_16_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_16_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_17_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_17_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_17_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_17_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_17_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_17_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_17_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_17_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_17_link_required
    if(catalogs_feed_validation_warnings->ad_image_17_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_17_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_17_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_17_link_warning
    if(catalogs_feed_validation_warnings->ad_image_17_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_17_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_17_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_17_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_17_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_17_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_17_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_17_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_17_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_17_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_17_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_17_tag_required
    if(catalogs_feed_validation_warnings->ad_image_17_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_17_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_17_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_18_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_18_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_18_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_18_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_18_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_18_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_18_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_18_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_18_link_required
    if(catalogs_feed_validation_warnings->ad_image_18_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_18_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_18_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_18_link_warning
    if(catalogs_feed_validation_warnings->ad_image_18_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_18_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_18_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_18_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_18_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_18_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_18_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_18_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_18_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_18_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_18_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_18_tag_required
    if(catalogs_feed_validation_warnings->ad_image_18_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_18_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_18_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_19_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_19_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_19_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_19_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_19_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_19_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_19_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_19_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_19_link_required
    if(catalogs_feed_validation_warnings->ad_image_19_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_19_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_19_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_19_link_warning
    if(catalogs_feed_validation_warnings->ad_image_19_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_19_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_19_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_19_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_19_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_19_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_19_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_19_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_19_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_19_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_19_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_19_tag_required
    if(catalogs_feed_validation_warnings->ad_image_19_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_19_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_19_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_1_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_1_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_1_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_1_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_1_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_1_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_1_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_1_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_1_link_required
    if(catalogs_feed_validation_warnings->ad_image_1_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_1_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_1_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_1_link_warning
    if(catalogs_feed_validation_warnings->ad_image_1_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_1_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_1_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_1_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_1_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_1_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_1_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_1_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_1_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_1_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_1_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_1_tag_required
    if(catalogs_feed_validation_warnings->ad_image_1_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_1_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_1_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_2_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_2_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_2_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_2_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_2_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_2_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_2_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_2_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_2_link_required
    if(catalogs_feed_validation_warnings->ad_image_2_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_2_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_2_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_2_link_warning
    if(catalogs_feed_validation_warnings->ad_image_2_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_2_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_2_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_2_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_2_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_2_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_2_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_2_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_2_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_2_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_2_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_2_tag_required
    if(catalogs_feed_validation_warnings->ad_image_2_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_2_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_2_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_3_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_3_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_3_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_3_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_3_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_3_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_3_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_3_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_3_link_required
    if(catalogs_feed_validation_warnings->ad_image_3_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_3_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_3_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_3_link_warning
    if(catalogs_feed_validation_warnings->ad_image_3_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_3_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_3_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_3_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_3_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_3_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_3_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_3_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_3_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_3_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_3_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_3_tag_required
    if(catalogs_feed_validation_warnings->ad_image_3_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_3_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_3_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_4_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_4_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_4_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_4_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_4_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_4_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_4_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_4_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_4_link_required
    if(catalogs_feed_validation_warnings->ad_image_4_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_4_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_4_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_4_link_warning
    if(catalogs_feed_validation_warnings->ad_image_4_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_4_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_4_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_4_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_4_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_4_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_4_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_4_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_4_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_4_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_4_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_4_tag_required
    if(catalogs_feed_validation_warnings->ad_image_4_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_4_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_4_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_5_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_5_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_5_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_5_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_5_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_5_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_5_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_5_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_5_link_required
    if(catalogs_feed_validation_warnings->ad_image_5_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_5_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_5_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_5_link_warning
    if(catalogs_feed_validation_warnings->ad_image_5_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_5_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_5_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_5_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_5_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_5_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_5_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_5_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_5_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_5_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_5_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_5_tag_required
    if(catalogs_feed_validation_warnings->ad_image_5_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_5_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_5_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_6_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_6_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_6_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_6_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_6_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_6_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_6_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_6_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_6_link_required
    if(catalogs_feed_validation_warnings->ad_image_6_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_6_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_6_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_6_link_warning
    if(catalogs_feed_validation_warnings->ad_image_6_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_6_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_6_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_6_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_6_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_6_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_6_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_6_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_6_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_6_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_6_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_6_tag_required
    if(catalogs_feed_validation_warnings->ad_image_6_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_6_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_6_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_7_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_7_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_7_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_7_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_7_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_7_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_7_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_7_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_7_link_required
    if(catalogs_feed_validation_warnings->ad_image_7_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_7_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_7_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_7_link_warning
    if(catalogs_feed_validation_warnings->ad_image_7_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_7_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_7_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_7_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_7_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_7_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_7_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_7_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_7_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_7_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_7_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_7_tag_required
    if(catalogs_feed_validation_warnings->ad_image_7_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_7_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_7_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_8_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_8_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_8_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_8_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_8_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_8_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_8_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_8_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_8_link_required
    if(catalogs_feed_validation_warnings->ad_image_8_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_8_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_8_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_8_link_warning
    if(catalogs_feed_validation_warnings->ad_image_8_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_8_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_8_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_8_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_8_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_8_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_8_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_8_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_8_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_8_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_8_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_8_tag_required
    if(catalogs_feed_validation_warnings->ad_image_8_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_8_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_8_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_9_link_duplicated
    if(catalogs_feed_validation_warnings->ad_image_9_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_9_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_9_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_9_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_9_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_9_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_9_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_9_link_required
    if(catalogs_feed_validation_warnings->ad_image_9_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_9_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_image_9_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_9_link_warning
    if(catalogs_feed_validation_warnings->ad_image_9_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_9_LINK_WARNING", *catalogs_feed_validation_warnings->ad_image_9_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_9_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_image_9_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_9_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_image_9_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_9_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_image_9_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_9_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_image_9_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_image_9_tag_required
    if(catalogs_feed_validation_warnings->ad_image_9_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_IMAGE_9_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_image_9_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_link_format_warning
    if(catalogs_feed_validation_warnings->ad_link_format_warning) {
    if(cJSON_AddNumberToObject(item, "AD_LINK_FORMAT_WARNING", *catalogs_feed_validation_warnings->ad_link_format_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_link_same_as_link
    if(catalogs_feed_validation_warnings->ad_link_same_as_link) {
    if(cJSON_AddNumberToObject(item, "AD_LINK_SAME_AS_LINK", *catalogs_feed_validation_warnings->ad_link_same_as_link) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_0_link_duplicated
    if(catalogs_feed_validation_warnings->ad_video_0_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_0_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_video_0_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_0_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_video_0_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_0_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_video_0_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_0_link_required
    if(catalogs_feed_validation_warnings->ad_video_0_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_0_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_video_0_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_0_link_warning
    if(catalogs_feed_validation_warnings->ad_video_0_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_0_LINK_WARNING", *catalogs_feed_validation_warnings->ad_video_0_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_0_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_video_0_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_0_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_video_0_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_0_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_video_0_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_0_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_video_0_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_0_tag_required
    if(catalogs_feed_validation_warnings->ad_video_0_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_0_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_video_0_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_1_link_duplicated
    if(catalogs_feed_validation_warnings->ad_video_1_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_1_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_video_1_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_1_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_video_1_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_1_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_video_1_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_1_link_required
    if(catalogs_feed_validation_warnings->ad_video_1_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_1_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_video_1_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_1_link_warning
    if(catalogs_feed_validation_warnings->ad_video_1_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_1_LINK_WARNING", *catalogs_feed_validation_warnings->ad_video_1_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_1_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_video_1_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_1_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_video_1_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_1_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_video_1_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_1_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_video_1_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_1_tag_required
    if(catalogs_feed_validation_warnings->ad_video_1_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_1_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_video_1_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_2_link_duplicated
    if(catalogs_feed_validation_warnings->ad_video_2_link_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_2_LINK_DUPLICATED", *catalogs_feed_validation_warnings->ad_video_2_link_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_2_link_length_too_long
    if(catalogs_feed_validation_warnings->ad_video_2_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_2_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_video_2_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_2_link_required
    if(catalogs_feed_validation_warnings->ad_video_2_link_required) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_2_LINK_REQUIRED", *catalogs_feed_validation_warnings->ad_video_2_link_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_2_link_warning
    if(catalogs_feed_validation_warnings->ad_video_2_link_warning) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_2_LINK_WARNING", *catalogs_feed_validation_warnings->ad_video_2_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_2_tag_duplicated
    if(catalogs_feed_validation_warnings->ad_video_2_tag_duplicated) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_2_TAG_DUPLICATED", *catalogs_feed_validation_warnings->ad_video_2_tag_duplicated) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_2_tag_length_too_long
    if(catalogs_feed_validation_warnings->ad_video_2_tag_length_too_long) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_2_TAG_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->ad_video_2_tag_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ad_video_2_tag_required
    if(catalogs_feed_validation_warnings->ad_video_2_tag_required) {
    if(cJSON_AddNumberToObject(item, "AD_VIDEO_2_TAG_REQUIRED", *catalogs_feed_validation_warnings->ad_video_2_tag_required) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->additional_image_link_length_too_long
    if(catalogs_feed_validation_warnings->additional_image_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->additional_image_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->additional_image_link_warning
    if(catalogs_feed_validation_warnings->additional_image_link_warning) {
    if(cJSON_AddNumberToObject(item, "ADDITIONAL_IMAGE_LINK_WARNING", *catalogs_feed_validation_warnings->additional_image_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->adwords_format_warning
    if(catalogs_feed_validation_warnings->adwords_format_warning) {
    if(cJSON_AddNumberToObject(item, "ADWORDS_FORMAT_WARNING", *catalogs_feed_validation_warnings->adwords_format_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->adwords_same_as_link
    if(catalogs_feed_validation_warnings->adwords_same_as_link) {
    if(cJSON_AddNumberToObject(item, "ADWORDS_SAME_AS_LINK", *catalogs_feed_validation_warnings->adwords_same_as_link) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->age_group_invalid
    if(catalogs_feed_validation_warnings->age_group_invalid) {
    if(cJSON_AddNumberToObject(item, "AGE_GROUP_INVALID", *catalogs_feed_validation_warnings->age_group_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->android_deep_link_invalid
    if(catalogs_feed_validation_warnings->android_deep_link_invalid) {
    if(cJSON_AddNumberToObject(item, "ANDROID_DEEP_LINK_INVALID", *catalogs_feed_validation_warnings->android_deep_link_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->availability_date_invalid
    if(catalogs_feed_validation_warnings->availability_date_invalid) {
    if(cJSON_AddNumberToObject(item, "AVAILABILITY_DATE_INVALID", *catalogs_feed_validation_warnings->availability_date_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->country_does_not_map_to_currency
    if(catalogs_feed_validation_warnings->country_does_not_map_to_currency) {
    if(cJSON_AddNumberToObject(item, "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", *catalogs_feed_validation_warnings->country_does_not_map_to_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->custom_label_length_too_long
    if(catalogs_feed_validation_warnings->custom_label_length_too_long) {
    if(cJSON_AddNumberToObject(item, "CUSTOM_LABEL_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->custom_label_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->description_length_too_long
    if(catalogs_feed_validation_warnings->description_length_too_long) {
    if(cJSON_AddNumberToObject(item, "DESCRIPTION_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->description_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->duplicate_headers
    if(catalogs_feed_validation_warnings->duplicate_headers) {
    if(cJSON_AddNumberToObject(item, "DUPLICATE_HEADERS", *catalogs_feed_validation_warnings->duplicate_headers) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->expiration_date_invalid
    if(catalogs_feed_validation_warnings->expiration_date_invalid) {
    if(cJSON_AddNumberToObject(item, "EXPIRATION_DATE_INVALID", *catalogs_feed_validation_warnings->expiration_date_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->fetch_same_signature
    if(catalogs_feed_validation_warnings->fetch_same_signature) {
    if(cJSON_AddNumberToObject(item, "FETCH_SAME_SIGNATURE", *catalogs_feed_validation_warnings->fetch_same_signature) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->gender_invalid
    if(catalogs_feed_validation_warnings->gender_invalid) {
    if(cJSON_AddNumberToObject(item, "GENDER_INVALID", *catalogs_feed_validation_warnings->gender_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->gtin_invalid
    if(catalogs_feed_validation_warnings->gtin_invalid) {
    if(cJSON_AddNumberToObject(item, "GTIN_INVALID", *catalogs_feed_validation_warnings->gtin_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->image_link_warning
    if(catalogs_feed_validation_warnings->image_link_warning) {
    if(cJSON_AddNumberToObject(item, "IMAGE_LINK_WARNING", *catalogs_feed_validation_warnings->image_link_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->inconsistent_currency_values
    if(catalogs_feed_validation_warnings->inconsistent_currency_values) {
    if(cJSON_AddNumberToObject(item, "INCONSISTENT_CURRENCY_VALUES", *catalogs_feed_validation_warnings->inconsistent_currency_values) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->indexed_product_count_large_delta
    if(catalogs_feed_validation_warnings->indexed_product_count_large_delta) {
    if(cJSON_AddNumberToObject(item, "INDEXED_PRODUCT_COUNT_LARGE_DELTA", *catalogs_feed_validation_warnings->indexed_product_count_large_delta) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->ios_deep_link_invalid
    if(catalogs_feed_validation_warnings->ios_deep_link_invalid) {
    if(cJSON_AddNumberToObject(item, "IOS_DEEP_LINK_INVALID", *catalogs_feed_validation_warnings->ios_deep_link_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->is_bundle_invalid
    if(catalogs_feed_validation_warnings->is_bundle_invalid) {
    if(cJSON_AddNumberToObject(item, "IS_BUNDLE_INVALID", *catalogs_feed_validation_warnings->is_bundle_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->item_additional_image_download_failure
    if(catalogs_feed_validation_warnings->item_additional_image_download_failure) {
    if(cJSON_AddNumberToObject(item, "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", *catalogs_feed_validation_warnings->item_additional_image_download_failure) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->link_format_warning
    if(catalogs_feed_validation_warnings->link_format_warning) {
    if(cJSON_AddNumberToObject(item, "LINK_FORMAT_WARNING", *catalogs_feed_validation_warnings->link_format_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->min_ad_price_invalid
    if(catalogs_feed_validation_warnings->min_ad_price_invalid) {
    if(cJSON_AddNumberToObject(item, "MIN_AD_PRICE_INVALID", *catalogs_feed_validation_warnings->min_ad_price_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->mpn_invalid
    if(catalogs_feed_validation_warnings->mpn_invalid) {
    if(cJSON_AddNumberToObject(item, "MPN_INVALID", *catalogs_feed_validation_warnings->mpn_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->multipack_invalid
    if(catalogs_feed_validation_warnings->multipack_invalid) {
    if(cJSON_AddNumberToObject(item, "MULTIPACK_INVALID", *catalogs_feed_validation_warnings->multipack_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->optional_condition_invalid
    if(catalogs_feed_validation_warnings->optional_condition_invalid) {
    if(cJSON_AddNumberToObject(item, "OPTIONAL_CONDITION_INVALID", *catalogs_feed_validation_warnings->optional_condition_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->optional_condition_missing
    if(catalogs_feed_validation_warnings->optional_condition_missing) {
    if(cJSON_AddNumberToObject(item, "OPTIONAL_CONDITION_MISSING", *catalogs_feed_validation_warnings->optional_condition_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->optional_product_category_invalid
    if(catalogs_feed_validation_warnings->optional_product_category_invalid) {
    if(cJSON_AddNumberToObject(item, "OPTIONAL_PRODUCT_CATEGORY_INVALID", *catalogs_feed_validation_warnings->optional_product_category_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->optional_product_category_missing
    if(catalogs_feed_validation_warnings->optional_product_category_missing) {
    if(cJSON_AddNumberToObject(item, "OPTIONAL_PRODUCT_CATEGORY_MISSING", *catalogs_feed_validation_warnings->optional_product_category_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->product_category_depth_warning
    if(catalogs_feed_validation_warnings->product_category_depth_warning) {
    if(cJSON_AddNumberToObject(item, "PRODUCT_CATEGORY_DEPTH_WARNING", *catalogs_feed_validation_warnings->product_category_depth_warning) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->product_type_length_too_long
    if(catalogs_feed_validation_warnings->product_type_length_too_long) {
    if(cJSON_AddNumberToObject(item, "PRODUCT_TYPE_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->product_type_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->sale_date_invalid
    if(catalogs_feed_validation_warnings->sale_date_invalid) {
    if(cJSON_AddNumberToObject(item, "SALE_DATE_INVALID", *catalogs_feed_validation_warnings->sale_date_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->sales_price_invalid
    if(catalogs_feed_validation_warnings->sales_price_invalid) {
    if(cJSON_AddNumberToObject(item, "SALES_PRICE_INVALID", *catalogs_feed_validation_warnings->sales_price_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->sales_price_too_high
    if(catalogs_feed_validation_warnings->sales_price_too_high) {
    if(cJSON_AddNumberToObject(item, "SALES_PRICE_TOO_HIGH", *catalogs_feed_validation_warnings->sales_price_too_high) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->sales_price_too_low
    if(catalogs_feed_validation_warnings->sales_price_too_low) {
    if(cJSON_AddNumberToObject(item, "SALES_PRICE_TOO_LOW", *catalogs_feed_validation_warnings->sales_price_too_low) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->shipping_height_invalid
    if(catalogs_feed_validation_warnings->shipping_height_invalid) {
    if(cJSON_AddNumberToObject(item, "SHIPPING_HEIGHT_INVALID", *catalogs_feed_validation_warnings->shipping_height_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->shipping_invalid
    if(catalogs_feed_validation_warnings->shipping_invalid) {
    if(cJSON_AddNumberToObject(item, "SHIPPING_INVALID", *catalogs_feed_validation_warnings->shipping_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->shipping_weight_invalid
    if(catalogs_feed_validation_warnings->shipping_weight_invalid) {
    if(cJSON_AddNumberToObject(item, "SHIPPING_WEIGHT_INVALID", *catalogs_feed_validation_warnings->shipping_weight_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->shipping_width_invalid
    if(catalogs_feed_validation_warnings->shipping_width_invalid) {
    if(cJSON_AddNumberToObject(item, "SHIPPING_WIDTH_INVALID", *catalogs_feed_validation_warnings->shipping_width_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->size_system_invalid
    if(catalogs_feed_validation_warnings->size_system_invalid) {
    if(cJSON_AddNumberToObject(item, "SIZE_SYSTEM_INVALID", *catalogs_feed_validation_warnings->size_system_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->size_type_invalid
    if(catalogs_feed_validation_warnings->size_type_invalid) {
    if(cJSON_AddNumberToObject(item, "SIZE_TYPE_INVALID", *catalogs_feed_validation_warnings->size_type_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->tax_invalid
    if(catalogs_feed_validation_warnings->tax_invalid) {
    if(cJSON_AddNumberToObject(item, "TAX_INVALID", *catalogs_feed_validation_warnings->tax_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->title_length_too_long
    if(catalogs_feed_validation_warnings->title_length_too_long) {
    if(cJSON_AddNumberToObject(item, "TITLE_LENGTH_TOO_LONG", *catalogs_feed_validation_warnings->title_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->too_many_additional_image_links
    if(catalogs_feed_validation_warnings->too_many_additional_image_links) {
    if(cJSON_AddNumberToObject(item, "TOO_MANY_ADDITIONAL_IMAGE_LINKS", *catalogs_feed_validation_warnings->too_many_additional_image_links) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->updated_time_invalid
    if(catalogs_feed_validation_warnings->updated_time_invalid) {
    if(cJSON_AddNumberToObject(item, "UPDATED_TIME_INVALID", *catalogs_feed_validation_warnings->updated_time_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->utm_source_auto_corrected
    if(catalogs_feed_validation_warnings->utm_source_auto_corrected) {
    if(cJSON_AddNumberToObject(item, "UTM_SOURCE_AUTO_CORRECTED", *catalogs_feed_validation_warnings->utm_source_auto_corrected) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->video_required_when_ad_video_provided
    if(catalogs_feed_validation_warnings->video_required_when_ad_video_provided) {
    if(cJSON_AddNumberToObject(item, "VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED", *catalogs_feed_validation_warnings->video_required_when_ad_video_provided) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_warnings->weight_unit_invalid
    if(catalogs_feed_validation_warnings->weight_unit_invalid) {
    if(cJSON_AddNumberToObject(item, "WEIGHT_UNIT_INVALID", *catalogs_feed_validation_warnings->weight_unit_invalid) == NULL) {
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

    // define the local variable for catalogs_feed_validation_warnings->ad_image_0_link_duplicated
    int *ad_image_0_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_0_link_length_too_long
    int *ad_image_0_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_0_link_required
    int *ad_image_0_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_0_link_warning
    int *ad_image_0_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_0_tag_duplicated
    int *ad_image_0_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_0_tag_length_too_long
    int *ad_image_0_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_0_tag_required
    int *ad_image_0_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_10_link_duplicated
    int *ad_image_10_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_10_link_length_too_long
    int *ad_image_10_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_10_link_required
    int *ad_image_10_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_10_link_warning
    int *ad_image_10_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_10_tag_duplicated
    int *ad_image_10_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_10_tag_length_too_long
    int *ad_image_10_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_10_tag_required
    int *ad_image_10_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_11_link_duplicated
    int *ad_image_11_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_11_link_length_too_long
    int *ad_image_11_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_11_link_required
    int *ad_image_11_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_11_link_warning
    int *ad_image_11_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_11_tag_duplicated
    int *ad_image_11_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_11_tag_length_too_long
    int *ad_image_11_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_11_tag_required
    int *ad_image_11_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_12_link_duplicated
    int *ad_image_12_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_12_link_length_too_long
    int *ad_image_12_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_12_link_required
    int *ad_image_12_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_12_link_warning
    int *ad_image_12_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_12_tag_duplicated
    int *ad_image_12_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_12_tag_length_too_long
    int *ad_image_12_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_12_tag_required
    int *ad_image_12_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_13_link_duplicated
    int *ad_image_13_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_13_link_length_too_long
    int *ad_image_13_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_13_link_required
    int *ad_image_13_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_13_link_warning
    int *ad_image_13_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_13_tag_duplicated
    int *ad_image_13_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_13_tag_length_too_long
    int *ad_image_13_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_13_tag_required
    int *ad_image_13_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_14_link_duplicated
    int *ad_image_14_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_14_link_length_too_long
    int *ad_image_14_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_14_link_required
    int *ad_image_14_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_14_link_warning
    int *ad_image_14_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_14_tag_duplicated
    int *ad_image_14_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_14_tag_length_too_long
    int *ad_image_14_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_14_tag_required
    int *ad_image_14_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_15_link_duplicated
    int *ad_image_15_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_15_link_length_too_long
    int *ad_image_15_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_15_link_required
    int *ad_image_15_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_15_link_warning
    int *ad_image_15_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_15_tag_duplicated
    int *ad_image_15_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_15_tag_length_too_long
    int *ad_image_15_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_15_tag_required
    int *ad_image_15_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_16_link_duplicated
    int *ad_image_16_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_16_link_length_too_long
    int *ad_image_16_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_16_link_required
    int *ad_image_16_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_16_link_warning
    int *ad_image_16_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_16_tag_duplicated
    int *ad_image_16_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_16_tag_length_too_long
    int *ad_image_16_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_16_tag_required
    int *ad_image_16_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_17_link_duplicated
    int *ad_image_17_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_17_link_length_too_long
    int *ad_image_17_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_17_link_required
    int *ad_image_17_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_17_link_warning
    int *ad_image_17_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_17_tag_duplicated
    int *ad_image_17_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_17_tag_length_too_long
    int *ad_image_17_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_17_tag_required
    int *ad_image_17_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_18_link_duplicated
    int *ad_image_18_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_18_link_length_too_long
    int *ad_image_18_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_18_link_required
    int *ad_image_18_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_18_link_warning
    int *ad_image_18_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_18_tag_duplicated
    int *ad_image_18_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_18_tag_length_too_long
    int *ad_image_18_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_18_tag_required
    int *ad_image_18_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_19_link_duplicated
    int *ad_image_19_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_19_link_length_too_long
    int *ad_image_19_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_19_link_required
    int *ad_image_19_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_19_link_warning
    int *ad_image_19_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_19_tag_duplicated
    int *ad_image_19_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_19_tag_length_too_long
    int *ad_image_19_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_19_tag_required
    int *ad_image_19_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_1_link_duplicated
    int *ad_image_1_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_1_link_length_too_long
    int *ad_image_1_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_1_link_required
    int *ad_image_1_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_1_link_warning
    int *ad_image_1_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_1_tag_duplicated
    int *ad_image_1_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_1_tag_length_too_long
    int *ad_image_1_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_1_tag_required
    int *ad_image_1_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_2_link_duplicated
    int *ad_image_2_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_2_link_length_too_long
    int *ad_image_2_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_2_link_required
    int *ad_image_2_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_2_link_warning
    int *ad_image_2_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_2_tag_duplicated
    int *ad_image_2_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_2_tag_length_too_long
    int *ad_image_2_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_2_tag_required
    int *ad_image_2_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_3_link_duplicated
    int *ad_image_3_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_3_link_length_too_long
    int *ad_image_3_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_3_link_required
    int *ad_image_3_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_3_link_warning
    int *ad_image_3_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_3_tag_duplicated
    int *ad_image_3_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_3_tag_length_too_long
    int *ad_image_3_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_3_tag_required
    int *ad_image_3_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_4_link_duplicated
    int *ad_image_4_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_4_link_length_too_long
    int *ad_image_4_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_4_link_required
    int *ad_image_4_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_4_link_warning
    int *ad_image_4_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_4_tag_duplicated
    int *ad_image_4_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_4_tag_length_too_long
    int *ad_image_4_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_4_tag_required
    int *ad_image_4_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_5_link_duplicated
    int *ad_image_5_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_5_link_length_too_long
    int *ad_image_5_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_5_link_required
    int *ad_image_5_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_5_link_warning
    int *ad_image_5_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_5_tag_duplicated
    int *ad_image_5_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_5_tag_length_too_long
    int *ad_image_5_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_5_tag_required
    int *ad_image_5_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_6_link_duplicated
    int *ad_image_6_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_6_link_length_too_long
    int *ad_image_6_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_6_link_required
    int *ad_image_6_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_6_link_warning
    int *ad_image_6_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_6_tag_duplicated
    int *ad_image_6_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_6_tag_length_too_long
    int *ad_image_6_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_6_tag_required
    int *ad_image_6_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_7_link_duplicated
    int *ad_image_7_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_7_link_length_too_long
    int *ad_image_7_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_7_link_required
    int *ad_image_7_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_7_link_warning
    int *ad_image_7_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_7_tag_duplicated
    int *ad_image_7_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_7_tag_length_too_long
    int *ad_image_7_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_7_tag_required
    int *ad_image_7_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_8_link_duplicated
    int *ad_image_8_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_8_link_length_too_long
    int *ad_image_8_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_8_link_required
    int *ad_image_8_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_8_link_warning
    int *ad_image_8_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_8_tag_duplicated
    int *ad_image_8_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_8_tag_length_too_long
    int *ad_image_8_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_8_tag_required
    int *ad_image_8_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_9_link_duplicated
    int *ad_image_9_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_9_link_length_too_long
    int *ad_image_9_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_9_link_required
    int *ad_image_9_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_9_link_warning
    int *ad_image_9_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_9_tag_duplicated
    int *ad_image_9_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_9_tag_length_too_long
    int *ad_image_9_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_image_9_tag_required
    int *ad_image_9_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_link_format_warning
    int *ad_link_format_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_link_same_as_link
    int *ad_link_same_as_link_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_0_link_duplicated
    int *ad_video_0_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_0_link_length_too_long
    int *ad_video_0_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_0_link_required
    int *ad_video_0_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_0_link_warning
    int *ad_video_0_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_0_tag_duplicated
    int *ad_video_0_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_0_tag_length_too_long
    int *ad_video_0_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_0_tag_required
    int *ad_video_0_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_1_link_duplicated
    int *ad_video_1_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_1_link_length_too_long
    int *ad_video_1_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_1_link_required
    int *ad_video_1_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_1_link_warning
    int *ad_video_1_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_1_tag_duplicated
    int *ad_video_1_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_1_tag_length_too_long
    int *ad_video_1_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_1_tag_required
    int *ad_video_1_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_2_link_duplicated
    int *ad_video_2_link_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_2_link_length_too_long
    int *ad_video_2_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_2_link_required
    int *ad_video_2_link_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_2_link_warning
    int *ad_video_2_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_2_tag_duplicated
    int *ad_video_2_tag_duplicated_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_2_tag_length_too_long
    int *ad_video_2_tag_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ad_video_2_tag_required
    int *ad_video_2_tag_required_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->additional_image_link_length_too_long
    int *additional_image_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->additional_image_link_warning
    int *additional_image_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->adwords_format_warning
    int *adwords_format_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->adwords_same_as_link
    int *adwords_same_as_link_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->age_group_invalid
    int *age_group_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->android_deep_link_invalid
    int *android_deep_link_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->availability_date_invalid
    int *availability_date_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->country_does_not_map_to_currency
    int *country_does_not_map_to_currency_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->custom_label_length_too_long
    int *custom_label_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->description_length_too_long
    int *description_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->duplicate_headers
    int *duplicate_headers_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->expiration_date_invalid
    int *expiration_date_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->fetch_same_signature
    int *fetch_same_signature_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->gender_invalid
    int *gender_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->gtin_invalid
    int *gtin_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->image_link_warning
    int *image_link_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->inconsistent_currency_values
    int *inconsistent_currency_values_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->indexed_product_count_large_delta
    int *indexed_product_count_large_delta_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->ios_deep_link_invalid
    int *ios_deep_link_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->is_bundle_invalid
    int *is_bundle_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->item_additional_image_download_failure
    int *item_additional_image_download_failure_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->link_format_warning
    int *link_format_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->min_ad_price_invalid
    int *min_ad_price_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->mpn_invalid
    int *mpn_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->multipack_invalid
    int *multipack_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->optional_condition_invalid
    int *optional_condition_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->optional_condition_missing
    int *optional_condition_missing_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->optional_product_category_invalid
    int *optional_product_category_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->optional_product_category_missing
    int *optional_product_category_missing_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->product_category_depth_warning
    int *product_category_depth_warning_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->product_type_length_too_long
    int *product_type_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->sale_date_invalid
    int *sale_date_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->sales_price_invalid
    int *sales_price_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->sales_price_too_high
    int *sales_price_too_high_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->sales_price_too_low
    int *sales_price_too_low_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->shipping_height_invalid
    int *shipping_height_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->shipping_invalid
    int *shipping_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->shipping_weight_invalid
    int *shipping_weight_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->shipping_width_invalid
    int *shipping_width_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->size_system_invalid
    int *size_system_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->size_type_invalid
    int *size_type_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->tax_invalid
    int *tax_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->title_length_too_long
    int *title_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->too_many_additional_image_links
    int *too_many_additional_image_links_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->updated_time_invalid
    int *updated_time_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->utm_source_auto_corrected
    int *utm_source_auto_corrected_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->video_required_when_ad_video_provided
    int *video_required_when_ad_video_provided_local_var = NULL;

    // define the local variable for catalogs_feed_validation_warnings->weight_unit_invalid
    int *weight_unit_invalid_local_var = NULL;

    // catalogs_feed_validation_warnings->ad_image_0_link_duplicated
    cJSON *ad_image_0_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_0_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_0_link_duplicated)) {
        ad_image_0_link_duplicated = NULL;
    }
    if (ad_image_0_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_0_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_0_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_0_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_0_link_duplicated_local_var = ad_image_0_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_0_link_length_too_long
    cJSON *ad_image_0_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_0_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_0_link_length_too_long)) {
        ad_image_0_link_length_too_long = NULL;
    }
    if (ad_image_0_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_0_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_0_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_0_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_0_link_length_too_long_local_var = ad_image_0_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_0_link_required
    cJSON *ad_image_0_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_0_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_0_link_required)) {
        ad_image_0_link_required = NULL;
    }
    if (ad_image_0_link_required) { 
    if(!cJSON_IsNumber(ad_image_0_link_required))
    {
    goto end; //Numeric
    }
    ad_image_0_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_0_link_required_local_var)
    {
        goto end;
    }
    *ad_image_0_link_required_local_var = ad_image_0_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_0_link_warning
    cJSON *ad_image_0_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_0_LINK_WARNING");
    if (cJSON_IsNull(ad_image_0_link_warning)) {
        ad_image_0_link_warning = NULL;
    }
    if (ad_image_0_link_warning) { 
    if(!cJSON_IsNumber(ad_image_0_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_0_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_0_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_0_link_warning_local_var = ad_image_0_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_0_tag_duplicated
    cJSON *ad_image_0_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_0_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_0_tag_duplicated)) {
        ad_image_0_tag_duplicated = NULL;
    }
    if (ad_image_0_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_0_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_0_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_0_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_0_tag_duplicated_local_var = ad_image_0_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_0_tag_length_too_long
    cJSON *ad_image_0_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_0_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_0_tag_length_too_long)) {
        ad_image_0_tag_length_too_long = NULL;
    }
    if (ad_image_0_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_0_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_0_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_0_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_0_tag_length_too_long_local_var = ad_image_0_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_0_tag_required
    cJSON *ad_image_0_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_0_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_0_tag_required)) {
        ad_image_0_tag_required = NULL;
    }
    if (ad_image_0_tag_required) { 
    if(!cJSON_IsNumber(ad_image_0_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_0_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_0_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_0_tag_required_local_var = ad_image_0_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_10_link_duplicated
    cJSON *ad_image_10_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_10_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_10_link_duplicated)) {
        ad_image_10_link_duplicated = NULL;
    }
    if (ad_image_10_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_10_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_10_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_10_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_10_link_duplicated_local_var = ad_image_10_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_10_link_length_too_long
    cJSON *ad_image_10_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_10_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_10_link_length_too_long)) {
        ad_image_10_link_length_too_long = NULL;
    }
    if (ad_image_10_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_10_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_10_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_10_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_10_link_length_too_long_local_var = ad_image_10_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_10_link_required
    cJSON *ad_image_10_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_10_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_10_link_required)) {
        ad_image_10_link_required = NULL;
    }
    if (ad_image_10_link_required) { 
    if(!cJSON_IsNumber(ad_image_10_link_required))
    {
    goto end; //Numeric
    }
    ad_image_10_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_10_link_required_local_var)
    {
        goto end;
    }
    *ad_image_10_link_required_local_var = ad_image_10_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_10_link_warning
    cJSON *ad_image_10_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_10_LINK_WARNING");
    if (cJSON_IsNull(ad_image_10_link_warning)) {
        ad_image_10_link_warning = NULL;
    }
    if (ad_image_10_link_warning) { 
    if(!cJSON_IsNumber(ad_image_10_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_10_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_10_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_10_link_warning_local_var = ad_image_10_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_10_tag_duplicated
    cJSON *ad_image_10_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_10_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_10_tag_duplicated)) {
        ad_image_10_tag_duplicated = NULL;
    }
    if (ad_image_10_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_10_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_10_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_10_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_10_tag_duplicated_local_var = ad_image_10_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_10_tag_length_too_long
    cJSON *ad_image_10_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_10_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_10_tag_length_too_long)) {
        ad_image_10_tag_length_too_long = NULL;
    }
    if (ad_image_10_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_10_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_10_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_10_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_10_tag_length_too_long_local_var = ad_image_10_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_10_tag_required
    cJSON *ad_image_10_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_10_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_10_tag_required)) {
        ad_image_10_tag_required = NULL;
    }
    if (ad_image_10_tag_required) { 
    if(!cJSON_IsNumber(ad_image_10_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_10_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_10_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_10_tag_required_local_var = ad_image_10_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_11_link_duplicated
    cJSON *ad_image_11_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_11_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_11_link_duplicated)) {
        ad_image_11_link_duplicated = NULL;
    }
    if (ad_image_11_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_11_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_11_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_11_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_11_link_duplicated_local_var = ad_image_11_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_11_link_length_too_long
    cJSON *ad_image_11_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_11_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_11_link_length_too_long)) {
        ad_image_11_link_length_too_long = NULL;
    }
    if (ad_image_11_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_11_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_11_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_11_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_11_link_length_too_long_local_var = ad_image_11_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_11_link_required
    cJSON *ad_image_11_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_11_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_11_link_required)) {
        ad_image_11_link_required = NULL;
    }
    if (ad_image_11_link_required) { 
    if(!cJSON_IsNumber(ad_image_11_link_required))
    {
    goto end; //Numeric
    }
    ad_image_11_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_11_link_required_local_var)
    {
        goto end;
    }
    *ad_image_11_link_required_local_var = ad_image_11_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_11_link_warning
    cJSON *ad_image_11_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_11_LINK_WARNING");
    if (cJSON_IsNull(ad_image_11_link_warning)) {
        ad_image_11_link_warning = NULL;
    }
    if (ad_image_11_link_warning) { 
    if(!cJSON_IsNumber(ad_image_11_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_11_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_11_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_11_link_warning_local_var = ad_image_11_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_11_tag_duplicated
    cJSON *ad_image_11_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_11_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_11_tag_duplicated)) {
        ad_image_11_tag_duplicated = NULL;
    }
    if (ad_image_11_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_11_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_11_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_11_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_11_tag_duplicated_local_var = ad_image_11_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_11_tag_length_too_long
    cJSON *ad_image_11_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_11_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_11_tag_length_too_long)) {
        ad_image_11_tag_length_too_long = NULL;
    }
    if (ad_image_11_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_11_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_11_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_11_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_11_tag_length_too_long_local_var = ad_image_11_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_11_tag_required
    cJSON *ad_image_11_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_11_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_11_tag_required)) {
        ad_image_11_tag_required = NULL;
    }
    if (ad_image_11_tag_required) { 
    if(!cJSON_IsNumber(ad_image_11_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_11_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_11_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_11_tag_required_local_var = ad_image_11_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_12_link_duplicated
    cJSON *ad_image_12_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_12_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_12_link_duplicated)) {
        ad_image_12_link_duplicated = NULL;
    }
    if (ad_image_12_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_12_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_12_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_12_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_12_link_duplicated_local_var = ad_image_12_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_12_link_length_too_long
    cJSON *ad_image_12_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_12_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_12_link_length_too_long)) {
        ad_image_12_link_length_too_long = NULL;
    }
    if (ad_image_12_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_12_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_12_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_12_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_12_link_length_too_long_local_var = ad_image_12_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_12_link_required
    cJSON *ad_image_12_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_12_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_12_link_required)) {
        ad_image_12_link_required = NULL;
    }
    if (ad_image_12_link_required) { 
    if(!cJSON_IsNumber(ad_image_12_link_required))
    {
    goto end; //Numeric
    }
    ad_image_12_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_12_link_required_local_var)
    {
        goto end;
    }
    *ad_image_12_link_required_local_var = ad_image_12_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_12_link_warning
    cJSON *ad_image_12_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_12_LINK_WARNING");
    if (cJSON_IsNull(ad_image_12_link_warning)) {
        ad_image_12_link_warning = NULL;
    }
    if (ad_image_12_link_warning) { 
    if(!cJSON_IsNumber(ad_image_12_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_12_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_12_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_12_link_warning_local_var = ad_image_12_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_12_tag_duplicated
    cJSON *ad_image_12_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_12_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_12_tag_duplicated)) {
        ad_image_12_tag_duplicated = NULL;
    }
    if (ad_image_12_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_12_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_12_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_12_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_12_tag_duplicated_local_var = ad_image_12_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_12_tag_length_too_long
    cJSON *ad_image_12_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_12_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_12_tag_length_too_long)) {
        ad_image_12_tag_length_too_long = NULL;
    }
    if (ad_image_12_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_12_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_12_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_12_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_12_tag_length_too_long_local_var = ad_image_12_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_12_tag_required
    cJSON *ad_image_12_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_12_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_12_tag_required)) {
        ad_image_12_tag_required = NULL;
    }
    if (ad_image_12_tag_required) { 
    if(!cJSON_IsNumber(ad_image_12_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_12_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_12_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_12_tag_required_local_var = ad_image_12_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_13_link_duplicated
    cJSON *ad_image_13_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_13_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_13_link_duplicated)) {
        ad_image_13_link_duplicated = NULL;
    }
    if (ad_image_13_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_13_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_13_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_13_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_13_link_duplicated_local_var = ad_image_13_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_13_link_length_too_long
    cJSON *ad_image_13_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_13_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_13_link_length_too_long)) {
        ad_image_13_link_length_too_long = NULL;
    }
    if (ad_image_13_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_13_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_13_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_13_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_13_link_length_too_long_local_var = ad_image_13_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_13_link_required
    cJSON *ad_image_13_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_13_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_13_link_required)) {
        ad_image_13_link_required = NULL;
    }
    if (ad_image_13_link_required) { 
    if(!cJSON_IsNumber(ad_image_13_link_required))
    {
    goto end; //Numeric
    }
    ad_image_13_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_13_link_required_local_var)
    {
        goto end;
    }
    *ad_image_13_link_required_local_var = ad_image_13_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_13_link_warning
    cJSON *ad_image_13_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_13_LINK_WARNING");
    if (cJSON_IsNull(ad_image_13_link_warning)) {
        ad_image_13_link_warning = NULL;
    }
    if (ad_image_13_link_warning) { 
    if(!cJSON_IsNumber(ad_image_13_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_13_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_13_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_13_link_warning_local_var = ad_image_13_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_13_tag_duplicated
    cJSON *ad_image_13_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_13_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_13_tag_duplicated)) {
        ad_image_13_tag_duplicated = NULL;
    }
    if (ad_image_13_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_13_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_13_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_13_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_13_tag_duplicated_local_var = ad_image_13_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_13_tag_length_too_long
    cJSON *ad_image_13_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_13_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_13_tag_length_too_long)) {
        ad_image_13_tag_length_too_long = NULL;
    }
    if (ad_image_13_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_13_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_13_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_13_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_13_tag_length_too_long_local_var = ad_image_13_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_13_tag_required
    cJSON *ad_image_13_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_13_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_13_tag_required)) {
        ad_image_13_tag_required = NULL;
    }
    if (ad_image_13_tag_required) { 
    if(!cJSON_IsNumber(ad_image_13_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_13_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_13_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_13_tag_required_local_var = ad_image_13_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_14_link_duplicated
    cJSON *ad_image_14_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_14_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_14_link_duplicated)) {
        ad_image_14_link_duplicated = NULL;
    }
    if (ad_image_14_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_14_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_14_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_14_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_14_link_duplicated_local_var = ad_image_14_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_14_link_length_too_long
    cJSON *ad_image_14_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_14_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_14_link_length_too_long)) {
        ad_image_14_link_length_too_long = NULL;
    }
    if (ad_image_14_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_14_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_14_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_14_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_14_link_length_too_long_local_var = ad_image_14_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_14_link_required
    cJSON *ad_image_14_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_14_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_14_link_required)) {
        ad_image_14_link_required = NULL;
    }
    if (ad_image_14_link_required) { 
    if(!cJSON_IsNumber(ad_image_14_link_required))
    {
    goto end; //Numeric
    }
    ad_image_14_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_14_link_required_local_var)
    {
        goto end;
    }
    *ad_image_14_link_required_local_var = ad_image_14_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_14_link_warning
    cJSON *ad_image_14_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_14_LINK_WARNING");
    if (cJSON_IsNull(ad_image_14_link_warning)) {
        ad_image_14_link_warning = NULL;
    }
    if (ad_image_14_link_warning) { 
    if(!cJSON_IsNumber(ad_image_14_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_14_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_14_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_14_link_warning_local_var = ad_image_14_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_14_tag_duplicated
    cJSON *ad_image_14_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_14_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_14_tag_duplicated)) {
        ad_image_14_tag_duplicated = NULL;
    }
    if (ad_image_14_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_14_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_14_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_14_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_14_tag_duplicated_local_var = ad_image_14_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_14_tag_length_too_long
    cJSON *ad_image_14_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_14_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_14_tag_length_too_long)) {
        ad_image_14_tag_length_too_long = NULL;
    }
    if (ad_image_14_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_14_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_14_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_14_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_14_tag_length_too_long_local_var = ad_image_14_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_14_tag_required
    cJSON *ad_image_14_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_14_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_14_tag_required)) {
        ad_image_14_tag_required = NULL;
    }
    if (ad_image_14_tag_required) { 
    if(!cJSON_IsNumber(ad_image_14_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_14_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_14_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_14_tag_required_local_var = ad_image_14_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_15_link_duplicated
    cJSON *ad_image_15_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_15_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_15_link_duplicated)) {
        ad_image_15_link_duplicated = NULL;
    }
    if (ad_image_15_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_15_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_15_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_15_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_15_link_duplicated_local_var = ad_image_15_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_15_link_length_too_long
    cJSON *ad_image_15_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_15_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_15_link_length_too_long)) {
        ad_image_15_link_length_too_long = NULL;
    }
    if (ad_image_15_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_15_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_15_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_15_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_15_link_length_too_long_local_var = ad_image_15_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_15_link_required
    cJSON *ad_image_15_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_15_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_15_link_required)) {
        ad_image_15_link_required = NULL;
    }
    if (ad_image_15_link_required) { 
    if(!cJSON_IsNumber(ad_image_15_link_required))
    {
    goto end; //Numeric
    }
    ad_image_15_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_15_link_required_local_var)
    {
        goto end;
    }
    *ad_image_15_link_required_local_var = ad_image_15_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_15_link_warning
    cJSON *ad_image_15_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_15_LINK_WARNING");
    if (cJSON_IsNull(ad_image_15_link_warning)) {
        ad_image_15_link_warning = NULL;
    }
    if (ad_image_15_link_warning) { 
    if(!cJSON_IsNumber(ad_image_15_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_15_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_15_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_15_link_warning_local_var = ad_image_15_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_15_tag_duplicated
    cJSON *ad_image_15_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_15_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_15_tag_duplicated)) {
        ad_image_15_tag_duplicated = NULL;
    }
    if (ad_image_15_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_15_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_15_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_15_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_15_tag_duplicated_local_var = ad_image_15_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_15_tag_length_too_long
    cJSON *ad_image_15_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_15_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_15_tag_length_too_long)) {
        ad_image_15_tag_length_too_long = NULL;
    }
    if (ad_image_15_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_15_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_15_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_15_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_15_tag_length_too_long_local_var = ad_image_15_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_15_tag_required
    cJSON *ad_image_15_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_15_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_15_tag_required)) {
        ad_image_15_tag_required = NULL;
    }
    if (ad_image_15_tag_required) { 
    if(!cJSON_IsNumber(ad_image_15_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_15_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_15_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_15_tag_required_local_var = ad_image_15_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_16_link_duplicated
    cJSON *ad_image_16_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_16_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_16_link_duplicated)) {
        ad_image_16_link_duplicated = NULL;
    }
    if (ad_image_16_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_16_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_16_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_16_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_16_link_duplicated_local_var = ad_image_16_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_16_link_length_too_long
    cJSON *ad_image_16_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_16_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_16_link_length_too_long)) {
        ad_image_16_link_length_too_long = NULL;
    }
    if (ad_image_16_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_16_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_16_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_16_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_16_link_length_too_long_local_var = ad_image_16_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_16_link_required
    cJSON *ad_image_16_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_16_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_16_link_required)) {
        ad_image_16_link_required = NULL;
    }
    if (ad_image_16_link_required) { 
    if(!cJSON_IsNumber(ad_image_16_link_required))
    {
    goto end; //Numeric
    }
    ad_image_16_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_16_link_required_local_var)
    {
        goto end;
    }
    *ad_image_16_link_required_local_var = ad_image_16_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_16_link_warning
    cJSON *ad_image_16_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_16_LINK_WARNING");
    if (cJSON_IsNull(ad_image_16_link_warning)) {
        ad_image_16_link_warning = NULL;
    }
    if (ad_image_16_link_warning) { 
    if(!cJSON_IsNumber(ad_image_16_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_16_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_16_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_16_link_warning_local_var = ad_image_16_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_16_tag_duplicated
    cJSON *ad_image_16_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_16_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_16_tag_duplicated)) {
        ad_image_16_tag_duplicated = NULL;
    }
    if (ad_image_16_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_16_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_16_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_16_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_16_tag_duplicated_local_var = ad_image_16_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_16_tag_length_too_long
    cJSON *ad_image_16_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_16_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_16_tag_length_too_long)) {
        ad_image_16_tag_length_too_long = NULL;
    }
    if (ad_image_16_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_16_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_16_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_16_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_16_tag_length_too_long_local_var = ad_image_16_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_16_tag_required
    cJSON *ad_image_16_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_16_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_16_tag_required)) {
        ad_image_16_tag_required = NULL;
    }
    if (ad_image_16_tag_required) { 
    if(!cJSON_IsNumber(ad_image_16_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_16_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_16_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_16_tag_required_local_var = ad_image_16_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_17_link_duplicated
    cJSON *ad_image_17_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_17_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_17_link_duplicated)) {
        ad_image_17_link_duplicated = NULL;
    }
    if (ad_image_17_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_17_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_17_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_17_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_17_link_duplicated_local_var = ad_image_17_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_17_link_length_too_long
    cJSON *ad_image_17_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_17_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_17_link_length_too_long)) {
        ad_image_17_link_length_too_long = NULL;
    }
    if (ad_image_17_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_17_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_17_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_17_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_17_link_length_too_long_local_var = ad_image_17_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_17_link_required
    cJSON *ad_image_17_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_17_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_17_link_required)) {
        ad_image_17_link_required = NULL;
    }
    if (ad_image_17_link_required) { 
    if(!cJSON_IsNumber(ad_image_17_link_required))
    {
    goto end; //Numeric
    }
    ad_image_17_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_17_link_required_local_var)
    {
        goto end;
    }
    *ad_image_17_link_required_local_var = ad_image_17_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_17_link_warning
    cJSON *ad_image_17_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_17_LINK_WARNING");
    if (cJSON_IsNull(ad_image_17_link_warning)) {
        ad_image_17_link_warning = NULL;
    }
    if (ad_image_17_link_warning) { 
    if(!cJSON_IsNumber(ad_image_17_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_17_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_17_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_17_link_warning_local_var = ad_image_17_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_17_tag_duplicated
    cJSON *ad_image_17_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_17_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_17_tag_duplicated)) {
        ad_image_17_tag_duplicated = NULL;
    }
    if (ad_image_17_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_17_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_17_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_17_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_17_tag_duplicated_local_var = ad_image_17_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_17_tag_length_too_long
    cJSON *ad_image_17_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_17_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_17_tag_length_too_long)) {
        ad_image_17_tag_length_too_long = NULL;
    }
    if (ad_image_17_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_17_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_17_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_17_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_17_tag_length_too_long_local_var = ad_image_17_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_17_tag_required
    cJSON *ad_image_17_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_17_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_17_tag_required)) {
        ad_image_17_tag_required = NULL;
    }
    if (ad_image_17_tag_required) { 
    if(!cJSON_IsNumber(ad_image_17_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_17_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_17_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_17_tag_required_local_var = ad_image_17_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_18_link_duplicated
    cJSON *ad_image_18_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_18_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_18_link_duplicated)) {
        ad_image_18_link_duplicated = NULL;
    }
    if (ad_image_18_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_18_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_18_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_18_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_18_link_duplicated_local_var = ad_image_18_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_18_link_length_too_long
    cJSON *ad_image_18_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_18_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_18_link_length_too_long)) {
        ad_image_18_link_length_too_long = NULL;
    }
    if (ad_image_18_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_18_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_18_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_18_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_18_link_length_too_long_local_var = ad_image_18_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_18_link_required
    cJSON *ad_image_18_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_18_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_18_link_required)) {
        ad_image_18_link_required = NULL;
    }
    if (ad_image_18_link_required) { 
    if(!cJSON_IsNumber(ad_image_18_link_required))
    {
    goto end; //Numeric
    }
    ad_image_18_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_18_link_required_local_var)
    {
        goto end;
    }
    *ad_image_18_link_required_local_var = ad_image_18_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_18_link_warning
    cJSON *ad_image_18_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_18_LINK_WARNING");
    if (cJSON_IsNull(ad_image_18_link_warning)) {
        ad_image_18_link_warning = NULL;
    }
    if (ad_image_18_link_warning) { 
    if(!cJSON_IsNumber(ad_image_18_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_18_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_18_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_18_link_warning_local_var = ad_image_18_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_18_tag_duplicated
    cJSON *ad_image_18_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_18_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_18_tag_duplicated)) {
        ad_image_18_tag_duplicated = NULL;
    }
    if (ad_image_18_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_18_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_18_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_18_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_18_tag_duplicated_local_var = ad_image_18_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_18_tag_length_too_long
    cJSON *ad_image_18_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_18_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_18_tag_length_too_long)) {
        ad_image_18_tag_length_too_long = NULL;
    }
    if (ad_image_18_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_18_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_18_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_18_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_18_tag_length_too_long_local_var = ad_image_18_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_18_tag_required
    cJSON *ad_image_18_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_18_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_18_tag_required)) {
        ad_image_18_tag_required = NULL;
    }
    if (ad_image_18_tag_required) { 
    if(!cJSON_IsNumber(ad_image_18_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_18_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_18_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_18_tag_required_local_var = ad_image_18_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_19_link_duplicated
    cJSON *ad_image_19_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_19_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_19_link_duplicated)) {
        ad_image_19_link_duplicated = NULL;
    }
    if (ad_image_19_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_19_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_19_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_19_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_19_link_duplicated_local_var = ad_image_19_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_19_link_length_too_long
    cJSON *ad_image_19_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_19_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_19_link_length_too_long)) {
        ad_image_19_link_length_too_long = NULL;
    }
    if (ad_image_19_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_19_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_19_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_19_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_19_link_length_too_long_local_var = ad_image_19_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_19_link_required
    cJSON *ad_image_19_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_19_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_19_link_required)) {
        ad_image_19_link_required = NULL;
    }
    if (ad_image_19_link_required) { 
    if(!cJSON_IsNumber(ad_image_19_link_required))
    {
    goto end; //Numeric
    }
    ad_image_19_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_19_link_required_local_var)
    {
        goto end;
    }
    *ad_image_19_link_required_local_var = ad_image_19_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_19_link_warning
    cJSON *ad_image_19_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_19_LINK_WARNING");
    if (cJSON_IsNull(ad_image_19_link_warning)) {
        ad_image_19_link_warning = NULL;
    }
    if (ad_image_19_link_warning) { 
    if(!cJSON_IsNumber(ad_image_19_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_19_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_19_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_19_link_warning_local_var = ad_image_19_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_19_tag_duplicated
    cJSON *ad_image_19_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_19_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_19_tag_duplicated)) {
        ad_image_19_tag_duplicated = NULL;
    }
    if (ad_image_19_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_19_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_19_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_19_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_19_tag_duplicated_local_var = ad_image_19_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_19_tag_length_too_long
    cJSON *ad_image_19_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_19_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_19_tag_length_too_long)) {
        ad_image_19_tag_length_too_long = NULL;
    }
    if (ad_image_19_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_19_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_19_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_19_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_19_tag_length_too_long_local_var = ad_image_19_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_19_tag_required
    cJSON *ad_image_19_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_19_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_19_tag_required)) {
        ad_image_19_tag_required = NULL;
    }
    if (ad_image_19_tag_required) { 
    if(!cJSON_IsNumber(ad_image_19_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_19_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_19_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_19_tag_required_local_var = ad_image_19_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_1_link_duplicated
    cJSON *ad_image_1_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_1_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_1_link_duplicated)) {
        ad_image_1_link_duplicated = NULL;
    }
    if (ad_image_1_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_1_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_1_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_1_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_1_link_duplicated_local_var = ad_image_1_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_1_link_length_too_long
    cJSON *ad_image_1_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_1_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_1_link_length_too_long)) {
        ad_image_1_link_length_too_long = NULL;
    }
    if (ad_image_1_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_1_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_1_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_1_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_1_link_length_too_long_local_var = ad_image_1_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_1_link_required
    cJSON *ad_image_1_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_1_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_1_link_required)) {
        ad_image_1_link_required = NULL;
    }
    if (ad_image_1_link_required) { 
    if(!cJSON_IsNumber(ad_image_1_link_required))
    {
    goto end; //Numeric
    }
    ad_image_1_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_1_link_required_local_var)
    {
        goto end;
    }
    *ad_image_1_link_required_local_var = ad_image_1_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_1_link_warning
    cJSON *ad_image_1_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_1_LINK_WARNING");
    if (cJSON_IsNull(ad_image_1_link_warning)) {
        ad_image_1_link_warning = NULL;
    }
    if (ad_image_1_link_warning) { 
    if(!cJSON_IsNumber(ad_image_1_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_1_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_1_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_1_link_warning_local_var = ad_image_1_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_1_tag_duplicated
    cJSON *ad_image_1_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_1_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_1_tag_duplicated)) {
        ad_image_1_tag_duplicated = NULL;
    }
    if (ad_image_1_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_1_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_1_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_1_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_1_tag_duplicated_local_var = ad_image_1_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_1_tag_length_too_long
    cJSON *ad_image_1_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_1_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_1_tag_length_too_long)) {
        ad_image_1_tag_length_too_long = NULL;
    }
    if (ad_image_1_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_1_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_1_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_1_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_1_tag_length_too_long_local_var = ad_image_1_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_1_tag_required
    cJSON *ad_image_1_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_1_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_1_tag_required)) {
        ad_image_1_tag_required = NULL;
    }
    if (ad_image_1_tag_required) { 
    if(!cJSON_IsNumber(ad_image_1_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_1_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_1_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_1_tag_required_local_var = ad_image_1_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_2_link_duplicated
    cJSON *ad_image_2_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_2_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_2_link_duplicated)) {
        ad_image_2_link_duplicated = NULL;
    }
    if (ad_image_2_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_2_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_2_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_2_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_2_link_duplicated_local_var = ad_image_2_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_2_link_length_too_long
    cJSON *ad_image_2_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_2_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_2_link_length_too_long)) {
        ad_image_2_link_length_too_long = NULL;
    }
    if (ad_image_2_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_2_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_2_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_2_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_2_link_length_too_long_local_var = ad_image_2_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_2_link_required
    cJSON *ad_image_2_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_2_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_2_link_required)) {
        ad_image_2_link_required = NULL;
    }
    if (ad_image_2_link_required) { 
    if(!cJSON_IsNumber(ad_image_2_link_required))
    {
    goto end; //Numeric
    }
    ad_image_2_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_2_link_required_local_var)
    {
        goto end;
    }
    *ad_image_2_link_required_local_var = ad_image_2_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_2_link_warning
    cJSON *ad_image_2_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_2_LINK_WARNING");
    if (cJSON_IsNull(ad_image_2_link_warning)) {
        ad_image_2_link_warning = NULL;
    }
    if (ad_image_2_link_warning) { 
    if(!cJSON_IsNumber(ad_image_2_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_2_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_2_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_2_link_warning_local_var = ad_image_2_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_2_tag_duplicated
    cJSON *ad_image_2_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_2_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_2_tag_duplicated)) {
        ad_image_2_tag_duplicated = NULL;
    }
    if (ad_image_2_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_2_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_2_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_2_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_2_tag_duplicated_local_var = ad_image_2_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_2_tag_length_too_long
    cJSON *ad_image_2_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_2_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_2_tag_length_too_long)) {
        ad_image_2_tag_length_too_long = NULL;
    }
    if (ad_image_2_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_2_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_2_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_2_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_2_tag_length_too_long_local_var = ad_image_2_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_2_tag_required
    cJSON *ad_image_2_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_2_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_2_tag_required)) {
        ad_image_2_tag_required = NULL;
    }
    if (ad_image_2_tag_required) { 
    if(!cJSON_IsNumber(ad_image_2_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_2_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_2_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_2_tag_required_local_var = ad_image_2_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_3_link_duplicated
    cJSON *ad_image_3_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_3_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_3_link_duplicated)) {
        ad_image_3_link_duplicated = NULL;
    }
    if (ad_image_3_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_3_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_3_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_3_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_3_link_duplicated_local_var = ad_image_3_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_3_link_length_too_long
    cJSON *ad_image_3_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_3_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_3_link_length_too_long)) {
        ad_image_3_link_length_too_long = NULL;
    }
    if (ad_image_3_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_3_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_3_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_3_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_3_link_length_too_long_local_var = ad_image_3_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_3_link_required
    cJSON *ad_image_3_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_3_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_3_link_required)) {
        ad_image_3_link_required = NULL;
    }
    if (ad_image_3_link_required) { 
    if(!cJSON_IsNumber(ad_image_3_link_required))
    {
    goto end; //Numeric
    }
    ad_image_3_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_3_link_required_local_var)
    {
        goto end;
    }
    *ad_image_3_link_required_local_var = ad_image_3_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_3_link_warning
    cJSON *ad_image_3_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_3_LINK_WARNING");
    if (cJSON_IsNull(ad_image_3_link_warning)) {
        ad_image_3_link_warning = NULL;
    }
    if (ad_image_3_link_warning) { 
    if(!cJSON_IsNumber(ad_image_3_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_3_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_3_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_3_link_warning_local_var = ad_image_3_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_3_tag_duplicated
    cJSON *ad_image_3_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_3_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_3_tag_duplicated)) {
        ad_image_3_tag_duplicated = NULL;
    }
    if (ad_image_3_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_3_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_3_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_3_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_3_tag_duplicated_local_var = ad_image_3_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_3_tag_length_too_long
    cJSON *ad_image_3_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_3_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_3_tag_length_too_long)) {
        ad_image_3_tag_length_too_long = NULL;
    }
    if (ad_image_3_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_3_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_3_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_3_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_3_tag_length_too_long_local_var = ad_image_3_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_3_tag_required
    cJSON *ad_image_3_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_3_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_3_tag_required)) {
        ad_image_3_tag_required = NULL;
    }
    if (ad_image_3_tag_required) { 
    if(!cJSON_IsNumber(ad_image_3_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_3_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_3_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_3_tag_required_local_var = ad_image_3_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_4_link_duplicated
    cJSON *ad_image_4_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_4_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_4_link_duplicated)) {
        ad_image_4_link_duplicated = NULL;
    }
    if (ad_image_4_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_4_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_4_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_4_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_4_link_duplicated_local_var = ad_image_4_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_4_link_length_too_long
    cJSON *ad_image_4_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_4_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_4_link_length_too_long)) {
        ad_image_4_link_length_too_long = NULL;
    }
    if (ad_image_4_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_4_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_4_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_4_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_4_link_length_too_long_local_var = ad_image_4_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_4_link_required
    cJSON *ad_image_4_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_4_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_4_link_required)) {
        ad_image_4_link_required = NULL;
    }
    if (ad_image_4_link_required) { 
    if(!cJSON_IsNumber(ad_image_4_link_required))
    {
    goto end; //Numeric
    }
    ad_image_4_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_4_link_required_local_var)
    {
        goto end;
    }
    *ad_image_4_link_required_local_var = ad_image_4_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_4_link_warning
    cJSON *ad_image_4_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_4_LINK_WARNING");
    if (cJSON_IsNull(ad_image_4_link_warning)) {
        ad_image_4_link_warning = NULL;
    }
    if (ad_image_4_link_warning) { 
    if(!cJSON_IsNumber(ad_image_4_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_4_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_4_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_4_link_warning_local_var = ad_image_4_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_4_tag_duplicated
    cJSON *ad_image_4_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_4_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_4_tag_duplicated)) {
        ad_image_4_tag_duplicated = NULL;
    }
    if (ad_image_4_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_4_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_4_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_4_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_4_tag_duplicated_local_var = ad_image_4_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_4_tag_length_too_long
    cJSON *ad_image_4_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_4_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_4_tag_length_too_long)) {
        ad_image_4_tag_length_too_long = NULL;
    }
    if (ad_image_4_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_4_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_4_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_4_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_4_tag_length_too_long_local_var = ad_image_4_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_4_tag_required
    cJSON *ad_image_4_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_4_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_4_tag_required)) {
        ad_image_4_tag_required = NULL;
    }
    if (ad_image_4_tag_required) { 
    if(!cJSON_IsNumber(ad_image_4_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_4_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_4_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_4_tag_required_local_var = ad_image_4_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_5_link_duplicated
    cJSON *ad_image_5_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_5_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_5_link_duplicated)) {
        ad_image_5_link_duplicated = NULL;
    }
    if (ad_image_5_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_5_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_5_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_5_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_5_link_duplicated_local_var = ad_image_5_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_5_link_length_too_long
    cJSON *ad_image_5_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_5_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_5_link_length_too_long)) {
        ad_image_5_link_length_too_long = NULL;
    }
    if (ad_image_5_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_5_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_5_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_5_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_5_link_length_too_long_local_var = ad_image_5_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_5_link_required
    cJSON *ad_image_5_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_5_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_5_link_required)) {
        ad_image_5_link_required = NULL;
    }
    if (ad_image_5_link_required) { 
    if(!cJSON_IsNumber(ad_image_5_link_required))
    {
    goto end; //Numeric
    }
    ad_image_5_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_5_link_required_local_var)
    {
        goto end;
    }
    *ad_image_5_link_required_local_var = ad_image_5_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_5_link_warning
    cJSON *ad_image_5_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_5_LINK_WARNING");
    if (cJSON_IsNull(ad_image_5_link_warning)) {
        ad_image_5_link_warning = NULL;
    }
    if (ad_image_5_link_warning) { 
    if(!cJSON_IsNumber(ad_image_5_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_5_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_5_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_5_link_warning_local_var = ad_image_5_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_5_tag_duplicated
    cJSON *ad_image_5_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_5_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_5_tag_duplicated)) {
        ad_image_5_tag_duplicated = NULL;
    }
    if (ad_image_5_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_5_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_5_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_5_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_5_tag_duplicated_local_var = ad_image_5_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_5_tag_length_too_long
    cJSON *ad_image_5_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_5_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_5_tag_length_too_long)) {
        ad_image_5_tag_length_too_long = NULL;
    }
    if (ad_image_5_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_5_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_5_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_5_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_5_tag_length_too_long_local_var = ad_image_5_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_5_tag_required
    cJSON *ad_image_5_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_5_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_5_tag_required)) {
        ad_image_5_tag_required = NULL;
    }
    if (ad_image_5_tag_required) { 
    if(!cJSON_IsNumber(ad_image_5_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_5_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_5_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_5_tag_required_local_var = ad_image_5_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_6_link_duplicated
    cJSON *ad_image_6_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_6_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_6_link_duplicated)) {
        ad_image_6_link_duplicated = NULL;
    }
    if (ad_image_6_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_6_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_6_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_6_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_6_link_duplicated_local_var = ad_image_6_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_6_link_length_too_long
    cJSON *ad_image_6_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_6_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_6_link_length_too_long)) {
        ad_image_6_link_length_too_long = NULL;
    }
    if (ad_image_6_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_6_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_6_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_6_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_6_link_length_too_long_local_var = ad_image_6_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_6_link_required
    cJSON *ad_image_6_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_6_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_6_link_required)) {
        ad_image_6_link_required = NULL;
    }
    if (ad_image_6_link_required) { 
    if(!cJSON_IsNumber(ad_image_6_link_required))
    {
    goto end; //Numeric
    }
    ad_image_6_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_6_link_required_local_var)
    {
        goto end;
    }
    *ad_image_6_link_required_local_var = ad_image_6_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_6_link_warning
    cJSON *ad_image_6_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_6_LINK_WARNING");
    if (cJSON_IsNull(ad_image_6_link_warning)) {
        ad_image_6_link_warning = NULL;
    }
    if (ad_image_6_link_warning) { 
    if(!cJSON_IsNumber(ad_image_6_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_6_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_6_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_6_link_warning_local_var = ad_image_6_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_6_tag_duplicated
    cJSON *ad_image_6_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_6_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_6_tag_duplicated)) {
        ad_image_6_tag_duplicated = NULL;
    }
    if (ad_image_6_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_6_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_6_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_6_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_6_tag_duplicated_local_var = ad_image_6_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_6_tag_length_too_long
    cJSON *ad_image_6_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_6_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_6_tag_length_too_long)) {
        ad_image_6_tag_length_too_long = NULL;
    }
    if (ad_image_6_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_6_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_6_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_6_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_6_tag_length_too_long_local_var = ad_image_6_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_6_tag_required
    cJSON *ad_image_6_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_6_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_6_tag_required)) {
        ad_image_6_tag_required = NULL;
    }
    if (ad_image_6_tag_required) { 
    if(!cJSON_IsNumber(ad_image_6_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_6_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_6_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_6_tag_required_local_var = ad_image_6_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_7_link_duplicated
    cJSON *ad_image_7_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_7_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_7_link_duplicated)) {
        ad_image_7_link_duplicated = NULL;
    }
    if (ad_image_7_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_7_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_7_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_7_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_7_link_duplicated_local_var = ad_image_7_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_7_link_length_too_long
    cJSON *ad_image_7_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_7_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_7_link_length_too_long)) {
        ad_image_7_link_length_too_long = NULL;
    }
    if (ad_image_7_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_7_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_7_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_7_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_7_link_length_too_long_local_var = ad_image_7_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_7_link_required
    cJSON *ad_image_7_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_7_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_7_link_required)) {
        ad_image_7_link_required = NULL;
    }
    if (ad_image_7_link_required) { 
    if(!cJSON_IsNumber(ad_image_7_link_required))
    {
    goto end; //Numeric
    }
    ad_image_7_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_7_link_required_local_var)
    {
        goto end;
    }
    *ad_image_7_link_required_local_var = ad_image_7_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_7_link_warning
    cJSON *ad_image_7_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_7_LINK_WARNING");
    if (cJSON_IsNull(ad_image_7_link_warning)) {
        ad_image_7_link_warning = NULL;
    }
    if (ad_image_7_link_warning) { 
    if(!cJSON_IsNumber(ad_image_7_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_7_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_7_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_7_link_warning_local_var = ad_image_7_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_7_tag_duplicated
    cJSON *ad_image_7_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_7_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_7_tag_duplicated)) {
        ad_image_7_tag_duplicated = NULL;
    }
    if (ad_image_7_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_7_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_7_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_7_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_7_tag_duplicated_local_var = ad_image_7_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_7_tag_length_too_long
    cJSON *ad_image_7_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_7_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_7_tag_length_too_long)) {
        ad_image_7_tag_length_too_long = NULL;
    }
    if (ad_image_7_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_7_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_7_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_7_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_7_tag_length_too_long_local_var = ad_image_7_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_7_tag_required
    cJSON *ad_image_7_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_7_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_7_tag_required)) {
        ad_image_7_tag_required = NULL;
    }
    if (ad_image_7_tag_required) { 
    if(!cJSON_IsNumber(ad_image_7_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_7_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_7_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_7_tag_required_local_var = ad_image_7_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_8_link_duplicated
    cJSON *ad_image_8_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_8_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_8_link_duplicated)) {
        ad_image_8_link_duplicated = NULL;
    }
    if (ad_image_8_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_8_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_8_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_8_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_8_link_duplicated_local_var = ad_image_8_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_8_link_length_too_long
    cJSON *ad_image_8_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_8_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_8_link_length_too_long)) {
        ad_image_8_link_length_too_long = NULL;
    }
    if (ad_image_8_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_8_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_8_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_8_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_8_link_length_too_long_local_var = ad_image_8_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_8_link_required
    cJSON *ad_image_8_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_8_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_8_link_required)) {
        ad_image_8_link_required = NULL;
    }
    if (ad_image_8_link_required) { 
    if(!cJSON_IsNumber(ad_image_8_link_required))
    {
    goto end; //Numeric
    }
    ad_image_8_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_8_link_required_local_var)
    {
        goto end;
    }
    *ad_image_8_link_required_local_var = ad_image_8_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_8_link_warning
    cJSON *ad_image_8_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_8_LINK_WARNING");
    if (cJSON_IsNull(ad_image_8_link_warning)) {
        ad_image_8_link_warning = NULL;
    }
    if (ad_image_8_link_warning) { 
    if(!cJSON_IsNumber(ad_image_8_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_8_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_8_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_8_link_warning_local_var = ad_image_8_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_8_tag_duplicated
    cJSON *ad_image_8_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_8_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_8_tag_duplicated)) {
        ad_image_8_tag_duplicated = NULL;
    }
    if (ad_image_8_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_8_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_8_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_8_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_8_tag_duplicated_local_var = ad_image_8_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_8_tag_length_too_long
    cJSON *ad_image_8_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_8_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_8_tag_length_too_long)) {
        ad_image_8_tag_length_too_long = NULL;
    }
    if (ad_image_8_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_8_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_8_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_8_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_8_tag_length_too_long_local_var = ad_image_8_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_8_tag_required
    cJSON *ad_image_8_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_8_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_8_tag_required)) {
        ad_image_8_tag_required = NULL;
    }
    if (ad_image_8_tag_required) { 
    if(!cJSON_IsNumber(ad_image_8_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_8_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_8_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_8_tag_required_local_var = ad_image_8_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_9_link_duplicated
    cJSON *ad_image_9_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_9_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_image_9_link_duplicated)) {
        ad_image_9_link_duplicated = NULL;
    }
    if (ad_image_9_link_duplicated) { 
    if(!cJSON_IsNumber(ad_image_9_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_9_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_9_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_9_link_duplicated_local_var = ad_image_9_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_9_link_length_too_long
    cJSON *ad_image_9_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_9_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_9_link_length_too_long)) {
        ad_image_9_link_length_too_long = NULL;
    }
    if (ad_image_9_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_9_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_9_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_9_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_9_link_length_too_long_local_var = ad_image_9_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_9_link_required
    cJSON *ad_image_9_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_9_LINK_REQUIRED");
    if (cJSON_IsNull(ad_image_9_link_required)) {
        ad_image_9_link_required = NULL;
    }
    if (ad_image_9_link_required) { 
    if(!cJSON_IsNumber(ad_image_9_link_required))
    {
    goto end; //Numeric
    }
    ad_image_9_link_required_local_var = malloc(sizeof(int));
    if(!ad_image_9_link_required_local_var)
    {
        goto end;
    }
    *ad_image_9_link_required_local_var = ad_image_9_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_9_link_warning
    cJSON *ad_image_9_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_9_LINK_WARNING");
    if (cJSON_IsNull(ad_image_9_link_warning)) {
        ad_image_9_link_warning = NULL;
    }
    if (ad_image_9_link_warning) { 
    if(!cJSON_IsNumber(ad_image_9_link_warning))
    {
    goto end; //Numeric
    }
    ad_image_9_link_warning_local_var = malloc(sizeof(int));
    if(!ad_image_9_link_warning_local_var)
    {
        goto end;
    }
    *ad_image_9_link_warning_local_var = ad_image_9_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_9_tag_duplicated
    cJSON *ad_image_9_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_9_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_image_9_tag_duplicated)) {
        ad_image_9_tag_duplicated = NULL;
    }
    if (ad_image_9_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_image_9_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_image_9_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_image_9_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_image_9_tag_duplicated_local_var = ad_image_9_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_9_tag_length_too_long
    cJSON *ad_image_9_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_9_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_image_9_tag_length_too_long)) {
        ad_image_9_tag_length_too_long = NULL;
    }
    if (ad_image_9_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_image_9_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_image_9_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_image_9_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_image_9_tag_length_too_long_local_var = ad_image_9_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_image_9_tag_required
    cJSON *ad_image_9_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_IMAGE_9_TAG_REQUIRED");
    if (cJSON_IsNull(ad_image_9_tag_required)) {
        ad_image_9_tag_required = NULL;
    }
    if (ad_image_9_tag_required) { 
    if(!cJSON_IsNumber(ad_image_9_tag_required))
    {
    goto end; //Numeric
    }
    ad_image_9_tag_required_local_var = malloc(sizeof(int));
    if(!ad_image_9_tag_required_local_var)
    {
        goto end;
    }
    *ad_image_9_tag_required_local_var = ad_image_9_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_link_format_warning
    cJSON *ad_link_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_LINK_FORMAT_WARNING");
    if (cJSON_IsNull(ad_link_format_warning)) {
        ad_link_format_warning = NULL;
    }
    if (ad_link_format_warning) { 
    if(!cJSON_IsNumber(ad_link_format_warning))
    {
    goto end; //Numeric
    }
    ad_link_format_warning_local_var = malloc(sizeof(int));
    if(!ad_link_format_warning_local_var)
    {
        goto end;
    }
    *ad_link_format_warning_local_var = ad_link_format_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_link_same_as_link
    cJSON *ad_link_same_as_link = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_LINK_SAME_AS_LINK");
    if (cJSON_IsNull(ad_link_same_as_link)) {
        ad_link_same_as_link = NULL;
    }
    if (ad_link_same_as_link) { 
    if(!cJSON_IsNumber(ad_link_same_as_link))
    {
    goto end; //Numeric
    }
    ad_link_same_as_link_local_var = malloc(sizeof(int));
    if(!ad_link_same_as_link_local_var)
    {
        goto end;
    }
    *ad_link_same_as_link_local_var = ad_link_same_as_link->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_0_link_duplicated
    cJSON *ad_video_0_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_0_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_video_0_link_duplicated)) {
        ad_video_0_link_duplicated = NULL;
    }
    if (ad_video_0_link_duplicated) { 
    if(!cJSON_IsNumber(ad_video_0_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_video_0_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_video_0_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_video_0_link_duplicated_local_var = ad_video_0_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_0_link_length_too_long
    cJSON *ad_video_0_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_0_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_video_0_link_length_too_long)) {
        ad_video_0_link_length_too_long = NULL;
    }
    if (ad_video_0_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_video_0_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_video_0_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_video_0_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_video_0_link_length_too_long_local_var = ad_video_0_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_0_link_required
    cJSON *ad_video_0_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_0_LINK_REQUIRED");
    if (cJSON_IsNull(ad_video_0_link_required)) {
        ad_video_0_link_required = NULL;
    }
    if (ad_video_0_link_required) { 
    if(!cJSON_IsNumber(ad_video_0_link_required))
    {
    goto end; //Numeric
    }
    ad_video_0_link_required_local_var = malloc(sizeof(int));
    if(!ad_video_0_link_required_local_var)
    {
        goto end;
    }
    *ad_video_0_link_required_local_var = ad_video_0_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_0_link_warning
    cJSON *ad_video_0_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_0_LINK_WARNING");
    if (cJSON_IsNull(ad_video_0_link_warning)) {
        ad_video_0_link_warning = NULL;
    }
    if (ad_video_0_link_warning) { 
    if(!cJSON_IsNumber(ad_video_0_link_warning))
    {
    goto end; //Numeric
    }
    ad_video_0_link_warning_local_var = malloc(sizeof(int));
    if(!ad_video_0_link_warning_local_var)
    {
        goto end;
    }
    *ad_video_0_link_warning_local_var = ad_video_0_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_0_tag_duplicated
    cJSON *ad_video_0_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_0_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_video_0_tag_duplicated)) {
        ad_video_0_tag_duplicated = NULL;
    }
    if (ad_video_0_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_video_0_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_video_0_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_video_0_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_video_0_tag_duplicated_local_var = ad_video_0_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_0_tag_length_too_long
    cJSON *ad_video_0_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_0_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_video_0_tag_length_too_long)) {
        ad_video_0_tag_length_too_long = NULL;
    }
    if (ad_video_0_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_video_0_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_video_0_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_video_0_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_video_0_tag_length_too_long_local_var = ad_video_0_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_0_tag_required
    cJSON *ad_video_0_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_0_TAG_REQUIRED");
    if (cJSON_IsNull(ad_video_0_tag_required)) {
        ad_video_0_tag_required = NULL;
    }
    if (ad_video_0_tag_required) { 
    if(!cJSON_IsNumber(ad_video_0_tag_required))
    {
    goto end; //Numeric
    }
    ad_video_0_tag_required_local_var = malloc(sizeof(int));
    if(!ad_video_0_tag_required_local_var)
    {
        goto end;
    }
    *ad_video_0_tag_required_local_var = ad_video_0_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_1_link_duplicated
    cJSON *ad_video_1_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_1_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_video_1_link_duplicated)) {
        ad_video_1_link_duplicated = NULL;
    }
    if (ad_video_1_link_duplicated) { 
    if(!cJSON_IsNumber(ad_video_1_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_video_1_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_video_1_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_video_1_link_duplicated_local_var = ad_video_1_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_1_link_length_too_long
    cJSON *ad_video_1_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_1_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_video_1_link_length_too_long)) {
        ad_video_1_link_length_too_long = NULL;
    }
    if (ad_video_1_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_video_1_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_video_1_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_video_1_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_video_1_link_length_too_long_local_var = ad_video_1_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_1_link_required
    cJSON *ad_video_1_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_1_LINK_REQUIRED");
    if (cJSON_IsNull(ad_video_1_link_required)) {
        ad_video_1_link_required = NULL;
    }
    if (ad_video_1_link_required) { 
    if(!cJSON_IsNumber(ad_video_1_link_required))
    {
    goto end; //Numeric
    }
    ad_video_1_link_required_local_var = malloc(sizeof(int));
    if(!ad_video_1_link_required_local_var)
    {
        goto end;
    }
    *ad_video_1_link_required_local_var = ad_video_1_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_1_link_warning
    cJSON *ad_video_1_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_1_LINK_WARNING");
    if (cJSON_IsNull(ad_video_1_link_warning)) {
        ad_video_1_link_warning = NULL;
    }
    if (ad_video_1_link_warning) { 
    if(!cJSON_IsNumber(ad_video_1_link_warning))
    {
    goto end; //Numeric
    }
    ad_video_1_link_warning_local_var = malloc(sizeof(int));
    if(!ad_video_1_link_warning_local_var)
    {
        goto end;
    }
    *ad_video_1_link_warning_local_var = ad_video_1_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_1_tag_duplicated
    cJSON *ad_video_1_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_1_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_video_1_tag_duplicated)) {
        ad_video_1_tag_duplicated = NULL;
    }
    if (ad_video_1_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_video_1_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_video_1_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_video_1_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_video_1_tag_duplicated_local_var = ad_video_1_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_1_tag_length_too_long
    cJSON *ad_video_1_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_1_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_video_1_tag_length_too_long)) {
        ad_video_1_tag_length_too_long = NULL;
    }
    if (ad_video_1_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_video_1_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_video_1_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_video_1_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_video_1_tag_length_too_long_local_var = ad_video_1_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_1_tag_required
    cJSON *ad_video_1_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_1_TAG_REQUIRED");
    if (cJSON_IsNull(ad_video_1_tag_required)) {
        ad_video_1_tag_required = NULL;
    }
    if (ad_video_1_tag_required) { 
    if(!cJSON_IsNumber(ad_video_1_tag_required))
    {
    goto end; //Numeric
    }
    ad_video_1_tag_required_local_var = malloc(sizeof(int));
    if(!ad_video_1_tag_required_local_var)
    {
        goto end;
    }
    *ad_video_1_tag_required_local_var = ad_video_1_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_2_link_duplicated
    cJSON *ad_video_2_link_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_2_LINK_DUPLICATED");
    if (cJSON_IsNull(ad_video_2_link_duplicated)) {
        ad_video_2_link_duplicated = NULL;
    }
    if (ad_video_2_link_duplicated) { 
    if(!cJSON_IsNumber(ad_video_2_link_duplicated))
    {
    goto end; //Numeric
    }
    ad_video_2_link_duplicated_local_var = malloc(sizeof(int));
    if(!ad_video_2_link_duplicated_local_var)
    {
        goto end;
    }
    *ad_video_2_link_duplicated_local_var = ad_video_2_link_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_2_link_length_too_long
    cJSON *ad_video_2_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_2_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_video_2_link_length_too_long)) {
        ad_video_2_link_length_too_long = NULL;
    }
    if (ad_video_2_link_length_too_long) { 
    if(!cJSON_IsNumber(ad_video_2_link_length_too_long))
    {
    goto end; //Numeric
    }
    ad_video_2_link_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_video_2_link_length_too_long_local_var)
    {
        goto end;
    }
    *ad_video_2_link_length_too_long_local_var = ad_video_2_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_2_link_required
    cJSON *ad_video_2_link_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_2_LINK_REQUIRED");
    if (cJSON_IsNull(ad_video_2_link_required)) {
        ad_video_2_link_required = NULL;
    }
    if (ad_video_2_link_required) { 
    if(!cJSON_IsNumber(ad_video_2_link_required))
    {
    goto end; //Numeric
    }
    ad_video_2_link_required_local_var = malloc(sizeof(int));
    if(!ad_video_2_link_required_local_var)
    {
        goto end;
    }
    *ad_video_2_link_required_local_var = ad_video_2_link_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_2_link_warning
    cJSON *ad_video_2_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_2_LINK_WARNING");
    if (cJSON_IsNull(ad_video_2_link_warning)) {
        ad_video_2_link_warning = NULL;
    }
    if (ad_video_2_link_warning) { 
    if(!cJSON_IsNumber(ad_video_2_link_warning))
    {
    goto end; //Numeric
    }
    ad_video_2_link_warning_local_var = malloc(sizeof(int));
    if(!ad_video_2_link_warning_local_var)
    {
        goto end;
    }
    *ad_video_2_link_warning_local_var = ad_video_2_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_2_tag_duplicated
    cJSON *ad_video_2_tag_duplicated = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_2_TAG_DUPLICATED");
    if (cJSON_IsNull(ad_video_2_tag_duplicated)) {
        ad_video_2_tag_duplicated = NULL;
    }
    if (ad_video_2_tag_duplicated) { 
    if(!cJSON_IsNumber(ad_video_2_tag_duplicated))
    {
    goto end; //Numeric
    }
    ad_video_2_tag_duplicated_local_var = malloc(sizeof(int));
    if(!ad_video_2_tag_duplicated_local_var)
    {
        goto end;
    }
    *ad_video_2_tag_duplicated_local_var = ad_video_2_tag_duplicated->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_2_tag_length_too_long
    cJSON *ad_video_2_tag_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_2_TAG_LENGTH_TOO_LONG");
    if (cJSON_IsNull(ad_video_2_tag_length_too_long)) {
        ad_video_2_tag_length_too_long = NULL;
    }
    if (ad_video_2_tag_length_too_long) { 
    if(!cJSON_IsNumber(ad_video_2_tag_length_too_long))
    {
    goto end; //Numeric
    }
    ad_video_2_tag_length_too_long_local_var = malloc(sizeof(int));
    if(!ad_video_2_tag_length_too_long_local_var)
    {
        goto end;
    }
    *ad_video_2_tag_length_too_long_local_var = ad_video_2_tag_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->ad_video_2_tag_required
    cJSON *ad_video_2_tag_required = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AD_VIDEO_2_TAG_REQUIRED");
    if (cJSON_IsNull(ad_video_2_tag_required)) {
        ad_video_2_tag_required = NULL;
    }
    if (ad_video_2_tag_required) { 
    if(!cJSON_IsNumber(ad_video_2_tag_required))
    {
    goto end; //Numeric
    }
    ad_video_2_tag_required_local_var = malloc(sizeof(int));
    if(!ad_video_2_tag_required_local_var)
    {
        goto end;
    }
    *ad_video_2_tag_required_local_var = ad_video_2_tag_required->valuedouble;
    }

    // catalogs_feed_validation_warnings->additional_image_link_length_too_long
    cJSON *additional_image_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(additional_image_link_length_too_long)) {
        additional_image_link_length_too_long = NULL;
    }
    if (additional_image_link_length_too_long) { 
    if(!cJSON_IsNumber(additional_image_link_length_too_long))
    {
    goto end; //Numeric
    }
    additional_image_link_length_too_long_local_var = malloc(sizeof(int));
    if(!additional_image_link_length_too_long_local_var)
    {
        goto end;
    }
    *additional_image_link_length_too_long_local_var = additional_image_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->additional_image_link_warning
    cJSON *additional_image_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ADDITIONAL_IMAGE_LINK_WARNING");
    if (cJSON_IsNull(additional_image_link_warning)) {
        additional_image_link_warning = NULL;
    }
    if (additional_image_link_warning) { 
    if(!cJSON_IsNumber(additional_image_link_warning))
    {
    goto end; //Numeric
    }
    additional_image_link_warning_local_var = malloc(sizeof(int));
    if(!additional_image_link_warning_local_var)
    {
        goto end;
    }
    *additional_image_link_warning_local_var = additional_image_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->adwords_format_warning
    cJSON *adwords_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ADWORDS_FORMAT_WARNING");
    if (cJSON_IsNull(adwords_format_warning)) {
        adwords_format_warning = NULL;
    }
    if (adwords_format_warning) { 
    if(!cJSON_IsNumber(adwords_format_warning))
    {
    goto end; //Numeric
    }
    adwords_format_warning_local_var = malloc(sizeof(int));
    if(!adwords_format_warning_local_var)
    {
        goto end;
    }
    *adwords_format_warning_local_var = adwords_format_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->adwords_same_as_link
    cJSON *adwords_same_as_link = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ADWORDS_SAME_AS_LINK");
    if (cJSON_IsNull(adwords_same_as_link)) {
        adwords_same_as_link = NULL;
    }
    if (adwords_same_as_link) { 
    if(!cJSON_IsNumber(adwords_same_as_link))
    {
    goto end; //Numeric
    }
    adwords_same_as_link_local_var = malloc(sizeof(int));
    if(!adwords_same_as_link_local_var)
    {
        goto end;
    }
    *adwords_same_as_link_local_var = adwords_same_as_link->valuedouble;
    }

    // catalogs_feed_validation_warnings->age_group_invalid
    cJSON *age_group_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AGE_GROUP_INVALID");
    if (cJSON_IsNull(age_group_invalid)) {
        age_group_invalid = NULL;
    }
    if (age_group_invalid) { 
    if(!cJSON_IsNumber(age_group_invalid))
    {
    goto end; //Numeric
    }
    age_group_invalid_local_var = malloc(sizeof(int));
    if(!age_group_invalid_local_var)
    {
        goto end;
    }
    *age_group_invalid_local_var = age_group_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->android_deep_link_invalid
    cJSON *android_deep_link_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ANDROID_DEEP_LINK_INVALID");
    if (cJSON_IsNull(android_deep_link_invalid)) {
        android_deep_link_invalid = NULL;
    }
    if (android_deep_link_invalid) { 
    if(!cJSON_IsNumber(android_deep_link_invalid))
    {
    goto end; //Numeric
    }
    android_deep_link_invalid_local_var = malloc(sizeof(int));
    if(!android_deep_link_invalid_local_var)
    {
        goto end;
    }
    *android_deep_link_invalid_local_var = android_deep_link_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->availability_date_invalid
    cJSON *availability_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "AVAILABILITY_DATE_INVALID");
    if (cJSON_IsNull(availability_date_invalid)) {
        availability_date_invalid = NULL;
    }
    if (availability_date_invalid) { 
    if(!cJSON_IsNumber(availability_date_invalid))
    {
    goto end; //Numeric
    }
    availability_date_invalid_local_var = malloc(sizeof(int));
    if(!availability_date_invalid_local_var)
    {
        goto end;
    }
    *availability_date_invalid_local_var = availability_date_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->country_does_not_map_to_currency
    cJSON *country_does_not_map_to_currency = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "COUNTRY_DOES_NOT_MAP_TO_CURRENCY");
    if (cJSON_IsNull(country_does_not_map_to_currency)) {
        country_does_not_map_to_currency = NULL;
    }
    if (country_does_not_map_to_currency) { 
    if(!cJSON_IsNumber(country_does_not_map_to_currency))
    {
    goto end; //Numeric
    }
    country_does_not_map_to_currency_local_var = malloc(sizeof(int));
    if(!country_does_not_map_to_currency_local_var)
    {
        goto end;
    }
    *country_does_not_map_to_currency_local_var = country_does_not_map_to_currency->valuedouble;
    }

    // catalogs_feed_validation_warnings->custom_label_length_too_long
    cJSON *custom_label_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "CUSTOM_LABEL_LENGTH_TOO_LONG");
    if (cJSON_IsNull(custom_label_length_too_long)) {
        custom_label_length_too_long = NULL;
    }
    if (custom_label_length_too_long) { 
    if(!cJSON_IsNumber(custom_label_length_too_long))
    {
    goto end; //Numeric
    }
    custom_label_length_too_long_local_var = malloc(sizeof(int));
    if(!custom_label_length_too_long_local_var)
    {
        goto end;
    }
    *custom_label_length_too_long_local_var = custom_label_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->description_length_too_long
    cJSON *description_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "DESCRIPTION_LENGTH_TOO_LONG");
    if (cJSON_IsNull(description_length_too_long)) {
        description_length_too_long = NULL;
    }
    if (description_length_too_long) { 
    if(!cJSON_IsNumber(description_length_too_long))
    {
    goto end; //Numeric
    }
    description_length_too_long_local_var = malloc(sizeof(int));
    if(!description_length_too_long_local_var)
    {
        goto end;
    }
    *description_length_too_long_local_var = description_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->duplicate_headers
    cJSON *duplicate_headers = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "DUPLICATE_HEADERS");
    if (cJSON_IsNull(duplicate_headers)) {
        duplicate_headers = NULL;
    }
    if (duplicate_headers) { 
    if(!cJSON_IsNumber(duplicate_headers))
    {
    goto end; //Numeric
    }
    duplicate_headers_local_var = malloc(sizeof(int));
    if(!duplicate_headers_local_var)
    {
        goto end;
    }
    *duplicate_headers_local_var = duplicate_headers->valuedouble;
    }

    // catalogs_feed_validation_warnings->expiration_date_invalid
    cJSON *expiration_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "EXPIRATION_DATE_INVALID");
    if (cJSON_IsNull(expiration_date_invalid)) {
        expiration_date_invalid = NULL;
    }
    if (expiration_date_invalid) { 
    if(!cJSON_IsNumber(expiration_date_invalid))
    {
    goto end; //Numeric
    }
    expiration_date_invalid_local_var = malloc(sizeof(int));
    if(!expiration_date_invalid_local_var)
    {
        goto end;
    }
    *expiration_date_invalid_local_var = expiration_date_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->fetch_same_signature
    cJSON *fetch_same_signature = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "FETCH_SAME_SIGNATURE");
    if (cJSON_IsNull(fetch_same_signature)) {
        fetch_same_signature = NULL;
    }
    if (fetch_same_signature) { 
    if(!cJSON_IsNumber(fetch_same_signature))
    {
    goto end; //Numeric
    }
    fetch_same_signature_local_var = malloc(sizeof(int));
    if(!fetch_same_signature_local_var)
    {
        goto end;
    }
    *fetch_same_signature_local_var = fetch_same_signature->valuedouble;
    }

    // catalogs_feed_validation_warnings->gender_invalid
    cJSON *gender_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "GENDER_INVALID");
    if (cJSON_IsNull(gender_invalid)) {
        gender_invalid = NULL;
    }
    if (gender_invalid) { 
    if(!cJSON_IsNumber(gender_invalid))
    {
    goto end; //Numeric
    }
    gender_invalid_local_var = malloc(sizeof(int));
    if(!gender_invalid_local_var)
    {
        goto end;
    }
    *gender_invalid_local_var = gender_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->gtin_invalid
    cJSON *gtin_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "GTIN_INVALID");
    if (cJSON_IsNull(gtin_invalid)) {
        gtin_invalid = NULL;
    }
    if (gtin_invalid) { 
    if(!cJSON_IsNumber(gtin_invalid))
    {
    goto end; //Numeric
    }
    gtin_invalid_local_var = malloc(sizeof(int));
    if(!gtin_invalid_local_var)
    {
        goto end;
    }
    *gtin_invalid_local_var = gtin_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->image_link_warning
    cJSON *image_link_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "IMAGE_LINK_WARNING");
    if (cJSON_IsNull(image_link_warning)) {
        image_link_warning = NULL;
    }
    if (image_link_warning) { 
    if(!cJSON_IsNumber(image_link_warning))
    {
    goto end; //Numeric
    }
    image_link_warning_local_var = malloc(sizeof(int));
    if(!image_link_warning_local_var)
    {
        goto end;
    }
    *image_link_warning_local_var = image_link_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->inconsistent_currency_values
    cJSON *inconsistent_currency_values = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "INCONSISTENT_CURRENCY_VALUES");
    if (cJSON_IsNull(inconsistent_currency_values)) {
        inconsistent_currency_values = NULL;
    }
    if (inconsistent_currency_values) { 
    if(!cJSON_IsNumber(inconsistent_currency_values))
    {
    goto end; //Numeric
    }
    inconsistent_currency_values_local_var = malloc(sizeof(int));
    if(!inconsistent_currency_values_local_var)
    {
        goto end;
    }
    *inconsistent_currency_values_local_var = inconsistent_currency_values->valuedouble;
    }

    // catalogs_feed_validation_warnings->indexed_product_count_large_delta
    cJSON *indexed_product_count_large_delta = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "INDEXED_PRODUCT_COUNT_LARGE_DELTA");
    if (cJSON_IsNull(indexed_product_count_large_delta)) {
        indexed_product_count_large_delta = NULL;
    }
    if (indexed_product_count_large_delta) { 
    if(!cJSON_IsNumber(indexed_product_count_large_delta))
    {
    goto end; //Numeric
    }
    indexed_product_count_large_delta_local_var = malloc(sizeof(int));
    if(!indexed_product_count_large_delta_local_var)
    {
        goto end;
    }
    *indexed_product_count_large_delta_local_var = indexed_product_count_large_delta->valuedouble;
    }

    // catalogs_feed_validation_warnings->ios_deep_link_invalid
    cJSON *ios_deep_link_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "IOS_DEEP_LINK_INVALID");
    if (cJSON_IsNull(ios_deep_link_invalid)) {
        ios_deep_link_invalid = NULL;
    }
    if (ios_deep_link_invalid) { 
    if(!cJSON_IsNumber(ios_deep_link_invalid))
    {
    goto end; //Numeric
    }
    ios_deep_link_invalid_local_var = malloc(sizeof(int));
    if(!ios_deep_link_invalid_local_var)
    {
        goto end;
    }
    *ios_deep_link_invalid_local_var = ios_deep_link_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->is_bundle_invalid
    cJSON *is_bundle_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "IS_BUNDLE_INVALID");
    if (cJSON_IsNull(is_bundle_invalid)) {
        is_bundle_invalid = NULL;
    }
    if (is_bundle_invalid) { 
    if(!cJSON_IsNumber(is_bundle_invalid))
    {
    goto end; //Numeric
    }
    is_bundle_invalid_local_var = malloc(sizeof(int));
    if(!is_bundle_invalid_local_var)
    {
        goto end;
    }
    *is_bundle_invalid_local_var = is_bundle_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->item_additional_image_download_failure
    cJSON *item_additional_image_download_failure = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE");
    if (cJSON_IsNull(item_additional_image_download_failure)) {
        item_additional_image_download_failure = NULL;
    }
    if (item_additional_image_download_failure) { 
    if(!cJSON_IsNumber(item_additional_image_download_failure))
    {
    goto end; //Numeric
    }
    item_additional_image_download_failure_local_var = malloc(sizeof(int));
    if(!item_additional_image_download_failure_local_var)
    {
        goto end;
    }
    *item_additional_image_download_failure_local_var = item_additional_image_download_failure->valuedouble;
    }

    // catalogs_feed_validation_warnings->link_format_warning
    cJSON *link_format_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "LINK_FORMAT_WARNING");
    if (cJSON_IsNull(link_format_warning)) {
        link_format_warning = NULL;
    }
    if (link_format_warning) { 
    if(!cJSON_IsNumber(link_format_warning))
    {
    goto end; //Numeric
    }
    link_format_warning_local_var = malloc(sizeof(int));
    if(!link_format_warning_local_var)
    {
        goto end;
    }
    *link_format_warning_local_var = link_format_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->min_ad_price_invalid
    cJSON *min_ad_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "MIN_AD_PRICE_INVALID");
    if (cJSON_IsNull(min_ad_price_invalid)) {
        min_ad_price_invalid = NULL;
    }
    if (min_ad_price_invalid) { 
    if(!cJSON_IsNumber(min_ad_price_invalid))
    {
    goto end; //Numeric
    }
    min_ad_price_invalid_local_var = malloc(sizeof(int));
    if(!min_ad_price_invalid_local_var)
    {
        goto end;
    }
    *min_ad_price_invalid_local_var = min_ad_price_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->mpn_invalid
    cJSON *mpn_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "MPN_INVALID");
    if (cJSON_IsNull(mpn_invalid)) {
        mpn_invalid = NULL;
    }
    if (mpn_invalid) { 
    if(!cJSON_IsNumber(mpn_invalid))
    {
    goto end; //Numeric
    }
    mpn_invalid_local_var = malloc(sizeof(int));
    if(!mpn_invalid_local_var)
    {
        goto end;
    }
    *mpn_invalid_local_var = mpn_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->multipack_invalid
    cJSON *multipack_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "MULTIPACK_INVALID");
    if (cJSON_IsNull(multipack_invalid)) {
        multipack_invalid = NULL;
    }
    if (multipack_invalid) { 
    if(!cJSON_IsNumber(multipack_invalid))
    {
    goto end; //Numeric
    }
    multipack_invalid_local_var = malloc(sizeof(int));
    if(!multipack_invalid_local_var)
    {
        goto end;
    }
    *multipack_invalid_local_var = multipack_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->optional_condition_invalid
    cJSON *optional_condition_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "OPTIONAL_CONDITION_INVALID");
    if (cJSON_IsNull(optional_condition_invalid)) {
        optional_condition_invalid = NULL;
    }
    if (optional_condition_invalid) { 
    if(!cJSON_IsNumber(optional_condition_invalid))
    {
    goto end; //Numeric
    }
    optional_condition_invalid_local_var = malloc(sizeof(int));
    if(!optional_condition_invalid_local_var)
    {
        goto end;
    }
    *optional_condition_invalid_local_var = optional_condition_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->optional_condition_missing
    cJSON *optional_condition_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "OPTIONAL_CONDITION_MISSING");
    if (cJSON_IsNull(optional_condition_missing)) {
        optional_condition_missing = NULL;
    }
    if (optional_condition_missing) { 
    if(!cJSON_IsNumber(optional_condition_missing))
    {
    goto end; //Numeric
    }
    optional_condition_missing_local_var = malloc(sizeof(int));
    if(!optional_condition_missing_local_var)
    {
        goto end;
    }
    *optional_condition_missing_local_var = optional_condition_missing->valuedouble;
    }

    // catalogs_feed_validation_warnings->optional_product_category_invalid
    cJSON *optional_product_category_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "OPTIONAL_PRODUCT_CATEGORY_INVALID");
    if (cJSON_IsNull(optional_product_category_invalid)) {
        optional_product_category_invalid = NULL;
    }
    if (optional_product_category_invalid) { 
    if(!cJSON_IsNumber(optional_product_category_invalid))
    {
    goto end; //Numeric
    }
    optional_product_category_invalid_local_var = malloc(sizeof(int));
    if(!optional_product_category_invalid_local_var)
    {
        goto end;
    }
    *optional_product_category_invalid_local_var = optional_product_category_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->optional_product_category_missing
    cJSON *optional_product_category_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "OPTIONAL_PRODUCT_CATEGORY_MISSING");
    if (cJSON_IsNull(optional_product_category_missing)) {
        optional_product_category_missing = NULL;
    }
    if (optional_product_category_missing) { 
    if(!cJSON_IsNumber(optional_product_category_missing))
    {
    goto end; //Numeric
    }
    optional_product_category_missing_local_var = malloc(sizeof(int));
    if(!optional_product_category_missing_local_var)
    {
        goto end;
    }
    *optional_product_category_missing_local_var = optional_product_category_missing->valuedouble;
    }

    // catalogs_feed_validation_warnings->product_category_depth_warning
    cJSON *product_category_depth_warning = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "PRODUCT_CATEGORY_DEPTH_WARNING");
    if (cJSON_IsNull(product_category_depth_warning)) {
        product_category_depth_warning = NULL;
    }
    if (product_category_depth_warning) { 
    if(!cJSON_IsNumber(product_category_depth_warning))
    {
    goto end; //Numeric
    }
    product_category_depth_warning_local_var = malloc(sizeof(int));
    if(!product_category_depth_warning_local_var)
    {
        goto end;
    }
    *product_category_depth_warning_local_var = product_category_depth_warning->valuedouble;
    }

    // catalogs_feed_validation_warnings->product_type_length_too_long
    cJSON *product_type_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "PRODUCT_TYPE_LENGTH_TOO_LONG");
    if (cJSON_IsNull(product_type_length_too_long)) {
        product_type_length_too_long = NULL;
    }
    if (product_type_length_too_long) { 
    if(!cJSON_IsNumber(product_type_length_too_long))
    {
    goto end; //Numeric
    }
    product_type_length_too_long_local_var = malloc(sizeof(int));
    if(!product_type_length_too_long_local_var)
    {
        goto end;
    }
    *product_type_length_too_long_local_var = product_type_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->sale_date_invalid
    cJSON *sale_date_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SALE_DATE_INVALID");
    if (cJSON_IsNull(sale_date_invalid)) {
        sale_date_invalid = NULL;
    }
    if (sale_date_invalid) { 
    if(!cJSON_IsNumber(sale_date_invalid))
    {
    goto end; //Numeric
    }
    sale_date_invalid_local_var = malloc(sizeof(int));
    if(!sale_date_invalid_local_var)
    {
        goto end;
    }
    *sale_date_invalid_local_var = sale_date_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->sales_price_invalid
    cJSON *sales_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SALES_PRICE_INVALID");
    if (cJSON_IsNull(sales_price_invalid)) {
        sales_price_invalid = NULL;
    }
    if (sales_price_invalid) { 
    if(!cJSON_IsNumber(sales_price_invalid))
    {
    goto end; //Numeric
    }
    sales_price_invalid_local_var = malloc(sizeof(int));
    if(!sales_price_invalid_local_var)
    {
        goto end;
    }
    *sales_price_invalid_local_var = sales_price_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->sales_price_too_high
    cJSON *sales_price_too_high = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SALES_PRICE_TOO_HIGH");
    if (cJSON_IsNull(sales_price_too_high)) {
        sales_price_too_high = NULL;
    }
    if (sales_price_too_high) { 
    if(!cJSON_IsNumber(sales_price_too_high))
    {
    goto end; //Numeric
    }
    sales_price_too_high_local_var = malloc(sizeof(int));
    if(!sales_price_too_high_local_var)
    {
        goto end;
    }
    *sales_price_too_high_local_var = sales_price_too_high->valuedouble;
    }

    // catalogs_feed_validation_warnings->sales_price_too_low
    cJSON *sales_price_too_low = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SALES_PRICE_TOO_LOW");
    if (cJSON_IsNull(sales_price_too_low)) {
        sales_price_too_low = NULL;
    }
    if (sales_price_too_low) { 
    if(!cJSON_IsNumber(sales_price_too_low))
    {
    goto end; //Numeric
    }
    sales_price_too_low_local_var = malloc(sizeof(int));
    if(!sales_price_too_low_local_var)
    {
        goto end;
    }
    *sales_price_too_low_local_var = sales_price_too_low->valuedouble;
    }

    // catalogs_feed_validation_warnings->shipping_height_invalid
    cJSON *shipping_height_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SHIPPING_HEIGHT_INVALID");
    if (cJSON_IsNull(shipping_height_invalid)) {
        shipping_height_invalid = NULL;
    }
    if (shipping_height_invalid) { 
    if(!cJSON_IsNumber(shipping_height_invalid))
    {
    goto end; //Numeric
    }
    shipping_height_invalid_local_var = malloc(sizeof(int));
    if(!shipping_height_invalid_local_var)
    {
        goto end;
    }
    *shipping_height_invalid_local_var = shipping_height_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->shipping_invalid
    cJSON *shipping_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SHIPPING_INVALID");
    if (cJSON_IsNull(shipping_invalid)) {
        shipping_invalid = NULL;
    }
    if (shipping_invalid) { 
    if(!cJSON_IsNumber(shipping_invalid))
    {
    goto end; //Numeric
    }
    shipping_invalid_local_var = malloc(sizeof(int));
    if(!shipping_invalid_local_var)
    {
        goto end;
    }
    *shipping_invalid_local_var = shipping_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->shipping_weight_invalid
    cJSON *shipping_weight_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SHIPPING_WEIGHT_INVALID");
    if (cJSON_IsNull(shipping_weight_invalid)) {
        shipping_weight_invalid = NULL;
    }
    if (shipping_weight_invalid) { 
    if(!cJSON_IsNumber(shipping_weight_invalid))
    {
    goto end; //Numeric
    }
    shipping_weight_invalid_local_var = malloc(sizeof(int));
    if(!shipping_weight_invalid_local_var)
    {
        goto end;
    }
    *shipping_weight_invalid_local_var = shipping_weight_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->shipping_width_invalid
    cJSON *shipping_width_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SHIPPING_WIDTH_INVALID");
    if (cJSON_IsNull(shipping_width_invalid)) {
        shipping_width_invalid = NULL;
    }
    if (shipping_width_invalid) { 
    if(!cJSON_IsNumber(shipping_width_invalid))
    {
    goto end; //Numeric
    }
    shipping_width_invalid_local_var = malloc(sizeof(int));
    if(!shipping_width_invalid_local_var)
    {
        goto end;
    }
    *shipping_width_invalid_local_var = shipping_width_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->size_system_invalid
    cJSON *size_system_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SIZE_SYSTEM_INVALID");
    if (cJSON_IsNull(size_system_invalid)) {
        size_system_invalid = NULL;
    }
    if (size_system_invalid) { 
    if(!cJSON_IsNumber(size_system_invalid))
    {
    goto end; //Numeric
    }
    size_system_invalid_local_var = malloc(sizeof(int));
    if(!size_system_invalid_local_var)
    {
        goto end;
    }
    *size_system_invalid_local_var = size_system_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->size_type_invalid
    cJSON *size_type_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "SIZE_TYPE_INVALID");
    if (cJSON_IsNull(size_type_invalid)) {
        size_type_invalid = NULL;
    }
    if (size_type_invalid) { 
    if(!cJSON_IsNumber(size_type_invalid))
    {
    goto end; //Numeric
    }
    size_type_invalid_local_var = malloc(sizeof(int));
    if(!size_type_invalid_local_var)
    {
        goto end;
    }
    *size_type_invalid_local_var = size_type_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->tax_invalid
    cJSON *tax_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "TAX_INVALID");
    if (cJSON_IsNull(tax_invalid)) {
        tax_invalid = NULL;
    }
    if (tax_invalid) { 
    if(!cJSON_IsNumber(tax_invalid))
    {
    goto end; //Numeric
    }
    tax_invalid_local_var = malloc(sizeof(int));
    if(!tax_invalid_local_var)
    {
        goto end;
    }
    *tax_invalid_local_var = tax_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->title_length_too_long
    cJSON *title_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "TITLE_LENGTH_TOO_LONG");
    if (cJSON_IsNull(title_length_too_long)) {
        title_length_too_long = NULL;
    }
    if (title_length_too_long) { 
    if(!cJSON_IsNumber(title_length_too_long))
    {
    goto end; //Numeric
    }
    title_length_too_long_local_var = malloc(sizeof(int));
    if(!title_length_too_long_local_var)
    {
        goto end;
    }
    *title_length_too_long_local_var = title_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_warnings->too_many_additional_image_links
    cJSON *too_many_additional_image_links = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "TOO_MANY_ADDITIONAL_IMAGE_LINKS");
    if (cJSON_IsNull(too_many_additional_image_links)) {
        too_many_additional_image_links = NULL;
    }
    if (too_many_additional_image_links) { 
    if(!cJSON_IsNumber(too_many_additional_image_links))
    {
    goto end; //Numeric
    }
    too_many_additional_image_links_local_var = malloc(sizeof(int));
    if(!too_many_additional_image_links_local_var)
    {
        goto end;
    }
    *too_many_additional_image_links_local_var = too_many_additional_image_links->valuedouble;
    }

    // catalogs_feed_validation_warnings->updated_time_invalid
    cJSON *updated_time_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "UPDATED_TIME_INVALID");
    if (cJSON_IsNull(updated_time_invalid)) {
        updated_time_invalid = NULL;
    }
    if (updated_time_invalid) { 
    if(!cJSON_IsNumber(updated_time_invalid))
    {
    goto end; //Numeric
    }
    updated_time_invalid_local_var = malloc(sizeof(int));
    if(!updated_time_invalid_local_var)
    {
        goto end;
    }
    *updated_time_invalid_local_var = updated_time_invalid->valuedouble;
    }

    // catalogs_feed_validation_warnings->utm_source_auto_corrected
    cJSON *utm_source_auto_corrected = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "UTM_SOURCE_AUTO_CORRECTED");
    if (cJSON_IsNull(utm_source_auto_corrected)) {
        utm_source_auto_corrected = NULL;
    }
    if (utm_source_auto_corrected) { 
    if(!cJSON_IsNumber(utm_source_auto_corrected))
    {
    goto end; //Numeric
    }
    utm_source_auto_corrected_local_var = malloc(sizeof(int));
    if(!utm_source_auto_corrected_local_var)
    {
        goto end;
    }
    *utm_source_auto_corrected_local_var = utm_source_auto_corrected->valuedouble;
    }

    // catalogs_feed_validation_warnings->video_required_when_ad_video_provided
    cJSON *video_required_when_ad_video_provided = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED");
    if (cJSON_IsNull(video_required_when_ad_video_provided)) {
        video_required_when_ad_video_provided = NULL;
    }
    if (video_required_when_ad_video_provided) { 
    if(!cJSON_IsNumber(video_required_when_ad_video_provided))
    {
    goto end; //Numeric
    }
    video_required_when_ad_video_provided_local_var = malloc(sizeof(int));
    if(!video_required_when_ad_video_provided_local_var)
    {
        goto end;
    }
    *video_required_when_ad_video_provided_local_var = video_required_when_ad_video_provided->valuedouble;
    }

    // catalogs_feed_validation_warnings->weight_unit_invalid
    cJSON *weight_unit_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_warningsJSON, "WEIGHT_UNIT_INVALID");
    if (cJSON_IsNull(weight_unit_invalid)) {
        weight_unit_invalid = NULL;
    }
    if (weight_unit_invalid) { 
    if(!cJSON_IsNumber(weight_unit_invalid))
    {
    goto end; //Numeric
    }
    weight_unit_invalid_local_var = malloc(sizeof(int));
    if(!weight_unit_invalid_local_var)
    {
        goto end;
    }
    *weight_unit_invalid_local_var = weight_unit_invalid->valuedouble;
    }



    catalogs_feed_validation_warnings_local_var = catalogs_feed_validation_warnings_create_internal (
        ad_image_0_link_duplicated_local_var,
        ad_image_0_link_length_too_long_local_var,
        ad_image_0_link_required_local_var,
        ad_image_0_link_warning_local_var,
        ad_image_0_tag_duplicated_local_var,
        ad_image_0_tag_length_too_long_local_var,
        ad_image_0_tag_required_local_var,
        ad_image_10_link_duplicated_local_var,
        ad_image_10_link_length_too_long_local_var,
        ad_image_10_link_required_local_var,
        ad_image_10_link_warning_local_var,
        ad_image_10_tag_duplicated_local_var,
        ad_image_10_tag_length_too_long_local_var,
        ad_image_10_tag_required_local_var,
        ad_image_11_link_duplicated_local_var,
        ad_image_11_link_length_too_long_local_var,
        ad_image_11_link_required_local_var,
        ad_image_11_link_warning_local_var,
        ad_image_11_tag_duplicated_local_var,
        ad_image_11_tag_length_too_long_local_var,
        ad_image_11_tag_required_local_var,
        ad_image_12_link_duplicated_local_var,
        ad_image_12_link_length_too_long_local_var,
        ad_image_12_link_required_local_var,
        ad_image_12_link_warning_local_var,
        ad_image_12_tag_duplicated_local_var,
        ad_image_12_tag_length_too_long_local_var,
        ad_image_12_tag_required_local_var,
        ad_image_13_link_duplicated_local_var,
        ad_image_13_link_length_too_long_local_var,
        ad_image_13_link_required_local_var,
        ad_image_13_link_warning_local_var,
        ad_image_13_tag_duplicated_local_var,
        ad_image_13_tag_length_too_long_local_var,
        ad_image_13_tag_required_local_var,
        ad_image_14_link_duplicated_local_var,
        ad_image_14_link_length_too_long_local_var,
        ad_image_14_link_required_local_var,
        ad_image_14_link_warning_local_var,
        ad_image_14_tag_duplicated_local_var,
        ad_image_14_tag_length_too_long_local_var,
        ad_image_14_tag_required_local_var,
        ad_image_15_link_duplicated_local_var,
        ad_image_15_link_length_too_long_local_var,
        ad_image_15_link_required_local_var,
        ad_image_15_link_warning_local_var,
        ad_image_15_tag_duplicated_local_var,
        ad_image_15_tag_length_too_long_local_var,
        ad_image_15_tag_required_local_var,
        ad_image_16_link_duplicated_local_var,
        ad_image_16_link_length_too_long_local_var,
        ad_image_16_link_required_local_var,
        ad_image_16_link_warning_local_var,
        ad_image_16_tag_duplicated_local_var,
        ad_image_16_tag_length_too_long_local_var,
        ad_image_16_tag_required_local_var,
        ad_image_17_link_duplicated_local_var,
        ad_image_17_link_length_too_long_local_var,
        ad_image_17_link_required_local_var,
        ad_image_17_link_warning_local_var,
        ad_image_17_tag_duplicated_local_var,
        ad_image_17_tag_length_too_long_local_var,
        ad_image_17_tag_required_local_var,
        ad_image_18_link_duplicated_local_var,
        ad_image_18_link_length_too_long_local_var,
        ad_image_18_link_required_local_var,
        ad_image_18_link_warning_local_var,
        ad_image_18_tag_duplicated_local_var,
        ad_image_18_tag_length_too_long_local_var,
        ad_image_18_tag_required_local_var,
        ad_image_19_link_duplicated_local_var,
        ad_image_19_link_length_too_long_local_var,
        ad_image_19_link_required_local_var,
        ad_image_19_link_warning_local_var,
        ad_image_19_tag_duplicated_local_var,
        ad_image_19_tag_length_too_long_local_var,
        ad_image_19_tag_required_local_var,
        ad_image_1_link_duplicated_local_var,
        ad_image_1_link_length_too_long_local_var,
        ad_image_1_link_required_local_var,
        ad_image_1_link_warning_local_var,
        ad_image_1_tag_duplicated_local_var,
        ad_image_1_tag_length_too_long_local_var,
        ad_image_1_tag_required_local_var,
        ad_image_2_link_duplicated_local_var,
        ad_image_2_link_length_too_long_local_var,
        ad_image_2_link_required_local_var,
        ad_image_2_link_warning_local_var,
        ad_image_2_tag_duplicated_local_var,
        ad_image_2_tag_length_too_long_local_var,
        ad_image_2_tag_required_local_var,
        ad_image_3_link_duplicated_local_var,
        ad_image_3_link_length_too_long_local_var,
        ad_image_3_link_required_local_var,
        ad_image_3_link_warning_local_var,
        ad_image_3_tag_duplicated_local_var,
        ad_image_3_tag_length_too_long_local_var,
        ad_image_3_tag_required_local_var,
        ad_image_4_link_duplicated_local_var,
        ad_image_4_link_length_too_long_local_var,
        ad_image_4_link_required_local_var,
        ad_image_4_link_warning_local_var,
        ad_image_4_tag_duplicated_local_var,
        ad_image_4_tag_length_too_long_local_var,
        ad_image_4_tag_required_local_var,
        ad_image_5_link_duplicated_local_var,
        ad_image_5_link_length_too_long_local_var,
        ad_image_5_link_required_local_var,
        ad_image_5_link_warning_local_var,
        ad_image_5_tag_duplicated_local_var,
        ad_image_5_tag_length_too_long_local_var,
        ad_image_5_tag_required_local_var,
        ad_image_6_link_duplicated_local_var,
        ad_image_6_link_length_too_long_local_var,
        ad_image_6_link_required_local_var,
        ad_image_6_link_warning_local_var,
        ad_image_6_tag_duplicated_local_var,
        ad_image_6_tag_length_too_long_local_var,
        ad_image_6_tag_required_local_var,
        ad_image_7_link_duplicated_local_var,
        ad_image_7_link_length_too_long_local_var,
        ad_image_7_link_required_local_var,
        ad_image_7_link_warning_local_var,
        ad_image_7_tag_duplicated_local_var,
        ad_image_7_tag_length_too_long_local_var,
        ad_image_7_tag_required_local_var,
        ad_image_8_link_duplicated_local_var,
        ad_image_8_link_length_too_long_local_var,
        ad_image_8_link_required_local_var,
        ad_image_8_link_warning_local_var,
        ad_image_8_tag_duplicated_local_var,
        ad_image_8_tag_length_too_long_local_var,
        ad_image_8_tag_required_local_var,
        ad_image_9_link_duplicated_local_var,
        ad_image_9_link_length_too_long_local_var,
        ad_image_9_link_required_local_var,
        ad_image_9_link_warning_local_var,
        ad_image_9_tag_duplicated_local_var,
        ad_image_9_tag_length_too_long_local_var,
        ad_image_9_tag_required_local_var,
        ad_link_format_warning_local_var,
        ad_link_same_as_link_local_var,
        ad_video_0_link_duplicated_local_var,
        ad_video_0_link_length_too_long_local_var,
        ad_video_0_link_required_local_var,
        ad_video_0_link_warning_local_var,
        ad_video_0_tag_duplicated_local_var,
        ad_video_0_tag_length_too_long_local_var,
        ad_video_0_tag_required_local_var,
        ad_video_1_link_duplicated_local_var,
        ad_video_1_link_length_too_long_local_var,
        ad_video_1_link_required_local_var,
        ad_video_1_link_warning_local_var,
        ad_video_1_tag_duplicated_local_var,
        ad_video_1_tag_length_too_long_local_var,
        ad_video_1_tag_required_local_var,
        ad_video_2_link_duplicated_local_var,
        ad_video_2_link_length_too_long_local_var,
        ad_video_2_link_required_local_var,
        ad_video_2_link_warning_local_var,
        ad_video_2_tag_duplicated_local_var,
        ad_video_2_tag_length_too_long_local_var,
        ad_video_2_tag_required_local_var,
        additional_image_link_length_too_long_local_var,
        additional_image_link_warning_local_var,
        adwords_format_warning_local_var,
        adwords_same_as_link_local_var,
        age_group_invalid_local_var,
        android_deep_link_invalid_local_var,
        availability_date_invalid_local_var,
        country_does_not_map_to_currency_local_var,
        custom_label_length_too_long_local_var,
        description_length_too_long_local_var,
        duplicate_headers_local_var,
        expiration_date_invalid_local_var,
        fetch_same_signature_local_var,
        gender_invalid_local_var,
        gtin_invalid_local_var,
        image_link_warning_local_var,
        inconsistent_currency_values_local_var,
        indexed_product_count_large_delta_local_var,
        ios_deep_link_invalid_local_var,
        is_bundle_invalid_local_var,
        item_additional_image_download_failure_local_var,
        link_format_warning_local_var,
        min_ad_price_invalid_local_var,
        mpn_invalid_local_var,
        multipack_invalid_local_var,
        optional_condition_invalid_local_var,
        optional_condition_missing_local_var,
        optional_product_category_invalid_local_var,
        optional_product_category_missing_local_var,
        product_category_depth_warning_local_var,
        product_type_length_too_long_local_var,
        sale_date_invalid_local_var,
        sales_price_invalid_local_var,
        sales_price_too_high_local_var,
        sales_price_too_low_local_var,
        shipping_height_invalid_local_var,
        shipping_invalid_local_var,
        shipping_weight_invalid_local_var,
        shipping_width_invalid_local_var,
        size_system_invalid_local_var,
        size_type_invalid_local_var,
        tax_invalid_local_var,
        title_length_too_long_local_var,
        too_many_additional_image_links_local_var,
        updated_time_invalid_local_var,
        utm_source_auto_corrected_local_var,
        video_required_when_ad_video_provided_local_var,
        weight_unit_invalid_local_var
        );

    if (!catalogs_feed_validation_warnings_local_var) {
        goto end;
    }

    return catalogs_feed_validation_warnings_local_var;
end:
    if (ad_image_0_link_duplicated_local_var) {
        free(ad_image_0_link_duplicated_local_var);
        ad_image_0_link_duplicated_local_var = NULL;
    }
    if (ad_image_0_link_length_too_long_local_var) {
        free(ad_image_0_link_length_too_long_local_var);
        ad_image_0_link_length_too_long_local_var = NULL;
    }
    if (ad_image_0_link_required_local_var) {
        free(ad_image_0_link_required_local_var);
        ad_image_0_link_required_local_var = NULL;
    }
    if (ad_image_0_link_warning_local_var) {
        free(ad_image_0_link_warning_local_var);
        ad_image_0_link_warning_local_var = NULL;
    }
    if (ad_image_0_tag_duplicated_local_var) {
        free(ad_image_0_tag_duplicated_local_var);
        ad_image_0_tag_duplicated_local_var = NULL;
    }
    if (ad_image_0_tag_length_too_long_local_var) {
        free(ad_image_0_tag_length_too_long_local_var);
        ad_image_0_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_0_tag_required_local_var) {
        free(ad_image_0_tag_required_local_var);
        ad_image_0_tag_required_local_var = NULL;
    }
    if (ad_image_10_link_duplicated_local_var) {
        free(ad_image_10_link_duplicated_local_var);
        ad_image_10_link_duplicated_local_var = NULL;
    }
    if (ad_image_10_link_length_too_long_local_var) {
        free(ad_image_10_link_length_too_long_local_var);
        ad_image_10_link_length_too_long_local_var = NULL;
    }
    if (ad_image_10_link_required_local_var) {
        free(ad_image_10_link_required_local_var);
        ad_image_10_link_required_local_var = NULL;
    }
    if (ad_image_10_link_warning_local_var) {
        free(ad_image_10_link_warning_local_var);
        ad_image_10_link_warning_local_var = NULL;
    }
    if (ad_image_10_tag_duplicated_local_var) {
        free(ad_image_10_tag_duplicated_local_var);
        ad_image_10_tag_duplicated_local_var = NULL;
    }
    if (ad_image_10_tag_length_too_long_local_var) {
        free(ad_image_10_tag_length_too_long_local_var);
        ad_image_10_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_10_tag_required_local_var) {
        free(ad_image_10_tag_required_local_var);
        ad_image_10_tag_required_local_var = NULL;
    }
    if (ad_image_11_link_duplicated_local_var) {
        free(ad_image_11_link_duplicated_local_var);
        ad_image_11_link_duplicated_local_var = NULL;
    }
    if (ad_image_11_link_length_too_long_local_var) {
        free(ad_image_11_link_length_too_long_local_var);
        ad_image_11_link_length_too_long_local_var = NULL;
    }
    if (ad_image_11_link_required_local_var) {
        free(ad_image_11_link_required_local_var);
        ad_image_11_link_required_local_var = NULL;
    }
    if (ad_image_11_link_warning_local_var) {
        free(ad_image_11_link_warning_local_var);
        ad_image_11_link_warning_local_var = NULL;
    }
    if (ad_image_11_tag_duplicated_local_var) {
        free(ad_image_11_tag_duplicated_local_var);
        ad_image_11_tag_duplicated_local_var = NULL;
    }
    if (ad_image_11_tag_length_too_long_local_var) {
        free(ad_image_11_tag_length_too_long_local_var);
        ad_image_11_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_11_tag_required_local_var) {
        free(ad_image_11_tag_required_local_var);
        ad_image_11_tag_required_local_var = NULL;
    }
    if (ad_image_12_link_duplicated_local_var) {
        free(ad_image_12_link_duplicated_local_var);
        ad_image_12_link_duplicated_local_var = NULL;
    }
    if (ad_image_12_link_length_too_long_local_var) {
        free(ad_image_12_link_length_too_long_local_var);
        ad_image_12_link_length_too_long_local_var = NULL;
    }
    if (ad_image_12_link_required_local_var) {
        free(ad_image_12_link_required_local_var);
        ad_image_12_link_required_local_var = NULL;
    }
    if (ad_image_12_link_warning_local_var) {
        free(ad_image_12_link_warning_local_var);
        ad_image_12_link_warning_local_var = NULL;
    }
    if (ad_image_12_tag_duplicated_local_var) {
        free(ad_image_12_tag_duplicated_local_var);
        ad_image_12_tag_duplicated_local_var = NULL;
    }
    if (ad_image_12_tag_length_too_long_local_var) {
        free(ad_image_12_tag_length_too_long_local_var);
        ad_image_12_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_12_tag_required_local_var) {
        free(ad_image_12_tag_required_local_var);
        ad_image_12_tag_required_local_var = NULL;
    }
    if (ad_image_13_link_duplicated_local_var) {
        free(ad_image_13_link_duplicated_local_var);
        ad_image_13_link_duplicated_local_var = NULL;
    }
    if (ad_image_13_link_length_too_long_local_var) {
        free(ad_image_13_link_length_too_long_local_var);
        ad_image_13_link_length_too_long_local_var = NULL;
    }
    if (ad_image_13_link_required_local_var) {
        free(ad_image_13_link_required_local_var);
        ad_image_13_link_required_local_var = NULL;
    }
    if (ad_image_13_link_warning_local_var) {
        free(ad_image_13_link_warning_local_var);
        ad_image_13_link_warning_local_var = NULL;
    }
    if (ad_image_13_tag_duplicated_local_var) {
        free(ad_image_13_tag_duplicated_local_var);
        ad_image_13_tag_duplicated_local_var = NULL;
    }
    if (ad_image_13_tag_length_too_long_local_var) {
        free(ad_image_13_tag_length_too_long_local_var);
        ad_image_13_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_13_tag_required_local_var) {
        free(ad_image_13_tag_required_local_var);
        ad_image_13_tag_required_local_var = NULL;
    }
    if (ad_image_14_link_duplicated_local_var) {
        free(ad_image_14_link_duplicated_local_var);
        ad_image_14_link_duplicated_local_var = NULL;
    }
    if (ad_image_14_link_length_too_long_local_var) {
        free(ad_image_14_link_length_too_long_local_var);
        ad_image_14_link_length_too_long_local_var = NULL;
    }
    if (ad_image_14_link_required_local_var) {
        free(ad_image_14_link_required_local_var);
        ad_image_14_link_required_local_var = NULL;
    }
    if (ad_image_14_link_warning_local_var) {
        free(ad_image_14_link_warning_local_var);
        ad_image_14_link_warning_local_var = NULL;
    }
    if (ad_image_14_tag_duplicated_local_var) {
        free(ad_image_14_tag_duplicated_local_var);
        ad_image_14_tag_duplicated_local_var = NULL;
    }
    if (ad_image_14_tag_length_too_long_local_var) {
        free(ad_image_14_tag_length_too_long_local_var);
        ad_image_14_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_14_tag_required_local_var) {
        free(ad_image_14_tag_required_local_var);
        ad_image_14_tag_required_local_var = NULL;
    }
    if (ad_image_15_link_duplicated_local_var) {
        free(ad_image_15_link_duplicated_local_var);
        ad_image_15_link_duplicated_local_var = NULL;
    }
    if (ad_image_15_link_length_too_long_local_var) {
        free(ad_image_15_link_length_too_long_local_var);
        ad_image_15_link_length_too_long_local_var = NULL;
    }
    if (ad_image_15_link_required_local_var) {
        free(ad_image_15_link_required_local_var);
        ad_image_15_link_required_local_var = NULL;
    }
    if (ad_image_15_link_warning_local_var) {
        free(ad_image_15_link_warning_local_var);
        ad_image_15_link_warning_local_var = NULL;
    }
    if (ad_image_15_tag_duplicated_local_var) {
        free(ad_image_15_tag_duplicated_local_var);
        ad_image_15_tag_duplicated_local_var = NULL;
    }
    if (ad_image_15_tag_length_too_long_local_var) {
        free(ad_image_15_tag_length_too_long_local_var);
        ad_image_15_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_15_tag_required_local_var) {
        free(ad_image_15_tag_required_local_var);
        ad_image_15_tag_required_local_var = NULL;
    }
    if (ad_image_16_link_duplicated_local_var) {
        free(ad_image_16_link_duplicated_local_var);
        ad_image_16_link_duplicated_local_var = NULL;
    }
    if (ad_image_16_link_length_too_long_local_var) {
        free(ad_image_16_link_length_too_long_local_var);
        ad_image_16_link_length_too_long_local_var = NULL;
    }
    if (ad_image_16_link_required_local_var) {
        free(ad_image_16_link_required_local_var);
        ad_image_16_link_required_local_var = NULL;
    }
    if (ad_image_16_link_warning_local_var) {
        free(ad_image_16_link_warning_local_var);
        ad_image_16_link_warning_local_var = NULL;
    }
    if (ad_image_16_tag_duplicated_local_var) {
        free(ad_image_16_tag_duplicated_local_var);
        ad_image_16_tag_duplicated_local_var = NULL;
    }
    if (ad_image_16_tag_length_too_long_local_var) {
        free(ad_image_16_tag_length_too_long_local_var);
        ad_image_16_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_16_tag_required_local_var) {
        free(ad_image_16_tag_required_local_var);
        ad_image_16_tag_required_local_var = NULL;
    }
    if (ad_image_17_link_duplicated_local_var) {
        free(ad_image_17_link_duplicated_local_var);
        ad_image_17_link_duplicated_local_var = NULL;
    }
    if (ad_image_17_link_length_too_long_local_var) {
        free(ad_image_17_link_length_too_long_local_var);
        ad_image_17_link_length_too_long_local_var = NULL;
    }
    if (ad_image_17_link_required_local_var) {
        free(ad_image_17_link_required_local_var);
        ad_image_17_link_required_local_var = NULL;
    }
    if (ad_image_17_link_warning_local_var) {
        free(ad_image_17_link_warning_local_var);
        ad_image_17_link_warning_local_var = NULL;
    }
    if (ad_image_17_tag_duplicated_local_var) {
        free(ad_image_17_tag_duplicated_local_var);
        ad_image_17_tag_duplicated_local_var = NULL;
    }
    if (ad_image_17_tag_length_too_long_local_var) {
        free(ad_image_17_tag_length_too_long_local_var);
        ad_image_17_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_17_tag_required_local_var) {
        free(ad_image_17_tag_required_local_var);
        ad_image_17_tag_required_local_var = NULL;
    }
    if (ad_image_18_link_duplicated_local_var) {
        free(ad_image_18_link_duplicated_local_var);
        ad_image_18_link_duplicated_local_var = NULL;
    }
    if (ad_image_18_link_length_too_long_local_var) {
        free(ad_image_18_link_length_too_long_local_var);
        ad_image_18_link_length_too_long_local_var = NULL;
    }
    if (ad_image_18_link_required_local_var) {
        free(ad_image_18_link_required_local_var);
        ad_image_18_link_required_local_var = NULL;
    }
    if (ad_image_18_link_warning_local_var) {
        free(ad_image_18_link_warning_local_var);
        ad_image_18_link_warning_local_var = NULL;
    }
    if (ad_image_18_tag_duplicated_local_var) {
        free(ad_image_18_tag_duplicated_local_var);
        ad_image_18_tag_duplicated_local_var = NULL;
    }
    if (ad_image_18_tag_length_too_long_local_var) {
        free(ad_image_18_tag_length_too_long_local_var);
        ad_image_18_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_18_tag_required_local_var) {
        free(ad_image_18_tag_required_local_var);
        ad_image_18_tag_required_local_var = NULL;
    }
    if (ad_image_19_link_duplicated_local_var) {
        free(ad_image_19_link_duplicated_local_var);
        ad_image_19_link_duplicated_local_var = NULL;
    }
    if (ad_image_19_link_length_too_long_local_var) {
        free(ad_image_19_link_length_too_long_local_var);
        ad_image_19_link_length_too_long_local_var = NULL;
    }
    if (ad_image_19_link_required_local_var) {
        free(ad_image_19_link_required_local_var);
        ad_image_19_link_required_local_var = NULL;
    }
    if (ad_image_19_link_warning_local_var) {
        free(ad_image_19_link_warning_local_var);
        ad_image_19_link_warning_local_var = NULL;
    }
    if (ad_image_19_tag_duplicated_local_var) {
        free(ad_image_19_tag_duplicated_local_var);
        ad_image_19_tag_duplicated_local_var = NULL;
    }
    if (ad_image_19_tag_length_too_long_local_var) {
        free(ad_image_19_tag_length_too_long_local_var);
        ad_image_19_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_19_tag_required_local_var) {
        free(ad_image_19_tag_required_local_var);
        ad_image_19_tag_required_local_var = NULL;
    }
    if (ad_image_1_link_duplicated_local_var) {
        free(ad_image_1_link_duplicated_local_var);
        ad_image_1_link_duplicated_local_var = NULL;
    }
    if (ad_image_1_link_length_too_long_local_var) {
        free(ad_image_1_link_length_too_long_local_var);
        ad_image_1_link_length_too_long_local_var = NULL;
    }
    if (ad_image_1_link_required_local_var) {
        free(ad_image_1_link_required_local_var);
        ad_image_1_link_required_local_var = NULL;
    }
    if (ad_image_1_link_warning_local_var) {
        free(ad_image_1_link_warning_local_var);
        ad_image_1_link_warning_local_var = NULL;
    }
    if (ad_image_1_tag_duplicated_local_var) {
        free(ad_image_1_tag_duplicated_local_var);
        ad_image_1_tag_duplicated_local_var = NULL;
    }
    if (ad_image_1_tag_length_too_long_local_var) {
        free(ad_image_1_tag_length_too_long_local_var);
        ad_image_1_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_1_tag_required_local_var) {
        free(ad_image_1_tag_required_local_var);
        ad_image_1_tag_required_local_var = NULL;
    }
    if (ad_image_2_link_duplicated_local_var) {
        free(ad_image_2_link_duplicated_local_var);
        ad_image_2_link_duplicated_local_var = NULL;
    }
    if (ad_image_2_link_length_too_long_local_var) {
        free(ad_image_2_link_length_too_long_local_var);
        ad_image_2_link_length_too_long_local_var = NULL;
    }
    if (ad_image_2_link_required_local_var) {
        free(ad_image_2_link_required_local_var);
        ad_image_2_link_required_local_var = NULL;
    }
    if (ad_image_2_link_warning_local_var) {
        free(ad_image_2_link_warning_local_var);
        ad_image_2_link_warning_local_var = NULL;
    }
    if (ad_image_2_tag_duplicated_local_var) {
        free(ad_image_2_tag_duplicated_local_var);
        ad_image_2_tag_duplicated_local_var = NULL;
    }
    if (ad_image_2_tag_length_too_long_local_var) {
        free(ad_image_2_tag_length_too_long_local_var);
        ad_image_2_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_2_tag_required_local_var) {
        free(ad_image_2_tag_required_local_var);
        ad_image_2_tag_required_local_var = NULL;
    }
    if (ad_image_3_link_duplicated_local_var) {
        free(ad_image_3_link_duplicated_local_var);
        ad_image_3_link_duplicated_local_var = NULL;
    }
    if (ad_image_3_link_length_too_long_local_var) {
        free(ad_image_3_link_length_too_long_local_var);
        ad_image_3_link_length_too_long_local_var = NULL;
    }
    if (ad_image_3_link_required_local_var) {
        free(ad_image_3_link_required_local_var);
        ad_image_3_link_required_local_var = NULL;
    }
    if (ad_image_3_link_warning_local_var) {
        free(ad_image_3_link_warning_local_var);
        ad_image_3_link_warning_local_var = NULL;
    }
    if (ad_image_3_tag_duplicated_local_var) {
        free(ad_image_3_tag_duplicated_local_var);
        ad_image_3_tag_duplicated_local_var = NULL;
    }
    if (ad_image_3_tag_length_too_long_local_var) {
        free(ad_image_3_tag_length_too_long_local_var);
        ad_image_3_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_3_tag_required_local_var) {
        free(ad_image_3_tag_required_local_var);
        ad_image_3_tag_required_local_var = NULL;
    }
    if (ad_image_4_link_duplicated_local_var) {
        free(ad_image_4_link_duplicated_local_var);
        ad_image_4_link_duplicated_local_var = NULL;
    }
    if (ad_image_4_link_length_too_long_local_var) {
        free(ad_image_4_link_length_too_long_local_var);
        ad_image_4_link_length_too_long_local_var = NULL;
    }
    if (ad_image_4_link_required_local_var) {
        free(ad_image_4_link_required_local_var);
        ad_image_4_link_required_local_var = NULL;
    }
    if (ad_image_4_link_warning_local_var) {
        free(ad_image_4_link_warning_local_var);
        ad_image_4_link_warning_local_var = NULL;
    }
    if (ad_image_4_tag_duplicated_local_var) {
        free(ad_image_4_tag_duplicated_local_var);
        ad_image_4_tag_duplicated_local_var = NULL;
    }
    if (ad_image_4_tag_length_too_long_local_var) {
        free(ad_image_4_tag_length_too_long_local_var);
        ad_image_4_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_4_tag_required_local_var) {
        free(ad_image_4_tag_required_local_var);
        ad_image_4_tag_required_local_var = NULL;
    }
    if (ad_image_5_link_duplicated_local_var) {
        free(ad_image_5_link_duplicated_local_var);
        ad_image_5_link_duplicated_local_var = NULL;
    }
    if (ad_image_5_link_length_too_long_local_var) {
        free(ad_image_5_link_length_too_long_local_var);
        ad_image_5_link_length_too_long_local_var = NULL;
    }
    if (ad_image_5_link_required_local_var) {
        free(ad_image_5_link_required_local_var);
        ad_image_5_link_required_local_var = NULL;
    }
    if (ad_image_5_link_warning_local_var) {
        free(ad_image_5_link_warning_local_var);
        ad_image_5_link_warning_local_var = NULL;
    }
    if (ad_image_5_tag_duplicated_local_var) {
        free(ad_image_5_tag_duplicated_local_var);
        ad_image_5_tag_duplicated_local_var = NULL;
    }
    if (ad_image_5_tag_length_too_long_local_var) {
        free(ad_image_5_tag_length_too_long_local_var);
        ad_image_5_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_5_tag_required_local_var) {
        free(ad_image_5_tag_required_local_var);
        ad_image_5_tag_required_local_var = NULL;
    }
    if (ad_image_6_link_duplicated_local_var) {
        free(ad_image_6_link_duplicated_local_var);
        ad_image_6_link_duplicated_local_var = NULL;
    }
    if (ad_image_6_link_length_too_long_local_var) {
        free(ad_image_6_link_length_too_long_local_var);
        ad_image_6_link_length_too_long_local_var = NULL;
    }
    if (ad_image_6_link_required_local_var) {
        free(ad_image_6_link_required_local_var);
        ad_image_6_link_required_local_var = NULL;
    }
    if (ad_image_6_link_warning_local_var) {
        free(ad_image_6_link_warning_local_var);
        ad_image_6_link_warning_local_var = NULL;
    }
    if (ad_image_6_tag_duplicated_local_var) {
        free(ad_image_6_tag_duplicated_local_var);
        ad_image_6_tag_duplicated_local_var = NULL;
    }
    if (ad_image_6_tag_length_too_long_local_var) {
        free(ad_image_6_tag_length_too_long_local_var);
        ad_image_6_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_6_tag_required_local_var) {
        free(ad_image_6_tag_required_local_var);
        ad_image_6_tag_required_local_var = NULL;
    }
    if (ad_image_7_link_duplicated_local_var) {
        free(ad_image_7_link_duplicated_local_var);
        ad_image_7_link_duplicated_local_var = NULL;
    }
    if (ad_image_7_link_length_too_long_local_var) {
        free(ad_image_7_link_length_too_long_local_var);
        ad_image_7_link_length_too_long_local_var = NULL;
    }
    if (ad_image_7_link_required_local_var) {
        free(ad_image_7_link_required_local_var);
        ad_image_7_link_required_local_var = NULL;
    }
    if (ad_image_7_link_warning_local_var) {
        free(ad_image_7_link_warning_local_var);
        ad_image_7_link_warning_local_var = NULL;
    }
    if (ad_image_7_tag_duplicated_local_var) {
        free(ad_image_7_tag_duplicated_local_var);
        ad_image_7_tag_duplicated_local_var = NULL;
    }
    if (ad_image_7_tag_length_too_long_local_var) {
        free(ad_image_7_tag_length_too_long_local_var);
        ad_image_7_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_7_tag_required_local_var) {
        free(ad_image_7_tag_required_local_var);
        ad_image_7_tag_required_local_var = NULL;
    }
    if (ad_image_8_link_duplicated_local_var) {
        free(ad_image_8_link_duplicated_local_var);
        ad_image_8_link_duplicated_local_var = NULL;
    }
    if (ad_image_8_link_length_too_long_local_var) {
        free(ad_image_8_link_length_too_long_local_var);
        ad_image_8_link_length_too_long_local_var = NULL;
    }
    if (ad_image_8_link_required_local_var) {
        free(ad_image_8_link_required_local_var);
        ad_image_8_link_required_local_var = NULL;
    }
    if (ad_image_8_link_warning_local_var) {
        free(ad_image_8_link_warning_local_var);
        ad_image_8_link_warning_local_var = NULL;
    }
    if (ad_image_8_tag_duplicated_local_var) {
        free(ad_image_8_tag_duplicated_local_var);
        ad_image_8_tag_duplicated_local_var = NULL;
    }
    if (ad_image_8_tag_length_too_long_local_var) {
        free(ad_image_8_tag_length_too_long_local_var);
        ad_image_8_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_8_tag_required_local_var) {
        free(ad_image_8_tag_required_local_var);
        ad_image_8_tag_required_local_var = NULL;
    }
    if (ad_image_9_link_duplicated_local_var) {
        free(ad_image_9_link_duplicated_local_var);
        ad_image_9_link_duplicated_local_var = NULL;
    }
    if (ad_image_9_link_length_too_long_local_var) {
        free(ad_image_9_link_length_too_long_local_var);
        ad_image_9_link_length_too_long_local_var = NULL;
    }
    if (ad_image_9_link_required_local_var) {
        free(ad_image_9_link_required_local_var);
        ad_image_9_link_required_local_var = NULL;
    }
    if (ad_image_9_link_warning_local_var) {
        free(ad_image_9_link_warning_local_var);
        ad_image_9_link_warning_local_var = NULL;
    }
    if (ad_image_9_tag_duplicated_local_var) {
        free(ad_image_9_tag_duplicated_local_var);
        ad_image_9_tag_duplicated_local_var = NULL;
    }
    if (ad_image_9_tag_length_too_long_local_var) {
        free(ad_image_9_tag_length_too_long_local_var);
        ad_image_9_tag_length_too_long_local_var = NULL;
    }
    if (ad_image_9_tag_required_local_var) {
        free(ad_image_9_tag_required_local_var);
        ad_image_9_tag_required_local_var = NULL;
    }
    if (ad_link_format_warning_local_var) {
        free(ad_link_format_warning_local_var);
        ad_link_format_warning_local_var = NULL;
    }
    if (ad_link_same_as_link_local_var) {
        free(ad_link_same_as_link_local_var);
        ad_link_same_as_link_local_var = NULL;
    }
    if (ad_video_0_link_duplicated_local_var) {
        free(ad_video_0_link_duplicated_local_var);
        ad_video_0_link_duplicated_local_var = NULL;
    }
    if (ad_video_0_link_length_too_long_local_var) {
        free(ad_video_0_link_length_too_long_local_var);
        ad_video_0_link_length_too_long_local_var = NULL;
    }
    if (ad_video_0_link_required_local_var) {
        free(ad_video_0_link_required_local_var);
        ad_video_0_link_required_local_var = NULL;
    }
    if (ad_video_0_link_warning_local_var) {
        free(ad_video_0_link_warning_local_var);
        ad_video_0_link_warning_local_var = NULL;
    }
    if (ad_video_0_tag_duplicated_local_var) {
        free(ad_video_0_tag_duplicated_local_var);
        ad_video_0_tag_duplicated_local_var = NULL;
    }
    if (ad_video_0_tag_length_too_long_local_var) {
        free(ad_video_0_tag_length_too_long_local_var);
        ad_video_0_tag_length_too_long_local_var = NULL;
    }
    if (ad_video_0_tag_required_local_var) {
        free(ad_video_0_tag_required_local_var);
        ad_video_0_tag_required_local_var = NULL;
    }
    if (ad_video_1_link_duplicated_local_var) {
        free(ad_video_1_link_duplicated_local_var);
        ad_video_1_link_duplicated_local_var = NULL;
    }
    if (ad_video_1_link_length_too_long_local_var) {
        free(ad_video_1_link_length_too_long_local_var);
        ad_video_1_link_length_too_long_local_var = NULL;
    }
    if (ad_video_1_link_required_local_var) {
        free(ad_video_1_link_required_local_var);
        ad_video_1_link_required_local_var = NULL;
    }
    if (ad_video_1_link_warning_local_var) {
        free(ad_video_1_link_warning_local_var);
        ad_video_1_link_warning_local_var = NULL;
    }
    if (ad_video_1_tag_duplicated_local_var) {
        free(ad_video_1_tag_duplicated_local_var);
        ad_video_1_tag_duplicated_local_var = NULL;
    }
    if (ad_video_1_tag_length_too_long_local_var) {
        free(ad_video_1_tag_length_too_long_local_var);
        ad_video_1_tag_length_too_long_local_var = NULL;
    }
    if (ad_video_1_tag_required_local_var) {
        free(ad_video_1_tag_required_local_var);
        ad_video_1_tag_required_local_var = NULL;
    }
    if (ad_video_2_link_duplicated_local_var) {
        free(ad_video_2_link_duplicated_local_var);
        ad_video_2_link_duplicated_local_var = NULL;
    }
    if (ad_video_2_link_length_too_long_local_var) {
        free(ad_video_2_link_length_too_long_local_var);
        ad_video_2_link_length_too_long_local_var = NULL;
    }
    if (ad_video_2_link_required_local_var) {
        free(ad_video_2_link_required_local_var);
        ad_video_2_link_required_local_var = NULL;
    }
    if (ad_video_2_link_warning_local_var) {
        free(ad_video_2_link_warning_local_var);
        ad_video_2_link_warning_local_var = NULL;
    }
    if (ad_video_2_tag_duplicated_local_var) {
        free(ad_video_2_tag_duplicated_local_var);
        ad_video_2_tag_duplicated_local_var = NULL;
    }
    if (ad_video_2_tag_length_too_long_local_var) {
        free(ad_video_2_tag_length_too_long_local_var);
        ad_video_2_tag_length_too_long_local_var = NULL;
    }
    if (ad_video_2_tag_required_local_var) {
        free(ad_video_2_tag_required_local_var);
        ad_video_2_tag_required_local_var = NULL;
    }
    if (additional_image_link_length_too_long_local_var) {
        free(additional_image_link_length_too_long_local_var);
        additional_image_link_length_too_long_local_var = NULL;
    }
    if (additional_image_link_warning_local_var) {
        free(additional_image_link_warning_local_var);
        additional_image_link_warning_local_var = NULL;
    }
    if (adwords_format_warning_local_var) {
        free(adwords_format_warning_local_var);
        adwords_format_warning_local_var = NULL;
    }
    if (adwords_same_as_link_local_var) {
        free(adwords_same_as_link_local_var);
        adwords_same_as_link_local_var = NULL;
    }
    if (age_group_invalid_local_var) {
        free(age_group_invalid_local_var);
        age_group_invalid_local_var = NULL;
    }
    if (android_deep_link_invalid_local_var) {
        free(android_deep_link_invalid_local_var);
        android_deep_link_invalid_local_var = NULL;
    }
    if (availability_date_invalid_local_var) {
        free(availability_date_invalid_local_var);
        availability_date_invalid_local_var = NULL;
    }
    if (country_does_not_map_to_currency_local_var) {
        free(country_does_not_map_to_currency_local_var);
        country_does_not_map_to_currency_local_var = NULL;
    }
    if (custom_label_length_too_long_local_var) {
        free(custom_label_length_too_long_local_var);
        custom_label_length_too_long_local_var = NULL;
    }
    if (description_length_too_long_local_var) {
        free(description_length_too_long_local_var);
        description_length_too_long_local_var = NULL;
    }
    if (duplicate_headers_local_var) {
        free(duplicate_headers_local_var);
        duplicate_headers_local_var = NULL;
    }
    if (expiration_date_invalid_local_var) {
        free(expiration_date_invalid_local_var);
        expiration_date_invalid_local_var = NULL;
    }
    if (fetch_same_signature_local_var) {
        free(fetch_same_signature_local_var);
        fetch_same_signature_local_var = NULL;
    }
    if (gender_invalid_local_var) {
        free(gender_invalid_local_var);
        gender_invalid_local_var = NULL;
    }
    if (gtin_invalid_local_var) {
        free(gtin_invalid_local_var);
        gtin_invalid_local_var = NULL;
    }
    if (image_link_warning_local_var) {
        free(image_link_warning_local_var);
        image_link_warning_local_var = NULL;
    }
    if (inconsistent_currency_values_local_var) {
        free(inconsistent_currency_values_local_var);
        inconsistent_currency_values_local_var = NULL;
    }
    if (indexed_product_count_large_delta_local_var) {
        free(indexed_product_count_large_delta_local_var);
        indexed_product_count_large_delta_local_var = NULL;
    }
    if (ios_deep_link_invalid_local_var) {
        free(ios_deep_link_invalid_local_var);
        ios_deep_link_invalid_local_var = NULL;
    }
    if (is_bundle_invalid_local_var) {
        free(is_bundle_invalid_local_var);
        is_bundle_invalid_local_var = NULL;
    }
    if (item_additional_image_download_failure_local_var) {
        free(item_additional_image_download_failure_local_var);
        item_additional_image_download_failure_local_var = NULL;
    }
    if (link_format_warning_local_var) {
        free(link_format_warning_local_var);
        link_format_warning_local_var = NULL;
    }
    if (min_ad_price_invalid_local_var) {
        free(min_ad_price_invalid_local_var);
        min_ad_price_invalid_local_var = NULL;
    }
    if (mpn_invalid_local_var) {
        free(mpn_invalid_local_var);
        mpn_invalid_local_var = NULL;
    }
    if (multipack_invalid_local_var) {
        free(multipack_invalid_local_var);
        multipack_invalid_local_var = NULL;
    }
    if (optional_condition_invalid_local_var) {
        free(optional_condition_invalid_local_var);
        optional_condition_invalid_local_var = NULL;
    }
    if (optional_condition_missing_local_var) {
        free(optional_condition_missing_local_var);
        optional_condition_missing_local_var = NULL;
    }
    if (optional_product_category_invalid_local_var) {
        free(optional_product_category_invalid_local_var);
        optional_product_category_invalid_local_var = NULL;
    }
    if (optional_product_category_missing_local_var) {
        free(optional_product_category_missing_local_var);
        optional_product_category_missing_local_var = NULL;
    }
    if (product_category_depth_warning_local_var) {
        free(product_category_depth_warning_local_var);
        product_category_depth_warning_local_var = NULL;
    }
    if (product_type_length_too_long_local_var) {
        free(product_type_length_too_long_local_var);
        product_type_length_too_long_local_var = NULL;
    }
    if (sale_date_invalid_local_var) {
        free(sale_date_invalid_local_var);
        sale_date_invalid_local_var = NULL;
    }
    if (sales_price_invalid_local_var) {
        free(sales_price_invalid_local_var);
        sales_price_invalid_local_var = NULL;
    }
    if (sales_price_too_high_local_var) {
        free(sales_price_too_high_local_var);
        sales_price_too_high_local_var = NULL;
    }
    if (sales_price_too_low_local_var) {
        free(sales_price_too_low_local_var);
        sales_price_too_low_local_var = NULL;
    }
    if (shipping_height_invalid_local_var) {
        free(shipping_height_invalid_local_var);
        shipping_height_invalid_local_var = NULL;
    }
    if (shipping_invalid_local_var) {
        free(shipping_invalid_local_var);
        shipping_invalid_local_var = NULL;
    }
    if (shipping_weight_invalid_local_var) {
        free(shipping_weight_invalid_local_var);
        shipping_weight_invalid_local_var = NULL;
    }
    if (shipping_width_invalid_local_var) {
        free(shipping_width_invalid_local_var);
        shipping_width_invalid_local_var = NULL;
    }
    if (size_system_invalid_local_var) {
        free(size_system_invalid_local_var);
        size_system_invalid_local_var = NULL;
    }
    if (size_type_invalid_local_var) {
        free(size_type_invalid_local_var);
        size_type_invalid_local_var = NULL;
    }
    if (tax_invalid_local_var) {
        free(tax_invalid_local_var);
        tax_invalid_local_var = NULL;
    }
    if (title_length_too_long_local_var) {
        free(title_length_too_long_local_var);
        title_length_too_long_local_var = NULL;
    }
    if (too_many_additional_image_links_local_var) {
        free(too_many_additional_image_links_local_var);
        too_many_additional_image_links_local_var = NULL;
    }
    if (updated_time_invalid_local_var) {
        free(updated_time_invalid_local_var);
        updated_time_invalid_local_var = NULL;
    }
    if (utm_source_auto_corrected_local_var) {
        free(utm_source_auto_corrected_local_var);
        utm_source_auto_corrected_local_var = NULL;
    }
    if (video_required_when_ad_video_provided_local_var) {
        free(video_required_when_ad_video_provided_local_var);
        video_required_when_ad_video_provided_local_var = NULL;
    }
    if (weight_unit_invalid_local_var) {
        free(weight_unit_invalid_local_var);
        weight_unit_invalid_local_var = NULL;
    }
    return NULL;

}
