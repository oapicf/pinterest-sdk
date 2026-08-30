/*
 * local_inventory_items_get.h
 *
 * Model for getting local inventory items
 */

#ifndef _local_inventory_items_get_H_
#define _local_inventory_items_get_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_inventory_items_get_t local_inventory_items_get_t;

#include "local_inventory_item_response.h"



typedef struct local_inventory_items_get_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} local_inventory_items_get_t;

__attribute__((deprecated)) local_inventory_items_get_t *local_inventory_items_get_create(
    list_t *items
);

void local_inventory_items_get_free(local_inventory_items_get_t *local_inventory_items_get);

local_inventory_items_get_t *local_inventory_items_get_parseFromJSON(cJSON *local_inventory_items_getJSON);

cJSON *local_inventory_items_get_convertToJSON(local_inventory_items_get_t *local_inventory_items_get);

#endif /* _local_inventory_items_get_H_ */

