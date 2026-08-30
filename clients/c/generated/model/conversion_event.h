/*
 * conversion_event.h
 *
 * 
 */

#ifndef _conversion_event_H_
#define _conversion_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_event_t conversion_event_t;


// Enum  for conversion_event

typedef enum { pinterest_rest_api_conversion_event__NULL = 0, pinterest_rest_api_conversion_event__PAGE_VISIT, pinterest_rest_api_conversion_event__SIGNUP, pinterest_rest_api_conversion_event__CHECKOUT, pinterest_rest_api_conversion_event__CUSTOM, pinterest_rest_api_conversion_event__VIEW_CATEGORY, pinterest_rest_api_conversion_event__SEARCH, pinterest_rest_api_conversion_event__ADD_TO_CART, pinterest_rest_api_conversion_event__WATCH_VIDEO, pinterest_rest_api_conversion_event__LEAD, pinterest_rest_api_conversion_event__APP_INSTALL } pinterest_rest_api_conversion_event__e;

char* conversion_event_conversion_event_ToString(pinterest_rest_api_conversion_event__e conversion_event);

pinterest_rest_api_conversion_event__e conversion_event_conversion_event_FromString(char* conversion_event);

cJSON *conversion_event_convertToJSON(pinterest_rest_api_conversion_event__e conversion_event);

pinterest_rest_api_conversion_event__e conversion_event_parseFromJSON(cJSON *conversion_eventJSON);

#endif /* _conversion_event_H_ */

