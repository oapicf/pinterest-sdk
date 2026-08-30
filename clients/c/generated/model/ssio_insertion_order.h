/*
 * ssio_insertion_order.h
 *
 * An SSIO insertion order.
 */

#ifndef _ssio_insertion_order_H_
#define _ssio_insertion_order_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_insertion_order_t ssio_insertion_order_t;




typedef struct ssio_insertion_order_t {
    char *pin_order_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_insertion_order_t;

__attribute__((deprecated)) ssio_insertion_order_t *ssio_insertion_order_create(
    char *pin_order_id
);

void ssio_insertion_order_free(ssio_insertion_order_t *ssio_insertion_order);

ssio_insertion_order_t *ssio_insertion_order_parseFromJSON(cJSON *ssio_insertion_orderJSON);

cJSON *ssio_insertion_order_convertToJSON(ssio_insertion_order_t *ssio_insertion_order);

#endif /* _ssio_insertion_order_H_ */

