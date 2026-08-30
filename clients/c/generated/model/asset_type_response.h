/*
 * asset_type_response.h
 *
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 */

#ifndef _asset_type_response_H_
#define _asset_type_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_type_response_t asset_type_response_t;


// Enum  for asset_type_response

typedef enum { pinterest_rest_api_asset_type_response__NULL = 0, pinterest_rest_api_asset_type_response__AD_ACCOUNT, pinterest_rest_api_asset_type_response__MERCHANT, pinterest_rest_api_asset_type_response__PROFILE, pinterest_rest_api_asset_type_response__ASSET_GROUP, pinterest_rest_api_asset_type_response__PINNER_LIST, pinterest_rest_api_asset_type_response__CONVERSION_TAG, pinterest_rest_api_asset_type_response__CATALOG, pinterest_rest_api_asset_type_response__CONVERSION_SEGMENT } pinterest_rest_api_asset_type_response__e;

char* asset_type_response_asset_type_response_ToString(pinterest_rest_api_asset_type_response__e asset_type_response);

pinterest_rest_api_asset_type_response__e asset_type_response_asset_type_response_FromString(char* asset_type_response);

cJSON *asset_type_response_convertToJSON(pinterest_rest_api_asset_type_response__e asset_type_response);

pinterest_rest_api_asset_type_response__e asset_type_response_parseFromJSON(cJSON *asset_type_responseJSON);

#endif /* _asset_type_response_H_ */

