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
    char *id; // string
    char *external_business_id; // string
    char *connected_merchant_id; // string
    char *connected_user_id; // string
    char *connected_advertiser_id; // string
    char *connected_lba_id; // string
    char *connected_tag_id; // string
    char *partner_access_token; // string
    char *partner_refresh_token; // string
    char *partner_primary_email; // string
    int partner_access_token_expiry; //numeric
    int partner_refresh_token_expiry; //numeric
    char *scopes; // string
    char *partner_metadata; // string
    char *additional_id_1; // string
    int created_time; //numeric
    int updated_time; //numeric

} integration_record_t;

integration_record_t *integration_record_create(
    char *id,
    char *external_business_id,
    char *connected_merchant_id,
    char *connected_user_id,
    char *connected_advertiser_id,
    char *connected_lba_id,
    char *connected_tag_id,
    char *partner_access_token,
    char *partner_refresh_token,
    char *partner_primary_email,
    int partner_access_token_expiry,
    int partner_refresh_token_expiry,
    char *scopes,
    char *partner_metadata,
    char *additional_id_1,
    int created_time,
    int updated_time
);

void integration_record_free(integration_record_t *integration_record);

integration_record_t *integration_record_parseFromJSON(cJSON *integration_recordJSON);

cJSON *integration_record_convertToJSON(integration_record_t *integration_record);

#endif /* _integration_record_H_ */

