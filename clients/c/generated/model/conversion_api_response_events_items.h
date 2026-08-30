/*
 * conversion_api_response_events_items.h
 *
 * 
 */

#ifndef _conversion_api_response_events_items_H_
#define _conversion_api_response_events_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_api_response_events_items_t conversion_api_response_events_items_t;

#include "event_processing_status.h"



typedef struct conversion_api_response_events_items_t {
    char *error_message; // string
    event_processing_status_t *status; // custom
    char *warning_message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_api_response_events_items_t;

__attribute__((deprecated)) conversion_api_response_events_items_t *conversion_api_response_events_items_create(
    char *error_message,
    event_processing_status_t *status,
    char *warning_message
);

void conversion_api_response_events_items_free(conversion_api_response_events_items_t *conversion_api_response_events_items);

conversion_api_response_events_items_t *conversion_api_response_events_items_parseFromJSON(cJSON *conversion_api_response_events_itemsJSON);

cJSON *conversion_api_response_events_items_convertToJSON(conversion_api_response_events_items_t *conversion_api_response_events_items);

#endif /* _conversion_api_response_events_items_H_ */

