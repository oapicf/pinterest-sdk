/*
 * create_asset_access_request_body_asset_requests_inner.h
 *
 * 
 */

#ifndef _create_asset_access_request_body_asset_requests_inner_H_
#define _create_asset_access_request_body_asset_requests_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_asset_access_request_body_asset_requests_inner_t create_asset_access_request_body_asset_requests_inner_t;

#include "permissions.h"

// Enum INNER for create_asset_access_request_body_asset_requests_inner

typedef enum  { pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_NULL = 0, pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_ADMIN, pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_ANALYST, pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_FINANCE_MANAGER, pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_AUDIENCE_MANAGER, pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_CAMPAIGN_MANAGER, pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_CATALOGS_MANAGER, pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_PROFILE_PUBLISHER } pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_e;

char* create_asset_access_request_body_asset_requests_inner_inner_ToString(pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_e inner);

pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_e create_asset_access_request_body_asset_requests_inner_inner_FromString(char* inner);



typedef struct create_asset_access_request_body_asset_requests_inner_t {
    char *partner_id; // string
    list_t* asset_id_to_permissions; //map

} create_asset_access_request_body_asset_requests_inner_t;

create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner_create(
    char *partner_id,
    list_t* asset_id_to_permissions
);

void create_asset_access_request_body_asset_requests_inner_free(create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner);

create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner_parseFromJSON(cJSON *create_asset_access_request_body_asset_requests_innerJSON);

cJSON *create_asset_access_request_body_asset_requests_inner_convertToJSON(create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner);

#endif /* _create_asset_access_request_body_asset_requests_inner_H_ */

