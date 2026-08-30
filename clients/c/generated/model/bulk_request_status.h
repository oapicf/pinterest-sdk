/*
 * bulk_request_status.h
 *
 * Bulk request status
 */

#ifndef _bulk_request_status_H_
#define _bulk_request_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_request_status_t bulk_request_status_t;


// Enum  for bulk_request_status

typedef enum { pinterest_rest_api_bulk_request_status__NULL = 0, pinterest_rest_api_bulk_request_status__RUNNING, pinterest_rest_api_bulk_request_status__SUCCEEDED, pinterest_rest_api_bulk_request_status__FAILED } pinterest_rest_api_bulk_request_status__e;

char* bulk_request_status_bulk_request_status_ToString(pinterest_rest_api_bulk_request_status__e bulk_request_status);

pinterest_rest_api_bulk_request_status__e bulk_request_status_bulk_request_status_FromString(char* bulk_request_status);

cJSON *bulk_request_status_convertToJSON(pinterest_rest_api_bulk_request_status__e bulk_request_status);

pinterest_rest_api_bulk_request_status__e bulk_request_status_parseFromJSON(cJSON *bulk_request_statusJSON);

#endif /* _bulk_request_status_H_ */

