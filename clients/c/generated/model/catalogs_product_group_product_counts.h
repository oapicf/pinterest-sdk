/*
 * catalogs_product_group_product_counts.h
 *
 * Product counts for a CatalogsProductGroup
 */

#ifndef _catalogs_product_group_product_counts_H_
#define _catalogs_product_group_product_counts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_product_counts_t catalogs_product_group_product_counts_t;




typedef struct catalogs_product_group_product_counts_t {
    double in_stock; //numeric
    double out_of_stock; //numeric
    double preorder; //numeric
    double total; //numeric

} catalogs_product_group_product_counts_t;

catalogs_product_group_product_counts_t *catalogs_product_group_product_counts_create(
    double in_stock,
    double out_of_stock,
    double preorder,
    double total
);

void catalogs_product_group_product_counts_free(catalogs_product_group_product_counts_t *catalogs_product_group_product_counts);

catalogs_product_group_product_counts_t *catalogs_product_group_product_counts_parseFromJSON(cJSON *catalogs_product_group_product_countsJSON);

cJSON *catalogs_product_group_product_counts_convertToJSON(catalogs_product_group_product_counts_t *catalogs_product_group_product_counts);

#endif /* _catalogs_product_group_product_counts_H_ */

