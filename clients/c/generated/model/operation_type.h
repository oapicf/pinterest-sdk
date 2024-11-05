/*
 * operation_type.h
 *
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */

#ifndef _operation_type_H_
#define _operation_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct operation_type_t operation_type_t;


// Enum  for operation_type

typedef enum { pinterest_rest_api_operation_type__NULL = 0, pinterest_rest_api_operation_type__SHARE, pinterest_rest_api_operation_type__REVOKE } pinterest_rest_api_operation_type__e;

char* operation_type_operation_type_ToString(pinterest_rest_api_operation_type__e operation_type);

pinterest_rest_api_operation_type__e operation_type_operation_type_FromString(char* operation_type);

//cJSON *operation_type_operation_type_convertToJSON(pinterest_rest_api_operation_type__e operation_type);

//pinterest_rest_api_operation_type__e operation_type_operation_type_parseFromJSON(cJSON *operation_typeJSON);

#endif /* _operation_type_H_ */

