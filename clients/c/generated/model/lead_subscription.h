/*
 * lead_subscription.h
 *
 * 
 */

#ifndef _lead_subscription_H_
#define _lead_subscription_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_subscription_t lead_subscription_t;




typedef struct lead_subscription_t {
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
} lead_subscription_t;

__attribute__((deprecated)) lead_subscription_t *lead_subscription_create(
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

void lead_subscription_free(lead_subscription_t *lead_subscription);

lead_subscription_t *lead_subscription_parseFromJSON(cJSON *lead_subscriptionJSON);

cJSON *lead_subscription_convertToJSON(lead_subscription_t *lead_subscription);

#endif /* _lead_subscription_H_ */

