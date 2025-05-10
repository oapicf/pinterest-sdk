#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "error.h"



static error_t *error_create_internal(
    int code,
    char *message
    ) {
    error_t *error_local_var = malloc(sizeof(error_t));
    if (!error_local_var) {
        return NULL;
    }
    error_local_var->code = code;
    error_local_var->message = message;

    error_local_var->_library_owned = 1;
    return error_local_var;
}

__attribute__((deprecated)) error_t *error_create(
    int code,
    char *message
    ) {
    return error_create_internal (
        code,
        message
        );
}

void error_free(error_t *error) {
    if(NULL == error){
        return ;
    }
    if(error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (error->message) {
        free(error->message);
        error->message = NULL;
    }
    free(error);
}

cJSON *error_convertToJSON(error_t *error) {
    cJSON *item = cJSON_CreateObject();

    // error->code
    if (!error->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", error->code) == NULL) {
    goto fail; //Numeric
    }


    // error->message
    if (!error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", error->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

error_t *error_parseFromJSON(cJSON *errorJSON){

    error_t *error_local_var = NULL;

    // error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }

    // error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(errorJSON, "message");
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


    error_local_var = error_create_internal (
        code->valuedouble,
        strdup(message->valuestring)
        );

    return error_local_var;
end:
    return NULL;

}
