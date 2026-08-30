/*
 * order_line_mutation_error.h
 *
 * 
 */

#ifndef _order_line_mutation_error_H_
#define _order_line_mutation_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_line_mutation_error_t order_line_mutation_error_t;

#include "order_line.h"



typedef struct order_line_mutation_error_t {
    struct order_line_t *data; //model
    list_t *error_messages; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} order_line_mutation_error_t;

__attribute__((deprecated)) order_line_mutation_error_t *order_line_mutation_error_create(
    order_line_t *data,
    list_t *error_messages
);

void order_line_mutation_error_free(order_line_mutation_error_t *order_line_mutation_error);

order_line_mutation_error_t *order_line_mutation_error_parseFromJSON(cJSON *order_line_mutation_errorJSON);

cJSON *order_line_mutation_error_convertToJSON(order_line_mutation_error_t *order_line_mutation_error);

#endif /* _order_line_mutation_error_H_ */

