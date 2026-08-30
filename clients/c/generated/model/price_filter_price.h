/*
 * price_filter_price.h
 *
 * 
 */

#ifndef _price_filter_price_H_
#define _price_filter_price_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_filter_price_t price_filter_price_t;

#include "non_nullable_catalogs_currency.h"
#include "numeric_filter_operator_type.h"



typedef struct price_filter_price_t {
    pinterest_rest_api_non_nullable_catalogs_currency__e currency; //referenced enum
    int *negated; //boolean
    pinterest_rest_api_numeric_filter_operator_type__e _operator; //referenced enum
    double *value; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} price_filter_price_t;

__attribute__((deprecated)) price_filter_price_t *price_filter_price_create(
    pinterest_rest_api_non_nullable_catalogs_currency__e currency,
    int *negated,
    pinterest_rest_api_numeric_filter_operator_type__e _operator,
    double *value
);

void price_filter_price_free(price_filter_price_t *price_filter_price);

price_filter_price_t *price_filter_price_parseFromJSON(cJSON *price_filter_priceJSON);

cJSON *price_filter_price_convertToJSON(price_filter_price_t *price_filter_price);

#endif /* _price_filter_price_H_ */

