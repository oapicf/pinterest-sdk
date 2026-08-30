/*
 * asset_permission_type.h
 *
 * Permission aggregation type for asset access
 */

#ifndef _asset_permission_type_H_
#define _asset_permission_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_permission_type_t asset_permission_type_t;


// Enum  for asset_permission_type

typedef enum { pinterest_rest_api_asset_permission_type__NULL = 0, pinterest_rest_api_asset_permission_type__AGGREGATED_PERMISSION, pinterest_rest_api_asset_permission_type__DIRECT_PERMISSION } pinterest_rest_api_asset_permission_type__e;

char* asset_permission_type_asset_permission_type_ToString(pinterest_rest_api_asset_permission_type__e asset_permission_type);

pinterest_rest_api_asset_permission_type__e asset_permission_type_asset_permission_type_FromString(char* asset_permission_type);

cJSON *asset_permission_type_convertToJSON(pinterest_rest_api_asset_permission_type__e asset_permission_type);

pinterest_rest_api_asset_permission_type__e asset_permission_type_parseFromJSON(cJSON *asset_permission_typeJSON);

#endif /* _asset_permission_type_H_ */

