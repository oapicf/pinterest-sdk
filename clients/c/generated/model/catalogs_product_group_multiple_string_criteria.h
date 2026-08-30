/*
 * catalogs_product_group_multiple_string_criteria.h
 *
 * 
 */

#ifndef _catalogs_product_group_multiple_string_criteria_H_
#define _catalogs_product_group_multiple_string_criteria_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_multiple_string_criteria_t catalogs_product_group_multiple_string_criteria_t;




typedef struct catalogs_product_group_multiple_string_criteria_t {
    int *negated; //boolean
    list_t *values; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_multiple_string_criteria_t;

__attribute__((deprecated)) catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria_create(
    int *negated,
    list_t *values
);

void catalogs_product_group_multiple_string_criteria_free(catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria);

catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_string_criteriaJSON);

cJSON *catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_product_group_multiple_string_criteria_t *catalogs_product_group_multiple_string_criteria);

#endif /* _catalogs_product_group_multiple_string_criteria_H_ */

