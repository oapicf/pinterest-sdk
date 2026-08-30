/*
 * lead_subscription_post_params.h
 *
 * 
 */

#ifndef _lead_subscription_post_params_H_
#define _lead_subscription_post_params_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_subscription_post_params_t lead_subscription_post_params_t;

#include "partner_metadata.h"



typedef struct lead_subscription_post_params_t {
    char *ad_account_id; // string
    char *api_version; // string
    int *created_time; //numeric
    char *cryptographic_algorithm; // string
    char *cryptographic_key; // string
    char *id; // string
    char *lead_form_id; // string
    char *user_account_id; // string
    char *webhook_url; // string
    char *partner_access_token; // string
    struct partner_metadata_t *partner_metadata; //model
    char *partner_refresh_token; // string

    int _library_owned; // Is the library responsible for freeing this object?
} lead_subscription_post_params_t;

__attribute__((deprecated)) lead_subscription_post_params_t *lead_subscription_post_params_create(
    char *ad_account_id,
    char *api_version,
    int *created_time,
    char *cryptographic_algorithm,
    char *cryptographic_key,
    char *id,
    char *lead_form_id,
    char *user_account_id,
    char *webhook_url,
    char *partner_access_token,
    partner_metadata_t *partner_metadata,
    char *partner_refresh_token
);

void lead_subscription_post_params_free(lead_subscription_post_params_t *lead_subscription_post_params);

lead_subscription_post_params_t *lead_subscription_post_params_parseFromJSON(cJSON *lead_subscription_post_paramsJSON);

cJSON *lead_subscription_post_params_convertToJSON(lead_subscription_post_params_t *lead_subscription_post_params);

#endif /* _lead_subscription_post_params_H_ */

