/*
 * catalogs_list_products_by_filter_request_one_of.h
 *
 * Request object to list products for a given feed_id and product group filter.
 */

#ifndef _catalogs_list_products_by_filter_request_one_of_H_
#define _catalogs_list_products_by_filter_request_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_list_products_by_filter_request_one_of_t catalogs_list_products_by_filter_request_one_of_t;

#include "catalogs_product_group_filters.h"



typedef struct catalogs_list_products_by_filter_request_one_of_t {
    char *feed_id; // string
    struct catalogs_product_group_filters_t *filters; //model

} catalogs_list_products_by_filter_request_one_of_t;

catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of_create(
    char *feed_id,
    catalogs_product_group_filters_t *filters
);

void catalogs_list_products_by_filter_request_one_of_free(catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of);

catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of_parseFromJSON(cJSON *catalogs_list_products_by_filter_request_one_ofJSON);

cJSON *catalogs_list_products_by_filter_request_one_of_convertToJSON(catalogs_list_products_by_filter_request_one_of_t *catalogs_list_products_by_filter_request_one_of);

#endif /* _catalogs_list_products_by_filter_request_one_of_H_ */

