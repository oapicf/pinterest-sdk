#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_validation_event.h"



static item_validation_event_t *item_validation_event_create_internal(
    char *attribute,
    int *code,
    char *message
    ) {
    item_validation_event_t *item_validation_event_local_var = malloc(sizeof(item_validation_event_t));
    if (!item_validation_event_local_var) {
        return NULL;
    }
    memset(item_validation_event_local_var, 0, sizeof(item_validation_event_t));
    item_validation_event_local_var->_library_owned = 1;
    item_validation_event_local_var->attribute = attribute;
    item_validation_event_local_var->code = code;
    item_validation_event_local_var->message = message;
    return item_validation_event_local_var;
}

__attribute__((deprecated)) item_validation_event_t *item_validation_event_create(
    char *attribute,
    int *code,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    item_validation_event_t *result = item_validation_event_create_internal (
        attribute,
        code_copy,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void item_validation_event_free(item_validation_event_t *item_validation_event) {
    if(NULL == item_validation_event){
        return ;
    }
    if(item_validation_event->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_validation_event_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_validation_event->attribute) {
        free(item_validation_event->attribute);
        item_validation_event->attribute = NULL;
    }
    if (item_validation_event->code) {
        free(item_validation_event->code);
        item_validation_event->code = NULL;
    }
    if (item_validation_event->message) {
        free(item_validation_event->message);
        item_validation_event->message = NULL;
    }
    free(item_validation_event);
}

cJSON *item_validation_event_convertToJSON(item_validation_event_t *item_validation_event) {
    cJSON *item = cJSON_CreateObject();

    // item_validation_event->attribute
    if(item_validation_event->attribute) {
    if(cJSON_AddStringToObject(item, "attribute", item_validation_event->attribute) == NULL) {
    goto fail; //String
    }
    }


    // item_validation_event->code
    if(item_validation_event->code) {
    if(cJSON_AddNumberToObject(item, "code", *item_validation_event->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_validation_event->message
    if(item_validation_event->message) {
    if(cJSON_AddStringToObject(item, "message", item_validation_event->message) == NULL) {
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

item_validation_event_t *item_validation_event_parseFromJSON(cJSON *item_validation_eventJSON){

    item_validation_event_t *item_validation_event_local_var = NULL;

    char *attribute_local_str = NULL;

    // define the local variable for item_validation_event->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

    // item_validation_event->attribute
    cJSON *attribute = cJSON_GetObjectItemCaseSensitive(item_validation_eventJSON, "attribute");
    if (cJSON_IsNull(attribute)) {
        attribute = NULL;
    }
    if (attribute) { 
    if(!cJSON_IsString(attribute) && !cJSON_IsNull(attribute))
    {
    goto end; //String
    }
    }

    // item_validation_event->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(item_validation_eventJSON, "code");
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

    // item_validation_event->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(item_validation_eventJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    if (attribute && !cJSON_IsNull(attribute)) attribute_local_str = strdup(attribute->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    item_validation_event_local_var = item_validation_event_create_internal (
        attribute_local_str,
        code_local_var,
        message_local_str
        );

    if (!item_validation_event_local_var) {
        goto end;
    }

    return item_validation_event_local_var;
end:
    if (attribute_local_str) {
        free(attribute_local_str);
        attribute_local_str = NULL;
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
