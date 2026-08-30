#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cancel_invite_result_item.h"



static cancel_invite_result_item_t *cancel_invite_result_item_create_internal(
    cancel_invite_exception_t *exception,
    cancel_invite_result_t *invite
    ) {
    cancel_invite_result_item_t *cancel_invite_result_item_local_var = malloc(sizeof(cancel_invite_result_item_t));
    if (!cancel_invite_result_item_local_var) {
        return NULL;
    }
    memset(cancel_invite_result_item_local_var, 0, sizeof(cancel_invite_result_item_t));
    cancel_invite_result_item_local_var->_library_owned = 1;
    cancel_invite_result_item_local_var->exception = exception;
    cancel_invite_result_item_local_var->invite = invite;
    return cancel_invite_result_item_local_var;
}

__attribute__((deprecated)) cancel_invite_result_item_t *cancel_invite_result_item_create(
    cancel_invite_exception_t *exception,
    cancel_invite_result_t *invite
    ) {
    cancel_invite_result_item_t *result = cancel_invite_result_item_create_internal (
        exception,
        invite
        );
    if (!result) {
    }
    return result;
}

void cancel_invite_result_item_free(cancel_invite_result_item_t *cancel_invite_result_item) {
    if(NULL == cancel_invite_result_item){
        return ;
    }
    if(cancel_invite_result_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cancel_invite_result_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (cancel_invite_result_item->exception) {
        cancel_invite_exception_free(cancel_invite_result_item->exception);
        cancel_invite_result_item->exception = NULL;
    }
    if (cancel_invite_result_item->invite) {
        cancel_invite_result_free(cancel_invite_result_item->invite);
        cancel_invite_result_item->invite = NULL;
    }
    free(cancel_invite_result_item);
}

cJSON *cancel_invite_result_item_convertToJSON(cancel_invite_result_item_t *cancel_invite_result_item) {
    cJSON *item = cJSON_CreateObject();

    // cancel_invite_result_item->exception
    if(cancel_invite_result_item->exception) {
    cJSON *exception_local_JSON = cancel_invite_exception_convertToJSON(cancel_invite_result_item->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // cancel_invite_result_item->invite
    if(cancel_invite_result_item->invite) {
    cJSON *invite_local_JSON = cancel_invite_result_convertToJSON(cancel_invite_result_item->invite);
    if(invite_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invite", invite_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cancel_invite_result_item_t *cancel_invite_result_item_parseFromJSON(cJSON *cancel_invite_result_itemJSON){

    cancel_invite_result_item_t *cancel_invite_result_item_local_var = NULL;

    // define the local variable for cancel_invite_result_item->exception
    cancel_invite_exception_t *exception_local_nonprim = NULL;

    // define the local variable for cancel_invite_result_item->invite
    cancel_invite_result_t *invite_local_nonprim = NULL;

    // cancel_invite_result_item->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(cancel_invite_result_itemJSON, "exception");
    if (cJSON_IsNull(exception)) {
        exception = NULL;
    }
    if (exception) { 
    exception_local_nonprim = cancel_invite_exception_parseFromJSON(exception); //nonprimitive
    }

    // cancel_invite_result_item->invite
    cJSON *invite = cJSON_GetObjectItemCaseSensitive(cancel_invite_result_itemJSON, "invite");
    if (cJSON_IsNull(invite)) {
        invite = NULL;
    }
    if (invite) { 
    invite_local_nonprim = cancel_invite_result_parseFromJSON(invite); //nonprimitive
    }



    cancel_invite_result_item_local_var = cancel_invite_result_item_create_internal (
        exception ? exception_local_nonprim : NULL,
        invite ? invite_local_nonprim : NULL
        );

    if (!cancel_invite_result_item_local_var) {
        goto end;
    }

    return cancel_invite_result_item_local_var;
end:
    if (exception_local_nonprim) {
        cancel_invite_exception_free(exception_local_nonprim);
        exception_local_nonprim = NULL;
    }
    if (invite_local_nonprim) {
        cancel_invite_result_free(invite_local_nonprim);
        invite_local_nonprim = NULL;
    }
    return NULL;

}
