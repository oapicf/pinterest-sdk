/*
 * catalogs_hotel_item_error_response.h
 *
 * Object describing a hotel item error
 */

#ifndef _catalogs_hotel_item_error_response_H_
#define _catalogs_hotel_item_error_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_item_error_response_t catalogs_hotel_item_error_response_t;

#include "item_validation_event.h"

// Enum CATALOGTYPE for catalogs_hotel_item_error_response

typedef enum  { pinterest_rest_api_catalogs_hotel_item_error_response_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_item_error_response_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_item_error_response_CATALOGTYPE_e;

char* catalogs_hotel_item_error_response_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_item_error_response_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_item_error_response_CATALOGTYPE_e catalogs_hotel_item_error_response_catalog_type_FromString(char* catalog_type);

// Enum ITEMRESPONSEKIND for catalogs_hotel_item_error_response

typedef enum  { pinterest_rest_api_catalogs_hotel_item_error_response_ITEMRESPONSEKIND_NULL = 0, pinterest_rest_api_catalogs_hotel_item_error_response_ITEMRESPONSEKIND_hotel_item_error } pinterest_rest_api_catalogs_hotel_item_error_response_ITEMRESPONSEKIND_e;

char* catalogs_hotel_item_error_response_item_response_kind_ToString(pinterest_rest_api_catalogs_hotel_item_error_response_ITEMRESPONSEKIND_e item_response_kind);

pinterest_rest_api_catalogs_hotel_item_error_response_ITEMRESPONSEKIND_e catalogs_hotel_item_error_response_item_response_kind_FromString(char* item_response_kind);



typedef struct catalogs_hotel_item_error_response_t {
    pinterest_rest_api_catalogs_hotel_item_error_response_CATALOGTYPE_e catalog_type; //enum
    list_t *errors; //nonprimitive container
    char *hotel_id; // string
    pinterest_rest_api_catalogs_hotel_item_error_response_ITEMRESPONSEKIND_e item_response_kind; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_item_error_response_t;

__attribute__((deprecated)) catalogs_hotel_item_error_response_t *catalogs_hotel_item_error_response_create(
    pinterest_rest_api_catalogs_hotel_item_error_response_CATALOGTYPE_e catalog_type,
    list_t *errors,
    char *hotel_id,
    pinterest_rest_api_catalogs_hotel_item_error_response_ITEMRESPONSEKIND_e item_response_kind
);

void catalogs_hotel_item_error_response_free(catalogs_hotel_item_error_response_t *catalogs_hotel_item_error_response);

catalogs_hotel_item_error_response_t *catalogs_hotel_item_error_response_parseFromJSON(cJSON *catalogs_hotel_item_error_responseJSON);

cJSON *catalogs_hotel_item_error_response_convertToJSON(catalogs_hotel_item_error_response_t *catalogs_hotel_item_error_response);

#endif /* _catalogs_hotel_item_error_response_H_ */

