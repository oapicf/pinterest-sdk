/*
 * asset_group_deletion.h
 *
 * 
 */

#ifndef _asset_group_deletion_H_
#define _asset_group_deletion_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_deletion_t asset_group_deletion_t;

#include "asset_group_delete_error.h"



typedef struct asset_group_deletion_t {
    list_t *deleted_asset_groups; //primitive container
    list_t *exceptions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_deletion_t;

__attribute__((deprecated)) asset_group_deletion_t *asset_group_deletion_create(
    list_t *deleted_asset_groups,
    list_t *exceptions
);

void asset_group_deletion_free(asset_group_deletion_t *asset_group_deletion);

asset_group_deletion_t *asset_group_deletion_parseFromJSON(cJSON *asset_group_deletionJSON);

cJSON *asset_group_deletion_convertToJSON(asset_group_deletion_t *asset_group_deletion);

#endif /* _asset_group_deletion_H_ */

