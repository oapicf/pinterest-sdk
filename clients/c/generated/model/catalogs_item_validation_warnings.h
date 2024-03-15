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
    struct catalogs_item_validation_details_t *ad_link_format_warning; //model
    struct catalogs_item_validation_details_t *ad_link_same_as_link; //model
    struct catalogs_item_validation_details_t *additional_image_link_length_too_long; //model
    struct catalogs_item_validation_details_t *additional_image_link_warning; //model
    struct catalogs_item_validation_details_t *adwords_format_warning; //model
    struct catalogs_item_validation_details_t *adwords_same_as_link; //model
    struct catalogs_item_validation_details_t *age_group_invalid; //model
    struct catalogs_item_validation_details_t *size_system_invalid; //model
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
    struct catalogs_item_validation_details_t *sales_price_invalid; //model
    struct catalogs_item_validation_details_t *sales_price_too_low; //model
    struct catalogs_item_validation_details_t *sales_price_too_high; //model
    struct catalogs_item_validation_details_t *sale_date_invalid; //model
    struct catalogs_item_validation_details_t *shipping_invalid; //model
    struct catalogs_item_validation_details_t *shipping_height_invalid; //model
    struct catalogs_item_validation_details_t *shipping_weight_invalid; //model
    struct catalogs_item_validation_details_t *shipping_width_invalid; //model
    struct catalogs_item_validation_details_t *size_type_invalid; //model
    struct catalogs_item_validation_details_t *tax_invalid; //model
    struct catalogs_item_validation_details_t *title_length_too_long; //model
    struct catalogs_item_validation_details_t *too_many_additional_image_links; //model
    struct catalogs_item_validation_details_t *utm_source_auto_corrected; //model
    struct catalogs_item_validation_details_t *weight_unit_invalid; //model

} catalogs_item_validation_warnings_t;

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
);

void catalogs_item_validation_warnings_free(catalogs_item_validation_warnings_t *catalogs_item_validation_warnings);

catalogs_item_validation_warnings_t *catalogs_item_validation_warnings_parseFromJSON(cJSON *catalogs_item_validation_warningsJSON);

cJSON *catalogs_item_validation_warnings_convertToJSON(catalogs_item_validation_warnings_t *catalogs_item_validation_warnings);

#endif /* _catalogs_item_validation_warnings_H_ */

