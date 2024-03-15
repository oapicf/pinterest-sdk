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

// Enum  for ads_analytics_metrics_filter

typedef enum  { pinterest_rest_api_ads_analytics_metrics_filter__NULL = 0, pinterest_rest_api_ads_analytics_metrics_filter__SPEND_IN_DOLLAR, pinterest_rest_api_ads_analytics_metrics_filter__TOTAL_IMPRESSION } pinterest_rest_api_ads_analytics_metrics_filter__e;

char* ads_analytics_metrics_filter_field_ToString(pinterest_rest_api_ads_analytics_metrics_filter__e field);

pinterest_rest_api_ads_analytics_metrics_filter__e ads_analytics_metrics_filter_field_FromString(char* field);

// Enum  for ads_analytics_metrics_filter

typedef enum  { pinterest_rest_api_ads_analytics_metrics_filter__NULL = 0, pinterest_rest_api_ads_analytics_metrics_filter__LESS_THAN, pinterest_rest_api_ads_analytics_metrics_filter__GREATER_THAN } pinterest_rest_api_ads_analytics_metrics_filter__e;

char* ads_analytics_metrics_filter__operator_ToString(pinterest_rest_api_ads_analytics_metrics_filter__e _operator);

pinterest_rest_api_ads_analytics_metrics_filter__e ads_analytics_metrics_filter__operator_FromString(char* _operator);



typedef struct ads_analytics_metrics_filter_t {
    ads_analytics_filter_column_t *field; // custom
    ads_analytics_filter_operator_t *_operator; // custom
    list_t *values; //primitive container

} ads_analytics_metrics_filter_t;

ads_analytics_metrics_filter_t *ads_analytics_metrics_filter_create(
    ads_analytics_filter_column_t *field,
    ads_analytics_filter_operator_t *_operator,
    list_t *values
);

void ads_analytics_metrics_filter_free(ads_analytics_metrics_filter_t *ads_analytics_metrics_filter);

ads_analytics_metrics_filter_t *ads_analytics_metrics_filter_parseFromJSON(cJSON *ads_analytics_metrics_filterJSON);

cJSON *ads_analytics_metrics_filter_convertToJSON(ads_analytics_metrics_filter_t *ads_analytics_metrics_filter);

#endif /* _ads_analytics_metrics_filter_H_ */

