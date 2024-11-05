/*
 * users_for_individual_asset_response.h
 *
 * An object containing the permissions a business member has on the asset.
 */

#ifndef _users_for_individual_asset_response_H_
#define _users_for_individual_asset_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct users_for_individual_asset_response_t users_for_individual_asset_response_t;




typedef struct users_for_individual_asset_response_t {
    char *asset_id; // string
    char *member_id; // string
    list_t *permissions; //primitive container

} users_for_individual_asset_response_t;

users_for_individual_asset_response_t *users_for_individual_asset_response_create(
    char *asset_id,
    char *member_id,
    list_t *permissions
);

void users_for_individual_asset_response_free(users_for_individual_asset_response_t *users_for_individual_asset_response);

users_for_individual_asset_response_t *users_for_individual_asset_response_parseFromJSON(cJSON *users_for_individual_asset_responseJSON);

cJSON *users_for_individual_asset_response_convertToJSON(users_for_individual_asset_response_t *users_for_individual_asset_response);

#endif /* _users_for_individual_asset_response_H_ */

