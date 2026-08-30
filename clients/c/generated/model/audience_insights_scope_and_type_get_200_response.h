/*
 * audience_insights_scope_and_type_get_200_response.h
 *
 * 
 */

#ifndef _audience_insights_scope_and_type_get_200_response_H_
#define _audience_insights_scope_and_type_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_insights_scope_and_type_get_200_response_t audience_insights_scope_and_type_get_200_response_t;

#include "audience_definition.h"



typedef struct audience_insights_scope_and_type_get_200_response_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} audience_insights_scope_and_type_get_200_response_t;

__attribute__((deprecated)) audience_insights_scope_and_type_get_200_response_t *audience_insights_scope_and_type_get_200_response_create(
    list_t *items
);

void audience_insights_scope_and_type_get_200_response_free(audience_insights_scope_and_type_get_200_response_t *audience_insights_scope_and_type_get_200_response);

audience_insights_scope_and_type_get_200_response_t *audience_insights_scope_and_type_get_200_response_parseFromJSON(cJSON *audience_insights_scope_and_type_get_200_responseJSON);

cJSON *audience_insights_scope_and_type_get_200_response_convertToJSON(audience_insights_scope_and_type_get_200_response_t *audience_insights_scope_and_type_get_200_response);

#endif /* _audience_insights_scope_and_type_get_200_response_H_ */

