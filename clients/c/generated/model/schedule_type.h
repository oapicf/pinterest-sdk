/*
 * schedule_type.h
 *
 * The schedule type
 */

#ifndef _schedule_type_H_
#define _schedule_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_type_t schedule_type_t;


// Enum  for schedule_type

typedef enum { pinterest_rest_api_schedule_type__NULL = 0, pinterest_rest_api_schedule_type__CAMPAIGN_BUDGET_CHANGE, pinterest_rest_api_schedule_type__CAMPAIGN_BID_MULTIPLIERS } pinterest_rest_api_schedule_type__e;

char* schedule_type_schedule_type_ToString(pinterest_rest_api_schedule_type__e schedule_type);

pinterest_rest_api_schedule_type__e schedule_type_schedule_type_FromString(char* schedule_type);

cJSON *schedule_type_convertToJSON(pinterest_rest_api_schedule_type__e schedule_type);

pinterest_rest_api_schedule_type__e schedule_type_parseFromJSON(cJSON *schedule_typeJSON);

#endif /* _schedule_type_H_ */

