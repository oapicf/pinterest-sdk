#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "supplemental_item_validation_event.h"



static supplemental_item_validation_event_t *supplemental_item_validation_event_create_internal(
    char *attribute,
    int *code,
    char *message
    ) {
    supplemental_item_validation_event_t *supplemental_item_validation_event_local_var = malloc(sizeof(supplemental_item_validation_event_t));
    if (!supplemental_item_validation_event_local_var) {
        return NULL;
    }
    memset(supplemental_item_validation_event_local_var, 0, sizeof(supplemental_item_validation_event_t));
    supplemental_item_validation_event_local_var->_library_owned = 1;
    supplemental_item_validation_event_local_var->attribute = attribute;
    supplemental_item_validation_event_local_var->code = code;
    supplemental_item_validation_event_local_var->message = message;
    return supplemental_item_validation_event_local_var;
}

__attribute__((deprecated)) supplemental_item_validation_event_t *supplemental_item_validation_event_create(
    char *attribute,
    int *code,
    char *message
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    supplemental_item_validation_event_t *result = supplemental_item_validation_event_create_internal (
        attribute,
        code_copy,
        message
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void supplemental_item_validation_event_free(supplemental_item_validation_event_t *supplemental_item_validation_event) {
    if(NULL == supplemental_item_validation_event){
        return ;
    }
    if(supplemental_item_validation_event->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "supplemental_item_validation_event_free");
        return ;
    }
    listEntry_t *listEntry;
    if (supplemental_item_validation_event->attribute) {
        free(supplemental_item_validation_event->attribute);
        supplemental_item_validation_event->attribute = NULL;
    }
    if (supplemental_item_validation_event->code) {
        free(supplemental_item_validation_event->code);
        supplemental_item_validation_event->code = NULL;
    }
    if (supplemental_item_validation_event->message) {
        free(supplemental_item_validation_event->message);
        supplemental_item_validation_event->message = NULL;
    }
    free(supplemental_item_validation_event);
}

cJSON *supplemental_item_validation_event_convertToJSON(supplemental_item_validation_event_t *supplemental_item_validation_event) {
    cJSON *item = cJSON_CreateObject();

    // supplemental_item_validation_event->attribute
    if (!supplemental_item_validation_event->attribute) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "attribute", supplemental_item_validation_event->attribute) == NULL) {
    goto fail; //String
    }


    // supplemental_item_validation_event->code
    if (!supplemental_item_validation_event->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", *supplemental_item_validation_event->code) == NULL) {
    goto fail; //Numeric
    }


    // supplemental_item_validation_event->message
    if (!supplemental_item_validation_event->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", supplemental_item_validation_event->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

supplemental_item_validation_event_t *supplemental_item_validation_event_parseFromJSON(cJSON *supplemental_item_validation_eventJSON){

    supplemental_item_validation_event_t *supplemental_item_validation_event_local_var = NULL;

    char *attribute_local_str = NULL;

    // define the local variable for supplemental_item_validation_event->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

    // supplemental_item_validation_event->attribute
    cJSON *attribute = cJSON_GetObjectItemCaseSensitive(supplemental_item_validation_eventJSON, "attribute");
    if (cJSON_IsNull(attribute)) {
        attribute = NULL;
    }
    if (!attribute) {
        goto end;
    }

    
    if(!cJSON_IsString(attribute))
    {
    goto end; //String
    }

    // supplemental_item_validation_event->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(supplemental_item_validation_eventJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    
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

    // supplemental_item_validation_event->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(supplemental_item_validation_eventJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    if (attribute && !cJSON_IsNull(attribute)) attribute_local_str = strdup(attribute->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    supplemental_item_validation_event_local_var = supplemental_item_validation_event_create_internal (
        attribute_local_str,
        code_local_var,
        message_local_str
        );

    if (!supplemental_item_validation_event_local_var) {
        goto end;
    }

    return supplemental_item_validation_event_local_var;
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
