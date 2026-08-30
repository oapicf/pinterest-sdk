#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_update_error.h"



static asset_group_update_error_t *asset_group_update_error_create_internal(
    char *asset_group_id,
    int *code,
    char *message
    ) {
    asset_group_update_error_t *asset_group_update_error_local_var = malloc(sizeof(asset_group_update_error_t));
    if (!asset_group_update_error_local_var) {
        return NULL;
    }
    memset(asset_group_update_error_local_var, 0, sizeof(asset_group_update_error_t));
    asset_group_update_error_local_var->_library_owned = 1;
    asset_group_update_error_local_var->asset_group_id = asset_group_id;
    asset_group_update_error_local_var->code = code;
    asset_group_update_error_local_var->message = message;
    return asset_group_update_error_local_var;
}

__attribute__((deprecated)) asset_group_update_error_t *asset_group_update_error_create(
    char *asset_group_id,
    int *code,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    asset_group_update_error_t *result = asset_group_update_error_create_internal (
        asset_group_id,
        code_copy,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void asset_group_update_error_free(asset_group_update_error_t *asset_group_update_error) {
    if(NULL == asset_group_update_error){
        return ;
    }
    if(asset_group_update_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_group_update_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_group_update_error->asset_group_id) {
        free(asset_group_update_error->asset_group_id);
        asset_group_update_error->asset_group_id = NULL;
    }
    if (asset_group_update_error->code) {
        free(asset_group_update_error->code);
        asset_group_update_error->code = NULL;
    }
    if (asset_group_update_error->message) {
        free(asset_group_update_error->message);
        asset_group_update_error->message = NULL;
    }
    free(asset_group_update_error);
}

cJSON *asset_group_update_error_convertToJSON(asset_group_update_error_t *asset_group_update_error) {
    cJSON *item = cJSON_CreateObject();

    // asset_group_update_error->asset_group_id
    if(asset_group_update_error->asset_group_id) {
    if(cJSON_AddStringToObject(item, "asset_group_id", asset_group_update_error->asset_group_id) == NULL) {
    goto fail; //String
    }
    }


    // asset_group_update_error->code
    if(asset_group_update_error->code) {
    if(cJSON_AddNumberToObject(item, "code", *asset_group_update_error->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // asset_group_update_error->message
    if(asset_group_update_error->message) {
    if(cJSON_AddStringToObject(item, "message", asset_group_update_error->message) == NULL) {
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

asset_group_update_error_t *asset_group_update_error_parseFromJSON(cJSON *asset_group_update_errorJSON){

    asset_group_update_error_t *asset_group_update_error_local_var = NULL;

    char *asset_group_id_local_str = NULL;

    // define the local variable for asset_group_update_error->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

    // asset_group_update_error->asset_group_id
    cJSON *asset_group_id = cJSON_GetObjectItemCaseSensitive(asset_group_update_errorJSON, "asset_group_id");
    if (cJSON_IsNull(asset_group_id)) {
        asset_group_id = NULL;
    }
    if (asset_group_id) { 
    if(!cJSON_IsString(asset_group_id) && !cJSON_IsNull(asset_group_id))
    {
    goto end; //String
    }
    }

    // asset_group_update_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(asset_group_update_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    code_local_var = malloc(sizeof(int));
    if(!code_local_var)
    {
        goto end;
    }
    *code_local_var = code->valuedouble;
    }

    // asset_group_update_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(asset_group_update_errorJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    if (asset_group_id && !cJSON_IsNull(asset_group_id)) asset_group_id_local_str = strdup(asset_group_id->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    asset_group_update_error_local_var = asset_group_update_error_create_internal (
        asset_group_id_local_str,
        code_local_var,
        message_local_str
        );

    if (!asset_group_update_error_local_var) {
        goto end;
    }

    return asset_group_update_error_local_var;
end:
    if (asset_group_id_local_str) {
        free(asset_group_id_local_str);
        asset_group_id_local_str = NULL;
    }
    if (code_local_var) {
        free(code_local_var);
        code_local_var = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
