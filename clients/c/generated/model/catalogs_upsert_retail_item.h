/*
 * catalogs_upsert_retail_item.h
 *
 * An item to be upserted
 */

#ifndef _catalogs_upsert_retail_item_H_
#define _catalogs_upsert_retail_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_upsert_retail_item_t catalogs_upsert_retail_item_t;

#include "item_attributes.h"

// Enum OPERATION for catalogs_upsert_retail_item

typedef enum  { pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_NULL = 0, pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_CREATE, pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_UPDATE, pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_UPSERT, pinterest_rest_api_catalogs_upsert_retail_item_OPERATION__DELETE } pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e;

char* catalogs_upsert_retail_item_operation_ToString(pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e operation);

pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e catalogs_upsert_retail_item_operation_FromString(char* operation);



typedef struct catalogs_upsert_retail_item_t {
    char *item_id; // string
    pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e operation; //enum
    struct item_attributes_t *attributes; //model

} catalogs_upsert_retail_item_t;

catalogs_upsert_retail_item_t *catalogs_upsert_retail_item_create(
    char *item_id,
    pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e operation,
    item_attributes_t *attributes
);

void catalogs_upsert_retail_item_free(catalogs_upsert_retail_item_t *catalogs_upsert_retail_item);

catalogs_upsert_retail_item_t *catalogs_upsert_retail_item_parseFromJSON(cJSON *catalogs_upsert_retail_itemJSON);

cJSON *catalogs_upsert_retail_item_convertToJSON(catalogs_upsert_retail_item_t *catalogs_upsert_retail_item);

#endif /* _catalogs_upsert_retail_item_H_ */

