#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_access_request_error_message_inner.h"



create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner_create(
    int code,
    list_t *messages
    ) {
    create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner_local_var = malloc(sizeof(create_asset_access_request_error_message_inner_t));
    if (!create_asset_access_request_error_message_inner_local_var) {
        return NULL;
    }
    create_asset_access_request_error_message_inner_local_var->code = code;
    create_asset_access_request_error_message_inner_local_var->messages = messages;

    return create_asset_access_request_error_message_inner_local_var;
}


void create_asset_access_request_error_message_inner_free(create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner) {
    if(NULL == create_asset_access_request_error_message_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_access_request_error_message_inner->messages) {
        list_ForEach(listEntry, create_asset_access_request_error_message_inner->messages) {
            free(listEntry->data);
        }
        list_freeList(create_asset_access_request_error_message_inner->messages);
        create_asset_access_request_error_message_inner->messages = NULL;
    }
    free(create_asset_access_request_error_message_inner);
}

cJSON *create_asset_access_request_error_message_inner_convertToJSON(create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_access_request_error_message_inner->code
    if(create_asset_access_request_error_message_inner->code) {
    if(cJSON_AddNumberToObject(item, "code", create_asset_access_request_error_message_inner->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_asset_access_request_error_message_inner->messages
    if(create_asset_access_request_error_message_inner->messages) {
    cJSON *messages = cJSON_AddArrayToObject(item, "messages");
    if(messages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *messagesListEntry;
    list_ForEach(messagesListEntry, create_asset_access_request_error_message_inner->messages) {
    if(cJSON_AddStringToObject(messages, "", (char*)messagesListEntry->data) == NULL)
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

create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner_parseFromJSON(cJSON *create_asset_access_request_error_message_innerJSON){

    create_asset_access_request_error_message_inner_t *create_asset_access_request_error_message_inner_local_var = NULL;

    // define the local list for create_asset_access_request_error_message_inner->messages
    list_t *messagesList = NULL;

    // create_asset_access_request_error_message_inner->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_error_message_innerJSON, "code");
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // create_asset_access_request_error_message_inner->messages
    cJSON *messages = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_error_message_innerJSON, "messages");
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


    create_asset_access_request_error_message_inner_local_var = create_asset_access_request_error_message_inner_create (
        code ? code->valuedouble : 0,
        messages ? messagesList : NULL
        );

    return create_asset_access_request_error_message_inner_local_var;
end:
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
