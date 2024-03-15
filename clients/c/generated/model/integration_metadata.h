/*
 * integration_metadata.h
 *
 * Integration metadata
 */

#ifndef _integration_metadata_H_
#define _integration_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_metadata_t integration_metadata_t;




typedef struct integration_metadata_t {
    char *id; // string
    char *external_business_id; // string
    char *connected_merchant_id; // string
    char *connected_user_id; // string
    char *connected_advertiser_id; // string
    char *connected_lba_id; // string
    char *connected_tag_id; // string
    double partner_access_token_expiry; //numeric
    double partner_refresh_token_expiry; //numeric
    char *scopes; // string
    double created_timestamp; //numeric
    double updated_timestamp; //numeric
    char *additional_id_1; // string
    char *partner_metadata; // string

} integration_metadata_t;

integration_metadata_t *integration_metadata_create(
    char *id,
    char *external_business_id,
    char *connected_merchant_id,
    char *connected_user_id,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_tag_id,
    double partner_access_token_expiry,
    double partner_refresh_token_expiry,
    char *scopes,
    double created_timestamp,
    double updated_timestamp,
    char *additional_id_1,
    char *partner_metadata
);

void integration_metadata_free(integration_metadata_t *integration_metadata);

integration_metadata_t *integration_metadata_parseFromJSON(cJSON *integration_metadataJSON);

cJSON *integration_metadata_convertToJSON(integration_metadata_t *integration_metadata);

#endif /* _integration_metadata_H_ */

