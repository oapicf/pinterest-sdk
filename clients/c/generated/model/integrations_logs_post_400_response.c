#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integrations_logs_post_400_response.h"



static integrations_logs_post_400_response_t *integrations_logs_post_400_response_create_internal(
    int code,
    char *message,
    object_t *details
    ) {
    integrations_logs_post_400_response_t *integrations_logs_post_400_response_local_var = malloc(sizeof(integrations_logs_post_400_response_t));
    if (!integrations_logs_post_400_response_local_var) {
        return NULL;
    }
    integrations_logs_post_400_response_local_var->code = code;
    integrations_logs_post_400_response_local_var->message = message;
    integrations_logs_post_400_response_local_var->details = details;

    integrations_logs_post_400_response_local_var->_library_owned = 1;
    return integrations_logs_post_400_response_local_var;
}

__attribute__((deprecated)) integrations_logs_post_400_response_t *integrations_logs_post_400_response_create(
    int code,
    char *message,
    object_t *details
    ) {
    return integrations_logs_post_400_response_create_internal (
        code,
        message,
        details
        );
}

void integrations_logs_post_400_response_free(integrations_logs_post_400_response_t *integrations_logs_post_400_response) {
    if(NULL == integrations_logs_post_400_response){
        return ;
    }
    if(integrations_logs_post_400_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integrations_logs_post_400_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integrations_logs_post_400_response->message) {
        free(integrations_logs_post_400_response->message);
        integrations_logs_post_400_response->message = NULL;
    }
    if (integrations_logs_post_400_response->details) {
        object_free(integrations_logs_post_400_response->details);
        integrations_logs_post_400_response->details = NULL;
    }
    free(integrations_logs_post_400_response);
}

cJSON *integrations_logs_post_400_response_convertToJSON(integrations_logs_post_400_response_t *integrations_logs_post_400_response) {
    cJSON *item = cJSON_CreateObject();

    // integrations_logs_post_400_response->code
    if (!integrations_logs_post_400_response->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", integrations_logs_post_400_response->code) == NULL) {
    goto fail; //Numeric
    }


    // integrations_logs_post_400_response->message
    if (!integrations_logs_post_400_response->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", integrations_logs_post_400_response->message) == NULL) {
    goto fail; //String
    }


    // integrations_logs_post_400_response->details
    if (!integrations_logs_post_400_response->details) {
        goto fail;
    }
    cJSON *details_object = object_convertToJSON(integrations_logs_post_400_response->details);
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

integrations_logs_post_400_response_t *integrations_logs_post_400_response_parseFromJSON(cJSON *integrations_logs_post_400_responseJSON){

    integrations_logs_post_400_response_t *integrations_logs_post_400_response_local_var = NULL;

    // integrations_logs_post_400_response->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(integrations_logs_post_400_responseJSON, "code");
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

    // integrations_logs_post_400_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(integrations_logs_post_400_responseJSON, "message");
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

    // integrations_logs_post_400_response->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(integrations_logs_post_400_responseJSON, "details");
    if (cJSON_IsNull(details)) {
        details = NULL;
    }
    if (!details) {
        goto end;
    }

    object_t *details_local_object = NULL;
    
    details_local_object = object_parseFromJSON(details); //object


    integrations_logs_post_400_response_local_var = integrations_logs_post_400_response_create_internal (
        code->valuedouble,
        strdup(message->valuestring),
        details_local_object
        );

    return integrations_logs_post_400_response_local_var;
end:
    return NULL;

}
