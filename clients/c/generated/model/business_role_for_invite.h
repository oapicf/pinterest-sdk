/*
 * business_role_for_invite.h
 *
 * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 */

#ifndef _business_role_for_invite_H_
#define _business_role_for_invite_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_role_for_invite_t business_role_for_invite_t;


// Enum  for business_role_for_invite

typedef enum { pinterest_rest_api_business_role_for_invite__NULL = 0, pinterest_rest_api_business_role_for_invite__EMPLOYEE, pinterest_rest_api_business_role_for_invite__BIZ_ADMIN, pinterest_rest_api_business_role_for_invite__PARTNER } pinterest_rest_api_business_role_for_invite__e;

char* business_role_for_invite_business_role_for_invite_ToString(pinterest_rest_api_business_role_for_invite__e business_role_for_invite);

pinterest_rest_api_business_role_for_invite__e business_role_for_invite_business_role_for_invite_FromString(char* business_role_for_invite);

cJSON *business_role_for_invite_convertToJSON(pinterest_rest_api_business_role_for_invite__e business_role_for_invite);

pinterest_rest_api_business_role_for_invite__e business_role_for_invite_parseFromJSON(cJSON *business_role_for_inviteJSON);

#endif /* _business_role_for_invite_H_ */

