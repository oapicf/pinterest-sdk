#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "supplemental_items_batch_response.h"



static supplemental_items_batch_response_t *supplemental_items_batch_response_create_internal(
    char *batch_id,
    char *completed_time,
    char *created_time,
    list_t *operation_results,
    supplemental_item_batch_operation_status_t *status
    ) {
    supplemental_items_batch_response_t *supplemental_items_batch_response_local_var = malloc(sizeof(supplemental_items_batch_response_t));
    if (!supplemental_items_batch_response_local_var) {
        return NULL;
    }
    memset(supplemental_items_batch_response_local_var, 0, sizeof(supplemental_items_batch_response_t));
    supplemental_items_batch_response_local_var->_library_owned = 1;
    supplemental_items_batch_response_local_var->batch_id = batch_id;
    supplemental_items_batch_response_local_var->completed_time = completed_time;
    supplemental_items_batch_response_local_var->created_time = created_time;
    supplemental_items_batch_response_local_var->operation_results = operation_results;
    supplemental_items_batch_response_local_var->status = status;
    return supplemental_items_batch_response_local_var;
}

__attribute__((deprecated)) supplemental_items_batch_response_t *supplemental_items_batch_response_create(
    char *batch_id,
    char *completed_time,
    char *created_time,
    list_t *operation_results,
    supplemental_item_batch_operation_status_t *status
    ) {
    supplemental_items_batch_response_t *result = supplemental_items_batch_response_create_internal (
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

void supplemental_items_batch_response_free(supplemental_items_batch_response_t *supplemental_items_batch_response) {
    if(NULL == supplemental_items_batch_response){
        return ;
    }
    if(supplemental_items_batch_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "supplemental_items_batch_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (supplemental_items_batch_response->batch_id) {
        free(supplemental_items_batch_response->batch_id);
        supplemental_items_batch_response->batch_id = NULL;
    }
    if (supplemental_items_batch_response->completed_time) {
        free(supplemental_items_batch_response->completed_time);
        supplemental_items_batch_response->completed_time = NULL;
    }
    if (supplemental_items_batch_response->created_time) {
        free(supplemental_items_batch_response->created_time);
        supplemental_items_batch_response->created_time = NULL;
    }
    if (supplemental_items_batch_response->operation_results) {
        list_ForEach(listEntry, supplemental_items_batch_response->operation_results) {
            supplemental_operation_result_free(listEntry->data);
        }
        list_freeList(supplemental_items_batch_response->operation_results);
        supplemental_items_batch_response->operation_results = NULL;
    }
    if (supplemental_items_batch_response->status) {
        supplemental_item_batch_operation_status_free(supplemental_items_batch_response->status);
        supplemental_items_batch_response->status = NULL;
    }
    free(supplemental_items_batch_response);
}

cJSON *supplemental_items_batch_response_convertToJSON(supplemental_items_batch_response_t *supplemental_items_batch_response) {
    cJSON *item = cJSON_CreateObject();

    // supplemental_items_batch_response->batch_id
    if (!supplemental_items_batch_response->batch_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "batch_id", supplemental_items_batch_response->batch_id) == NULL) {
    goto fail; //String
    }


    // supplemental_items_batch_response->completed_time
    if(supplemental_items_batch_response->completed_time) {
    if(cJSON_AddStringToObject(item, "completed_time", supplemental_items_batch_response->completed_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // supplemental_items_batch_response->created_time
    if (!supplemental_items_batch_response->created_time) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_time", supplemental_items_batch_response->created_time) == NULL) {
    goto fail; //Date-Time
    }


    // supplemental_items_batch_response->operation_results
    if (!supplemental_items_batch_response->operation_results) {
        goto fail;
    }
    cJSON *operation_results = cJSON_AddArrayToObject(item, "operation_results");
    if(operation_results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *operation_resultsListEntry;
    if (supplemental_items_batch_response->operation_results) {
    list_ForEach(operation_resultsListEntry, supplemental_items_batch_response->operation_results) {
    cJSON *itemLocal = supplemental_operation_result_convertToJSON(operation_resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(operation_results, itemLocal);
    }
    }


    // supplemental_items_batch_response->status
    if (!supplemental_items_batch_response->status) {
        goto fail;
    }
    cJSON *status_local_JSON = supplemental_item_batch_operation_status_convertToJSON(supplemental_items_batch_response->status);
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

supplemental_items_batch_response_t *supplemental_items_batch_response_parseFromJSON(cJSON *supplemental_items_batch_responseJSON){

    supplemental_items_batch_response_t *supplemental_items_batch_response_local_var = NULL;

    char *batch_id_local_str = NULL;

    char *completed_time_local_str = NULL;

    char *created_time_local_str = NULL;

    // define the local list for supplemental_items_batch_response->operation_results
    list_t *operation_resultsList = NULL;

    // define the local variable for supplemental_items_batch_response->status
    supplemental_item_batch_operation_status_t *status_local_nonprim = NULL;

    // supplemental_items_batch_response->batch_id
    cJSON *batch_id = cJSON_GetObjectItemCaseSensitive(supplemental_items_batch_responseJSON, "batch_id");
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

    // supplemental_items_batch_response->completed_time
    cJSON *completed_time = cJSON_GetObjectItemCaseSensitive(supplemental_items_batch_responseJSON, "completed_time");
    if (cJSON_IsNull(completed_time)) {
        completed_time = NULL;
    }
    if (completed_time) { 
    if(!cJSON_IsString(completed_time) && !cJSON_IsNull(completed_time))
    {
    goto end; //DateTime
    }
    }

    // supplemental_items_batch_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(supplemental_items_batch_responseJSON, "created_time");
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

    // supplemental_items_batch_response->operation_results
    cJSON *operation_results = cJSON_GetObjectItemCaseSensitive(supplemental_items_batch_responseJSON, "operation_results");
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

    // supplemental_items_batch_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(supplemental_items_batch_responseJSON, "status");
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

    supplemental_items_batch_response_local_var = supplemental_items_batch_response_create_internal (
        batch_id_local_str,
        completed_time_local_str,
        created_time_local_str,
        operation_resultsList,
        status_local_nonprim
        );

    if (!supplemental_items_batch_response_local_var) {
        goto end;
    }

    return supplemental_items_batch_response_local_var;
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
