/*
 * local_inventory_item_response.h
 *
 * Local inventory item response
 */

#ifndef _local_inventory_item_response_H_
#define _local_inventory_item_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_inventory_item_response_t local_inventory_item_response_t;

#include "item_availability.h"
#include "store_metadata.h"



typedef struct local_inventory_item_response_t {
    char *ad_link; // string
    item_availability_t *availability; // custom
    long *created_at; //numeric
    char *item_id; // string
    long *last_updated_time; //numeric
    char *price; // string
    char *sale_price; // string
    struct store_metadata_t *store_metadata; //model

    int _library_owned; // Is the library responsible for freeing this object?
} local_inventory_item_response_t;

__attribute__((deprecated)) local_inventory_item_response_t *local_inventory_item_response_create(
    char *ad_link,
    item_availability_t *availability,
    long *created_at,
    char *item_id,
    long *last_updated_time,
    char *price,
    char *sale_price,
    store_metadata_t *store_metadata
);

void local_inventory_item_response_free(local_inventory_item_response_t *local_inventory_item_response);

local_inventory_item_response_t *local_inventory_item_response_parseFromJSON(cJSON *local_inventory_item_responseJSON);

cJSON *local_inventory_item_response_convertToJSON(local_inventory_item_response_t *local_inventory_item_response);

#endif /* _local_inventory_item_response_H_ */

