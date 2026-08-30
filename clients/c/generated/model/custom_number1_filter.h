/*
 * custom_number1_filter.h
 *
 * 
 */

#ifndef _custom_number1_filter_H_
#define _custom_number1_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_number1_filter_t custom_number1_filter_t;

#include "catalogs_product_group_uint32_criteria.h"



typedef struct custom_number1_filter_t {
    struct catalogs_product_group_uint32_criteria_t *custom_number_1; //model

    int _library_owned; // Is the library responsible for freeing this object?
} custom_number1_filter_t;

__attribute__((deprecated)) custom_number1_filter_t *custom_number1_filter_create(
    catalogs_product_group_uint32_criteria_t *custom_number_1
);

void custom_number1_filter_free(custom_number1_filter_t *custom_number1_filter);

custom_number1_filter_t *custom_number1_filter_parseFromJSON(cJSON *custom_number1_filterJSON);

cJSON *custom_number1_filter_convertToJSON(custom_number1_filter_t *custom_number1_filter);

#endif /* _custom_number1_filter_H_ */

