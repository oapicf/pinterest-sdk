/*
 * business_role.h
 *
 * The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. &lt;br&gt; - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 */

#ifndef _business_role_H_
#define _business_role_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_role_t business_role_t;


// Enum  for business_role

typedef enum { pinterest_rest_api_business_role__NULL = 0, pinterest_rest_api_business_role__EMPLOYEE, pinterest_rest_api_business_role__BIZ_ADMIN, pinterest_rest_api_business_role__PARTNER } pinterest_rest_api_business_role__e;

char* business_role_business_role_ToString(pinterest_rest_api_business_role__e business_role);

pinterest_rest_api_business_role__e business_role_business_role_FromString(char* business_role);

//cJSON *business_role_business_role_convertToJSON(pinterest_rest_api_business_role__e business_role);

//pinterest_rest_api_business_role__e business_role_business_role_parseFromJSON(cJSON *business_roleJSON);

#endif /* _business_role_H_ */

