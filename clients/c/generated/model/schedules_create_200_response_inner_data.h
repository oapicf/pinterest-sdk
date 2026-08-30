/*
 * schedules_create_200_response_inner_data.h
 *
 * Created/updated resource on success or error details on failure
 */

#ifndef _schedules_create_200_response_inner_data_H_
#define _schedules_create_200_response_inner_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedules_create_200_response_inner_data_t schedules_create_200_response_inner_data_t;

#include "ad_account_entity_type.h"
#include "pinterest_lib_error.h"
#include "schedule.h"
#include "schedule_action.h"
#include "schedule_delta_value.h"
#include "schedule_status.h"
#include "schedule_type.h"
#include "schedules_create_200_response_inner_data_one_of.h"



typedef struct schedules_create_200_response_inner_data_t {
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
    char *id; // string
    struct pinterest_lib_error_t *exceptions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} schedules_create_200_response_inner_data_t;

__attribute__((deprecated)) schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data_create(
    schedule_delta_value_t *delta_value,
    int *end_timestamp,
    char *entity_id,
    ad_account_entity_type_t *entity_type,
    char *name,
    schedule_action_t *schedule_action,
    char *schedule_id,
    schedule_status_t *schedule_status,
    schedule_type_t *schedule_type,
    int *start_timestamp,
    char *id,
    pinterest_lib_error_t *exceptions
);

void schedules_create_200_response_inner_data_free(schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data);

schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data_parseFromJSON(cJSON *schedules_create_200_response_inner_dataJSON);

cJSON *schedules_create_200_response_inner_data_convertToJSON(schedules_create_200_response_inner_data_t *schedules_create_200_response_inner_data);

#endif /* _schedules_create_200_response_inner_data_H_ */

