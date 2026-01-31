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



typedef struct bulk_upsert_status_response_t {
    char *result_url; // string
    pinterest_rest_api_bulk_upsert_status__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_upsert_status_response_t;

__attribute__((deprecated)) bulk_upsert_status_response_t *bulk_upsert_status_response_create(
    char *result_url,
    pinterest_rest_api_bulk_upsert_status__e status
);

void bulk_upsert_status_response_free(bulk_upsert_status_response_t *bulk_upsert_status_response);

bulk_upsert_status_response_t *bulk_upsert_status_response_parseFromJSON(cJSON *bulk_upsert_status_responseJSON);

cJSON *bulk_upsert_status_response_convertToJSON(bulk_upsert_status_response_t *bulk_upsert_status_response);

#endif /* _bulk_upsert_status_response_H_ */

