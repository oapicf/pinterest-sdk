/*
 * update_partner_asset_access_body.h
 *
 * An object with a list of partner asset accesses to assign or update.
 */

#ifndef _update_partner_asset_access_body_H_
#define _update_partner_asset_access_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_partner_asset_access_body_t update_partner_asset_access_body_t;

#include "update_partner_asset_access_item.h"



typedef struct update_partner_asset_access_body_t {
    list_t *accesses; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} update_partner_asset_access_body_t;

__attribute__((deprecated)) update_partner_asset_access_body_t *update_partner_asset_access_body_create(
    list_t *accesses
);

void update_partner_asset_access_body_free(update_partner_asset_access_body_t *update_partner_asset_access_body);

update_partner_asset_access_body_t *update_partner_asset_access_body_parseFromJSON(cJSON *update_partner_asset_access_bodyJSON);

cJSON *update_partner_asset_access_body_convertToJSON(update_partner_asset_access_body_t *update_partner_asset_access_body);

#endif /* _update_partner_asset_access_body_H_ */

