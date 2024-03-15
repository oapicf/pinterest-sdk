/*
 * currency_filter.h
 *
 * 
 */

#ifndef _currency_filter_H_
#define _currency_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct currency_filter_t currency_filter_t;

#include "catalogs_product_group_currency_criteria.h"



typedef struct currency_filter_t {
    catalogs_product_group_currency_criteria_t *currency; //object

} currency_filter_t;

currency_filter_t *currency_filter_create(
    catalogs_product_group_currency_criteria_t *currency
);

void currency_filter_free(currency_filter_t *currency_filter);

currency_filter_t *currency_filter_parseFromJSON(cJSON *currency_filterJSON);

cJSON *currency_filter_convertToJSON(currency_filter_t *currency_filter);

#endif /* _currency_filter_H_ */

