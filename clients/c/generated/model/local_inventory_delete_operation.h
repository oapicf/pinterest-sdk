/*
 * local_inventory_delete_operation.h
 *
 * Delete operation for local inventory item
 */

#ifndef _local_inventory_delete_operation_H_
#define _local_inventory_delete_operation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_inventory_delete_operation_t local_inventory_delete_operation_t;


// Enum OPERATION for local_inventory_delete_operation

typedef enum  { pinterest_rest_api_local_inventory_delete_operation_OPERATION_NULL = 0, pinterest_rest_api_local_inventory_delete_operation_OPERATION__DELETE } pinterest_rest_api_local_inventory_delete_operation_OPERATION_e;

char* local_inventory_delete_operation_operation_ToString(pinterest_rest_api_local_inventory_delete_operation_OPERATION_e operation);

pinterest_rest_api_local_inventory_delete_operation_OPERATION_e local_inventory_delete_operation_operation_FromString(char* operation);



typedef struct local_inventory_delete_operation_t {
    char *item_id; // string
    pinterest_rest_api_local_inventory_delete_operation_OPERATION_e operation; //enum
    char *store_code; // string

    int _library_owned; // Is the library responsible for freeing this object?
} local_inventory_delete_operation_t;

__attribute__((deprecated)) local_inventory_delete_operation_t *local_inventory_delete_operation_create(
    char *item_id,
    pinterest_rest_api_local_inventory_delete_operation_OPERATION_e operation,
    char *store_code
);

void local_inventory_delete_operation_free(local_inventory_delete_operation_t *local_inventory_delete_operation);

local_inventory_delete_operation_t *local_inventory_delete_operation_parseFromJSON(cJSON *local_inventory_delete_operationJSON);

cJSON *local_inventory_delete_operation_convertToJSON(local_inventory_delete_operation_t *local_inventory_delete_operation);

#endif /* _local_inventory_delete_operation_H_ */

