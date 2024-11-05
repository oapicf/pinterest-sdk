/*
 * auth_respond_invites_body.h
 *
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */

#ifndef _auth_respond_invites_body_H_
#define _auth_respond_invites_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct auth_respond_invites_body_t auth_respond_invites_body_t;

#include "auth_respond_invites_body_invites_inner.h"



typedef struct auth_respond_invites_body_t {
    list_t *invites; //nonprimitive container

} auth_respond_invites_body_t;

auth_respond_invites_body_t *auth_respond_invites_body_create(
    list_t *invites
);

void auth_respond_invites_body_free(auth_respond_invites_body_t *auth_respond_invites_body);

auth_respond_invites_body_t *auth_respond_invites_body_parseFromJSON(cJSON *auth_respond_invites_bodyJSON);

cJSON *auth_respond_invites_body_convertToJSON(auth_respond_invites_body_t *auth_respond_invites_body);

#endif /* _auth_respond_invites_body_H_ */

