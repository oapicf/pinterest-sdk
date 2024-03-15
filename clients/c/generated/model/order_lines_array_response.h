/*
 * order_lines_array_response.h
 *
 * 
 */

#ifndef _order_lines_array_response_H_
#define _order_lines_array_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_lines_array_response_t order_lines_array_response_t;

#include "order_lines.h"



typedef struct order_lines_array_response_t {
    list_t *items; //nonprimitive container

} order_lines_array_response_t;

order_lines_array_response_t *order_lines_array_response_create(
    list_t *items
);

void order_lines_array_response_free(order_lines_array_response_t *order_lines_array_response);

order_lines_array_response_t *order_lines_array_response_parseFromJSON(cJSON *order_lines_array_responseJSON);

cJSON *order_lines_array_response_convertToJSON(order_lines_array_response_t *order_lines_array_response);

#endif /* _order_lines_array_response_H_ */

