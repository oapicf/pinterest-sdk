/*
 * catalogs_hotel_batch_item.h
 *
 * Hotel batch item
 */

#ifndef _catalogs_hotel_batch_item_H_
#define _catalogs_hotel_batch_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_batch_item_t catalogs_hotel_batch_item_t;

#include "catalogs_create_hotel_item.h"
#include "catalogs_delete_hotel_item.h"
#include "catalogs_updatable_hotel_attributes.h"
#include "catalogs_update_hotel_item.h"
#include "catalogs_upsert_hotel_item.h"

// Enum OPERATION for catalogs_hotel_batch_item

typedef enum  { pinterest_rest_api_catalogs_hotel_batch_item_OPERATION_NULL = 0, pinterest_rest_api_catalogs_hotel_batch_item_OPERATION__DELETE } pinterest_rest_api_catalogs_hotel_batch_item_OPERATION_e;

char* catalogs_hotel_batch_item_operation_ToString(pinterest_rest_api_catalogs_hotel_batch_item_OPERATION_e operation);

pinterest_rest_api_catalogs_hotel_batch_item_OPERATION_e catalogs_hotel_batch_item_operation_FromString(char* operation);



typedef struct catalogs_hotel_batch_item_t {
    char *hotel_id; // string
    pinterest_rest_api_catalogs_hotel_batch_item_OPERATION_e operation; //enum
    struct catalogs_updatable_hotel_attributes_t *attributes; //model

} catalogs_hotel_batch_item_t;

catalogs_hotel_batch_item_t *catalogs_hotel_batch_item_create(
    char *hotel_id,
    pinterest_rest_api_catalogs_hotel_batch_item_OPERATION_e operation,
    catalogs_updatable_hotel_attributes_t *attributes
);

void catalogs_hotel_batch_item_free(catalogs_hotel_batch_item_t *catalogs_hotel_batch_item);

catalogs_hotel_batch_item_t *catalogs_hotel_batch_item_parseFromJSON(cJSON *catalogs_hotel_batch_itemJSON);

cJSON *catalogs_hotel_batch_item_convertToJSON(catalogs_hotel_batch_item_t *catalogs_hotel_batch_item);

#endif /* _catalogs_hotel_batch_item_H_ */

