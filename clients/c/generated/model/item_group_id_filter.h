/*
 * item_group_id_filter.h
 *
 * 
 */

#ifndef _item_group_id_filter_H_
#define _item_group_id_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_group_id_filter_t item_group_id_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct item_group_id_filter_t {
    catalogs_product_group_multiple_string_criteria_t *item_group_id; //object

} item_group_id_filter_t;

item_group_id_filter_t *item_group_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *item_group_id
);

void item_group_id_filter_free(item_group_id_filter_t *item_group_id_filter);

item_group_id_filter_t *item_group_id_filter_parseFromJSON(cJSON *item_group_id_filterJSON);

cJSON *item_group_id_filter_convertToJSON(item_group_id_filter_t *item_group_id_filter);

#endif /* _item_group_id_filter_H_ */

