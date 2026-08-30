#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_api_response_events_items.h"



static conversion_api_response_events_items_t *conversion_api_response_events_items_create_internal(
    char *error_message,
    event_processing_status_t *status,
    char *warning_message
    ) {
    conversion_api_response_events_items_t *conversion_api_response_events_items_local_var = malloc(sizeof(conversion_api_response_events_items_t));
    if (!conversion_api_response_events_items_local_var) {
        return NULL;
    }
    memset(conversion_api_response_events_items_local_var, 0, sizeof(conversion_api_response_events_items_t));
    conversion_api_response_events_items_local_var->_library_owned = 1;
    conversion_api_response_events_items_local_var->error_message = error_message;
    conversion_api_response_events_items_local_var->status = status;
    conversion_api_response_events_items_local_var->warning_message = warning_message;
    return conversion_api_response_events_items_local_var;
}

__attribute__((deprecated)) conversion_api_response_events_items_t *conversion_api_response_events_items_create(
    char *error_message,
    event_processing_status_t *status,
    char *warning_message
    ) {
    conversion_api_response_events_items_t *result = conversion_api_response_events_items_create_internal (
        error_message,
        status,
        warning_message
        );
    if (!result) {
    }
    return result;
}

void conversion_api_response_events_items_free(conversion_api_response_events_items_t *conversion_api_response_events_items) {
    if(NULL == conversion_api_response_events_items){
        return ;
    }
    if(conversion_api_response_events_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_api_response_events_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_api_response_events_items->error_message) {
        free(conversion_api_response_events_items->error_message);
        conversion_api_response_events_items->error_message = NULL;
    }
    if (conversion_api_response_events_items->status) {
        event_processing_status_free(conversion_api_response_events_items->status);
        conversion_api_response_events_items->status = NULL;
    }
    if (conversion_api_response_events_items->warning_message) {
        free(conversion_api_response_events_items->warning_message);
        conversion_api_response_events_items->warning_message = NULL;
    }
    free(conversion_api_response_events_items);
}

cJSON *conversion_api_response_events_items_convertToJSON(conversion_api_response_events_items_t *conversion_api_response_events_items) {
    cJSON *item = cJSON_CreateObject();

    // conversion_api_response_events_items->error_message
    if(conversion_api_response_events_items->error_message) {
    if(cJSON_AddStringToObject(item, "error_message", conversion_api_response_events_items->error_message) == NULL) {
    goto fail; //String
    }
    }


    // conversion_api_response_events_items->status
    if (!conversion_api_response_events_items->status) {
        goto fail;
    }
    cJSON *status_local_JSON = event_processing_status_convertToJSON(conversion_api_response_events_items->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // conversion_api_response_events_items->warning_message
    if(conversion_api_response_events_items->warning_message) {
    if(cJSON_AddStringToObject(item, "warning_message", conversion_api_response_events_items->warning_message) == NULL) {
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

conversion_api_response_events_items_t *conversion_api_response_events_items_parseFromJSON(cJSON *conversion_api_response_events_itemsJSON){

    conversion_api_response_events_items_t *conversion_api_response_events_items_local_var = NULL;

    char *error_message_local_str = NULL;

    // define the local variable for conversion_api_response_events_items->status
    event_processing_status_t *status_local_nonprim = NULL;

    char *warning_message_local_str = NULL;

    // conversion_api_response_events_items->error_message
    cJSON *error_message = cJSON_GetObjectItemCaseSensitive(conversion_api_response_events_itemsJSON, "error_message");
    if (cJSON_IsNull(error_message)) {
        error_message = NULL;
    }
    if (error_message) { 
    if(!cJSON_IsString(error_message) && !cJSON_IsNull(error_message))
    {
    goto end; //String
    }
    }

    // conversion_api_response_events_items->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(conversion_api_response_events_itemsJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = event_processing_status_parseFromJSON(status); //custom

    // conversion_api_response_events_items->warning_message
    cJSON *warning_message = cJSON_GetObjectItemCaseSensitive(conversion_api_response_events_itemsJSON, "warning_message");
    if (cJSON_IsNull(warning_message)) {
        warning_message = NULL;
    }
    if (warning_message) { 
    if(!cJSON_IsString(warning_message) && !cJSON_IsNull(warning_message))
    {
    goto end; //String
    }
    }


    if (error_message && !cJSON_IsNull(error_message)) error_message_local_str = strdup(error_message->valuestring);
    if (warning_message && !cJSON_IsNull(warning_message)) warning_message_local_str = strdup(warning_message->valuestring);

    conversion_api_response_events_items_local_var = conversion_api_response_events_items_create_internal (
        error_message_local_str,
        status_local_nonprim,
        warning_message_local_str
        );

    if (!conversion_api_response_events_items_local_var) {
        goto end;
    }

    return conversion_api_response_events_items_local_var;
end:
    if (error_message_local_str) {
        free(error_message_local_str);
        error_message_local_str = NULL;
    }
    if (status_local_nonprim) {
        event_processing_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (warning_message_local_str) {
        free(warning_message_local_str);
        warning_message_local_str = NULL;
    }
    return NULL;

}
