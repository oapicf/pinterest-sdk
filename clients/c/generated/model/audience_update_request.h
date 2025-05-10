/*
 * audience_update_request.h
 *
 * 
 */

#ifndef _audience_update_request_H_
#define _audience_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_update_request_t audience_update_request_t;

#include "audience_rule.h"
#include "audience_update_operation_type.h"



typedef struct audience_update_request_t {
    char *ad_account_id; // string
    char *name; // string
    struct audience_rule_t *rule; //model
    char *description; // string
    pinterest_rest_api_audience_update_operation_type__e operation_type; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} audience_update_request_t;

__attribute__((deprecated)) audience_update_request_t *audience_update_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    char *description,
    pinterest_rest_api_audience_update_operation_type__e operation_type
);

void audience_update_request_free(audience_update_request_t *audience_update_request);

audience_update_request_t *audience_update_request_parseFromJSON(cJSON *audience_update_requestJSON);

cJSON *audience_update_request_convertToJSON(audience_update_request_t *audience_update_request);

#endif /* _audience_update_request_H_ */

