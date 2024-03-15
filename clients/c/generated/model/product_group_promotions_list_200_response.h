/*
 * product_group_promotions_list_200_response.h
 *
 * 
 */

#ifndef _product_group_promotions_list_200_response_H_
#define _product_group_promotions_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_promotions_list_200_response_t product_group_promotions_list_200_response_t;

#include "product_group_promotion_response_item.h"



typedef struct product_group_promotions_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} product_group_promotions_list_200_response_t;

product_group_promotions_list_200_response_t *product_group_promotions_list_200_response_create(
    list_t *items,
    char *bookmark
);

void product_group_promotions_list_200_response_free(product_group_promotions_list_200_response_t *product_group_promotions_list_200_response);

product_group_promotions_list_200_response_t *product_group_promotions_list_200_response_parseFromJSON(cJSON *product_group_promotions_list_200_responseJSON);

cJSON *product_group_promotions_list_200_response_convertToJSON(product_group_promotions_list_200_response_t *product_group_promotions_list_200_response);

#endif /* _product_group_promotions_list_200_response_H_ */

