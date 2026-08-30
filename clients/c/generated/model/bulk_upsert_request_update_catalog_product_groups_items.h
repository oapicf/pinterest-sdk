/*
 * bulk_upsert_request_update_catalog_product_groups_items.h
 *
 * 
 */

#ifndef _bulk_upsert_request_update_catalog_product_groups_items_H_
#define _bulk_upsert_request_update_catalog_product_groups_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_upsert_request_update_catalog_product_groups_items_t bulk_upsert_request_update_catalog_product_groups_items_t;

#include "catalogs_creative_assets_product_group_filters.h"
#include "catalogs_locale.h"
#include "catalogs_product_group_update_request.h"
#include "catalogs_vertical_product_group_update_request.h"
#include "country.h"

// Enum CATALOGTYPE for bulk_upsert_request_update_catalog_product_groups_items

typedef enum  { pinterest_rest_api_bulk_upsert_request_update_catalog_product_groups_items_CATALOGTYPE_NULL = 0, pinterest_rest_api_bulk_upsert_request_update_catalog_product_groups_items_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_bulk_upsert_request_update_catalog_product_groups_items_CATALOGTYPE_e;

char* bulk_upsert_request_update_catalog_product_groups_items_catalog_type_ToString(pinterest_rest_api_bulk_upsert_request_update_catalog_product_groups_items_CATALOGTYPE_e catalog_type);

pinterest_rest_api_bulk_upsert_request_update_catalog_product_groups_items_CATALOGTYPE_e bulk_upsert_request_update_catalog_product_groups_items_catalog_type_FromString(char* catalog_type);



typedef struct bulk_upsert_request_update_catalog_product_groups_items_t {
    char *description; // string
    struct catalogs_creative_assets_product_group_filters_t *filters; //model
    int *is_featured; //boolean
    char *name; // string
    pinterest_rest_api_bulk_upsert_request_update_catalog_product_groups_items_CATALOGTYPE_e catalog_type; //enum
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_catalogs_locale__e locale; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_upsert_request_update_catalog_product_groups_items_t;

__attribute__((deprecated)) bulk_upsert_request_update_catalog_product_groups_items_t *bulk_upsert_request_update_catalog_product_groups_items_create(
    char *description,
    catalogs_creative_assets_product_group_filters_t *filters,
    int *is_featured,
    char *name,
    pinterest_rest_api_bulk_upsert_request_update_catalog_product_groups_items_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
);

void bulk_upsert_request_update_catalog_product_groups_items_free(bulk_upsert_request_update_catalog_product_groups_items_t *bulk_upsert_request_update_catalog_product_groups_items);

bulk_upsert_request_update_catalog_product_groups_items_t *bulk_upsert_request_update_catalog_product_groups_items_parseFromJSON(cJSON *bulk_upsert_request_update_catalog_product_groups_itemsJSON);

cJSON *bulk_upsert_request_update_catalog_product_groups_items_convertToJSON(bulk_upsert_request_update_catalog_product_groups_items_t *bulk_upsert_request_update_catalog_product_groups_items);

#endif /* _bulk_upsert_request_update_catalog_product_groups_items_H_ */

