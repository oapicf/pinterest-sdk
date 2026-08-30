#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "entity_label_error.h"



static entity_label_error_t *entity_label_error_create_internal(
    entity_label_t *data,
    list_t *error_messages
    ) {
    entity_label_error_t *entity_label_error_local_var = malloc(sizeof(entity_label_error_t));
    if (!entity_label_error_local_var) {
        return NULL;
    }
    memset(entity_label_error_local_var, 0, sizeof(entity_label_error_t));
    entity_label_error_local_var->_library_owned = 1;
    entity_label_error_local_var->data = data;
    entity_label_error_local_var->error_messages = error_messages;
    return entity_label_error_local_var;
}

__attribute__((deprecated)) entity_label_error_t *entity_label_error_create(
    entity_label_t *data,
    list_t *error_messages
    ) {
    entity_label_error_t *result = entity_label_error_create_internal (
        data,
        error_messages
        );
    if (!result) {
    }
    return result;
}

void entity_label_error_free(entity_label_error_t *entity_label_error) {
    if(NULL == entity_label_error){
        return ;
    }
    if(entity_label_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "entity_label_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (entity_label_error->data) {
        entity_label_free(entity_label_error->data);
        entity_label_error->data = NULL;
    }
    if (entity_label_error->error_messages) {
        list_ForEach(listEntry, entity_label_error->error_messages) {
            free(listEntry->data);
        }
        list_freeList(entity_label_error->error_messages);
        entity_label_error->error_messages = NULL;
    }
    free(entity_label_error);
}

cJSON *entity_label_error_convertToJSON(entity_label_error_t *entity_label_error) {
    cJSON *item = cJSON_CreateObject();

    // entity_label_error->data
    if(entity_label_error->data) {
    cJSON *data_local_JSON = entity_label_convertToJSON(entity_label_error->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // entity_label_error->error_messages
    if(entity_label_error->error_messages) {
    cJSON *error_messages = cJSON_AddArrayToObject(item, "error_messages");
    if(error_messages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *error_messagesListEntry;
    list_ForEach(error_messagesListEntry, entity_label_error->error_messages) {
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

entity_label_error_t *entity_label_error_parseFromJSON(cJSON *entity_label_errorJSON){

    entity_label_error_t *entity_label_error_local_var = NULL;

    // define the local variable for entity_label_error->data
    entity_label_t *data_local_nonprim = NULL;

    // define the local list for entity_label_error->error_messages
    list_t *error_messagesList = NULL;

    // entity_label_error->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(entity_label_errorJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = entity_label_parseFromJSON(data); //nonprimitive
    }

    // entity_label_error->error_messages
    cJSON *error_messages = cJSON_GetObjectItemCaseSensitive(entity_label_errorJSON, "error_messages");
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



    entity_label_error_local_var = entity_label_error_create_internal (
        data ? data_local_nonprim : NULL,
        error_messages ? error_messagesList : NULL
        );

    if (!entity_label_error_local_var) {
        goto end;
    }

    return entity_label_error_local_var;
end:
    if (data_local_nonprim) {
        entity_label_free(data_local_nonprim);
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
