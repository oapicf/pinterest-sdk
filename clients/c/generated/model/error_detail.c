#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "error_detail.h"



static error_detail_t *error_detail_create_internal(
    int *count,
    int *error_code,
    char *message
    ) {
    error_detail_t *error_detail_local_var = malloc(sizeof(error_detail_t));
    if (!error_detail_local_var) {
        return NULL;
    }
    memset(error_detail_local_var, 0, sizeof(error_detail_t));
    error_detail_local_var->_library_owned = 1;
    error_detail_local_var->count = count;
    error_detail_local_var->error_code = error_code;
    error_detail_local_var->message = message;
    return error_detail_local_var;
}

__attribute__((deprecated)) error_detail_t *error_detail_create(
    int *count,
    int *error_code,
    char *message
    ) {
    int *count_copy = NULL;
    if (count) {
        count_copy = malloc(sizeof(int));
        if (count_copy) *count_copy = *count;
    }
    int *error_code_copy = NULL;
    if (error_code) {
        error_code_copy = malloc(sizeof(int));
        if (error_code_copy) *error_code_copy = *error_code;
    }
    error_detail_t *result = error_detail_create_internal (
        count_copy,
        error_code_copy,
        message
        );
    if (!result) {
        free(count_copy);
        free(error_code_copy);
    }
    return result;
}

void error_detail_free(error_detail_t *error_detail) {
    if(NULL == error_detail){
        return ;
    }
    if(error_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "error_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (error_detail->count) {
        free(error_detail->count);
        error_detail->count = NULL;
    }
    if (error_detail->error_code) {
        free(error_detail->error_code);
        error_detail->error_code = NULL;
    }
    if (error_detail->message) {
        free(error_detail->message);
        error_detail->message = NULL;
    }
    free(error_detail);
}

cJSON *error_detail_convertToJSON(error_detail_t *error_detail) {
    cJSON *item = cJSON_CreateObject();

    // error_detail->count
    if (!error_detail->count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "count", *error_detail->count) == NULL) {
    goto fail; //Numeric
    }


    // error_detail->error_code
    if (!error_detail->error_code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "error_code", *error_detail->error_code) == NULL) {
    goto fail; //Numeric
    }


    // error_detail->message
    if (!error_detail->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", error_detail->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

error_detail_t *error_detail_parseFromJSON(cJSON *error_detailJSON){

    error_detail_t *error_detail_local_var = NULL;

    // define the local variable for error_detail->count
    int *count_local_var = NULL;

    // define the local variable for error_detail->error_code
    int *error_code_local_var = NULL;

    char *message_local_str = NULL;

    // error_detail->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(error_detailJSON, "count");
    if (cJSON_IsNull(count)) {
        count = NULL;
    }
    if (!count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }
    count_local_var = malloc(sizeof(int));
    if(!count_local_var)
    {
        goto end;
    }
    *count_local_var = count->valuedouble;

    // error_detail->error_code
    cJSON *error_code = cJSON_GetObjectItemCaseSensitive(error_detailJSON, "error_code");
    if (cJSON_IsNull(error_code)) {
        error_code = NULL;
    }
    if (!error_code) {
        goto end;
    }

    
    if(!cJSON_IsNumber(error_code))
    {
    goto end; //Numeric
    }
    error_code_local_var = malloc(sizeof(int));
    if(!error_code_local_var)
    {
        goto end;
    }
    *error_code_local_var = error_code->valuedouble;

    // error_detail->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(error_detailJSON, "message");
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

    error_detail_local_var = error_detail_create_internal (
        count_local_var,
        error_code_local_var,
        message_local_str
        );

    if (!error_detail_local_var) {
        goto end;
    }

    return error_detail_local_var;
end:
    if (count_local_var) {
        free(count_local_var);
        count_local_var = NULL;
    }
    if (error_code_local_var) {
        free(error_code_local_var);
        error_code_local_var = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
