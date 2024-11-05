/*
 * catalogs_creative_assets_batch_item.h
 *
 * Creative assets batch item
 */

#ifndef _catalogs_creative_assets_batch_item_H_
#define _catalogs_creative_assets_batch_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_batch_item_t catalogs_creative_assets_batch_item_t;

#include "catalogs_create_creative_assets_item.h"
#include "catalogs_delete_creative_assets_item.h"
#include "catalogs_updatable_creative_assets_attributes.h"
#include "catalogs_update_creative_assets_item.h"
#include "catalogs_upsert_creative_assets_item.h"

// Enum OPERATION for catalogs_creative_assets_batch_item

typedef enum  { pinterest_rest_api_catalogs_creative_assets_batch_item_OPERATION_NULL = 0, pinterest_rest_api_catalogs_creative_assets_batch_item_OPERATION__DELETE } pinterest_rest_api_catalogs_creative_assets_batch_item_OPERATION_e;

char* catalogs_creative_assets_batch_item_operation_ToString(pinterest_rest_api_catalogs_creative_assets_batch_item_OPERATION_e operation);

pinterest_rest_api_catalogs_creative_assets_batch_item_OPERATION_e catalogs_creative_assets_batch_item_operation_FromString(char* operation);



typedef struct catalogs_creative_assets_batch_item_t {
    char *creative_assets_id; // string
    pinterest_rest_api_catalogs_creative_assets_batch_item_OPERATION_e operation; //enum
    struct catalogs_updatable_creative_assets_attributes_t *attributes; //model

} catalogs_creative_assets_batch_item_t;

catalogs_creative_assets_batch_item_t *catalogs_creative_assets_batch_item_create(
    char *creative_assets_id,
    pinterest_rest_api_catalogs_creative_assets_batch_item_OPERATION_e operation,
    catalogs_updatable_creative_assets_attributes_t *attributes
);

void catalogs_creative_assets_batch_item_free(catalogs_creative_assets_batch_item_t *catalogs_creative_assets_batch_item);

catalogs_creative_assets_batch_item_t *catalogs_creative_assets_batch_item_parseFromJSON(cJSON *catalogs_creative_assets_batch_itemJSON);

cJSON *catalogs_creative_assets_batch_item_convertToJSON(catalogs_creative_assets_batch_item_t *catalogs_creative_assets_batch_item);

#endif /* _catalogs_creative_assets_batch_item_H_ */

