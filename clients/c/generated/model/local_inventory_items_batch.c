#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_inventory_items_batch.h"



static local_inventory_items_batch_t *local_inventory_items_batch_create_internal(
    char *batch_id,
    char *completed_time,
    char *created_time,
    list_t *operation_results,
    supplemental_item_batch_operation_status_t *status
    ) {
    local_inventory_items_batch_t *local_inventory_items_batch_local_var = malloc(sizeof(local_inventory_items_batch_t));
    if (!local_inventory_items_batch_local_var) {
        return NULL;
    }
    memset(local_inventory_items_batch_local_var, 0, sizeof(local_inventory_items_batch_t));
    local_inventory_items_batch_local_var->_library_owned = 1;
    local_inventory_items_batch_local_var->batch_id = batch_id;
    local_inventory_items_batch_local_var->completed_time = completed_time;
    local_inventory_items_batch_local_var->created_time = created_time;
    local_inventory_items_batch_local_var->operation_results = operation_results;
    local_inventory_items_batch_local_var->status = status;
    return local_inventory_items_batch_local_var;
}

__attribute__((deprecated)) local_inventory_items_batch_t *local_inventory_items_batch_create(
    char *batch_id,
    char *completed_time,
    char *created_time,
    list_t *operation_results,
    supplemental_item_batch_operation_status_t *status
    ) {
    local_inventory_items_batch_t *result = local_inventory_items_batch_create_internal (
        batch_id,
        completed_time,
        created_time,
        operation_results,
        status
        );
    if (!result) {
    }
    return result;
}

void local_inventory_items_batch_free(local_inventory_items_batch_t *local_inventory_items_batch) {
    if(NULL == local_inventory_items_batch){
        return ;
    }
    if(local_inventory_items_batch->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_inventory_items_batch_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_inventory_items_batch->batch_id) {
        free(local_inventory_items_batch->batch_id);
        local_inventory_items_batch->batch_id = NULL;
    }
    if (local_inventory_items_batch->completed_time) {
        free(local_inventory_items_batch->completed_time);
        local_inventory_items_batch->completed_time = NULL;
    }
    if (local_inventory_items_batch->created_time) {
        free(local_inventory_items_batch->created_time);
        local_inventory_items_batch->created_time = NULL;
    }
    if (local_inventory_items_batch->operation_results) {
        list_ForEach(listEntry, local_inventory_items_batch->operation_results) {
            supplemental_operation_result_free(listEntry->data);
        }
        list_freeList(local_inventory_items_batch->operation_results);
        local_inventory_items_batch->operation_results = NULL;
    }
    if (local_inventory_items_batch->status) {
        supplemental_item_batch_operation_status_free(local_inventory_items_batch->status);
        local_inventory_items_batch->status = NULL;
    }
    free(local_inventory_items_batch);
}

cJSON *local_inventory_items_batch_convertToJSON(local_inventory_items_batch_t *local_inventory_items_batch) {
    cJSON *item = cJSON_CreateObject();

    // local_inventory_items_batch->batch_id
    if (!local_inventory_items_batch->batch_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "batch_id", local_inventory_items_batch->batch_id) == NULL) {
    goto fail; //String
    }


    // local_inventory_items_batch->completed_time
    if(local_inventory_items_batch->completed_time) {
    if(cJSON_AddStringToObject(item, "completed_time", local_inventory_items_batch->completed_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // local_inventory_items_batch->created_time
    if (!local_inventory_items_batch->created_time) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_time", local_inventory_items_batch->created_time) == NULL) {
    goto fail; //Date-Time
    }


    // local_inventory_items_batch->operation_results
    if (!local_inventory_items_batch->operation_results) {
        goto fail;
    }
    cJSON *operation_results = cJSON_AddArrayToObject(item, "operation_results");
    if(operation_results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *operation_resultsListEntry;
    if (local_inventory_items_batch->operation_results) {
    list_ForEach(operation_resultsListEntry, local_inventory_items_batch->operation_results) {
    cJSON *itemLocal = supplemental_operation_result_convertToJSON(operation_resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(operation_results, itemLocal);
    }
    }


    // local_inventory_items_batch->status
    if (!local_inventory_items_batch->status) {
        goto fail;
    }
    cJSON *status_local_JSON = supplemental_item_batch_operation_status_convertToJSON(local_inventory_items_batch->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

local_inventory_items_batch_t *local_inventory_items_batch_parseFromJSON(cJSON *local_inventory_items_batchJSON){

    local_inventory_items_batch_t *local_inventory_items_batch_local_var = NULL;

    char *batch_id_local_str = NULL;

    char *completed_time_local_str = NULL;

    char *created_time_local_str = NULL;

    // define the local list for local_inventory_items_batch->operation_results
    list_t *operation_resultsList = NULL;

    // define the local variable for local_inventory_items_batch->status
    supplemental_item_batch_operation_status_t *status_local_nonprim = NULL;

    // local_inventory_items_batch->batch_id
    cJSON *batch_id = cJSON_GetObjectItemCaseSensitive(local_inventory_items_batchJSON, "batch_id");
    if (cJSON_IsNull(batch_id)) {
        batch_id = NULL;
    }
    if (!batch_id) {
        goto end;
    }

    
    if(!cJSON_IsString(batch_id))
    {
    goto end; //String
    }

    // local_inventory_items_batch->completed_time
    cJSON *completed_time = cJSON_GetObjectItemCaseSensitive(local_inventory_items_batchJSON, "completed_time");
    if (cJSON_IsNull(completed_time)) {
        completed_time = NULL;
    }
    if (completed_time) { 
    if(!cJSON_IsString(completed_time) && !cJSON_IsNull(completed_time))
    {
    goto end; //DateTime
    }
    }

    // local_inventory_items_batch->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(local_inventory_items_batchJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (!created_time) {
        goto end;
    }

    
    if(!cJSON_IsString(created_time) && !cJSON_IsNull(created_time))
    {
    goto end; //DateTime
    }

    // local_inventory_items_batch->operation_results
    cJSON *operation_results = cJSON_GetObjectItemCaseSensitive(local_inventory_items_batchJSON, "operation_results");
    if (cJSON_IsNull(operation_results)) {
        operation_results = NULL;
    }
    if (!operation_results) {
        goto end;
    }

    
    cJSON *operation_results_local_nonprimitive = NULL;
    if(!cJSON_IsArray(operation_results)){
        goto end; //nonprimitive container
    }

    operation_resultsList = list_createList();

    cJSON_ArrayForEach(operation_results_local_nonprimitive,operation_results )
    {
        if(!cJSON_IsObject(operation_results_local_nonprimitive)){
            goto end;
        }
        supplemental_operation_result_t *operation_resultsItem = supplemental_operation_result_parseFromJSON(operation_results_local_nonprimitive);

        list_addElement(operation_resultsList, operation_resultsItem);
    }

    // local_inventory_items_batch->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(local_inventory_items_batchJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = supplemental_item_batch_operation_status_parseFromJSON(status); //custom


    if (batch_id && !cJSON_IsNull(batch_id)) batch_id_local_str = strdup(batch_id->valuestring);
    if (completed_time && !cJSON_IsNull(completed_time)) completed_time_local_str = strdup(completed_time->valuestring);
    if (created_time && !cJSON_IsNull(created_time)) created_time_local_str = strdup(created_time->valuestring);

    local_inventory_items_batch_local_var = local_inventory_items_batch_create_internal (
        batch_id_local_str,
        completed_time_local_str,
        created_time_local_str,
        operation_resultsList,
        status_local_nonprim
        );

    if (!local_inventory_items_batch_local_var) {
        goto end;
    }

    return local_inventory_items_batch_local_var;
end:
    if (batch_id_local_str) {
        free(batch_id_local_str);
        batch_id_local_str = NULL;
    }
    if (completed_time_local_str) {
        free(completed_time_local_str);
        completed_time_local_str = NULL;
    }
    if (created_time_local_str) {
        free(created_time_local_str);
        created_time_local_str = NULL;
    }
    if (operation_resultsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, operation_resultsList) {
            supplemental_operation_result_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(operation_resultsList);
        operation_resultsList = NULL;
    }
    if (status_local_nonprim) {
        supplemental_item_batch_operation_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
