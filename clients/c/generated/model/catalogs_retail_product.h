/*
 * catalogs_retail_product.h
 *
 * 
 */

#ifndef _catalogs_retail_product_H_
#define _catalogs_retail_product_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_product_t catalogs_retail_product_t;

#include "catalogs_retail_product_metadata.h"
#include "pin.h"

// Enum CATALOGTYPE for catalogs_retail_product

typedef enum  { pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_e;

char* catalogs_retail_product_catalog_type_ToString(pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_e catalogs_retail_product_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_product_t {
    pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_e catalog_type; //enum
    struct catalogs_retail_product_metadata_t *metadata; //model
    struct pin_t *pin; //model

} catalogs_retail_product_t;

catalogs_retail_product_t *catalogs_retail_product_create(
    pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_e catalog_type,
    catalogs_retail_product_metadata_t *metadata,
    pin_t *pin
);

void catalogs_retail_product_free(catalogs_retail_product_t *catalogs_retail_product);

catalogs_retail_product_t *catalogs_retail_product_parseFromJSON(cJSON *catalogs_retail_productJSON);

cJSON *catalogs_retail_product_convertToJSON(catalogs_retail_product_t *catalogs_retail_product);

#endif /* _catalogs_retail_product_H_ */

