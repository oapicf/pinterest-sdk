/*
 * catalogs_creative_assets_item_response.h
 *
 * Object describing a hotel record
 */

#ifndef _catalogs_creative_assets_item_response_H_
#define _catalogs_creative_assets_item_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_item_response_t catalogs_creative_assets_item_response_t;

#include "catalogs_creative_assets_attributes.h"
#include "catalogs_type.h"
#include "pin.h"



typedef struct catalogs_creative_assets_item_response_t {
    struct catalogs_creative_assets_attributes_t *attributes; //model
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    char *creative_assets_id; // string
    list_t *pins; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_creative_assets_item_response_t;

__attribute__((deprecated)) catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response_create(
    catalogs_creative_assets_attributes_t *attributes,
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *creative_assets_id,
    list_t *pins
);

void catalogs_creative_assets_item_response_free(catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response);

catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response_parseFromJSON(cJSON *catalogs_creative_assets_item_responseJSON);

cJSON *catalogs_creative_assets_item_response_convertToJSON(catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response);

#endif /* _catalogs_creative_assets_item_response_H_ */

