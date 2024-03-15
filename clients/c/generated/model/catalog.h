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

// Enum  for catalog

typedef enum  { pinterest_rest_api_catalog__NULL = 0, pinterest_rest_api_catalog__RETAIL, pinterest_rest_api_catalog__HOTEL } pinterest_rest_api_catalog__e;

char* catalog_catalog_type_ToString(pinterest_rest_api_catalog__e catalog_type);

pinterest_rest_api_catalog__e catalog_catalog_type_FromString(char* catalog_type);



typedef struct catalog_t {
    char *created_at; //date time
    char *id; // string
    char *updated_at; //date time
    char *name; // string
    catalogs_type_t *catalog_type; // custom

} catalog_t;

catalog_t *catalog_create(
    char *created_at,
    char *id,
    char *updated_at,
    char *name,
    catalogs_type_t *catalog_type
);

void catalog_free(catalog_t *catalog);

catalog_t *catalog_parseFromJSON(cJSON *catalogJSON);

cJSON *catalog_convertToJSON(catalog_t *catalog);

#endif /* _catalog_H_ */

