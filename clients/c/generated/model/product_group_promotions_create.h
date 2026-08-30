/*
 * product_group_promotions_create.h
 *
 * Resource create operation model.
 */

#ifndef _product_group_promotions_create_H_
#define _product_group_promotions_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_promotions_create_t product_group_promotions_create_t;

#include "product_group_promotion.h"



typedef struct product_group_promotions_create_t {
    char *ad_group_id; // string
    list_t *product_group_promotion; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} product_group_promotions_create_t;

__attribute__((deprecated)) product_group_promotions_create_t *product_group_promotions_create_create(
    char *ad_group_id,
    list_t *product_group_promotion
);

void product_group_promotions_create_free(product_group_promotions_create_t *product_group_promotions_create);

product_group_promotions_create_t *product_group_promotions_create_parseFromJSON(cJSON *product_group_promotions_createJSON);

cJSON *product_group_promotions_create_convertToJSON(product_group_promotions_create_t *product_group_promotions_create);

#endif /* _product_group_promotions_create_H_ */

