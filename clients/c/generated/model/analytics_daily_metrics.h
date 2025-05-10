/*
 * analytics_daily_metrics.h
 *
 * 
 */

#ifndef _analytics_daily_metrics_H_
#define _analytics_daily_metrics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct analytics_daily_metrics_t analytics_daily_metrics_t;

#include "data_status.h"



typedef struct analytics_daily_metrics_t {
    pinterest_rest_api_data_status__e data_status; //referenced enum
    char *date; // string
    list_t* metrics; //map

    int _library_owned; // Is the library responsible for freeing this object?
} analytics_daily_metrics_t;

__attribute__((deprecated)) analytics_daily_metrics_t *analytics_daily_metrics_create(
    pinterest_rest_api_data_status__e data_status,
    char *date,
    list_t* metrics
);

void analytics_daily_metrics_free(analytics_daily_metrics_t *analytics_daily_metrics);

analytics_daily_metrics_t *analytics_daily_metrics_parseFromJSON(cJSON *analytics_daily_metricsJSON);

cJSON *analytics_daily_metrics_convertToJSON(analytics_daily_metrics_t *analytics_daily_metrics);

#endif /* _analytics_daily_metrics_H_ */

