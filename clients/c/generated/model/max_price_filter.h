/*
 * max_price_filter.h
 *
 * 
 */

#ifndef _max_price_filter_H_
#define _max_price_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct max_price_filter_t max_price_filter_t;

#include "catalogs_product_group_pricing_criteria.h"



typedef struct max_price_filter_t {
    catalogs_product_group_pricing_criteria_t *max_price; //object

} max_price_filter_t;

max_price_filter_t *max_price_filter_create(
    catalogs_product_group_pricing_criteria_t *max_price
);

void max_price_filter_free(max_price_filter_t *max_price_filter);

max_price_filter_t *max_price_filter_parseFromJSON(cJSON *max_price_filterJSON);

cJSON *max_price_filter_convertToJSON(max_price_filter_t *max_price_filter);

#endif /* _max_price_filter_H_ */

