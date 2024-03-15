/*
 * bulk_upsert_request_create.h
 *
 * Request for creation of entities in bulk.
 */

#ifndef _bulk_upsert_request_create_H_
#define _bulk_upsert_request_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_upsert_request_create_t bulk_upsert_request_create_t;

#include "ad_create_request.h"
#include "ad_group_create_request.h"
#include "campaign_create_request.h"
#include "keywords_request.h"
#include "product_group_promotion_create_request.h"



typedef struct bulk_upsert_request_create_t {
    list_t *campaigns; //nonprimitive container
    list_t *ad_groups; //nonprimitive container
    list_t *ads; //nonprimitive container
    list_t *product_groups; //nonprimitive container
    list_t *keywords; //nonprimitive container

} bulk_upsert_request_create_t;

bulk_upsert_request_create_t *bulk_upsert_request_create_create(
    list_t *campaigns,
    list_t *ad_groups,
    list_t *ads,
    list_t *product_groups,
    list_t *keywords
);

void bulk_upsert_request_create_free(bulk_upsert_request_create_t *bulk_upsert_request_create);

bulk_upsert_request_create_t *bulk_upsert_request_create_parseFromJSON(cJSON *bulk_upsert_request_createJSON);

cJSON *bulk_upsert_request_create_convertToJSON(bulk_upsert_request_create_t *bulk_upsert_request_create);

#endif /* _bulk_upsert_request_create_H_ */

