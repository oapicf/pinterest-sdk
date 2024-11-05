/*
 * create_asset_access_request_body.h
 *
 * An object containing a list of all the asset access requests
 */

#ifndef _create_asset_access_request_body_H_
#define _create_asset_access_request_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_asset_access_request_body_t create_asset_access_request_body_t;

#include "create_asset_access_request_body_asset_requests_inner.h"



typedef struct create_asset_access_request_body_t {
    list_t *asset_requests; //nonprimitive container

} create_asset_access_request_body_t;

create_asset_access_request_body_t *create_asset_access_request_body_create(
    list_t *asset_requests
);

void create_asset_access_request_body_free(create_asset_access_request_body_t *create_asset_access_request_body);

create_asset_access_request_body_t *create_asset_access_request_body_parseFromJSON(cJSON *create_asset_access_request_bodyJSON);

cJSON *create_asset_access_request_body_convertToJSON(create_asset_access_request_body_t *create_asset_access_request_body);

#endif /* _create_asset_access_request_body_H_ */

