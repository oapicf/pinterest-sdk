/*
 * schedule_create_request.h
 *
 * 
 */

#ifndef _schedule_create_request_H_
#define _schedule_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_create_request_t schedule_create_request_t;

#include "schedule_action.h"
#include "schedule_common_delta_value.h"
#include "schedule_status.h"
#include "schedule_type.h"



typedef struct schedule_create_request_t {
    char *entity_id; // string
    char *entity_type; // string
    struct schedule_common_delta_value_t *delta_value; //model
    int *end_timestamp; //numeric
    char *name; // string
    pinterest_rest_api_schedule_action__e schedule_action; //referenced enum
    pinterest_rest_api_schedule_status__e schedule_status; //referenced enum
    pinterest_rest_api_schedule_type__e schedule_type; //referenced enum
    int *start_timestamp; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_create_request_t;

__attribute__((deprecated)) schedule_create_request_t *schedule_create_request_create(
    char *entity_id,
    char *entity_type,
    schedule_common_delta_value_t *delta_value,
    int *end_timestamp,
    char *name,
    pinterest_rest_api_schedule_action__e schedule_action,
    pinterest_rest_api_schedule_status__e schedule_status,
    pinterest_rest_api_schedule_type__e schedule_type,
    int *start_timestamp
);

void schedule_create_request_free(schedule_create_request_t *schedule_create_request);

schedule_create_request_t *schedule_create_request_parseFromJSON(cJSON *schedule_create_requestJSON);

cJSON *schedule_create_request_convertToJSON(schedule_create_request_t *schedule_create_request);

#endif /* _schedule_create_request_H_ */

