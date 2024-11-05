/*
 * asset_id_permissions.h
 *
 * An object containing the permissions a business member has on the asset.
 */

#ifndef _asset_id_permissions_H_
#define _asset_id_permissions_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_id_permissions_t asset_id_permissions_t;

#include "asset_group_binding.h"



typedef struct asset_id_permissions_t {
    char *asset_id; // string
    char *asset_type; // string
    list_t *permissions; //primitive container
    struct asset_group_binding_t *asset_group_info; //model

} asset_id_permissions_t;

asset_id_permissions_t *asset_id_permissions_create(
    char *asset_id,
    char *asset_type,
    list_t *permissions,
    asset_group_binding_t *asset_group_info
);

void asset_id_permissions_free(asset_id_permissions_t *asset_id_permissions);

asset_id_permissions_t *asset_id_permissions_parseFromJSON(cJSON *asset_id_permissionsJSON);

cJSON *asset_id_permissions_convertToJSON(asset_id_permissions_t *asset_id_permissions);

#endif /* _asset_id_permissions_H_ */

