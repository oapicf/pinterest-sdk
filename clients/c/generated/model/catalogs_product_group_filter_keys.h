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

#include "availability_filter.h"
#include "brand_filter.h"
#include "catalogs_product_group_currency_criteria.h"
#include "catalogs_product_group_multiple_gender_criteria.h"
#include "catalogs_product_group_multiple_string_criteria.h"
#include "catalogs_product_group_multiple_string_list_criteria.h"
#include "catalogs_product_group_pricing_criteria.h"
#include "condition_filter.h"
#include "currency_filter.h"
#include "custom_label0_filter.h"
#include "custom_label1_filter.h"
#include "custom_label2_filter.h"
#include "custom_label3_filter.h"
#include "custom_label4_filter.h"
#include "gender_filter.h"
#include "google_product_category0_filter.h"
#include "google_product_category1_filter.h"
#include "google_product_category2_filter.h"
#include "google_product_category3_filter.h"
#include "google_product_category4_filter.h"
#include "google_product_category5_filter.h"
#include "google_product_category6_filter.h"
#include "item_group_id_filter.h"
#include "item_id_filter.h"
#include "max_price_filter.h"
#include "min_price_filter.h"
#include "product_type0_filter.h"
#include "product_type1_filter.h"
#include "product_type2_filter.h"
#include "product_type3_filter.h"
#include "product_type4_filter.h"



typedef struct catalogs_product_group_filter_keys_t {
    struct catalogs_product_group_pricing_criteria_t *min_price; //model
    struct catalogs_product_group_pricing_criteria_t *max_price; //model
    struct catalogs_product_group_currency_criteria_t *currency; //model
    struct catalogs_product_group_multiple_string_criteria_t *item_id; //model
    struct catalogs_product_group_multiple_string_criteria_t *availability; //model
    struct catalogs_product_group_multiple_string_criteria_t *brand; //model
    struct catalogs_product_group_multiple_string_criteria_t *condition; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_0; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_1; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_2; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_3; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_4; //model
    struct catalogs_product_group_multiple_string_criteria_t *item_group_id; //model
    struct catalogs_product_group_multiple_gender_criteria_t *gender; //model
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

} catalogs_product_group_filter_keys_t;

catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys_create(
    catalogs_product_group_pricing_criteria_t *min_price,
    catalogs_product_group_pricing_criteria_t *max_price,
    catalogs_product_group_currency_criteria_t *currency,
    catalogs_product_group_multiple_string_criteria_t *item_id,
    catalogs_product_group_multiple_string_criteria_t *availability,
    catalogs_product_group_multiple_string_criteria_t *brand,
    catalogs_product_group_multiple_string_criteria_t *condition,
    catalogs_product_group_multiple_string_criteria_t *custom_label_0,
    catalogs_product_group_multiple_string_criteria_t *custom_label_1,
    catalogs_product_group_multiple_string_criteria_t *custom_label_2,
    catalogs_product_group_multiple_string_criteria_t *custom_label_3,
    catalogs_product_group_multiple_string_criteria_t *custom_label_4,
    catalogs_product_group_multiple_string_criteria_t *item_group_id,
    catalogs_product_group_multiple_gender_criteria_t *gender,
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
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0
);

void catalogs_product_group_filter_keys_free(catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys);

catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys_parseFromJSON(cJSON *catalogs_product_group_filter_keysJSON);

cJSON *catalogs_product_group_filter_keys_convertToJSON(catalogs_product_group_filter_keys_t *catalogs_product_group_filter_keys);

#endif /* _catalogs_product_group_filter_keys_H_ */

