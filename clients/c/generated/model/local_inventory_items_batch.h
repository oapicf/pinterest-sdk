/*
 * local_inventory_items_batch.h
 *
 * Unified model for local inventory items batch operation
 */

#ifndef _local_inventory_items_batch_H_
#define _local_inventory_items_batch_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_inventory_items_batch_t local_inventory_items_batch_t;

#include "supplemental_item_batch_operation_status.h"
#include "supplemental_operation_result.h"



typedef struct local_inventory_items_batch_t {
    char *batch_id; // string
    char *completed_time; //date time
    char *created_time; //date time
    list_t *operation_results; //nonprimitive container
    supplemental_item_batch_operation_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} local_inventory_items_batch_t;

__attribute__((deprecated)) local_inventory_items_batch_t *local_inventory_items_batch_create(
    char *batch_id,
    char *completed_time,
    char *created_time,
    list_t *operation_results,
    supplemental_item_batch_operation_status_t *status
);

void local_inventory_items_batch_free(local_inventory_items_batch_t *local_inventory_items_batch);

local_inventory_items_batch_t *local_inventory_items_batch_parseFromJSON(cJSON *local_inventory_items_batchJSON);

cJSON *local_inventory_items_batch_convertToJSON(local_inventory_items_batch_t *local_inventory_items_batch);

#endif /* _local_inventory_items_batch_H_ */

