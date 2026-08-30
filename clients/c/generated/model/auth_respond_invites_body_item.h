/*
 * auth_respond_invites_body_item.h
 *
 * 
 */

#ifndef _auth_respond_invites_body_item_H_
#define _auth_respond_invites_body_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct auth_respond_invites_body_item_t auth_respond_invites_body_item_t;

#include "auth_respond_invite_action.h"



typedef struct auth_respond_invites_body_item_t {
    struct auth_respond_invite_action_t *action; //model
    char *invite_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} auth_respond_invites_body_item_t;

__attribute__((deprecated)) auth_respond_invites_body_item_t *auth_respond_invites_body_item_create(
    auth_respond_invite_action_t *action,
    char *invite_id
);

void auth_respond_invites_body_item_free(auth_respond_invites_body_item_t *auth_respond_invites_body_item);

auth_respond_invites_body_item_t *auth_respond_invites_body_item_parseFromJSON(cJSON *auth_respond_invites_body_itemJSON);

cJSON *auth_respond_invites_body_item_convertToJSON(auth_respond_invites_body_item_t *auth_respond_invites_body_item);

#endif /* _auth_respond_invites_body_item_H_ */

