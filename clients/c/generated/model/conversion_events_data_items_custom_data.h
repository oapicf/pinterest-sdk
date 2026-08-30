/*
 * conversion_events_data_items_custom_data.h
 *
 * Object containing other custom data.
 */

#ifndef _conversion_events_data_items_custom_data_H_
#define _conversion_events_data_items_custom_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_data_items_custom_data_t conversion_events_data_items_custom_data_t;

#include "conversion_events_data_items_custom_data_contents_items.h"



typedef struct conversion_events_data_items_custom_data_t {
    char *content_brand; // string
    char *content_category; // string
    list_t *content_ids; //primitive container
    char *content_name; // string
    list_t *contents; //nonprimitive container
    char *currency; // string
    char *external_measurement_id; // string
    int *external_measurement_vendor_id; //numeric
    char *np; // string
    long *num_items; //numeric
    char *opt_out_type; // string
    char *order_id; // string
    char *predicted_ltv; // string
    char *search_string; // string
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_events_data_items_custom_data_t;

__attribute__((deprecated)) conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data_create(
    char *content_brand,
    char *content_category,
    list_t *content_ids,
    char *content_name,
    list_t *contents,
    char *currency,
    char *external_measurement_id,
    int *external_measurement_vendor_id,
    char *np,
    long *num_items,
    char *opt_out_type,
    char *order_id,
    char *predicted_ltv,
    char *search_string,
    char *value
);

void conversion_events_data_items_custom_data_free(conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data);

conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data_parseFromJSON(cJSON *conversion_events_data_items_custom_dataJSON);

cJSON *conversion_events_data_items_custom_data_convertToJSON(conversion_events_data_items_custom_data_t *conversion_events_data_items_custom_data);

#endif /* _conversion_events_data_items_custom_data_H_ */

