/*
 * product_group_reference_filter.h
 *
 * 
 */

#ifndef _product_group_reference_filter_H_
#define _product_group_reference_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_reference_filter_t product_group_reference_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct product_group_reference_filter_t {
    catalogs_product_group_multiple_string_criteria_t *product_group; //object

} product_group_reference_filter_t;

product_group_reference_filter_t *product_group_reference_filter_create(
    catalogs_product_group_multiple_string_criteria_t *product_group
);

void product_group_reference_filter_free(product_group_reference_filter_t *product_group_reference_filter);

product_group_reference_filter_t *product_group_reference_filter_parseFromJSON(cJSON *product_group_reference_filterJSON);

cJSON *product_group_reference_filter_convertToJSON(product_group_reference_filter_t *product_group_reference_filter);

#endif /* _product_group_reference_filter_H_ */

