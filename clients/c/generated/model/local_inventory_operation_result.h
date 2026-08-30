/*
 * local_inventory_operation_result.h
 *
 * Result model for local inventory operation
 */

#ifndef _local_inventory_operation_result_H_
#define _local_inventory_operation_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct local_inventory_operation_result_t local_inventory_operation_result_t;

#include "supplemental_item_processing_status.h"
#include "supplemental_item_validation_event.h"

// Enum SUPPLEMENTALTYPE for local_inventory_operation_result

typedef enum  { pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_NULL = 0, pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_LOCAL_INVENTORY } pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e;

char* local_inventory_operation_result_supplemental_type_ToString(pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e supplemental_type);

pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e local_inventory_operation_result_supplemental_type_FromString(char* supplemental_type);



typedef struct local_inventory_operation_result_t {
    list_t *errors; //nonprimitive container
    char *item_id; // string
    supplemental_item_processing_status_t *status; // custom
    char *store_code; // string
    pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e supplemental_type; //enum
    list_t *warnings; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} local_inventory_operation_result_t;

__attribute__((deprecated)) local_inventory_operation_result_t *local_inventory_operation_result_create(
    list_t *errors,
    char *item_id,
    supplemental_item_processing_status_t *status,
    char *store_code,
    pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e supplemental_type,
    list_t *warnings
);

void local_inventory_operation_result_free(local_inventory_operation_result_t *local_inventory_operation_result);

local_inventory_operation_result_t *local_inventory_operation_result_parseFromJSON(cJSON *local_inventory_operation_resultJSON);

cJSON *local_inventory_operation_result_convertToJSON(local_inventory_operation_result_t *local_inventory_operation_result);

#endif /* _local_inventory_operation_result_H_ */

