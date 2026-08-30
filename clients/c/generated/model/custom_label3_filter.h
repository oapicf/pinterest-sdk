/*
 * custom_label3_filter.h
 *
 * 
 */

#ifndef _custom_label3_filter_H_
#define _custom_label3_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_label3_filter_t custom_label3_filter_t;

#include "catalogs_product_group_filter_operator_type_criteria.h"



typedef struct custom_label3_filter_t {
    struct catalogs_product_group_filter_operator_type_criteria_t *custom_label_3; //model

    int _library_owned; // Is the library responsible for freeing this object?
} custom_label3_filter_t;

__attribute__((deprecated)) custom_label3_filter_t *custom_label3_filter_create(
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_3
);

void custom_label3_filter_free(custom_label3_filter_t *custom_label3_filter);

custom_label3_filter_t *custom_label3_filter_parseFromJSON(cJSON *custom_label3_filterJSON);

cJSON *custom_label3_filter_convertToJSON(custom_label3_filter_t *custom_label3_filter);

#endif /* _custom_label3_filter_H_ */

