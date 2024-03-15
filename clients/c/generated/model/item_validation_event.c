#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_validation_event.h"



item_validation_event_t *item_validation_event_create(
    char *attribute,
    int code,
    char *message
    ) {
    item_validation_event_t *item_validation_event_local_var = malloc(sizeof(item_validation_event_t));
    if (!item_validation_event_local_var) {
        return NULL;
    }
    item_validation_event_local_var->attribute = attribute;
    item_validation_event_local_var->code = code;
    item_validation_event_local_var->message = message;

    return item_validation_event_local_var;
}


void item_validation_event_free(item_validation_event_t *item_validation_event) {
    if(NULL == item_validation_event){
        return ;
    }
    listEntry_t *listEntry;
    if (item_validation_event->attribute) {
        free(item_validation_event->attribute);
        item_validation_event->attribute = NULL;
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
    if(cJSON_AddNumberToObject(item, "code", item_validation_event->code) == NULL) {
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

    // item_validation_event->attribute
    cJSON *attribute = cJSON_GetObjectItemCaseSensitive(item_validation_eventJSON, "attribute");
    if (attribute) { 
    if(!cJSON_IsString(attribute) && !cJSON_IsNull(attribute))
    {
    goto end; //String
    }
    }

    // item_validation_event->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(item_validation_eventJSON, "code");
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // item_validation_event->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(item_validation_eventJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    item_validation_event_local_var = item_validation_event_create (
        attribute && !cJSON_IsNull(attribute) ? strdup(attribute->valuestring) : NULL,
        code ? code->valuedouble : 0,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return item_validation_event_local_var;
end:
    return NULL;

}
