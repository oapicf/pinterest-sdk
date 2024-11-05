/*
 * catalogs_retail_item_response.h
 *
 * Object describing a retail item record
 */

#ifndef _catalogs_retail_item_response_H_
#define _catalogs_retail_item_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_item_response_t catalogs_retail_item_response_t;

#include "catalogs_type.h"
#include "item_attributes.h"
#include "pin.h"

// Enum  for catalogs_retail_item_response

typedef enum  { pinterest_rest_api_catalogs_retail_item_response__NULL = 0, pinterest_rest_api_catalogs_retail_item_response__RETAIL, pinterest_rest_api_catalogs_retail_item_response__HOTEL, pinterest_rest_api_catalogs_retail_item_response__CREATIVE_ASSETS } pinterest_rest_api_catalogs_retail_item_response__e;

char* catalogs_retail_item_response_catalog_type_ToString(pinterest_rest_api_catalogs_retail_item_response__e catalog_type);

pinterest_rest_api_catalogs_retail_item_response__e catalogs_retail_item_response_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_item_response_t {
    catalogs_type_t *catalog_type; // custom
    char *item_id; // string
    list_t *pins; //nonprimitive container
    struct item_attributes_t *attributes; //model

} catalogs_retail_item_response_t;

catalogs_retail_item_response_t *catalogs_retail_item_response_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *pins,
    item_attributes_t *attributes
);

void catalogs_retail_item_response_free(catalogs_retail_item_response_t *catalogs_retail_item_response);

catalogs_retail_item_response_t *catalogs_retail_item_response_parseFromJSON(cJSON *catalogs_retail_item_responseJSON);

cJSON *catalogs_retail_item_response_convertToJSON(catalogs_retail_item_response_t *catalogs_retail_item_response);

#endif /* _catalogs_retail_item_response_H_ */

