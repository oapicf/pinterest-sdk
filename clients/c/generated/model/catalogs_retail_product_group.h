/*
 * catalogs_retail_product_group.h
 *
 * 
 */

#ifndef _catalogs_retail_product_group_H_
#define _catalogs_retail_product_group_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_product_group_t catalogs_retail_product_group_t;

#include "catalogs_product_group_filters.h"
#include "catalogs_product_group_status.h"
#include "catalogs_product_group_type.h"

// Enum CATALOGTYPE for catalogs_retail_product_group

typedef enum  { pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_e;

char* catalogs_retail_product_group_catalog_type_ToString(pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_e catalogs_retail_product_group_catalog_type_FromString(char* catalog_type);

// Enum  for catalogs_retail_product_group

typedef enum  { pinterest_rest_api_catalogs_retail_product_group__NULL = 0, pinterest_rest_api_catalogs_retail_product_group__MERCHANT_CREATED, pinterest_rest_api_catalogs_retail_product_group__ALL_PRODUCTS, pinterest_rest_api_catalogs_retail_product_group__BEST_DEALS, pinterest_rest_api_catalogs_retail_product_group__PINNER_FAVORITES, pinterest_rest_api_catalogs_retail_product_group__TOP_SELLERS, pinterest_rest_api_catalogs_retail_product_group__BACK_IN_STOCK, pinterest_rest_api_catalogs_retail_product_group__NEW_ARRIVALS, pinterest_rest_api_catalogs_retail_product_group__SHOPIFY_COLLECTIONS, pinterest_rest_api_catalogs_retail_product_group__I2PC } pinterest_rest_api_catalogs_retail_product_group__e;

char* catalogs_retail_product_group_type_ToString(pinterest_rest_api_catalogs_retail_product_group__e type);

pinterest_rest_api_catalogs_retail_product_group__e catalogs_retail_product_group_type_FromString(char* type);

// Enum  for catalogs_retail_product_group

typedef enum  { pinterest_rest_api_catalogs_retail_product_group__NULL = 0, pinterest_rest_api_catalogs_retail_product_group__ACTIVE, pinterest_rest_api_catalogs_retail_product_group__INACTIVE } pinterest_rest_api_catalogs_retail_product_group__e;

char* catalogs_retail_product_group_status_ToString(pinterest_rest_api_catalogs_retail_product_group__e status);

pinterest_rest_api_catalogs_retail_product_group__e catalogs_retail_product_group_status_FromString(char* status);

// Enum FEEDID for catalogs_retail_product_group

typedef enum  { pinterest_rest_api_catalogs_retail_product_group_FEEDID_NULL = 0, pinterest_rest_api_catalogs_retail_product_group_FEEDID_null } pinterest_rest_api_catalogs_retail_product_group_FEEDID_e;

char* catalogs_retail_product_group_feed_id_ToString(pinterest_rest_api_catalogs_retail_product_group_FEEDID_e feed_id);

pinterest_rest_api_catalogs_retail_product_group_FEEDID_e catalogs_retail_product_group_feed_id_FromString(char* feed_id);



typedef struct catalogs_retail_product_group_t {
    pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_e catalog_type; //enum
    char *id; // string
    char *name; // string
    char *description; // string
    struct catalogs_product_group_filters_t *filters; //model
    int is_featured; //boolean
    catalogs_product_group_type_t *type; // custom
    catalogs_product_group_status_t *status; // custom
    int created_at; //numeric
    int updated_at; //numeric
    pinterest_rest_api_catalogs_retail_product_group_FEEDID_e feed_id; //enum

} catalogs_retail_product_group_t;

catalogs_retail_product_group_t *catalogs_retail_product_group_create(
    pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_e catalog_type,
    char *id,
    char *name,
    char *description,
    catalogs_product_group_filters_t *filters,
    int is_featured,
    catalogs_product_group_type_t *type,
    catalogs_product_group_status_t *status,
    int created_at,
    int updated_at,
    pinterest_rest_api_catalogs_retail_product_group_FEEDID_e feed_id
);

void catalogs_retail_product_group_free(catalogs_retail_product_group_t *catalogs_retail_product_group);

catalogs_retail_product_group_t *catalogs_retail_product_group_parseFromJSON(cJSON *catalogs_retail_product_groupJSON);

cJSON *catalogs_retail_product_group_convertToJSON(catalogs_retail_product_group_t *catalogs_retail_product_group);

#endif /* _catalogs_retail_product_group_H_ */

