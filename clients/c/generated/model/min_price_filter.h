/*
 * min_price_filter.h
 *
 * 
 */

#ifndef _min_price_filter_H_
#define _min_price_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct min_price_filter_t min_price_filter_t;

#include "catalogs_product_group_pricing_criteria.h"



typedef struct min_price_filter_t {
    catalogs_product_group_pricing_criteria_t *min_price; //object

} min_price_filter_t;

min_price_filter_t *min_price_filter_create(
    catalogs_product_group_pricing_criteria_t *min_price
);

void min_price_filter_free(min_price_filter_t *min_price_filter);

min_price_filter_t *min_price_filter_parseFromJSON(cJSON *min_price_filterJSON);

cJSON *min_price_filter_convertToJSON(min_price_filter_t *min_price_filter);

#endif /* _min_price_filter_H_ */

