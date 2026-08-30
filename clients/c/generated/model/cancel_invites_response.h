/*
 * cancel_invites_response.h
 *
 * 
 */

#ifndef _cancel_invites_response_H_
#define _cancel_invites_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cancel_invites_response_t cancel_invites_response_t;

#include "cancel_invite_result_item.h"



typedef struct cancel_invites_response_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} cancel_invites_response_t;

__attribute__((deprecated)) cancel_invites_response_t *cancel_invites_response_create(
    list_t *items
);

void cancel_invites_response_free(cancel_invites_response_t *cancel_invites_response);

cancel_invites_response_t *cancel_invites_response_parseFromJSON(cJSON *cancel_invites_responseJSON);

cJSON *cancel_invites_response_convertToJSON(cancel_invites_response_t *cancel_invites_response);

#endif /* _cancel_invites_response_H_ */

