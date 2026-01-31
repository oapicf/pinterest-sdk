/*
 * audience_definition_scope.h
 *
 * Generated audience scope to request.
 */

#ifndef _audience_definition_scope_H_
#define _audience_definition_scope_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_definition_scope_t audience_definition_scope_t;


// Enum SCOPE for audience_definition_scope

typedef enum  { pinterest_rest_api_audience_definition_scope_SCOPE_NULL = 0, pinterest_rest_api_audience_definition_scope_SCOPE_PARTNER, pinterest_rest_api_audience_definition_scope_SCOPE_PINTEREST } pinterest_rest_api_audience_definition_scope_SCOPE_e;

char* audience_definition_scope_scope_ToString(pinterest_rest_api_audience_definition_scope_SCOPE_e scope);

pinterest_rest_api_audience_definition_scope_SCOPE_e audience_definition_scope_scope_FromString(char* scope);



typedef struct audience_definition_scope_t {
    pinterest_rest_api_audience_definition_scope_SCOPE_e scope; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} audience_definition_scope_t;

__attribute__((deprecated)) audience_definition_scope_t *audience_definition_scope_create(
    pinterest_rest_api_audience_definition_scope_SCOPE_e scope
);

void audience_definition_scope_free(audience_definition_scope_t *audience_definition_scope);

audience_definition_scope_t *audience_definition_scope_parseFromJSON(cJSON *audience_definition_scopeJSON);

cJSON *audience_definition_scope_convertToJSON(audience_definition_scope_t *audience_definition_scope);

#endif /* _audience_definition_scope_H_ */

