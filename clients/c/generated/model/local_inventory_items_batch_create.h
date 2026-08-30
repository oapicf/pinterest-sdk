/*
 * local_inventory_items_batch_create.h
 *
 * Resource create operation model.
 */

#ifndef _local_inventory_items_batch_create_H_
#define _local_inventory_items_batch_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_inventory_items_batch_create_t local_inventory_items_batch_create_t;

#include "local_inventory_operation.h"



typedef struct local_inventory_items_batch_create_t {
    list_t *operations; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} local_inventory_items_batch_create_t;

__attribute__((deprecated)) local_inventory_items_batch_create_t *local_inventory_items_batch_create_create(
    list_t *operations
);

void local_inventory_items_batch_create_free(local_inventory_items_batch_create_t *local_inventory_items_batch_create);

local_inventory_items_batch_create_t *local_inventory_items_batch_create_parseFromJSON(cJSON *local_inventory_items_batch_createJSON);

cJSON *local_inventory_items_batch_create_convertToJSON(local_inventory_items_batch_create_t *local_inventory_items_batch_create);

#endif /* _local_inventory_items_batch_create_H_ */

