#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_upload.h"



static customer_list_upload_t *customer_list_upload_create_internal(
    char *ad_account_id,
    int *creation_time,
    char *customer_list_id,
    list_t *error_counts,
    char *id,
    pinterest_rest_api_user_list_operation_type__e operation,
    record_counts_t *record_counts,
    workload_state_t *state,
    int *updated_time
    ) {
    customer_list_upload_t *customer_list_upload_local_var = malloc(sizeof(customer_list_upload_t));
    if (!customer_list_upload_local_var) {
        return NULL;
    }
    memset(customer_list_upload_local_var, 0, sizeof(customer_list_upload_t));
    customer_list_upload_local_var->_library_owned = 1;
    customer_list_upload_local_var->ad_account_id = ad_account_id;
    customer_list_upload_local_var->creation_time = creation_time;
    customer_list_upload_local_var->customer_list_id = customer_list_id;
    customer_list_upload_local_var->error_counts = error_counts;
    customer_list_upload_local_var->id = id;
    customer_list_upload_local_var->operation = operation;
    customer_list_upload_local_var->record_counts = record_counts;
    customer_list_upload_local_var->state = state;
    customer_list_upload_local_var->updated_time = updated_time;
    return customer_list_upload_local_var;
}

__attribute__((deprecated)) customer_list_upload_t *customer_list_upload_create(
    char *ad_account_id,
    int *creation_time,
    char *customer_list_id,
    list_t *error_counts,
    char *id,
    pinterest_rest_api_user_list_operation_type__e operation,
    record_counts_t *record_counts,
    workload_state_t *state,
    int *updated_time
    ) {
    int *creation_time_copy = NULL;
    if (creation_time) {
        creation_time_copy = malloc(sizeof(int));
        if (creation_time_copy) *creation_time_copy = *creation_time;
    }
    int *updated_time_copy = NULL;
    if (updated_time) {
        updated_time_copy = malloc(sizeof(int));
        if (updated_time_copy) *updated_time_copy = *updated_time;
    }
    customer_list_upload_t *result = customer_list_upload_create_internal (
        ad_account_id,
        creation_time_copy,
        customer_list_id,
        error_counts,
        id,
        operation,
        record_counts,
        state,
        updated_time_copy
        );
    if (!result) {
        free(creation_time_copy);
        free(updated_time_copy);
    }
    return result;
}

void customer_list_upload_free(customer_list_upload_t *customer_list_upload) {
    if(NULL == customer_list_upload){
        return ;
    }
    if(customer_list_upload->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_upload_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_upload->ad_account_id) {
        free(customer_list_upload->ad_account_id);
        customer_list_upload->ad_account_id = NULL;
    }
    if (customer_list_upload->creation_time) {
        free(customer_list_upload->creation_time);
        customer_list_upload->creation_time = NULL;
    }
    if (customer_list_upload->customer_list_id) {
        free(customer_list_upload->customer_list_id);
        customer_list_upload->customer_list_id = NULL;
    }
    if (customer_list_upload->error_counts) {
        list_ForEach(listEntry, customer_list_upload->error_counts) {
            error_detail_free(listEntry->data);
        }
        list_freeList(customer_list_upload->error_counts);
        customer_list_upload->error_counts = NULL;
    }
    if (customer_list_upload->id) {
        free(customer_list_upload->id);
        customer_list_upload->id = NULL;
    }
    if (customer_list_upload->record_counts) {
        record_counts_free(customer_list_upload->record_counts);
        customer_list_upload->record_counts = NULL;
    }
    if (customer_list_upload->state) {
        workload_state_free(customer_list_upload->state);
        customer_list_upload->state = NULL;
    }
    if (customer_list_upload->updated_time) {
        free(customer_list_upload->updated_time);
        customer_list_upload->updated_time = NULL;
    }
    free(customer_list_upload);
}

cJSON *customer_list_upload_convertToJSON(customer_list_upload_t *customer_list_upload) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_upload->ad_account_id
    if (!customer_list_upload->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_account_id", customer_list_upload->ad_account_id) == NULL) {
    goto fail; //String
    }


    // customer_list_upload->creation_time
    if (!customer_list_upload->creation_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "creation_time", *customer_list_upload->creation_time) == NULL) {
    goto fail; //Numeric
    }


    // customer_list_upload->customer_list_id
    if (!customer_list_upload->customer_list_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "customer_list_id", customer_list_upload->customer_list_id) == NULL) {
    goto fail; //String
    }


    // customer_list_upload->error_counts
    if(customer_list_upload->error_counts) {
    cJSON *error_counts = cJSON_AddArrayToObject(item, "error_counts");
    if(error_counts == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *error_countsListEntry;
    if (customer_list_upload->error_counts) {
    list_ForEach(error_countsListEntry, customer_list_upload->error_counts) {
    cJSON *itemLocal = error_detail_convertToJSON(error_countsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(error_counts, itemLocal);
    }
    }
    }


    // customer_list_upload->id
    if (!customer_list_upload->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", customer_list_upload->id) == NULL) {
    goto fail; //String
    }


    // customer_list_upload->operation
    if (pinterest_rest_api_user_list_operation_type__NULL == customer_list_upload->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = user_list_operation_type_convertToJSON(customer_list_upload->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // customer_list_upload->record_counts
    if(customer_list_upload->record_counts) {
    cJSON *record_counts_local_JSON = record_counts_convertToJSON(customer_list_upload->record_counts);
    if(record_counts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "record_counts", record_counts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // customer_list_upload->state
    if (!customer_list_upload->state) {
        goto fail;
    }
    cJSON *state_local_JSON = workload_state_convertToJSON(customer_list_upload->state);
    if(state_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "state", state_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // customer_list_upload->updated_time
    if (!customer_list_upload->updated_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "updated_time", *customer_list_upload->updated_time) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

customer_list_upload_t *customer_list_upload_parseFromJSON(cJSON *customer_list_uploadJSON){

    customer_list_upload_t *customer_list_upload_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for customer_list_upload->creation_time
    int *creation_time_local_var = NULL;

    char *customer_list_id_local_str = NULL;

    // define the local list for customer_list_upload->error_counts
    list_t *error_countsList = NULL;

    char *id_local_str = NULL;

    // define the local variable for customer_list_upload->operation
    pinterest_rest_api_user_list_operation_type__e operation_local_nonprim = 0;

    // define the local variable for customer_list_upload->record_counts
    record_counts_t *record_counts_local_nonprim = NULL;

    // define the local variable for customer_list_upload->state
    workload_state_t *state_local_nonprim = NULL;

    // define the local variable for customer_list_upload->updated_time
    int *updated_time_local_var = NULL;

    // customer_list_upload->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (!ad_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_account_id))
    {
    goto end; //String
    }

    // customer_list_upload->creation_time
    cJSON *creation_time = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "creation_time");
    if (cJSON_IsNull(creation_time)) {
        creation_time = NULL;
    }
    if (!creation_time) {
        goto end;
    }

    
    if(!cJSON_IsNumber(creation_time))
    {
    goto end; //Numeric
    }
    creation_time_local_var = malloc(sizeof(int));
    if(!creation_time_local_var)
    {
        goto end;
    }
    *creation_time_local_var = creation_time->valuedouble;

    // customer_list_upload->customer_list_id
    cJSON *customer_list_id = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "customer_list_id");
    if (cJSON_IsNull(customer_list_id)) {
        customer_list_id = NULL;
    }
    if (!customer_list_id) {
        goto end;
    }

    
    if(!cJSON_IsString(customer_list_id))
    {
    goto end; //String
    }

    // customer_list_upload->error_counts
    cJSON *error_counts = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "error_counts");
    if (cJSON_IsNull(error_counts)) {
        error_counts = NULL;
    }
    if (error_counts) { 
    cJSON *error_counts_local_nonprimitive = NULL;
    if(!cJSON_IsArray(error_counts)){
        goto end; //nonprimitive container
    }

    error_countsList = list_createList();

    cJSON_ArrayForEach(error_counts_local_nonprimitive,error_counts )
    {
        if(!cJSON_IsObject(error_counts_local_nonprimitive)){
            goto end;
        }
        error_detail_t *error_countsItem = error_detail_parseFromJSON(error_counts_local_nonprimitive);

        list_addElement(error_countsList, error_countsItem);
    }
    }

    // customer_list_upload->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // customer_list_upload->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = user_list_operation_type_parseFromJSON(operation); //custom

    // customer_list_upload->record_counts
    cJSON *record_counts = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "record_counts");
    if (cJSON_IsNull(record_counts)) {
        record_counts = NULL;
    }
    if (record_counts) { 
    record_counts_local_nonprim = record_counts_parseFromJSON(record_counts); //nonprimitive
    }

    // customer_list_upload->state
    cJSON *state = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "state");
    if (cJSON_IsNull(state)) {
        state = NULL;
    }
    if (!state) {
        goto end;
    }

    
    state_local_nonprim = workload_state_parseFromJSON(state); //custom

    // customer_list_upload->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(customer_list_uploadJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (!updated_time) {
        goto end;
    }

    
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    updated_time_local_var = malloc(sizeof(int));
    if(!updated_time_local_var)
    {
        goto end;
    }
    *updated_time_local_var = updated_time->valuedouble;


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (customer_list_id && !cJSON_IsNull(customer_list_id)) customer_list_id_local_str = strdup(customer_list_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    customer_list_upload_local_var = customer_list_upload_create_internal (
        ad_account_id_local_str,
        creation_time_local_var,
        customer_list_id_local_str,
        error_counts ? error_countsList : NULL,
        id_local_str,
        operation_local_nonprim,
        record_counts ? record_counts_local_nonprim : NULL,
        state_local_nonprim,
        updated_time_local_var
        );

    if (!customer_list_upload_local_var) {
        goto end;
    }

    return customer_list_upload_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (creation_time_local_var) {
        free(creation_time_local_var);
        creation_time_local_var = NULL;
    }
    if (customer_list_id_local_str) {
        free(customer_list_id_local_str);
        customer_list_id_local_str = NULL;
    }
    if (error_countsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, error_countsList) {
            error_detail_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(error_countsList);
        error_countsList = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (operation_local_nonprim) {
        operation_local_nonprim = 0;
    }
    if (record_counts_local_nonprim) {
        record_counts_free(record_counts_local_nonprim);
        record_counts_local_nonprim = NULL;
    }
    if (state_local_nonprim) {
        workload_state_free(state_local_nonprim);
        state_local_nonprim = NULL;
    }
    if (updated_time_local_var) {
        free(updated_time_local_var);
        updated_time_local_var = NULL;
    }
    return NULL;

}
