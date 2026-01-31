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
    char *ad_account_id; // string
    char *api_version; // string
    int created_time; //numeric
    char *cryptographic_algorithm; // string
    char *cryptographic_key; // string
    char *id; // string
    char *lead_form_id; // string
    char *user_account_id; // string
    char *webhook_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_account_create_subscription_response_t;

__attribute__((deprecated)) ad_account_create_subscription_response_t *ad_account_create_subscription_response_create(
    char *ad_account_id,
    char *api_version,
    int created_time,
    char *cryptographic_algorithm,
    char *cryptographic_key,
    char *id,
    char *lead_form_id,
    char *user_account_id,
    char *webhook_url
);

void ad_account_create_subscription_response_free(ad_account_create_subscription_response_t *ad_account_create_subscription_response);

ad_account_create_subscription_response_t *ad_account_create_subscription_response_parseFromJSON(cJSON *ad_account_create_subscription_responseJSON);

cJSON *ad_account_create_subscription_response_convertToJSON(ad_account_create_subscription_response_t *ad_account_create_subscription_response);

#endif /* _ad_account_create_subscription_response_H_ */

