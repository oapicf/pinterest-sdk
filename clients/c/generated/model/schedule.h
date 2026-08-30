/*
 * schedule.h
 *
 * 
 */

#ifndef _schedule_H_
#define _schedule_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_t schedule_t;

#include "ad_account_entity_type.h"
#include "schedule_action.h"
#include "schedule_delta_value.h"
#include "schedule_status.h"
#include "schedule_type.h"



typedef struct schedule_t {
    struct schedule_delta_value_t *delta_value; //model
    int *end_timestamp; //numeric
    char *entity_id; // string
    ad_account_entity_type_t *entity_type; // custom
    char *name; // string
    schedule_action_t *schedule_action; // custom
    char *schedule_id; // string
    schedule_status_t *schedule_status; // custom
    schedule_type_t *schedule_type; // custom
    int *start_timestamp; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_t;

__attribute__((deprecated)) schedule_t *schedule_create(
    schedule_delta_value_t *delta_value,
    int *end_timestamp,
    char *entity_id,
    ad_account_entity_type_t *entity_type,
    char *name,
    schedule_action_t *schedule_action,
    char *schedule_id,
    schedule_status_t *schedule_status,
    schedule_type_t *schedule_type,
    int *start_timestamp
);

void schedule_free(schedule_t *schedule);

schedule_t *schedule_parseFromJSON(cJSON *scheduleJSON);

cJSON *schedule_convertToJSON(schedule_t *schedule);

#endif /* _schedule_H_ */

