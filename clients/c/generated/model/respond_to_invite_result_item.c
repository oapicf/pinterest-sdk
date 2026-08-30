#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "respond_to_invite_result_item.h"



static respond_to_invite_result_item_t *respond_to_invite_result_item_create_internal(
    invite_exception_response_t *exception,
    base_invite_data_response_t *invite
    ) {
    respond_to_invite_result_item_t *respond_to_invite_result_item_local_var = malloc(sizeof(respond_to_invite_result_item_t));
    if (!respond_to_invite_result_item_local_var) {
        return NULL;
    }
    memset(respond_to_invite_result_item_local_var, 0, sizeof(respond_to_invite_result_item_t));
    respond_to_invite_result_item_local_var->_library_owned = 1;
    respond_to_invite_result_item_local_var->exception = exception;
    respond_to_invite_result_item_local_var->invite = invite;
    return respond_to_invite_result_item_local_var;
}

__attribute__((deprecated)) respond_to_invite_result_item_t *respond_to_invite_result_item_create(
    invite_exception_response_t *exception,
    base_invite_data_response_t *invite
    ) {
    respond_to_invite_result_item_t *result = respond_to_invite_result_item_create_internal (
        exception,
        invite
        );
    if (!result) {
    }
    return result;
}

void respond_to_invite_result_item_free(respond_to_invite_result_item_t *respond_to_invite_result_item) {
    if(NULL == respond_to_invite_result_item){
        return ;
    }
    if(respond_to_invite_result_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "respond_to_invite_result_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (respond_to_invite_result_item->exception) {
        invite_exception_response_free(respond_to_invite_result_item->exception);
        respond_to_invite_result_item->exception = NULL;
    }
    if (respond_to_invite_result_item->invite) {
        base_invite_data_response_free(respond_to_invite_result_item->invite);
        respond_to_invite_result_item->invite = NULL;
    }
    free(respond_to_invite_result_item);
}

cJSON *respond_to_invite_result_item_convertToJSON(respond_to_invite_result_item_t *respond_to_invite_result_item) {
    cJSON *item = cJSON_CreateObject();

    // respond_to_invite_result_item->exception
    if(respond_to_invite_result_item->exception) {
    cJSON *exception_local_JSON = invite_exception_response_convertToJSON(respond_to_invite_result_item->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // respond_to_invite_result_item->invite
    if(respond_to_invite_result_item->invite) {
    cJSON *invite_local_JSON = base_invite_data_response_convertToJSON(respond_to_invite_result_item->invite);
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

respond_to_invite_result_item_t *respond_to_invite_result_item_parseFromJSON(cJSON *respond_to_invite_result_itemJSON){

    respond_to_invite_result_item_t *respond_to_invite_result_item_local_var = NULL;

    // define the local variable for respond_to_invite_result_item->exception
    invite_exception_response_t *exception_local_nonprim = NULL;

    // define the local variable for respond_to_invite_result_item->invite
    base_invite_data_response_t *invite_local_nonprim = NULL;

    // respond_to_invite_result_item->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(respond_to_invite_result_itemJSON, "exception");
    if (cJSON_IsNull(exception)) {
        exception = NULL;
    }
    if (exception) { 
    exception_local_nonprim = invite_exception_response_parseFromJSON(exception); //nonprimitive
    }

    // respond_to_invite_result_item->invite
    cJSON *invite = cJSON_GetObjectItemCaseSensitive(respond_to_invite_result_itemJSON, "invite");
    if (cJSON_IsNull(invite)) {
        invite = NULL;
    }
    if (invite) { 
    invite_local_nonprim = base_invite_data_response_parseFromJSON(invite); //nonprimitive
    }



    respond_to_invite_result_item_local_var = respond_to_invite_result_item_create_internal (
        exception ? exception_local_nonprim : NULL,
        invite ? invite_local_nonprim : NULL
        );

    if (!respond_to_invite_result_item_local_var) {
        goto end;
    }

    return respond_to_invite_result_item_local_var;
end:
    if (exception_local_nonprim) {
        invite_exception_response_free(exception_local_nonprim);
        exception_local_nonprim = NULL;
    }
    if (invite_local_nonprim) {
        base_invite_data_response_free(invite_local_nonprim);
        invite_local_nonprim = NULL;
    }
    return NULL;

}
