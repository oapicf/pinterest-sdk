/*
 * catalogs_retail_batch_request.h
 *
 * A request object that can have multiple operations on a single retail batch
 */

#ifndef _catalogs_retail_batch_request_H_
#define _catalogs_retail_batch_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_batch_request_t catalogs_retail_batch_request_t;

#include "catalogs_retail_batch_request_items_inner.h"
#include "country.h"

// Enum CATALOGTYPE for catalogs_retail_batch_request

typedef enum  { pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e;

char* catalogs_retail_batch_request_catalog_type_ToString(pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalogs_retail_batch_request_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_batch_request_t {
    char *catalog_id; // string
    pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalog_type; //enum
    pinterest_rest_api_country__e country; //referenced enum
    list_t *items; //nonprimitive container
    pinterest_rest_api_catalogs_retail_batch_request_LANGUAGE_e language; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_batch_request_t;

__attribute__((deprecated)) catalogs_retail_batch_request_t *catalogs_retail_batch_request_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    list_t *items,
    pinterest_rest_api_catalogs_retail_batch_request_LANGUAGE_e language
);

void catalogs_retail_batch_request_free(catalogs_retail_batch_request_t *catalogs_retail_batch_request);

catalogs_retail_batch_request_t *catalogs_retail_batch_request_parseFromJSON(cJSON *catalogs_retail_batch_requestJSON);

cJSON *catalogs_retail_batch_request_convertToJSON(catalogs_retail_batch_request_t *catalogs_retail_batch_request);

#endif /* _catalogs_retail_batch_request_H_ */

