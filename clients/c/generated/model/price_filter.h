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

#include "price_filter_price.h"



typedef struct price_filter_t {
    struct price_filter_price_t *price; //model

    int _library_owned; // Is the library responsible for freeing this object?
} price_filter_t;

__attribute__((deprecated)) price_filter_t *price_filter_create(
    price_filter_price_t *price
);

void price_filter_free(price_filter_t *price_filter);

price_filter_t *price_filter_parseFromJSON(cJSON *price_filterJSON);

cJSON *price_filter_convertToJSON(price_filter_t *price_filter);

#endif /* _price_filter_H_ */

