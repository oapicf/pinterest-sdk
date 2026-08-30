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
    list_t *ad_accounts_ids; //primitive container
    char *asset_group_description; // string
    char *asset_group_name; // string
    list_t *asset_group_types; //primitive container
    list_t *catalogs_ids; //primitive container
    struct business_access_user_summary_t *created_by; //model
    int *created_time; //numeric
    char *id; // string
    struct business_access_user_summary_t *owner; //model
    list_t *profiles_ids; //primitive container
    int *updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_binding_t;

__attribute__((deprecated)) asset_group_binding_t *asset_group_binding_create(
    list_t *ad_accounts_ids,
    char *asset_group_description,
    char *asset_group_name,
    list_t *asset_group_types,
    list_t *catalogs_ids,
    business_access_user_summary_t *created_by,
    int *created_time,
    char *id,
    business_access_user_summary_t *owner,
    list_t *profiles_ids,
    int *updated_time
);

void asset_group_binding_free(asset_group_binding_t *asset_group_binding);

asset_group_binding_t *asset_group_binding_parseFromJSON(cJSON *asset_group_bindingJSON);

cJSON *asset_group_binding_convertToJSON(asset_group_binding_t *asset_group_binding);

#endif /* _asset_group_binding_H_ */

