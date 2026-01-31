/*
 * product_categories_demographic.h
 *
 * Age and gender distribution who engaged with this product category in the past 3 months
 */

#ifndef _product_categories_demographic_H_
#define _product_categories_demographic_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_categories_demographic_t product_categories_demographic_t;

#include "gender_demographics.h"



typedef struct product_categories_demographic_t {
    list_t* age; //map
    struct gender_demographics_t *gender; //model

    int _library_owned; // Is the library responsible for freeing this object?
} product_categories_demographic_t;

__attribute__((deprecated)) product_categories_demographic_t *product_categories_demographic_create(
    list_t* age,
    gender_demographics_t *gender
);

void product_categories_demographic_free(product_categories_demographic_t *product_categories_demographic);

product_categories_demographic_t *product_categories_demographic_parseFromJSON(cJSON *product_categories_demographicJSON);

cJSON *product_categories_demographic_convertToJSON(product_categories_demographic_t *product_categories_demographic);

#endif /* _product_categories_demographic_H_ */

