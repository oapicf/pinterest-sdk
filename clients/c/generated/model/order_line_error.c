#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_error.h"



order_line_error_t *order_line_error_create(
    order_line_t *data,
    list_t *error_messages
    ) {
    order_line_error_t *order_line_error_local_var = malloc(sizeof(order_line_error_t));
    if (!order_line_error_local_var) {
        return NULL;
    }
    order_line_error_local_var->data = data;
    order_line_error_local_var->error_messages = error_messages;

    return order_line_error_local_var;
}


void order_line_error_free(order_line_error_t *order_line_error) {
    if(NULL == order_line_error){
        return ;
    }
    listEntry_t *listEntry;
    if (order_line_error->data) {
        object_free(order_line_error->data);
        order_line_error->data = NULL;
    }
    if (order_line_error->error_messages) {
        list_ForEach(listEntry, order_line_error->error_messages) {
            free(listEntry->data);
        }
        list_freeList(order_line_error->error_messages);
        order_line_error->error_messages = NULL;
    }
    free(order_line_error);
}

cJSON *order_line_error_convertToJSON(order_line_error_t *order_line_error) {
    cJSON *item = cJSON_CreateObject();

    // order_line_error->data
    if(order_line_error->data) {
    cJSON *data_object = object_convertToJSON(order_line_error->data);
    if(data_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_line_error->error_messages
    if(order_line_error->error_messages) {
    cJSON *error_messages = cJSON_AddArrayToObject(item, "error_messages");
    if(error_messages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *error_messagesListEntry;
    list_ForEach(error_messagesListEntry, order_line_error->error_messages) {
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

order_line_error_t *order_line_error_parseFromJSON(cJSON *order_line_errorJSON){

    order_line_error_t *order_line_error_local_var = NULL;

    // define the local list for order_line_error->error_messages
    list_t *error_messagesList = NULL;

    // order_line_error->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(order_line_errorJSON, "data");
    object_t *data_local_object = NULL;
    if (data) { 
    data_local_object = object_parseFromJSON(data); //object
    }

    // order_line_error->error_messages
    cJSON *error_messages = cJSON_GetObjectItemCaseSensitive(order_line_errorJSON, "error_messages");
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


    order_line_error_local_var = order_line_error_create (
        data ? data_local_object : NULL,
        error_messages ? error_messagesList : NULL
        );

    return order_line_error_local_var;
end:
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
