/*
 * ssio_insertion_order_status_response.h
 *
 * SSIO insertion order status response for a single pin order id lookup.
 */

#ifndef _ssio_insertion_order_status_response_H_
#define _ssio_insertion_order_status_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_insertion_order_status_response_t ssio_insertion_order_status_response_t;




typedef struct ssio_insertion_order_status_response_t {
    char *creation_time; // string
    char *pin_order_id; // string
    char *status; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_insertion_order_status_response_t;

__attribute__((deprecated)) ssio_insertion_order_status_response_t *ssio_insertion_order_status_response_create(
    char *creation_time,
    char *pin_order_id,
    char *status
);

void ssio_insertion_order_status_response_free(ssio_insertion_order_status_response_t *ssio_insertion_order_status_response);

ssio_insertion_order_status_response_t *ssio_insertion_order_status_response_parseFromJSON(cJSON *ssio_insertion_order_status_responseJSON);

cJSON *ssio_insertion_order_status_response_convertToJSON(ssio_insertion_order_status_response_t *ssio_insertion_order_status_response);

#endif /* _ssio_insertion_order_status_response_H_ */

