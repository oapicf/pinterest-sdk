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



typedef struct shared_audience_t {
    char *audience_id; // string
    pinterest_rest_api_operation_type__e operation_type; //referenced enum
    list_t *recipient_account_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} shared_audience_t;

__attribute__((deprecated)) shared_audience_t *shared_audience_create(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type,
    list_t *recipient_account_ids
);

void shared_audience_free(shared_audience_t *shared_audience);

shared_audience_t *shared_audience_parseFromJSON(cJSON *shared_audienceJSON);

cJSON *shared_audience_convertToJSON(shared_audience_t *shared_audience);

#endif /* _shared_audience_H_ */

