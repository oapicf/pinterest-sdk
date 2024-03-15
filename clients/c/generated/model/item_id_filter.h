/*
 * item_id_filter.h
 *
 * 
 */

#ifndef _item_id_filter_H_
#define _item_id_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_id_filter_t item_id_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct item_id_filter_t {
    catalogs_product_group_multiple_string_criteria_t *item_id; //object

} item_id_filter_t;

item_id_filter_t *item_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *item_id
);

void item_id_filter_free(item_id_filter_t *item_id_filter);

item_id_filter_t *item_id_filter_parseFromJSON(cJSON *item_id_filterJSON);

cJSON *item_id_filter_convertToJSON(item_id_filter_t *item_id_filter);

#endif /* _item_id_filter_H_ */

