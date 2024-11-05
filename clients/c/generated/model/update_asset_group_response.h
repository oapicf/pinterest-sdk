/*
 * update_asset_group_response.h
 *
 * 
 */

#ifndef _update_asset_group_response_H_
#define _update_asset_group_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_asset_group_response_t update_asset_group_response_t;

#include "asset_group_binding.h"
#include "update_asset_group_response_exceptions_inner.h"



typedef struct update_asset_group_response_t {
    list_t *updated_asset_groups; //nonprimitive container
    list_t *exceptions; //nonprimitive container

} update_asset_group_response_t;

update_asset_group_response_t *update_asset_group_response_create(
    list_t *updated_asset_groups,
    list_t *exceptions
);

void update_asset_group_response_free(update_asset_group_response_t *update_asset_group_response);

update_asset_group_response_t *update_asset_group_response_parseFromJSON(cJSON *update_asset_group_responseJSON);

cJSON *update_asset_group_response_convertToJSON(update_asset_group_response_t *update_asset_group_response);

#endif /* _update_asset_group_response_H_ */

