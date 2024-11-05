/*
 * update_member_assets_results_response_array.h
 *
 * 
 */

#ifndef _update_member_assets_results_response_array_H_
#define _update_member_assets_results_response_array_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_member_assets_results_response_array_t update_member_assets_results_response_array_t;

#include "update_member_assets_results_response_array_items_inner.h"



typedef struct update_member_assets_results_response_array_t {
    list_t *items; //nonprimitive container

} update_member_assets_results_response_array_t;

update_member_assets_results_response_array_t *update_member_assets_results_response_array_create(
    list_t *items
);

void update_member_assets_results_response_array_free(update_member_assets_results_response_array_t *update_member_assets_results_response_array);

update_member_assets_results_response_array_t *update_member_assets_results_response_array_parseFromJSON(cJSON *update_member_assets_results_response_arrayJSON);

cJSON *update_member_assets_results_response_array_convertToJSON(update_member_assets_results_response_array_t *update_member_assets_results_response_array);

#endif /* _update_member_assets_results_response_array_H_ */

