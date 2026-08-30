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
#include "asset_type_response.h"



typedef struct asset_id_permissions_t {
    struct asset_group_binding_t *asset_group_info; //model
    char *asset_id; // string
    pinterest_rest_api_asset_type_response__e asset_type; //referenced enum
    list_t *permissions; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} asset_id_permissions_t;

__attribute__((deprecated)) asset_id_permissions_t *asset_id_permissions_create(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions
);

void asset_id_permissions_free(asset_id_permissions_t *asset_id_permissions);

asset_id_permissions_t *asset_id_permissions_parseFromJSON(cJSON *asset_id_permissionsJSON);

cJSON *asset_id_permissions_convertToJSON(asset_id_permissions_t *asset_id_permissions);

#endif /* _asset_id_permissions_H_ */

