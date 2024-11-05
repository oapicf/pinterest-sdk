/*
 * ad_account_create_subscription_request.h
 *
 * 
 */

#ifndef _ad_account_create_subscription_request_H_
#define _ad_account_create_subscription_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_create_subscription_request_t ad_account_create_subscription_request_t;

#include "ad_account_create_subscription_request_partner_metadata.h"



typedef struct ad_account_create_subscription_request_t {
    char *webhook_url; // string
    char *lead_form_id; // string
    char *partner_access_token; // string
    char *partner_refresh_token; // string
    struct ad_account_create_subscription_request_partner_metadata_t *partner_metadata; //model

} ad_account_create_subscription_request_t;

ad_account_create_subscription_request_t *ad_account_create_subscription_request_create(
    char *webhook_url,
    char *lead_form_id,
    char *partner_access_token,
    char *partner_refresh_token,
    ad_account_create_subscription_request_partner_metadata_t *partner_metadata
);

void ad_account_create_subscription_request_free(ad_account_create_subscription_request_t *ad_account_create_subscription_request);

ad_account_create_subscription_request_t *ad_account_create_subscription_request_parseFromJSON(cJSON *ad_account_create_subscription_requestJSON);

cJSON *ad_account_create_subscription_request_convertToJSON(ad_account_create_subscription_request_t *ad_account_create_subscription_request);

#endif /* _ad_account_create_subscription_request_H_ */

