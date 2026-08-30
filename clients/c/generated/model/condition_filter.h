/*
 * condition_filter.h
 *
 * 
 */

#ifndef _condition_filter_H_
#define _condition_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct condition_filter_t condition_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct condition_filter_t {
    struct catalogs_product_group_multiple_string_criteria_t *condition; //model

    int _library_owned; // Is the library responsible for freeing this object?
} condition_filter_t;

__attribute__((deprecated)) condition_filter_t *condition_filter_create(
    catalogs_product_group_multiple_string_criteria_t *condition
);

void condition_filter_free(condition_filter_t *condition_filter);

condition_filter_t *condition_filter_parseFromJSON(cJSON *condition_filterJSON);

cJSON *condition_filter_convertToJSON(condition_filter_t *condition_filter);

#endif /* _condition_filter_H_ */

