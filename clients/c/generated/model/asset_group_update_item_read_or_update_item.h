/*
 * asset_group_update_item_read_or_update_item.h
 *
 * 
 */

#ifndef _asset_group_update_item_read_or_update_item_H_
#define _asset_group_update_item_read_or_update_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_update_item_read_or_update_item_t asset_group_update_item_read_or_update_item_t;

#include "asset_group_type.h"

// Enum  for asset_group_update_item_read_or_update_item

typedef enum  { pinterest_rest_api_asset_group_update_item_read_or_update_item__NULL = 0, pinterest_rest_api_asset_group_update_item_read_or_update_item__BRAND, pinterest_rest_api_asset_group_update_item_read_or_update_item__LOCATION_OR_LANGUAGE, pinterest_rest_api_asset_group_update_item_read_or_update_item__PRODUCT_LINE, pinterest_rest_api_asset_group_update_item_read_or_update_item__OTHER } pinterest_rest_api_asset_group_update_item_read_or_update_item__e;

char* asset_group_update_item_read_or_update_item_asset_group_types_ToString(pinterest_rest_api_asset_group_update_item_read_or_update_item__e asset_group_types);

pinterest_rest_api_asset_group_update_item_read_or_update_item__e asset_group_update_item_read_or_update_item_asset_group_types_FromString(char* asset_group_types);



typedef struct asset_group_update_item_read_or_update_item_t {
    char *asset_group_id; // string
    list_t *asset_group_types; //nonprimitive container
    list_t *assets_to_add; //primitive container
    list_t *assets_to_remove; //primitive container
    char *description; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_update_item_read_or_update_item_t;

__attribute__((deprecated)) asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item_create(
    char *asset_group_id,
    list_t *asset_group_types,
    list_t *assets_to_add,
    list_t *assets_to_remove,
    char *description,
    char *name
);

void asset_group_update_item_read_or_update_item_free(asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item);

asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item_parseFromJSON(cJSON *asset_group_update_item_read_or_update_itemJSON);

cJSON *asset_group_update_item_read_or_update_item_convertToJSON(asset_group_update_item_read_or_update_item_t *asset_group_update_item_read_or_update_item);

#endif /* _asset_group_update_item_read_or_update_item_H_ */

