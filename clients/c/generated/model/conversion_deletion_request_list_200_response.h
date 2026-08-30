/*
 * conversion_deletion_request_list_200_response.h
 *
 * 
 */

#ifndef _conversion_deletion_request_list_200_response_H_
#define _conversion_deletion_request_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_deletion_request_list_200_response_t conversion_deletion_request_list_200_response_t;

#include "conversion_deletion_request.h"



typedef struct conversion_deletion_request_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_deletion_request_list_200_response_t;

__attribute__((deprecated)) conversion_deletion_request_list_200_response_t *conversion_deletion_request_list_200_response_create(
    char *bookmark,
    list_t *items
);

void conversion_deletion_request_list_200_response_free(conversion_deletion_request_list_200_response_t *conversion_deletion_request_list_200_response);

conversion_deletion_request_list_200_response_t *conversion_deletion_request_list_200_response_parseFromJSON(cJSON *conversion_deletion_request_list_200_responseJSON);

cJSON *conversion_deletion_request_list_200_response_convertToJSON(conversion_deletion_request_list_200_response_t *conversion_deletion_request_list_200_response);

#endif /* _conversion_deletion_request_list_200_response_H_ */

