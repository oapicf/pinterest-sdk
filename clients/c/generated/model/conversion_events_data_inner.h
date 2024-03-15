/*
 * conversion_events_data_inner.h
 *
 * 
 */

#ifndef _conversion_events_data_inner_H_
#define _conversion_events_data_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_data_inner_t conversion_events_data_inner_t;

#include "conversion_events_data_inner_custom_data.h"
#include "conversion_events_user_data.h"



typedef struct conversion_events_data_inner_t {
    char *event_name; // string
    char *action_source; // string
    long event_time; //numeric
    char *event_id; // string
    char *event_source_url; // string
    int opt_out; //boolean
    char *partner_name; // string
    struct conversion_events_user_data_t *user_data; //model
    struct conversion_events_data_inner_custom_data_t *custom_data; //model
    char *app_id; // string
    char *app_name; // string
    char *app_version; // string
    char *device_brand; // string
    char *device_carrier; // string
    char *device_model; // string
    char *device_type; // string
    char *os_version; // string
    int wifi; //boolean
    char *language; // string

} conversion_events_data_inner_t;

conversion_events_data_inner_t *conversion_events_data_inner_create(
    char *event_name,
    char *action_source,
    long event_time,
    char *event_id,
    char *event_source_url,
    int opt_out,
    char *partner_name,
    conversion_events_user_data_t *user_data,
    conversion_events_data_inner_custom_data_t *custom_data,
    char *app_id,
    char *app_name,
    char *app_version,
    char *device_brand,
    char *device_carrier,
    char *device_model,
    char *device_type,
    char *os_version,
    int wifi,
    char *language
);

void conversion_events_data_inner_free(conversion_events_data_inner_t *conversion_events_data_inner);

conversion_events_data_inner_t *conversion_events_data_inner_parseFromJSON(cJSON *conversion_events_data_innerJSON);

cJSON *conversion_events_data_inner_convertToJSON(conversion_events_data_inner_t *conversion_events_data_inner);

#endif /* _conversion_events_data_inner_H_ */

