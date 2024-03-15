/*
 * brand_filter.h
 *
 * 
 */

#ifndef _brand_filter_H_
#define _brand_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brand_filter_t brand_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct brand_filter_t {
    catalogs_product_group_multiple_string_criteria_t *brand; //object

} brand_filter_t;

brand_filter_t *brand_filter_create(
    catalogs_product_group_multiple_string_criteria_t *brand
);

void brand_filter_free(brand_filter_t *brand_filter);

brand_filter_t *brand_filter_parseFromJSON(cJSON *brand_filterJSON);

cJSON *brand_filter_convertToJSON(brand_filter_t *brand_filter);

#endif /* _brand_filter_H_ */

