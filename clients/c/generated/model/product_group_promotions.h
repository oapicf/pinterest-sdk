/*
 * product_group_promotions.h
 *
 * Wrapper model for ProductGroupPromotion.
 */

#ifndef _product_group_promotions_H_
#define _product_group_promotions_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_promotions_t product_group_promotions_t;

#include "product_group_promotion_response_item.h"



typedef struct product_group_promotions_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} product_group_promotions_t;

__attribute__((deprecated)) product_group_promotions_t *product_group_promotions_create(
    list_t *items
);

void product_group_promotions_free(product_group_promotions_t *product_group_promotions);

product_group_promotions_t *product_group_promotions_parseFromJSON(cJSON *product_group_promotionsJSON);

cJSON *product_group_promotions_convertToJSON(product_group_promotions_t *product_group_promotions);

#endif /* _product_group_promotions_H_ */

