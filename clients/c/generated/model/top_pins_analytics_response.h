/*
 * top_pins_analytics_response.h
 *
 * 
 */

#ifndef _top_pins_analytics_response_H_
#define _top_pins_analytics_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct top_pins_analytics_response_t top_pins_analytics_response_t;

#include "top_pins_analytics_response_date_availability.h"
#include "top_pins_analytics_response_pins_inner.h"

// Enum SORTBY for top_pins_analytics_response

typedef enum  { pinterest_rest_api_top_pins_analytics_response_SORTBY_NULL = 0, pinterest_rest_api_top_pins_analytics_response_SORTBY_ENGAGEMENT, pinterest_rest_api_top_pins_analytics_response_SORTBY_SAVE, pinterest_rest_api_top_pins_analytics_response_SORTBY_IMPRESSION, pinterest_rest_api_top_pins_analytics_response_SORTBY_OUTBOUND_CLICK, pinterest_rest_api_top_pins_analytics_response_SORTBY_PIN_CLICK } pinterest_rest_api_top_pins_analytics_response_SORTBY_e;

char* top_pins_analytics_response_sort_by_ToString(pinterest_rest_api_top_pins_analytics_response_SORTBY_e sort_by);

pinterest_rest_api_top_pins_analytics_response_SORTBY_e top_pins_analytics_response_sort_by_FromString(char* sort_by);



typedef struct top_pins_analytics_response_t {
    struct top_pins_analytics_response_date_availability_t *date_availability; //model
    list_t *pins; //nonprimitive container
    pinterest_rest_api_top_pins_analytics_response_SORTBY_e sort_by; //enum

} top_pins_analytics_response_t;

top_pins_analytics_response_t *top_pins_analytics_response_create(
    top_pins_analytics_response_date_availability_t *date_availability,
    list_t *pins,
    pinterest_rest_api_top_pins_analytics_response_SORTBY_e sort_by
);

void top_pins_analytics_response_free(top_pins_analytics_response_t *top_pins_analytics_response);

top_pins_analytics_response_t *top_pins_analytics_response_parseFromJSON(cJSON *top_pins_analytics_responseJSON);

cJSON *top_pins_analytics_response_convertToJSON(top_pins_analytics_response_t *top_pins_analytics_response);

#endif /* _top_pins_analytics_response_H_ */

