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
#include "catalogs_type.h"



typedef struct catalogs_product_group_product_counts_vertical_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    double in_stock; //numeric
    double out_of_stock; //numeric
    double preorder; //numeric
    double total; //numeric
    double videos; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_product_counts_vertical_t;

__attribute__((deprecated)) catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    double in_stock,
    double out_of_stock,
    double preorder,
    double total,
    double videos
);

void catalogs_product_group_product_counts_vertical_free(catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical);

catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical_parseFromJSON(cJSON *catalogs_product_group_product_counts_verticalJSON);

cJSON *catalogs_product_group_product_counts_vertical_convertToJSON(catalogs_product_group_product_counts_vertical_t *catalogs_product_group_product_counts_vertical);

#endif /* _catalogs_product_group_product_counts_vertical_H_ */

