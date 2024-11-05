/*
 * auth_respond_invites_body_invites_inner.h
 *
 * 
 */

#ifndef _auth_respond_invites_body_invites_inner_H_
#define _auth_respond_invites_body_invites_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct auth_respond_invites_body_invites_inner_t auth_respond_invites_body_invites_inner_t;

#include "auth_respond_invites_body_invites_inner_action.h"



typedef struct auth_respond_invites_body_invites_inner_t {
    struct auth_respond_invites_body_invites_inner_action_t *action; //model
    char *invite_id; // string

} auth_respond_invites_body_invites_inner_t;

auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner_create(
    auth_respond_invites_body_invites_inner_action_t *action,
    char *invite_id
);

void auth_respond_invites_body_invites_inner_free(auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner);

auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner_parseFromJSON(cJSON *auth_respond_invites_body_invites_innerJSON);

cJSON *auth_respond_invites_body_invites_inner_convertToJSON(auth_respond_invites_body_invites_inner_t *auth_respond_invites_body_invites_inner);

#endif /* _auth_respond_invites_body_invites_inner_H_ */

