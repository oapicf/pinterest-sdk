#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_logs_invalid_log_response_rejected_logs_inner.h"



integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_create(
    int log_index,
    char *field,
    char *value,
    char *reason
    ) {
    integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_local_var = malloc(sizeof(integration_logs_invalid_log_response_rejected_logs_inner_t));
    if (!integration_logs_invalid_log_response_rejected_logs_inner_local_var) {
        return NULL;
    }
    integration_logs_invalid_log_response_rejected_logs_inner_local_var->log_index = log_index;
    integration_logs_invalid_log_response_rejected_logs_inner_local_var->field = field;
    integration_logs_invalid_log_response_rejected_logs_inner_local_var->value = value;
    integration_logs_invalid_log_response_rejected_logs_inner_local_var->reason = reason;

    return integration_logs_invalid_log_response_rejected_logs_inner_local_var;
}


void integration_logs_invalid_log_response_rejected_logs_inner_free(integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner) {
    if(NULL == integration_logs_invalid_log_response_rejected_logs_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (integration_logs_invalid_log_response_rejected_logs_inner->field) {
        free(integration_logs_invalid_log_response_rejected_logs_inner->field);
        integration_logs_invalid_log_response_rejected_logs_inner->field = NULL;
    }
    if (integration_logs_invalid_log_response_rejected_logs_inner->value) {
        free(integration_logs_invalid_log_response_rejected_logs_inner->value);
        integration_logs_invalid_log_response_rejected_logs_inner->value = NULL;
    }
    if (integration_logs_invalid_log_response_rejected_logs_inner->reason) {
        free(integration_logs_invalid_log_response_rejected_logs_inner->reason);
        integration_logs_invalid_log_response_rejected_logs_inner->reason = NULL;
    }
    free(integration_logs_invalid_log_response_rejected_logs_inner);
}

cJSON *integration_logs_invalid_log_response_rejected_logs_inner_convertToJSON(integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner) {
    cJSON *item = cJSON_CreateObject();

    // integration_logs_invalid_log_response_rejected_logs_inner->log_index
    if(integration_logs_invalid_log_response_rejected_logs_inner->log_index) {
    if(cJSON_AddNumberToObject(item, "log_index", integration_logs_invalid_log_response_rejected_logs_inner->log_index) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_logs_invalid_log_response_rejected_logs_inner->field
    if (!integration_logs_invalid_log_response_rejected_logs_inner->field) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "field", integration_logs_invalid_log_response_rejected_logs_inner->field) == NULL) {
    goto fail; //String
    }


    // integration_logs_invalid_log_response_rejected_logs_inner->value
    if (!integration_logs_invalid_log_response_rejected_logs_inner->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", integration_logs_invalid_log_response_rejected_logs_inner->value) == NULL) {
    goto fail; //String
    }


    // integration_logs_invalid_log_response_rejected_logs_inner->reason
    if (!integration_logs_invalid_log_response_rejected_logs_inner->reason) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "reason", integration_logs_invalid_log_response_rejected_logs_inner->reason) == NULL) {
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

    // integration_logs_invalid_log_response_rejected_logs_inner->log_index
    cJSON *log_index = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_innerJSON, "log_index");
    if (log_index) { 
    if(!cJSON_IsNumber(log_index))
    {
    goto end; //Numeric
    }
    }

    // integration_logs_invalid_log_response_rejected_logs_inner->field
    cJSON *field = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_innerJSON, "field");
    if (!field) {
        goto end;
    }

    
    if(!cJSON_IsString(field))
    {
    goto end; //String
    }

    // integration_logs_invalid_log_response_rejected_logs_inner->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_innerJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }

    // integration_logs_invalid_log_response_rejected_logs_inner->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_response_rejected_logs_innerJSON, "reason");
    if (!reason) {
        goto end;
    }

    
    if(!cJSON_IsString(reason))
    {
    goto end; //String
    }


    integration_logs_invalid_log_response_rejected_logs_inner_local_var = integration_logs_invalid_log_response_rejected_logs_inner_create (
        log_index ? log_index->valuedouble : 0,
        strdup(field->valuestring),
        strdup(value->valuestring),
        strdup(reason->valuestring)
        );

    return integration_logs_invalid_log_response_rejected_logs_inner_local_var;
end:
    return NULL;

}
