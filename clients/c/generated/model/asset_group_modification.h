/*
 * asset_group_modification.h
 *
 * 
 */

#ifndef _asset_group_modification_H_
#define _asset_group_modification_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_modification_t asset_group_modification_t;

#include "asset_group_binding.h"
#include "asset_group_update_error.h"



typedef struct asset_group_modification_t {
    list_t *exceptions; //nonprimitive container
    list_t *updated_asset_groups; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_modification_t;

__attribute__((deprecated)) asset_group_modification_t *asset_group_modification_create(
    list_t *exceptions,
    list_t *updated_asset_groups
);

void asset_group_modification_free(asset_group_modification_t *asset_group_modification);

asset_group_modification_t *asset_group_modification_parseFromJSON(cJSON *asset_group_modificationJSON);

cJSON *asset_group_modification_convertToJSON(asset_group_modification_t *asset_group_modification);

#endif /* _asset_group_modification_H_ */

