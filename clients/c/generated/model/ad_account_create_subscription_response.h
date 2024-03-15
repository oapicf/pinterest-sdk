/*
 * ad_account_create_subscription_response.h
 *
 * 
 */

#ifndef _ad_account_create_subscription_response_H_
#define _ad_account_create_subscription_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_create_subscription_response_t ad_account_create_subscription_response_t;




typedef struct ad_account_create_subscription_response_t {
    char *id; // string
    char *cryptographic_key; // string
    char *cryptographic_algorithm; // string
    int created_time; //numeric

} ad_account_create_subscription_response_t;

ad_account_create_subscription_response_t *ad_account_create_subscription_response_create(
    char *id,
    char *cryptographic_key,
    char *cryptographic_algorithm,
    int created_time
);

void ad_account_create_subscription_response_free(ad_account_create_subscription_response_t *ad_account_create_subscription_response);

ad_account_create_subscription_response_t *ad_account_create_subscription_response_parseFromJSON(cJSON *ad_account_create_subscription_responseJSON);

cJSON *ad_account_create_subscription_response_convertToJSON(ad_account_create_subscription_response_t *ad_account_create_subscription_response);

#endif /* _ad_account_create_subscription_response_H_ */

