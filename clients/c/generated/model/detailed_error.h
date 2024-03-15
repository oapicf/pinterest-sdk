/*
 * detailed_error.h
 *
 * Used for including extra details to a base error
 */

#ifndef _detailed_error_H_
#define _detailed_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct detailed_error_t detailed_error_t;

#include "object.h"



typedef struct detailed_error_t {
    int code; //numeric
    char *message; // string
    object_t *details; //object

} detailed_error_t;

detailed_error_t *detailed_error_create(
    int code,
    char *message,
    object_t *details
);

void detailed_error_free(detailed_error_t *detailed_error);

detailed_error_t *detailed_error_parseFromJSON(cJSON *detailed_errorJSON);

cJSON *detailed_error_convertToJSON(detailed_error_t *detailed_error);

#endif /* _detailed_error_H_ */

