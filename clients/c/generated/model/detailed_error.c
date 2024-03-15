#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "detailed_error.h"



detailed_error_t *detailed_error_create(
    int code,
    char *message,
    object_t *details
    ) {
    detailed_error_t *detailed_error_local_var = malloc(sizeof(detailed_error_t));
    if (!detailed_error_local_var) {
        return NULL;
    }
    detailed_error_local_var->code = code;
    detailed_error_local_var->message = message;
    detailed_error_local_var->details = details;

    return detailed_error_local_var;
}


void detailed_error_free(detailed_error_t *detailed_error) {
    if(NULL == detailed_error){
        return ;
    }
    listEntry_t *listEntry;
    if (detailed_error->message) {
        free(detailed_error->message);
        detailed_error->message = NULL;
    }
    if (detailed_error->details) {
        object_free(detailed_error->details);
        detailed_error->details = NULL;
    }
    free(detailed_error);
}

cJSON *detailed_error_convertToJSON(detailed_error_t *detailed_error) {
    cJSON *item = cJSON_CreateObject();

    // detailed_error->code
    if (!detailed_error->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", detailed_error->code) == NULL) {
    goto fail; //Numeric
    }


    // detailed_error->message
    if (!detailed_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", detailed_error->message) == NULL) {
    goto fail; //String
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

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

detailed_error_t *detailed_error_parseFromJSON(cJSON *detailed_errorJSON){

    detailed_error_t *detailed_error_local_var = NULL;

    // detailed_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(detailed_errorJSON, "code");
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }

    // detailed_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(detailed_errorJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }

    // detailed_error->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(detailed_errorJSON, "details");
    if (!details) {
        goto end;
    }

    object_t *details_local_object = NULL;
    
    details_local_object = object_parseFromJSON(details); //object


    detailed_error_local_var = detailed_error_create (
        code->valuedouble,
        strdup(message->valuestring),
        details_local_object
        );

    return detailed_error_local_var;
end:
    return NULL;

}
