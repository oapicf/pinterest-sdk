/*
 * business_members_asset_access_delete_body.h
 *
 * An object with a list of member asset accesses to delete.
 */

#ifndef _business_members_asset_access_delete_body_H_
#define _business_members_asset_access_delete_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_members_asset_access_delete_body_t business_members_asset_access_delete_body_t;

#include "delete_member_asset_access_item.h"



typedef struct business_members_asset_access_delete_body_t {
    list_t *accesses; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} business_members_asset_access_delete_body_t;

__attribute__((deprecated)) business_members_asset_access_delete_body_t *business_members_asset_access_delete_body_create(
    list_t *accesses
);

void business_members_asset_access_delete_body_free(business_members_asset_access_delete_body_t *business_members_asset_access_delete_body);

business_members_asset_access_delete_body_t *business_members_asset_access_delete_body_parseFromJSON(cJSON *business_members_asset_access_delete_bodyJSON);

cJSON *business_members_asset_access_delete_body_convertToJSON(business_members_asset_access_delete_body_t *business_members_asset_access_delete_body);

#endif /* _business_members_asset_access_delete_body_H_ */

