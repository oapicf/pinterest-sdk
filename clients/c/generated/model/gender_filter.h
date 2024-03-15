/*
 * gender_filter.h
 *
 * 
 */

#ifndef _gender_filter_H_
#define _gender_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_filter_t gender_filter_t;

#include "catalogs_product_group_multiple_gender_criteria.h"



typedef struct gender_filter_t {
    catalogs_product_group_multiple_gender_criteria_t *gender; //object

} gender_filter_t;

gender_filter_t *gender_filter_create(
    catalogs_product_group_multiple_gender_criteria_t *gender
);

void gender_filter_free(gender_filter_t *gender_filter);

gender_filter_t *gender_filter_parseFromJSON(cJSON *gender_filterJSON);

cJSON *gender_filter_convertToJSON(gender_filter_t *gender_filter);

#endif /* _gender_filter_H_ */

