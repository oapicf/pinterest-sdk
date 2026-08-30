#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_mutation_error.h"



static order_line_mutation_error_t *order_line_mutation_error_create_internal(
    order_line_t *data,
    list_t *error_messages
    ) {
    order_line_mutation_error_t *order_line_mutation_error_local_var = malloc(sizeof(order_line_mutation_error_t));
    if (!order_line_mutation_error_local_var) {
        return NULL;
    }
    memset(order_line_mutation_error_local_var, 0, sizeof(order_line_mutation_error_t));
    order_line_mutation_error_local_var->_library_owned = 1;
    order_line_mutation_error_local_var->data = data;
    order_line_mutation_error_local_var->error_messages = error_messages;
    return order_line_mutation_error_local_var;
}

__attribute__((deprecated)) order_line_mutation_error_t *order_line_mutation_error_create(
    order_line_t *data,
    list_t *error_messages
    ) {
    order_line_mutation_error_t *result = order_line_mutation_error_create_internal (
        data,
        error_messages
        );
    if (!result) {
    }
    return result;
}

void order_line_mutation_error_free(order_line_mutation_error_t *order_line_mutation_error) {
    if(NULL == order_line_mutation_error){
        return ;
    }
    if(order_line_mutation_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "order_line_mutation_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (order_line_mutation_error->data) {
        order_line_free(order_line_mutation_error->data);
        order_line_mutation_error->data = NULL;
    }
    if (order_line_mutation_error->error_messages) {
        list_ForEach(listEntry, order_line_mutation_error->error_messages) {
            free(listEntry->data);
        }
        list_freeList(order_line_mutation_error->error_messages);
        order_line_mutation_error->error_messages = NULL;
    }
    free(order_line_mutation_error);
}

cJSON *order_line_mutation_error_convertToJSON(order_line_mutation_error_t *order_line_mutation_error) {
    cJSON *item = cJSON_CreateObject();

    // order_line_mutation_error->data
    if(order_line_mutation_error->data) {
    cJSON *data_local_JSON = order_line_convertToJSON(order_line_mutation_error->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_line_mutation_error->error_messages
    if(order_line_mutation_error->error_messages) {
    cJSON *error_messages = cJSON_AddArrayToObject(item, "error_messages");
    if(error_messages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *error_messagesListEntry;
    list_ForEach(error_messagesListEntry, order_line_mutation_error->error_messages) {
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

order_line_mutation_error_t *order_line_mutation_error_parseFromJSON(cJSON *order_line_mutation_errorJSON){

    order_line_mutation_error_t *order_line_mutation_error_local_var = NULL;

    // define the local variable for order_line_mutation_error->data
    order_line_t *data_local_nonprim = NULL;

    // define the local list for order_line_mutation_error->error_messages
    list_t *error_messagesList = NULL;

    // order_line_mutation_error->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(order_line_mutation_errorJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = order_line_parseFromJSON(data); //nonprimitive
    }

    // order_line_mutation_error->error_messages
    cJSON *error_messages = cJSON_GetObjectItemCaseSensitive(order_line_mutation_errorJSON, "error_messages");
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



    order_line_mutation_error_local_var = order_line_mutation_error_create_internal (
        data ? data_local_nonprim : NULL,
        error_messages ? error_messagesList : NULL
        );

    if (!order_line_mutation_error_local_var) {
        goto end;
    }

    return order_line_mutation_error_local_var;
end:
    if (data_local_nonprim) {
        order_line_free(data_local_nonprim);
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
