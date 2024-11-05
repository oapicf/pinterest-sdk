/*
 * member_business_role.h
 *
 * The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
 */

#ifndef _member_business_role_H_
#define _member_business_role_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct member_business_role_t member_business_role_t;


// Enum  for member_business_role

typedef enum { pinterest_rest_api_member_business_role__NULL = 0, pinterest_rest_api_member_business_role__EMPLOYEE, pinterest_rest_api_member_business_role__BIZ_ADMIN } pinterest_rest_api_member_business_role__e;

char* member_business_role_member_business_role_ToString(pinterest_rest_api_member_business_role__e member_business_role);

pinterest_rest_api_member_business_role__e member_business_role_member_business_role_FromString(char* member_business_role);

//cJSON *member_business_role_member_business_role_convertToJSON(pinterest_rest_api_member_business_role__e member_business_role);

//pinterest_rest_api_member_business_role__e member_business_role_member_business_role_parseFromJSON(cJSON *member_business_roleJSON);

#endif /* _member_business_role_H_ */

