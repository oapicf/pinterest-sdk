/*
 * integration_request_patch.h
 *
 * Schema used for updating the integration metadata.
 */

#ifndef _integration_request_patch_H_
#define _integration_request_patch_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_request_patch_t integration_request_patch_t;




typedef struct integration_request_patch_t {
    char *connected_merchant_id; // string
    char *connected_advertiser_id; // string
    char *connected_lba_id; // string
    char *connected_tag_id; // string
    char *partner_access_token; // string
    char *partner_refresh_token; // string
    char *partner_primary_email; // string
    double partner_access_token_expiry; //numeric
    double partner_refresh_token_expiry; //numeric
    char *scopes; // string
    char *additional_id_1; // string
    char *partner_metadata; // string

} integration_request_patch_t;

integration_request_patch_t *integration_request_patch_create(
    char *connected_merchant_id,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_tag_id,
    char *partner_access_token,
    char *partner_refresh_token,
    char *partner_primary_email,
    double partner_access_token_expiry,
    double partner_refresh_token_expiry,
    char *scopes,
    char *additional_id_1,
    char *partner_metadata
);

void integration_request_patch_free(integration_request_patch_t *integration_request_patch);

integration_request_patch_t *integration_request_patch_parseFromJSON(cJSON *integration_request_patchJSON);

cJSON *integration_request_patch_convertToJSON(integration_request_patch_t *integration_request_patch);

#endif /* _integration_request_patch_H_ */

