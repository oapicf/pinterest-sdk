/*
 * audience_create_custom_request.h
 *
 * 
 */

#ifndef _audience_create_custom_request_H_
#define _audience_create_custom_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_create_custom_request_t audience_create_custom_request_t;

#include "audience_data_party.h"
#include "audience_rule.h"
#include "audience_sharing_type.h"



typedef struct audience_create_custom_request_t {
    char *ad_account_id; // string
    char *name; // string
    struct audience_rule_t *rule; //model
    pinterest_rest_api_audience_sharing_type__e sharing_type; //referenced enum
    pinterest_rest_api_audience_data_party__e data_party; //referenced enum
    char *category; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audience_create_custom_request_t;

__attribute__((deprecated)) audience_create_custom_request_t *audience_create_custom_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    pinterest_rest_api_audience_sharing_type__e sharing_type,
    pinterest_rest_api_audience_data_party__e data_party,
    char *category
);

void audience_create_custom_request_free(audience_create_custom_request_t *audience_create_custom_request);

audience_create_custom_request_t *audience_create_custom_request_parseFromJSON(cJSON *audience_create_custom_requestJSON);

cJSON *audience_create_custom_request_convertToJSON(audience_create_custom_request_t *audience_create_custom_request);

#endif /* _audience_create_custom_request_H_ */

