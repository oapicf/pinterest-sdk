/*
 * catalogs_hotel_product_group_create_request.h
 *
 * Request object for creating a hotel product group.
 */

#ifndef _catalogs_hotel_product_group_create_request_H_
#define _catalogs_hotel_product_group_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_product_group_create_request_t catalogs_hotel_product_group_create_request_t;

#include "catalogs_hotel_product_group_filters.h"

// Enum CATALOGTYPE for catalogs_hotel_product_group_create_request

typedef enum  { pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e;

char* catalogs_hotel_product_group_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e catalogs_hotel_product_group_create_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_hotel_product_group_create_request_t {
    char *catalog_id; // string
    pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e catalog_type; //enum
    char *description; // string
    struct catalogs_hotel_product_group_filters_t *filters; //model
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_product_group_create_request_t;

__attribute__((deprecated)) catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_hotel_product_group_create_request_CATALOGTYPE_e catalog_type,
    char *description,
    catalogs_hotel_product_group_filters_t *filters,
    char *name
);

void catalogs_hotel_product_group_create_request_free(catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request);

catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request_parseFromJSON(cJSON *catalogs_hotel_product_group_create_requestJSON);

cJSON *catalogs_hotel_product_group_create_request_convertToJSON(catalogs_hotel_product_group_create_request_t *catalogs_hotel_product_group_create_request);

#endif /* _catalogs_hotel_product_group_create_request_H_ */

