#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_upload_response.h"


char* customer_list_upload_response_state_ToString(pinterest_rest_api_customer_list_upload_response_STATE_e state) {
    char* stateArray[] =  { "NULL", "NOT_STARTED", "RUNNING", "PAUSED", "SUCCEEDED", "FAILED" };
    return stateArray[state];
}

pinterest_rest_api_customer_list_upload_response_STATE_e customer_list_upload_response_state_FromString(char* state){
    int stringToReturn = 0;
    char *stateArray[] =  { "NULL", "NOT_STARTED", "RUNNING", "PAUSED", "SUCCEEDED", "FAILED" };
    size_t sizeofArray = sizeof(stateArray) / sizeof(stateArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(state, stateArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static customer_list_upload_response_t *customer_list_upload_response_create_internal(
    char *ad_account_id,
    int creation_time,
    char *customer_list_id,
    list_t *error_counts,
    char *id,
    pinterest_rest_api_user_list_operation_type__e operation,
    record_counts_t *record_counts,
    pinterest_rest_api_customer_list_upload_response_STATE_e state,
    int updated_time
    ) {
    customer_list_upload_response_t *customer_list_upload_response_local_var = malloc(sizeof(customer_list_upload_response_t));
    if (!customer_list_upload_response_local_var) {
        return NULL;
    }
    customer_list_upload_response_local_var->ad_account_id = ad_account_id;
    customer_list_upload_response_local_var->creation_time = creation_time;
    customer_list_upload_response_local_var->customer_list_id = customer_list_id;
    customer_list_upload_response_local_var->error_counts = error_counts;
    customer_list_upload_response_local_var->id = id;
    customer_list_upload_response_local_var->operation = operation;
    customer_list_upload_response_local_var->record_counts = record_counts;
    customer_list_upload_response_local_var->state = state;
    customer_list_upload_response_local_var->updated_time = updated_time;

    customer_list_upload_response_local_var->_library_owned = 1;
    return customer_list_upload_response_local_var;
}

__attribute__((deprecated)) customer_list_upload_response_t *customer_list_upload_response_create(
    char *ad_account_id,
    int creation_time,
    char *customer_list_id,
    list_t *error_counts,
    char *id,
    pinterest_rest_api_user_list_operation_type__e operation,
    record_counts_t *record_counts,
    pinterest_rest_api_customer_list_upload_response_STATE_e state,
    int updated_time
    ) {
    return customer_list_upload_response_create_internal (
        ad_account_id,
        creation_time,
        customer_list_id,
        error_counts,
        id,
        operation,
        record_counts,
        state,
        updated_time
        );
}

void customer_list_upload_response_free(customer_list_upload_response_t *customer_list_upload_response) {
    if(NULL == customer_list_upload_response){
        return ;
    }
    if(customer_list_upload_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_upload_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_upload_response->ad_account_id) {
        free(customer_list_upload_response->ad_account_id);
        customer_list_upload_response->ad_account_id = NULL;
    }
    if (customer_list_upload_response->customer_list_id) {
        free(customer_list_upload_response->customer_list_id);
        customer_list_upload_response->customer_list_id = NULL;
    }
    if (customer_list_upload_response->error_counts) {
        list_ForEach(listEntry, customer_list_upload_response->error_counts) {
            error_detail_free(listEntry->data);
        }
        list_freeList(customer_list_upload_response->error_counts);
        customer_list_upload_response->error_counts = NULL;
    }
    if (customer_list_upload_response->id) {
        free(customer_list_upload_response->id);
        customer_list_upload_response->id = NULL;
    }
    if (customer_list_upload_response->record_counts) {
        record_counts_free(customer_list_upload_response->record_counts);
        customer_list_upload_response->record_counts = NULL;
    }
    free(customer_list_upload_response);
}

cJSON *customer_list_upload_response_convertToJSON(customer_list_upload_response_t *customer_list_upload_response) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_upload_response->ad_account_id
    if (!customer_list_upload_response->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_account_id", customer_list_upload_response->ad_account_id) == NULL) {
    goto fail; //String
    }


    // customer_list_upload_response->creation_time
    if (!customer_list_upload_response->creation_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "creation_time", customer_list_upload_response->creation_time) == NULL) {
    goto fail; //Numeric
    }


    // customer_list_upload_response->customer_list_id
    if (!customer_list_upload_response->customer_list_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "customer_list_id", customer_list_upload_response->customer_list_id) == NULL) {
    goto fail; //String
    }


    // customer_list_upload_response->error_counts
    if(customer_list_upload_response->error_counts) {
    cJSON *error_counts = cJSON_AddArrayToObject(item, "error_counts");
    if(error_counts == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *error_countsListEntry;
    if (customer_list_upload_response->error_counts) {
    list_ForEach(error_countsListEntry, customer_list_upload_response->error_counts) {
    cJSON *itemLocal = error_detail_convertToJSON(error_countsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(error_counts, itemLocal);
    }
    }
    }


    // customer_list_upload_response->id
    if (!customer_list_upload_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", customer_list_upload_response->id) == NULL) {
    goto fail; //String
    }


    // customer_list_upload_response->operation
    if (pinterest_rest_api_user_list_operation_type__NULL == customer_list_upload_response->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = user_list_operation_type_convertToJSON(customer_list_upload_response->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // customer_list_upload_response->record_counts
    if(customer_list_upload_response->record_counts) {
    cJSON *record_counts_local_JSON = record_counts_convertToJSON(customer_list_upload_response->record_counts);
    if(record_counts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "record_counts", record_counts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // customer_list_upload_response->state
    if (pinterest_rest_api_customer_list_upload_response_STATE_NULL == customer_list_upload_response->state) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "state", customer_list_upload_response_state_ToString(customer_list_upload_response->state)) == NULL)
    {
    goto fail; //Enum
    }


    // customer_list_upload_response->updated_time
    if (!customer_list_upload_response->updated_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "updated_time", customer_list_upload_response->updated_time) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

customer_list_upload_response_t *customer_list_upload_response_parseFromJSON(cJSON *customer_list_upload_responseJSON){

    customer_list_upload_response_t *customer_list_upload_response_local_var = NULL;

    // define the local list for customer_list_upload_response->error_counts
    list_t *error_countsList = NULL;

    // define the local variable for customer_list_upload_response->operation
    pinterest_rest_api_user_list_operation_type__e operation_local_nonprim = 0;

    // define the local variable for customer_list_upload_response->record_counts
    record_counts_t *record_counts_local_nonprim = NULL;

    // customer_list_upload_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "ad_account_id");
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

    // customer_list_upload_response->creation_time
    cJSON *creation_time = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "creation_time");
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

    // customer_list_upload_response->customer_list_id
    cJSON *customer_list_id = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "customer_list_id");
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

    // customer_list_upload_response->error_counts
    cJSON *error_counts = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "error_counts");
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

    // customer_list_upload_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "id");
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

    // customer_list_upload_response->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = user_list_operation_type_parseFromJSON(operation); //custom

    // customer_list_upload_response->record_counts
    cJSON *record_counts = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "record_counts");
    if (cJSON_IsNull(record_counts)) {
        record_counts = NULL;
    }
    if (record_counts) { 
    record_counts_local_nonprim = record_counts_parseFromJSON(record_counts); //nonprimitive
    }

    // customer_list_upload_response->state
    cJSON *state = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "state");
    if (cJSON_IsNull(state)) {
        state = NULL;
    }
    if (!state) {
        goto end;
    }

    pinterest_rest_api_customer_list_upload_response_STATE_e stateVariable;
    
    if(!cJSON_IsString(state))
    {
    goto end; //Enum
    }
    stateVariable = customer_list_upload_response_state_FromString(state->valuestring);

    // customer_list_upload_response->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(customer_list_upload_responseJSON, "updated_time");
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


    customer_list_upload_response_local_var = customer_list_upload_response_create_internal (
        strdup(ad_account_id->valuestring),
        creation_time->valuedouble,
        strdup(customer_list_id->valuestring),
        error_counts ? error_countsList : NULL,
        strdup(id->valuestring),
        operation_local_nonprim,
        record_counts ? record_counts_local_nonprim : NULL,
        stateVariable,
        updated_time->valuedouble
        );

    return customer_list_upload_response_local_var;
end:
    if (error_countsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, error_countsList) {
            error_detail_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(error_countsList);
        error_countsList = NULL;
    }
    if (operation_local_nonprim) {
        operation_local_nonprim = 0;
    }
    if (record_counts_local_nonprim) {
        record_counts_free(record_counts_local_nonprim);
        record_counts_local_nonprim = NULL;
    }
    return NULL;

}
