/*
 * schedules_list_200_response.h
 *
 * 
 */

#ifndef _schedules_list_200_response_H_
#define _schedules_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedules_list_200_response_t schedules_list_200_response_t;

#include "schedule.h"



typedef struct schedules_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} schedules_list_200_response_t;

__attribute__((deprecated)) schedules_list_200_response_t *schedules_list_200_response_create(
    char *bookmark,
    list_t *items
);

void schedules_list_200_response_free(schedules_list_200_response_t *schedules_list_200_response);

schedules_list_200_response_t *schedules_list_200_response_parseFromJSON(cJSON *schedules_list_200_responseJSON);

cJSON *schedules_list_200_response_convertToJSON(schedules_list_200_response_t *schedules_list_200_response);

#endif /* _schedules_list_200_response_H_ */

