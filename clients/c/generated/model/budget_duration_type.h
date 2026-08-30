/*
 * budget_duration_type.h
 *
 * Budget duration type for delivery estimates.
 */

#ifndef _budget_duration_type_H_
#define _budget_duration_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct budget_duration_type_t budget_duration_type_t;


// Enum  for budget_duration_type

typedef enum { pinterest_rest_api_budget_duration_type__NULL = 0, pinterest_rest_api_budget_duration_type__FIXED_DAILY, pinterest_rest_api_budget_duration_type__FLEXIBLE_DAILY, pinterest_rest_api_budget_duration_type__LIFETIME } pinterest_rest_api_budget_duration_type__e;

char* budget_duration_type_budget_duration_type_ToString(pinterest_rest_api_budget_duration_type__e budget_duration_type);

pinterest_rest_api_budget_duration_type__e budget_duration_type_budget_duration_type_FromString(char* budget_duration_type);

cJSON *budget_duration_type_convertToJSON(pinterest_rest_api_budget_duration_type__e budget_duration_type);

pinterest_rest_api_budget_duration_type__e budget_duration_type_parseFromJSON(cJSON *budget_duration_typeJSON);

#endif /* _budget_duration_type_H_ */

