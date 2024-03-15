/*
 * pin_analytics_metrics_response.h
 *
 * 
 */

#ifndef _pin_analytics_metrics_response_H_
#define _pin_analytics_metrics_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_analytics_metrics_response_t pin_analytics_metrics_response_t;

#include "pin_analytics_metrics_response_daily_metrics_inner.h"



typedef struct pin_analytics_metrics_response_t {
    list_t* lifetime_metrics; //map
    list_t *daily_metrics; //nonprimitive container
    list_t* summary_metrics; //map

} pin_analytics_metrics_response_t;

pin_analytics_metrics_response_t *pin_analytics_metrics_response_create(
    list_t* lifetime_metrics,
    list_t *daily_metrics,
    list_t* summary_metrics
);

void pin_analytics_metrics_response_free(pin_analytics_metrics_response_t *pin_analytics_metrics_response);

pin_analytics_metrics_response_t *pin_analytics_metrics_response_parseFromJSON(cJSON *pin_analytics_metrics_responseJSON);

cJSON *pin_analytics_metrics_response_convertToJSON(pin_analytics_metrics_response_t *pin_analytics_metrics_response);

#endif /* _pin_analytics_metrics_response_H_ */

