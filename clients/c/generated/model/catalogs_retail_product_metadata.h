/*
 * catalogs_retail_product_metadata.h
 *
 * Retail product metadata entity
 */

#ifndef _catalogs_retail_product_metadata_H_
#define _catalogs_retail_product_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_product_metadata_t catalogs_retail_product_metadata_t;

#include "non_nullable_catalogs_currency.h"
#include "non_nullable_product_availability_type.h"



typedef struct catalogs_retail_product_metadata_t {
    pinterest_rest_api_non_nullable_product_availability_type__e availability; //referenced enum
    pinterest_rest_api_non_nullable_catalogs_currency__e currency; //referenced enum
    char *item_group_id; // string
    char *item_id; // string
    double price; //numeric
    double sale_price; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_product_metadata_t;

__attribute__((deprecated)) catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_create(
    pinterest_rest_api_non_nullable_product_availability_type__e availability,
    pinterest_rest_api_non_nullable_catalogs_currency__e currency,
    char *item_group_id,
    char *item_id,
    double price,
    double sale_price
);

void catalogs_retail_product_metadata_free(catalogs_retail_product_metadata_t *catalogs_retail_product_metadata);

catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_parseFromJSON(cJSON *catalogs_retail_product_metadataJSON);

cJSON *catalogs_retail_product_metadata_convertToJSON(catalogs_retail_product_metadata_t *catalogs_retail_product_metadata);

#endif /* _catalogs_retail_product_metadata_H_ */

