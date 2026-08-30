/*
 * schedule_action.h
 *
 * The schedule action
 */

#ifndef _schedule_action_H_
#define _schedule_action_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_action_t schedule_action_t;


// Enum  for schedule_action

typedef enum { pinterest_rest_api_schedule_action__NULL = 0, pinterest_rest_api_schedule_action__INCREASE_BY_VALUE, pinterest_rest_api_schedule_action__INCREASE_BY_PERCENT } pinterest_rest_api_schedule_action__e;

char* schedule_action_schedule_action_ToString(pinterest_rest_api_schedule_action__e schedule_action);

pinterest_rest_api_schedule_action__e schedule_action_schedule_action_FromString(char* schedule_action);

cJSON *schedule_action_convertToJSON(pinterest_rest_api_schedule_action__e schedule_action);

pinterest_rest_api_schedule_action__e schedule_action_parseFromJSON(cJSON *schedule_actionJSON);

#endif /* _schedule_action_H_ */

