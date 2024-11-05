/*
 * delete_partner_asset_access_body.h
 *
 * 
 */

#ifndef _delete_partner_asset_access_body_H_
#define _delete_partner_asset_access_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_partner_asset_access_body_t delete_partner_asset_access_body_t;

#include "delete_partner_asset_access_body_accesses_inner.h"



typedef struct delete_partner_asset_access_body_t {
    list_t *accesses; //nonprimitive container

} delete_partner_asset_access_body_t;

delete_partner_asset_access_body_t *delete_partner_asset_access_body_create(
    list_t *accesses
);

void delete_partner_asset_access_body_free(delete_partner_asset_access_body_t *delete_partner_asset_access_body);

delete_partner_asset_access_body_t *delete_partner_asset_access_body_parseFromJSON(cJSON *delete_partner_asset_access_bodyJSON);

cJSON *delete_partner_asset_access_body_convertToJSON(delete_partner_asset_access_body_t *delete_partner_asset_access_body);

#endif /* _delete_partner_asset_access_body_H_ */

