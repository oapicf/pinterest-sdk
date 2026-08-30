/*
 * advertiser_defined_events_create_200_response.h
 *
 * 
 */

#ifndef _advertiser_defined_events_create_200_response_H_
#define _advertiser_defined_events_create_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advertiser_defined_events_create_200_response_t advertiser_defined_events_create_200_response_t;

#include "advertiser_defined_event_processing_record.h"



typedef struct advertiser_defined_events_create_200_response_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} advertiser_defined_events_create_200_response_t;

__attribute__((deprecated)) advertiser_defined_events_create_200_response_t *advertiser_defined_events_create_200_response_create(
    list_t *items
);

void advertiser_defined_events_create_200_response_free(advertiser_defined_events_create_200_response_t *advertiser_defined_events_create_200_response);

advertiser_defined_events_create_200_response_t *advertiser_defined_events_create_200_response_parseFromJSON(cJSON *advertiser_defined_events_create_200_responseJSON);

cJSON *advertiser_defined_events_create_200_response_convertToJSON(advertiser_defined_events_create_200_response_t *advertiser_defined_events_create_200_response);

#endif /* _advertiser_defined_events_create_200_response_H_ */

