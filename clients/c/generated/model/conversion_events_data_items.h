/*
 * conversion_events_data_items.h
 *
 * 
 */

#ifndef _conversion_events_data_items_H_
#define _conversion_events_data_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_data_items_t conversion_events_data_items_t;

#include "conversion_event_app_info.h"
#include "conversion_event_device_info.h"
#include "conversion_events_data_items_custom_data.h"
#include "conversion_events_user_data_properties.h"



typedef struct conversion_events_data_items_t {
    char *action_source; // string
    char *app_id; // string
    struct conversion_event_app_info_t *app_info; //model
    char *app_name; // string
    char *app_version; // string
    struct conversion_events_data_items_custom_data_t *custom_data; //model
    char *device_brand; // string
    char *device_carrier; // string
    struct conversion_event_device_info_t *device_info; //model
    char *device_model; // string
    char *device_type; // string
    char *event_id; // string
    char *event_name; // string
    char *event_source_url; // string
    long *event_time; //numeric
    char *language; // string
    int *opt_out; //boolean
    char *os_version; // string
    char *partner_name; // string
    struct conversion_events_user_data_properties_t *user_data; //model
    int *wifi; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_events_data_items_t;

__attribute__((deprecated)) conversion_events_data_items_t *conversion_events_data_items_create(
    char *action_source,
    char *app_id,
    conversion_event_app_info_t *app_info,
    char *app_name,
    char *app_version,
    conversion_events_data_items_custom_data_t *custom_data,
    char *device_brand,
    char *device_carrier,
    conversion_event_device_info_t *device_info,
    char *device_model,
    char *device_type,
    char *event_id,
    char *event_name,
    char *event_source_url,
    long *event_time,
    char *language,
    int *opt_out,
    char *os_version,
    char *partner_name,
    conversion_events_user_data_properties_t *user_data,
    int *wifi
);

void conversion_events_data_items_free(conversion_events_data_items_t *conversion_events_data_items);

conversion_events_data_items_t *conversion_events_data_items_parseFromJSON(cJSON *conversion_events_data_itemsJSON);

cJSON *conversion_events_data_items_convertToJSON(conversion_events_data_items_t *conversion_events_data_items);

#endif /* _conversion_events_data_items_H_ */

