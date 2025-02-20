/*
 * get_business_asset_type_response.h
 *
 * Type of asset.
 */

#ifndef _get_business_asset_type_response_H_
#define _get_business_asset_type_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_business_asset_type_response_t get_business_asset_type_response_t;


// Enum  for get_business_asset_type_response

typedef enum { pinterest_rest_api_get_business_asset_type_response__NULL = 0, pinterest_rest_api_get_business_asset_type_response__AD_ACCOUNT, pinterest_rest_api_get_business_asset_type_response__PROFILE, pinterest_rest_api_get_business_asset_type_response__ASSET_GROUP, pinterest_rest_api_get_business_asset_type_response__CONVERSION_TAG } pinterest_rest_api_get_business_asset_type_response__e;

char* get_business_asset_type_response_get_business_asset_type_response_ToString(pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_response);

pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_response_get_business_asset_type_response_FromString(char* get_business_asset_type_response);

//cJSON *get_business_asset_type_response_get_business_asset_type_response_convertToJSON(pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_response);

//pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_response_get_business_asset_type_response_parseFromJSON(cJSON *get_business_asset_type_responseJSON);

#endif /* _get_business_asset_type_response_H_ */

