/*
 * catalogs_product_group_currency_criteria.h
 *
 * A currency filter. This filter cannot be negated
 */

#ifndef _catalogs_product_group_currency_criteria_H_
#define _catalogs_product_group_currency_criteria_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_currency_criteria_t catalogs_product_group_currency_criteria_t;

#include "non_nullable_catalogs_currency.h"



typedef struct catalogs_product_group_currency_criteria_t {
    int negated; //boolean
    pinterest_rest_api_non_nullable_catalogs_currency__e values; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_currency_criteria_t;

__attribute__((deprecated)) catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_create(
    int negated,
    pinterest_rest_api_non_nullable_catalogs_currency__e values
);

void catalogs_product_group_currency_criteria_free(catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria);

catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_parseFromJSON(cJSON *catalogs_product_group_currency_criteriaJSON);

cJSON *catalogs_product_group_currency_criteria_convertToJSON(catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria);

#endif /* _catalogs_product_group_currency_criteria_H_ */

