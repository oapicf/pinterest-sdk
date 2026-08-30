/*
 * schedule_update_request_all_of1.h
 *
 * 
 */

#ifndef _schedule_update_request_all_of1_H_
#define _schedule_update_request_all_of1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_update_request_all_of1_t schedule_update_request_all_of1_t;




typedef struct schedule_update_request_all_of1_t {
    char *entity_id; // string
    char *entity_type; // string
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_update_request_all_of1_t;

__attribute__((deprecated)) schedule_update_request_all_of1_t *schedule_update_request_all_of1_create(
    char *entity_id,
    char *entity_type,
    char *id
);

void schedule_update_request_all_of1_free(schedule_update_request_all_of1_t *schedule_update_request_all_of1);

schedule_update_request_all_of1_t *schedule_update_request_all_of1_parseFromJSON(cJSON *schedule_update_request_all_of1JSON);

cJSON *schedule_update_request_all_of1_convertToJSON(schedule_update_request_all_of1_t *schedule_update_request_all_of1);

#endif /* _schedule_update_request_all_of1_H_ */

