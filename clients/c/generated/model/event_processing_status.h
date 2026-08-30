/*
 * event_processing_status.h
 *
 * Status of a single event in the response.
 */

#ifndef _event_processing_status_H_
#define _event_processing_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct event_processing_status_t event_processing_status_t;


// Enum  for event_processing_status

typedef enum { pinterest_rest_api_event_processing_status__NULL = 0, pinterest_rest_api_event_processing_status__failed, pinterest_rest_api_event_processing_status__processed } pinterest_rest_api_event_processing_status__e;

char* event_processing_status_event_processing_status_ToString(pinterest_rest_api_event_processing_status__e event_processing_status);

pinterest_rest_api_event_processing_status__e event_processing_status_event_processing_status_FromString(char* event_processing_status);

cJSON *event_processing_status_convertToJSON(pinterest_rest_api_event_processing_status__e event_processing_status);

pinterest_rest_api_event_processing_status__e event_processing_status_parseFromJSON(cJSON *event_processing_statusJSON);

#endif /* _event_processing_status_H_ */

