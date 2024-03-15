/*
 * conversion_events_data_inner_custom_data_contents_inner.h
 *
 * 
 */

#ifndef _conversion_events_data_inner_custom_data_contents_inner_H_
#define _conversion_events_data_inner_custom_data_contents_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_data_inner_custom_data_contents_inner_t conversion_events_data_inner_custom_data_contents_inner_t;




typedef struct conversion_events_data_inner_custom_data_contents_inner_t {
    char *id; // string
    char *item_price; // string
    long quantity; //numeric
    char *item_name; // string
    char *item_category; // string
    char *item_brand; // string

} conversion_events_data_inner_custom_data_contents_inner_t;

conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner_create(
    char *id,
    char *item_price,
    long quantity,
    char *item_name,
    char *item_category,
    char *item_brand
);

void conversion_events_data_inner_custom_data_contents_inner_free(conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner);

conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner_parseFromJSON(cJSON *conversion_events_data_inner_custom_data_contents_innerJSON);

cJSON *conversion_events_data_inner_custom_data_contents_inner_convertToJSON(conversion_events_data_inner_custom_data_contents_inner_t *conversion_events_data_inner_custom_data_contents_inner);

#endif /* _conversion_events_data_inner_custom_data_contents_inner_H_ */

