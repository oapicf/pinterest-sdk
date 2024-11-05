/*
 * create_asset_access_request_response.h
 *
 * 
 */

#ifndef _create_asset_access_request_response_H_
#define _create_asset_access_request_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_asset_access_request_response_t create_asset_access_request_response_t;

#include "create_asset_access_request_error_message_inner.h"



typedef struct create_asset_access_request_response_t {
    list_t *exceptions; //nonprimitive container
    list_t* invites; //map

} create_asset_access_request_response_t;

create_asset_access_request_response_t *create_asset_access_request_response_create(
    list_t *exceptions,
    list_t* invites
);

void create_asset_access_request_response_free(create_asset_access_request_response_t *create_asset_access_request_response);

create_asset_access_request_response_t *create_asset_access_request_response_parseFromJSON(cJSON *create_asset_access_request_responseJSON);

cJSON *create_asset_access_request_response_convertToJSON(create_asset_access_request_response_t *create_asset_access_request_response);

#endif /* _create_asset_access_request_response_H_ */

