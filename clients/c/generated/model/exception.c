#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "exception.h"



static exception_t *exception_create_internal(
    int code,
    char *message
    ) {
    exception_t *exception_local_var = malloc(sizeof(exception_t));
    if (!exception_local_var) {
        return NULL;
    }
    exception_local_var->code = code;
    exception_local_var->message = message;

    exception_local_var->_library_owned = 1;
    return exception_local_var;
}

__attribute__((deprecated)) exception_t *exception_create(
    int code,
    char *message
    ) {
    return exception_create_internal (
        code,
        message
        );
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
    if(cJSON_AddNumberToObject(item, "code", exception->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // exception->message
    if(exception->message) {
    if(cJSON_AddStringToObject(item, "message", exception->message) == NULL) {
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

exception_t *exception_parseFromJSON(cJSON *exceptionJSON){

    exception_t *exception_local_var = NULL;

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
    }

    // exception->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(exceptionJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    exception_local_var = exception_create_internal (
        code ? code->valuedouble : 0,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return exception_local_var;
end:
    return NULL;

}
