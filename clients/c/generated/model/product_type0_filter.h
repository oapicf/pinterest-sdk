/*
 * product_type0_filter.h
 *
 * 
 */

#ifndef _product_type0_filter_H_
#define _product_type0_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_type0_filter_t product_type0_filter_t;

#include "catalogs_product_group_multiple_string_list_criteria.h"



typedef struct product_type0_filter_t {
    catalogs_product_group_multiple_string_list_criteria_t *product_type_0; //object

} product_type0_filter_t;

product_type0_filter_t *product_type0_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_0
);

void product_type0_filter_free(product_type0_filter_t *product_type0_filter);

product_type0_filter_t *product_type0_filter_parseFromJSON(cJSON *product_type0_filterJSON);

cJSON *product_type0_filter_convertToJSON(product_type0_filter_t *product_type0_filter);

#endif /* _product_type0_filter_H_ */

