/*
 * permissions.h
 *
 * 
 */

#ifndef _permissions_H_
#define _permissions_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct permissions_t permissions_t;


// Enum  for permissions

typedef enum { pinterest_rest_api_permissions__NULL = 0, pinterest_rest_api_permissions__ADMIN, pinterest_rest_api_permissions__ANALYST, pinterest_rest_api_permissions__FINANCE_MANAGER, pinterest_rest_api_permissions__AUDIENCE_MANAGER, pinterest_rest_api_permissions__CAMPAIGN_MANAGER, pinterest_rest_api_permissions__CATALOGS_MANAGER, pinterest_rest_api_permissions__PROFILE_PUBLISHER } pinterest_rest_api_permissions__e;

char* permissions_permissions_ToString(pinterest_rest_api_permissions__e permissions);

pinterest_rest_api_permissions__e permissions_permissions_FromString(char* permissions);

//cJSON *permissions_permissions_convertToJSON(pinterest_rest_api_permissions__e permissions);

//pinterest_rest_api_permissions__e permissions_permissions_parseFromJSON(cJSON *permissionsJSON);

#endif /* _permissions_H_ */

