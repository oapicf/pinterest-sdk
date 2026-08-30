/*
 * schedules_create_200_response_inner.h
 *
 * 
 */

#ifndef _schedules_create_200_response_inner_H_
#define _schedules_create_200_response_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedules_create_200_response_inner_t schedules_create_200_response_inner_t;

#include "schedules_create_200_response_inner_data.h"



typedef struct schedules_create_200_response_inner_t {
    struct schedules_create_200_response_inner_data_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} schedules_create_200_response_inner_t;

__attribute__((deprecated)) schedules_create_200_response_inner_t *schedules_create_200_response_inner_create(
    schedules_create_200_response_inner_data_t *data
);

void schedules_create_200_response_inner_free(schedules_create_200_response_inner_t *schedules_create_200_response_inner);

schedules_create_200_response_inner_t *schedules_create_200_response_inner_parseFromJSON(cJSON *schedules_create_200_response_innerJSON);

cJSON *schedules_create_200_response_inner_convertToJSON(schedules_create_200_response_inner_t *schedules_create_200_response_inner);

#endif /* _schedules_create_200_response_inner_H_ */

