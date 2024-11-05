/*
 * catalogs_retail_product_group_product_counts.h
 *
 * Product counts for a Retail CatalogsProductGroup
 */

#ifndef _catalogs_retail_product_group_product_counts_H_
#define _catalogs_retail_product_group_product_counts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_product_group_product_counts_t catalogs_retail_product_group_product_counts_t;


// Enum CATALOGTYPE for catalogs_retail_product_group_product_counts

typedef enum  { pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e;

char* catalogs_retail_product_group_product_counts_catalog_type_ToString(pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalogs_retail_product_group_product_counts_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_product_group_product_counts_t {
    pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalog_type; //enum
    double in_stock; //numeric
    double out_of_stock; //numeric
    double preorder; //numeric
    double total; //numeric
    double videos; //numeric

} catalogs_retail_product_group_product_counts_t;

catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_create(
    pinterest_rest_api_catalogs_retail_product_group_product_counts_CATALOGTYPE_e catalog_type,
    double in_stock,
    double out_of_stock,
    double preorder,
    double total,
    double videos
);

void catalogs_retail_product_group_product_counts_free(catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts);

catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts_parseFromJSON(cJSON *catalogs_retail_product_group_product_countsJSON);

cJSON *catalogs_retail_product_group_product_counts_convertToJSON(catalogs_retail_product_group_product_counts_t *catalogs_retail_product_group_product_counts);

#endif /* _catalogs_retail_product_group_product_counts_H_ */

