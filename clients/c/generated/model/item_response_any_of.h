/*
 * item_response_any_of.h
 *
 * 
 */

#ifndef _item_response_any_of_H_
#define _item_response_any_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_response_any_of_t item_response_any_of_t;

#include "catalogs_creative_assets_attributes.h"
#include "catalogs_creative_assets_item_response.h"
#include "catalogs_hotel_item_response.h"
#include "catalogs_retail_item_response.h"
#include "catalogs_type.h"
#include "pin.h"

// Enum  for item_response_any_of

typedef enum  { pinterest_rest_api_item_response_any_of__NULL = 0, pinterest_rest_api_item_response_any_of__RETAIL, pinterest_rest_api_item_response_any_of__HOTEL, pinterest_rest_api_item_response_any_of__CREATIVE_ASSETS } pinterest_rest_api_item_response_any_of__e;

char* item_response_any_of_catalog_type_ToString(pinterest_rest_api_item_response_any_of__e catalog_type);

pinterest_rest_api_item_response_any_of__e item_response_any_of_catalog_type_FromString(char* catalog_type);



typedef struct item_response_any_of_t {
    catalogs_type_t *catalog_type; // custom
    char *item_id; // string
    list_t *pins; //nonprimitive container
    struct catalogs_creative_assets_attributes_t *attributes; //model
    char *hotel_id; // string
    char *creative_assets_id; // string

} item_response_any_of_t;

item_response_any_of_t *item_response_any_of_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *pins,
    catalogs_creative_assets_attributes_t *attributes,
    char *hotel_id,
    char *creative_assets_id
);

void item_response_any_of_free(item_response_any_of_t *item_response_any_of);

item_response_any_of_t *item_response_any_of_parseFromJSON(cJSON *item_response_any_ofJSON);

cJSON *item_response_any_of_convertToJSON(item_response_any_of_t *item_response_any_of);

#endif /* _item_response_any_of_H_ */

