#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "notification_response.h"



static notification_response_t *notification_response_create_internal(
    char *error_msg,
    int *received_at,
    int *success
    ) {
    notification_response_t *notification_response_local_var = malloc(sizeof(notification_response_t));
    if (!notification_response_local_var) {
        return NULL;
    }
    memset(notification_response_local_var, 0, sizeof(notification_response_t));
    notification_response_local_var->_library_owned = 1;
    notification_response_local_var->error_msg = error_msg;
    notification_response_local_var->received_at = received_at;
    notification_response_local_var->success = success;
    return notification_response_local_var;
}

__attribute__((deprecated)) notification_response_t *notification_response_create(
    char *error_msg,
    int *received_at,
    int *success
    ) {
    int *received_at_copy = NULL;
    if (received_at) {
        received_at_copy = malloc(sizeof(int));
        if (received_at_copy) *received_at_copy = *received_at;
    }
    int *success_copy = NULL;
    if (success) {
        success_copy = malloc(sizeof(int));
        if (success_copy) *success_copy = *success;
    }
    notification_response_t *result = notification_response_create_internal (
        error_msg,
        received_at_copy,
        success_copy
        );
    if (!result) {
        free(received_at_copy);
        free(success_copy);
    }
    return result;
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
    if (notification_response->received_at) {
        free(notification_response->received_at);
        notification_response->received_at = NULL;
    }
    if (notification_response->success) {
        free(notification_response->success);
        notification_response->success = NULL;
    }
    free(notification_response);
}

cJSON *notification_response_convertToJSON(notification_response_t *notification_response) {
    cJSON *item = cJSON_CreateObject();

    // notification_response->error_msg
    if(notification_response->error_msg) {
    if(cJSON_AddStringToObject(item, "error_msg", notification_response->error_msg) == NULL) {
    goto fail; //String
    }
    }


    // notification_response->received_at
    if(notification_response->received_at) {
    if(cJSON_AddNumberToObject(item, "received_at", *notification_response->received_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // notification_response->success
    if(notification_response->success) {
    if(cJSON_AddBoolToObject(item, "success", *notification_response->success) == NULL) {
    goto fail; //Bool
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

    char *error_msg_local_str = NULL;

    // define the local variable for notification_response->received_at
    int *received_at_local_var = NULL;

    // define the local variable for notification_response->success
    int *success_local_var = NULL;

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
    received_at_local_var = malloc(sizeof(int));
    if(!received_at_local_var)
    {
        goto end;
    }
    *received_at_local_var = received_at->valuedouble;
    }

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
    success_local_var = malloc(sizeof(int));
    if(!success_local_var)
    {
        goto end;
    }
    *success_local_var = success->valueint;
    }


    if (error_msg && !cJSON_IsNull(error_msg)) error_msg_local_str = strdup(error_msg->valuestring);

    notification_response_local_var = notification_response_create_internal (
        error_msg_local_str,
        received_at_local_var,
        success_local_var
        );

    if (!notification_response_local_var) {
        goto end;
    }

    return notification_response_local_var;
end:
    if (error_msg_local_str) {
        free(error_msg_local_str);
        error_msg_local_str = NULL;
    }
    if (received_at_local_var) {
        free(received_at_local_var);
        received_at_local_var = NULL;
    }
    if (success_local_var) {
        free(success_local_var);
        success_local_var = NULL;
    }
    return NULL;

}
