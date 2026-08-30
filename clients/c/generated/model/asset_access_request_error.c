#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_access_request_error.h"



static asset_access_request_error_t *asset_access_request_error_create_internal(
    int *code,
    list_t *messages
    ) {
    asset_access_request_error_t *asset_access_request_error_local_var = malloc(sizeof(asset_access_request_error_t));
    if (!asset_access_request_error_local_var) {
        return NULL;
    }
    memset(asset_access_request_error_local_var, 0, sizeof(asset_access_request_error_t));
    asset_access_request_error_local_var->_library_owned = 1;
    asset_access_request_error_local_var->code = code;
    asset_access_request_error_local_var->messages = messages;
    return asset_access_request_error_local_var;
}

__attribute__((deprecated)) asset_access_request_error_t *asset_access_request_error_create(
    int *code,
    list_t *messages
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    asset_access_request_error_t *result = asset_access_request_error_create_internal (
        code_copy,
        messages
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void asset_access_request_error_free(asset_access_request_error_t *asset_access_request_error) {
    if(NULL == asset_access_request_error){
        return ;
    }
    if(asset_access_request_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_access_request_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_access_request_error->code) {
        free(asset_access_request_error->code);
        asset_access_request_error->code = NULL;
    }
    if (asset_access_request_error->messages) {
        list_ForEach(listEntry, asset_access_request_error->messages) {
            free(listEntry->data);
        }
        list_freeList(asset_access_request_error->messages);
        asset_access_request_error->messages = NULL;
    }
    free(asset_access_request_error);
}

cJSON *asset_access_request_error_convertToJSON(asset_access_request_error_t *asset_access_request_error) {
    cJSON *item = cJSON_CreateObject();

    // asset_access_request_error->code
    if(asset_access_request_error->code) {
    if(cJSON_AddNumberToObject(item, "code", *asset_access_request_error->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // asset_access_request_error->messages
    if(asset_access_request_error->messages) {
    cJSON *messages = cJSON_AddArrayToObject(item, "messages");
    if(messages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *messagesListEntry;
    list_ForEach(messagesListEntry, asset_access_request_error->messages) {
    if(cJSON_AddStringToObject(messages, "", messagesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

asset_access_request_error_t *asset_access_request_error_parseFromJSON(cJSON *asset_access_request_errorJSON){

    asset_access_request_error_t *asset_access_request_error_local_var = NULL;

    // define the local variable for asset_access_request_error->code
    int *code_local_var = NULL;

    // define the local list for asset_access_request_error->messages
    list_t *messagesList = NULL;

    // asset_access_request_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(asset_access_request_errorJSON, "code");
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

    // asset_access_request_error->messages
    cJSON *messages = cJSON_GetObjectItemCaseSensitive(asset_access_request_errorJSON, "messages");
    if (cJSON_IsNull(messages)) {
        messages = NULL;
    }
    if (messages) { 
    cJSON *messages_local = NULL;
    if(!cJSON_IsArray(messages)) {
        goto end;//primitive container
    }
    messagesList = list_createList();

    cJSON_ArrayForEach(messages_local, messages)
    {
        if(!cJSON_IsString(messages_local))
        {
            goto end;
        }
        list_addElement(messagesList , strdup(messages_local->valuestring));
    }
    }



    asset_access_request_error_local_var = asset_access_request_error_create_internal (
        code_local_var,
        messages ? messagesList : NULL
        );

    if (!asset_access_request_error_local_var) {
        goto end;
    }

    return asset_access_request_error_local_var;
end:
    if (code_local_var) {
        free(code_local_var);
        code_local_var = NULL;
    }
    if (messagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, messagesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(messagesList);
        messagesList = NULL;
    }
    return NULL;

}
