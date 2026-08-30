/*
 * catalog_create.h
 *
 * Resource create operation model.
 */

#ifndef _catalog_create_H_
#define _catalog_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalog_create_t catalog_create_t;

#include "catalogs_type.h"



typedef struct catalog_create_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalog_create_t;

__attribute__((deprecated)) catalog_create_t *catalog_create_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
);

void catalog_create_free(catalog_create_t *catalog_create);

catalog_create_t *catalog_create_parseFromJSON(cJSON *catalog_createJSON);

cJSON *catalog_create_convertToJSON(catalog_create_t *catalog_create);

#endif /* _catalog_create_H_ */

