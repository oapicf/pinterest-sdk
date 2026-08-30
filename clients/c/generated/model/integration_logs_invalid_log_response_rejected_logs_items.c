#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_logs_invalid_log_response_rejected_logs_items.h"



static integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items_create_internal(
    char *field,
    int *log_index,
    char *reason,
    char *value
    ) {
    integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items_local_var = malloc(sizeof(integration_logs_invalid_log_response_rejected_logs_items_t));
    if (!integration_logs_invalid_log_response_rejected_logs_items_local_var) {
        return NULL;
    }
    memset(integration_logs_invalid_log_response_rejected_logs_items_local_var, 0, sizeof(integration_logs_invalid_log_response_rejected_logs_items_t));
    integration_logs_invalid_log_response_rejected_logs_items_local_var->_library_owned = 1;
    integration_logs_invalid_log_response_rejected_logs_items_local_var->field = field;
    integration_logs_invalid_log_response_rejected_logs_items_local_var->log_index = log_index;
    integration_logs_invalid_log_response_rejected_logs_items_local_var->reason = reason;
    integration_logs_invalid_log_response_rejected_logs_items_local_var->value = value;
    return integration_logs_invalid_log_response_rejected_logs_items_local_var;
}

__attribute__((deprecated)) integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items_create(
    char *field,
    int *log_index,
    char *reason,
    char *value
    ) {
    int *log_index_copy = NULL;
    if (log_index) {
        log_index_copy = malloc(sizeof(int));
        if (log_index_copy) *log_index_copy = *log_index;
    }
    integration_logs_invalid_log_response_rejected_logs_items_t *result = integration_logs_invalid_log_response_rejected_logs_items_create_internal (
        field,
        log_index_copy,
        reason,
        value
        );
    if (!result) {
        free(log_index_copy);
    }
    return result;
}

void integration_logs_invalid_log_response_rejected_logs_items_free(integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items) {
    if(NULL == integration_logs_invalid_log_response_rejected_logs_items){
        return ;
    }
    if(integration_logs_invalid_log_response_rejected_logs_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_logs_invalid_log_response_rejected_logs_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_logs_invalid_log_response_rejected_logs_items->field) {
        free(integration_logs_invalid_log_response_rejected_logs_items->field);
        integration_logs_invalid_log_response_rejected_logs_items->field = NULL;
    }
    if (integration_logs_invalid_log_response_rejected_logs_items->log_index) {
        free(integration_logs_invalid_log_response_rejected_logs_items->log_index);
        integration_logs_invalid_log_response_rejected_logs_items->log_index = NULL;
    }
    if (integration_logs_invalid_log_response_rejected_logs_items->reason) {
        free(integration_logs_invalid_log_response_rejected_logs_items->reason);
        integration_logs_invalid_log_response_rejected_logs_items->reason = NULL;
    }
    if (integration_logs_invalid_log_response_rejected_logs_items->value) {
        free(integration_logs_invalid_log_response_rejected_logs_items->value);
        integration_logs_invalid_log_response_rejected_logs_items->value = NULL;
    }
    free(integration_logs_invalid_log_response_rejected_logs_items);
}

cJSON *integration_logs_invalid_log_response_rejected_logs_items_convertToJSON(integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items) {
    cJSON *item = cJSON_CreateObject();

    // integration_logs_invalid_log_response_rejected_logs_items->field
    if (!integration_logs_invalid_log_response_rejected_logs_items->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", integration_logs_invalid_log_response_rejected_logs_items->field) == NULL) {
    goto fail; //String
    }


    // integration_logs_invalid_log_response_rejected_logs_items->log_index
    if(integration_logs_invalid_log_response_rejected_logs_items->log_index) {
    if(cJSON_AddNumberToObject(item, "log_index", *integration_logs_invalid_log_response_rejected_logs_items->log_index) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_logs_invalid_log_response_rejected_logs_items->reason
    if (!integration_logs_invalid_log_response_rejected_logs_items->reason) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "reason", integration_logs_invalid_log_response_rejected_logs_items->reason) == NULL) {
    goto fail; //String
    }


    // integration_logs_invalid_log_response_rejected_logs_items->value
    if (!integration_logs_invalid_log_response_rejected_logs_items->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", integration_logs_invalid_log_response_rejected_logs_items->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items_parseFromJSON(cJSON *integration_logs_invalid_log_response_rejected_logs_itemsJSON){

    integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items_local_var = NULL;

    char *field_local_str = NULL;

    // define the local variable for integration_logs_invalid_log_response_rejected_logs_items->log_index
    int *log_index_local_var = NULL;

    char *reason_local_str = NULL;

    char *value_local_str = NULL;

    // integration_logs_invalid_log_response_rejected_logs_items->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_itemsJSON, "field");
    if (cJSON_IsNull(field)) {
        field = NULL;
    }
    if (!field) {
        goto end;
    }

    
    if(!cJSON_IsString(field))
    {
    goto end; //String
    }

    // integration_logs_invalid_log_response_rejected_logs_items->log_index
    cJSON *log_index = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_itemsJSON, "log_index");
    if (cJSON_IsNull(log_index)) {
        log_index = NULL;
    }
    if (log_index) { 
    if(!cJSON_IsNumber(log_index))
    {
    goto end; //Numeric
    }
    log_index_local_var = malloc(sizeof(int));
    if(!log_index_local_var)
    {
        goto end;
    }
    *log_index_local_var = log_index->valuedouble;
    }

    // integration_logs_invalid_log_response_rejected_logs_items->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_itemsJSON, "reason");
    if (cJSON_IsNull(reason)) {
        reason = NULL;
    }
    if (!reason) {
        goto end;
    }

    
    if(!cJSON_IsString(reason))
    {
    goto end; //String
    }

    // integration_logs_invalid_log_response_rejected_logs_items->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_itemsJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }


    if (field && !cJSON_IsNull(field)) field_local_str = strdup(field->valuestring);
    if (reason && !cJSON_IsNull(reason)) reason_local_str = strdup(reason->valuestring);
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    integration_logs_invalid_log_response_rejected_logs_items_local_var = integration_logs_invalid_log_response_rejected_logs_items_create_internal (
        field_local_str,
        log_index_local_var,
        reason_local_str,
        value_local_str
        );

    if (!integration_logs_invalid_log_response_rejected_logs_items_local_var) {
        goto end;
    }

    return integration_logs_invalid_log_response_rejected_logs_items_local_var;
end:
    if (field_local_str) {
        free(field_local_str);
        field_local_str = NULL;
    }
    if (log_index_local_var) {
        free(log_index_local_var);
        log_index_local_var = NULL;
    }
    if (reason_local_str) {
        free(reason_local_str);
        reason_local_str = NULL;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}
