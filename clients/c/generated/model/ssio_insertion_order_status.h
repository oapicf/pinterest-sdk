/*
 * ssio_insertion_order_status.h
 *
 * SSIO insertion order status item in a list response.
 */

#ifndef _ssio_insertion_order_status_H_
#define _ssio_insertion_order_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_insertion_order_status_t ssio_insertion_order_status_t;




typedef struct ssio_insertion_order_status_t {
    char *creation_time; // string
    char *pin_order_id; // string
    char *status; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_insertion_order_status_t;

__attribute__((deprecated)) ssio_insertion_order_status_t *ssio_insertion_order_status_create(
    char *creation_time,
    char *pin_order_id,
    char *status
);

void ssio_insertion_order_status_free(ssio_insertion_order_status_t *ssio_insertion_order_status);

ssio_insertion_order_status_t *ssio_insertion_order_status_parseFromJSON(cJSON *ssio_insertion_order_statusJSON);

cJSON *ssio_insertion_order_status_convertToJSON(ssio_insertion_order_status_t *ssio_insertion_order_status);

#endif /* _ssio_insertion_order_status_H_ */

