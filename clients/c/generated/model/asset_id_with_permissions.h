/*
 * asset_id_with_permissions.h
 *
 * Asset ID with permission levels.
 */

#ifndef _asset_id_with_permissions_H_
#define _asset_id_with_permissions_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_id_with_permissions_t asset_id_with_permissions_t;




typedef struct asset_id_with_permissions_t {
    char *id; // string
    list_t *permissions; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} asset_id_with_permissions_t;

__attribute__((deprecated)) asset_id_with_permissions_t *asset_id_with_permissions_create(
    char *id,
    list_t *permissions
);

void asset_id_with_permissions_free(asset_id_with_permissions_t *asset_id_with_permissions);

asset_id_with_permissions_t *asset_id_with_permissions_parseFromJSON(cJSON *asset_id_with_permissionsJSON);

cJSON *asset_id_with_permissions_convertToJSON(asset_id_with_permissions_t *asset_id_with_permissions);

#endif /* _asset_id_with_permissions_H_ */

