/*
 * catalogs_delete_creative_assets_item.h
 *
 * A creative assets item to be deleted
 */

#ifndef _catalogs_delete_creative_assets_item_H_
#define _catalogs_delete_creative_assets_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_delete_creative_assets_item_t catalogs_delete_creative_assets_item_t;


// Enum OPERATION for catalogs_delete_creative_assets_item

typedef enum  { pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION_NULL = 0, pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION__DELETE } pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION_e;

char* catalogs_delete_creative_assets_item_operation_ToString(pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION_e operation);

pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION_e catalogs_delete_creative_assets_item_operation_FromString(char* operation);



typedef struct catalogs_delete_creative_assets_item_t {
    char *creative_assets_id; // string
    pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION_e operation; //enum

} catalogs_delete_creative_assets_item_t;

catalogs_delete_creative_assets_item_t *catalogs_delete_creative_assets_item_create(
    char *creative_assets_id,
    pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION_e operation
);

void catalogs_delete_creative_assets_item_free(catalogs_delete_creative_assets_item_t *catalogs_delete_creative_assets_item);

catalogs_delete_creative_assets_item_t *catalogs_delete_creative_assets_item_parseFromJSON(cJSON *catalogs_delete_creative_assets_itemJSON);

cJSON *catalogs_delete_creative_assets_item_convertToJSON(catalogs_delete_creative_assets_item_t *catalogs_delete_creative_assets_item);

#endif /* _catalogs_delete_creative_assets_item_H_ */

