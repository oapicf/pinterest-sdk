/*
 * catalog.h
 *
 * Catalog entity
 */

#ifndef _catalog_H_
#define _catalog_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalog_t catalog_t;

#include "catalogs_type.h"



typedef struct catalog_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    char *created_at; //date time
    char *id; // string
    char *name; // string
    char *updated_at; //date time

    int _library_owned; // Is the library responsible for freeing this object?
} catalog_t;

__attribute__((deprecated)) catalog_t *catalog_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *created_at,
    char *id,
    char *name,
    char *updated_at
);

void catalog_free(catalog_t *catalog);

catalog_t *catalog_parseFromJSON(cJSON *catalogJSON);

cJSON *catalog_convertToJSON(catalog_t *catalog);

#endif /* _catalog_H_ */

