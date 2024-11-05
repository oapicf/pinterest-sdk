/*
 * user_business_role_binding.h
 *
 * 
 */

#ifndef _user_business_role_binding_H_
#define _user_business_role_binding_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_business_role_binding_t user_business_role_binding_t;

#include "business_access_user_summary.h"
#include "business_member_assets_summary.h"



typedef struct user_business_role_binding_t {
    struct business_member_assets_summary_t *assets_summary; //model
    list_t *business_roles; //primitive container
    struct business_access_user_summary_t *created_by_business; //model
    struct business_access_user_summary_t *created_by_user; //model
    int created_time; //numeric
    char *id; // string
    int is_shared_partner; //boolean
    struct business_access_user_summary_t *user; //model

} user_business_role_binding_t;

user_business_role_binding_t *user_business_role_binding_create(
    business_member_assets_summary_t *assets_summary,
    list_t *business_roles,
    business_access_user_summary_t *created_by_business,
    business_access_user_summary_t *created_by_user,
    int created_time,
    char *id,
    int is_shared_partner,
    business_access_user_summary_t *user
);

void user_business_role_binding_free(user_business_role_binding_t *user_business_role_binding);

user_business_role_binding_t *user_business_role_binding_parseFromJSON(cJSON *user_business_role_bindingJSON);

cJSON *user_business_role_binding_convertToJSON(user_business_role_binding_t *user_business_role_binding);

#endif /* _user_business_role_binding_H_ */

