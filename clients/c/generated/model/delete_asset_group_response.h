/*
 * delete_asset_group_response.h
 *
 * 
 */

#ifndef _delete_asset_group_response_H_
#define _delete_asset_group_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_asset_group_response_t delete_asset_group_response_t;

#include "delete_asset_group_response_exceptions_inner.h"



typedef struct delete_asset_group_response_t {
    list_t *deleted_asset_groups; //primitive container
    list_t *exceptions; //nonprimitive container

} delete_asset_group_response_t;

delete_asset_group_response_t *delete_asset_group_response_create(
    list_t *deleted_asset_groups,
    list_t *exceptions
);

void delete_asset_group_response_free(delete_asset_group_response_t *delete_asset_group_response);

delete_asset_group_response_t *delete_asset_group_response_parseFromJSON(cJSON *delete_asset_group_responseJSON);

cJSON *delete_asset_group_response_convertToJSON(delete_asset_group_response_t *delete_asset_group_response);

#endif /* _delete_asset_group_response_H_ */

