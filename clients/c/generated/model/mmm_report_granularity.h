/*
 * mmm_report_granularity.h
 *
 * 
 */

#ifndef _mmm_report_granularity_H_
#define _mmm_report_granularity_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct mmm_report_granularity_t mmm_report_granularity_t;


// Enum  for mmm_report_granularity

typedef enum { pinterest_rest_api_mmm_report_granularity__NULL = 0, pinterest_rest_api_mmm_report_granularity__DAY, pinterest_rest_api_mmm_report_granularity__WEEK } pinterest_rest_api_mmm_report_granularity__e;

char* mmm_report_granularity_mmm_report_granularity_ToString(pinterest_rest_api_mmm_report_granularity__e mmm_report_granularity);

pinterest_rest_api_mmm_report_granularity__e mmm_report_granularity_mmm_report_granularity_FromString(char* mmm_report_granularity);

cJSON *mmm_report_granularity_convertToJSON(pinterest_rest_api_mmm_report_granularity__e mmm_report_granularity);

pinterest_rest_api_mmm_report_granularity__e mmm_report_granularity_parseFromJSON(cJSON *mmm_report_granularityJSON);

#endif /* _mmm_report_granularity_H_ */

