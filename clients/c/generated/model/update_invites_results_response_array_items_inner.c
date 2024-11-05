#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_invites_results_response_array_items_inner.h"



update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner_create(
    invite_exception_response_t *exception,
    invite_business_role_binding_t *invite
    ) {
    update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner_local_var = malloc(sizeof(update_invites_results_response_array_items_inner_t));
    if (!update_invites_results_response_array_items_inner_local_var) {
        return NULL;
    }
    update_invites_results_response_array_items_inner_local_var->exception = exception;
    update_invites_results_response_array_items_inner_local_var->invite = invite;

    return update_invites_results_response_array_items_inner_local_var;
}


void update_invites_results_response_array_items_inner_free(update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner) {
    if(NULL == update_invites_results_response_array_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (update_invites_results_response_array_items_inner->exception) {
        invite_exception_response_free(update_invites_results_response_array_items_inner->exception);
        update_invites_results_response_array_items_inner->exception = NULL;
    }
    if (update_invites_results_response_array_items_inner->invite) {
        invite_business_role_binding_free(update_invites_results_response_array_items_inner->invite);
        update_invites_results_response_array_items_inner->invite = NULL;
    }
    free(update_invites_results_response_array_items_inner);
}

cJSON *update_invites_results_response_array_items_inner_convertToJSON(update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // update_invites_results_response_array_items_inner->exception
    if(update_invites_results_response_array_items_inner->exception) {
    cJSON *exception_local_JSON = invite_exception_response_convertToJSON(update_invites_results_response_array_items_inner->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_invites_results_response_array_items_inner->invite
    if(update_invites_results_response_array_items_inner->invite) {
    cJSON *invite_local_JSON = invite_business_role_binding_convertToJSON(update_invites_results_response_array_items_inner->invite);
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

update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner_parseFromJSON(cJSON *update_invites_results_response_array_items_innerJSON){

    update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner_local_var = NULL;

    // define the local variable for update_invites_results_response_array_items_inner->exception
    invite_exception_response_t *exception_local_nonprim = NULL;

    // define the local variable for update_invites_results_response_array_items_inner->invite
    invite_business_role_binding_t *invite_local_nonprim = NULL;

    // update_invites_results_response_array_items_inner->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(update_invites_results_response_array_items_innerJSON, "exception");
    if (exception) { 
    exception_local_nonprim = invite_exception_response_parseFromJSON(exception); //nonprimitive
    }

    // update_invites_results_response_array_items_inner->invite
    cJSON *invite = cJSON_GetObjectItemCaseSensitive(update_invites_results_response_array_items_innerJSON, "invite");
    if (invite) { 
    invite_local_nonprim = invite_business_role_binding_parseFromJSON(invite); //nonprimitive
    }


    update_invites_results_response_array_items_inner_local_var = update_invites_results_response_array_items_inner_create (
        exception ? exception_local_nonprim : NULL,
        invite ? invite_local_nonprim : NULL
        );

    return update_invites_results_response_array_items_inner_local_var;
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
