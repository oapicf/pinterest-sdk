/*
 * hotel_id_filter.h
 *
 * 
 */

#ifndef _hotel_id_filter_H_
#define _hotel_id_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct hotel_id_filter_t hotel_id_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct hotel_id_filter_t {
    catalogs_product_group_multiple_string_criteria_t *hotel_id; //object

} hotel_id_filter_t;

hotel_id_filter_t *hotel_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *hotel_id
);

void hotel_id_filter_free(hotel_id_filter_t *hotel_id_filter);

hotel_id_filter_t *hotel_id_filter_parseFromJSON(cJSON *hotel_id_filterJSON);

cJSON *hotel_id_filter_convertToJSON(hotel_id_filter_t *hotel_id_filter);

#endif /* _hotel_id_filter_H_ */

