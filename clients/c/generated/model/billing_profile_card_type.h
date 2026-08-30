/*
 * billing_profile_card_type.h
 *
 * Type of the credit card.
 */

#ifndef _billing_profile_card_type_H_
#define _billing_profile_card_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_profile_card_type_t billing_profile_card_type_t;


// Enum  for billing_profile_card_type

typedef enum { pinterest_rest_api_billing_profile_card_type__NULL = 0, pinterest_rest_api_billing_profile_card_type__UNKNOWN, pinterest_rest_api_billing_profile_card_type__VISA, pinterest_rest_api_billing_profile_card_type__MASTERCARD, pinterest_rest_api_billing_profile_card_type__AMERICAN_EXPRESS, pinterest_rest_api_billing_profile_card_type__DISCOVER, pinterest_rest_api_billing_profile_card_type__ELO } pinterest_rest_api_billing_profile_card_type__e;

char* billing_profile_card_type_billing_profile_card_type_ToString(pinterest_rest_api_billing_profile_card_type__e billing_profile_card_type);

pinterest_rest_api_billing_profile_card_type__e billing_profile_card_type_billing_profile_card_type_FromString(char* billing_profile_card_type);

cJSON *billing_profile_card_type_convertToJSON(pinterest_rest_api_billing_profile_card_type__e billing_profile_card_type);

pinterest_rest_api_billing_profile_card_type__e billing_profile_card_type_parseFromJSON(cJSON *billing_profile_card_typeJSON);

#endif /* _billing_profile_card_type_H_ */

