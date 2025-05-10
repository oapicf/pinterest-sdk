/*
 * catalogs_product.h
 *
 * Catalogs product for all verticals
 */

#ifndef _catalogs_product_H_
#define _catalogs_product_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_t catalogs_product_t;

#include "catalogs_creative_assets_product.h"
#include "catalogs_creative_assets_product_metadata.h"
#include "catalogs_hotel_product.h"
#include "catalogs_retail_product.h"
#include "catalogs_type.h"
#include "pin.h"



typedef struct catalogs_product_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    struct catalogs_creative_assets_product_metadata_t *metadata; //model
    struct pin_t *pin; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_t;

__attribute__((deprecated)) catalogs_product_t *catalogs_product_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_creative_assets_product_metadata_t *metadata,
    pin_t *pin
);

void catalogs_product_free(catalogs_product_t *catalogs_product);

catalogs_product_t *catalogs_product_parseFromJSON(cJSON *catalogs_productJSON);

cJSON *catalogs_product_convertToJSON(catalogs_product_t *catalogs_product);

#endif /* _catalogs_product_H_ */

