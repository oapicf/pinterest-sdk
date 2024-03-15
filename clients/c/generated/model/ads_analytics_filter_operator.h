/*
 * ads_analytics_filter_operator.h
 *
 * Filter operator for sync reporting
 */

#ifndef _ads_analytics_filter_operator_H_
#define _ads_analytics_filter_operator_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_analytics_filter_operator_t ads_analytics_filter_operator_t;


// Enum  for ads_analytics_filter_operator

typedef enum { pinterest_rest_api_ads_analytics_filter_operator__NULL = 0, pinterest_rest_api_ads_analytics_filter_operator__LESS_THAN, pinterest_rest_api_ads_analytics_filter_operator__GREATER_THAN } pinterest_rest_api_ads_analytics_filter_operator__e;

char* ads_analytics_filter_operator_ads_analytics_filter_operator_ToString(pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operator);

pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operator_ads_analytics_filter_operator_FromString(char* ads_analytics_filter_operator);

//cJSON *ads_analytics_filter_operator_ads_analytics_filter_operator_convertToJSON(pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operator);

//pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operator_ads_analytics_filter_operator_parseFromJSON(cJSON *ads_analytics_filter_operatorJSON);

#endif /* _ads_analytics_filter_operator_H_ */

