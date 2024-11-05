/*
 * catalogs_creative_assets_product_group_filter_keys.h
 *
 * 
 */

#ifndef _catalogs_creative_assets_product_group_filter_keys_H_
#define _catalogs_creative_assets_product_group_filter_keys_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_product_group_filter_keys_t catalogs_creative_assets_product_group_filter_keys_t;

#include "catalogs_product_group_multiple_media_types_criteria.h"
#include "catalogs_product_group_multiple_string_criteria.h"
#include "catalogs_product_group_multiple_string_list_criteria.h"
#include "creative_assets_id_filter.h"
#include "custom_label0_filter.h"
#include "custom_label1_filter.h"
#include "custom_label2_filter.h"
#include "custom_label3_filter.h"
#include "custom_label4_filter.h"
#include "google_product_category0_filter.h"
#include "google_product_category1_filter.h"
#include "google_product_category2_filter.h"
#include "google_product_category3_filter.h"
#include "google_product_category4_filter.h"
#include "google_product_category5_filter.h"
#include "google_product_category6_filter.h"
#include "media_type_filter.h"



typedef struct catalogs_creative_assets_product_group_filter_keys_t {
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id; //object
    catalogs_product_group_multiple_string_criteria_t *custom_label_0; //object
    catalogs_product_group_multiple_string_criteria_t *custom_label_1; //object
    catalogs_product_group_multiple_string_criteria_t *custom_label_2; //object
    catalogs_product_group_multiple_string_criteria_t *custom_label_3; //object
    catalogs_product_group_multiple_string_criteria_t *custom_label_4; //object
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6; //object
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5; //object
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4; //object
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3; //object
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2; //object
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1; //object
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0; //object
    catalogs_product_group_multiple_media_types_criteria_t *media_type; //object

} catalogs_creative_assets_product_group_filter_keys_t;

catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_create(
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id,
    catalogs_product_group_multiple_string_criteria_t *custom_label_0,
    catalogs_product_group_multiple_string_criteria_t *custom_label_1,
    catalogs_product_group_multiple_string_criteria_t *custom_label_2,
    catalogs_product_group_multiple_string_criteria_t *custom_label_3,
    catalogs_product_group_multiple_string_criteria_t *custom_label_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0,
    catalogs_product_group_multiple_media_types_criteria_t *media_type
);

void catalogs_creative_assets_product_group_filter_keys_free(catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys);

catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_parseFromJSON(cJSON *catalogs_creative_assets_product_group_filter_keysJSON);

cJSON *catalogs_creative_assets_product_group_filter_keys_convertToJSON(catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys);

#endif /* _catalogs_creative_assets_product_group_filter_keys_H_ */

