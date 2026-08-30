/*
 * ads_credit_discounts_response.h
 *
 * 
 */

#ifndef _ads_credit_discounts_response_H_
#define _ads_credit_discounts_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_credit_discounts_response_t ads_credit_discounts_response_t;

#include "ads_credit_discount_type.h"



typedef struct ads_credit_discounts_response_t {
    int *active; //boolean
    char *advertiser_id; // string
    char *discount_currency; // string
    double *discount_in_micro_currency; //numeric
    ads_credit_discount_type_t *discount_type; // custom
    double *remaining_discount_in_micro_currency; //numeric
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ads_credit_discounts_response_t;

__attribute__((deprecated)) ads_credit_discounts_response_t *ads_credit_discounts_response_create(
    int *active,
    char *advertiser_id,
    char *discount_currency,
    double *discount_in_micro_currency,
    ads_credit_discount_type_t *discount_type,
    double *remaining_discount_in_micro_currency,
    char *title
);

void ads_credit_discounts_response_free(ads_credit_discounts_response_t *ads_credit_discounts_response);

ads_credit_discounts_response_t *ads_credit_discounts_response_parseFromJSON(cJSON *ads_credit_discounts_responseJSON);

cJSON *ads_credit_discounts_response_convertToJSON(ads_credit_discounts_response_t *ads_credit_discounts_response);

#endif /* _ads_credit_discounts_response_H_ */

