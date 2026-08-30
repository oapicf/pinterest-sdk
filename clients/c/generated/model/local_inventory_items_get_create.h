/*
 * local_inventory_items_get_create.h
 *
 * Resource create operation model.
 */

#ifndef _local_inventory_items_get_create_H_
#define _local_inventory_items_get_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_inventory_items_get_create_t local_inventory_items_get_create_t;

#include "item_id_store_code_pair.h"



typedef struct local_inventory_items_get_create_t {
    list_t *item_filters; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} local_inventory_items_get_create_t;

__attribute__((deprecated)) local_inventory_items_get_create_t *local_inventory_items_get_create_create(
    list_t *item_filters
);

void local_inventory_items_get_create_free(local_inventory_items_get_create_t *local_inventory_items_get_create);

local_inventory_items_get_create_t *local_inventory_items_get_create_parseFromJSON(cJSON *local_inventory_items_get_createJSON);

cJSON *local_inventory_items_get_create_convertToJSON(local_inventory_items_get_create_t *local_inventory_items_get_create);

#endif /* _local_inventory_items_get_create_H_ */

