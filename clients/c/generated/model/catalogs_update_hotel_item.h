/*
 * catalogs_update_hotel_item.h
 *
 * Object describing an hotel item batch record
 */

#ifndef _catalogs_update_hotel_item_H_
#define _catalogs_update_hotel_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_update_hotel_item_t catalogs_update_hotel_item_t;

#include "catalogs_updatable_hotel_attributes.h"

// Enum OPERATION for catalogs_update_hotel_item

typedef enum  { pinterest_rest_api_catalogs_update_hotel_item_OPERATION_NULL = 0, pinterest_rest_api_catalogs_update_hotel_item_OPERATION_UPDATE } pinterest_rest_api_catalogs_update_hotel_item_OPERATION_e;

char* catalogs_update_hotel_item_operation_ToString(pinterest_rest_api_catalogs_update_hotel_item_OPERATION_e operation);

pinterest_rest_api_catalogs_update_hotel_item_OPERATION_e catalogs_update_hotel_item_operation_FromString(char* operation);



typedef struct catalogs_update_hotel_item_t {
    char *hotel_id; // string
    pinterest_rest_api_catalogs_update_hotel_item_OPERATION_e operation; //enum
    struct catalogs_updatable_hotel_attributes_t *attributes; //model

} catalogs_update_hotel_item_t;

catalogs_update_hotel_item_t *catalogs_update_hotel_item_create(
    char *hotel_id,
    pinterest_rest_api_catalogs_update_hotel_item_OPERATION_e operation,
    catalogs_updatable_hotel_attributes_t *attributes
);

void catalogs_update_hotel_item_free(catalogs_update_hotel_item_t *catalogs_update_hotel_item);

catalogs_update_hotel_item_t *catalogs_update_hotel_item_parseFromJSON(cJSON *catalogs_update_hotel_itemJSON);

cJSON *catalogs_update_hotel_item_convertToJSON(catalogs_update_hotel_item_t *catalogs_update_hotel_item);

#endif /* _catalogs_update_hotel_item_H_ */

