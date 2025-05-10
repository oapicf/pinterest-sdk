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



typedef struct shared_audience_common_t {
    char *audience_id; // string
    pinterest_rest_api_operation_type__e operation_type; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} shared_audience_common_t;

__attribute__((deprecated)) shared_audience_common_t *shared_audience_common_create(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type
);

void shared_audience_common_free(shared_audience_common_t *shared_audience_common);

shared_audience_common_t *shared_audience_common_parseFromJSON(cJSON *shared_audience_commonJSON);

cJSON *shared_audience_common_convertToJSON(shared_audience_common_t *shared_audience_common);

#endif /* _shared_audience_common_H_ */

