#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "exception.h"



static exception_t *exception_create_internal(
    int *code,
    char *message
    ) {
    exception_t *exception_local_var = malloc(sizeof(exception_t));
    if (!exception_local_var) {
        return NULL;
    }
    memset(exception_local_var, 0, sizeof(exception_t));
    exception_local_var->_library_owned = 1;
    exception_local_var->code = code;
    exception_local_var->message = message;
    return exception_local_var;
}

__attribute__((deprecated)) exception_t *exception_create(
    int *code,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    exception_t *result = exception_create_internal (
        code_copy,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void exception_free(exception_t *exception) {
    if(NULL == exception){
        return ;
    }
    if(exception->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "exception_free");
        return ;
    }
    listEntry_t *listEntry;
    if (exception->code) {
        free(exception->code);
        exception->code = NULL;
    }
    if (exception->message) {
        free(exception->message);
        exception->message = NULL;
    }
    free(exception);
}

cJSON *exception_convertToJSON(exception_t *exception) {
    cJSON *item = cJSON_CreateObject();

    // exception->code
    if(exception->code) {
    if(cJSON_AddNumberToObject(item, "code", *exception->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // exception->message
    if (!exception->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", exception->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

exception_t *exception_parseFromJSON(cJSON *exceptionJSON){

    exception_t *exception_local_var = NULL;

    // define the local variable for exception->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

    // exception->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(exceptionJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    code_local_var = malloc(sizeof(int));
    if(!code_local_var)
    {
        goto end;
    }
    *code_local_var = code->valuedouble;
    }

    // exception->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(exceptionJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    exception_local_var = exception_create_internal (
        code_local_var,
        message_local_str
        );

    if (!exception_local_var) {
        goto end;
    }

    return exception_local_var;
end:
    if (code_local_var) {
        free(code_local_var);
        code_local_var = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
