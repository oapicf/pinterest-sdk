/*
 * lead_subscription_post_params_create_all_of_partner_metadata.h
 *
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 */

#ifndef _lead_subscription_post_params_create_all_of_partner_metadata_H_
#define _lead_subscription_post_params_create_all_of_partner_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_subscription_post_params_create_all_of_partner_metadata_t lead_subscription_post_params_create_all_of_partner_metadata_t;




typedef struct lead_subscription_post_params_create_all_of_partner_metadata_t {
    char *subscriber_key; // string

    int _library_owned; // Is the library responsible for freeing this object?
} lead_subscription_post_params_create_all_of_partner_metadata_t;

__attribute__((deprecated)) lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata_create(
    char *subscriber_key
);

void lead_subscription_post_params_create_all_of_partner_metadata_free(lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata);

lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata_parseFromJSON(cJSON *lead_subscription_post_params_create_all_of_partner_metadataJSON);

cJSON *lead_subscription_post_params_create_all_of_partner_metadata_convertToJSON(lead_subscription_post_params_create_all_of_partner_metadata_t *lead_subscription_post_params_create_all_of_partner_metadata);

#endif /* _lead_subscription_post_params_create_all_of_partner_metadata_H_ */

