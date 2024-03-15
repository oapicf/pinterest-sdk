/*
 * conversion_api_response_events_inner.h
 *
 * 
 */

#ifndef _conversion_api_response_events_inner_H_
#define _conversion_api_response_events_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_api_response_events_inner_t conversion_api_response_events_inner_t;


// Enum STATUS for conversion_api_response_events_inner

typedef enum  { pinterest_rest_api_conversion_api_response_events_inner_STATUS_NULL = 0, pinterest_rest_api_conversion_api_response_events_inner_STATUS_failed, pinterest_rest_api_conversion_api_response_events_inner_STATUS_processed } pinterest_rest_api_conversion_api_response_events_inner_STATUS_e;

char* conversion_api_response_events_inner_status_ToString(pinterest_rest_api_conversion_api_response_events_inner_STATUS_e status);

pinterest_rest_api_conversion_api_response_events_inner_STATUS_e conversion_api_response_events_inner_status_FromString(char* status);



typedef struct conversion_api_response_events_inner_t {
    pinterest_rest_api_conversion_api_response_events_inner_STATUS_e status; //enum
    char *error_message; // string
    char *warning_message; // string

} conversion_api_response_events_inner_t;

conversion_api_response_events_inner_t *conversion_api_response_events_inner_create(
    pinterest_rest_api_conversion_api_response_events_inner_STATUS_e status,
    char *error_message,
    char *warning_message
);

void conversion_api_response_events_inner_free(conversion_api_response_events_inner_t *conversion_api_response_events_inner);

conversion_api_response_events_inner_t *conversion_api_response_events_inner_parseFromJSON(cJSON *conversion_api_response_events_innerJSON);

cJSON *conversion_api_response_events_inner_convertToJSON(conversion_api_response_events_inner_t *conversion_api_response_events_inner);

#endif /* _conversion_api_response_events_inner_H_ */

