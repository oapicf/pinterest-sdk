/*
 * delete_asset_group_response_exceptions_inner.h
 *
 * 
 */

#ifndef _delete_asset_group_response_exceptions_inner_H_
#define _delete_asset_group_response_exceptions_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_asset_group_response_exceptions_inner_t delete_asset_group_response_exceptions_inner_t;




typedef struct delete_asset_group_response_exceptions_inner_t {
    char *asset_group_id; // string
    int code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} delete_asset_group_response_exceptions_inner_t;

__attribute__((deprecated)) delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_create(
    char *asset_group_id,
    int code,
    char *message
);

void delete_asset_group_response_exceptions_inner_free(delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner);

delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_parseFromJSON(cJSON *delete_asset_group_response_exceptions_innerJSON);

cJSON *delete_asset_group_response_exceptions_inner_convertToJSON(delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner);

#endif /* _delete_asset_group_response_exceptions_inner_H_ */

