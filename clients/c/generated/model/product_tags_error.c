#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_tags_error.h"



static product_tags_error_t *product_tags_error_create_internal(
    int *code,
    ineligible_product_tags_error_details_t *details,
    char *message
    ) {
    product_tags_error_t *product_tags_error_local_var = malloc(sizeof(product_tags_error_t));
    if (!product_tags_error_local_var) {
        return NULL;
    }
    memset(product_tags_error_local_var, 0, sizeof(product_tags_error_t));
    product_tags_error_local_var->_library_owned = 1;
    product_tags_error_local_var->code = code;
    product_tags_error_local_var->details = details;
    product_tags_error_local_var->message = message;
    return product_tags_error_local_var;
}

__attribute__((deprecated)) product_tags_error_t *product_tags_error_create(
    int *code,
    ineligible_product_tags_error_details_t *details,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    product_tags_error_t *result = product_tags_error_create_internal (
        code_copy,
        details,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void product_tags_error_free(product_tags_error_t *product_tags_error) {
    if(NULL == product_tags_error){
        return ;
    }
    if(product_tags_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_tags_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_tags_error->code) {
        free(product_tags_error->code);
        product_tags_error->code = NULL;
    }
    if (product_tags_error->details) {
        ineligible_product_tags_error_details_free(product_tags_error->details);
        product_tags_error->details = NULL;
    }
    if (product_tags_error->message) {
        free(product_tags_error->message);
        product_tags_error->message = NULL;
    }
    free(product_tags_error);
}

cJSON *product_tags_error_convertToJSON(product_tags_error_t *product_tags_error) {
    cJSON *item = cJSON_CreateObject();

    // product_tags_error->code
    if (!product_tags_error->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", *product_tags_error->code) == NULL) {
    goto fail; //Numeric
    }


    // product_tags_error->details
    if(product_tags_error->details) {
    cJSON *details_local_JSON = ineligible_product_tags_error_details_convertToJSON(product_tags_error->details);
    if(details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "details", details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // product_tags_error->message
    if (!product_tags_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", product_tags_error->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_tags_error_t *product_tags_error_parseFromJSON(cJSON *product_tags_errorJSON){

    product_tags_error_t *product_tags_error_local_var = NULL;

    // define the local variable for product_tags_error->code
    int *code_local_var = NULL;

    // define the local variable for product_tags_error->details
    ineligible_product_tags_error_details_t *details_local_nonprim = NULL;

    char *message_local_str = NULL;

    // product_tags_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(product_tags_errorJSON, "code");
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

    // product_tags_error->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(product_tags_errorJSON, "details");
    if (cJSON_IsNull(details)) {
        details = NULL;
    }
    if (details) { 
    details_local_nonprim = ineligible_product_tags_error_details_parseFromJSON(details); //nonprimitive
    }

    // product_tags_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(product_tags_errorJSON, "message");
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

    product_tags_error_local_var = product_tags_error_create_internal (
        code_local_var,
        details ? details_local_nonprim : NULL,
        message_local_str
        );

    if (!product_tags_error_local_var) {
        goto end;
    }

    return product_tags_error_local_var;
end:
    if (code_local_var) {
        free(code_local_var);
        code_local_var = NULL;
    }
    if (details_local_nonprim) {
        ineligible_product_tags_error_details_free(details_local_nonprim);
        details_local_nonprim = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
