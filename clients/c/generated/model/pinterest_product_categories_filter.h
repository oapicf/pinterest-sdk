/*
 * pinterest_product_categories_filter.h
 *
 * 
 */

#ifndef _pinterest_product_categories_filter_H_
#define _pinterest_product_categories_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pinterest_product_categories_filter_t pinterest_product_categories_filter_t;

#include "catalogs_product_group_multiple_pinterest_product_category_criteria.h"



typedef struct pinterest_product_categories_filter_t {
    struct catalogs_product_group_multiple_pinterest_product_category_criteria_t *pinterest_product_categories; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pinterest_product_categories_filter_t;

__attribute__((deprecated)) pinterest_product_categories_filter_t *pinterest_product_categories_filter_create(
    catalogs_product_group_multiple_pinterest_product_category_criteria_t *pinterest_product_categories
);

void pinterest_product_categories_filter_free(pinterest_product_categories_filter_t *pinterest_product_categories_filter);

pinterest_product_categories_filter_t *pinterest_product_categories_filter_parseFromJSON(cJSON *pinterest_product_categories_filterJSON);

cJSON *pinterest_product_categories_filter_convertToJSON(pinterest_product_categories_filter_t *pinterest_product_categories_filter);

#endif /* _pinterest_product_categories_filter_H_ */

