/*
 * ad_account_get_subscription_response.h
 *
 * 
 */

#ifndef _ad_account_get_subscription_response_H_
#define _ad_account_get_subscription_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_get_subscription_response_t ad_account_get_subscription_response_t;




typedef struct ad_account_get_subscription_response_t {
    char *lead_form_id; // string
    char *webhook_url; // string
    char *id; // string
    char *user_account_id; // string
    char *ad_account_id; // string
    char *api_version; // string
    char *cryptographic_key; // string
    char *cryptographic_algorithm; // string
    int created_time; //numeric

} ad_account_get_subscription_response_t;

ad_account_get_subscription_response_t *ad_account_get_subscription_response_create(
    char *lead_form_id,
    char *webhook_url,
    char *id,
    char *user_account_id,
    char *ad_account_id,
    char *api_version,
    char *cryptographic_key,
    char *cryptographic_algorithm,
    int created_time
);

void ad_account_get_subscription_response_free(ad_account_get_subscription_response_t *ad_account_get_subscription_response);

ad_account_get_subscription_response_t *ad_account_get_subscription_response_parseFromJSON(cJSON *ad_account_get_subscription_responseJSON);

cJSON *ad_account_get_subscription_response_convertToJSON(ad_account_get_subscription_response_t *ad_account_get_subscription_response);

#endif /* _ad_account_get_subscription_response_H_ */

