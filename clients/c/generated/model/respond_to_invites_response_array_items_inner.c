#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "respond_to_invites_response_array_items_inner.h"



static respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner_create_internal(
    invite_exception_response_t *exception,
    base_invite_data_response_t *invite
    ) {
    respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner_local_var = malloc(sizeof(respond_to_invites_response_array_items_inner_t));
    if (!respond_to_invites_response_array_items_inner_local_var) {
        return NULL;
    }
    respond_to_invites_response_array_items_inner_local_var->exception = exception;
    respond_to_invites_response_array_items_inner_local_var->invite = invite;

    respond_to_invites_response_array_items_inner_local_var->_library_owned = 1;
    return respond_to_invites_response_array_items_inner_local_var;
}

__attribute__((deprecated)) respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner_create(
    invite_exception_response_t *exception,
    base_invite_data_response_t *invite
    ) {
    return respond_to_invites_response_array_items_inner_create_internal (
        exception,
        invite
        );
}

void respond_to_invites_response_array_items_inner_free(respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner) {
    if(NULL == respond_to_invites_response_array_items_inner){
        return ;
    }
    if(respond_to_invites_response_array_items_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "respond_to_invites_response_array_items_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (respond_to_invites_response_array_items_inner->exception) {
        invite_exception_response_free(respond_to_invites_response_array_items_inner->exception);
        respond_to_invites_response_array_items_inner->exception = NULL;
    }
    if (respond_to_invites_response_array_items_inner->invite) {
        base_invite_data_response_free(respond_to_invites_response_array_items_inner->invite);
        respond_to_invites_response_array_items_inner->invite = NULL;
    }
    free(respond_to_invites_response_array_items_inner);
}

cJSON *respond_to_invites_response_array_items_inner_convertToJSON(respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // respond_to_invites_response_array_items_inner->exception
    if(respond_to_invites_response_array_items_inner->exception) {
    cJSON *exception_local_JSON = invite_exception_response_convertToJSON(respond_to_invites_response_array_items_inner->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // respond_to_invites_response_array_items_inner->invite
    if(respond_to_invites_response_array_items_inner->invite) {
    cJSON *invite_local_JSON = base_invite_data_response_convertToJSON(respond_to_invites_response_array_items_inner->invite);
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

respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner_parseFromJSON(cJSON *respond_to_invites_response_array_items_innerJSON){

    respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner_local_var = NULL;

    // define the local variable for respond_to_invites_response_array_items_inner->exception
    invite_exception_response_t *exception_local_nonprim = NULL;

    // define the local variable for respond_to_invites_response_array_items_inner->invite
    base_invite_data_response_t *invite_local_nonprim = NULL;

    // respond_to_invites_response_array_items_inner->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(respond_to_invites_response_array_items_innerJSON, "exception");
    if (cJSON_IsNull(exception)) {
        exception = NULL;
    }
    if (exception) { 
    exception_local_nonprim = invite_exception_response_parseFromJSON(exception); //nonprimitive
    }

    // respond_to_invites_response_array_items_inner->invite
    cJSON *invite = cJSON_GetObjectItemCaseSensitive(respond_to_invites_response_array_items_innerJSON, "invite");
    if (cJSON_IsNull(invite)) {
        invite = NULL;
    }
    if (invite) { 
    invite_local_nonprim = base_invite_data_response_parseFromJSON(invite); //nonprimitive
    }


    respond_to_invites_response_array_items_inner_local_var = respond_to_invites_response_array_items_inner_create_internal (
        exception ? exception_local_nonprim : NULL,
        invite ? invite_local_nonprim : NULL
        );

    return respond_to_invites_response_array_items_inner_local_var;
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
