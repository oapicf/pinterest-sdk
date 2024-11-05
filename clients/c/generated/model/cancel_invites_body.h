/*
 * cancel_invites_body.h
 *
 * Request body used to cancel invites
 */

#ifndef _cancel_invites_body_H_
#define _cancel_invites_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cancel_invites_body_t cancel_invites_body_t;




typedef struct cancel_invites_body_t {
    list_t *invite_ids; //primitive container

} cancel_invites_body_t;

cancel_invites_body_t *cancel_invites_body_create(
    list_t *invite_ids
);

void cancel_invites_body_free(cancel_invites_body_t *cancel_invites_body);

cancel_invites_body_t *cancel_invites_body_parseFromJSON(cJSON *cancel_invites_bodyJSON);

cJSON *cancel_invites_body_convertToJSON(cancel_invites_body_t *cancel_invites_body);

#endif /* _cancel_invites_body_H_ */

