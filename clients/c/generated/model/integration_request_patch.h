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
    char *additional_id_1; // string
    char *connected_advertiser_id; // string
    char *connected_lba_id; // string
    char *connected_merchant_id; // string
    char *connected_tag_id; // string
    char *partner_access_token; // string
    double partner_access_token_expiry; //numeric
    char *partner_metadata; // string
    char *partner_primary_email; // string
    char *partner_refresh_token; // string
    double partner_refresh_token_expiry; //numeric
    char *scopes; // string

    int _library_owned; // Is the library responsible for freeing this object?
} integration_request_patch_t;

__attribute__((deprecated)) integration_request_patch_t *integration_request_patch_create(
    char *additional_id_1,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_merchant_id,
    char *connected_tag_id,
    char *partner_access_token,
    double partner_access_token_expiry,
    char *partner_metadata,
    char *partner_primary_email,
    char *partner_refresh_token,
    double partner_refresh_token_expiry,
    char *scopes
);

void integration_request_patch_free(integration_request_patch_t *integration_request_patch);

integration_request_patch_t *integration_request_patch_parseFromJSON(cJSON *integration_request_patchJSON);

cJSON *integration_request_patch_convertToJSON(integration_request_patch_t *integration_request_patch);

#endif /* _integration_request_patch_H_ */

