/*
 * conversion_product_report_granularity.h
 *
 * Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
 */

#ifndef _conversion_product_report_granularity_H_
#define _conversion_product_report_granularity_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_product_report_granularity_t conversion_product_report_granularity_t;


// Enum  for conversion_product_report_granularity

typedef enum { pinterest_rest_api_conversion_product_report_granularity__NULL = 0, pinterest_rest_api_conversion_product_report_granularity__TOTAL, pinterest_rest_api_conversion_product_report_granularity__WEEK, pinterest_rest_api_conversion_product_report_granularity__MONTH } pinterest_rest_api_conversion_product_report_granularity__e;

char* conversion_product_report_granularity_conversion_product_report_granularity_ToString(pinterest_rest_api_conversion_product_report_granularity__e conversion_product_report_granularity);

pinterest_rest_api_conversion_product_report_granularity__e conversion_product_report_granularity_conversion_product_report_granularity_FromString(char* conversion_product_report_granularity);

cJSON *conversion_product_report_granularity_convertToJSON(pinterest_rest_api_conversion_product_report_granularity__e conversion_product_report_granularity);

pinterest_rest_api_conversion_product_report_granularity__e conversion_product_report_granularity_parseFromJSON(cJSON *conversion_product_report_granularityJSON);

#endif /* _conversion_product_report_granularity_H_ */

