/*
 * top_video_pins_analytics_response_date_availability.h
 *
 * 
 */

#ifndef _top_video_pins_analytics_response_date_availability_H_
#define _top_video_pins_analytics_response_date_availability_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct top_video_pins_analytics_response_date_availability_t top_video_pins_analytics_response_date_availability_t;




typedef struct top_video_pins_analytics_response_date_availability_t {
    int *is_realtime; //boolean
    double *latest_available_timestamp; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} top_video_pins_analytics_response_date_availability_t;

__attribute__((deprecated)) top_video_pins_analytics_response_date_availability_t *top_video_pins_analytics_response_date_availability_create(
    int *is_realtime,
    double *latest_available_timestamp
);

void top_video_pins_analytics_response_date_availability_free(top_video_pins_analytics_response_date_availability_t *top_video_pins_analytics_response_date_availability);

top_video_pins_analytics_response_date_availability_t *top_video_pins_analytics_response_date_availability_parseFromJSON(cJSON *top_video_pins_analytics_response_date_availabilityJSON);

cJSON *top_video_pins_analytics_response_date_availability_convertToJSON(top_video_pins_analytics_response_date_availability_t *top_video_pins_analytics_response_date_availability);

#endif /* _top_video_pins_analytics_response_date_availability_H_ */

