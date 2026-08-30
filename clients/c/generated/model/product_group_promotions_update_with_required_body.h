/*
 * product_group_promotions_update_with_required_body.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _product_group_promotions_update_with_required_body_H_
#define _product_group_promotions_update_with_required_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_promotions_update_with_required_body_t product_group_promotions_update_with_required_body_t;

#include "product_group_promotion.h"



typedef struct product_group_promotions_update_with_required_body_t {
    char *ad_group_id; // string
    list_t *product_group_promotion; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} product_group_promotions_update_with_required_body_t;

__attribute__((deprecated)) product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body_create(
    char *ad_group_id,
    list_t *product_group_promotion
);

void product_group_promotions_update_with_required_body_free(product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body);

product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body_parseFromJSON(cJSON *product_group_promotions_update_with_required_bodyJSON);

cJSON *product_group_promotions_update_with_required_body_convertToJSON(product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body);

#endif /* _product_group_promotions_update_with_required_body_H_ */

