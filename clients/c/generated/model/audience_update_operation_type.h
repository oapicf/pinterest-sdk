/*
 * audience_update_operation_type.h
 *
 * Audience operation type (update or remove).
 */

#ifndef _audience_update_operation_type_H_
#define _audience_update_operation_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_update_operation_type_t audience_update_operation_type_t;


// Enum  for audience_update_operation_type

typedef enum { pinterest_rest_api_audience_update_operation_type__NULL = 0, pinterest_rest_api_audience_update_operation_type__UPDATE, pinterest_rest_api_audience_update_operation_type___REMOVE } pinterest_rest_api_audience_update_operation_type__e;

char* audience_update_operation_type_audience_update_operation_type_ToString(pinterest_rest_api_audience_update_operation_type__e audience_update_operation_type);

pinterest_rest_api_audience_update_operation_type__e audience_update_operation_type_audience_update_operation_type_FromString(char* audience_update_operation_type);

//cJSON *audience_update_operation_type_audience_update_operation_type_convertToJSON(pinterest_rest_api_audience_update_operation_type__e audience_update_operation_type);

//pinterest_rest_api_audience_update_operation_type__e audience_update_operation_type_audience_update_operation_type_parseFromJSON(cJSON *audience_update_operation_typeJSON);

#endif /* _audience_update_operation_type_H_ */

