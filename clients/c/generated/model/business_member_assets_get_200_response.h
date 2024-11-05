/*
 * business_member_assets_get_200_response.h
 *
 * 
 */

#ifndef _business_member_assets_get_200_response_H_
#define _business_member_assets_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_member_assets_get_200_response_t business_member_assets_get_200_response_t;

#include "asset_id_permissions.h"



typedef struct business_member_assets_get_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} business_member_assets_get_200_response_t;

business_member_assets_get_200_response_t *business_member_assets_get_200_response_create(
    list_t *items,
    char *bookmark
);

void business_member_assets_get_200_response_free(business_member_assets_get_200_response_t *business_member_assets_get_200_response);

business_member_assets_get_200_response_t *business_member_assets_get_200_response_parseFromJSON(cJSON *business_member_assets_get_200_responseJSON);

cJSON *business_member_assets_get_200_response_convertToJSON(business_member_assets_get_200_response_t *business_member_assets_get_200_response);

#endif /* _business_member_assets_get_200_response_H_ */

