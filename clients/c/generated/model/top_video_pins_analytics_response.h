/*
 * top_video_pins_analytics_response.h
 *
 * 
 */

#ifndef _top_video_pins_analytics_response_H_
#define _top_video_pins_analytics_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct top_video_pins_analytics_response_t top_video_pins_analytics_response_t;

#include "top_video_pins_analytics_response_date_availability.h"
#include "top_video_pins_analytics_response_pins_items.h"
#include "top_video_pins_sort_by.h"



typedef struct top_video_pins_analytics_response_t {
    struct top_video_pins_analytics_response_date_availability_t *date_availability; //model
    list_t *pins; //nonprimitive container
    pinterest_rest_api_top_video_pins_sort_by__e sort_by; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} top_video_pins_analytics_response_t;

__attribute__((deprecated)) top_video_pins_analytics_response_t *top_video_pins_analytics_response_create(
    top_video_pins_analytics_response_date_availability_t *date_availability,
    list_t *pins,
    pinterest_rest_api_top_video_pins_sort_by__e sort_by
);

void top_video_pins_analytics_response_free(top_video_pins_analytics_response_t *top_video_pins_analytics_response);

top_video_pins_analytics_response_t *top_video_pins_analytics_response_parseFromJSON(cJSON *top_video_pins_analytics_responseJSON);

cJSON *top_video_pins_analytics_response_convertToJSON(top_video_pins_analytics_response_t *top_video_pins_analytics_response);

#endif /* _top_video_pins_analytics_response_H_ */

