/*
 * campaigns_analytics_metrics.h
 *
 * 
 */

#ifndef _campaigns_analytics_metrics_H_
#define _campaigns_analytics_metrics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaigns_analytics_metrics_t campaigns_analytics_metrics_t;




typedef struct campaigns_analytics_metrics_t {
    char *campaign_id; // string
    char *date; //date

    int _library_owned; // Is the library responsible for freeing this object?
} campaigns_analytics_metrics_t;

__attribute__((deprecated)) campaigns_analytics_metrics_t *campaigns_analytics_metrics_create(
    char *campaign_id,
    char *date
);

void campaigns_analytics_metrics_free(campaigns_analytics_metrics_t *campaigns_analytics_metrics);

campaigns_analytics_metrics_t *campaigns_analytics_metrics_parseFromJSON(cJSON *campaigns_analytics_metricsJSON);

cJSON *campaigns_analytics_metrics_convertToJSON(campaigns_analytics_metrics_t *campaigns_analytics_metrics);

#endif /* _campaigns_analytics_metrics_H_ */

