/*
 * integration_log_level.h
 *
 * Log level type for integration applications.
 */

#ifndef _integration_log_level_H_
#define _integration_log_level_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_log_level_t integration_log_level_t;


// Enum  for integration_log_level

typedef enum { pinterest_rest_api_integration_log_level__NULL = 0, pinterest_rest_api_integration_log_level__INFO, pinterest_rest_api_integration_log_level__WARN, pinterest_rest_api_integration_log_level__ERROR } pinterest_rest_api_integration_log_level__e;

char* integration_log_level_integration_log_level_ToString(pinterest_rest_api_integration_log_level__e integration_log_level);

pinterest_rest_api_integration_log_level__e integration_log_level_integration_log_level_FromString(char* integration_log_level);

cJSON *integration_log_level_convertToJSON(pinterest_rest_api_integration_log_level__e integration_log_level);

pinterest_rest_api_integration_log_level__e integration_log_level_parseFromJSON(cJSON *integration_log_levelJSON);

#endif /* _integration_log_level_H_ */

