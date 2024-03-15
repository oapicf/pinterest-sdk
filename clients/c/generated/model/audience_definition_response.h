/*
 * audience_definition_response.h
 *
 * 
 */

#ifndef _audience_definition_response_H_
#define _audience_definition_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_definition_response_t audience_definition_response_t;

#include "audience_definition.h"



typedef struct audience_definition_response_t {
    list_t *items; //nonprimitive container

} audience_definition_response_t;

audience_definition_response_t *audience_definition_response_create(
    list_t *items
);

void audience_definition_response_free(audience_definition_response_t *audience_definition_response);

audience_definition_response_t *audience_definition_response_parseFromJSON(cJSON *audience_definition_responseJSON);

cJSON *audience_definition_response_convertToJSON(audience_definition_response_t *audience_definition_response);

#endif /* _audience_definition_response_H_ */

