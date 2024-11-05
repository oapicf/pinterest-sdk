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


// Enum CATALOGTYPE for catalogs_create_request

typedef enum  { pinterest_rest_api_catalogs_create_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_create_request_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e;

char* catalogs_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e catalogs_create_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_create_request_t {
    pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e catalog_type; //enum
    char *name; // string

} catalogs_create_request_t;

catalogs_create_request_t *catalogs_create_request_create(
    pinterest_rest_api_catalogs_create_request_CATALOGTYPE_e catalog_type,
    char *name
);

void catalogs_create_request_free(catalogs_create_request_t *catalogs_create_request);

catalogs_create_request_t *catalogs_create_request_parseFromJSON(cJSON *catalogs_create_requestJSON);

cJSON *catalogs_create_request_convertToJSON(catalogs_create_request_t *catalogs_create_request);

#endif /* _catalogs_create_request_H_ */

