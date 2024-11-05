/*
 * user_single_asset_binding.h
 *
 * An object containing the permissions a business member/partner has on the asset.
 */

#ifndef _user_single_asset_binding_H_
#define _user_single_asset_binding_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_single_asset_binding_t user_single_asset_binding_t;

#include "business_access_user_summary.h"



typedef struct user_single_asset_binding_t {
    list_t *permissions; //primitive container
    struct business_access_user_summary_t *user; //model

} user_single_asset_binding_t;

user_single_asset_binding_t *user_single_asset_binding_create(
    list_t *permissions,
    business_access_user_summary_t *user
);

void user_single_asset_binding_free(user_single_asset_binding_t *user_single_asset_binding);

user_single_asset_binding_t *user_single_asset_binding_parseFromJSON(cJSON *user_single_asset_bindingJSON);

cJSON *user_single_asset_binding_convertToJSON(user_single_asset_binding_t *user_single_asset_binding);

#endif /* _user_single_asset_binding_H_ */

