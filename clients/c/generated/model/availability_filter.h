/*
 * availability_filter.h
 *
 * 
 */

#ifndef _availability_filter_H_
#define _availability_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct availability_filter_t availability_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct availability_filter_t {
    catalogs_product_group_multiple_string_criteria_t *availability; //object

} availability_filter_t;

availability_filter_t *availability_filter_create(
    catalogs_product_group_multiple_string_criteria_t *availability
);

void availability_filter_free(availability_filter_t *availability_filter);

availability_filter_t *availability_filter_parseFromJSON(cJSON *availability_filterJSON);

cJSON *availability_filter_convertToJSON(availability_filter_t *availability_filter);

#endif /* _availability_filter_H_ */

