#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pinterest_lib_error.h"



static pinterest_lib_error_t *pinterest_lib_error_create_internal(
    int *code,
    char *message
    ) {
    pinterest_lib_error_t *pinterest_lib_error_local_var = malloc(sizeof(pinterest_lib_error_t));
    if (!pinterest_lib_error_local_var) {
        return NULL;
    }
    memset(pinterest_lib_error_local_var, 0, sizeof(pinterest_lib_error_t));
    pinterest_lib_error_local_var->_library_owned = 1;
    pinterest_lib_error_local_var->code = code;
    pinterest_lib_error_local_var->message = message;
    return pinterest_lib_error_local_var;
}

__attribute__((deprecated)) pinterest_lib_error_t *pinterest_lib_error_create(
    int *code,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    pinterest_lib_error_t *result = pinterest_lib_error_create_internal (
        code_copy,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void pinterest_lib_error_free(pinterest_lib_error_t *pinterest_lib_error) {
    if(NULL == pinterest_lib_error){
        return ;
    }
    if(pinterest_lib_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pinterest_lib_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pinterest_lib_error->code) {
        free(pinterest_lib_error->code);
        pinterest_lib_error->code = NULL;
    }
    if (pinterest_lib_error->message) {
        free(pinterest_lib_error->message);
        pinterest_lib_error->message = NULL;
    }
    free(pinterest_lib_error);
}

cJSON *pinterest_lib_error_convertToJSON(pinterest_lib_error_t *pinterest_lib_error) {
    cJSON *item = cJSON_CreateObject();

    // pinterest_lib_error->code
    if (!pinterest_lib_error->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", *pinterest_lib_error->code) == NULL) {
    goto fail; //Numeric
    }


    // pinterest_lib_error->message
    if (!pinterest_lib_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", pinterest_lib_error->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pinterest_lib_error_t *pinterest_lib_error_parseFromJSON(cJSON *pinterest_lib_errorJSON){

    pinterest_lib_error_t *pinterest_lib_error_local_var = NULL;

    // define the local variable for pinterest_lib_error->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

    // pinterest_lib_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(pinterest_lib_errorJSON, "code");
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
    code_local_var = malloc(sizeof(int));
    if(!code_local_var)
    {
        goto end;
    }
    *code_local_var = code->valuedouble;

    // pinterest_lib_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(pinterest_lib_errorJSON, "message");
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

    pinterest_lib_error_local_var = pinterest_lib_error_create_internal (
        code_local_var,
        message_local_str
        );

    if (!pinterest_lib_error_local_var) {
        goto end;
    }

    return pinterest_lib_error_local_var;
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
