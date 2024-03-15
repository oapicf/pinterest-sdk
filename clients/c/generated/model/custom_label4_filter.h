/*
 * custom_label4_filter.h
 *
 * 
 */

#ifndef _custom_label4_filter_H_
#define _custom_label4_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_label4_filter_t custom_label4_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct custom_label4_filter_t {
    catalogs_product_group_multiple_string_criteria_t *custom_label_4; //object

} custom_label4_filter_t;

custom_label4_filter_t *custom_label4_filter_create(
    catalogs_product_group_multiple_string_criteria_t *custom_label_4
);

void custom_label4_filter_free(custom_label4_filter_t *custom_label4_filter);

custom_label4_filter_t *custom_label4_filter_parseFromJSON(cJSON *custom_label4_filterJSON);

cJSON *custom_label4_filter_convertToJSON(custom_label4_filter_t *custom_label4_filter);

#endif /* _custom_label4_filter_H_ */

