/*
 * business_assets.h
 *
 * 
 */

#ifndef _business_assets_H_
#define _business_assets_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_assets_t business_assets_t;

#include "asset_group_binding.h"
#include "asset_type_response.h"
#include "catalog_binding.h"



typedef struct business_assets_t {
    struct asset_group_binding_t *asset_group_info; //model
    char *asset_id; // string
    pinterest_rest_api_asset_type_response__e asset_type; //referenced enum
    list_t *permissions; //primitive container
    struct catalog_binding_t *catalog_info; //model

    int _library_owned; // Is the library responsible for freeing this object?
} business_assets_t;

__attribute__((deprecated)) business_assets_t *business_assets_create(
    asset_group_binding_t *asset_group_info,
    char *asset_id,
    pinterest_rest_api_asset_type_response__e asset_type,
    list_t *permissions,
    catalog_binding_t *catalog_info
);

void business_assets_free(business_assets_t *business_assets);

business_assets_t *business_assets_parseFromJSON(cJSON *business_assetsJSON);

cJSON *business_assets_convertToJSON(business_assets_t *business_assets);

#endif /* _business_assets_H_ */

