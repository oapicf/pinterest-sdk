/*
 * catalogs_product_group_multiple_gender_criteria.h
 *
 * 
 */

#ifndef _catalogs_product_group_multiple_gender_criteria_H_
#define _catalogs_product_group_multiple_gender_criteria_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_multiple_gender_criteria_t catalogs_product_group_multiple_gender_criteria_t;

#include "gender.h"

// Enum  for catalogs_product_group_multiple_gender_criteria

typedef enum  { pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__NULL = 0, pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__FEMALE, pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__MALE, pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__UNISEX } pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__e;

char* catalogs_product_group_multiple_gender_criteria_values_ToString(pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__e values);

pinterest_rest_api_catalogs_product_group_multiple_gender_criteria__e catalogs_product_group_multiple_gender_criteria_values_FromString(char* values);



typedef struct catalogs_product_group_multiple_gender_criteria_t {
    list_t *values; //nonprimitive container
    int negated; //boolean

} catalogs_product_group_multiple_gender_criteria_t;

catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria_create(
    list_t *values,
    int negated
);

void catalogs_product_group_multiple_gender_criteria_free(catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria);

catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_gender_criteriaJSON);

cJSON *catalogs_product_group_multiple_gender_criteria_convertToJSON(catalogs_product_group_multiple_gender_criteria_t *catalogs_product_group_multiple_gender_criteria);

#endif /* _catalogs_product_group_multiple_gender_criteria_H_ */

