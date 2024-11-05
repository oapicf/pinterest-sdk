/*
 * business_members_asset_access_delete_request.h
 *
 * 
 */

#ifndef _business_members_asset_access_delete_request_H_
#define _business_members_asset_access_delete_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_members_asset_access_delete_request_t business_members_asset_access_delete_request_t;

#include "business_members_asset_access_delete_request_accesses_inner.h"



typedef struct business_members_asset_access_delete_request_t {
    list_t *accesses; //nonprimitive container

} business_members_asset_access_delete_request_t;

business_members_asset_access_delete_request_t *business_members_asset_access_delete_request_create(
    list_t *accesses
);

void business_members_asset_access_delete_request_free(business_members_asset_access_delete_request_t *business_members_asset_access_delete_request);

business_members_asset_access_delete_request_t *business_members_asset_access_delete_request_parseFromJSON(cJSON *business_members_asset_access_delete_requestJSON);

cJSON *business_members_asset_access_delete_request_convertToJSON(business_members_asset_access_delete_request_t *business_members_asset_access_delete_request);

#endif /* _business_members_asset_access_delete_request_H_ */

