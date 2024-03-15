/*
 * ads_analytics_filter_column.h
 *
 * Reporting columns for sync reporting data filter
 */

#ifndef _ads_analytics_filter_column_H_
#define _ads_analytics_filter_column_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_analytics_filter_column_t ads_analytics_filter_column_t;


// Enum  for ads_analytics_filter_column

typedef enum { pinterest_rest_api_ads_analytics_filter_column__NULL = 0, pinterest_rest_api_ads_analytics_filter_column__SPEND_IN_DOLLAR, pinterest_rest_api_ads_analytics_filter_column__TOTAL_IMPRESSION } pinterest_rest_api_ads_analytics_filter_column__e;

char* ads_analytics_filter_column_ads_analytics_filter_column_ToString(pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_column);

pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_column_ads_analytics_filter_column_FromString(char* ads_analytics_filter_column);

//cJSON *ads_analytics_filter_column_ads_analytics_filter_column_convertToJSON(pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_column);

//pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_column_ads_analytics_filter_column_parseFromJSON(cJSON *ads_analytics_filter_columnJSON);

#endif /* _ads_analytics_filter_column_H_ */

