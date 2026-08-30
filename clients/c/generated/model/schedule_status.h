/*
 * schedule_status.h
 *
 * Schedule status
 */

#ifndef _schedule_status_H_
#define _schedule_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_status_t schedule_status_t;


// Enum  for schedule_status

typedef enum { pinterest_rest_api_schedule_status__NULL = 0, pinterest_rest_api_schedule_status__DRAFT, pinterest_rest_api_schedule_status__CREATED, pinterest_rest_api_schedule_status__SCHEDULED, pinterest_rest_api_schedule_status__ACTIVE, pinterest_rest_api_schedule_status__COMPLETED, pinterest_rest_api_schedule_status__FAILED, pinterest_rest_api_schedule_status__CANCELED } pinterest_rest_api_schedule_status__e;

char* schedule_status_schedule_status_ToString(pinterest_rest_api_schedule_status__e schedule_status);

pinterest_rest_api_schedule_status__e schedule_status_schedule_status_FromString(char* schedule_status);

cJSON *schedule_status_convertToJSON(pinterest_rest_api_schedule_status__e schedule_status);

pinterest_rest_api_schedule_status__e schedule_status_parseFromJSON(cJSON *schedule_statusJSON);

#endif /* _schedule_status_H_ */

