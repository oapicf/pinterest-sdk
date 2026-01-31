/*
 * custom_number0_filter.h
 *
 * 
 */

#ifndef _custom_number0_filter_H_
#define _custom_number0_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_number0_filter_t custom_number0_filter_t;

#include "catalogs_product_group_uint32_criteria.h"



typedef struct custom_number0_filter_t {
    catalogs_product_group_uint32_criteria_t *custom_number_0; //object

    int _library_owned; // Is the library responsible for freeing this object?
} custom_number0_filter_t;

__attribute__((deprecated)) custom_number0_filter_t *custom_number0_filter_create(
    catalogs_product_group_uint32_criteria_t *custom_number_0
);

void custom_number0_filter_free(custom_number0_filter_t *custom_number0_filter);

custom_number0_filter_t *custom_number0_filter_parseFromJSON(cJSON *custom_number0_filterJSON);

cJSON *custom_number0_filter_convertToJSON(custom_number0_filter_t *custom_number0_filter);

#endif /* _custom_number0_filter_H_ */

