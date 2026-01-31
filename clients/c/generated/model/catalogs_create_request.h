/*
 * catalogs_create_request.h
 *
 * Request object for creating a catalog.
 */

#ifndef _catalogs_create_request_H_
#define _catalogs_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_create_request_t catalogs_create_request_t;

#include "catalogs_type.h"



typedef struct catalogs_create_request_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_create_request_t;

__attribute__((deprecated)) catalogs_create_request_t *catalogs_create_request_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *name
);

void catalogs_create_request_free(catalogs_create_request_t *catalogs_create_request);

catalogs_create_request_t *catalogs_create_request_parseFromJSON(cJSON *catalogs_create_requestJSON);

cJSON *catalogs_create_request_convertToJSON(catalogs_create_request_t *catalogs_create_request);

#endif /* _catalogs_create_request_H_ */

