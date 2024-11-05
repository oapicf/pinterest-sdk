/*
 * permissions_with_owner.h
 *
 * 
 */

#ifndef _permissions_with_owner_H_
#define _permissions_with_owner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct permissions_with_owner_t permissions_with_owner_t;


// Enum  for permissions_with_owner

typedef enum { pinterest_rest_api_permissions_with_owner__NULL = 0, pinterest_rest_api_permissions_with_owner__ADMIN, pinterest_rest_api_permissions_with_owner__ANALYST, pinterest_rest_api_permissions_with_owner__FINANCE_MANAGER, pinterest_rest_api_permissions_with_owner__AUDIENCE_MANAGER, pinterest_rest_api_permissions_with_owner__CAMPAIGN_MANAGER, pinterest_rest_api_permissions_with_owner__CATALOGS_MANAGER, pinterest_rest_api_permissions_with_owner__CATALOGS_VIEWER, pinterest_rest_api_permissions_with_owner__PROFILE_PUBLISHER, pinterest_rest_api_permissions_with_owner__OWNER } pinterest_rest_api_permissions_with_owner__e;

char* permissions_with_owner_permissions_with_owner_ToString(pinterest_rest_api_permissions_with_owner__e permissions_with_owner);

pinterest_rest_api_permissions_with_owner__e permissions_with_owner_permissions_with_owner_FromString(char* permissions_with_owner);

//cJSON *permissions_with_owner_permissions_with_owner_convertToJSON(pinterest_rest_api_permissions_with_owner__e permissions_with_owner);

//pinterest_rest_api_permissions_with_owner__e permissions_with_owner_permissions_with_owner_parseFromJSON(cJSON *permissions_with_ownerJSON);

#endif /* _permissions_with_owner_H_ */

