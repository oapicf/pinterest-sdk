/*
 * asset_search_by.h
 *
 * The field to search member assets by
 */

#ifndef _asset_search_by_H_
#define _asset_search_by_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_search_by_t asset_search_by_t;


// Enum  for asset_search_by

typedef enum { pinterest_rest_api_asset_search_by__NULL = 0, pinterest_rest_api_asset_search_by__NAME, pinterest_rest_api_asset_search_by__ID, pinterest_rest_api_asset_search_by__NAME_OR_ID, pinterest_rest_api_asset_search_by__OWNER_NAME, pinterest_rest_api_asset_search_by__NAME_OR_OWNER } pinterest_rest_api_asset_search_by__e;

char* asset_search_by_asset_search_by_ToString(pinterest_rest_api_asset_search_by__e asset_search_by);

pinterest_rest_api_asset_search_by__e asset_search_by_asset_search_by_FromString(char* asset_search_by);

cJSON *asset_search_by_convertToJSON(pinterest_rest_api_asset_search_by__e asset_search_by);

pinterest_rest_api_asset_search_by__e asset_search_by_parseFromJSON(cJSON *asset_search_byJSON);

#endif /* _asset_search_by_H_ */

