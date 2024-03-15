/*
 * audiences_list_200_response.h
 *
 * 
 */

#ifndef _audiences_list_200_response_H_
#define _audiences_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audiences_list_200_response_t audiences_list_200_response_t;

#include "audience.h"



typedef struct audiences_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} audiences_list_200_response_t;

audiences_list_200_response_t *audiences_list_200_response_create(
    list_t *items,
    char *bookmark
);

void audiences_list_200_response_free(audiences_list_200_response_t *audiences_list_200_response);

audiences_list_200_response_t *audiences_list_200_response_parseFromJSON(cJSON *audiences_list_200_responseJSON);

cJSON *audiences_list_200_response_convertToJSON(audiences_list_200_response_t *audiences_list_200_response);

#endif /* _audiences_list_200_response_H_ */

