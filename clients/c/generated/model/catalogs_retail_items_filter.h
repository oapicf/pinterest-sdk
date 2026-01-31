/*
 * catalogs_retail_items_filter.h
 *
 * 
 */

#ifndef _catalogs_retail_items_filter_H_
#define _catalogs_retail_items_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_items_filter_t catalogs_retail_items_filter_t;


// Enum CATALOGTYPE for catalogs_retail_items_filter

typedef enum  { pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e;

char* catalogs_retail_items_filter_catalog_type_ToString(pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e catalogs_retail_items_filter_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_items_filter_t {
    char *catalog_id; // string
    pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e catalog_type; //enum
    list_t *item_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_items_filter_t;

__attribute__((deprecated)) catalogs_retail_items_filter_t *catalogs_retail_items_filter_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_e catalog_type,
    list_t *item_ids
);

void catalogs_retail_items_filter_free(catalogs_retail_items_filter_t *catalogs_retail_items_filter);

catalogs_retail_items_filter_t *catalogs_retail_items_filter_parseFromJSON(cJSON *catalogs_retail_items_filterJSON);

cJSON *catalogs_retail_items_filter_convertToJSON(catalogs_retail_items_filter_t *catalogs_retail_items_filter);

#endif /* _catalogs_retail_items_filter_H_ */

