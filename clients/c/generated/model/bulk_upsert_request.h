/*
 * bulk_upsert_request.h
 *
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */

#ifndef _bulk_upsert_request_H_
#define _bulk_upsert_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_upsert_request_t bulk_upsert_request_t;

#include "bulk_upsert_request_create.h"
#include "bulk_upsert_request_update.h"



typedef struct bulk_upsert_request_t {
    struct bulk_upsert_request_create_t *create; //model
    struct bulk_upsert_request_update_t *update; //model

} bulk_upsert_request_t;

bulk_upsert_request_t *bulk_upsert_request_create(
    bulk_upsert_request_create_t *create,
    bulk_upsert_request_update_t *update
);

void bulk_upsert_request_free(bulk_upsert_request_t *bulk_upsert_request);

bulk_upsert_request_t *bulk_upsert_request_parseFromJSON(cJSON *bulk_upsert_requestJSON);

cJSON *bulk_upsert_request_convertToJSON(bulk_upsert_request_t *bulk_upsert_request);

#endif /* _bulk_upsert_request_H_ */

