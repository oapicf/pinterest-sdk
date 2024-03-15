/*
 * catalogs_hotel_items_filter.h
 *
 * 
 */

#ifndef _catalogs_hotel_items_filter_H_
#define _catalogs_hotel_items_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_items_filter_t catalogs_hotel_items_filter_t;


// Enum CATALOGTYPE for catalogs_hotel_items_filter

typedef enum  { pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_e;

char* catalogs_hotel_items_filter_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_e catalogs_hotel_items_filter_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_hotel_items_filter_t {
    pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_e catalog_type; //enum
    list_t *hotel_ids; //primitive container
    char *catalog_id; // string

} catalogs_hotel_items_filter_t;

catalogs_hotel_items_filter_t *catalogs_hotel_items_filter_create(
    pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_e catalog_type,
    list_t *hotel_ids,
    char *catalog_id
);

void catalogs_hotel_items_filter_free(catalogs_hotel_items_filter_t *catalogs_hotel_items_filter);

catalogs_hotel_items_filter_t *catalogs_hotel_items_filter_parseFromJSON(cJSON *catalogs_hotel_items_filterJSON);

cJSON *catalogs_hotel_items_filter_convertToJSON(catalogs_hotel_items_filter_t *catalogs_hotel_items_filter);

#endif /* _catalogs_hotel_items_filter_H_ */

