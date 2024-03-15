/*
 * granularity.h
 *
 * Granularity
 */

#ifndef _granularity_H_
#define _granularity_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct granularity_t granularity_t;


// Enum  for granularity

typedef enum { pinterest_rest_api_granularity__NULL = 0, pinterest_rest_api_granularity__TOTAL, pinterest_rest_api_granularity__DAY, pinterest_rest_api_granularity__HOUR, pinterest_rest_api_granularity__WEEK, pinterest_rest_api_granularity__MONTH } pinterest_rest_api_granularity__e;

char* granularity_granularity_ToString(pinterest_rest_api_granularity__e granularity);

pinterest_rest_api_granularity__e granularity_granularity_FromString(char* granularity);

//cJSON *granularity_granularity_convertToJSON(pinterest_rest_api_granularity__e granularity);

//pinterest_rest_api_granularity__e granularity_granularity_parseFromJSON(cJSON *granularityJSON);

#endif /* _granularity_H_ */

