/*
 * item_response.h
 *
 * Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
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
#include "catalogs_creative_assets_item_error_response.h"
#include "catalogs_creative_assets_item_response.h"
#include "catalogs_hotel_item_error_response.h"
#include "catalogs_hotel_item_response.h"
#include "catalogs_retail_item_error_response.h"
#include "catalogs_retail_item_response.h"
#include "item_validation_event.h"
#include "pin.h"

// Enum CATALOGTYPE for item_response

typedef enum  { pinterest_rest_api_item_response_CATALOGTYPE_NULL = 0, pinterest_rest_api_item_response_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_item_response_CATALOGTYPE_e;

char* item_response_catalog_type_ToString(pinterest_rest_api_item_response_CATALOGTYPE_e catalog_type);

pinterest_rest_api_item_response_CATALOGTYPE_e item_response_catalog_type_FromString(char* catalog_type);

// Enum ITEMRESPONSEKIND for item_response

typedef enum  { pinterest_rest_api_item_response_ITEMRESPONSEKIND_NULL = 0, pinterest_rest_api_item_response_ITEMRESPONSEKIND_creative_assets_item_error } pinterest_rest_api_item_response_ITEMRESPONSEKIND_e;

char* item_response_item_response_kind_ToString(pinterest_rest_api_item_response_ITEMRESPONSEKIND_e item_response_kind);

pinterest_rest_api_item_response_ITEMRESPONSEKIND_e item_response_item_response_kind_FromString(char* item_response_kind);



typedef struct item_response_t {
    struct catalogs_creative_assets_attributes_t *attributes; //model
    pinterest_rest_api_item_response_CATALOGTYPE_e catalog_type; //enum
    char *item_id; // string
    pinterest_rest_api_item_response_ITEMRESPONSEKIND_e item_response_kind; //enum
    list_t *pins; //nonprimitive container
    char *hotel_id; // string
    char *creative_assets_id; // string
    list_t *errors; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} item_response_t;

__attribute__((deprecated)) item_response_t *item_response_create(
    catalogs_creative_assets_attributes_t *attributes,
    pinterest_rest_api_item_response_CATALOGTYPE_e catalog_type,
    char *item_id,
    pinterest_rest_api_item_response_ITEMRESPONSEKIND_e item_response_kind,
    list_t *pins,
    char *hotel_id,
    char *creative_assets_id,
    list_t *errors
);

void item_response_free(item_response_t *item_response);

item_response_t *item_response_parseFromJSON(cJSON *item_responseJSON);

cJSON *item_response_convertToJSON(item_response_t *item_response);

#endif /* _item_response_H_ */

