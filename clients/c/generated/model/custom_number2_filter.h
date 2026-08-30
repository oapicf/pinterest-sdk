/*
 * custom_number2_filter.h
 *
 * 
 */

#ifndef _custom_number2_filter_H_
#define _custom_number2_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_number2_filter_t custom_number2_filter_t;

#include "catalogs_product_group_uint32_criteria.h"



typedef struct custom_number2_filter_t {
    struct catalogs_product_group_uint32_criteria_t *custom_number_2; //model

    int _library_owned; // Is the library responsible for freeing this object?
} custom_number2_filter_t;

__attribute__((deprecated)) custom_number2_filter_t *custom_number2_filter_create(
    catalogs_product_group_uint32_criteria_t *custom_number_2
);

void custom_number2_filter_free(custom_number2_filter_t *custom_number2_filter);

custom_number2_filter_t *custom_number2_filter_parseFromJSON(cJSON *custom_number2_filterJSON);

cJSON *custom_number2_filter_convertToJSON(custom_number2_filter_t *custom_number2_filter);

#endif /* _custom_number2_filter_H_ */

