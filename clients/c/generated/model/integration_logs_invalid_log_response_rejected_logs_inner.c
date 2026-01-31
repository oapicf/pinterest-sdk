#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_logs_invalid_log_response_rejected_logs_inner.h"



static integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_create_internal(
    char *field,
    int log_index,
    char *reason,
    char *value
    ) {
    integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_local_var = malloc(sizeof(integration_logs_invalid_log_response_rejected_logs_inner_t));
    if (!integration_logs_invalid_log_response_rejected_logs_inner_local_var) {
        return NULL;
    }
    integration_logs_invalid_log_response_rejected_logs_inner_local_var->field = field;
    integration_logs_invalid_log_response_rejected_logs_inner_local_var->log_index = log_index;
    integration_logs_invalid_log_response_rejected_logs_inner_local_var->reason = reason;
    integration_logs_invalid_log_response_rejected_logs_inner_local_var->value = value;

    integration_logs_invalid_log_response_rejected_logs_inner_local_var->_library_owned = 1;
    return integration_logs_invalid_log_response_rejected_logs_inner_local_var;
}

__attribute__((deprecated)) integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_create(
    char *field,
    int log_index,
    char *reason,
    char *value
    ) {
    return integration_logs_invalid_log_response_rejected_logs_inner_create_internal (
        field,
        log_index,
        reason,
        value
        );
}

void integration_logs_invalid_log_response_rejected_logs_inner_free(integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner) {
    if(NULL == integration_logs_invalid_log_response_rejected_logs_inner){
        return ;
    }
    if(integration_logs_invalid_log_response_rejected_logs_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_logs_invalid_log_response_rejected_logs_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_logs_invalid_log_response_rejected_logs_inner->field) {
        free(integration_logs_invalid_log_response_rejected_logs_inner->field);
        integration_logs_invalid_log_response_rejected_logs_inner->field = NULL;
    }
    if (integration_logs_invalid_log_response_rejected_logs_inner->reason) {
        free(integration_logs_invalid_log_response_rejected_logs_inner->reason);
        integration_logs_invalid_log_response_rejected_logs_inner->reason = NULL;
    }
    if (integration_logs_invalid_log_response_rejected_logs_inner->value) {
        free(integration_logs_invalid_log_response_rejected_logs_inner->value);
        integration_logs_invalid_log_response_rejected_logs_inner->value = NULL;
    }
    free(integration_logs_invalid_log_response_rejected_logs_inner);
}

cJSON *integration_logs_invalid_log_response_rejected_logs_inner_convertToJSON(integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner) {
    cJSON *item = cJSON_CreateObject();

    // integration_logs_invalid_log_response_rejected_logs_inner->field
    if (!integration_logs_invalid_log_response_rejected_logs_inner->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", integration_logs_invalid_log_response_rejected_logs_inner->field) == NULL) {
    goto fail; //String
    }


    // integration_logs_invalid_log_response_rejected_logs_inner->log_index
    if(integration_logs_invalid_log_response_rejected_logs_inner->log_index) {
    if(cJSON_AddNumberToObject(item, "log_index", integration_logs_invalid_log_response_rejected_logs_inner->log_index) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_logs_invalid_log_response_rejected_logs_inner->reason
    if (!integration_logs_invalid_log_response_rejected_logs_inner->reason) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "reason", integration_logs_invalid_log_response_rejected_logs_inner->reason) == NULL) {
    goto fail; //String
    }


    // integration_logs_invalid_log_response_rejected_logs_inner->value
    if (!integration_logs_invalid_log_response_rejected_logs_inner->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", integration_logs_invalid_log_response_rejected_logs_inner->value) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_parseFromJSON(cJSON *integration_logs_invalid_log_response_rejected_logs_innerJSON){

    integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_local_var = NULL;

    // integration_logs_invalid_log_response_rejected_logs_inner->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_innerJSON, "field");
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

    // integration_logs_invalid_log_response_rejected_logs_inner->log_index
    cJSON *log_index = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_innerJSON, "log_index");
    if (cJSON_IsNull(log_index)) {
        log_index = NULL;
    }
    if (log_index) { 
    if(!cJSON_IsNumber(log_index))
    {
    goto end; //Numeric
    }
    }

    // integration_logs_invalid_log_response_rejected_logs_inner->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_innerJSON, "reason");
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

    // integration_logs_invalid_log_response_rejected_logs_inner->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_innerJSON, "value");
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


    integration_logs_invalid_log_response_rejected_logs_inner_local_var = integration_logs_invalid_log_response_rejected_logs_inner_create_internal (
        strdup(field->valuestring),
        log_index ? log_index->valuedouble : 0,
        strdup(reason->valuestring),
        strdup(value->valuestring)
        );

    return integration_logs_invalid_log_response_rejected_logs_inner_local_var;
end:
    return NULL;

}
