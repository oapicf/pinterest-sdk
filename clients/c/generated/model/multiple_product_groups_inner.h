/*
 * multiple_product_groups_inner.h
 *
 * 
 */

#ifndef _multiple_product_groups_inner_H_
#define _multiple_product_groups_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct multiple_product_groups_inner_t multiple_product_groups_inner_t;

#include "catalogs_creative_assets_product_group_filters.h"
#include "catalogs_locale.h"
#include "catalogs_product_group_create_request.h"
#include "catalogs_vertical_product_group_create_request.h"
#include "country.h"

// Enum CATALOGTYPE for multiple_product_groups_inner

typedef enum  { pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_NULL = 0, pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e;

char* multiple_product_groups_inner_catalog_type_ToString(pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e catalog_type);

pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e multiple_product_groups_inner_catalog_type_FromString(char* catalog_type);



typedef struct multiple_product_groups_inner_t {
    char *name; // string
    char *description; // string
    int is_featured; //boolean
    struct catalogs_creative_assets_product_group_filters_t *filters; //model
    char *feed_id; // string
    pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e catalog_type; //enum
    char *catalog_id; // string
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_catalogs_locale__e locale; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} multiple_product_groups_inner_t;

__attribute__((deprecated)) multiple_product_groups_inner_t *multiple_product_groups_inner_create(
    char *name,
    char *description,
    int is_featured,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *feed_id,
    pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e catalog_type,
    char *catalog_id,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
);

void multiple_product_groups_inner_free(multiple_product_groups_inner_t *multiple_product_groups_inner);

multiple_product_groups_inner_t *multiple_product_groups_inner_parseFromJSON(cJSON *multiple_product_groups_innerJSON);

cJSON *multiple_product_groups_inner_convertToJSON(multiple_product_groups_inner_t *multiple_product_groups_inner);

#endif /* _multiple_product_groups_inner_H_ */

