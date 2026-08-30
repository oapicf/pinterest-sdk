/*
 * carting_product.h
 *
 * 
 */

#ifndef _carting_product_H_
#define _carting_product_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct carting_product_t carting_product_t;

#include "carting_retailer.h"



typedef struct carting_product_t {
    char *carting_product_id; // string
    int *display_preferred_retailers_only; //boolean
    int *display_product_price; //boolean
    list_t *preferred_retailers; //nonprimitive container
    int *randomize_preferred_retailers; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} carting_product_t;

__attribute__((deprecated)) carting_product_t *carting_product_create(
    char *carting_product_id,
    int *display_preferred_retailers_only,
    int *display_product_price,
    list_t *preferred_retailers,
    int *randomize_preferred_retailers
);

void carting_product_free(carting_product_t *carting_product);

carting_product_t *carting_product_parseFromJSON(cJSON *carting_productJSON);

cJSON *carting_product_convertToJSON(carting_product_t *carting_product);

#endif /* _carting_product_H_ */

