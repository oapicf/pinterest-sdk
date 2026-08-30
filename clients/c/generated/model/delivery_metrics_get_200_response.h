/*
 * delivery_metrics_get_200_response.h
 *
 * 
 */

#ifndef _delivery_metrics_get_200_response_H_
#define _delivery_metrics_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delivery_metrics_get_200_response_t delivery_metrics_get_200_response_t;

#include "delivery_metrics_response_items_items.h"



typedef struct delivery_metrics_get_200_response_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} delivery_metrics_get_200_response_t;

__attribute__((deprecated)) delivery_metrics_get_200_response_t *delivery_metrics_get_200_response_create(
    list_t *items
);

void delivery_metrics_get_200_response_free(delivery_metrics_get_200_response_t *delivery_metrics_get_200_response);

delivery_metrics_get_200_response_t *delivery_metrics_get_200_response_parseFromJSON(cJSON *delivery_metrics_get_200_responseJSON);

cJSON *delivery_metrics_get_200_response_convertToJSON(delivery_metrics_get_200_response_t *delivery_metrics_get_200_response);

#endif /* _delivery_metrics_get_200_response_H_ */

