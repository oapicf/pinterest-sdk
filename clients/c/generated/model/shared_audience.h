/*
 * shared_audience.h
 *
 * 
 */

#ifndef _shared_audience_H_
#define _shared_audience_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shared_audience_t shared_audience_t;

#include "operation_type.h"

// Enum  for shared_audience

typedef enum  { pinterest_rest_api_shared_audience__NULL = 0, pinterest_rest_api_shared_audience__SHARE, pinterest_rest_api_shared_audience__REVOKE } pinterest_rest_api_shared_audience__e;

char* shared_audience_operation_type_ToString(pinterest_rest_api_shared_audience__e operation_type);

pinterest_rest_api_shared_audience__e shared_audience_operation_type_FromString(char* operation_type);



typedef struct shared_audience_t {
    char *audience_id; // string
    operation_type_t *operation_type; // custom
    list_t *recipient_account_ids; //primitive container

} shared_audience_t;

shared_audience_t *shared_audience_create(
    char *audience_id,
    operation_type_t *operation_type,
    list_t *recipient_account_ids
);

void shared_audience_free(shared_audience_t *shared_audience);

shared_audience_t *shared_audience_parseFromJSON(cJSON *shared_audienceJSON);

cJSON *shared_audience_convertToJSON(shared_audience_t *shared_audience);

#endif /* _shared_audience_H_ */

