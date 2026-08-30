/*
 * integration_metadata_update.h
 *
 * Resource create or update operation model.
 */

#ifndef _integration_metadata_update_H_
#define _integration_metadata_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_metadata_update_t integration_metadata_update_t;




typedef struct integration_metadata_update_t {
    char *additional_id_1; // string
    char *connected_advertiser_id; // string
    char *connected_lba_id; // string
    char *connected_merchant_id; // string
    char *connected_tag_id; // string
    char *partner_access_token; // string
    double *partner_access_token_expiry; //numeric
    char *partner_metadata; // string
    char *partner_primary_email; // string
    char *partner_refresh_token; // string
    double *partner_refresh_token_expiry; //numeric
    char *scopes; // string

    int _library_owned; // Is the library responsible for freeing this object?
} integration_metadata_update_t;

__attribute__((deprecated)) integration_metadata_update_t *integration_metadata_update_create(
    char *additional_id_1,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_merchant_id,
    char *connected_tag_id,
    char *partner_access_token,
    double *partner_access_token_expiry,
    char *partner_metadata,
    char *partner_primary_email,
    char *partner_refresh_token,
    double *partner_refresh_token_expiry,
    char *scopes
);

void integration_metadata_update_free(integration_metadata_update_t *integration_metadata_update);

integration_metadata_update_t *integration_metadata_update_parseFromJSON(cJSON *integration_metadata_updateJSON);

cJSON *integration_metadata_update_convertToJSON(integration_metadata_update_t *integration_metadata_update);

#endif /* _integration_metadata_update_H_ */

