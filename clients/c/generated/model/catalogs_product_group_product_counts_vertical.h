/*
 * catalogs_product_group_product_counts_vertical.h
 *
 * Product counts for a CatalogsProductGroup
 */

#ifndef _catalogs_product_group_product_counts_vertical_H_
#define _catalogs_product_group_product_counts_vertical_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_product_counts_vertical_t catalogs_product_group_product_counts_vertical_t;

#include "catalogs_creative_assets_product_group_product_counts.h"
#include "catalogs_hotel_product_group_product_counts.h"
#include "catalogs_retail_product_group_product_counts.h"

// Enum CATALOGTYPE for catalogs_product_group_product_counts_vertical

typedef enum  { pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e;

char* catalogs_product_group_product_counts_vertical_catalog_type_ToString(pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalogs_product_group_product_counts_vertical_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_product_group_product_counts_vertical_t {
    pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalog_type; //enum
    double *in_stock; //numeric
    double *out_of_stock; //numeric
    double *preorder; //numeric
    double *total; //numeric
    double *videos; //numeric
    double *app_links; //numeric
    double *images; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_product_counts_vertical_t;

__attribute__((deprecated)) catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_create(
    pinterest_rest_api_catalogs_product_group_product_counts_vertical_CATALOGTYPE_e catalog_type,
    double *in_stock,
    double *out_of_stock,
    double *preorder,
    double *total,
    double *videos,
    double *app_links,
    double *images
);

void catalogs_product_group_product_counts_vertical_free(catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical);

catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_parseFromJSON(cJSON *catalogs_product_group_product_counts_verticalJSON);

cJSON *catalogs_product_group_product_counts_vertical_convertToJSON(catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical);

#endif /* _catalogs_product_group_product_counts_vertical_H_ */

