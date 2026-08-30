/*
 * business_member_assets_get_response.h
 *
 * Paginated response for business member assets with total count metadata.
 */

#ifndef _business_member_assets_get_response_H_
#define _business_member_assets_get_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_member_assets_get_response_t business_member_assets_get_response_t;

#include "asset_id_permissions.h"
#include "total_count_by_entity_status.h"



typedef struct business_member_assets_get_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container
    int *total_data_count; //numeric
    struct total_count_by_entity_status_t *total_data_count_by_status; //model

    int _library_owned; // Is the library responsible for freeing this object?
} business_member_assets_get_response_t;

__attribute__((deprecated)) business_member_assets_get_response_t *business_member_assets_get_response_create(
    char *bookmark,
    list_t *items,
    int *total_data_count,
    total_count_by_entity_status_t *total_data_count_by_status
);

void business_member_assets_get_response_free(business_member_assets_get_response_t *business_member_assets_get_response);

business_member_assets_get_response_t *business_member_assets_get_response_parseFromJSON(cJSON *business_member_assets_get_responseJSON);

cJSON *business_member_assets_get_response_convertToJSON(business_member_assets_get_response_t *business_member_assets_get_response);

#endif /* _business_member_assets_get_response_H_ */

