/*
 * update_member_asset_access_body.h
 *
 * An object with a list of all the new accesses.
 */

#ifndef _update_member_asset_access_body_H_
#define _update_member_asset_access_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_member_asset_access_body_t update_member_asset_access_body_t;

#include "update_member_asset_access_body_accesses_inner.h"



typedef struct update_member_asset_access_body_t {
    list_t *accesses; //nonprimitive container

} update_member_asset_access_body_t;

update_member_asset_access_body_t *update_member_asset_access_body_create(
    list_t *accesses
);

void update_member_asset_access_body_free(update_member_asset_access_body_t *update_member_asset_access_body);

update_member_asset_access_body_t *update_member_asset_access_body_parseFromJSON(cJSON *update_member_asset_access_bodyJSON);

cJSON *update_member_asset_access_body_convertToJSON(update_member_asset_access_body_t *update_member_asset_access_body);

#endif /* _update_member_asset_access_body_H_ */

