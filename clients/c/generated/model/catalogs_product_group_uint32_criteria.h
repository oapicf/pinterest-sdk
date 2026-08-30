/*
 * catalogs_product_group_uint32_criteria.h
 *
 * 
 */

#ifndef _catalogs_product_group_uint32_criteria_H_
#define _catalogs_product_group_uint32_criteria_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_uint32_criteria_t catalogs_product_group_uint32_criteria_t;

#include "numeric_filter_operator_type.h"



typedef struct catalogs_product_group_uint32_criteria_t {
    int *negated; //boolean
    pinterest_rest_api_numeric_filter_operator_type__e _operator; //referenced enum
    int *value; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_uint32_criteria_t;

__attribute__((deprecated)) catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_create(
    int *negated,
    pinterest_rest_api_numeric_filter_operator_type__e _operator,
    int *value
);

void catalogs_product_group_uint32_criteria_free(catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria);

catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_parseFromJSON(cJSON *catalogs_product_group_uint32_criteriaJSON);

cJSON *catalogs_product_group_uint32_criteria_convertToJSON(catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria);

#endif /* _catalogs_product_group_uint32_criteria_H_ */

