/*
 * catalogs_creative_assets_product_group_filters.h
 *
 * Object holding a group of filters for a creative assets product group
 */

#ifndef _catalogs_creative_assets_product_group_filters_H_
#define _catalogs_creative_assets_product_group_filters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_product_group_filters_t catalogs_creative_assets_product_group_filters_t;

#include "catalogs_creative_assets_product_group_filter_keys.h"
#include "catalogs_creative_assets_product_group_filters_all_of.h"
#include "catalogs_creative_assets_product_group_filters_any_of.h"



typedef struct catalogs_creative_assets_product_group_filters_t {
    list_t *any_of; //nonprimitive container
    list_t *all_of; //nonprimitive container

} catalogs_creative_assets_product_group_filters_t;

catalogs_creative_assets_product_group_filters_t *catalogs_creative_assets_product_group_filters_create(
    list_t *any_of,
    list_t *all_of
);

void catalogs_creative_assets_product_group_filters_free(catalogs_creative_assets_product_group_filters_t *catalogs_creative_assets_product_group_filters);

catalogs_creative_assets_product_group_filters_t *catalogs_creative_assets_product_group_filters_parseFromJSON(cJSON *catalogs_creative_assets_product_group_filtersJSON);

cJSON *catalogs_creative_assets_product_group_filters_convertToJSON(catalogs_creative_assets_product_group_filters_t *catalogs_creative_assets_product_group_filters);

#endif /* _catalogs_creative_assets_product_group_filters_H_ */

