/*
 * catalogs_creative_assets_item_response.h
 *
 * Object describing a creative assets item record
 */

#ifndef _catalogs_creative_assets_item_response_H_
#define _catalogs_creative_assets_item_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_item_response_t catalogs_creative_assets_item_response_t;

#include "catalogs_creative_assets_attributes.h"
#include "pin.h"

// Enum CATALOGTYPE for catalogs_creative_assets_item_response

typedef enum  { pinterest_rest_api_catalogs_creative_assets_item_response_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_creative_assets_item_response_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_catalogs_creative_assets_item_response_CATALOGTYPE_e;

char* catalogs_creative_assets_item_response_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_item_response_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_creative_assets_item_response_CATALOGTYPE_e catalogs_creative_assets_item_response_catalog_type_FromString(char* catalog_type);

// Enum ITEMRESPONSEKIND for catalogs_creative_assets_item_response

typedef enum  { pinterest_rest_api_catalogs_creative_assets_item_response_ITEMRESPONSEKIND_NULL = 0, pinterest_rest_api_catalogs_creative_assets_item_response_ITEMRESPONSEKIND_creative_assets_item } pinterest_rest_api_catalogs_creative_assets_item_response_ITEMRESPONSEKIND_e;

char* catalogs_creative_assets_item_response_item_response_kind_ToString(pinterest_rest_api_catalogs_creative_assets_item_response_ITEMRESPONSEKIND_e item_response_kind);

pinterest_rest_api_catalogs_creative_assets_item_response_ITEMRESPONSEKIND_e catalogs_creative_assets_item_response_item_response_kind_FromString(char* item_response_kind);



typedef struct catalogs_creative_assets_item_response_t {
    struct catalogs_creative_assets_attributes_t *attributes; //model
    pinterest_rest_api_catalogs_creative_assets_item_response_CATALOGTYPE_e catalog_type; //enum
    char *creative_assets_id; // string
    pinterest_rest_api_catalogs_creative_assets_item_response_ITEMRESPONSEKIND_e item_response_kind; //enum
    list_t *pins; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_creative_assets_item_response_t;

__attribute__((deprecated)) catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response_create(
    catalogs_creative_assets_attributes_t *attributes,
    pinterest_rest_api_catalogs_creative_assets_item_response_CATALOGTYPE_e catalog_type,
    char *creative_assets_id,
    pinterest_rest_api_catalogs_creative_assets_item_response_ITEMRESPONSEKIND_e item_response_kind,
    list_t *pins
);

void catalogs_creative_assets_item_response_free(catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response);

catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response_parseFromJSON(cJSON *catalogs_creative_assets_item_responseJSON);

cJSON *catalogs_creative_assets_item_response_convertToJSON(catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response);

#endif /* _catalogs_creative_assets_item_response_H_ */

