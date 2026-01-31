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


// Enum OPERATOR for catalogs_product_group_uint32_criteria

typedef enum  { pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_NULL = 0, pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_GREATER_THAN, pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_GREATER_THAN_OR_EQUALS, pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_LESS_THAN, pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_LESS_THAN_OR_EQUALS } pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_e;

char* catalogs_product_group_uint32_criteria__operator_ToString(pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_e _operator);

pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_e catalogs_product_group_uint32_criteria__operator_FromString(char* _operator);



typedef struct catalogs_product_group_uint32_criteria_t {
    int negated; //boolean
    pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_e _operator; //enum
    int value; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_uint32_criteria_t;

__attribute__((deprecated)) catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_create(
    int negated,
    pinterest_rest_api_catalogs_product_group_uint32_criteria_OPERATOR_e _operator,
    int value
);

void catalogs_product_group_uint32_criteria_free(catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria);

catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria_parseFromJSON(cJSON *catalogs_product_group_uint32_criteriaJSON);

cJSON *catalogs_product_group_uint32_criteria_convertToJSON(catalogs_product_group_uint32_criteria_t *catalogs_product_group_uint32_criteria);

#endif /* _catalogs_product_group_uint32_criteria_H_ */

