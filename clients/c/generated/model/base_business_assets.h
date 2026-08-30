/*
 * base_business_assets.h
 *
 * An object containing the permissions a business has on the asset.
 */

#ifndef _base_business_assets_H_
#define _base_business_assets_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct base_business_assets_t base_business_assets_t;

#include "asset_group_binding.h"
#include "asset_type_response.h"



typedef struct base_business_assets_t {
    struct asset_group_binding_t *asset_group_info; //model
    char *asset_id; // string
    pinterest_rest_api_asset_type_response__e asset_type; //referenced enum
    list_t *permissions; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} base_business_assets_t;

__attribute__((deprecated)) base_business_assets_t *base_business_assets_create(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions
);

void base_business_assets_free(base_business_assets_t *base_business_assets);

base_business_assets_t *base_business_assets_parseFromJSON(cJSON *base_business_assetsJSON);

cJSON *base_business_assets_convertToJSON(base_business_assets_t *base_business_assets);

#endif /* _base_business_assets_H_ */

