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
    char *invite_or_request_id; // string
    int code; //numeric
    char *message; // string
    list_t *users_or_partner_ids; //primitive container

} invite_exception_response_t;

invite_exception_response_t *invite_exception_response_create(
    char *invite_or_request_id,
    int code,
    char *message,
    list_t *users_or_partner_ids
);

void invite_exception_response_free(invite_exception_response_t *invite_exception_response);

invite_exception_response_t *invite_exception_response_parseFromJSON(cJSON *invite_exception_responseJSON);

cJSON *invite_exception_response_convertToJSON(invite_exception_response_t *invite_exception_response);

#endif /* _invite_exception_response_H_ */

