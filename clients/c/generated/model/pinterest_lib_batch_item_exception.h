/*
 * pinterest_lib_batch_item_exception.h
 *
 * Exception details for a batch operation item.
 */

#ifndef _pinterest_lib_batch_item_exception_H_
#define _pinterest_lib_batch_item_exception_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pinterest_lib_batch_item_exception_t pinterest_lib_batch_item_exception_t;




typedef struct pinterest_lib_batch_item_exception_t {
    int *code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pinterest_lib_batch_item_exception_t;

__attribute__((deprecated)) pinterest_lib_batch_item_exception_t *pinterest_lib_batch_item_exception_create(
    int *code,
    char *message
);

void pinterest_lib_batch_item_exception_free(pinterest_lib_batch_item_exception_t *pinterest_lib_batch_item_exception);

pinterest_lib_batch_item_exception_t *pinterest_lib_batch_item_exception_parseFromJSON(cJSON *pinterest_lib_batch_item_exceptionJSON);

cJSON *pinterest_lib_batch_item_exception_convertToJSON(pinterest_lib_batch_item_exception_t *pinterest_lib_batch_item_exception);

#endif /* _pinterest_lib_batch_item_exception_H_ */

