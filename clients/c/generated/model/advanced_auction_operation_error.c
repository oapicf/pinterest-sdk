#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_operation_error.h"



static advanced_auction_operation_error_t *advanced_auction_operation_error_create_internal(
    int *code,
    char *message
    ) {
    advanced_auction_operation_error_t *advanced_auction_operation_error_local_var = malloc(sizeof(advanced_auction_operation_error_t));
    if (!advanced_auction_operation_error_local_var) {
        return NULL;
    }
    memset(advanced_auction_operation_error_local_var, 0, sizeof(advanced_auction_operation_error_t));
    advanced_auction_operation_error_local_var->_library_owned = 1;
    advanced_auction_operation_error_local_var->code = code;
    advanced_auction_operation_error_local_var->message = message;
    return advanced_auction_operation_error_local_var;
}

__attribute__((deprecated)) advanced_auction_operation_error_t *advanced_auction_operation_error_create(
    int *code,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    advanced_auction_operation_error_t *result = advanced_auction_operation_error_create_internal (
        code_copy,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void advanced_auction_operation_error_free(advanced_auction_operation_error_t *advanced_auction_operation_error) {
    if(NULL == advanced_auction_operation_error){
        return ;
    }
    if(advanced_auction_operation_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advanced_auction_operation_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_operation_error->code) {
        free(advanced_auction_operation_error->code);
        advanced_auction_operation_error->code = NULL;
    }
    if (advanced_auction_operation_error->message) {
        free(advanced_auction_operation_error->message);
        advanced_auction_operation_error->message = NULL;
    }
    free(advanced_auction_operation_error);
}

cJSON *advanced_auction_operation_error_convertToJSON(advanced_auction_operation_error_t *advanced_auction_operation_error) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_operation_error->code
    if(advanced_auction_operation_error->code) {
    if(cJSON_AddNumberToObject(item, "code", *advanced_auction_operation_error->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // advanced_auction_operation_error->message
    if(advanced_auction_operation_error->message) {
    if(cJSON_AddStringToObject(item, "message", advanced_auction_operation_error->message) == NULL) {
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

advanced_auction_operation_error_t *advanced_auction_operation_error_parseFromJSON(cJSON *advanced_auction_operation_errorJSON){

    advanced_auction_operation_error_t *advanced_auction_operation_error_local_var = NULL;

    // define the local variable for advanced_auction_operation_error->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

    // advanced_auction_operation_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(advanced_auction_operation_errorJSON, "code");
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

    // advanced_auction_operation_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(advanced_auction_operation_errorJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    advanced_auction_operation_error_local_var = advanced_auction_operation_error_create_internal (
        code_local_var,
        message_local_str
        );

    if (!advanced_auction_operation_error_local_var) {
        goto end;
    }

    return advanced_auction_operation_error_local_var;
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
