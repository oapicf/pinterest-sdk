/*
 * conversion_events_data_items_custom_data_contents_items.h
 *
 * 
 */

#ifndef _conversion_events_data_items_custom_data_contents_items_H_
#define _conversion_events_data_items_custom_data_contents_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_data_items_custom_data_contents_items_t conversion_events_data_items_custom_data_contents_items_t;




typedef struct conversion_events_data_items_custom_data_contents_items_t {
    char *id; // string
    char *item_brand; // string
    char *item_brand_id; // string
    char *item_category; // string
    char *item_name; // string
    char *item_price; // string
    long *quantity; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_events_data_items_custom_data_contents_items_t;

__attribute__((deprecated)) conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items_create(
    char *id,
    char *item_brand,
    char *item_brand_id,
    char *item_category,
    char *item_name,
    char *item_price,
    long *quantity
);

void conversion_events_data_items_custom_data_contents_items_free(conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items);

conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items_parseFromJSON(cJSON *conversion_events_data_items_custom_data_contents_itemsJSON);

cJSON *conversion_events_data_items_custom_data_contents_items_convertToJSON(conversion_events_data_items_custom_data_contents_items_t *conversion_events_data_items_custom_data_contents_items);

#endif /* _conversion_events_data_items_custom_data_contents_items_H_ */

