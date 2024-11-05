#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_asset_group_response_exceptions_inner.h"



delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_create(
    int code,
    char *message,
    char *asset_group_id
    ) {
    delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_local_var = malloc(sizeof(delete_asset_group_response_exceptions_inner_t));
    if (!delete_asset_group_response_exceptions_inner_local_var) {
        return NULL;
    }
    delete_asset_group_response_exceptions_inner_local_var->code = code;
    delete_asset_group_response_exceptions_inner_local_var->message = message;
    delete_asset_group_response_exceptions_inner_local_var->asset_group_id = asset_group_id;

    return delete_asset_group_response_exceptions_inner_local_var;
}


void delete_asset_group_response_exceptions_inner_free(delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner) {
    if(NULL == delete_asset_group_response_exceptions_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_asset_group_response_exceptions_inner->message) {
        free(delete_asset_group_response_exceptions_inner->message);
        delete_asset_group_response_exceptions_inner->message = NULL;
    }
    if (delete_asset_group_response_exceptions_inner->asset_group_id) {
        free(delete_asset_group_response_exceptions_inner->asset_group_id);
        delete_asset_group_response_exceptions_inner->asset_group_id = NULL;
    }
    free(delete_asset_group_response_exceptions_inner);
}

cJSON *delete_asset_group_response_exceptions_inner_convertToJSON(delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner) {
    cJSON *item = cJSON_CreateObject();

    // delete_asset_group_response_exceptions_inner->code
    if(delete_asset_group_response_exceptions_inner->code) {
    if(cJSON_AddNumberToObject(item, "code", delete_asset_group_response_exceptions_inner->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // delete_asset_group_response_exceptions_inner->message
    if(delete_asset_group_response_exceptions_inner->message) {
    if(cJSON_AddStringToObject(item, "message", delete_asset_group_response_exceptions_inner->message) == NULL) {
    goto fail; //String
    }
    }


    // delete_asset_group_response_exceptions_inner->asset_group_id
    if(delete_asset_group_response_exceptions_inner->asset_group_id) {
    if(cJSON_AddStringToObject(item, "asset_group_id", delete_asset_group_response_exceptions_inner->asset_group_id) == NULL) {
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

delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_parseFromJSON(cJSON *delete_asset_group_response_exceptions_innerJSON){

    delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_local_var = NULL;

    // delete_asset_group_response_exceptions_inner->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(delete_asset_group_response_exceptions_innerJSON, "code");
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // delete_asset_group_response_exceptions_inner->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(delete_asset_group_response_exceptions_innerJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // delete_asset_group_response_exceptions_inner->asset_group_id
    cJSON *asset_group_id = cJSON_GetObjectItemCaseSensitive(delete_asset_group_response_exceptions_innerJSON, "asset_group_id");
    if (asset_group_id) { 
    if(!cJSON_IsString(asset_group_id) && !cJSON_IsNull(asset_group_id))
    {
    goto end; //String
    }
    }


    delete_asset_group_response_exceptions_inner_local_var = delete_asset_group_response_exceptions_inner_create (
        code ? code->valuedouble : 0,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        asset_group_id && !cJSON_IsNull(asset_group_id) ? strdup(asset_group_id->valuestring) : NULL
        );

    return delete_asset_group_response_exceptions_inner_local_var;
end:
    return NULL;

}
