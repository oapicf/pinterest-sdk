/*
 * order_line_mutation_response.h
 *
 * 
 */

#ifndef _order_line_mutation_response_H_
#define _order_line_mutation_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_line_mutation_response_t order_line_mutation_response_t;

#include "order_line_mutation_result.h"



typedef struct order_line_mutation_response_t {
    struct order_line_mutation_result_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} order_line_mutation_response_t;

__attribute__((deprecated)) order_line_mutation_response_t *order_line_mutation_response_create(
    order_line_mutation_result_t *data
);

void order_line_mutation_response_free(order_line_mutation_response_t *order_line_mutation_response);

order_line_mutation_response_t *order_line_mutation_response_parseFromJSON(cJSON *order_line_mutation_responseJSON);

cJSON *order_line_mutation_response_convertToJSON(order_line_mutation_response_t *order_line_mutation_response);

#endif /* _order_line_mutation_response_H_ */

