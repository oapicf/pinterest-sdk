/*
 * integration_record.h
 *
 * Integration record
 */

#ifndef _integration_record_H_
#define _integration_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_record_t integration_record_t;




typedef struct integration_record_t {
    char *additional_id_1; // string
    char *connected_advertiser_id; // string
    char *connected_lba_id; // string
    char *connected_merchant_id; // string
    char *connected_tag_id; // string
    char *connected_user_id; // string
    int created_time; //numeric
    char *external_business_id; // string
    char *id; // string
    char *partner_access_token; // string
    int partner_access_token_expiry; //numeric
    char *partner_metadata; // string
    char *partner_primary_email; // string
    char *partner_refresh_token; // string
    int partner_refresh_token_expiry; //numeric
    char *scopes; // string
    int updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} integration_record_t;

__attribute__((deprecated)) integration_record_t *integration_record_create(
    char *additional_id_1,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_merchant_id,
    char *connected_tag_id,
    char *connected_user_id,
    int created_time,
    char *external_business_id,
    char *id,
    char *partner_access_token,
    int partner_access_token_expiry,
    char *partner_metadata,
    char *partner_primary_email,
    char *partner_refresh_token,
    int partner_refresh_token_expiry,
    char *scopes,
    int updated_time
);

void integration_record_free(integration_record_t *integration_record);

integration_record_t *integration_record_parseFromJSON(cJSON *integration_recordJSON);

cJSON *integration_record_convertToJSON(integration_record_t *integration_record);

#endif /* _integration_record_H_ */

