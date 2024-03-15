/*
 * catalogs_product_group_filters.h
 *
 * Object holding a group of filters for a catalog product group
 */

#ifndef _catalogs_product_group_filters_H_
#define _catalogs_product_group_filters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_filters_t catalogs_product_group_filters_t;

#include "catalogs_product_group_filter_keys.h"
#include "catalogs_product_group_filters_all_of.h"
#include "catalogs_product_group_filters_any_of.h"



typedef struct catalogs_product_group_filters_t {
    list_t *any_of; //nonprimitive container
    list_t *all_of; //nonprimitive container

} catalogs_product_group_filters_t;

catalogs_product_group_filters_t *catalogs_product_group_filters_create(
    list_t *any_of,
    list_t *all_of
);

void catalogs_product_group_filters_free(catalogs_product_group_filters_t *catalogs_product_group_filters);

catalogs_product_group_filters_t *catalogs_product_group_filters_parseFromJSON(cJSON *catalogs_product_group_filtersJSON);

cJSON *catalogs_product_group_filters_convertToJSON(catalogs_product_group_filters_t *catalogs_product_group_filters);

#endif /* _catalogs_product_group_filters_H_ */

