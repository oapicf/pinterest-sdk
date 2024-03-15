/*
 * bulk_upsert_status_response.h
 *
 * ID of the bulk request.
 */

#ifndef _bulk_upsert_status_response_H_
#define _bulk_upsert_status_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_upsert_status_response_t bulk_upsert_status_response_t;

#include "bulk_upsert_status.h"

// Enum  for bulk_upsert_status_response

typedef enum  { pinterest_rest_api_bulk_upsert_status_response__NULL = 0, pinterest_rest_api_bulk_upsert_status_response__RUNNING, pinterest_rest_api_bulk_upsert_status_response__SUCCEEDED, pinterest_rest_api_bulk_upsert_status_response__FAILED } pinterest_rest_api_bulk_upsert_status_response__e;

char* bulk_upsert_status_response_status_ToString(pinterest_rest_api_bulk_upsert_status_response__e status);

pinterest_rest_api_bulk_upsert_status_response__e bulk_upsert_status_response_status_FromString(char* status);



typedef struct bulk_upsert_status_response_t {
    bulk_upsert_status_t *status; // custom
    char *result_url; // string

} bulk_upsert_status_response_t;

bulk_upsert_status_response_t *bulk_upsert_status_response_create(
    bulk_upsert_status_t *status,
    char *result_url
);

void bulk_upsert_status_response_free(bulk_upsert_status_response_t *bulk_upsert_status_response);

bulk_upsert_status_response_t *bulk_upsert_status_response_parseFromJSON(cJSON *bulk_upsert_status_responseJSON);

cJSON *bulk_upsert_status_response_convertToJSON(bulk_upsert_status_response_t *bulk_upsert_status_response);

#endif /* _bulk_upsert_status_response_H_ */

