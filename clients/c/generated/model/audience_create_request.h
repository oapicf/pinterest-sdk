/*
 * audience_create_request.h
 *
 * 
 */

#ifndef _audience_create_request_H_
#define _audience_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_create_request_t audience_create_request_t;

#include "audience_create_request_1_audience_type.h"
#include "audience_rule.h"



typedef struct audience_create_request_t {
    char *ad_account_id; // string
    char *name; // string
    struct audience_rule_t *rule; //model
    char *description; // string
    struct audience_create_request_1_audience_type_t *audience_type; //model

} audience_create_request_t;

audience_create_request_t *audience_create_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    char *description,
    audience_create_request_1_audience_type_t *audience_type
);

void audience_create_request_free(audience_create_request_t *audience_create_request);

audience_create_request_t *audience_create_request_parseFromJSON(cJSON *audience_create_requestJSON);

cJSON *audience_create_request_convertToJSON(audience_create_request_t *audience_create_request);

#endif /* _audience_create_request_H_ */

