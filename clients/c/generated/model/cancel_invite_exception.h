/*
 * cancel_invite_exception.h
 *
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */

#ifndef _cancel_invite_exception_H_
#define _cancel_invite_exception_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cancel_invite_exception_t cancel_invite_exception_t;




typedef struct cancel_invite_exception_t {
    char *invite_id; // string
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} cancel_invite_exception_t;

__attribute__((deprecated)) cancel_invite_exception_t *cancel_invite_exception_create(
    char *invite_id,
    char *message
);

void cancel_invite_exception_free(cancel_invite_exception_t *cancel_invite_exception);

cancel_invite_exception_t *cancel_invite_exception_parseFromJSON(cJSON *cancel_invite_exceptionJSON);

cJSON *cancel_invite_exception_convertToJSON(cancel_invite_exception_t *cancel_invite_exception);

#endif /* _cancel_invite_exception_H_ */

