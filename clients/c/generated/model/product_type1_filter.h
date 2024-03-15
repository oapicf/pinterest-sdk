/*
 * product_type1_filter.h
 *
 * 
 */

#ifndef _product_type1_filter_H_
#define _product_type1_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_type1_filter_t product_type1_filter_t;

#include "catalogs_product_group_multiple_string_list_criteria.h"



typedef struct product_type1_filter_t {
    catalogs_product_group_multiple_string_list_criteria_t *product_type_1; //object

} product_type1_filter_t;

product_type1_filter_t *product_type1_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_1
);

void product_type1_filter_free(product_type1_filter_t *product_type1_filter);

product_type1_filter_t *product_type1_filter_parseFromJSON(cJSON *product_type1_filterJSON);

cJSON *product_type1_filter_convertToJSON(product_type1_filter_t *product_type1_filter);

#endif /* _product_type1_filter_H_ */

