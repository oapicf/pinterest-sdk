/*
 * shared_audience_response.h
 *
 * 
 */

#ifndef _shared_audience_response_H_
#define _shared_audience_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shared_audience_response_t shared_audience_response_t;

#include "role.h"

// Enum  for shared_audience_response

typedef enum  { pinterest_rest_api_shared_audience_response__NULL = 0, pinterest_rest_api_shared_audience_response__UNKNOWN, pinterest_rest_api_shared_audience_response__OWNER, pinterest_rest_api_shared_audience_response__ADMIN, pinterest_rest_api_shared_audience_response__ANALYST, pinterest_rest_api_shared_audience_response__SOS_READER, pinterest_rest_api_shared_audience_response__FINANCE_MANAGER, pinterest_rest_api_shared_audience_response__AUDIENCE_MANAGER, pinterest_rest_api_shared_audience_response__CAMPAIGN_MANAGER, pinterest_rest_api_shared_audience_response__CATALOGS_MANAGER, pinterest_rest_api_shared_audience_response__RESTRICTED_OWNER, pinterest_rest_api_shared_audience_response__PROFILE_MANAGER, pinterest_rest_api_shared_audience_response__PROFILE_PUBLISHER, pinterest_rest_api_shared_audience_response__RESOURCE_PINNER_LIST_OWNER, pinterest_rest_api_shared_audience_response__RESOURCE_PINNER_LIST_READER, pinterest_rest_api_shared_audience_response__BIZ_PINNER_LIST_SHARER, pinterest_rest_api_shared_audience_response__RESOURCE_CONVERSION_TAGS_READER } pinterest_rest_api_shared_audience_response__e;

char* shared_audience_response_permissions_ToString(pinterest_rest_api_shared_audience_response__e permissions);

pinterest_rest_api_shared_audience_response__e shared_audience_response_permissions_FromString(char* permissions);



typedef struct shared_audience_response_t {
    char *audience_id; // string
    list_t *permissions; //nonprimitive container
    list_t *recipient_account_ids; //primitive container

} shared_audience_response_t;

shared_audience_response_t *shared_audience_response_create(
    char *audience_id,
    list_t *permissions,
    list_t *recipient_account_ids
);

void shared_audience_response_free(shared_audience_response_t *shared_audience_response);

shared_audience_response_t *shared_audience_response_parseFromJSON(cJSON *shared_audience_responseJSON);

cJSON *shared_audience_response_convertToJSON(shared_audience_response_t *shared_audience_response);

#endif /* _shared_audience_response_H_ */

