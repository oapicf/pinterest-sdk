/*
 * conversion_deletion_request_status.h
 *
 * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
 */

#ifndef _conversion_deletion_request_status_H_
#define _conversion_deletion_request_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_deletion_request_status_t conversion_deletion_request_status_t;


// Enum  for conversion_deletion_request_status

typedef enum { pinterest_rest_api_conversion_deletion_request_status__NULL = 0, pinterest_rest_api_conversion_deletion_request_status__PENDING, pinterest_rest_api_conversion_deletion_request_status__SUBMITTED, pinterest_rest_api_conversion_deletion_request_status__CANCELLED } pinterest_rest_api_conversion_deletion_request_status__e;

char* conversion_deletion_request_status_conversion_deletion_request_status_ToString(pinterest_rest_api_conversion_deletion_request_status__e conversion_deletion_request_status);

pinterest_rest_api_conversion_deletion_request_status__e conversion_deletion_request_status_conversion_deletion_request_status_FromString(char* conversion_deletion_request_status);

cJSON *conversion_deletion_request_status_convertToJSON(pinterest_rest_api_conversion_deletion_request_status__e conversion_deletion_request_status);

pinterest_rest_api_conversion_deletion_request_status__e conversion_deletion_request_status_parseFromJSON(cJSON *conversion_deletion_request_statusJSON);

#endif /* _conversion_deletion_request_status_H_ */

