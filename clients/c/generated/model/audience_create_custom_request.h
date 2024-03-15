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

// Enum  for audience_create_custom_request

typedef enum  { pinterest_rest_api_audience_create_custom_request__NULL = 0, pinterest_rest_api_audience_create_custom_request__CUSTOM, pinterest_rest_api_audience_create_custom_request__SYNDICATED } pinterest_rest_api_audience_create_custom_request__e;

char* audience_create_custom_request_sharing_type_ToString(pinterest_rest_api_audience_create_custom_request__e sharing_type);

pinterest_rest_api_audience_create_custom_request__e audience_create_custom_request_sharing_type_FromString(char* sharing_type);

// Enum  for audience_create_custom_request

typedef enum  { pinterest_rest_api_audience_create_custom_request__NULL = 0, pinterest_rest_api_audience_create_custom_request___1p, pinterest_rest_api_audience_create_custom_request___3p } pinterest_rest_api_audience_create_custom_request__e;

char* audience_create_custom_request_data_party_ToString(pinterest_rest_api_audience_create_custom_request__e data_party);

pinterest_rest_api_audience_create_custom_request__e audience_create_custom_request_data_party_FromString(char* data_party);



typedef struct audience_create_custom_request_t {
    char *ad_account_id; // string
    char *name; // string
    struct audience_rule_t *rule; //model
    audience_sharing_type_t *sharing_type; // custom
    audience_data_party_t *data_party; // custom
    char *category; // string

} audience_create_custom_request_t;

audience_create_custom_request_t *audience_create_custom_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    audience_sharing_type_t *sharing_type,
    audience_data_party_t *data_party,
    char *category
);

void audience_create_custom_request_free(audience_create_custom_request_t *audience_create_custom_request);

audience_create_custom_request_t *audience_create_custom_request_parseFromJSON(cJSON *audience_create_custom_requestJSON);

cJSON *audience_create_custom_request_convertToJSON(audience_create_custom_request_t *audience_create_custom_request);

#endif /* _audience_create_custom_request_H_ */

