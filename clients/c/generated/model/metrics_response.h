/*
 * metrics_response.h
 *
 * 
 */

#ifndef _metrics_response_H_
#define _metrics_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct metrics_response_t metrics_response_t;

#include "object.h"



typedef struct metrics_response_t {
    list_t *data; //nonprimitive container

} metrics_response_t;

metrics_response_t *metrics_response_create(
    list_t *data
);

void metrics_response_free(metrics_response_t *metrics_response);

metrics_response_t *metrics_response_parseFromJSON(cJSON *metrics_responseJSON);

cJSON *metrics_response_convertToJSON(metrics_response_t *metrics_response);

#endif /* _metrics_response_H_ */

