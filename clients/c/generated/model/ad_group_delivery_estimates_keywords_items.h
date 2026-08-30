/*
 * ad_group_delivery_estimates_keywords_items.h
 *
 * 
 */

#ifndef _ad_group_delivery_estimates_keywords_items_H_
#define _ad_group_delivery_estimates_keywords_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_delivery_estimates_keywords_items_t ad_group_delivery_estimates_keywords_items_t;

#include "nullalble_match_type.h"



typedef struct ad_group_delivery_estimates_keywords_items_t {
    nullalble_match_type_t *match_type; // custom
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_delivery_estimates_keywords_items_t;

__attribute__((deprecated)) ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items_create(
    nullalble_match_type_t *match_type,
    char *value
);

void ad_group_delivery_estimates_keywords_items_free(ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items);

ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items_parseFromJSON(cJSON *ad_group_delivery_estimates_keywords_itemsJSON);

cJSON *ad_group_delivery_estimates_keywords_items_convertToJSON(ad_group_delivery_estimates_keywords_items_t *ad_group_delivery_estimates_keywords_items);

#endif /* _ad_group_delivery_estimates_keywords_items_H_ */

