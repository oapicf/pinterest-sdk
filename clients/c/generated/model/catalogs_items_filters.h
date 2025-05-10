/*
 * catalogs_items_filters.h
 *
 * 
 */

#ifndef _catalogs_items_filters_H_
#define _catalogs_items_filters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_items_filters_t catalogs_items_filters_t;

#include "catalogs_creative_assets_items_filter.h"
#include "catalogs_hotel_items_filter.h"
#include "catalogs_retail_items_filter.h"
#include "catalogs_type.h"



typedef struct catalogs_items_filters_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    list_t *item_ids; //primitive container
    char *catalog_id; // string
    list_t *hotel_ids; //primitive container
    list_t *creative_assets_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_items_filters_t;

__attribute__((deprecated)) catalogs_items_filters_t *catalogs_items_filters_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    list_t *item_ids,
    char *catalog_id,
    list_t *hotel_ids,
    list_t *creative_assets_ids
);

void catalogs_items_filters_free(catalogs_items_filters_t *catalogs_items_filters);

catalogs_items_filters_t *catalogs_items_filters_parseFromJSON(cJSON *catalogs_items_filtersJSON);

cJSON *catalogs_items_filters_convertToJSON(catalogs_items_filters_t *catalogs_items_filters);

#endif /* _catalogs_items_filters_H_ */

