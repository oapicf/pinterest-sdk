/*
 * ad_groups_analytics_metrics.h
 *
 * 
 */

#ifndef _ad_groups_analytics_metrics_H_
#define _ad_groups_analytics_metrics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_groups_analytics_metrics_t ad_groups_analytics_metrics_t;




typedef struct ad_groups_analytics_metrics_t {
    char *ad_group_id; // string
    char *date; //date

    int _library_owned; // Is the library responsible for freeing this object?
} ad_groups_analytics_metrics_t;

__attribute__((deprecated)) ad_groups_analytics_metrics_t *ad_groups_analytics_metrics_create(
    char *ad_group_id,
    char *date
);

void ad_groups_analytics_metrics_free(ad_groups_analytics_metrics_t *ad_groups_analytics_metrics);

ad_groups_analytics_metrics_t *ad_groups_analytics_metrics_parseFromJSON(cJSON *ad_groups_analytics_metricsJSON);

cJSON *ad_groups_analytics_metrics_convertToJSON(ad_groups_analytics_metrics_t *ad_groups_analytics_metrics);

#endif /* _ad_groups_analytics_metrics_H_ */

