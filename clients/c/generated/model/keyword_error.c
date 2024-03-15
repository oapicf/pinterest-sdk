#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_error.h"



keyword_error_t *keyword_error_create(
    keyword_t *data,
    list_t *error_messages
    ) {
    keyword_error_t *keyword_error_local_var = malloc(sizeof(keyword_error_t));
    if (!keyword_error_local_var) {
        return NULL;
    }
    keyword_error_local_var->data = data;
    keyword_error_local_var->error_messages = error_messages;

    return keyword_error_local_var;
}


void keyword_error_free(keyword_error_t *keyword_error) {
    if(NULL == keyword_error){
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_error->data) {
        keyword_free(keyword_error->data);
        keyword_error->data = NULL;
    }
    if (keyword_error->error_messages) {
        list_ForEach(listEntry, keyword_error->error_messages) {
            free(listEntry->data);
        }
        list_freeList(keyword_error->error_messages);
        keyword_error->error_messages = NULL;
    }
    free(keyword_error);
}

cJSON *keyword_error_convertToJSON(keyword_error_t *keyword_error) {
    cJSON *item = cJSON_CreateObject();

    // keyword_error->data
    if(keyword_error->data) {
    cJSON *data_local_JSON = keyword_convertToJSON(keyword_error->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // keyword_error->error_messages
    if(keyword_error->error_messages) {
    cJSON *error_messages = cJSON_AddArrayToObject(item, "error_messages");
    if(error_messages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *error_messagesListEntry;
    list_ForEach(error_messagesListEntry, keyword_error->error_messages) {
    if(cJSON_AddStringToObject(error_messages, "", (char*)error_messagesListEntry->data) == NULL)
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

keyword_error_t *keyword_error_parseFromJSON(cJSON *keyword_errorJSON){

    keyword_error_t *keyword_error_local_var = NULL;

    // define the local variable for keyword_error->data
    keyword_t *data_local_nonprim = NULL;

    // define the local list for keyword_error->error_messages
    list_t *error_messagesList = NULL;

    // keyword_error->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(keyword_errorJSON, "data");
    if (data) { 
    data_local_nonprim = keyword_parseFromJSON(data); //nonprimitive
    }

    // keyword_error->error_messages
    cJSON *error_messages = cJSON_GetObjectItemCaseSensitive(keyword_errorJSON, "error_messages");
    if (error_messages) { 
    cJSON *error_messages_local = NULL;
    if(!cJSON_IsArray(error_messages)) {
        goto end;//primitive container
    }
    error_messagesList = list_createList();

    cJSON_ArrayForEach(error_messages_local, error_messages)
    {
        if(!cJSON_IsString(error_messages_local))
        {
            goto end;
        }
        list_addElement(error_messagesList , strdup(error_messages_local->valuestring));
    }
    }


    keyword_error_local_var = keyword_error_create (
        data ? data_local_nonprim : NULL,
        error_messages ? error_messagesList : NULL
        );

    return keyword_error_local_var;
end:
    if (data_local_nonprim) {
        keyword_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    if (error_messagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, error_messagesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(error_messagesList);
        error_messagesList = NULL;
    }
    return NULL;

}
