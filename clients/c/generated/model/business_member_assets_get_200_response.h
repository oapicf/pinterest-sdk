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
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} business_member_assets_get_200_response_t;

__attribute__((deprecated)) business_member_assets_get_200_response_t *business_member_assets_get_200_response_create(
    char *bookmark,
    list_t *items
);

void business_member_assets_get_200_response_free(business_member_assets_get_200_response_t *business_member_assets_get_200_response);

business_member_assets_get_200_response_t *business_member_assets_get_200_response_parseFromJSON(cJSON *business_member_assets_get_200_responseJSON);

cJSON *business_member_assets_get_200_response_convertToJSON(business_member_assets_get_200_response_t *business_member_assets_get_200_response);

#endif /* _business_member_assets_get_200_response_H_ */

