/*
 * create_asset_invites_request_item.h
 *
 * Object declaring an asset role update to an invite.
 */

#ifndef _create_asset_invites_request_item_H_
#define _create_asset_invites_request_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_asset_invites_request_item_t create_asset_invites_request_item_t;

#include "invite_type.h"
#include "permissions.h"

// Enum  for create_asset_invites_request_item

typedef enum  { pinterest_rest_api_create_asset_invites_request_item__NULL = 0, pinterest_rest_api_create_asset_invites_request_item__MEMBER_INVITE, pinterest_rest_api_create_asset_invites_request_item__PARTNER_INVITE, pinterest_rest_api_create_asset_invites_request_item__PARTNER_REQUEST } pinterest_rest_api_create_asset_invites_request_item__e;

char* create_asset_invites_request_item_invite_type_ToString(pinterest_rest_api_create_asset_invites_request_item__e invite_type);

pinterest_rest_api_create_asset_invites_request_item__e create_asset_invites_request_item_invite_type_FromString(char* invite_type);

// Enum INNER for create_asset_invites_request_item

typedef enum  { pinterest_rest_api_create_asset_invites_request_item_INNER_NULL = 0, pinterest_rest_api_create_asset_invites_request_item_INNER_ADMIN, pinterest_rest_api_create_asset_invites_request_item_INNER_ANALYST, pinterest_rest_api_create_asset_invites_request_item_INNER_FINANCE_MANAGER, pinterest_rest_api_create_asset_invites_request_item_INNER_AUDIENCE_MANAGER, pinterest_rest_api_create_asset_invites_request_item_INNER_CAMPAIGN_MANAGER, pinterest_rest_api_create_asset_invites_request_item_INNER_CATALOGS_MANAGER, pinterest_rest_api_create_asset_invites_request_item_INNER_PROFILE_PUBLISHER } pinterest_rest_api_create_asset_invites_request_item_INNER_e;

char* create_asset_invites_request_item_inner_ToString(pinterest_rest_api_create_asset_invites_request_item_INNER_e inner);

pinterest_rest_api_create_asset_invites_request_item_INNER_e create_asset_invites_request_item_inner_FromString(char* inner);



typedef struct create_asset_invites_request_item_t {
    char *invite_id; // string
    invite_type_t *invite_type; // custom
    list_t* asset_id_to_permissions; //map

} create_asset_invites_request_item_t;

create_asset_invites_request_item_t *create_asset_invites_request_item_create(
    char *invite_id,
    invite_type_t *invite_type,
    list_t* asset_id_to_permissions
);

void create_asset_invites_request_item_free(create_asset_invites_request_item_t *create_asset_invites_request_item);

create_asset_invites_request_item_t *create_asset_invites_request_item_parseFromJSON(cJSON *create_asset_invites_request_itemJSON);

cJSON *create_asset_invites_request_item_convertToJSON(create_asset_invites_request_item_t *create_asset_invites_request_item);

#endif /* _create_asset_invites_request_item_H_ */

