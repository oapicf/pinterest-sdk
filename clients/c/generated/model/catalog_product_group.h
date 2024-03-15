/*
 * catalog_product_group.h
 *
 * non-promoted catalog product group entity
 */

#ifndef _catalog_product_group_H_
#define _catalog_product_group_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalog_product_group_t catalog_product_group_t;

#include "board.h"
#include "entity_status.h"
#include "object.h"

// Enum  for catalog_product_group

typedef enum  { pinterest_rest_api_catalog_product_group__NULL = 0, pinterest_rest_api_catalog_product_group__ACTIVE, pinterest_rest_api_catalog_product_group__PAUSED, pinterest_rest_api_catalog_product_group__ARCHIVED, pinterest_rest_api_catalog_product_group__DRAFT, pinterest_rest_api_catalog_product_group__DELETED_DRAFT } pinterest_rest_api_catalog_product_group__e;

char* catalog_product_group_status_ToString(pinterest_rest_api_catalog_product_group__e status);

pinterest_rest_api_catalog_product_group__e catalog_product_group_status_FromString(char* status);



typedef struct catalog_product_group_t {
    char *id; // string
    char *merchant_id; // string
    char *name; // string
    object_t *filters; //object
    object_t *filter_v2; //object
    struct board_t *type; //model
    entity_status_t *status; // custom
    char *feed_profile_id; // string
    int created_at; //numeric
    int last_update; //numeric
    int product_count; //numeric
    int featured_position; //numeric

} catalog_product_group_t;

catalog_product_group_t *catalog_product_group_create(
    char *id,
    char *merchant_id,
    char *name,
    object_t *filters,
    object_t *filter_v2,
    board_t *type,
    entity_status_t *status,
    char *feed_profile_id,
    int created_at,
    int last_update,
    int product_count,
    int featured_position
);

void catalog_product_group_free(catalog_product_group_t *catalog_product_group);

catalog_product_group_t *catalog_product_group_parseFromJSON(cJSON *catalog_product_groupJSON);

cJSON *catalog_product_group_convertToJSON(catalog_product_group_t *catalog_product_group);

#endif /* _catalog_product_group_H_ */

