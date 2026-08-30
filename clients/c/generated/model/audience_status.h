/*
 * audience_status.h
 *
 * Audience processing status
 */

#ifndef _audience_status_H_
#define _audience_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_status_t audience_status_t;


// Enum  for audience_status

typedef enum { pinterest_rest_api_audience_status__NULL = 0, pinterest_rest_api_audience_status__INITIALIZING, pinterest_rest_api_audience_status__READY, pinterest_rest_api_audience_status__TOO_SMALL, pinterest_rest_api_audience_status__ELIGIBLE, pinterest_rest_api_audience_status__PERSONAS_INELIGIBLE_SIZE, pinterest_rest_api_audience_status__PERSONAS_INITIALIZING } pinterest_rest_api_audience_status__e;

char* audience_status_audience_status_ToString(pinterest_rest_api_audience_status__e audience_status);

pinterest_rest_api_audience_status__e audience_status_audience_status_FromString(char* audience_status);

cJSON *audience_status_convertToJSON(pinterest_rest_api_audience_status__e audience_status);

pinterest_rest_api_audience_status__e audience_status_parseFromJSON(cJSON *audience_statusJSON);

#endif /* _audience_status_H_ */

