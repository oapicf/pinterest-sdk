/*
 * catalogs_list_products_by_filter_request.h
 *
 * Request object to list products for a given product group filter.
 */

#ifndef _catalogs_list_products_by_filter_request_H_
#define _catalogs_list_products_by_filter_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_list_products_by_filter_request_t catalogs_list_products_by_filter_request_t;

#include "catalogs_list_products_by_filter_request_one_of.h"
#include "catalogs_product_group_filters.h"



typedef struct catalogs_list_products_by_filter_request_t {
    char *feed_id; // string
    struct catalogs_product_group_filters_t *filters; //model

} catalogs_list_products_by_filter_request_t;

catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request_create(
    char *feed_id,
    catalogs_product_group_filters_t *filters
);

void catalogs_list_products_by_filter_request_free(catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request);

catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request_parseFromJSON(cJSON *catalogs_list_products_by_filter_requestJSON);

cJSON *catalogs_list_products_by_filter_request_convertToJSON(catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request);

#endif /* _catalogs_list_products_by_filter_request_H_ */

