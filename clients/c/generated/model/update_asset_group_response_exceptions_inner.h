/*
 * update_asset_group_response_exceptions_inner.h
 *
 * 
 */

#ifndef _update_asset_group_response_exceptions_inner_H_
#define _update_asset_group_response_exceptions_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_asset_group_response_exceptions_inner_t update_asset_group_response_exceptions_inner_t;




typedef struct update_asset_group_response_exceptions_inner_t {
    int code; //numeric
    char *message; // string
    char *asset_group_id; // string

} update_asset_group_response_exceptions_inner_t;

update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner_create(
    int code,
    char *message,
    char *asset_group_id
);

void update_asset_group_response_exceptions_inner_free(update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner);

update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner_parseFromJSON(cJSON *update_asset_group_response_exceptions_innerJSON);

cJSON *update_asset_group_response_exceptions_inner_convertToJSON(update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner);

#endif /* _update_asset_group_response_exceptions_inner_H_ */

