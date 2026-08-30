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
    char *additional_id_1; // string
    char *connected_advertiser_id; // string
    char *connected_lba_id; // string
    char *connected_merchant_id; // string
    char *connected_tag_id; // string
    char *connected_user_id; // string
    double *created_timestamp; //numeric
    char *external_business_id; // string
    char *id; // string
    double *partner_access_token_expiry; //numeric
    char *partner_metadata; // string
    double *partner_refresh_token_expiry; //numeric
    char *scopes; // string
    double *updated_timestamp; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} integration_metadata_t;

__attribute__((deprecated)) integration_metadata_t *integration_metadata_create(
    char *additional_id_1,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_merchant_id,
    char *connected_tag_id,
    char *connected_user_id,
    double *created_timestamp,
    char *external_business_id,
    char *id,
    double *partner_access_token_expiry,
    char *partner_metadata,
    double *partner_refresh_token_expiry,
    char *scopes,
    double *updated_timestamp
);

void integration_metadata_free(integration_metadata_t *integration_metadata);

integration_metadata_t *integration_metadata_parseFromJSON(cJSON *integration_metadataJSON);

cJSON *integration_metadata_convertToJSON(integration_metadata_t *integration_metadata);

#endif /* _integration_metadata_H_ */

