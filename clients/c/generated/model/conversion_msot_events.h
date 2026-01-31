/*
 * conversion_msot_events.h
 *
 * Object containing the MSOT conversion events.
 */

#ifndef _conversion_msot_events_H_
#define _conversion_msot_events_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_msot_events_t conversion_msot_events_t;

#include "currency.h"

// Enum ATTRIBUTIONMODEL for conversion_msot_events

typedef enum  { pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_NULL = 0, pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_first_touch, pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_last_touch, pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_multi_touch } pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e;

char* conversion_msot_events_attribution_model_ToString(pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e attribution_model);

pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e conversion_msot_events_attribution_model_FromString(char* attribution_model);

// Enum ATTRIBUTIONSCOPE for conversion_msot_events

typedef enum  { pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_NULL = 0, pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_view, pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_engagement, pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_click } pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e;

char* conversion_msot_events_attribution_scope_ToString(pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e attribution_scope);

pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e conversion_msot_events_attribution_scope_FromString(char* attribution_scope);

// Enum EVENTNAME for conversion_msot_events

typedef enum  { pinterest_rest_api_conversion_msot_events_EVENTNAME_NULL = 0, pinterest_rest_api_conversion_msot_events_EVENTNAME_add_to_cart, pinterest_rest_api_conversion_msot_events_EVENTNAME_checkout, pinterest_rest_api_conversion_msot_events_EVENTNAME_lead, pinterest_rest_api_conversion_msot_events_EVENTNAME_signup } pinterest_rest_api_conversion_msot_events_EVENTNAME_e;

char* conversion_msot_events_event_name_ToString(pinterest_rest_api_conversion_msot_events_EVENTNAME_e event_name);

pinterest_rest_api_conversion_msot_events_EVENTNAME_e conversion_msot_events_event_name_FromString(char* event_name);



typedef struct conversion_msot_events_t {
    list_t *action_timestamps; //primitive container
    char *ad_group_id; // string
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e attribution_model; //enum
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e attribution_scope; //enum
    double attribution_score; //numeric
    char *campaign_id; // string
    struct currency_t *currency; //model
    char *event_id; // string
    pinterest_rest_api_conversion_msot_events_EVENTNAME_e event_name; //enum
    long event_timestamp; //numeric
    int total_event_touchpoints; //numeric
    int total_events; //numeric
    double value; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_msot_events_t;

__attribute__((deprecated)) conversion_msot_events_t *conversion_msot_events_create(
    list_t *action_timestamps,
    char *ad_group_id,
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e attribution_model,
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e attribution_scope,
    double attribution_score,
    char *campaign_id,
    currency_t *currency,
    char *event_id,
    pinterest_rest_api_conversion_msot_events_EVENTNAME_e event_name,
    long event_timestamp,
    int total_event_touchpoints,
    int total_events,
    double value
);

void conversion_msot_events_free(conversion_msot_events_t *conversion_msot_events);

conversion_msot_events_t *conversion_msot_events_parseFromJSON(cJSON *conversion_msot_eventsJSON);

cJSON *conversion_msot_events_convertToJSON(conversion_msot_events_t *conversion_msot_events);

#endif /* _conversion_msot_events_H_ */

