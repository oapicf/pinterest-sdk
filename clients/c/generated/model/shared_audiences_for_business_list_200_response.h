/*
 * shared_audiences_for_business_list_200_response.h
 *
 * 
 */

#ifndef _shared_audiences_for_business_list_200_response_H_
#define _shared_audiences_for_business_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shared_audiences_for_business_list_200_response_t shared_audiences_for_business_list_200_response_t;

#include "audience.h"



typedef struct shared_audiences_for_business_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} shared_audiences_for_business_list_200_response_t;

__attribute__((deprecated)) shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response_create(
    char *bookmark,
    list_t *items
);

void shared_audiences_for_business_list_200_response_free(shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response);

shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response_parseFromJSON(cJSON *shared_audiences_for_business_list_200_responseJSON);

cJSON *shared_audiences_for_business_list_200_response_convertToJSON(shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response);

#endif /* _shared_audiences_for_business_list_200_response_H_ */

