/*
 * catalogs_product.h
 *
 * 
 */

#ifndef _catalogs_product_H_
#define _catalogs_product_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_t catalogs_product_t;

#include "catalogs_product_metadata.h"
#include "pin.h"



typedef struct catalogs_product_t {
    struct catalogs_product_metadata_t *metadata; //model
    struct pin_t *pin; //model

} catalogs_product_t;

catalogs_product_t *catalogs_product_create(
    catalogs_product_metadata_t *metadata,
    pin_t *pin
);

void catalogs_product_free(catalogs_product_t *catalogs_product);

catalogs_product_t *catalogs_product_parseFromJSON(cJSON *catalogs_productJSON);

cJSON *catalogs_product_convertToJSON(catalogs_product_t *catalogs_product);

#endif /* _catalogs_product_H_ */

