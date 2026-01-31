/*
 * bulk_upsert_request_update.h
 *
 * Request for creation of entities in bulk.
 */

#ifndef _bulk_upsert_request_update_H_
#define _bulk_upsert_request_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_upsert_request_update_t bulk_upsert_request_update_t;

#include "ad_group_update_request.h"
#include "ad_update_request.h"
#include "campaign_update_request.h"
#include "catalogs_product_groups_update_request.h"
#include "keyword_update.h"
#include "label_bulk_update_request.h"
#include "product_group_promotion_update_request.h"



typedef struct bulk_upsert_request_update_t {
    list_t *ad_groups; //nonprimitive container
    list_t *ads; //nonprimitive container
    list_t *campaigns; //nonprimitive container
    list_t *catalog_product_groups; //nonprimitive container
    list_t *keywords; //nonprimitive container
    list_t *labels; //nonprimitive container
    list_t *product_groups; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_upsert_request_update_t;

__attribute__((deprecated)) bulk_upsert_request_update_t *bulk_upsert_request_update_create(
    list_t *ad_groups,
    list_t *ads,
    list_t *campaigns,
    list_t *catalog_product_groups,
    list_t *keywords,
    list_t *labels,
    list_t *product_groups
);

void bulk_upsert_request_update_free(bulk_upsert_request_update_t *bulk_upsert_request_update);

bulk_upsert_request_update_t *bulk_upsert_request_update_parseFromJSON(cJSON *bulk_upsert_request_updateJSON);

cJSON *bulk_upsert_request_update_convertToJSON(bulk_upsert_request_update_t *bulk_upsert_request_update);

#endif /* _bulk_upsert_request_update_H_ */

