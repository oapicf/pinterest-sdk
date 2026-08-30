/*
 * conversion_events_create.h
 *
 * Conversion events.
 */

#ifndef _conversion_events_create_H_
#define _conversion_events_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_create_t conversion_events_create_t;

#include "conversion_events_data_items.h"



typedef struct conversion_events_create_t {
    list_t *data; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_events_create_t;

__attribute__((deprecated)) conversion_events_create_t *conversion_events_create_create(
    list_t *data
);

void conversion_events_create_free(conversion_events_create_t *conversion_events_create);

conversion_events_create_t *conversion_events_create_parseFromJSON(cJSON *conversion_events_createJSON);

cJSON *conversion_events_create_convertToJSON(conversion_events_create_t *conversion_events_create);

#endif /* _conversion_events_create_H_ */

