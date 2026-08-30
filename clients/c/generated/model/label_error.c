#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_error.h"



static label_error_t *label_error_create_internal(
    label_error_data_t *data,
    list_t *error_messages
    ) {
    label_error_t *label_error_local_var = malloc(sizeof(label_error_t));
    if (!label_error_local_var) {
        return NULL;
    }
    memset(label_error_local_var, 0, sizeof(label_error_t));
    label_error_local_var->_library_owned = 1;
    label_error_local_var->data = data;
    label_error_local_var->error_messages = error_messages;
    return label_error_local_var;
}

__attribute__((deprecated)) label_error_t *label_error_create(
    label_error_data_t *data,
    list_t *error_messages
    ) {
    label_error_t *result = label_error_create_internal (
        data,
        error_messages
        );
    if (!result) {
    }
    return result;
}

void label_error_free(label_error_t *label_error) {
    if(NULL == label_error){
        return ;
    }
    if(label_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_error->data) {
        label_error_data_free(label_error->data);
        label_error->data = NULL;
    }
    if (label_error->error_messages) {
        list_ForEach(listEntry, label_error->error_messages) {
            free(listEntry->data);
        }
        list_freeList(label_error->error_messages);
        label_error->error_messages = NULL;
    }
    free(label_error);
}

cJSON *label_error_convertToJSON(label_error_t *label_error) {
    cJSON *item = cJSON_CreateObject();

    // label_error->data
    if(label_error->data) {
    cJSON *data_local_JSON = label_error_data_convertToJSON(label_error->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // label_error->error_messages
    if(label_error->error_messages) {
    cJSON *error_messages = cJSON_AddArrayToObject(item, "error_messages");
    if(error_messages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *error_messagesListEntry;
    list_ForEach(error_messagesListEntry, label_error->error_messages) {
    if(cJSON_AddStringToObject(error_messages, "", error_messagesListEntry->data) == NULL)
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

label_error_t *label_error_parseFromJSON(cJSON *label_errorJSON){

    label_error_t *label_error_local_var = NULL;

    // define the local variable for label_error->data
    label_error_data_t *data_local_nonprim = NULL;

    // define the local list for label_error->error_messages
    list_t *error_messagesList = NULL;

    // label_error->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(label_errorJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = label_error_data_parseFromJSON(data); //nonprimitive
    }

    // label_error->error_messages
    cJSON *error_messages = cJSON_GetObjectItemCaseSensitive(label_errorJSON, "error_messages");
    if (cJSON_IsNull(error_messages)) {
        error_messages = NULL;
    }
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



    label_error_local_var = label_error_create_internal (
        data ? data_local_nonprim : NULL,
        error_messages ? error_messagesList : NULL
        );

    if (!label_error_local_var) {
        goto end;
    }

    return label_error_local_var;
end:
    if (data_local_nonprim) {
        label_error_data_free(data_local_nonprim);
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
