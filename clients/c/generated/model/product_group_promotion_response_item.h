/*
 * product_group_promotion_response_item.h
 *
 * 
 */

#ifndef _product_group_promotion_response_item_H_
#define _product_group_promotion_response_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_promotion_response_item_t product_group_promotion_response_item_t;

#include "exception.h"
#include "product_group_promotion_response_element.h"



typedef struct product_group_promotion_response_item_t {
    struct product_group_promotion_response_element_t *data; //model
    list_t *exceptions; //nonprimitive container

} product_group_promotion_response_item_t;

product_group_promotion_response_item_t *product_group_promotion_response_item_create(
    product_group_promotion_response_element_t *data,
    list_t *exceptions
);

void product_group_promotion_response_item_free(product_group_promotion_response_item_t *product_group_promotion_response_item);

product_group_promotion_response_item_t *product_group_promotion_response_item_parseFromJSON(cJSON *product_group_promotion_response_itemJSON);

cJSON *product_group_promotion_response_item_convertToJSON(product_group_promotion_response_item_t *product_group_promotion_response_item);

#endif /* _product_group_promotion_response_item_H_ */

