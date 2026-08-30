/*
 * product_type2_filter.h
 *
 * 
 */

#ifndef _product_type2_filter_H_
#define _product_type2_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_type2_filter_t product_type2_filter_t;

#include "catalogs_product_group_multiple_string_list_criteria.h"



typedef struct product_type2_filter_t {
    struct catalogs_product_group_multiple_string_list_criteria_t *product_type_2; //model

    int _library_owned; // Is the library responsible for freeing this object?
} product_type2_filter_t;

__attribute__((deprecated)) product_type2_filter_t *product_type2_filter_create(
    catalogs_product_group_multiple_string_list_criteria_t *product_type_2
);

void product_type2_filter_free(product_type2_filter_t *product_type2_filter);

product_type2_filter_t *product_type2_filter_parseFromJSON(cJSON *product_type2_filterJSON);

cJSON *product_type2_filter_convertToJSON(product_type2_filter_t *product_type2_filter);

#endif /* _product_type2_filter_H_ */

