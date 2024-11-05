/*
 * business_members_asset_access_delete_request_accesses_inner.h
 *
 * 
 */

#ifndef _business_members_asset_access_delete_request_accesses_inner_H_
#define _business_members_asset_access_delete_request_accesses_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_members_asset_access_delete_request_accesses_inner_t business_members_asset_access_delete_request_accesses_inner_t;




typedef struct business_members_asset_access_delete_request_accesses_inner_t {
    char *asset_id; // string
    char *member_id; // string

} business_members_asset_access_delete_request_accesses_inner_t;

business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner_create(
    char *asset_id,
    char *member_id
);

void business_members_asset_access_delete_request_accesses_inner_free(business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner);

business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner_parseFromJSON(cJSON *business_members_asset_access_delete_request_accesses_innerJSON);

cJSON *business_members_asset_access_delete_request_accesses_inner_convertToJSON(business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner);

#endif /* _business_members_asset_access_delete_request_accesses_inner_H_ */

