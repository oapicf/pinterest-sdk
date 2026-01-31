/*
 * audience_definition_type.h
 *
 * Generated audience type to request.
 */

#ifndef _audience_definition_type_H_
#define _audience_definition_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_definition_type_t audience_definition_type_t;


// Enum SCOPE for audience_definition_type

typedef enum  { pinterest_rest_api_audience_definition_type_SCOPE_NULL = 0, pinterest_rest_api_audience_definition_type_SCOPE_IMPRESSION_PLUS_ENGAGEMENT, pinterest_rest_api_audience_definition_type_SCOPE_ENGAGEMENT } pinterest_rest_api_audience_definition_type_SCOPE_e;

char* audience_definition_type_scope_ToString(pinterest_rest_api_audience_definition_type_SCOPE_e scope);

pinterest_rest_api_audience_definition_type_SCOPE_e audience_definition_type_scope_FromString(char* scope);



typedef struct audience_definition_type_t {
    pinterest_rest_api_audience_definition_type_SCOPE_e scope; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} audience_definition_type_t;

__attribute__((deprecated)) audience_definition_type_t *audience_definition_type_create(
    pinterest_rest_api_audience_definition_type_SCOPE_e scope
);

void audience_definition_type_free(audience_definition_type_t *audience_definition_type);

audience_definition_type_t *audience_definition_type_parseFromJSON(cJSON *audience_definition_typeJSON);

cJSON *audience_definition_type_convertToJSON(audience_definition_type_t *audience_definition_type);

#endif /* _audience_definition_type_H_ */

