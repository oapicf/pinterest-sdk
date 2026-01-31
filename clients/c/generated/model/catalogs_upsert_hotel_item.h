/*
 * catalogs_upsert_hotel_item.h
 *
 * A hotel item to be upserted.
 */

#ifndef _catalogs_upsert_hotel_item_H_
#define _catalogs_upsert_hotel_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_upsert_hotel_item_t catalogs_upsert_hotel_item_t;

#include "catalogs_hotel_attributes.h"

// Enum OPERATION for catalogs_upsert_hotel_item

typedef enum  { pinterest_rest_api_catalogs_upsert_hotel_item_OPERATION_NULL = 0, pinterest_rest_api_catalogs_upsert_hotel_item_OPERATION_UPSERT } pinterest_rest_api_catalogs_upsert_hotel_item_OPERATION_e;

char* catalogs_upsert_hotel_item_operation_ToString(pinterest_rest_api_catalogs_upsert_hotel_item_OPERATION_e operation);

pinterest_rest_api_catalogs_upsert_hotel_item_OPERATION_e catalogs_upsert_hotel_item_operation_FromString(char* operation);



typedef struct catalogs_upsert_hotel_item_t {
    struct catalogs_hotel_attributes_t *attributes; //model
    char *hotel_id; // string
    pinterest_rest_api_catalogs_upsert_hotel_item_OPERATION_e operation; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_upsert_hotel_item_t;

__attribute__((deprecated)) catalogs_upsert_hotel_item_t *catalogs_upsert_hotel_item_create(
    catalogs_hotel_attributes_t *attributes,
    char *hotel_id,
    pinterest_rest_api_catalogs_upsert_hotel_item_OPERATION_e operation
);

void catalogs_upsert_hotel_item_free(catalogs_upsert_hotel_item_t *catalogs_upsert_hotel_item);

catalogs_upsert_hotel_item_t *catalogs_upsert_hotel_item_parseFromJSON(cJSON *catalogs_upsert_hotel_itemJSON);

cJSON *catalogs_upsert_hotel_item_convertToJSON(catalogs_upsert_hotel_item_t *catalogs_upsert_hotel_item);

#endif /* _catalogs_upsert_hotel_item_H_ */

