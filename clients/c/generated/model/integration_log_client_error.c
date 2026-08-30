#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_log_client_error.h"



static integration_log_client_error_t *integration_log_client_error_create_internal(
    char *cause,
    int *column_number,
    char *file_name,
    int *line_number,
    char *message,
    char *message_detail,
    char *name,
    int *number,
    char *stack_trace
    ) {
    integration_log_client_error_t *integration_log_client_error_local_var = malloc(sizeof(integration_log_client_error_t));
    if (!integration_log_client_error_local_var) {
        return NULL;
    }
    memset(integration_log_client_error_local_var, 0, sizeof(integration_log_client_error_t));
    integration_log_client_error_local_var->_library_owned = 1;
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

__attribute__((deprecated)) integration_log_client_error_t *integration_log_client_error_create(
    char *cause,
    int *column_number,
    char *file_name,
    int *line_number,
    char *message,
    char *message_detail,
    char *name,
    int *number,
    char *stack_trace
    ) {
    int *column_number_copy = NULL;
    if (column_number) {
        column_number_copy = malloc(sizeof(int));
        if (column_number_copy) *column_number_copy = *column_number;
    }
    int *line_number_copy = NULL;
    if (line_number) {
        line_number_copy = malloc(sizeof(int));
        if (line_number_copy) *line_number_copy = *line_number;
    }
    int *number_copy = NULL;
    if (number) {
        number_copy = malloc(sizeof(int));
        if (number_copy) *number_copy = *number;
    }
    integration_log_client_error_t *result = integration_log_client_error_create_internal (
        cause,
        column_number_copy,
        file_name,
        line_number_copy,
        message,
        message_detail,
        name,
        number_copy,
        stack_trace
        );
    if (!result) {
        free(column_number_copy);
        free(line_number_copy);
        free(number_copy);
    }
    return result;
}

void integration_log_client_error_free(integration_log_client_error_t *integration_log_client_error) {
    if(NULL == integration_log_client_error){
        return ;
    }
    if(integration_log_client_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_log_client_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_log_client_error->cause) {
        free(integration_log_client_error->cause);
        integration_log_client_error->cause = NULL;
    }
    if (integration_log_client_error->column_number) {
        free(integration_log_client_error->column_number);
        integration_log_client_error->column_number = NULL;
    }
    if (integration_log_client_error->file_name) {
        free(integration_log_client_error->file_name);
        integration_log_client_error->file_name = NULL;
    }
    if (integration_log_client_error->line_number) {
        free(integration_log_client_error->line_number);
        integration_log_client_error->line_number = NULL;
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
    if (integration_log_client_error->number) {
        free(integration_log_client_error->number);
        integration_log_client_error->number = NULL;
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
    if(cJSON_AddNumberToObject(item, "column_number", *integration_log_client_error->column_number) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "line_number", *integration_log_client_error->line_number) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "number", *integration_log_client_error->number) == NULL) {
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

    char *cause_local_str = NULL;

    // define the local variable for integration_log_client_error->column_number
    int *column_number_local_var = NULL;

    char *file_name_local_str = NULL;

    // define the local variable for integration_log_client_error->line_number
    int *line_number_local_var = NULL;

    char *message_local_str = NULL;

    char *message_detail_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for integration_log_client_error->number
    int *number_local_var = NULL;

    char *stack_trace_local_str = NULL;

    // integration_log_client_error->cause
    cJSON *cause = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "cause");
    if (cJSON_IsNull(cause)) {
        cause = NULL;
    }
    if (cause) { 
    if(!cJSON_IsString(cause) && !cJSON_IsNull(cause))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->column_number
    cJSON *column_number = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "column_number");
    if (cJSON_IsNull(column_number)) {
        column_number = NULL;
    }
    if (column_number) { 
    if(!cJSON_IsNumber(column_number))
    {
    goto end; //Numeric
    }
    column_number_local_var = malloc(sizeof(int));
    if(!column_number_local_var)
    {
        goto end;
    }
    *column_number_local_var = column_number->valuedouble;
    }

    // integration_log_client_error->file_name
    cJSON *file_name = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "file_name");
    if (cJSON_IsNull(file_name)) {
        file_name = NULL;
    }
    if (file_name) { 
    if(!cJSON_IsString(file_name) && !cJSON_IsNull(file_name))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->line_number
    cJSON *line_number = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "line_number");
    if (cJSON_IsNull(line_number)) {
        line_number = NULL;
    }
    if (line_number) { 
    if(!cJSON_IsNumber(line_number))
    {
    goto end; //Numeric
    }
    line_number_local_var = malloc(sizeof(int));
    if(!line_number_local_var)
    {
        goto end;
    }
    *line_number_local_var = line_number->valuedouble;
    }

    // integration_log_client_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->message_detail
    cJSON *message_detail = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "message_detail");
    if (cJSON_IsNull(message_detail)) {
        message_detail = NULL;
    }
    if (message_detail) { 
    if(!cJSON_IsString(message_detail) && !cJSON_IsNull(message_detail))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // integration_log_client_error->number
    cJSON *number = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "number");
    if (cJSON_IsNull(number)) {
        number = NULL;
    }
    if (number) { 
    if(!cJSON_IsNumber(number))
    {
    goto end; //Numeric
    }
    number_local_var = malloc(sizeof(int));
    if(!number_local_var)
    {
        goto end;
    }
    *number_local_var = number->valuedouble;
    }

    // integration_log_client_error->stack_trace
    cJSON *stack_trace = cJSON_GetObjectItemCaseSensitive(integration_log_client_errorJSON, "stack_trace");
    if (cJSON_IsNull(stack_trace)) {
        stack_trace = NULL;
    }
    if (stack_trace) { 
    if(!cJSON_IsString(stack_trace) && !cJSON_IsNull(stack_trace))
    {
    goto end; //String
    }
    }


    if (cause && !cJSON_IsNull(cause)) cause_local_str = strdup(cause->valuestring);
    if (file_name && !cJSON_IsNull(file_name)) file_name_local_str = strdup(file_name->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);
    if (message_detail && !cJSON_IsNull(message_detail)) message_detail_local_str = strdup(message_detail->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (stack_trace && !cJSON_IsNull(stack_trace)) stack_trace_local_str = strdup(stack_trace->valuestring);

    integration_log_client_error_local_var = integration_log_client_error_create_internal (
        cause_local_str,
        column_number_local_var,
        file_name_local_str,
        line_number_local_var,
        message_local_str,
        message_detail_local_str,
        name_local_str,
        number_local_var,
        stack_trace_local_str
        );

    if (!integration_log_client_error_local_var) {
        goto end;
    }

    return integration_log_client_error_local_var;
end:
    if (cause_local_str) {
        free(cause_local_str);
        cause_local_str = NULL;
    }
    if (column_number_local_var) {
        free(column_number_local_var);
        column_number_local_var = NULL;
    }
    if (file_name_local_str) {
        free(file_name_local_str);
        file_name_local_str = NULL;
    }
    if (line_number_local_var) {
        free(line_number_local_var);
        line_number_local_var = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    if (message_detail_local_str) {
        free(message_detail_local_str);
        message_detail_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (number_local_var) {
        free(number_local_var);
        number_local_var = NULL;
    }
    if (stack_trace_local_str) {
        free(stack_trace_local_str);
        stack_trace_local_str = NULL;
    }
    return NULL;

}
