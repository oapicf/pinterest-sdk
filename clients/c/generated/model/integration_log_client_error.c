#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_log_client_error.h"



integration_log_client_error_t *integration_log_client_error_create(
    char *cause,
    int column_number,
    char *file_name,
    int line_number,
    char *message,
    char *message_detail,
    char *name,
    int number,
    char *stack_trace
    ) {
    integration_log_client_error_t *integration_log_client_error_local_var = malloc(sizeof(integration_log_client_error_t));
    if (!integration_log_client_error_local_var) {
        return NULL;
    }
    integration_log_client_error_local_var->cause = cause;
    integration_log_client_error_local_var->column_number = column_number;
    integration_log_client_error_local_var->file_name = file_name;
    integration_log_client_error_local_var->line_number = line_number;
    integration_log_client_error_local_var->message = message;
    integration_log_client_error_local_var->message_detail = message_detail;
    integration_log_client_error_local_var->name = name;
    integration_log_client_error_local_var->number = number;
    integration_log_client_error_local_var->stack_trace = stack_trace;

    return integration_log_client_error_local_var;
}


void integration_log_client_error_free(integration_log_client_error_t *integration_log_client_error) {
    if(NULL == integration_log_client_error){
        return ;
    }
    listEntry_t *listEntry;
    if (integration_log_client_error->cause) {
        free(integration_log_client_error->cause);
        integration_log_client_error->cause = NULL;
    }
    if (integration_log_client_error->file_name) {
        free(integration_log_client_error->file_name);
        integration_log_client_error->file_name = NULL;
    }
    if (integration_log_client_error->message) {
        free(integration_log_client_error->message);
        integration_log_client_error->message = NULL;
    }
    if (integration_log_client_error->message_detail) {
        free(integration_log_client_error->message_detail);
        integration_log_client_error->message_detail = NULL;
    }
    if (integration_log_client_error->name) {
        free(integration_log_client_error->name);
        integration_log_client_error->name = NULL;
    }
    if (integration_log_client_error->stack_trace) {
        free(integration_log_client_error->stack_trace);
        integration_log_client_error->stack_trace = NULL;
    }
    free(integration_log_client_error);
}

cJSON *integration_log_client_error_convertToJSON(integration_log_client_error_t *integration_log_client_error) {
    cJSON *item = cJSON_CreateObject();

    // integration_log_client_error->cause
    if(integration_log_client_error->cause) {
    if(cJSON_AddStringToObject(item, "cause", integration_log_client_error->cause) == NULL) {
    goto fail; //String
    }
    }


    // integration_log_client_error->column_number
    if(integration_log_client_error->column_number) {
    if(cJSON_AddNumberToObject(item, "column_number", integration_log_client_error->column_number) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_log_client_error->file_name
    if(integration_log_client_error->file_name) {
    if(cJSON_AddStringToObject(item, "file_name", integration_log_client_error->file_name) == NULL) {
    goto fail; //String
    }
    }


    // integration_log_client_error->line_number
    if(integration_log_client_error->line_number) {
    if(cJSON_AddNumberToObject(item, "line_number", integration_log_client_error->line_number) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_log_client_error->message
    if(integration_log_client_error->message) {
    if(cJSON_AddStringToObject(item, "message", integration_log_client_error->message) == NULL) {
    goto fail; //String
    }
    }


    // integration_log_client_error->message_detail
    if(integration_log_client_error->message_detail) {
    if(cJSON_AddStringToObject(item, "message_detail", integration_log_client_error->message_detail) == NULL) {
    goto fail; //String
    }
    }


    // integration_log_client_error->name
    if(integration_log_client_error->name) {
    if(cJSON_AddStringToObject(item, "name", integration_log_client_error->name) == NULL) {
    goto fail; //String
    }
    }


    // integration_log_client_error->number
    if(integration_log_client_error->number) {
    if(cJSON_AddNumberToObject(item, "number", integration_log_client_error->number) == NULL) {
    goto fail; //Numeric
    }
    }


    // integration_log_client_error->stack_trace
    if(integration_log_client_error->stack_trace) {
    if(cJSON_AddStringToObject(item, "stack_trace", integration_log_client_error->stack_trace) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

integration_log_client_error_t *integration_log_client_error_parseFromJSON(cJSON *integration_log_client_errorJSON){

    integration_log_client_error_t *integration_log_client_error_local_var = NULL;

    // integration_log_client_error->cause
    cJSON *cause = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "cause");
    if (cause) { 
    if(!cJSON_IsString(cause) && !cJSON_IsNull(cause))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->column_number
    cJSON *column_number = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "column_number");
    if (column_number) { 
    if(!cJSON_IsNumber(column_number))
    {
    goto end; //Numeric
    }
    }

    // integration_log_client_error->file_name
    cJSON *file_name = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "file_name");
    if (file_name) { 
    if(!cJSON_IsString(file_name) && !cJSON_IsNull(file_name))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->line_number
    cJSON *line_number = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "line_number");
    if (line_number) { 
    if(!cJSON_IsNumber(line_number))
    {
    goto end; //Numeric
    }
    }

    // integration_log_client_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->message_detail
    cJSON *message_detail = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "message_detail");
    if (message_detail) { 
    if(!cJSON_IsString(message_detail) && !cJSON_IsNull(message_detail))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->number
    cJSON *number = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "number");
    if (number) { 
    if(!cJSON_IsNumber(number))
    {
    goto end; //Numeric
    }
    }

    // integration_log_client_error->stack_trace
    cJSON *stack_trace = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "stack_trace");
    if (stack_trace) { 
    if(!cJSON_IsString(stack_trace) && !cJSON_IsNull(stack_trace))
    {
    goto end; //String
    }
    }


    integration_log_client_error_local_var = integration_log_client_error_create (
        cause && !cJSON_IsNull(cause) ? strdup(cause->valuestring) : NULL,
        column_number ? column_number->valuedouble : 0,
        file_name && !cJSON_IsNull(file_name) ? strdup(file_name->valuestring) : NULL,
        line_number ? line_number->valuedouble : 0,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        message_detail && !cJSON_IsNull(message_detail) ? strdup(message_detail->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        number ? number->valuedouble : 0,
        stack_trace && !cJSON_IsNull(stack_trace) ? strdup(stack_trace->valuestring) : NULL
        );

    return integration_log_client_error_local_var;
end:
    return NULL;

}
