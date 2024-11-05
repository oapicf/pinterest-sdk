/*
 * delete_asset_group_body.h
 *
 * Request body used to delete asset groups
 */

#ifndef _delete_asset_group_body_H_
#define _delete_asset_group_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_asset_group_body_t delete_asset_group_body_t;




typedef struct delete_asset_group_body_t {
    list_t *asset_groups_to_delete; //primitive container

} delete_asset_group_body_t;

delete_asset_group_body_t *delete_asset_group_body_create(
    list_t *asset_groups_to_delete
);

void delete_asset_group_body_free(delete_asset_group_body_t *delete_asset_group_body);

delete_asset_group_body_t *delete_asset_group_body_parseFromJSON(cJSON *delete_asset_group_bodyJSON);

cJSON *delete_asset_group_body_convertToJSON(delete_asset_group_body_t *delete_asset_group_body);

#endif /* _delete_asset_group_body_H_ */

