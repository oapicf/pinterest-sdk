/*
 * conversion_events_data_inner_custom_data.h
 *
 * Object containing other custom data.
 */

#ifndef _conversion_events_data_inner_custom_data_H_
#define _conversion_events_data_inner_custom_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_data_inner_custom_data_t conversion_events_data_inner_custom_data_t;

#include "conversion_events_data_inner_custom_data_contents_inner.h"



typedef struct conversion_events_data_inner_custom_data_t {
    char *currency; // string
    char *value; // string
    list_t *content_ids; //primitive container
    char *content_name; // string
    char *content_category; // string
    char *content_brand; // string
    list_t *contents; //nonprimitive container
    long num_items; //numeric
    char *order_id; // string
    char *search_string; // string
    char *opt_out_type; // string
    char *np; // string

} conversion_events_data_inner_custom_data_t;

conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data_create(
    char *currency,
    char *value,
    list_t *content_ids,
    char *content_name,
    char *content_category,
    char *content_brand,
    list_t *contents,
    long num_items,
    char *order_id,
    char *search_string,
    char *opt_out_type,
    char *np
);

void conversion_events_data_inner_custom_data_free(conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data);

conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data_parseFromJSON(cJSON *conversion_events_data_inner_custom_dataJSON);

cJSON *conversion_events_data_inner_custom_data_convertToJSON(conversion_events_data_inner_custom_data_t *conversion_events_data_inner_custom_data);

#endif /* _conversion_events_data_inner_custom_data_H_ */

