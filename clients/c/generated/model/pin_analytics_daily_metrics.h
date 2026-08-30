/*
 * pin_analytics_daily_metrics.h
 *
 * 
 */

#ifndef _pin_analytics_daily_metrics_H_
#define _pin_analytics_daily_metrics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_analytics_daily_metrics_t pin_analytics_daily_metrics_t;

#include "data_status.h"



typedef struct pin_analytics_daily_metrics_t {
    pinterest_rest_api_data_status__e data_status; //referenced enum
    char *date; // string
    list_t* metrics; //map

    int _library_owned; // Is the library responsible for freeing this object?
} pin_analytics_daily_metrics_t;

__attribute__((deprecated)) pin_analytics_daily_metrics_t *pin_analytics_daily_metrics_create(
    pinterest_rest_api_data_status__e data_status,
    char *date,
    list_t* metrics
);

void pin_analytics_daily_metrics_free(pin_analytics_daily_metrics_t *pin_analytics_daily_metrics);

pin_analytics_daily_metrics_t *pin_analytics_daily_metrics_parseFromJSON(cJSON *pin_analytics_daily_metricsJSON);

cJSON *pin_analytics_daily_metrics_convertToJSON(pin_analytics_daily_metrics_t *pin_analytics_daily_metrics);

#endif /* _pin_analytics_daily_metrics_H_ */

