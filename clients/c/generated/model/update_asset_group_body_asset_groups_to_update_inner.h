/*
 * update_asset_group_body_asset_groups_to_update_inner.h
 *
 * 
 */

#ifndef _update_asset_group_body_asset_groups_to_update_inner_H_
#define _update_asset_group_body_asset_groups_to_update_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_asset_group_body_asset_groups_to_update_inner_t update_asset_group_body_asset_groups_to_update_inner_t;

#include "asset_group_type.h"

// Enum  for update_asset_group_body_asset_groups_to_update_inner

typedef enum  { pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__NULL = 0, pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__BRAND, pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__LOCATION_OR_LANGUAGE, pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__PRODUCT_LINE, pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__OTHER } pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__e;

char* update_asset_group_body_asset_groups_to_update_inner_asset_group_types_ToString(pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__e asset_group_types);

pinterest_rest_api_update_asset_group_body_asset_groups_to_update_inner__e update_asset_group_body_asset_groups_to_update_inner_asset_group_types_FromString(char* asset_group_types);



typedef struct update_asset_group_body_asset_groups_to_update_inner_t {
    char *asset_group_id; // string
    char *name; // string
    char *description; // string
    list_t *asset_group_types; //nonprimitive container
    list_t *assets_to_add; //primitive container
    list_t *assets_to_remove; //primitive container

} update_asset_group_body_asset_groups_to_update_inner_t;

update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner_create(
    char *asset_group_id,
    char *name,
    char *description,
    list_t *asset_group_types,
    list_t *assets_to_add,
    list_t *assets_to_remove
);

void update_asset_group_body_asset_groups_to_update_inner_free(update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner);

update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner_parseFromJSON(cJSON *update_asset_group_body_asset_groups_to_update_innerJSON);

cJSON *update_asset_group_body_asset_groups_to_update_inner_convertToJSON(update_asset_group_body_asset_groups_to_update_inner_t *update_asset_group_body_asset_groups_to_update_inner);

#endif /* _update_asset_group_body_asset_groups_to_update_inner_H_ */

