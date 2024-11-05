/*
 * asset_group_type.h
 *
 * Asset group type
 */

#ifndef _asset_group_type_H_
#define _asset_group_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_type_t asset_group_type_t;


// Enum  for asset_group_type

typedef enum { pinterest_rest_api_asset_group_type__NULL = 0, pinterest_rest_api_asset_group_type__BRAND, pinterest_rest_api_asset_group_type__LOCATION_OR_LANGUAGE, pinterest_rest_api_asset_group_type__PRODUCT_LINE, pinterest_rest_api_asset_group_type__OTHER } pinterest_rest_api_asset_group_type__e;

char* asset_group_type_asset_group_type_ToString(pinterest_rest_api_asset_group_type__e asset_group_type);

pinterest_rest_api_asset_group_type__e asset_group_type_asset_group_type_FromString(char* asset_group_type);

//cJSON *asset_group_type_asset_group_type_convertToJSON(pinterest_rest_api_asset_group_type__e asset_group_type);

//pinterest_rest_api_asset_group_type__e asset_group_type_asset_group_type_parseFromJSON(cJSON *asset_group_typeJSON);

#endif /* _asset_group_type_H_ */

