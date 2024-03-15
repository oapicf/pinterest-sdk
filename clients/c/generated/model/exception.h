/*
 * exception.h
 *
 * 
 */

#ifndef _exception_H_
#define _exception_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct exception_t exception_t;




typedef struct exception_t {
    int code; //numeric
    char *message; // string

} exception_t;

exception_t *exception_create(
    int code,
    char *message
);

void exception_free(exception_t *exception);

exception_t *exception_parseFromJSON(cJSON *exceptionJSON);

cJSON *exception_convertToJSON(exception_t *exception);

#endif /* _exception_H_ */

