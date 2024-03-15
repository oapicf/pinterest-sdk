/*
 * delivery_metrics_response.h
 *
 * 
 */

#ifndef _delivery_metrics_response_H_
#define _delivery_metrics_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delivery_metrics_response_t delivery_metrics_response_t;

#include "delivery_metrics_response_items_inner.h"



typedef struct delivery_metrics_response_t {
    list_t *items; //nonprimitive container

} delivery_metrics_response_t;

delivery_metrics_response_t *delivery_metrics_response_create(
    list_t *items
);

void delivery_metrics_response_free(delivery_metrics_response_t *delivery_metrics_response);

delivery_metrics_response_t *delivery_metrics_response_parseFromJSON(cJSON *delivery_metrics_responseJSON);

cJSON *delivery_metrics_response_convertToJSON(delivery_metrics_response_t *delivery_metrics_response);

#endif /* _delivery_metrics_response_H_ */

