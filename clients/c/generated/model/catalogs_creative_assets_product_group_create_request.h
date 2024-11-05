/*
 * catalogs_creative_assets_product_group_create_request.h
 *
 * Request object for creating a creative assets product group.
 */

#ifndef _catalogs_creative_assets_product_group_create_request_H_
#define _catalogs_creative_assets_product_group_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_product_group_create_request_t catalogs_creative_assets_product_group_create_request_t;

#include "catalogs_creative_assets_product_group_filters.h"

// Enum CATALOGTYPE for catalogs_creative_assets_product_group_create_request

typedef enum  { pinterest_rest_api_catalogs_creative_assets_product_group_create_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_creative_assets_product_group_create_request_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_catalogs_creative_assets_product_group_create_request_CATALOGTYPE_e;

char* catalogs_creative_assets_product_group_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_product_group_create_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_creative_assets_product_group_create_request_CATALOGTYPE_e catalogs_creative_assets_product_group_create_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_creative_assets_product_group_create_request_t {
    pinterest_rest_api_catalogs_creative_assets_product_group_create_request_CATALOGTYPE_e catalog_type; //enum
    char *name; // string
    char *description; // string
    struct catalogs_creative_assets_product_group_filters_t *filters; //model
    char *catalog_id; // string

} catalogs_creative_assets_product_group_create_request_t;

catalogs_creative_assets_product_group_create_request_t *catalogs_creative_assets_product_group_create_request_create(
    pinterest_rest_api_catalogs_creative_assets_product_group_create_request_CATALOGTYPE_e catalog_type,
    char *name,
    char *description,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *catalog_id
);

void catalogs_creative_assets_product_group_create_request_free(catalogs_creative_assets_product_group_create_request_t *catalogs_creative_assets_product_group_create_request);

catalogs_creative_assets_product_group_create_request_t *catalogs_creative_assets_product_group_create_request_parseFromJSON(cJSON *catalogs_creative_assets_product_group_create_requestJSON);

cJSON *catalogs_creative_assets_product_group_create_request_convertToJSON(catalogs_creative_assets_product_group_create_request_t *catalogs_creative_assets_product_group_create_request);

#endif /* _catalogs_creative_assets_product_group_create_request_H_ */

