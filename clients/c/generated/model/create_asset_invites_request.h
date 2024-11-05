/*
 * create_asset_invites_request.h
 *
 * Request body for updating asset roles for existing invites.
 */

#ifndef _create_asset_invites_request_H_
#define _create_asset_invites_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_asset_invites_request_t create_asset_invites_request_t;

#include "create_asset_invites_request_item.h"



typedef struct create_asset_invites_request_t {
    list_t *invites; //nonprimitive container

} create_asset_invites_request_t;

create_asset_invites_request_t *create_asset_invites_request_create(
    list_t *invites
);

void create_asset_invites_request_free(create_asset_invites_request_t *create_asset_invites_request);

create_asset_invites_request_t *create_asset_invites_request_parseFromJSON(cJSON *create_asset_invites_requestJSON);

cJSON *create_asset_invites_request_convertToJSON(create_asset_invites_request_t *create_asset_invites_request);

#endif /* _create_asset_invites_request_H_ */

