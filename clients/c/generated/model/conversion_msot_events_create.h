/*
 * conversion_msot_events_create.h
 *
 * Resource create operation model.
 */

#ifndef _conversion_msot_events_create_H_
#define _conversion_msot_events_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_msot_events_create_t conversion_msot_events_create_t;

#include "attribution_model.h"
#include "attribution_scope.h"
#include "currency.h"
#include "msot_event_name.h"



typedef struct conversion_msot_events_create_t {
    list_t *action_timestamps; //primitive container
    char *ad_group_id; // string
    attribution_model_t *attribution_model; // custom
    attribution_scope_t *attribution_scope; // custom
    double *attribution_score; //numeric
    char *campaign_id; // string
    char *click_window; // string
    currency_t *currency; // custom
    char *event_id; // string
    msot_event_name_t *event_name; // custom
    long *event_timestamp; //numeric
    int *total_event_touchpoints; //numeric
    int *total_events; //numeric
    double *total_events_fractional; //numeric
    double *value; //numeric
    char *view_window; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_msot_events_create_t;

__attribute__((deprecated)) conversion_msot_events_create_t *conversion_msot_events_create_create(
    list_t *action_timestamps,
    char *ad_group_id,
    attribution_model_t *attribution_model,
    attribution_scope_t *attribution_scope,
    double *attribution_score,
    char *campaign_id,
    char *click_window,
    currency_t *currency,
    char *event_id,
    msot_event_name_t *event_name,
    long *event_timestamp,
    int *total_event_touchpoints,
    int *total_events,
    double *total_events_fractional,
    double *value,
    char *view_window
);

void conversion_msot_events_create_free(conversion_msot_events_create_t *conversion_msot_events_create);

conversion_msot_events_create_t *conversion_msot_events_create_parseFromJSON(cJSON *conversion_msot_events_createJSON);

cJSON *conversion_msot_events_create_convertToJSON(conversion_msot_events_create_t *conversion_msot_events_create);

#endif /* _conversion_msot_events_create_H_ */

