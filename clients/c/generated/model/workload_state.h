/*
 * workload_state.h
 *
 * Workload processing state
 */

#ifndef _workload_state_H_
#define _workload_state_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct workload_state_t workload_state_t;


// Enum  for workload_state

typedef enum { pinterest_rest_api_workload_state__NULL = 0, pinterest_rest_api_workload_state__NOT_STARTED, pinterest_rest_api_workload_state__RUNNING, pinterest_rest_api_workload_state__PAUSED, pinterest_rest_api_workload_state__SUCCEEDED, pinterest_rest_api_workload_state__FAILED } pinterest_rest_api_workload_state__e;

char* workload_state_workload_state_ToString(pinterest_rest_api_workload_state__e workload_state);

pinterest_rest_api_workload_state__e workload_state_workload_state_FromString(char* workload_state);

cJSON *workload_state_convertToJSON(pinterest_rest_api_workload_state__e workload_state);

pinterest_rest_api_workload_state__e workload_state_parseFromJSON(cJSON *workload_stateJSON);

#endif /* _workload_state_H_ */

