/*
 * tie_breaker_type.h
 *
 * Quiz ad tie breaker type, default is RANDOM
 */

#ifndef _tie_breaker_type_H_
#define _tie_breaker_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct tie_breaker_type_t tie_breaker_type_t;


// Enum  for tie_breaker_type

typedef enum { pinterest_rest_api_tie_breaker_type__NULL = 0, pinterest_rest_api_tie_breaker_type__RANDOM, pinterest_rest_api_tie_breaker_type__CUSTOM } pinterest_rest_api_tie_breaker_type__e;

char* tie_breaker_type_tie_breaker_type_ToString(pinterest_rest_api_tie_breaker_type__e tie_breaker_type);

pinterest_rest_api_tie_breaker_type__e tie_breaker_type_tie_breaker_type_FromString(char* tie_breaker_type);

cJSON *tie_breaker_type_convertToJSON(pinterest_rest_api_tie_breaker_type__e tie_breaker_type);

pinterest_rest_api_tie_breaker_type__e tie_breaker_type_parseFromJSON(cJSON *tie_breaker_typeJSON);

#endif /* _tie_breaker_type_H_ */

