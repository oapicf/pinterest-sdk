/*
 * catalogs_hotel_product_group_filter_keys.h
 *
 * 
 */

#ifndef _catalogs_hotel_product_group_filter_keys_H_
#define _catalogs_hotel_product_group_filter_keys_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_product_group_filter_keys_t catalogs_hotel_product_group_filter_keys_t;

#include "brand_filter.h"
#include "catalogs_product_group_multiple_countries_criteria.h"
#include "catalogs_product_group_multiple_string_criteria.h"
#include "catalogs_product_group_pricing_currency_criteria.h"
#include "country_filter.h"
#include "custom_label0_filter.h"
#include "custom_label1_filter.h"
#include "custom_label2_filter.h"
#include "custom_label3_filter.h"
#include "custom_label4_filter.h"
#include "hotel_id_filter.h"
#include "price_filter.h"



typedef struct catalogs_hotel_product_group_filter_keys_t {
    struct catalogs_product_group_pricing_currency_criteria_t *price; //model
    struct catalogs_product_group_multiple_string_criteria_t *hotel_id; //model
    struct catalogs_product_group_multiple_string_criteria_t *brand; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_0; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_1; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_2; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_3; //model
    struct catalogs_product_group_multiple_string_criteria_t *custom_label_4; //model
    struct catalogs_product_group_multiple_countries_criteria_t *country; //model

} catalogs_hotel_product_group_filter_keys_t;

catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys_create(
    catalogs_product_group_pricing_currency_criteria_t *price,
    catalogs_product_group_multiple_string_criteria_t *hotel_id,
    catalogs_product_group_multiple_string_criteria_t *brand,
    catalogs_product_group_multiple_string_criteria_t *custom_label_0,
    catalogs_product_group_multiple_string_criteria_t *custom_label_1,
    catalogs_product_group_multiple_string_criteria_t *custom_label_2,
    catalogs_product_group_multiple_string_criteria_t *custom_label_3,
    catalogs_product_group_multiple_string_criteria_t *custom_label_4,
    catalogs_product_group_multiple_countries_criteria_t *country
);

void catalogs_hotel_product_group_filter_keys_free(catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys);

catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys_parseFromJSON(cJSON *catalogs_hotel_product_group_filter_keysJSON);

cJSON *catalogs_hotel_product_group_filter_keys_convertToJSON(catalogs_hotel_product_group_filter_keys_t *catalogs_hotel_product_group_filter_keys);

#endif /* _catalogs_hotel_product_group_filter_keys_H_ */

