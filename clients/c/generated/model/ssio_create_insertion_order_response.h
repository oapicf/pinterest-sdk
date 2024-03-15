/*
 * ssio_create_insertion_order_response.h
 *
 * 
 */

#ifndef _ssio_create_insertion_order_response_H_
#define _ssio_create_insertion_order_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_create_insertion_order_response_t ssio_create_insertion_order_response_t;




typedef struct ssio_create_insertion_order_response_t {
    char *pin_order_id; // string

} ssio_create_insertion_order_response_t;

ssio_create_insertion_order_response_t *ssio_create_insertion_order_response_create(
    char *pin_order_id
);

void ssio_create_insertion_order_response_free(ssio_create_insertion_order_response_t *ssio_create_insertion_order_response);

ssio_create_insertion_order_response_t *ssio_create_insertion_order_response_parseFromJSON(cJSON *ssio_create_insertion_order_responseJSON);

cJSON *ssio_create_insertion_order_response_convertToJSON(ssio_create_insertion_order_response_t *ssio_create_insertion_order_response);

#endif /* _ssio_create_insertion_order_response_H_ */

