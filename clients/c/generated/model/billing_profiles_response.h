/*
 * billing_profiles_response.h
 *
 * 
 */

#ifndef _billing_profiles_response_H_
#define _billing_profiles_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_profiles_response_t billing_profiles_response_t;

#include "billing_profile_card_type.h"
#include "billing_profile_payment_method_brand.h"
#include "billing_profile_status.h"
#include "billing_type.h"



typedef struct billing_profiles_response_t {
    char *advertiser_id; // string
    billing_type_t *billing_type; // custom
    billing_profile_card_type_t *card_type; // custom
    char *id; // string
    billing_profile_payment_method_brand_t *payment_method_brand; // custom
    billing_profile_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} billing_profiles_response_t;

__attribute__((deprecated)) billing_profiles_response_t *billing_profiles_response_create(
    char *advertiser_id,
    billing_type_t *billing_type,
    billing_profile_card_type_t *card_type,
    char *id,
    billing_profile_payment_method_brand_t *payment_method_brand,
    billing_profile_status_t *status
);

void billing_profiles_response_free(billing_profiles_response_t *billing_profiles_response);

billing_profiles_response_t *billing_profiles_response_parseFromJSON(cJSON *billing_profiles_responseJSON);

cJSON *billing_profiles_response_convertToJSON(billing_profiles_response_t *billing_profiles_response);

#endif /* _billing_profiles_response_H_ */

