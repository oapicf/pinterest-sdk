/*
 * reporting_time_zone.h
 *
 * Specify the timezone to be applied for the reporting.
 */

#ifndef _reporting_time_zone_H_
#define _reporting_time_zone_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct reporting_time_zone_t reporting_time_zone_t;


// Enum  for reporting_time_zone

typedef enum { pinterest_rest_api_reporting_time_zone__NULL = 0, pinterest_rest_api_reporting_time_zone__PINTEREST_TIME_ZONE, pinterest_rest_api_reporting_time_zone__AD_ACCOUNT_TIME_ZONE } pinterest_rest_api_reporting_time_zone__e;

char* reporting_time_zone_reporting_time_zone_ToString(pinterest_rest_api_reporting_time_zone__e reporting_time_zone);

pinterest_rest_api_reporting_time_zone__e reporting_time_zone_reporting_time_zone_FromString(char* reporting_time_zone);

cJSON *reporting_time_zone_convertToJSON(pinterest_rest_api_reporting_time_zone__e reporting_time_zone);

pinterest_rest_api_reporting_time_zone__e reporting_time_zone_parseFromJSON(cJSON *reporting_time_zoneJSON);

#endif /* _reporting_time_zone_H_ */

