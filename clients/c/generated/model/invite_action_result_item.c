#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_action_result_item.h"



static invite_action_result_item_t *invite_action_result_item_create_internal(
    invite_exception_response_t *exception,
    invite_business_role_binding_t *invite
    ) {
    invite_action_result_item_t *invite_action_result_item_local_var = malloc(sizeof(invite_action_result_item_t));
    if (!invite_action_result_item_local_var) {
        return NULL;
    }
    memset(invite_action_result_item_local_var, 0, sizeof(invite_action_result_item_t));
    invite_action_result_item_local_var->_library_owned = 1;
    invite_action_result_item_local_var->exception = exception;
    invite_action_result_item_local_var->invite = invite;
    return invite_action_result_item_local_var;
}

__attribute__((deprecated)) invite_action_result_item_t *invite_action_result_item_create(
    invite_exception_response_t *exception,
    invite_business_role_binding_t *invite
    ) {
    invite_action_result_item_t *result = invite_action_result_item_create_internal (
        exception,
        invite
        );
    if (!result) {
    }
    return result;
}

void invite_action_result_item_free(invite_action_result_item_t *invite_action_result_item) {
    if(NULL == invite_action_result_item){
        return ;
    }
    if(invite_action_result_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_action_result_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_action_result_item->exception) {
        invite_exception_response_free(invite_action_result_item->exception);
        invite_action_result_item->exception = NULL;
    }
    if (invite_action_result_item->invite) {
        invite_business_role_binding_free(invite_action_result_item->invite);
        invite_action_result_item->invite = NULL;
    }
    free(invite_action_result_item);
}

cJSON *invite_action_result_item_convertToJSON(invite_action_result_item_t *invite_action_result_item) {
    cJSON *item = cJSON_CreateObject();

    // invite_action_result_item->exception
    if(invite_action_result_item->exception) {
    cJSON *exception_local_JSON = invite_exception_response_convertToJSON(invite_action_result_item->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // invite_action_result_item->invite
    if(invite_action_result_item->invite) {
    cJSON *invite_local_JSON = invite_business_role_binding_convertToJSON(invite_action_result_item->invite);
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

invite_action_result_item_t *invite_action_result_item_parseFromJSON(cJSON *invite_action_result_itemJSON){

    invite_action_result_item_t *invite_action_result_item_local_var = NULL;

    // define the local variable for invite_action_result_item->exception
    invite_exception_response_t *exception_local_nonprim = NULL;

    // define the local variable for invite_action_result_item->invite
    invite_business_role_binding_t *invite_local_nonprim = NULL;

    // invite_action_result_item->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(invite_action_result_itemJSON, "exception");
    if (cJSON_IsNull(exception)) {
        exception = NULL;
    }
    if (exception) { 
    exception_local_nonprim = invite_exception_response_parseFromJSON(exception); //nonprimitive
    }

    // invite_action_result_item->invite
    cJSON *invite = cJSON_GetObjectItemCaseSensitive(invite_action_result_itemJSON, "invite");
    if (cJSON_IsNull(invite)) {
        invite = NULL;
    }
    if (invite) { 
    invite_local_nonprim = invite_business_role_binding_parseFromJSON(invite); //nonprimitive
    }



    invite_action_result_item_local_var = invite_action_result_item_create_internal (
        exception ? exception_local_nonprim : NULL,
        invite ? invite_local_nonprim : NULL
        );

    if (!invite_action_result_item_local_var) {
        goto end;
    }

    return invite_action_result_item_local_var;
end:
    if (exception_local_nonprim) {
        invite_exception_response_free(exception_local_nonprim);
        exception_local_nonprim = NULL;
    }
    if (invite_local_nonprim) {
        invite_business_role_binding_free(invite_local_nonprim);
        invite_local_nonprim = NULL;
    }
    return NULL;

}
