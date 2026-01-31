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

#include "product_group_promotion.h"



typedef struct product_group_promotions_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} product_group_promotions_list_200_response_t;

__attribute__((deprecated)) product_group_promotions_list_200_response_t *product_group_promotions_list_200_response_create(
    char *bookmark,
    list_t *items
);

void product_group_promotions_list_200_response_free(product_group_promotions_list_200_response_t *product_group_promotions_list_200_response);

product_group_promotions_list_200_response_t *product_group_promotions_list_200_response_parseFromJSON(cJSON *product_group_promotions_list_200_responseJSON);

cJSON *product_group_promotions_list_200_response_convertToJSON(product_group_promotions_list_200_response_t *product_group_promotions_list_200_response);

#endif /* _product_group_promotions_list_200_response_H_ */

