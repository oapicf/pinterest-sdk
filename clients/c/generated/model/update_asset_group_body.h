/*
 * update_asset_group_body.h
 *
 * 
 */

#ifndef _update_asset_group_body_H_
#define _update_asset_group_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_asset_group_body_t update_asset_group_body_t;

#include "update_asset_group_body_asset_groups_to_update_inner.h"



typedef struct update_asset_group_body_t {
    list_t *asset_groups_to_update; //nonprimitive container

} update_asset_group_body_t;

update_asset_group_body_t *update_asset_group_body_create(
    list_t *asset_groups_to_update
);

void update_asset_group_body_free(update_asset_group_body_t *update_asset_group_body);

update_asset_group_body_t *update_asset_group_body_parseFromJSON(cJSON *update_asset_group_bodyJSON);

cJSON *update_asset_group_body_convertToJSON(update_asset_group_body_t *update_asset_group_body);

#endif /* _update_asset_group_body_H_ */

