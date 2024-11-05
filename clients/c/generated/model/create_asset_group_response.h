/*
 * create_asset_group_response.h
 *
 * 
 */

#ifndef _create_asset_group_response_H_
#define _create_asset_group_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_asset_group_response_t create_asset_group_response_t;

#include "asset_group_binding.h"



typedef struct create_asset_group_response_t {
    struct asset_group_binding_t *asset_group; //model

} create_asset_group_response_t;

create_asset_group_response_t *create_asset_group_response_create(
    asset_group_binding_t *asset_group
);

void create_asset_group_response_free(create_asset_group_response_t *create_asset_group_response);

create_asset_group_response_t *create_asset_group_response_parseFromJSON(cJSON *create_asset_group_responseJSON);

cJSON *create_asset_group_response_convertToJSON(create_asset_group_response_t *create_asset_group_response);

#endif /* _create_asset_group_response_H_ */

