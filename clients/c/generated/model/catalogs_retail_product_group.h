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



typedef struct catalogs_retail_product_group_t {
    pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_e catalog_type; //enum
    char *id; // string
    char *name; // string
    char *description; // string
    struct catalogs_product_group_filters_t *filters; //model
    int is_featured; //boolean
    pinterest_rest_api_catalogs_product_group_type__e type; //referenced enum
    pinterest_rest_api_catalogs_product_group_status__e status; //referenced enum
    int created_at; //numeric
    int updated_at; //numeric
    char *catalog_id; // string
    char *feed_id; // string
    char *country; // string
    char *locale; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_product_group_t;

__attribute__((deprecated)) catalogs_retail_product_group_t *catalogs_retail_product_group_create(
    pinterest_rest_api_catalogs_retail_product_group_CATALOGTYPE_e catalog_type,
    char *id,
    char *name,
    char *description,
    catalogs_product_group_filters_t *filters,
    int is_featured,
    pinterest_rest_api_catalogs_product_group_type__e type,
    pinterest_rest_api_catalogs_product_group_status__e status,
    int created_at,
    int updated_at,
    char *catalog_id,
    char *feed_id,
    char *country,
    char *locale
);

void catalogs_retail_product_group_free(catalogs_retail_product_group_t *catalogs_retail_product_group);

catalogs_retail_product_group_t *catalogs_retail_product_group_parseFromJSON(cJSON *catalogs_retail_product_groupJSON);

cJSON *catalogs_retail_product_group_convertToJSON(catalogs_retail_product_group_t *catalogs_retail_product_group);

#endif /* _catalogs_retail_product_group_H_ */

