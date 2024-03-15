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

// Enum  for audience_update_request

typedef enum  { pinterest_rest_api_audience_update_request__NULL = 0, pinterest_rest_api_audience_update_request__UPDATE, pinterest_rest_api_audience_update_request___REMOVE } pinterest_rest_api_audience_update_request__e;

char* audience_update_request_operation_type_ToString(pinterest_rest_api_audience_update_request__e operation_type);

pinterest_rest_api_audience_update_request__e audience_update_request_operation_type_FromString(char* operation_type);



typedef struct audience_update_request_t {
    char *ad_account_id; // string
    char *name; // string
    struct audience_rule_t *rule; //model
    char *description; // string
    audience_update_operation_type_t *operation_type; // custom

} audience_update_request_t;

audience_update_request_t *audience_update_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    char *description,
    audience_update_operation_type_t *operation_type
);

void audience_update_request_free(audience_update_request_t *audience_update_request);

audience_update_request_t *audience_update_request_parseFromJSON(cJSON *audience_update_requestJSON);

cJSON *audience_update_request_convertToJSON(audience_update_request_t *audience_update_request);

#endif /* _audience_update_request_H_ */

