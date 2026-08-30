/*
 * invite_exception_response.h
 *
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */

#ifndef _invite_exception_response_H_
#define _invite_exception_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_exception_response_t invite_exception_response_t;




typedef struct invite_exception_response_t {
    int *code; //numeric
    char *invite_or_request_id; // string
    char *message; // string
    list_t *users_or_partner_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} invite_exception_response_t;

__attribute__((deprecated)) invite_exception_response_t *invite_exception_response_create(
    int *code,
    char *invite_or_request_id,
    char *message,
    list_t *users_or_partner_ids
);

void invite_exception_response_free(invite_exception_response_t *invite_exception_response);

invite_exception_response_t *invite_exception_response_parseFromJSON(cJSON *invite_exception_responseJSON);

cJSON *invite_exception_response_convertToJSON(invite_exception_response_t *invite_exception_response);

#endif /* _invite_exception_response_H_ */

