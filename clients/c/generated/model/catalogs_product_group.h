/*
 * catalogs_product_group.h
 *
 * catalog product group entity
 */

#ifndef _catalogs_product_group_H_
#define _catalogs_product_group_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_t catalogs_product_group_t;

#include "catalogs_product_group_filters.h"
#include "catalogs_product_group_status.h"
#include "catalogs_product_group_type.h"

// Enum  for catalogs_product_group

typedef enum  { pinterest_rest_api_catalogs_product_group__NULL = 0, pinterest_rest_api_catalogs_product_group__MERCHANT_CREATED, pinterest_rest_api_catalogs_product_group__ALL_PRODUCTS, pinterest_rest_api_catalogs_product_group__BEST_DEALS, pinterest_rest_api_catalogs_product_group__PINNER_FAVORITES, pinterest_rest_api_catalogs_product_group__TOP_SELLERS, pinterest_rest_api_catalogs_product_group__BACK_IN_STOCK, pinterest_rest_api_catalogs_product_group__NEW_ARRIVALS, pinterest_rest_api_catalogs_product_group__SHOPIFY_COLLECTIONS, pinterest_rest_api_catalogs_product_group__I2PC } pinterest_rest_api_catalogs_product_group__e;

char* catalogs_product_group_type_ToString(pinterest_rest_api_catalogs_product_group__e type);

pinterest_rest_api_catalogs_product_group__e catalogs_product_group_type_FromString(char* type);

// Enum  for catalogs_product_group

typedef enum  { pinterest_rest_api_catalogs_product_group__NULL = 0, pinterest_rest_api_catalogs_product_group__ACTIVE, pinterest_rest_api_catalogs_product_group__INACTIVE } pinterest_rest_api_catalogs_product_group__e;

char* catalogs_product_group_status_ToString(pinterest_rest_api_catalogs_product_group__e status);

pinterest_rest_api_catalogs_product_group__e catalogs_product_group_status_FromString(char* status);

// Enum CATALOGTYPE for catalogs_product_group

typedef enum  { pinterest_rest_api_catalogs_product_group_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_product_group_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_product_group_CATALOGTYPE_e;

char* catalogs_product_group_catalog_type_ToString(pinterest_rest_api_catalogs_product_group_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_product_group_CATALOGTYPE_e catalogs_product_group_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_product_group_t {
    char *id; // string
    char *name; // string
    char *description; // string
    struct catalogs_product_group_filters_t *filters; //model
    int is_featured; //boolean
    catalogs_product_group_type_t *type; // custom
    catalogs_product_group_status_t *status; // custom
    int created_at; //numeric
    int updated_at; //numeric
    char *feed_id; // string
    pinterest_rest_api_catalogs_product_group_CATALOGTYPE_e catalog_type; //enum

} catalogs_product_group_t;

catalogs_product_group_t *catalogs_product_group_create(
    char *id,
    char *name,
    char *description,
    catalogs_product_group_filters_t *filters,
    int is_featured,
    catalogs_product_group_type_t *type,
    catalogs_product_group_status_t *status,
    int created_at,
    int updated_at,
    char *feed_id,
    pinterest_rest_api_catalogs_product_group_CATALOGTYPE_e catalog_type
);

void catalogs_product_group_free(catalogs_product_group_t *catalogs_product_group);

catalogs_product_group_t *catalogs_product_group_parseFromJSON(cJSON *catalogs_product_groupJSON);

cJSON *catalogs_product_group_convertToJSON(catalogs_product_group_t *catalogs_product_group);

#endif /* _catalogs_product_group_H_ */

