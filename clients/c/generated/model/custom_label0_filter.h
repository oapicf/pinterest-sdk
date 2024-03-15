/*
 * custom_label0_filter.h
 *
 * 
 */

#ifndef _custom_label0_filter_H_
#define _custom_label0_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_label0_filter_t custom_label0_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct custom_label0_filter_t {
    catalogs_product_group_multiple_string_criteria_t *custom_label_0; //object

} custom_label0_filter_t;

custom_label0_filter_t *custom_label0_filter_create(
    catalogs_product_group_multiple_string_criteria_t *custom_label_0
);

void custom_label0_filter_free(custom_label0_filter_t *custom_label0_filter);

custom_label0_filter_t *custom_label0_filter_parseFromJSON(cJSON *custom_label0_filterJSON);

cJSON *custom_label0_filter_convertToJSON(custom_label0_filter_t *custom_label0_filter);

#endif /* _custom_label0_filter_H_ */

