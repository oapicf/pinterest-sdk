/*
 * catalogs_list_products_by_feed_based_filter.h
 *
 * Request object to list products for a given feed_id and product group filter.
 */

#ifndef _catalogs_list_products_by_feed_based_filter_H_
#define _catalogs_list_products_by_feed_based_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_list_products_by_feed_based_filter_t catalogs_list_products_by_feed_based_filter_t;

#include "catalogs_product_group_filters.h"



typedef struct catalogs_list_products_by_feed_based_filter_t {
    char *feed_id; // string
    struct catalogs_product_group_filters_t *filters; //model

} catalogs_list_products_by_feed_based_filter_t;

catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter_create(
    char *feed_id,
    catalogs_product_group_filters_t *filters
);

void catalogs_list_products_by_feed_based_filter_free(catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter);

catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter_parseFromJSON(cJSON *catalogs_list_products_by_feed_based_filterJSON);

cJSON *catalogs_list_products_by_feed_based_filter_convertToJSON(catalogs_list_products_by_feed_based_filter_t *catalogs_list_products_by_feed_based_filter);

#endif /* _catalogs_list_products_by_feed_based_filter_H_ */

