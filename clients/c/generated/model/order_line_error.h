/*
 * order_line_error.h
 *
 * 
 */

#ifndef _order_line_error_H_
#define _order_line_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_line_error_t order_line_error_t;

#include "order_line.h"



typedef struct order_line_error_t {
    order_line_t *data; //object
    list_t *error_messages; //primitive container

} order_line_error_t;

order_line_error_t *order_line_error_create(
    order_line_t *data,
    list_t *error_messages
);

void order_line_error_free(order_line_error_t *order_line_error);

order_line_error_t *order_line_error_parseFromJSON(cJSON *order_line_errorJSON);

cJSON *order_line_error_convertToJSON(order_line_error_t *order_line_error);

#endif /* _order_line_error_H_ */

