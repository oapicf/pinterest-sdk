/*
 * catalogs_retail_item_response.h
 *
 * Object describing a retail item record
 */

#ifndef _catalogs_retail_item_response_H_
#define _catalogs_retail_item_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_item_response_t catalogs_retail_item_response_t;

#include "item_attributes.h"
#include "pin.h"

// Enum CATALOGTYPE for catalogs_retail_item_response

typedef enum  { pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e;

char* catalogs_retail_item_response_catalog_type_ToString(pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalogs_retail_item_response_catalog_type_FromString(char* catalog_type);

// Enum ITEMRESPONSEKIND for catalogs_retail_item_response

typedef enum  { pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_NULL = 0, pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_retail_item } pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e;

char* catalogs_retail_item_response_item_response_kind_ToString(pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e item_response_kind);

pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e catalogs_retail_item_response_item_response_kind_FromString(char* item_response_kind);



typedef struct catalogs_retail_item_response_t {
    struct item_attributes_t *attributes; //model
    pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalog_type; //enum
    char *item_id; // string
    pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e item_response_kind; //enum
    list_t *pins; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_item_response_t;

__attribute__((deprecated)) catalogs_retail_item_response_t *catalogs_retail_item_response_create(
    item_attributes_t *attributes,
    pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e catalog_type,
    char *item_id,
    pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e item_response_kind,
    list_t *pins
);

void catalogs_retail_item_response_free(catalogs_retail_item_response_t *catalogs_retail_item_response);

catalogs_retail_item_response_t *catalogs_retail_item_response_parseFromJSON(cJSON *catalogs_retail_item_responseJSON);

cJSON *catalogs_retail_item_response_convertToJSON(catalogs_retail_item_response_t *catalogs_retail_item_response);

#endif /* _catalogs_retail_item_response_H_ */

