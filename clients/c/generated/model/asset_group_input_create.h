/*
 * asset_group_input_create.h
 *
 * 
 */

#ifndef _asset_group_input_create_H_
#define _asset_group_input_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_input_create_t asset_group_input_create_t;

#include "asset_group_binding.h"
#include "asset_group_type.h"

// Enum  for asset_group_input_create

typedef enum  { pinterest_rest_api_asset_group_input_create__NULL = 0, pinterest_rest_api_asset_group_input_create__BRAND, pinterest_rest_api_asset_group_input_create__LOCATION_OR_LANGUAGE, pinterest_rest_api_asset_group_input_create__PRODUCT_LINE, pinterest_rest_api_asset_group_input_create__OTHER } pinterest_rest_api_asset_group_input_create__e;

char* asset_group_input_create_asset_group_types_ToString(pinterest_rest_api_asset_group_input_create__e asset_group_types);

pinterest_rest_api_asset_group_input_create__e asset_group_input_create_asset_group_types_FromString(char* asset_group_types);



typedef struct asset_group_input_create_t {
    struct asset_group_binding_t *asset_group; //model
    char *asset_group_description; // string
    char *asset_group_name; // string
    list_t *asset_group_types; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_input_create_t;

__attribute__((deprecated)) asset_group_input_create_t *asset_group_input_create_create(
    asset_group_binding_t *asset_group,
    char *asset_group_description,
    char *asset_group_name,
    list_t *asset_group_types
);

void asset_group_input_create_free(asset_group_input_create_t *asset_group_input_create);

asset_group_input_create_t *asset_group_input_create_parseFromJSON(cJSON *asset_group_input_createJSON);

cJSON *asset_group_input_create_convertToJSON(asset_group_input_create_t *asset_group_input_create);

#endif /* _asset_group_input_create_H_ */

