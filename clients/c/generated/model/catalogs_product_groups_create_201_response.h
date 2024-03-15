/*
 * catalogs_product_groups_create_201_response.h
 *
 * 
 */

#ifndef _catalogs_product_groups_create_201_response_H_
#define _catalogs_product_groups_create_201_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_groups_create_201_response_t catalogs_product_groups_create_201_response_t;

#include "catalogs_product_group.h"
#include "catalogs_product_group_filters.h"
#include "catalogs_product_group_status.h"
#include "catalogs_product_group_type.h"
#include "catalogs_vertical_product_group.h"

// Enum  for catalogs_product_groups_create_201_response

typedef enum  { pinterest_rest_api_catalogs_product_groups_create_201_response__NULL = 0, pinterest_rest_api_catalogs_product_groups_create_201_response__MERCHANT_CREATED, pinterest_rest_api_catalogs_product_groups_create_201_response__ALL_PRODUCTS, pinterest_rest_api_catalogs_product_groups_create_201_response__BEST_DEALS, pinterest_rest_api_catalogs_product_groups_create_201_response__PINNER_FAVORITES, pinterest_rest_api_catalogs_product_groups_create_201_response__TOP_SELLERS, pinterest_rest_api_catalogs_product_groups_create_201_response__BACK_IN_STOCK, pinterest_rest_api_catalogs_product_groups_create_201_response__NEW_ARRIVALS, pinterest_rest_api_catalogs_product_groups_create_201_response__SHOPIFY_COLLECTIONS, pinterest_rest_api_catalogs_product_groups_create_201_response__I2PC } pinterest_rest_api_catalogs_product_groups_create_201_response__e;

char* catalogs_product_groups_create_201_response_type_ToString(pinterest_rest_api_catalogs_product_groups_create_201_response__e type);

pinterest_rest_api_catalogs_product_groups_create_201_response__e catalogs_product_groups_create_201_response_type_FromString(char* type);

// Enum  for catalogs_product_groups_create_201_response

typedef enum  { pinterest_rest_api_catalogs_product_groups_create_201_response__NULL = 0, pinterest_rest_api_catalogs_product_groups_create_201_response__ACTIVE, pinterest_rest_api_catalogs_product_groups_create_201_response__INACTIVE } pinterest_rest_api_catalogs_product_groups_create_201_response__e;

char* catalogs_product_groups_create_201_response_status_ToString(pinterest_rest_api_catalogs_product_groups_create_201_response__e status);

pinterest_rest_api_catalogs_product_groups_create_201_response__e catalogs_product_groups_create_201_response_status_FromString(char* status);

// Enum FEEDID for catalogs_product_groups_create_201_response

typedef enum  { pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_NULL = 0, pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_null } pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e;

char* catalogs_product_groups_create_201_response_feed_id_ToString(pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e feed_id);

pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e catalogs_product_groups_create_201_response_feed_id_FromString(char* feed_id);

// Enum CATALOGTYPE for catalogs_product_groups_create_201_response

typedef enum  { pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e;

char* catalogs_product_groups_create_201_response_catalog_type_ToString(pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e catalogs_product_groups_create_201_response_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_product_groups_create_201_response_t {
    char *id; // string
    char *name; // string
    char *description; // string
    struct catalogs_product_group_filters_t *filters; //model
    int is_featured; //boolean
    catalogs_product_group_type_t *type; // custom
    catalogs_product_group_status_t *status; // custom
    int created_at; //numeric
    int updated_at; //numeric
    pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e feed_id; //enum
    pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e catalog_type; //enum
    char *catalog_id; // string

} catalogs_product_groups_create_201_response_t;

catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response_create(
    char *id,
    char *name,
    char *description,
    catalogs_product_group_filters_t *filters,
    int is_featured,
    catalogs_product_group_type_t *type,
    catalogs_product_group_status_t *status,
    int created_at,
    int updated_at,
    pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e feed_id,
    pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e catalog_type,
    char *catalog_id
);

void catalogs_product_groups_create_201_response_free(catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response);

catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response_parseFromJSON(cJSON *catalogs_product_groups_create_201_responseJSON);

cJSON *catalogs_product_groups_create_201_response_convertToJSON(catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response);

#endif /* _catalogs_product_groups_create_201_response_H_ */

