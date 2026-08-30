/*
 * catalogs_hotel_product_group.h
 *
 * 
 */

#ifndef _catalogs_hotel_product_group_H_
#define _catalogs_hotel_product_group_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_product_group_t catalogs_hotel_product_group_t;

#include "catalogs_hotel_product_group_filters.h"
#include "catalogs_hotel_product_group_type.h"

// Enum CATALOGTYPE for catalogs_hotel_product_group

typedef enum  { pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_e;

char* catalogs_hotel_product_group_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_e catalogs_hotel_product_group_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_hotel_product_group_t {
    char *catalog_id; // string
    pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_e catalog_type; //enum
    int *created_at; //numeric
    char *description; // string
    struct catalogs_hotel_product_group_filters_t *filters; //model
    char *id; // string
    char *name; // string
    pinterest_rest_api_catalogs_hotel_product_group_type__e type; //referenced enum
    int *updated_at; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_product_group_t;

__attribute__((deprecated)) catalogs_hotel_product_group_t *catalogs_hotel_product_group_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_e catalog_type,
    int *created_at,
    char *description,
    catalogs_hotel_product_group_filters_t *filters,
    char *id,
    char *name,
    pinterest_rest_api_catalogs_hotel_product_group_type__e type,
    int *updated_at
);

void catalogs_hotel_product_group_free(catalogs_hotel_product_group_t *catalogs_hotel_product_group);

catalogs_hotel_product_group_t *catalogs_hotel_product_group_parseFromJSON(cJSON *catalogs_hotel_product_groupJSON);

cJSON *catalogs_hotel_product_group_convertToJSON(catalogs_hotel_product_group_t *catalogs_hotel_product_group);

#endif /* _catalogs_hotel_product_group_H_ */

