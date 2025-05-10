/*
 * ads_analytics_metrics_filter.h
 *
 * 
 */

#ifndef _ads_analytics_metrics_filter_H_
#define _ads_analytics_metrics_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_analytics_metrics_filter_t ads_analytics_metrics_filter_t;

#include "ads_analytics_filter_column.h"
#include "ads_analytics_filter_operator.h"



typedef struct ads_analytics_metrics_filter_t {
    pinterest_rest_api_ads_analytics_filter_column__e field; //referenced enum
    pinterest_rest_api_ads_analytics_filter_operator__e _operator; //referenced enum
    list_t *values; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ads_analytics_metrics_filter_t;

__attribute__((deprecated)) ads_analytics_metrics_filter_t *ads_analytics_metrics_filter_create(
    pinterest_rest_api_ads_analytics_filter_column__e field,
    pinterest_rest_api_ads_analytics_filter_operator__e _operator,
    list_t *values
);

void ads_analytics_metrics_filter_free(ads_analytics_metrics_filter_t *ads_analytics_metrics_filter);

ads_analytics_metrics_filter_t *ads_analytics_metrics_filter_parseFromJSON(cJSON *ads_analytics_metrics_filterJSON);

cJSON *ads_analytics_metrics_filter_convertToJSON(ads_analytics_metrics_filter_t *ads_analytics_metrics_filter);

#endif /* _ads_analytics_metrics_filter_H_ */

