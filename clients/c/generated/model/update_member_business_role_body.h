/*
 * update_member_business_role_body.h
 *
 * Single instance of a business member to have its role updated
 */

#ifndef _update_member_business_role_body_H_
#define _update_member_business_role_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_member_business_role_body_t update_member_business_role_body_t;

#include "business_role_for_members.h"

// Enum  for update_member_business_role_body

typedef enum  { pinterest_rest_api_update_member_business_role_body__NULL = 0, pinterest_rest_api_update_member_business_role_body__EMPLOYEE, pinterest_rest_api_update_member_business_role_body__BIZ_ADMIN } pinterest_rest_api_update_member_business_role_body__e;

char* update_member_business_role_body_business_role_ToString(pinterest_rest_api_update_member_business_role_body__e business_role);

pinterest_rest_api_update_member_business_role_body__e update_member_business_role_body_business_role_FromString(char* business_role);



typedef struct update_member_business_role_body_t {
    business_role_for_members_t *business_role; // custom
    char *member_id; // string

} update_member_business_role_body_t;

update_member_business_role_body_t *update_member_business_role_body_create(
    business_role_for_members_t *business_role,
    char *member_id
);

void update_member_business_role_body_free(update_member_business_role_body_t *update_member_business_role_body);

update_member_business_role_body_t *update_member_business_role_body_parseFromJSON(cJSON *update_member_business_role_bodyJSON);

cJSON *update_member_business_role_body_convertToJSON(update_member_business_role_body_t *update_member_business_role_body);

#endif /* _update_member_business_role_body_H_ */

