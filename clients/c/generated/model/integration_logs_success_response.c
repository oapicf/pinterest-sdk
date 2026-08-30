#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_logs_success_response.h"



static integration_logs_success_response_t *integration_logs_success_response_create_internal(
    char *message
    ) {
    integration_logs_success_response_t *integration_logs_success_response_local_var = malloc(sizeof(integration_logs_success_response_t));
    if (!integration_logs_success_response_local_var) {
        return NULL;
    }
    memset(integration_logs_success_response_local_var, 0, sizeof(integration_logs_success_response_t));
    integration_logs_success_response_local_var->_library_owned = 1;
    integration_logs_success_response_local_var->message = message;
    return integration_logs_success_response_local_var;
}

__attribute__((deprecated)) integration_logs_success_response_t *integration_logs_success_response_create(
    char *message
    ) {
    integration_logs_success_response_t *result = integration_logs_success_response_create_internal (
        message
        );
    if (!result) {
    }
    return result;
}

void integration_logs_success_response_free(integration_logs_success_response_t *integration_logs_success_response) {
    if(NULL == integration_logs_success_response){
        return ;
    }
    if(integration_logs_success_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_logs_success_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_logs_success_response->message) {
        free(integration_logs_success_response->message);
        integration_logs_success_response->message = NULL;
    }
    free(integration_logs_success_response);
}

cJSON *integration_logs_success_response_convertToJSON(integration_logs_success_response_t *integration_logs_success_response) {
    cJSON *item = cJSON_CreateObject();

    // integration_logs_success_response->message
    if(integration_logs_success_response->message) {
    if(cJSON_AddStringToObject(item, "message", integration_logs_success_response->message) == NULL) {
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

integration_logs_success_response_t *integration_logs_success_response_parseFromJSON(cJSON *integration_logs_success_responseJSON){

    integration_logs_success_response_t *integration_logs_success_response_local_var = NULL;

    char *message_local_str = NULL;

    // integration_logs_success_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(integration_logs_success_responseJSON, "message");
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

    integration_logs_success_response_local_var = integration_logs_success_response_create_internal (
        message_local_str
        );

    if (!integration_logs_success_response_local_var) {
        goto end;
    }

    return integration_logs_success_response_local_var;
end:
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
