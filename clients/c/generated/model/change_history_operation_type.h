/*
 * change_history_operation_type.h
 *
 * 
 */

#ifndef _change_history_operation_type_H_
#define _change_history_operation_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct change_history_operation_type_t change_history_operation_type_t;


// Enum  for change_history_operation_type

typedef enum { pinterest_rest_api_change_history_operation_type__NULL = 0, pinterest_rest_api_change_history_operation_type__CREATE, pinterest_rest_api_change_history_operation_type__UPDATE, pinterest_rest_api_change_history_operation_type___DELETE } pinterest_rest_api_change_history_operation_type__e;

char* change_history_operation_type_change_history_operation_type_ToString(pinterest_rest_api_change_history_operation_type__e change_history_operation_type);

pinterest_rest_api_change_history_operation_type__e change_history_operation_type_change_history_operation_type_FromString(char* change_history_operation_type);

cJSON *change_history_operation_type_convertToJSON(pinterest_rest_api_change_history_operation_type__e change_history_operation_type);

pinterest_rest_api_change_history_operation_type__e change_history_operation_type_parseFromJSON(cJSON *change_history_operation_typeJSON);

#endif /* _change_history_operation_type_H_ */

