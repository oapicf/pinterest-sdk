/*
 * delete_member_asset_access_item.h
 *
 * 
 */

#ifndef _delete_member_asset_access_item_H_
#define _delete_member_asset_access_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_member_asset_access_item_t delete_member_asset_access_item_t;




typedef struct delete_member_asset_access_item_t {
    char *asset_id; // string
    char *member_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} delete_member_asset_access_item_t;

__attribute__((deprecated)) delete_member_asset_access_item_t *delete_member_asset_access_item_create(
    char *asset_id,
    char *member_id
);

void delete_member_asset_access_item_free(delete_member_asset_access_item_t *delete_member_asset_access_item);

delete_member_asset_access_item_t *delete_member_asset_access_item_parseFromJSON(cJSON *delete_member_asset_access_itemJSON);

cJSON *delete_member_asset_access_item_convertToJSON(delete_member_asset_access_item_t *delete_member_asset_access_item);

#endif /* _delete_member_asset_access_item_H_ */

