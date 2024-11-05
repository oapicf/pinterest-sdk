/*
 * shared_audience_common.h
 *
 * 
 */

#ifndef _shared_audience_common_H_
#define _shared_audience_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shared_audience_common_t shared_audience_common_t;

#include "operation_type.h"

// Enum  for shared_audience_common

typedef enum  { pinterest_rest_api_shared_audience_common__NULL = 0, pinterest_rest_api_shared_audience_common__SHARE, pinterest_rest_api_shared_audience_common__REVOKE } pinterest_rest_api_shared_audience_common__e;

char* shared_audience_common_operation_type_ToString(pinterest_rest_api_shared_audience_common__e operation_type);

pinterest_rest_api_shared_audience_common__e shared_audience_common_operation_type_FromString(char* operation_type);



typedef struct shared_audience_common_t {
    char *audience_id; // string
    operation_type_t *operation_type; // custom

} shared_audience_common_t;

shared_audience_common_t *shared_audience_common_create(
    char *audience_id,
    operation_type_t *operation_type
);

void shared_audience_common_free(shared_audience_common_t *shared_audience_common);

shared_audience_common_t *shared_audience_common_parseFromJSON(cJSON *shared_audience_commonJSON);

cJSON *shared_audience_common_convertToJSON(shared_audience_common_t *shared_audience_common);

#endif /* _shared_audience_common_H_ */

