/*
 * schedules_create_200_response_inner_data_one_of.h
 *
 * 
 */

#ifndef _schedules_create_200_response_inner_data_one_of_H_
#define _schedules_create_200_response_inner_data_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedules_create_200_response_inner_data_one_of_t schedules_create_200_response_inner_data_one_of_t;

#include "pinterest_lib_error.h"



typedef struct schedules_create_200_response_inner_data_one_of_t {
    char *id; // string
    char *schedule_id; // string
    struct pinterest_lib_error_t *exceptions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} schedules_create_200_response_inner_data_one_of_t;

__attribute__((deprecated)) schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of_create(
    char *id,
    char *schedule_id,
    pinterest_lib_error_t *exceptions
);

void schedules_create_200_response_inner_data_one_of_free(schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of);

schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of_parseFromJSON(cJSON *schedules_create_200_response_inner_data_one_ofJSON);

cJSON *schedules_create_200_response_inner_data_one_of_convertToJSON(schedules_create_200_response_inner_data_one_of_t *schedules_create_200_response_inner_data_one_of);

#endif /* _schedules_create_200_response_inner_data_one_of_H_ */

