/*
 * price_filter.h
 *
 * 
 */

#ifndef _price_filter_H_
#define _price_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_filter_t price_filter_t;

#include "catalogs_product_group_pricing_currency_criteria.h"



typedef struct price_filter_t {
    struct catalogs_product_group_pricing_currency_criteria_t *price; //model

} price_filter_t;

price_filter_t *price_filter_create(
    catalogs_product_group_pricing_currency_criteria_t *price
);

void price_filter_free(price_filter_t *price_filter);

price_filter_t *price_filter_parseFromJSON(cJSON *price_filterJSON);

cJSON *price_filter_convertToJSON(price_filter_t *price_filter);

#endif /* _price_filter_H_ */

