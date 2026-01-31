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
    char *scope; // string
    char *type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} audience_definition_t;

__attribute__((deprecated)) audience_definition_t *audience_definition_create(
    char *date,
    char *scope,
    char *type
);

void audience_definition_free(audience_definition_t *audience_definition);

audience_definition_t *audience_definition_parseFromJSON(cJSON *audience_definitionJSON);

cJSON *audience_definition_convertToJSON(audience_definition_t *audience_definition);

#endif /* _audience_definition_H_ */

