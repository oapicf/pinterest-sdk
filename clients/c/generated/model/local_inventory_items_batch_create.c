#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_inventory_items_batch_create.h"



static local_inventory_items_batch_create_t *local_inventory_items_batch_create_create_internal(
    list_t *operations
    ) {
    local_inventory_items_batch_create_t *local_inventory_items_batch_create_local_var = malloc(sizeof(local_inventory_items_batch_create_t));
    if (!local_inventory_items_batch_create_local_var) {
        return NULL;
    }
    memset(local_inventory_items_batch_create_local_var, 0, sizeof(local_inventory_items_batch_create_t));
    local_inventory_items_batch_create_local_var->_library_owned = 1;
    local_inventory_items_batch_create_local_var->operations = operations;
    return local_inventory_items_batch_create_local_var;
}

__attribute__((deprecated)) local_inventory_items_batch_create_t *local_inventory_items_batch_create_create(
    list_t *operations
    ) {
    local_inventory_items_batch_create_t *result = local_inventory_items_batch_create_create_internal (
        operations
        );
    if (!result) {
    }
    return result;
}

void local_inventory_items_batch_create_free(local_inventory_items_batch_create_t *local_inventory_items_batch_create) {
    if(NULL == local_inventory_items_batch_create){
        return ;
    }
    if(local_inventory_items_batch_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_inventory_items_batch_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_inventory_items_batch_create->operations) {
        list_ForEach(listEntry, local_inventory_items_batch_create->operations) {
            local_inventory_operation_free(listEntry->data);
        }
        list_freeList(local_inventory_items_batch_create->operations);
        local_inventory_items_batch_create->operations = NULL;
    }
    free(local_inventory_items_batch_create);
}

cJSON *local_inventory_items_batch_create_convertToJSON(local_inventory_items_batch_create_t *local_inventory_items_batch_create) {
    cJSON *item = cJSON_CreateObject();

    // local_inventory_items_batch_create->operations
    if (!local_inventory_items_batch_create->operations) {
        goto fail;
    }
    cJSON *operations = cJSON_AddArrayToObject(item, "operations");
    if(operations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *operationsListEntry;
    if (local_inventory_items_batch_create->operations) {
    list_ForEach(operationsListEntry, local_inventory_items_batch_create->operations) {
    cJSON *itemLocal = local_inventory_operation_convertToJSON(operationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(operations, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

local_inventory_items_batch_create_t *local_inventory_items_batch_create_parseFromJSON(cJSON *local_inventory_items_batch_createJSON){

    local_inventory_items_batch_create_t *local_inventory_items_batch_create_local_var = NULL;

    // define the local list for local_inventory_items_batch_create->operations
    list_t *operationsList = NULL;

    // local_inventory_items_batch_create->operations
    cJSON *operations = cJSON_GetObjectItemCaseSensitive(local_inventory_items_batch_createJSON, "operations");
    if (cJSON_IsNull(operations)) {
        operations = NULL;
    }
    if (!operations) {
        goto end;
    }

    
    cJSON *operations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(operations)){
        goto end; //nonprimitive container
    }

    operationsList = list_createList();

    cJSON_ArrayForEach(operations_local_nonprimitive,operations )
    {
        if(!cJSON_IsObject(operations_local_nonprimitive)){
            goto end;
        }
        local_inventory_operation_t *operationsItem = local_inventory_operation_parseFromJSON(operations_local_nonprimitive);

        list_addElement(operationsList, operationsItem);
    }



    local_inventory_items_batch_create_local_var = local_inventory_items_batch_create_create_internal (
        operationsList
        );

    if (!local_inventory_items_batch_create_local_var) {
        goto end;
    }

    return local_inventory_items_batch_create_local_var;
end:
    if (operationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, operationsList) {
            local_inventory_operation_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(operationsList);
        operationsList = NULL;
    }
    return NULL;

}
