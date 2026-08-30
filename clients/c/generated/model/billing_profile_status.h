/*
 * billing_profile_status.h
 *
 * Billing profile status
 */

#ifndef _billing_profile_status_H_
#define _billing_profile_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_profile_status_t billing_profile_status_t;


// Enum  for billing_profile_status

typedef enum { pinterest_rest_api_billing_profile_status__NULL = 0, pinterest_rest_api_billing_profile_status__UNSPECIFIED, pinterest_rest_api_billing_profile_status__VALID, pinterest_rest_api_billing_profile_status__INVALID, pinterest_rest_api_billing_profile_status__PENDING, pinterest_rest_api_billing_profile_status__DELETED, pinterest_rest_api_billing_profile_status__SECONDARY, pinterest_rest_api_billing_profile_status__PENDING_SECONDARY } pinterest_rest_api_billing_profile_status__e;

char* billing_profile_status_billing_profile_status_ToString(pinterest_rest_api_billing_profile_status__e billing_profile_status);

pinterest_rest_api_billing_profile_status__e billing_profile_status_billing_profile_status_FromString(char* billing_profile_status);

cJSON *billing_profile_status_convertToJSON(pinterest_rest_api_billing_profile_status__e billing_profile_status);

pinterest_rest_api_billing_profile_status__e billing_profile_status_parseFromJSON(cJSON *billing_profile_statusJSON);

#endif /* _billing_profile_status_H_ */

