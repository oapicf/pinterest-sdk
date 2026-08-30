/*
 * catalog_update.h
 *
 * Resource create or update operation model.
 */

#ifndef _catalog_update_H_
#define _catalog_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalog_update_t catalog_update_t;

#include "catalogs_type.h"



typedef struct catalog_update_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalog_update_t;

__attribute__((deprecated)) catalog_update_t *catalog_update_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
);

void catalog_update_free(catalog_update_t *catalog_update);

catalog_update_t *catalog_update_parseFromJSON(cJSON *catalog_updateJSON);

cJSON *catalog_update_convertToJSON(catalog_update_t *catalog_update);

#endif /* _catalog_update_H_ */

