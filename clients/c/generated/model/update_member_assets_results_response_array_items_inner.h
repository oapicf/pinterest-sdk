/*
 * update_member_assets_results_response_array_items_inner.h
 *
 * 
 */

#ifndef _update_member_assets_results_response_array_items_inner_H_
#define _update_member_assets_results_response_array_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_member_assets_results_response_array_items_inner_t update_member_assets_results_response_array_items_inner_t;

#include "users_for_individual_asset_response.h"



typedef struct update_member_assets_results_response_array_items_inner_t {
    struct users_for_individual_asset_response_t *response; //model

} update_member_assets_results_response_array_items_inner_t;

update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner_create(
    users_for_individual_asset_response_t *response
);

void update_member_assets_results_response_array_items_inner_free(update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner);

update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner_parseFromJSON(cJSON *update_member_assets_results_response_array_items_innerJSON);

cJSON *update_member_assets_results_response_array_items_inner_convertToJSON(update_member_assets_results_response_array_items_inner_t *update_member_assets_results_response_array_items_inner);

#endif /* _update_member_assets_results_response_array_items_inner_H_ */

