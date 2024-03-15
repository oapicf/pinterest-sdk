/*
 * analytics_metrics_response.h
 *
 * 
 */

#ifndef _analytics_metrics_response_H_
#define _analytics_metrics_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct analytics_metrics_response_t analytics_metrics_response_t;

#include "analytics_daily_metrics.h"



typedef struct analytics_metrics_response_t {
    list_t* summary_metrics; //map
    list_t *daily_metrics; //nonprimitive container

} analytics_metrics_response_t;

analytics_metrics_response_t *analytics_metrics_response_create(
    list_t* summary_metrics,
    list_t *daily_metrics
);

void analytics_metrics_response_free(analytics_metrics_response_t *analytics_metrics_response);

analytics_metrics_response_t *analytics_metrics_response_parseFromJSON(cJSON *analytics_metrics_responseJSON);

cJSON *analytics_metrics_response_convertToJSON(analytics_metrics_response_t *analytics_metrics_response);

#endif /* _analytics_metrics_response_H_ */

