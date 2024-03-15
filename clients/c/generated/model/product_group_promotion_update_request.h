/*
 * product_group_promotion_update_request.h
 *
 * 
 */

#ifndef _product_group_promotion_update_request_H_
#define _product_group_promotion_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_promotion_update_request_t product_group_promotion_update_request_t;

#include "product_group_promotion.h"



typedef struct product_group_promotion_update_request_t {
    char *ad_group_id; // string
    list_t *product_group_promotion; //nonprimitive container

} product_group_promotion_update_request_t;

product_group_promotion_update_request_t *product_group_promotion_update_request_create(
    char *ad_group_id,
    list_t *product_group_promotion
);

void product_group_promotion_update_request_free(product_group_promotion_update_request_t *product_group_promotion_update_request);

product_group_promotion_update_request_t *product_group_promotion_update_request_parseFromJSON(cJSON *product_group_promotion_update_requestJSON);

cJSON *product_group_promotion_update_request_convertToJSON(product_group_promotion_update_request_t *product_group_promotion_update_request);

#endif /* _product_group_promotion_update_request_H_ */

