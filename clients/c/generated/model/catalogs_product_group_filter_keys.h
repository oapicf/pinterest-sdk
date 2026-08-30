/*
 * catalogs_product_group_filter_keys.h
 *
 * 
 */

#ifndef _catalogs_product_group_filter_keys_H_
#define _catalogs_product_group_filter_keys_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_filter_keys_t catalogs_product_group_filter_keys_t;

#include "catalogs_base_filter_keys.h"
#include "catalogs_product_group_currency_criteria.h"
#include "catalogs_product_group_filter_operator_type_criteria.h"
#include "catalogs_product_group_multiple_gender_criteria.h"
#include "catalogs_product_group_multiple_media_types_criteria.h"
#include "catalogs_product_group_multiple_pinterest_product_category_criteria.h"
#include "catalogs_product_group_multiple_string_criteria.h"
#include "catalogs_product_group_multiple_string_list_criteria.h"
#include "catalogs_product_group_pricing_criteria.h"
#include "catalogs_product_group_uint32_criteria.h"
#include "product_group_reference_filter.h"



typedef struct catalogs_product_group_filter_keys_t {
    struct catalogs_product_group_pricing_criteria_t *min_price; //model
    struct catalogs_product_group_pricing_criteria_t *max_price; //model
    struct catalogs_product_group_currency_criteria_t *currency; //model
    struct catalogs_product_group_multiple_string_criteria_t *item_id; //model
    struct catalogs_product_group_multiple_string_criteria_t *availability; //model
    struct catalogs_product_group_multiple_string_criteria_t *brand; //model
    struct catalogs_product_group_multiple_string_criteria_t *condition; //model
    struct catalogs_product_group_filter_operator_type_criteria_t *custom_label_0; //model
    struct catalogs_product_group_filter_operator_type_criteria_t *custom_label_1; //model
    struct catalogs_product_group_filter_operator_type_criteria_t *custom_label_2; //model
    struct catalogs_product_group_filter_operator_type_criteria_t *custom_label_3; //model
    struct catalogs_product_group_filter_operator_type_criteria_t *custom_label_4; //model
    struct catalogs_product_group_multiple_string_criteria_t *item_group_id; //model
    struct catalogs_product_group_multiple_gender_criteria_t *gender; //model
    struct catalogs_product_group_multiple_media_types_criteria_t *media_type; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *product_type_4; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *product_type_3; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *product_type_2; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *product_type_1; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *product_type_0; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1; //model
    struct catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0; //model
    struct catalogs_product_group_uint32_criteria_t *custom_number_0; //model
    struct catalogs_product_group_uint32_criteria_t *custom_number_1; //model
    struct catalogs_product_group_uint32_criteria_t *custom_number_2; //model
    struct catalogs_product_group_uint32_criteria_t *custom_number_3; //model
    struct catalogs_product_group_uint32_criteria_t *custom_number_4; //model
    struct catalogs_product_group_multiple_string_criteria_t *title_keywords; //model
    struct catalogs_product_group_multiple_pinterest_product_category_criteria_t *pinterest_product_categories; //model
    struct catalogs_product_group_multiple_string_criteria_t *product_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_filter_keys_t;

__attribute__((deprecated)) catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys_create(
    catalogs_product_group_pricing_criteria_t *min_price,
    catalogs_product_group_pricing_criteria_t *max_price,
    catalogs_product_group_currency_criteria_t *currency,
    catalogs_product_group_multiple_string_criteria_t *item_id,
    catalogs_product_group_multiple_string_criteria_t *availability,
    catalogs_product_group_multiple_string_criteria_t *brand,
    catalogs_product_group_multiple_string_criteria_t *condition,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_0,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_1,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_2,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_3,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_4,
    catalogs_product_group_multiple_string_criteria_t *item_group_id,
    catalogs_product_group_multiple_gender_criteria_t *gender,
    catalogs_product_group_multiple_media_types_criteria_t *media_type,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_4,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_3,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_2,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_1,
    catalogs_product_group_multiple_string_list_criteria_t *product_type_0,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0,
    catalogs_product_group_uint32_criteria_t *custom_number_0,
    catalogs_product_group_uint32_criteria_t *custom_number_1,
    catalogs_product_group_uint32_criteria_t *custom_number_2,
    catalogs_product_group_uint32_criteria_t *custom_number_3,
    catalogs_product_group_uint32_criteria_t *custom_number_4,
    catalogs_product_group_multiple_string_criteria_t *title_keywords,
    catalogs_product_group_multiple_pinterest_product_category_criteria_t *pinterest_product_categories,
    catalogs_product_group_multiple_string_criteria_t *product_group
);

void catalogs_product_group_filter_keys_free(catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys);

catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys_parseFromJSON(cJSON *catalogs_product_group_filter_keysJSON);

cJSON *catalogs_product_group_filter_keys_convertToJSON(catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys);

#endif /* _catalogs_product_group_filter_keys_H_ */

