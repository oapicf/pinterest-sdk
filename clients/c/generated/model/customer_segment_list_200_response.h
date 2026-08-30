/*
 * customer_segment_list_200_response.h
 *
 * 
 */

#ifndef _customer_segment_list_200_response_H_
#define _customer_segment_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_segment_list_200_response_t customer_segment_list_200_response_t;

#include "customer_segment.h"



typedef struct customer_segment_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} customer_segment_list_200_response_t;

__attribute__((deprecated)) customer_segment_list_200_response_t *customer_segment_list_200_response_create(
    char *bookmark,
    list_t *items
);

void customer_segment_list_200_response_free(customer_segment_list_200_response_t *customer_segment_list_200_response);

customer_segment_list_200_response_t *customer_segment_list_200_response_parseFromJSON(cJSON *customer_segment_list_200_responseJSON);

cJSON *customer_segment_list_200_response_convertToJSON(customer_segment_list_200_response_t *customer_segment_list_200_response);

#endif /* _customer_segment_list_200_response_H_ */

