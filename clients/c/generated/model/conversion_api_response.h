/*
 * conversion_api_response.h
 *
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 */

#ifndef _conversion_api_response_H_
#define _conversion_api_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_api_response_t conversion_api_response_t;

#include "conversion_api_response_events_inner.h"



typedef struct conversion_api_response_t {
    int num_events_received; //numeric
    int num_events_processed; //numeric
    list_t *events; //nonprimitive container

} conversion_api_response_t;

conversion_api_response_t *conversion_api_response_create(
    int num_events_received,
    int num_events_processed,
    list_t *events
);

void conversion_api_response_free(conversion_api_response_t *conversion_api_response);

conversion_api_response_t *conversion_api_response_parseFromJSON(cJSON *conversion_api_responseJSON);

cJSON *conversion_api_response_convertToJSON(conversion_api_response_t *conversion_api_response);

#endif /* _conversion_api_response_H_ */

