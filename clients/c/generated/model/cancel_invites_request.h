/*
 * cancel_invites_request.h
 *
 * An object with the list of invite/request ids to cancel.
 */

#ifndef _cancel_invites_request_H_
#define _cancel_invites_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cancel_invites_request_t cancel_invites_request_t;




typedef struct cancel_invites_request_t {
    list_t *invite_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} cancel_invites_request_t;

__attribute__((deprecated)) cancel_invites_request_t *cancel_invites_request_create(
    list_t *invite_ids
);

void cancel_invites_request_free(cancel_invites_request_t *cancel_invites_request);

cancel_invites_request_t *cancel_invites_request_parseFromJSON(cJSON *cancel_invites_requestJSON);

cJSON *cancel_invites_request_convertToJSON(cancel_invites_request_t *cancel_invites_request);

#endif /* _cancel_invites_request_H_ */

