/*
 * create_asset_group_body.h
 *
 * 
 */

#ifndef _create_asset_group_body_H_
#define _create_asset_group_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_asset_group_body_t create_asset_group_body_t;

#include "asset_group_type.h"

// Enum  for create_asset_group_body

typedef enum  { pinterest_rest_api_create_asset_group_body__NULL = 0, pinterest_rest_api_create_asset_group_body__BRAND, pinterest_rest_api_create_asset_group_body__LOCATION_OR_LANGUAGE, pinterest_rest_api_create_asset_group_body__PRODUCT_LINE, pinterest_rest_api_create_asset_group_body__OTHER } pinterest_rest_api_create_asset_group_body__e;

char* create_asset_group_body_asset_group_types_ToString(pinterest_rest_api_create_asset_group_body__e asset_group_types);

pinterest_rest_api_create_asset_group_body__e create_asset_group_body_asset_group_types_FromString(char* asset_group_types);



typedef struct create_asset_group_body_t {
    char *asset_group_name; // string
    char *asset_group_description; // string
    list_t *asset_group_types; //nonprimitive container

} create_asset_group_body_t;

create_asset_group_body_t *create_asset_group_body_create(
    char *asset_group_name,
    char *asset_group_description,
    list_t *asset_group_types
);

void create_asset_group_body_free(create_asset_group_body_t *create_asset_group_body);

create_asset_group_body_t *create_asset_group_body_parseFromJSON(cJSON *create_asset_group_bodyJSON);

cJSON *create_asset_group_body_convertToJSON(create_asset_group_body_t *create_asset_group_body);

#endif /* _create_asset_group_body_H_ */

