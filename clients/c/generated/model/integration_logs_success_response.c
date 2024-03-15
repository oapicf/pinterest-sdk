#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_logs_success_response.h"



integration_logs_success_response_t *integration_logs_success_response_create(
    char *message
    ) {
    integration_logs_success_response_t *integration_logs_success_response_local_var = malloc(sizeof(integration_logs_success_response_t));
    if (!integration_logs_success_response_local_var) {
        return NULL;
    }
    integration_logs_success_response_local_var->message = message;

    return integration_logs_success_response_local_var;
}


void integration_logs_success_response_free(integration_logs_success_response_t *integration_logs_success_response) {
    if(NULL == integration_logs_success_response){
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

    // integration_logs_success_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(integration_logs_success_responseJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    integration_logs_success_response_local_var = integration_logs_success_response_create (
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return integration_logs_success_response_local_var;
end:
    return NULL;

}
