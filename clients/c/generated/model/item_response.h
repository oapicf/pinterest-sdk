/*
 * item_response.h
 *
 * Object describing an item record
 */

#ifndef _item_response_H_
#define _item_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_response_t item_response_t;

#include "catalogs_creative_assets_attributes.h"
#include "catalogs_type.h"
#include "item_response_any_of.h"
#include "item_response_any_of_1.h"
#include "item_validation_event.h"
#include "pin.h"

// Enum  for item_response

typedef enum  { pinterest_rest_api_item_response__NULL = 0, pinterest_rest_api_item_response__RETAIL, pinterest_rest_api_item_response__HOTEL, pinterest_rest_api_item_response__CREATIVE_ASSETS } pinterest_rest_api_item_response__e;

char* item_response_catalog_type_ToString(pinterest_rest_api_item_response__e catalog_type);

pinterest_rest_api_item_response__e item_response_catalog_type_FromString(char* catalog_type);



typedef struct item_response_t {
    catalogs_type_t *catalog_type; // custom
    char *item_id; // string
    list_t *pins; //nonprimitive container
    struct catalogs_creative_assets_attributes_t *attributes; //model
    char *hotel_id; // string
    char *creative_assets_id; // string
    list_t *errors; //nonprimitive container

} item_response_t;

item_response_t *item_response_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *pins,
    catalogs_creative_assets_attributes_t *attributes,
    char *hotel_id,
    char *creative_assets_id,
    list_t *errors
);

void item_response_free(item_response_t *item_response);

item_response_t *item_response_parseFromJSON(cJSON *item_responseJSON);

cJSON *item_response_convertToJSON(item_response_t *item_response);

#endif /* _item_response_H_ */

