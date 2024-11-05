/*
 * catalogs_hotel_product_group_product_counts.h
 *
 * Product counts for a Hotel CatalogsProductGroup
 */

#ifndef _catalogs_hotel_product_group_product_counts_H_
#define _catalogs_hotel_product_group_product_counts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_product_group_product_counts_t catalogs_hotel_product_group_product_counts_t;


// Enum CATALOGTYPE for catalogs_hotel_product_group_product_counts

typedef enum  { pinterest_rest_api_catalogs_hotel_product_group_product_counts_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_product_group_product_counts_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_product_group_product_counts_CATALOGTYPE_e;

char* catalogs_hotel_product_group_product_counts_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_product_group_product_counts_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_product_group_product_counts_CATALOGTYPE_e catalogs_hotel_product_group_product_counts_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_hotel_product_group_product_counts_t {
    pinterest_rest_api_catalogs_hotel_product_group_product_counts_CATALOGTYPE_e catalog_type; //enum
    double total; //numeric

} catalogs_hotel_product_group_product_counts_t;

catalogs_hotel_product_group_product_counts_t *catalogs_hotel_product_group_product_counts_create(
    pinterest_rest_api_catalogs_hotel_product_group_product_counts_CATALOGTYPE_e catalog_type,
    double total
);

void catalogs_hotel_product_group_product_counts_free(catalogs_hotel_product_group_product_counts_t *catalogs_hotel_product_group_product_counts);

catalogs_hotel_product_group_product_counts_t *catalogs_hotel_product_group_product_counts_parseFromJSON(cJSON *catalogs_hotel_product_group_product_countsJSON);

cJSON *catalogs_hotel_product_group_product_counts_convertToJSON(catalogs_hotel_product_group_product_counts_t *catalogs_hotel_product_group_product_counts);

#endif /* _catalogs_hotel_product_group_product_counts_H_ */

