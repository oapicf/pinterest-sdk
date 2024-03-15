/*
 * order_line_response.h
 *
 * 
 */

#ifndef _order_line_response_H_
#define _order_line_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_line_response_t order_line_response_t;

#include "order_line.h"
#include "order_line_error.h"



typedef struct order_line_response_t {
    list_t *errors; //nonprimitive container
    list_t *order_line; //nonprimitive container

} order_line_response_t;

order_line_response_t *order_line_response_create(
    list_t *errors,
    list_t *order_line
);

void order_line_response_free(order_line_response_t *order_line_response);

order_line_response_t *order_line_response_parseFromJSON(cJSON *order_line_responseJSON);

cJSON *order_line_response_convertToJSON(order_line_response_t *order_line_response);

#endif /* _order_line_response_H_ */

