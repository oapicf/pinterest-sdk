/*
 * product_type3_filter.h
 *
 * 
 */

#ifndef _product_type3_filter_H_
#define _product_type3_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_type3_filter_t product_type3_filter_t;

#include "catalogs_product_group_multiple_string_list_criteria.h"



typedef struct product_type3_filter_t {
    catalogs_product_group_multiple_string_list_criteria_t *product_type_3; //object

} product_type3_filter_t;

product_type3_filter_t *product_type3_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_3
);

void product_type3_filter_free(product_type3_filter_t *product_type3_filter);

product_type3_filter_t *product_type3_filter_parseFromJSON(cJSON *product_type3_filterJSON);

cJSON *product_type3_filter_convertToJSON(product_type3_filter_t *product_type3_filter);

#endif /* _product_type3_filter_H_ */

