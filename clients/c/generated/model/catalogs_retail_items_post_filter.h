/*
 * catalogs_retail_items_post_filter.h
 *
 * 
 */

#ifndef _catalogs_retail_items_post_filter_H_
#define _catalogs_retail_items_post_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_items_post_filter_t catalogs_retail_items_post_filter_t;


// Enum CATALOGTYPE for catalogs_retail_items_post_filter

typedef enum  { pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e;

char* catalogs_retail_items_post_filter_catalog_type_ToString(pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalogs_retail_items_post_filter_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_items_post_filter_t {
    pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalog_type; //enum
    list_t *item_ids; //primitive container
    char *catalog_id; // string

} catalogs_retail_items_post_filter_t;

catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter_create(
    pinterest_rest_api_catalogs_retail_items_post_filter_CATALOGTYPE_e catalog_type,
    list_t *item_ids,
    char *catalog_id
);

void catalogs_retail_items_post_filter_free(catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter);

catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter_parseFromJSON(cJSON *catalogs_retail_items_post_filterJSON);

cJSON *catalogs_retail_items_post_filter_convertToJSON(catalogs_retail_items_post_filter_t *catalogs_retail_items_post_filter);

#endif /* _catalogs_retail_items_post_filter_H_ */

