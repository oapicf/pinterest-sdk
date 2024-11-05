/*
 * ad_account_create_subscription_request_partner_metadata.h
 *
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 */

#ifndef _ad_account_create_subscription_request_partner_metadata_H_
#define _ad_account_create_subscription_request_partner_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_create_subscription_request_partner_metadata_t ad_account_create_subscription_request_partner_metadata_t;




typedef struct ad_account_create_subscription_request_partner_metadata_t {
    char *subscriber_key; // string

} ad_account_create_subscription_request_partner_metadata_t;

ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata_create(
    char *subscriber_key
);

void ad_account_create_subscription_request_partner_metadata_free(ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata);

ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata_parseFromJSON(cJSON *ad_account_create_subscription_request_partner_metadataJSON);

cJSON *ad_account_create_subscription_request_partner_metadata_convertToJSON(ad_account_create_subscription_request_partner_metadata_t *ad_account_create_subscription_request_partner_metadata);

#endif /* _ad_account_create_subscription_request_partner_metadata_H_ */

