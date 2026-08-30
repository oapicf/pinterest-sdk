/*
 * asset_sort_by.h
 *
 * The field to sort member assets by
 */

#ifndef _asset_sort_by_H_
#define _asset_sort_by_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_sort_by_t asset_sort_by_t;


// Enum  for asset_sort_by

typedef enum { pinterest_rest_api_asset_sort_by__NULL = 0, pinterest_rest_api_asset_sort_by__NAME, pinterest_rest_api_asset_sort_by__ID, pinterest_rest_api_asset_sort_by__PERMISSIONS } pinterest_rest_api_asset_sort_by__e;

char* asset_sort_by_asset_sort_by_ToString(pinterest_rest_api_asset_sort_by__e asset_sort_by);

pinterest_rest_api_asset_sort_by__e asset_sort_by_asset_sort_by_FromString(char* asset_sort_by);

cJSON *asset_sort_by_convertToJSON(pinterest_rest_api_asset_sort_by__e asset_sort_by);

pinterest_rest_api_asset_sort_by__e asset_sort_by_parseFromJSON(cJSON *asset_sort_byJSON);

#endif /* _asset_sort_by_H_ */

