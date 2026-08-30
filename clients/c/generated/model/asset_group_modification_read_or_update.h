/*
 * asset_group_modification_read_or_update.h
 *
 * 
 */

#ifndef _asset_group_modification_read_or_update_H_
#define _asset_group_modification_read_or_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_modification_read_or_update_t asset_group_modification_read_or_update_t;

#include "asset_group_binding.h"
#include "asset_group_update_error.h"
#include "asset_group_update_item_read_or_update_item.h"



typedef struct asset_group_modification_read_or_update_t {
    list_t *asset_groups_to_update; //nonprimitive container
    list_t *exceptions; //nonprimitive container
    list_t *updated_asset_groups; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_modification_read_or_update_t;

__attribute__((deprecated)) asset_group_modification_read_or_update_t *asset_group_modification_read_or_update_create(
    list_t *asset_groups_to_update,
    list_t *exceptions,
    list_t *updated_asset_groups
);

void asset_group_modification_read_or_update_free(asset_group_modification_read_or_update_t *asset_group_modification_read_or_update);

asset_group_modification_read_or_update_t *asset_group_modification_read_or_update_parseFromJSON(cJSON *asset_group_modification_read_or_updateJSON);

cJSON *asset_group_modification_read_or_update_convertToJSON(asset_group_modification_read_or_update_t *asset_group_modification_read_or_update);

#endif /* _asset_group_modification_read_or_update_H_ */

