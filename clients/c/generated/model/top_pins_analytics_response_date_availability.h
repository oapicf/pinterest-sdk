/*
 * top_pins_analytics_response_date_availability.h
 *
 * 
 */

#ifndef _top_pins_analytics_response_date_availability_H_
#define _top_pins_analytics_response_date_availability_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct top_pins_analytics_response_date_availability_t top_pins_analytics_response_date_availability_t;




typedef struct top_pins_analytics_response_date_availability_t {
    double latest_available_timestamp; //numeric
    int is_realtime; //boolean

} top_pins_analytics_response_date_availability_t;

top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_create(
    double latest_available_timestamp,
    int is_realtime
);

void top_pins_analytics_response_date_availability_free(top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability);

top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability_parseFromJSON(cJSON *top_pins_analytics_response_date_availabilityJSON);

cJSON *top_pins_analytics_response_date_availability_convertToJSON(top_pins_analytics_response_date_availability_t *top_pins_analytics_response_date_availability);

#endif /* _top_pins_analytics_response_date_availability_H_ */

