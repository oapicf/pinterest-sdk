/*
 * catalogs_product_group_pricing_criteria.h
 *
 * 
 */

#ifndef _catalogs_product_group_pricing_criteria_H_
#define _catalogs_product_group_pricing_criteria_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_pricing_criteria_t catalogs_product_group_pricing_criteria_t;




typedef struct catalogs_product_group_pricing_criteria_t {
    int inclusion; //boolean
    double values; //numeric
    int negated; //boolean

} catalogs_product_group_pricing_criteria_t;

catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_create(
    int inclusion,
    double values,
    int negated
);

void catalogs_product_group_pricing_criteria_free(catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria);

catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria_parseFromJSON(cJSON *catalogs_product_group_pricing_criteriaJSON);

cJSON *catalogs_product_group_pricing_criteria_convertToJSON(catalogs_product_group_pricing_criteria_t *catalogs_product_group_pricing_criteria);

#endif /* _catalogs_product_group_pricing_criteria_H_ */

