#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_asset_group_response_exceptions_inner.h"



static delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_create_internal(
    char *asset_group_id,
    int code,
    char *message
    ) {
    delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_local_var = malloc(sizeof(delete_asset_group_response_exceptions_inner_t));
    if (!delete_asset_group_response_exceptions_inner_local_var) {
        return NULL;
    }
    delete_asset_group_response_exceptions_inner_local_var->asset_group_id = asset_group_id;
    delete_asset_group_response_exceptions_inner_local_var->code = code;
    delete_asset_group_response_exceptions_inner_local_var->message = message;

    delete_asset_group_response_exceptions_inner_local_var->_library_owned = 1;
    return delete_asset_group_response_exceptions_inner_local_var;
}

__attribute__((deprecated)) delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_create(
    char *asset_group_id,
    int code,
    char *message
    ) {
    return delete_asset_group_response_exceptions_inner_create_internal (
        asset_group_id,
        code,
        message
        );
}

void delete_asset_group_response_exceptions_inner_free(delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner) {
    if(NULL == delete_asset_group_response_exceptions_inner){
        return ;
    }
    if(delete_asset_group_response_exceptions_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_asset_group_response_exceptions_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_asset_group_response_exceptions_inner->asset_group_id) {
        free(delete_asset_group_response_exceptions_inner->asset_group_id);
        delete_asset_group_response_exceptions_inner->asset_group_id = NULL;
    }
    if (delete_asset_group_response_exceptions_inner->message) {
        free(delete_asset_group_response_exceptions_inner->message);
        delete_asset_group_response_exceptions_inner->message = NULL;
    }
    free(delete_asset_group_response_exceptions_inner);
}

cJSON *delete_asset_group_response_exceptions_inner_convertToJSON(delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner) {
    cJSON *item = cJSON_CreateObject();

    // delete_asset_group_response_exceptions_inner->asset_group_id
    if(delete_asset_group_response_exceptions_inner->asset_group_id) {
    if(cJSON_AddStringToObject(item, "asset_group_id", delete_asset_group_response_exceptions_inner->asset_group_id) == NULL) {
    goto fail; //String
    }
    }


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

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_parseFromJSON(cJSON *delete_asset_group_response_exceptions_innerJSON){

    delete_asset_group_response_exceptions_inner_t *delete_asset_group_response_exceptions_inner_local_var = NULL;

    // delete_asset_group_response_exceptions_inner->asset_group_id
    cJSON *asset_group_id = cJSON_GetObjectItemCaseSensitive(delete_asset_group_response_exceptions_innerJSON, "asset_group_id");
    if (cJSON_IsNull(asset_group_id)) {
        asset_group_id = NULL;
    }
    if (asset_group_id) { 
    if(!cJSON_IsString(asset_group_id) && !cJSON_IsNull(asset_group_id))
    {
    goto end; //String
    }
    }

    // delete_asset_group_response_exceptions_inner->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(delete_asset_group_response_exceptions_innerJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // delete_asset_group_response_exceptions_inner->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(delete_asset_group_response_exceptions_innerJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    delete_asset_group_response_exceptions_inner_local_var = delete_asset_group_response_exceptions_inner_create_internal (
        asset_group_id && !cJSON_IsNull(asset_group_id) ? strdup(asset_group_id->valuestring) : NULL,
        code ? code->valuedouble : 0,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return delete_asset_group_response_exceptions_inner_local_var;
end:
    return NULL;

}
