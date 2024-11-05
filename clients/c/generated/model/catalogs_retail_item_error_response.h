/*
 * catalogs_retail_item_error_response.h
 *
 * Object describing a retail item error
 */

#ifndef _catalogs_retail_item_error_response_H_
#define _catalogs_retail_item_error_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_item_error_response_t catalogs_retail_item_error_response_t;

#include "catalogs_type.h"
#include "item_validation_event.h"

// Enum  for catalogs_retail_item_error_response

typedef enum  { pinterest_rest_api_catalogs_retail_item_error_response__NULL = 0, pinterest_rest_api_catalogs_retail_item_error_response__RETAIL, pinterest_rest_api_catalogs_retail_item_error_response__HOTEL, pinterest_rest_api_catalogs_retail_item_error_response__CREATIVE_ASSETS } pinterest_rest_api_catalogs_retail_item_error_response__e;

char* catalogs_retail_item_error_response_catalog_type_ToString(pinterest_rest_api_catalogs_retail_item_error_response__e catalog_type);

pinterest_rest_api_catalogs_retail_item_error_response__e catalogs_retail_item_error_response_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_item_error_response_t {
    catalogs_type_t *catalog_type; // custom
    char *item_id; // string
    list_t *errors; //nonprimitive container

} catalogs_retail_item_error_response_t;

catalogs_retail_item_error_response_t *catalogs_retail_item_error_response_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *errors
);

void catalogs_retail_item_error_response_free(catalogs_retail_item_error_response_t *catalogs_retail_item_error_response);

catalogs_retail_item_error_response_t *catalogs_retail_item_error_response_parseFromJSON(cJSON *catalogs_retail_item_error_responseJSON);

cJSON *catalogs_retail_item_error_response_convertToJSON(catalogs_retail_item_error_response_t *catalogs_retail_item_error_response);

#endif /* _catalogs_retail_item_error_response_H_ */

