/*
 * custom_number4_filter.h
 *
 * 
 */

#ifndef _custom_number4_filter_H_
#define _custom_number4_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_number4_filter_t custom_number4_filter_t;

#include "catalogs_product_group_uint32_criteria.h"



typedef struct custom_number4_filter_t {
    catalogs_product_group_uint32_criteria_t *custom_number_4; //object

    int _library_owned; // Is the library responsible for freeing this object?
} custom_number4_filter_t;

__attribute__((deprecated)) custom_number4_filter_t *custom_number4_filter_create(
    catalogs_product_group_uint32_criteria_t *custom_number_4
);

void custom_number4_filter_free(custom_number4_filter_t *custom_number4_filter);

custom_number4_filter_t *custom_number4_filter_parseFromJSON(cJSON *custom_number4_filterJSON);

cJSON *custom_number4_filter_convertToJSON(custom_number4_filter_t *custom_number4_filter);

#endif /* _custom_number4_filter_H_ */

