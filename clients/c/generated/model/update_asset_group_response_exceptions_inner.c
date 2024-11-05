#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_asset_group_response_exceptions_inner.h"



update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner_create(
    int code,
    char *message,
    char *asset_group_id
    ) {
    update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner_local_var = malloc(sizeof(update_asset_group_response_exceptions_inner_t));
    if (!update_asset_group_response_exceptions_inner_local_var) {
        return NULL;
    }
    update_asset_group_response_exceptions_inner_local_var->code = code;
    update_asset_group_response_exceptions_inner_local_var->message = message;
    update_asset_group_response_exceptions_inner_local_var->asset_group_id = asset_group_id;

    return update_asset_group_response_exceptions_inner_local_var;
}


void update_asset_group_response_exceptions_inner_free(update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner) {
    if(NULL == update_asset_group_response_exceptions_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (update_asset_group_response_exceptions_inner->message) {
        free(update_asset_group_response_exceptions_inner->message);
        update_asset_group_response_exceptions_inner->message = NULL;
    }
    if (update_asset_group_response_exceptions_inner->asset_group_id) {
        free(update_asset_group_response_exceptions_inner->asset_group_id);
        update_asset_group_response_exceptions_inner->asset_group_id = NULL;
    }
    free(update_asset_group_response_exceptions_inner);
}

cJSON *update_asset_group_response_exceptions_inner_convertToJSON(update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner) {
    cJSON *item = cJSON_CreateObject();

    // update_asset_group_response_exceptions_inner->code
    if(update_asset_group_response_exceptions_inner->code) {
    if(cJSON_AddNumberToObject(item, "code", update_asset_group_response_exceptions_inner->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // update_asset_group_response_exceptions_inner->message
    if(update_asset_group_response_exceptions_inner->message) {
    if(cJSON_AddStringToObject(item, "message", update_asset_group_response_exceptions_inner->message) == NULL) {
    goto fail; //String
    }
    }


    // update_asset_group_response_exceptions_inner->asset_group_id
    if(update_asset_group_response_exceptions_inner->asset_group_id) {
    if(cJSON_AddStringToObject(item, "asset_group_id", update_asset_group_response_exceptions_inner->asset_group_id) == NULL) {
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

update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner_parseFromJSON(cJSON *update_asset_group_response_exceptions_innerJSON){

    update_asset_group_response_exceptions_inner_t *update_asset_group_response_exceptions_inner_local_var = NULL;

    // update_asset_group_response_exceptions_inner->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(update_asset_group_response_exceptions_innerJSON, "code");
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // update_asset_group_response_exceptions_inner->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(update_asset_group_response_exceptions_innerJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // update_asset_group_response_exceptions_inner->asset_group_id
    cJSON *asset_group_id = cJSON_GetObjectItemCaseSensitive(update_asset_group_response_exceptions_innerJSON, "asset_group_id");
    if (asset_group_id) { 
    if(!cJSON_IsString(asset_group_id) && !cJSON_IsNull(asset_group_id))
    {
    goto end; //String
    }
    }


    update_asset_group_response_exceptions_inner_local_var = update_asset_group_response_exceptions_inner_create (
        code ? code->valuedouble : 0,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        asset_group_id && !cJSON_IsNull(asset_group_id) ? strdup(asset_group_id->valuestring) : NULL
        );

    return update_asset_group_response_exceptions_inner_local_var;
end:
    return NULL;

}
