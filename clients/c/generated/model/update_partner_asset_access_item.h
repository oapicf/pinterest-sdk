/*
 * update_partner_asset_access_item.h
 *
 * 
 */

#ifndef _update_partner_asset_access_item_H_
#define _update_partner_asset_access_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_partner_asset_access_item_t update_partner_asset_access_item_t;

#include "permissions.h"

// Enum  for update_partner_asset_access_item

typedef enum  { pinterest_rest_api_update_partner_asset_access_item__NULL = 0, pinterest_rest_api_update_partner_asset_access_item__ADMIN, pinterest_rest_api_update_partner_asset_access_item__ANALYST, pinterest_rest_api_update_partner_asset_access_item__FINANCE_MANAGER, pinterest_rest_api_update_partner_asset_access_item__FINANCE_EDIT, pinterest_rest_api_update_partner_asset_access_item__FINANCE_VIEW, pinterest_rest_api_update_partner_asset_access_item__AUDIENCE_MANAGER, pinterest_rest_api_update_partner_asset_access_item__CAMPAIGN_MANAGER, pinterest_rest_api_update_partner_asset_access_item__CATALOGS_MANAGER, pinterest_rest_api_update_partner_asset_access_item__CATALOGS_VIEWER, pinterest_rest_api_update_partner_asset_access_item__PROFILE_PUBLISHER, pinterest_rest_api_update_partner_asset_access_item__CONSUMER_USER, pinterest_rest_api_update_partner_asset_access_item__BIZ_PINNER_LIST_SHARER } pinterest_rest_api_update_partner_asset_access_item__e;

char* update_partner_asset_access_item_permissions_ToString(pinterest_rest_api_update_partner_asset_access_item__e permissions);

pinterest_rest_api_update_partner_asset_access_item__e update_partner_asset_access_item_permissions_FromString(char* permissions);



typedef struct update_partner_asset_access_item_t {
    char *asset_id; // string
    char *partner_id; // string
    list_t *permissions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} update_partner_asset_access_item_t;

__attribute__((deprecated)) update_partner_asset_access_item_t *update_partner_asset_access_item_create(
    char *asset_id,
    char *partner_id,
    list_t *permissions
);

void update_partner_asset_access_item_free(update_partner_asset_access_item_t *update_partner_asset_access_item);

update_partner_asset_access_item_t *update_partner_asset_access_item_parseFromJSON(cJSON *update_partner_asset_access_itemJSON);

cJSON *update_partner_asset_access_item_convertToJSON(update_partner_asset_access_item_t *update_partner_asset_access_item);

#endif /* _update_partner_asset_access_item_H_ */

