/*
 * role.h
 *
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */

#ifndef _role_H_
#define _role_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct role_t role_t;


// Enum  for role

typedef enum { pinterest_rest_api_role__NULL = 0, pinterest_rest_api_role__UNKNOWN, pinterest_rest_api_role__OWNER, pinterest_rest_api_role__ADMIN, pinterest_rest_api_role__ANALYST, pinterest_rest_api_role__SOS_READER, pinterest_rest_api_role__FINANCE_MANAGER, pinterest_rest_api_role__AUDIENCE_MANAGER, pinterest_rest_api_role__CAMPAIGN_MANAGER, pinterest_rest_api_role__CATALOGS_MANAGER, pinterest_rest_api_role__RESTRICTED_OWNER, pinterest_rest_api_role__PROFILE_MANAGER, pinterest_rest_api_role__PROFILE_PUBLISHER, pinterest_rest_api_role__RESOURCE_PINNER_LIST_OWNER, pinterest_rest_api_role__RESOURCE_PINNER_LIST_READER, pinterest_rest_api_role__BIZ_PINNER_LIST_SHARER, pinterest_rest_api_role__RESOURCE_CONVERSION_TAGS_READER } pinterest_rest_api_role__e;

char* role_role_ToString(pinterest_rest_api_role__e role);

pinterest_rest_api_role__e role_role_FromString(char* role);

//cJSON *role_role_convertToJSON(pinterest_rest_api_role__e role);

//pinterest_rest_api_role__e role_role_parseFromJSON(cJSON *roleJSON);

#endif /* _role_H_ */

