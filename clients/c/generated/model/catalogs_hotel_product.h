/*
 * catalogs_hotel_product.h
 *
 * 
 */

#ifndef _catalogs_hotel_product_H_
#define _catalogs_hotel_product_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_product_t catalogs_hotel_product_t;

#include "catalogs_hotel_product_metadata.h"
#include "pin.h"

// Enum CATALOGTYPE for catalogs_hotel_product

typedef enum  { pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e;

char* catalogs_hotel_product_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e catalogs_hotel_product_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_hotel_product_t {
    pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e catalog_type; //enum
    struct catalogs_hotel_product_metadata_t *metadata; //model
    struct pin_t *pin; //model

} catalogs_hotel_product_t;

catalogs_hotel_product_t *catalogs_hotel_product_create(
    pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_e catalog_type,
    catalogs_hotel_product_metadata_t *metadata,
    pin_t *pin
);

void catalogs_hotel_product_free(catalogs_hotel_product_t *catalogs_hotel_product);

catalogs_hotel_product_t *catalogs_hotel_product_parseFromJSON(cJSON *catalogs_hotel_productJSON);

cJSON *catalogs_hotel_product_convertToJSON(catalogs_hotel_product_t *catalogs_hotel_product);

#endif /* _catalogs_hotel_product_H_ */

