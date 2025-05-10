/*
 * catalogs_retail_list_products_by_catalog_based_filter_request.h
 *
 * Request object to list products for a given retail catalog_id and product group filter.
 */

#ifndef _catalogs_retail_list_products_by_catalog_based_filter_request_H_
#define _catalogs_retail_list_products_by_catalog_based_filter_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_list_products_by_catalog_based_filter_request_t catalogs_retail_list_products_by_catalog_based_filter_request_t;

#include "catalogs_locale.h"
#include "catalogs_product_group_filters.h"
#include "country.h"

// Enum CATALOGTYPE for catalogs_retail_list_products_by_catalog_based_filter_request

typedef enum  { pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e;

char* catalogs_retail_list_products_by_catalog_based_filter_request_catalog_type_ToString(pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalogs_retail_list_products_by_catalog_based_filter_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_list_products_by_catalog_based_filter_request_t {
    pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_type; //enum
    char *catalog_id; // string
    struct catalogs_product_group_filters_t *filters; //model
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_catalogs_locale__e locale; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_list_products_by_catalog_based_filter_request_t;

__attribute__((deprecated)) catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request_create(
    pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_type,
    char *catalog_id,
    catalogs_product_group_filters_t *filters,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_locale__e locale
);

void catalogs_retail_list_products_by_catalog_based_filter_request_free(catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request);

catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request_parseFromJSON(cJSON *catalogs_retail_list_products_by_catalog_based_filter_requestJSON);

cJSON *catalogs_retail_list_products_by_catalog_based_filter_request_convertToJSON(catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request);

#endif /* _catalogs_retail_list_products_by_catalog_based_filter_request_H_ */

