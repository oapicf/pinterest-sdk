/*
 * integration_request.h
 *
 * Schema used for creating the integration metadata.
 */

#ifndef _integration_request_H_
#define _integration_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_request_t integration_request_t;




typedef struct integration_request_t {
    char *external_business_id; // string
    char *connected_merchant_id; // string
    char *connected_advertiser_id; // string
    char *connected_lba_id; // string
    char *connected_tag_id; // string
    char *partner_access_token; // string
    char *partner_refresh_token; // string
    char *partner_primary_email; // string
    int partner_access_token_expiry; //numeric
    int partner_refresh_token_expiry; //numeric
    char *scopes; // string
    char *additional_id_1; // string
    char *partner_metadata; // string

} integration_request_t;

integration_request_t *integration_request_create(
    char *external_business_id,
    char *connected_merchant_id,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_tag_id,
    char *partner_access_token,
    char *partner_refresh_token,
    char *partner_primary_email,
    int partner_access_token_expiry,
    int partner_refresh_token_expiry,
    char *scopes,
    char *additional_id_1,
    char *partner_metadata
);

void integration_request_free(integration_request_t *integration_request);

integration_request_t *integration_request_parseFromJSON(cJSON *integration_requestJSON);

cJSON *integration_request_convertToJSON(integration_request_t *integration_request);

#endif /* _integration_request_H_ */

