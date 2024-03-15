#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "exception.h"



exception_t *exception_create(
    int code,
    char *message
    ) {
    exception_t *exception_local_var = malloc(sizeof(exception_t));
    if (!exception_local_var) {
        return NULL;
    }
    exception_local_var->code = code;
    exception_local_var->message = message;

    return exception_local_var;
}


void exception_free(exception_t *exception) {
    if(NULL == exception){
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
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // exception->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(exceptionJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    exception_local_var = exception_create (
        code ? code->valuedouble : 0,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return exception_local_var;
end:
    return NULL;

}
