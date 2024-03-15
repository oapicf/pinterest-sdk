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

// Enum  for conversion_event_response

typedef enum  { pinterest_rest_api_conversion_event_response__NULL = 0, pinterest_rest_api_conversion_event_response__PAGE_LOAD, pinterest_rest_api_conversion_event_response__UNKNOWN, pinterest_rest_api_conversion_event_response__INITIALIZED, pinterest_rest_api_conversion_event_response__PAGE_VISIT, pinterest_rest_api_conversion_event_response__SIGNUP, pinterest_rest_api_conversion_event_response__CHECKOUT, pinterest_rest_api_conversion_event_response__CUSTOM, pinterest_rest_api_conversion_event_response__VIEW_CATEGORY, pinterest_rest_api_conversion_event_response__SEARCH, pinterest_rest_api_conversion_event_response__ADD_TO_CART, pinterest_rest_api_conversion_event_response__WATCH_VIDEO, pinterest_rest_api_conversion_event_response__LEAD, pinterest_rest_api_conversion_event_response__APP_INSTALL, pinterest_rest_api_conversion_event_response__WEB_SESSION, pinterest_rest_api_conversion_event_response__EXTERNAL_MEASUREMENT } pinterest_rest_api_conversion_event_response__e;

char* conversion_event_response_conversion_event_ToString(pinterest_rest_api_conversion_event_response__e conversion_event);

pinterest_rest_api_conversion_event_response__e conversion_event_response_conversion_event_FromString(char* conversion_event);



typedef struct conversion_event_response_t {
    conversion_tag_type_t *conversion_event; // custom
    char *conversion_tag_id; // string
    char *ad_account_id; // string
    int created_time; //numeric

} conversion_event_response_t;

conversion_event_response_t *conversion_event_response_create(
    conversion_tag_type_t *conversion_event,
    char *conversion_tag_id,
    char *ad_account_id,
    int created_time
);

void conversion_event_response_free(conversion_event_response_t *conversion_event_response);

conversion_event_response_t *conversion_event_response_parseFromJSON(cJSON *conversion_event_responseJSON);

cJSON *conversion_event_response_convertToJSON(conversion_event_response_t *conversion_event_response);

#endif /* _conversion_event_response_H_ */

