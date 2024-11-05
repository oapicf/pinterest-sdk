/*
 * catalogs_items_post_filters.h
 *
 * 
 */

#ifndef _catalogs_items_post_filters_H_
#define _catalogs_items_post_filters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_items_post_filters_t catalogs_items_post_filters_t;

#include "catalogs_creative_assets_items_post_filter.h"
#include "catalogs_hotel_items_post_filter.h"
#include "catalogs_retail_items_post_filter.h"
#include "catalogs_type.h"

// Enum  for catalogs_items_post_filters

typedef enum  { pinterest_rest_api_catalogs_items_post_filters__NULL = 0, pinterest_rest_api_catalogs_items_post_filters__RETAIL, pinterest_rest_api_catalogs_items_post_filters__HOTEL, pinterest_rest_api_catalogs_items_post_filters__CREATIVE_ASSETS } pinterest_rest_api_catalogs_items_post_filters__e;

char* catalogs_items_post_filters_catalog_type_ToString(pinterest_rest_api_catalogs_items_post_filters__e catalog_type);

pinterest_rest_api_catalogs_items_post_filters__e catalogs_items_post_filters_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_items_post_filters_t {
    catalogs_type_t *catalog_type; // custom
    list_t *item_ids; //primitive container
    char *catalog_id; // string
    list_t *hotel_ids; //primitive container
    list_t *creative_assets_ids; //primitive container

} catalogs_items_post_filters_t;

catalogs_items_post_filters_t *catalogs_items_post_filters_create(
    catalogs_type_t *catalog_type,
    list_t *item_ids,
    char *catalog_id,
    list_t *hotel_ids,
    list_t *creative_assets_ids
);

void catalogs_items_post_filters_free(catalogs_items_post_filters_t *catalogs_items_post_filters);

catalogs_items_post_filters_t *catalogs_items_post_filters_parseFromJSON(cJSON *catalogs_items_post_filtersJSON);

cJSON *catalogs_items_post_filters_convertToJSON(catalogs_items_post_filters_t *catalogs_items_post_filters);

#endif /* _catalogs_items_post_filters_H_ */

