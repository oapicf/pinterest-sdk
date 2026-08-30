/*
 * optimization_type.h
 *
 * Optimization type for ad group delivery estimates. Supported types vary by objective.
 */

#ifndef _optimization_type_H_
#define _optimization_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct optimization_type_t optimization_type_t;


// Enum  for optimization_type

typedef enum { pinterest_rest_api_optimization_type__NULL = 0, pinterest_rest_api_optimization_type__CLICKTHROUGH, pinterest_rest_api_optimization_type__IMPRESSION, pinterest_rest_api_optimization_type__WEB_CONVERSION, pinterest_rest_api_optimization_type__ROAS, pinterest_rest_api_optimization_type__OUTBOUND_CLICK } pinterest_rest_api_optimization_type__e;

char* optimization_type_optimization_type_ToString(pinterest_rest_api_optimization_type__e optimization_type);

pinterest_rest_api_optimization_type__e optimization_type_optimization_type_FromString(char* optimization_type);

cJSON *optimization_type_convertToJSON(pinterest_rest_api_optimization_type__e optimization_type);

pinterest_rest_api_optimization_type__e optimization_type_parseFromJSON(cJSON *optimization_typeJSON);

#endif /* _optimization_type_H_ */

