/*
 * custom_conversion_event_metrics.h
 *
 * 
 */

#ifndef _custom_conversion_event_metrics_H_
#define _custom_conversion_event_metrics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct custom_conversion_event_metrics_t custom_conversion_event_metrics_t;

#include "ade_column_type.h"



typedef struct custom_conversion_event_metrics_t {
    pinterest_rest_api_ade_column_type__e custom_event_metrics_type; //referenced enum
    char *custom_event_name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} custom_conversion_event_metrics_t;

__attribute__((deprecated)) custom_conversion_event_metrics_t *custom_conversion_event_metrics_create(
    pinterest_rest_api_ade_column_type__e custom_event_metrics_type,
    char *custom_event_name
);

void custom_conversion_event_metrics_free(custom_conversion_event_metrics_t *custom_conversion_event_metrics);

custom_conversion_event_metrics_t *custom_conversion_event_metrics_parseFromJSON(cJSON *custom_conversion_event_metricsJSON);

cJSON *custom_conversion_event_metrics_convertToJSON(custom_conversion_event_metrics_t *custom_conversion_event_metrics);

#endif /* _custom_conversion_event_metrics_H_ */

