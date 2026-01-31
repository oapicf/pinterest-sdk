#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "notification_response.h"



static notification_response_t *notification_response_create_internal(
    int success,
    int received_at,
    char *error_msg
    ) {
    notification_response_t *notification_response_local_var = malloc(sizeof(notification_response_t));
    if (!notification_response_local_var) {
        return NULL;
    }
    notification_response_local_var->success = success;
    notification_response_local_var->received_at = received_at;
    notification_response_local_var->error_msg = error_msg;

    notification_response_local_var->_library_owned = 1;
    return notification_response_local_var;
}

__attribute__((deprecated)) notification_response_t *notification_response_create(
    int success,
    int received_at,
    char *error_msg
    ) {
    return notification_response_create_internal (
        success,
        received_at,
        error_msg
        );
}

void notification_response_free(notification_response_t *notification_response) {
    if(NULL == notification_response){
        return ;
    }
    if(notification_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "notification_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (notification_response->error_msg) {
        free(notification_response->error_msg);
        notification_response->error_msg = NULL;
    }
    free(notification_response);
}

cJSON *notification_response_convertToJSON(notification_response_t *notification_response) {
    cJSON *item = cJSON_CreateObject();

    // notification_response->success
    if(notification_response->success) {
    if(cJSON_AddBoolToObject(item, "success", notification_response->success) == NULL) {
    goto fail; //Bool
    }
    }


    // notification_response->received_at
    if(notification_response->received_at) {
    if(cJSON_AddNumberToObject(item, "received_at", notification_response->received_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // notification_response->error_msg
    if(notification_response->error_msg) {
    if(cJSON_AddStringToObject(item, "error_msg", notification_response->error_msg) == NULL) {
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

notification_response_t *notification_response_parseFromJSON(cJSON *notification_responseJSON){

    notification_response_t *notification_response_local_var = NULL;

    // notification_response->success
    cJSON *success = cJSON_GetObjectItemCaseSensitive(notification_responseJSON, "success");
    if (cJSON_IsNull(success)) {
        success = NULL;
    }
    if (success) { 
    if(!cJSON_IsBool(success))
    {
    goto end; //Bool
    }
    }

    // notification_response->received_at
    cJSON *received_at = cJSON_GetObjectItemCaseSensitive(notification_responseJSON, "received_at");
    if (cJSON_IsNull(received_at)) {
        received_at = NULL;
    }
    if (received_at) { 
    if(!cJSON_IsNumber(received_at))
    {
    goto end; //Numeric
    }
    }

    // notification_response->error_msg
    cJSON *error_msg = cJSON_GetObjectItemCaseSensitive(notification_responseJSON, "error_msg");
    if (cJSON_IsNull(error_msg)) {
        error_msg = NULL;
    }
    if (error_msg) { 
    if(!cJSON_IsString(error_msg) && !cJSON_IsNull(error_msg))
    {
    goto end; //String
    }
    }


    notification_response_local_var = notification_response_create_internal (
        success ? success->valueint : 0,
        received_at ? received_at->valuedouble : 0,
        error_msg && !cJSON_IsNull(error_msg) ? strdup(error_msg->valuestring) : NULL
        );

    return notification_response_local_var;
end:
    return NULL;

}
