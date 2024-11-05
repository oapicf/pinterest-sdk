/*
 * create_asset_access_request_error_message_inner.h
 *
 * 
 */

#ifndef _create_asset_access_request_error_message_inner_H_
#define _create_asset_access_request_error_message_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_asset_access_request_error_message_inner_t create_asset_access_request_error_message_inner_t;




typedef struct create_asset_access_request_error_message_inner_t {
    int code; //numeric
    list_t *messages; //primitive container

} create_asset_access_request_error_message_inner_t;

create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner_create(
    int code,
    list_t *messages
);

void create_asset_access_request_error_message_inner_free(create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner);

create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner_parseFromJSON(cJSON *create_asset_access_request_error_message_innerJSON);

cJSON *create_asset_access_request_error_message_inner_convertToJSON(create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner);

#endif /* _create_asset_access_request_error_message_inner_H_ */

