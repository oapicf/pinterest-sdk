/*
 * business_role_for_members.h
 *
 * The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 */

#ifndef _business_role_for_members_H_
#define _business_role_for_members_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_role_for_members_t business_role_for_members_t;


// Enum  for business_role_for_members

typedef enum { pinterest_rest_api_business_role_for_members__NULL = 0, pinterest_rest_api_business_role_for_members__EMPLOYEE, pinterest_rest_api_business_role_for_members__BIZ_ADMIN } pinterest_rest_api_business_role_for_members__e;

char* business_role_for_members_business_role_for_members_ToString(pinterest_rest_api_business_role_for_members__e business_role_for_members);

pinterest_rest_api_business_role_for_members__e business_role_for_members_business_role_for_members_FromString(char* business_role_for_members);

//cJSON *business_role_for_members_business_role_for_members_convertToJSON(pinterest_rest_api_business_role_for_members__e business_role_for_members);

//pinterest_rest_api_business_role_for_members__e business_role_for_members_business_role_for_members_parseFromJSON(cJSON *business_role_for_membersJSON);

#endif /* _business_role_for_members_H_ */

