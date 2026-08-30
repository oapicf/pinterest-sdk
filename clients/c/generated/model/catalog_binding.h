/*
 * catalog_binding.h
 *
 * Information about a catalog asset.
 */

#ifndef _catalog_binding_H_
#define _catalog_binding_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalog_binding_t catalog_binding_t;




typedef struct catalog_binding_t {
    char *catalog_type; // string
    char *id; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalog_binding_t;

__attribute__((deprecated)) catalog_binding_t *catalog_binding_create(
    char *catalog_type,
    char *id,
    char *name
);

void catalog_binding_free(catalog_binding_t *catalog_binding);

catalog_binding_t *catalog_binding_parseFromJSON(cJSON *catalog_bindingJSON);

cJSON *catalog_binding_convertToJSON(catalog_binding_t *catalog_binding);

#endif /* _catalog_binding_H_ */

