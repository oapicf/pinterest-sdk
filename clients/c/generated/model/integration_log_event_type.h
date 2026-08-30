/*
 * integration_log_event_type.h
 *
 * Log event type for integration applications.
 */

#ifndef _integration_log_event_type_H_
#define _integration_log_event_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_log_event_type_t integration_log_event_type_t;


// Enum  for integration_log_event_type

typedef enum { pinterest_rest_api_integration_log_event_type__NULL = 0, pinterest_rest_api_integration_log_event_type__APP, pinterest_rest_api_integration_log_event_type__API } pinterest_rest_api_integration_log_event_type__e;

char* integration_log_event_type_integration_log_event_type_ToString(pinterest_rest_api_integration_log_event_type__e integration_log_event_type);

pinterest_rest_api_integration_log_event_type__e integration_log_event_type_integration_log_event_type_FromString(char* integration_log_event_type);

cJSON *integration_log_event_type_convertToJSON(pinterest_rest_api_integration_log_event_type__e integration_log_event_type);

pinterest_rest_api_integration_log_event_type__e integration_log_event_type_parseFromJSON(cJSON *integration_log_event_typeJSON);

#endif /* _integration_log_event_type_H_ */

