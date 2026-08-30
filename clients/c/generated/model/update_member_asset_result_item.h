/*
 * update_member_asset_result_item.h
 *
 * 
 */

#ifndef _update_member_asset_result_item_H_
#define _update_member_asset_result_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_member_asset_result_item_t update_member_asset_result_item_t;

#include "users_for_individual_asset_response.h"



typedef struct update_member_asset_result_item_t {
    struct users_for_individual_asset_response_t *response; //model

    int _library_owned; // Is the library responsible for freeing this object?
} update_member_asset_result_item_t;

__attribute__((deprecated)) update_member_asset_result_item_t *update_member_asset_result_item_create(
    users_for_individual_asset_response_t *response
);

void update_member_asset_result_item_free(update_member_asset_result_item_t *update_member_asset_result_item);

update_member_asset_result_item_t *update_member_asset_result_item_parseFromJSON(cJSON *update_member_asset_result_itemJSON);

cJSON *update_member_asset_result_item_convertToJSON(update_member_asset_result_item_t *update_member_asset_result_item);

#endif /* _update_member_asset_result_item_H_ */

