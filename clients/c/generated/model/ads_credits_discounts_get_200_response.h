/*
 * ads_credits_discounts_get_200_response.h
 *
 * 
 */

#ifndef _ads_credits_discounts_get_200_response_H_
#define _ads_credits_discounts_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_credits_discounts_get_200_response_t ads_credits_discounts_get_200_response_t;

#include "ads_credit_discounts_response.h"



typedef struct ads_credits_discounts_get_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} ads_credits_discounts_get_200_response_t;

ads_credits_discounts_get_200_response_t *ads_credits_discounts_get_200_response_create(
    list_t *items,
    char *bookmark
);

void ads_credits_discounts_get_200_response_free(ads_credits_discounts_get_200_response_t *ads_credits_discounts_get_200_response);

ads_credits_discounts_get_200_response_t *ads_credits_discounts_get_200_response_parseFromJSON(cJSON *ads_credits_discounts_get_200_responseJSON);

cJSON *ads_credits_discounts_get_200_response_convertToJSON(ads_credits_discounts_get_200_response_t *ads_credits_discounts_get_200_response);

#endif /* _ads_credits_discounts_get_200_response_H_ */

