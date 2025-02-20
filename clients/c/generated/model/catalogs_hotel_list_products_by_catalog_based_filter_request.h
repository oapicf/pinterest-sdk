/*
 * catalogs_hotel_list_products_by_catalog_based_filter_request.h
 *
 * Request object to list products for a given hotel catalog_id and product group filter.
 */

#ifndef _catalogs_hotel_list_products_by_catalog_based_filter_request_H_
#define _catalogs_hotel_list_products_by_catalog_based_filter_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_list_products_by_catalog_based_filter_request_t catalogs_hotel_list_products_by_catalog_based_filter_request_t;

#include "catalogs_hotel_product_group_filters.h"

// Enum CATALOGTYPE for catalogs_hotel_list_products_by_catalog_based_filter_request

typedef enum  { pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_e;

char* catalogs_hotel_list_products_by_catalog_based_filter_request_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalogs_hotel_list_products_by_catalog_based_filter_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_hotel_list_products_by_catalog_based_filter_request_t {
    pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_type; //enum
    char *catalog_id; // string
    struct catalogs_hotel_product_group_filters_t *filters; //model

} catalogs_hotel_list_products_by_catalog_based_filter_request_t;

catalogs_hotel_list_products_by_catalog_based_filter_request_t *catalogs_hotel_list_products_by_catalog_based_filter_request_create(
    pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_type,
    char *catalog_id,
    catalogs_hotel_product_group_filters_t *filters
);

void catalogs_hotel_list_products_by_catalog_based_filter_request_free(catalogs_hotel_list_products_by_catalog_based_filter_request_t *catalogs_hotel_list_products_by_catalog_based_filter_request);

catalogs_hotel_list_products_by_catalog_based_filter_request_t *catalogs_hotel_list_products_by_catalog_based_filter_request_parseFromJSON(cJSON *catalogs_hotel_list_products_by_catalog_based_filter_requestJSON);

cJSON *catalogs_hotel_list_products_by_catalog_based_filter_request_convertToJSON(catalogs_hotel_list_products_by_catalog_based_filter_request_t *catalogs_hotel_list_products_by_catalog_based_filter_request);

#endif /* _catalogs_hotel_list_products_by_catalog_based_filter_request_H_ */

