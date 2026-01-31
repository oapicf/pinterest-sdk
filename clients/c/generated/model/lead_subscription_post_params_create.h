/*
 * lead_subscription_post_params_create.h
 *
 * 
 */

#ifndef _lead_subscription_post_params_create_H_
#define _lead_subscription_post_params_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_subscription_post_params_create_t lead_subscription_post_params_create_t;

#include "lead_subscription_post_params_create_all_of_partner_metadata.h"



typedef struct lead_subscription_post_params_create_t {
    char *lead_form_id; // string
    char *webhook_url; // string
    char *partner_access_token; // string
    struct lead_subscription_post_params_create_all_of_partner_metadata_t *partner_metadata; //model
    char *partner_refresh_token; // string

    int _library_owned; // Is the library responsible for freeing this object?
} lead_subscription_post_params_create_t;

__attribute__((deprecated)) lead_subscription_post_params_create_t *lead_subscription_post_params_create_create(
    char *lead_form_id,
    char *webhook_url,
    char *partner_access_token,
    lead_subscription_post_params_create_all_of_partner_metadata_t *partner_metadata,
    char *partner_refresh_token
);

void lead_subscription_post_params_create_free(lead_subscription_post_params_create_t *lead_subscription_post_params_create);

lead_subscription_post_params_create_t *lead_subscription_post_params_create_parseFromJSON(cJSON *lead_subscription_post_params_createJSON);

cJSON *lead_subscription_post_params_create_convertToJSON(lead_subscription_post_params_create_t *lead_subscription_post_params_create);

#endif /* _lead_subscription_post_params_create_H_ */

