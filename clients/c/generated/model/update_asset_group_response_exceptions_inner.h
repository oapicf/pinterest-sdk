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
    char *asset_group_id; // string
    int code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} update_asset_group_response_exceptions_inner_t;

__attribute__((deprecated)) update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner_create(
    char *asset_group_id,
    int code,
    char *message
);

void update_asset_group_response_exceptions_inner_free(update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner);

update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner_parseFromJSON(cJSON *update_asset_group_response_exceptions_innerJSON);

cJSON *update_asset_group_response_exceptions_inner_convertToJSON(update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner);

#endif /* _update_asset_group_response_exceptions_inner_H_ */

