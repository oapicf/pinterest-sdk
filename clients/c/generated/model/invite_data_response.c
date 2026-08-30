#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_data_response.h"



static invite_data_response_t *invite_data_response_create_internal(
    int *invite_expiration,
    char *invite_status,
    char *invite_type,
    int *last_updated_time,
    int *sent_at
    ) {
    invite_data_response_t *invite_data_response_local_var = malloc(sizeof(invite_data_response_t));
    if (!invite_data_response_local_var) {
        return NULL;
    }
    memset(invite_data_response_local_var, 0, sizeof(invite_data_response_t));
    invite_data_response_local_var->_library_owned = 1;
    invite_data_response_local_var->invite_expiration = invite_expiration;
    invite_data_response_local_var->invite_status = invite_status;
    invite_data_response_local_var->invite_type = invite_type;
    invite_data_response_local_var->last_updated_time = last_updated_time;
    invite_data_response_local_var->sent_at = sent_at;
    return invite_data_response_local_var;
}

__attribute__((deprecated)) invite_data_response_t *invite_data_response_create(
    int *invite_expiration,
    char *invite_status,
    char *invite_type,
    int *last_updated_time,
    int *sent_at
    ) {
    int *invite_expiration_copy = NULL;
    if (invite_expiration) {
        invite_expiration_copy = malloc(sizeof(int));
        if (invite_expiration_copy) *invite_expiration_copy = *invite_expiration;
    }
    int *last_updated_time_copy = NULL;
    if (last_updated_time) {
        last_updated_time_copy = malloc(sizeof(int));
        if (last_updated_time_copy) *last_updated_time_copy = *last_updated_time;
    }
    int *sent_at_copy = NULL;
    if (sent_at) {
        sent_at_copy = malloc(sizeof(int));
        if (sent_at_copy) *sent_at_copy = *sent_at;
    }
    invite_data_response_t *result = invite_data_response_create_internal (
        invite_expiration_copy,
        invite_status,
        invite_type,
        last_updated_time_copy,
        sent_at_copy
        );
    if (!result) {
        free(invite_expiration_copy);
        free(last_updated_time_copy);
        free(sent_at_copy);
    }
    return result;
}

void invite_data_response_free(invite_data_response_t *invite_data_response) {
    if(NULL == invite_data_response){
        return ;
    }
    if(invite_data_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_data_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_data_response->invite_expiration) {
        free(invite_data_response->invite_expiration);
        invite_data_response->invite_expiration = NULL;
    }
    if (invite_data_response->invite_status) {
        free(invite_data_response->invite_status);
        invite_data_response->invite_status = NULL;
    }
    if (invite_data_response->invite_type) {
        free(invite_data_response->invite_type);
        invite_data_response->invite_type = NULL;
    }
    if (invite_data_response->last_updated_time) {
        free(invite_data_response->last_updated_time);
        invite_data_response->last_updated_time = NULL;
    }
    if (invite_data_response->sent_at) {
        free(invite_data_response->sent_at);
        invite_data_response->sent_at = NULL;
    }
    free(invite_data_response);
}

cJSON *invite_data_response_convertToJSON(invite_data_response_t *invite_data_response) {
    cJSON *item = cJSON_CreateObject();

    // invite_data_response->invite_expiration
    if(invite_data_response->invite_expiration) {
    if(cJSON_AddNumberToObject(item, "invite_expiration", *invite_data_response->invite_expiration) == NULL) {
    goto fail; //Numeric
    }
    }


    // invite_data_response->invite_status
    if(invite_data_response->invite_status) {
    if(cJSON_AddStringToObject(item, "invite_status", invite_data_response->invite_status) == NULL) {
    goto fail; //String
    }
    }


    // invite_data_response->invite_type
    if(invite_data_response->invite_type) {
    if(cJSON_AddStringToObject(item, "invite_type", invite_data_response->invite_type) == NULL) {
    goto fail; //String
    }
    }


    // invite_data_response->last_updated_time
    if(invite_data_response->last_updated_time) {
    if(cJSON_AddNumberToObject(item, "last_updated_time", *invite_data_response->last_updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // invite_data_response->sent_at
    if(invite_data_response->sent_at) {
    if(cJSON_AddNumberToObject(item, "sent_at", *invite_data_response->sent_at) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

invite_data_response_t *invite_data_response_parseFromJSON(cJSON *invite_data_responseJSON){

    invite_data_response_t *invite_data_response_local_var = NULL;

    // define the local variable for invite_data_response->invite_expiration
    int *invite_expiration_local_var = NULL;

    char *invite_status_local_str = NULL;

    char *invite_type_local_str = NULL;

    // define the local variable for invite_data_response->last_updated_time
    int *last_updated_time_local_var = NULL;

    // define the local variable for invite_data_response->sent_at
    int *sent_at_local_var = NULL;

    // invite_data_response->invite_expiration
    cJSON *invite_expiration = cJSON_GetObjectItemCaseSensitive(invite_data_responseJSON, "invite_expiration");
    if (cJSON_IsNull(invite_expiration)) {
        invite_expiration = NULL;
    }
    if (invite_expiration) { 
    if(!cJSON_IsNumber(invite_expiration))
    {
    goto end; //Numeric
    }
    invite_expiration_local_var = malloc(sizeof(int));
    if(!invite_expiration_local_var)
    {
        goto end;
    }
    *invite_expiration_local_var = invite_expiration->valuedouble;
    }

    // invite_data_response->invite_status
    cJSON *invite_status = cJSON_GetObjectItemCaseSensitive(invite_data_responseJSON, "invite_status");
    if (cJSON_IsNull(invite_status)) {
        invite_status = NULL;
    }
    if (invite_status) { 
    if(!cJSON_IsString(invite_status) && !cJSON_IsNull(invite_status))
    {
    goto end; //String
    }
    }

    // invite_data_response->invite_type
    cJSON *invite_type = cJSON_GetObjectItemCaseSensitive(invite_data_responseJSON, "invite_type");
    if (cJSON_IsNull(invite_type)) {
        invite_type = NULL;
    }
    if (invite_type) { 
    if(!cJSON_IsString(invite_type) && !cJSON_IsNull(invite_type))
    {
    goto end; //String
    }
    }

    // invite_data_response->last_updated_time
    cJSON *last_updated_time = cJSON_GetObjectItemCaseSensitive(invite_data_responseJSON, "last_updated_time");
    if (cJSON_IsNull(last_updated_time)) {
        last_updated_time = NULL;
    }
    if (last_updated_time) { 
    if(!cJSON_IsNumber(last_updated_time))
    {
    goto end; //Numeric
    }
    last_updated_time_local_var = malloc(sizeof(int));
    if(!last_updated_time_local_var)
    {
        goto end;
    }
    *last_updated_time_local_var = last_updated_time->valuedouble;
    }

    // invite_data_response->sent_at
    cJSON *sent_at = cJSON_GetObjectItemCaseSensitive(invite_data_responseJSON, "sent_at");
    if (cJSON_IsNull(sent_at)) {
        sent_at = NULL;
    }
    if (sent_at) { 
    if(!cJSON_IsNumber(sent_at))
    {
    goto end; //Numeric
    }
    sent_at_local_var = malloc(sizeof(int));
    if(!sent_at_local_var)
    {
        goto end;
    }
    *sent_at_local_var = sent_at->valuedouble;
    }


    if (invite_status && !cJSON_IsNull(invite_status)) invite_status_local_str = strdup(invite_status->valuestring);
    if (invite_type && !cJSON_IsNull(invite_type)) invite_type_local_str = strdup(invite_type->valuestring);

    invite_data_response_local_var = invite_data_response_create_internal (
        invite_expiration_local_var,
        invite_status_local_str,
        invite_type_local_str,
        last_updated_time_local_var,
        sent_at_local_var
        );

    if (!invite_data_response_local_var) {
        goto end;
    }

    return invite_data_response_local_var;
end:
    if (invite_expiration_local_var) {
        free(invite_expiration_local_var);
        invite_expiration_local_var = NULL;
    }
    if (invite_status_local_str) {
        free(invite_status_local_str);
        invite_status_local_str = NULL;
    }
    if (invite_type_local_str) {
        free(invite_type_local_str);
        invite_type_local_str = NULL;
    }
    if (last_updated_time_local_var) {
        free(last_updated_time_local_var);
        last_updated_time_local_var = NULL;
    }
    if (sent_at_local_var) {
        free(sent_at_local_var);
        sent_at_local_var = NULL;
    }
    return NULL;

}
