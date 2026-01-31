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
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} business_asset_members_get_200_response_t;

__attribute__((deprecated)) business_asset_members_get_200_response_t *business_asset_members_get_200_response_create(
    char *bookmark,
    list_t *items
);

void business_asset_members_get_200_response_free(business_asset_members_get_200_response_t *business_asset_members_get_200_response);

business_asset_members_get_200_response_t *business_asset_members_get_200_response_parseFromJSON(cJSON *business_asset_members_get_200_responseJSON);

cJSON *business_asset_members_get_200_response_convertToJSON(business_asset_members_get_200_response_t *business_asset_members_get_200_response);

#endif /* _business_asset_members_get_200_response_H_ */

