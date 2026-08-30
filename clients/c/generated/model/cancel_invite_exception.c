#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cancel_invite_exception.h"



static cancel_invite_exception_t *cancel_invite_exception_create_internal(
    char *invite_id,
    char *message
    ) {
    cancel_invite_exception_t *cancel_invite_exception_local_var = malloc(sizeof(cancel_invite_exception_t));
    if (!cancel_invite_exception_local_var) {
        return NULL;
    }
    memset(cancel_invite_exception_local_var, 0, sizeof(cancel_invite_exception_t));
    cancel_invite_exception_local_var->_library_owned = 1;
    cancel_invite_exception_local_var->invite_id = invite_id;
    cancel_invite_exception_local_var->message = message;
    return cancel_invite_exception_local_var;
}

__attribute__((deprecated)) cancel_invite_exception_t *cancel_invite_exception_create(
    char *invite_id,
    char *message
    ) {
    cancel_invite_exception_t *result = cancel_invite_exception_create_internal (
        invite_id,
        message
        );
    if (!result) {
    }
    return result;
}

void cancel_invite_exception_free(cancel_invite_exception_t *cancel_invite_exception) {
    if(NULL == cancel_invite_exception){
        return ;
    }
    if(cancel_invite_exception->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cancel_invite_exception_free");
        return ;
    }
    listEntry_t *listEntry;
    if (cancel_invite_exception->invite_id) {
        free(cancel_invite_exception->invite_id);
        cancel_invite_exception->invite_id = NULL;
    }
    if (cancel_invite_exception->message) {
        free(cancel_invite_exception->message);
        cancel_invite_exception->message = NULL;
    }
    free(cancel_invite_exception);
}

cJSON *cancel_invite_exception_convertToJSON(cancel_invite_exception_t *cancel_invite_exception) {
    cJSON *item = cJSON_CreateObject();

    // cancel_invite_exception->invite_id
    if(cancel_invite_exception->invite_id) {
    if(cJSON_AddStringToObject(item, "invite_id", cancel_invite_exception->invite_id) == NULL) {
    goto fail; //String
    }
    }


    // cancel_invite_exception->message
    if(cancel_invite_exception->message) {
    if(cJSON_AddStringToObject(item, "message", cancel_invite_exception->message) == NULL) {
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

cancel_invite_exception_t *cancel_invite_exception_parseFromJSON(cJSON *cancel_invite_exceptionJSON){

    cancel_invite_exception_t *cancel_invite_exception_local_var = NULL;

    char *invite_id_local_str = NULL;

    char *message_local_str = NULL;

    // cancel_invite_exception->invite_id
    cJSON *invite_id = cJSON_GetObjectItemCaseSensitive(cancel_invite_exceptionJSON, "invite_id");
    if (cJSON_IsNull(invite_id)) {
        invite_id = NULL;
    }
    if (invite_id) { 
    if(!cJSON_IsString(invite_id) && !cJSON_IsNull(invite_id))
    {
    goto end; //String
    }
    }

    // cancel_invite_exception->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(cancel_invite_exceptionJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    if (invite_id && !cJSON_IsNull(invite_id)) invite_id_local_str = strdup(invite_id->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    cancel_invite_exception_local_var = cancel_invite_exception_create_internal (
        invite_id_local_str,
        message_local_str
        );

    if (!cancel_invite_exception_local_var) {
        goto end;
    }

    return cancel_invite_exception_local_var;
end:
    if (invite_id_local_str) {
        free(invite_id_local_str);
        invite_id_local_str = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
