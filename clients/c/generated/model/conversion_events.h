/*
 * conversion_events.h
 *
 * Conversion events.
 */

#ifndef _conversion_events_H_
#define _conversion_events_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_t conversion_events_t;

#include "conversion_api_response_events_items.h"



typedef struct conversion_events_t {
    list_t *events; //nonprimitive container
    int *num_events_processed; //numeric
    int *num_events_received; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_events_t;

__attribute__((deprecated)) conversion_events_t *conversion_events_create(
    list_t *events,
    int *num_events_processed,
    int *num_events_received
);

void conversion_events_free(conversion_events_t *conversion_events);

conversion_events_t *conversion_events_parseFromJSON(cJSON *conversion_eventsJSON);

cJSON *conversion_events_convertToJSON(conversion_events_t *conversion_events);

#endif /* _conversion_events_H_ */

