/*
 * catalogs_hotel_item_response.h
 *
 * Object describing a hotel record
 */

#ifndef _catalogs_hotel_item_response_H_
#define _catalogs_hotel_item_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_item_response_t catalogs_hotel_item_response_t;

#include "catalogs_hotel_attributes.h"
#include "pin.h"

// Enum CATALOGTYPE for catalogs_hotel_item_response

typedef enum  { pinterest_rest_api_catalogs_hotel_item_response_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_item_response_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_item_response_CATALOGTYPE_e;

char* catalogs_hotel_item_response_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_item_response_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_item_response_CATALOGTYPE_e catalogs_hotel_item_response_catalog_type_FromString(char* catalog_type);

// Enum ITEMRESPONSEKIND for catalogs_hotel_item_response

typedef enum  { pinterest_rest_api_catalogs_hotel_item_response_ITEMRESPONSEKIND_NULL = 0, pinterest_rest_api_catalogs_hotel_item_response_ITEMRESPONSEKIND_hotel_item } pinterest_rest_api_catalogs_hotel_item_response_ITEMRESPONSEKIND_e;

char* catalogs_hotel_item_response_item_response_kind_ToString(pinterest_rest_api_catalogs_hotel_item_response_ITEMRESPONSEKIND_e item_response_kind);

pinterest_rest_api_catalogs_hotel_item_response_ITEMRESPONSEKIND_e catalogs_hotel_item_response_item_response_kind_FromString(char* item_response_kind);



typedef struct catalogs_hotel_item_response_t {
    struct catalogs_hotel_attributes_t *attributes; //model
    pinterest_rest_api_catalogs_hotel_item_response_CATALOGTYPE_e catalog_type; //enum
    char *hotel_id; // string
    pinterest_rest_api_catalogs_hotel_item_response_ITEMRESPONSEKIND_e item_response_kind; //enum
    list_t *pins; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_item_response_t;

__attribute__((deprecated)) catalogs_hotel_item_response_t *catalogs_hotel_item_response_create(
    catalogs_hotel_attributes_t *attributes,
    pinterest_rest_api_catalogs_hotel_item_response_CATALOGTYPE_e catalog_type,
    char *hotel_id,
    pinterest_rest_api_catalogs_hotel_item_response_ITEMRESPONSEKIND_e item_response_kind,
    list_t *pins
);

void catalogs_hotel_item_response_free(catalogs_hotel_item_response_t *catalogs_hotel_item_response);

catalogs_hotel_item_response_t *catalogs_hotel_item_response_parseFromJSON(cJSON *catalogs_hotel_item_responseJSON);

cJSON *catalogs_hotel_item_response_convertToJSON(catalogs_hotel_item_response_t *catalogs_hotel_item_response);

#endif /* _catalogs_hotel_item_response_H_ */

