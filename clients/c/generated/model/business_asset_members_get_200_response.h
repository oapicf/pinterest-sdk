/*
 * business_asset_members_get_200_response.h
 *
 * 
 */

#ifndef _business_asset_members_get_200_response_H_
#define _business_asset_members_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_asset_members_get_200_response_t business_asset_members_get_200_response_t;

#include "user_single_asset_binding.h"



typedef struct business_asset_members_get_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} business_asset_members_get_200_response_t;

business_asset_members_get_200_response_t *business_asset_members_get_200_response_create(
    list_t *items,
    char *bookmark
);

void business_asset_members_get_200_response_free(business_asset_members_get_200_response_t *business_asset_members_get_200_response);

business_asset_members_get_200_response_t *business_asset_members_get_200_response_parseFromJSON(cJSON *business_asset_members_get_200_responseJSON);

cJSON *business_asset_members_get_200_response_convertToJSON(business_asset_members_get_200_response_t *business_asset_members_get_200_response);

#endif /* _business_asset_members_get_200_response_H_ */

