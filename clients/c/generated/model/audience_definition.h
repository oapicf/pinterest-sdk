/*
 * audience_definition.h
 *
 * Queryable audience representation.
 */

#ifndef _audience_definition_H_
#define _audience_definition_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_definition_t audience_definition_t;




typedef struct audience_definition_t {
    char *date; // string

} audience_definition_t;

audience_definition_t *audience_definition_create(
    char *date,
);

void audience_definition_free(audience_definition_t *audience_definition);

audience_definition_t *audience_definition_parseFromJSON(cJSON *audience_definitionJSON);

cJSON *audience_definition_convertToJSON(audience_definition_t *audience_definition);

#endif /* _audience_definition_H_ */

