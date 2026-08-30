/*
 * catalogs_product_group_filter_operator_type_criteria.h
 *
 * 
 */

#ifndef _catalogs_product_group_filter_operator_type_criteria_H_
#define _catalogs_product_group_filter_operator_type_criteria_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_filter_operator_type_criteria_t catalogs_product_group_filter_operator_type_criteria_t;

#include "filter_operator_type.h"



typedef struct catalogs_product_group_filter_operator_type_criteria_t {
    pinterest_rest_api_filter_operator_type__e filter_operator_type; //referenced enum
    int *negated; //boolean
    list_t *values; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_filter_operator_type_criteria_t;

__attribute__((deprecated)) catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria_create(
    pinterest_rest_api_filter_operator_type__e filter_operator_type,
    int *negated,
    list_t *values
);

void catalogs_product_group_filter_operator_type_criteria_free(catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria);

catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria_parseFromJSON(cJSON *catalogs_product_group_filter_operator_type_criteriaJSON);

cJSON *catalogs_product_group_filter_operator_type_criteria_convertToJSON(catalogs_product_group_filter_operator_type_criteria_t *catalogs_product_group_filter_operator_type_criteria);

#endif /* _catalogs_product_group_filter_operator_type_criteria_H_ */

