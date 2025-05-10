#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "base_invite_data_response_invite_data.h"



static base_invite_data_response_invite_data_t *base_invite_data_response_invite_data_create_internal(
    int invite_expiration,
    char *invite_status,
    char *invite_type,
    int last_updated_time,
    int sent_at
    ) {
    base_invite_data_response_invite_data_t *base_invite_data_response_invite_data_local_var = malloc(sizeof(base_invite_data_response_invite_data_t));
    if (!base_invite_data_response_invite_data_local_var) {
        return NULL;
    }
    base_invite_data_response_invite_data_local_var->invite_expiration = invite_expiration;
    base_invite_data_response_invite_data_local_var->invite_status = invite_status;
    base_invite_data_response_invite_data_local_var->invite_type = invite_type;
    base_invite_data_response_invite_data_local_var->last_updated_time = last_updated_time;
    base_invite_data_response_invite_data_local_var->sent_at = sent_at;

    base_invite_data_response_invite_data_local_var->_library_owned = 1;
    return base_invite_data_response_invite_data_local_var;
}

__attribute__((deprecated)) base_invite_data_response_invite_data_t *base_invite_data_response_invite_data_create(
    int invite_expiration,
    char *invite_status,
    char *invite_type,
    int last_updated_time,
    int sent_at
    ) {
    return base_invite_data_response_invite_data_create_internal (
        invite_expiration,
        invite_status,
        invite_type,
        last_updated_time,
        sent_at
        );
}

void base_invite_data_response_invite_data_free(base_invite_data_response_invite_data_t *base_invite_data_response_invite_data) {
    if(NULL == base_invite_data_response_invite_data){
        return ;
    }
    if(base_invite_data_response_invite_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "base_invite_data_response_invite_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (base_invite_data_response_invite_data->invite_status) {
        free(base_invite_data_response_invite_data->invite_status);
        base_invite_data_response_invite_data->invite_status = NULL;
    }
    if (base_invite_data_response_invite_data->invite_type) {
        free(base_invite_data_response_invite_data->invite_type);
        base_invite_data_response_invite_data->invite_type = NULL;
    }
    free(base_invite_data_response_invite_data);
}

cJSON *base_invite_data_response_invite_data_convertToJSON(base_invite_data_response_invite_data_t *base_invite_data_response_invite_data) {
    cJSON *item = cJSON_CreateObject();

    // base_invite_data_response_invite_data->invite_expiration
    if(base_invite_data_response_invite_data->invite_expiration) {
    if(cJSON_AddNumberToObject(item, "invite_expiration", base_invite_data_response_invite_data->invite_expiration) == NULL) {
    goto fail; //Numeric
    }
    }


    // base_invite_data_response_invite_data->invite_status
    if(base_invite_data_response_invite_data->invite_status) {
    if(cJSON_AddStringToObject(item, "invite_status", base_invite_data_response_invite_data->invite_status) == NULL) {
    goto fail; //String
    }
    }


    // base_invite_data_response_invite_data->invite_type
    if(base_invite_data_response_invite_data->invite_type) {
    if(cJSON_AddStringToObject(item, "invite_type", base_invite_data_response_invite_data->invite_type) == NULL) {
    goto fail; //String
    }
    }


    // base_invite_data_response_invite_data->last_updated_time
    if(base_invite_data_response_invite_data->last_updated_time) {
    if(cJSON_AddNumberToObject(item, "last_updated_time", base_invite_data_response_invite_data->last_updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // base_invite_data_response_invite_data->sent_at
    if(base_invite_data_response_invite_data->sent_at) {
    if(cJSON_AddNumberToObject(item, "sent_at", base_invite_data_response_invite_data->sent_at) == NULL) {
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

base_invite_data_response_invite_data_t *base_invite_data_response_invite_data_parseFromJSON(cJSON *base_invite_data_response_invite_dataJSON){

    base_invite_data_response_invite_data_t *base_invite_data_response_invite_data_local_var = NULL;

    // base_invite_data_response_invite_data->invite_expiration
    cJSON *invite_expiration = cJSON_GetObjectItemCaseSensitive(base_invite_data_response_invite_dataJSON, "invite_expiration");
    if (cJSON_IsNull(invite_expiration)) {
        invite_expiration = NULL;
    }
    if (invite_expiration) { 
    if(!cJSON_IsNumber(invite_expiration))
    {
    goto end; //Numeric
    }
    }

    // base_invite_data_response_invite_data->invite_status
    cJSON *invite_status = cJSON_GetObjectItemCaseSensitive(base_invite_data_response_invite_dataJSON, "invite_status");
    if (cJSON_IsNull(invite_status)) {
        invite_status = NULL;
    }
    if (invite_status) { 
    if(!cJSON_IsString(invite_status) && !cJSON_IsNull(invite_status))
    {
    goto end; //String
    }
    }

    // base_invite_data_response_invite_data->invite_type
    cJSON *invite_type = cJSON_GetObjectItemCaseSensitive(base_invite_data_response_invite_dataJSON, "invite_type");
    if (cJSON_IsNull(invite_type)) {
        invite_type = NULL;
    }
    if (invite_type) { 
    if(!cJSON_IsString(invite_type) && !cJSON_IsNull(invite_type))
    {
    goto end; //String
    }
    }

    // base_invite_data_response_invite_data->last_updated_time
    cJSON *last_updated_time = cJSON_GetObjectItemCaseSensitive(base_invite_data_response_invite_dataJSON, "last_updated_time");
    if (cJSON_IsNull(last_updated_time)) {
        last_updated_time = NULL;
    }
    if (last_updated_time) { 
    if(!cJSON_IsNumber(last_updated_time))
    {
    goto end; //Numeric
    }
    }

    // base_invite_data_response_invite_data->sent_at
    cJSON *sent_at = cJSON_GetObjectItemCaseSensitive(base_invite_data_response_invite_dataJSON, "sent_at");
    if (cJSON_IsNull(sent_at)) {
        sent_at = NULL;
    }
    if (sent_at) { 
    if(!cJSON_IsNumber(sent_at))
    {
    goto end; //Numeric
    }
    }


    base_invite_data_response_invite_data_local_var = base_invite_data_response_invite_data_create_internal (
        invite_expiration ? invite_expiration->valuedouble : 0,
        invite_status && !cJSON_IsNull(invite_status) ? strdup(invite_status->valuestring) : NULL,
        invite_type && !cJSON_IsNull(invite_type) ? strdup(invite_type->valuestring) : NULL,
        last_updated_time ? last_updated_time->valuedouble : 0,
        sent_at ? sent_at->valuedouble : 0
        );

    return base_invite_data_response_invite_data_local_var;
end:
    return NULL;

}
