/*
 * catalogs_product_groups_update_request.h
 *
 * 
 */

#ifndef _catalogs_product_groups_update_request_H_
#define _catalogs_product_groups_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_groups_update_request_t catalogs_product_groups_update_request_t;

#include "catalogs_creative_assets_product_group_filters.h"
#include "catalogs_locale.h"
#include "catalogs_product_group_update_request.h"
#include "catalogs_vertical_product_group_update_request.h"
#include "country.h"

// Enum CATALOGTYPE for catalogs_product_groups_update_request

typedef enum  { pinterest_rest_api_catalogs_product_groups_update_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_product_groups_update_request_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_catalogs_product_groups_update_request_CATALOGTYPE_e;

char* catalogs_product_groups_update_request_catalog_type_ToString(pinterest_rest_api_catalogs_product_groups_update_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_product_groups_update_request_CATALOGTYPE_e catalogs_product_groups_update_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_product_groups_update_request_t {
    char *description; // string
    struct catalogs_creative_assets_product_group_filters_t *filters; //model
    int is_featured; //boolean
    char *name; // string
    pinterest_rest_api_catalogs_product_groups_update_request_CATALOGTYPE_e catalog_type; //enum
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_catalogs_locale__e locale; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_groups_update_request_t;

__attribute__((deprecated)) catalogs_product_groups_update_request_t *catalogs_product_groups_update_request_create(
    char *description,
    catalogs_creative_assets_product_group_filters_t *filters,
    int is_featured,
    char *name,
    pinterest_rest_api_catalogs_product_groups_update_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
);

void catalogs_product_groups_update_request_free(catalogs_product_groups_update_request_t *catalogs_product_groups_update_request);

catalogs_product_groups_update_request_t *catalogs_product_groups_update_request_parseFromJSON(cJSON *catalogs_product_groups_update_requestJSON);

cJSON *catalogs_product_groups_update_request_convertToJSON(catalogs_product_groups_update_request_t *catalogs_product_groups_update_request);

#endif /* _catalogs_product_groups_update_request_H_ */

