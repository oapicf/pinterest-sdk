/*
 * catalogs_vertical_product_group_update_request.h
 *
 * Request object for updating a catalog based product group.
 */

#ifndef _catalogs_vertical_product_group_update_request_H_
#define _catalogs_vertical_product_group_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_vertical_product_group_update_request_t catalogs_vertical_product_group_update_request_t;

#include "catalogs_creative_assets_product_group_filters.h"
#include "catalogs_creative_assets_product_group_update_request.h"
#include "catalogs_hotel_product_group_update_request.h"
#include "catalogs_locale.h"
#include "catalogs_retail_product_group_update_request.h"
#include "country.h"

// Enum CATALOGTYPE for catalogs_vertical_product_group_update_request

typedef enum  { pinterest_rest_api_catalogs_vertical_product_group_update_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_vertical_product_group_update_request_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_catalogs_vertical_product_group_update_request_CATALOGTYPE_e;

char* catalogs_vertical_product_group_update_request_catalog_type_ToString(pinterest_rest_api_catalogs_vertical_product_group_update_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_vertical_product_group_update_request_CATALOGTYPE_e catalogs_vertical_product_group_update_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_vertical_product_group_update_request_t {
    pinterest_rest_api_catalogs_vertical_product_group_update_request_CATALOGTYPE_e catalog_type; //enum
    pinterest_rest_api_country__e country; //referenced enum
    char *description; // string
    struct catalogs_creative_assets_product_group_filters_t *filters; //model
    pinterest_rest_api_catalogs_locale__e locale; //referenced enum
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_vertical_product_group_update_request_t;

__attribute__((deprecated)) catalogs_vertical_product_group_update_request_t *catalogs_vertical_product_group_update_request_create(
    pinterest_rest_api_catalogs_vertical_product_group_update_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    char *description,
    catalogs_creative_assets_product_group_filters_t *filters,
    pinterest_rest_api_catalogs_locale__e locale,
    char *name
);

void catalogs_vertical_product_group_update_request_free(catalogs_vertical_product_group_update_request_t *catalogs_vertical_product_group_update_request);

catalogs_vertical_product_group_update_request_t *catalogs_vertical_product_group_update_request_parseFromJSON(cJSON *catalogs_vertical_product_group_update_requestJSON);

cJSON *catalogs_vertical_product_group_update_request_convertToJSON(catalogs_vertical_product_group_update_request_t *catalogs_vertical_product_group_update_request);

#endif /* _catalogs_vertical_product_group_update_request_H_ */

