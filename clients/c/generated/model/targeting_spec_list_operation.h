/*
 * targeting_spec_list_operation.h
 *
 * 
 */

#ifndef _targeting_spec_list_operation_H_
#define _targeting_spec_list_operation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_list_operation_t targeting_spec_list_operation_t;


// Enum  for targeting_spec_list_operation

typedef enum { pinterest_rest_api_targeting_spec_list_operation__NULL = 0, pinterest_rest_api_targeting_spec_list_operation__SET, pinterest_rest_api_targeting_spec_list_operation__ADD, pinterest_rest_api_targeting_spec_list_operation___REMOVE } pinterest_rest_api_targeting_spec_list_operation__e;

char* targeting_spec_list_operation_targeting_spec_list_operation_ToString(pinterest_rest_api_targeting_spec_list_operation__e targeting_spec_list_operation);

pinterest_rest_api_targeting_spec_list_operation__e targeting_spec_list_operation_targeting_spec_list_operation_FromString(char* targeting_spec_list_operation);

cJSON *targeting_spec_list_operation_convertToJSON(pinterest_rest_api_targeting_spec_list_operation__e targeting_spec_list_operation);

pinterest_rest_api_targeting_spec_list_operation__e targeting_spec_list_operation_parseFromJSON(cJSON *targeting_spec_list_operationJSON);

#endif /* _targeting_spec_list_operation_H_ */

