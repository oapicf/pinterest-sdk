/*
 * catalogs_product_group_multiple_string_list_criteria.h
 *
 * 
 */

#ifndef _catalogs_product_group_multiple_string_list_criteria_H_
#define _catalogs_product_group_multiple_string_list_criteria_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_multiple_string_list_criteria_t catalogs_product_group_multiple_string_list_criteria_t;




typedef struct catalogs_product_group_multiple_string_list_criteria_t {
    list_t *values; //primitive container
    int negated; //boolean

} catalogs_product_group_multiple_string_list_criteria_t;

catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria_create(
    list_t *values,
    int negated
);

void catalogs_product_group_multiple_string_list_criteria_free(catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria);

catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_string_list_criteriaJSON);

cJSON *catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_product_group_multiple_string_list_criteria_t *catalogs_product_group_multiple_string_list_criteria);

#endif /* _catalogs_product_group_multiple_string_list_criteria_H_ */

