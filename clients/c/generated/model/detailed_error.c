#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "detailed_error.h"



static detailed_error_t *detailed_error_create_internal(
    int *code,
    object_t *details,
    char *message
    ) {
    detailed_error_t *detailed_error_local_var = malloc(sizeof(detailed_error_t));
    if (!detailed_error_local_var) {
        return NULL;
    }
    memset(detailed_error_local_var, 0, sizeof(detailed_error_t));
    detailed_error_local_var->_library_owned = 1;
    detailed_error_local_var->code = code;
    detailed_error_local_var->details = details;
    detailed_error_local_var->message = message;
    return detailed_error_local_var;
}

__attribute__((deprecated)) detailed_error_t *detailed_error_create(
    int *code,
    object_t *details,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    detailed_error_t *result = detailed_error_create_internal (
        code_copy,
        details,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void detailed_error_free(detailed_error_t *detailed_error) {
    if(NULL == detailed_error){
        return ;
    }
    if(detailed_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "detailed_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (detailed_error->code) {
        free(detailed_error->code);
        detailed_error->code = NULL;
    }
    if (detailed_error->details) {
        object_free(detailed_error->details);
        detailed_error->details = NULL;
    }
    if (detailed_error->message) {
        free(detailed_error->message);
        detailed_error->message = NULL;
    }
    free(detailed_error);
}

cJSON *detailed_error_convertToJSON(detailed_error_t *detailed_error) {
    cJSON *item = cJSON_CreateObject();

    // detailed_error->code
    if (!detailed_error->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", *detailed_error->code) == NULL) {
    goto fail; //Numeric
    }


    // detailed_error->details
    if (!detailed_error->details) {
        goto fail;
    }
    cJSON *details_object = object_convertToJSON(detailed_error->details);
    if(details_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "details", details_object);
    if(item->child == NULL) {
    goto fail;
    }


    // detailed_error->message
    if (!detailed_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", detailed_error->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

detailed_error_t *detailed_error_parseFromJSON(cJSON *detailed_errorJSON){

    detailed_error_t *detailed_error_local_var = NULL;

    // define the local variable for detailed_error->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

    // detailed_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(detailed_errorJSON, "code");
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

    // detailed_error->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(detailed_errorJSON, "details");
    if (cJSON_IsNull(details)) {
        details = NULL;
    }
    if (!details) {
        goto end;
    }

    object_t *details_local_object = NULL;
    
    details_local_object = object_parseFromJSON(details); //object

    // detailed_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(detailed_errorJSON, "message");
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

    detailed_error_local_var = detailed_error_create_internal (
        code_local_var,
        details_local_object,
        message_local_str
        );

    if (!detailed_error_local_var) {
        goto end;
    }

    return detailed_error_local_var;
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
