/*
 * catalogs_product_groups_create_request.h
 *
 * 
 */

#ifndef _catalogs_product_groups_create_request_H_
#define _catalogs_product_groups_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_groups_create_request_t catalogs_product_groups_create_request_t;

#include "catalogs_hotel_product_group_filters.h"
#include "catalogs_product_group_create_request.h"
#include "catalogs_vertical_product_group_create_request.h"

// Enum CATALOGTYPE for catalogs_product_groups_create_request

typedef enum  { pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_e;

char* catalogs_product_groups_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_e catalogs_product_groups_create_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_product_groups_create_request_t {
    char *name; // string
    char *description; // string
    int is_featured; //boolean
    struct catalogs_hotel_product_group_filters_t *filters; //model
    char *feed_id; // string
    pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_e catalog_type; //enum
    char *catalog_id; // string

} catalogs_product_groups_create_request_t;

catalogs_product_groups_create_request_t *catalogs_product_groups_create_request_create(
    char *name,
    char *description,
    int is_featured,
    catalogs_hotel_product_group_filters_t *filters,
    char *feed_id,
    pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_e catalog_type,
    char *catalog_id
);

void catalogs_product_groups_create_request_free(catalogs_product_groups_create_request_t *catalogs_product_groups_create_request);

catalogs_product_groups_create_request_t *catalogs_product_groups_create_request_parseFromJSON(cJSON *catalogs_product_groups_create_requestJSON);

cJSON *catalogs_product_groups_create_request_convertToJSON(catalogs_product_groups_create_request_t *catalogs_product_groups_create_request);

#endif /* _catalogs_product_groups_create_request_H_ */

