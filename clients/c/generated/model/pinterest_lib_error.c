#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pinterest_lib_error.h"



static pinterest_lib_error_t *pinterest_lib_error_create_internal(
    int code,
    char *message
    ) {
    pinterest_lib_error_t *pinterest_lib_error_local_var = malloc(sizeof(pinterest_lib_error_t));
    if (!pinterest_lib_error_local_var) {
        return NULL;
    }
    pinterest_lib_error_local_var->code = code;
    pinterest_lib_error_local_var->message = message;

    pinterest_lib_error_local_var->_library_owned = 1;
    return pinterest_lib_error_local_var;
}

__attribute__((deprecated)) pinterest_lib_error_t *pinterest_lib_error_create(
    int code,
    char *message
    ) {
    return pinterest_lib_error_create_internal (
        code,
        message
        );
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
    if(cJSON_AddNumberToObject(item, "code", pinterest_lib_error->code) == NULL) {
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


    pinterest_lib_error_local_var = pinterest_lib_error_create_internal (
        code->valuedouble,
        strdup(message->valuestring)
        );

    return pinterest_lib_error_local_var;
end:
    return NULL;

}
