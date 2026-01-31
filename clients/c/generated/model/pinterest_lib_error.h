/*
 * pinterest_lib_error.h
 *
 * Default error response
 */

#ifndef _pinterest_lib_error_H_
#define _pinterest_lib_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pinterest_lib_error_t pinterest_lib_error_t;




typedef struct pinterest_lib_error_t {
    int code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pinterest_lib_error_t;

__attribute__((deprecated)) pinterest_lib_error_t *pinterest_lib_error_create(
    int code,
    char *message
);

void pinterest_lib_error_free(pinterest_lib_error_t *pinterest_lib_error);

pinterest_lib_error_t *pinterest_lib_error_parseFromJSON(cJSON *pinterest_lib_errorJSON);

cJSON *pinterest_lib_error_convertToJSON(pinterest_lib_error_t *pinterest_lib_error);

#endif /* _pinterest_lib_error_H_ */

