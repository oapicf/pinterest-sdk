/*
 * schedule_create.h
 *
 * Resource create operation model.
 */

#ifndef _schedule_create_H_
#define _schedule_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_create_t schedule_create_t;

#include "ad_account_entity_type.h"
#include "schedule_action.h"
#include "schedule_delta_value.h"
#include "schedule_status.h"
#include "schedule_type.h"



typedef struct schedule_create_t {
    struct schedule_delta_value_t *delta_value; //model
    int *end_timestamp; //numeric
    char *entity_id; // string
    ad_account_entity_type_t *entity_type; // custom
    char *name; // string
    schedule_action_t *schedule_action; // custom
    schedule_status_t *schedule_status; // custom
    schedule_type_t *schedule_type; // custom
    int *start_timestamp; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_create_t;

__attribute__((deprecated)) schedule_create_t *schedule_create_create(
    schedule_delta_value_t *delta_value,
    int *end_timestamp,
    char *entity_id,
    ad_account_entity_type_t *entity_type,
    char *name,
    schedule_action_t *schedule_action,
    schedule_status_t *schedule_status,
    schedule_type_t *schedule_type,
    int *start_timestamp
);

void schedule_create_free(schedule_create_t *schedule_create);

schedule_create_t *schedule_create_parseFromJSON(cJSON *schedule_createJSON);

cJSON *schedule_create_convertToJSON(schedule_create_t *schedule_create);

#endif /* _schedule_create_H_ */

