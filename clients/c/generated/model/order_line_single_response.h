/*
 * order_line_single_response.h
 *
 * 
 */

#ifndef _order_line_single_response_H_
#define _order_line_single_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_line_single_response_t order_line_single_response_t;

#include "order_line_response.h"



typedef struct order_line_single_response_t {
    order_line_response_t *data; //object

} order_line_single_response_t;

order_line_single_response_t *order_line_single_response_create(
    order_line_response_t *data
);

void order_line_single_response_free(order_line_single_response_t *order_line_single_response);

order_line_single_response_t *order_line_single_response_parseFromJSON(cJSON *order_line_single_responseJSON);

cJSON *order_line_single_response_convertToJSON(order_line_single_response_t *order_line_single_response);

#endif /* _order_line_single_response_H_ */

