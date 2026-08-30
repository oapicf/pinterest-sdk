/*
 * advertiser_defined_events_create_request.h
 *
 * Request body for creating or updating advertiser defined events
 */

#ifndef _advertiser_defined_events_create_request_H_
#define _advertiser_defined_events_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advertiser_defined_events_create_request_t advertiser_defined_events_create_request_t;

#include "advertiser_defined_event_input.h"



typedef struct advertiser_defined_events_create_request_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} advertiser_defined_events_create_request_t;

__attribute__((deprecated)) advertiser_defined_events_create_request_t *advertiser_defined_events_create_request_create(
    list_t *items
);

void advertiser_defined_events_create_request_free(advertiser_defined_events_create_request_t *advertiser_defined_events_create_request);

advertiser_defined_events_create_request_t *advertiser_defined_events_create_request_parseFromJSON(cJSON *advertiser_defined_events_create_requestJSON);

cJSON *advertiser_defined_events_create_request_convertToJSON(advertiser_defined_events_create_request_t *advertiser_defined_events_create_request);

#endif /* _advertiser_defined_events_create_request_H_ */

