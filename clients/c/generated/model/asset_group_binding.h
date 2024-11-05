/*
 * asset_group_binding.h
 *
 * 
 */

#ifndef _asset_group_binding_H_
#define _asset_group_binding_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_binding_t asset_group_binding_t;

#include "business_access_user_summary.h"



typedef struct asset_group_binding_t {
    char *id; // string
    char *asset_group_name; // string
    char *asset_group_description; // string
    list_t *asset_group_types; //primitive container
    list_t *ad_accounts_ids; //primitive container
    list_t *profiles_ids; //primitive container
    int created_time; //numeric
    int updated_time; //numeric
    struct business_access_user_summary_t *owner; //model
    struct business_access_user_summary_t *created_by; //model

} asset_group_binding_t;

asset_group_binding_t *asset_group_binding_create(
    char *id,
    char *asset_group_name,
    char *asset_group_description,
    list_t *asset_group_types,
    list_t *ad_accounts_ids,
    list_t *profiles_ids,
    int created_time,
    int updated_time,
    business_access_user_summary_t *owner,
    business_access_user_summary_t *created_by
);

void asset_group_binding_free(asset_group_binding_t *asset_group_binding);

asset_group_binding_t *asset_group_binding_parseFromJSON(cJSON *asset_group_bindingJSON);

cJSON *asset_group_binding_convertToJSON(asset_group_binding_t *asset_group_binding);

#endif /* _asset_group_binding_H_ */

