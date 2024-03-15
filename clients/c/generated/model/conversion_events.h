/*
 * conversion_events.h
 *
 * A list of events (one or more) encapsulated by a data object.
 */

#ifndef _conversion_events_H_
#define _conversion_events_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_t conversion_events_t;

#include "conversion_events_data_inner.h"



typedef struct conversion_events_t {
    list_t *data; //nonprimitive container

} conversion_events_t;

conversion_events_t *conversion_events_create(
    list_t *data
);

void conversion_events_free(conversion_events_t *conversion_events);

conversion_events_t *conversion_events_parseFromJSON(cJSON *conversion_eventsJSON);

cJSON *conversion_events_convertToJSON(conversion_events_t *conversion_events);

#endif /* _conversion_events_H_ */

