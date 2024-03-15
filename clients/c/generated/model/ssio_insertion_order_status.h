/*
 * ssio_insertion_order_status.h
 *
 * 
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
    char *pin_order_id; // string
    char *status; // string
    char *creation_time; // string

} ssio_insertion_order_status_t;

ssio_insertion_order_status_t *ssio_insertion_order_status_create(
    char *pin_order_id,
    char *status,
    char *creation_time
);

void ssio_insertion_order_status_free(ssio_insertion_order_status_t *ssio_insertion_order_status);

ssio_insertion_order_status_t *ssio_insertion_order_status_parseFromJSON(cJSON *ssio_insertion_order_statusJSON);

cJSON *ssio_insertion_order_status_convertToJSON(ssio_insertion_order_status_t *ssio_insertion_order_status);

#endif /* _ssio_insertion_order_status_H_ */

