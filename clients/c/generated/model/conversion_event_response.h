/*
 * conversion_event_response.h
 *
 * 
 */

#ifndef _conversion_event_response_H_
#define _conversion_event_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_event_response_t conversion_event_response_t;

#include "conversion_tag_type.h"



typedef struct conversion_event_response_t {
    pinterest_rest_api_conversion_tag_type__e conversion_event; //referenced enum
    char *conversion_tag_id; // string
    char *ad_account_id; // string
    int created_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_event_response_t;

__attribute__((deprecated)) conversion_event_response_t *conversion_event_response_create(
    pinterest_rest_api_conversion_tag_type__e conversion_event,
    char *conversion_tag_id,
    char *ad_account_id,
    int created_time
);

void conversion_event_response_free(conversion_event_response_t *conversion_event_response);

conversion_event_response_t *conversion_event_response_parseFromJSON(cJSON *conversion_event_responseJSON);

cJSON *conversion_event_response_convertToJSON(conversion_event_response_t *conversion_event_response);

#endif /* _conversion_event_response_H_ */

