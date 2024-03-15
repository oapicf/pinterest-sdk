/*
 * bulk_upsert_response.h
 *
 * ID of the bulk request.
 */

#ifndef _bulk_upsert_response_H_
#define _bulk_upsert_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_upsert_response_t bulk_upsert_response_t;




typedef struct bulk_upsert_response_t {
    char *request_id; // string

} bulk_upsert_response_t;

bulk_upsert_response_t *bulk_upsert_response_create(
    char *request_id
);

void bulk_upsert_response_free(bulk_upsert_response_t *bulk_upsert_response);

bulk_upsert_response_t *bulk_upsert_response_parseFromJSON(cJSON *bulk_upsert_responseJSON);

cJSON *bulk_upsert_response_convertToJSON(bulk_upsert_response_t *bulk_upsert_response);

#endif /* _bulk_upsert_response_H_ */

