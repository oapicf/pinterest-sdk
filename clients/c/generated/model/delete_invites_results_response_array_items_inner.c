#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_invites_results_response_array_items_inner.h"



delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner_create(
    delete_invites_results_response_array_items_inner_exception_t *exception,
    base_invite_data_response_t *invite
    ) {
    delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner_local_var = malloc(sizeof(delete_invites_results_response_array_items_inner_t));
    if (!delete_invites_results_response_array_items_inner_local_var) {
        return NULL;
    }
    delete_invites_results_response_array_items_inner_local_var->exception = exception;
    delete_invites_results_response_array_items_inner_local_var->invite = invite;

    return delete_invites_results_response_array_items_inner_local_var;
}


void delete_invites_results_response_array_items_inner_free(delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner) {
    if(NULL == delete_invites_results_response_array_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_invites_results_response_array_items_inner->exception) {
        delete_invites_results_response_array_items_inner_exception_free(delete_invites_results_response_array_items_inner->exception);
        delete_invites_results_response_array_items_inner->exception = NULL;
    }
    if (delete_invites_results_response_array_items_inner->invite) {
        base_invite_data_response_free(delete_invites_results_response_array_items_inner->invite);
        delete_invites_results_response_array_items_inner->invite = NULL;
    }
    free(delete_invites_results_response_array_items_inner);
}

cJSON *delete_invites_results_response_array_items_inner_convertToJSON(delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // delete_invites_results_response_array_items_inner->exception
    if(delete_invites_results_response_array_items_inner->exception) {
    cJSON *exception_local_JSON = delete_invites_results_response_array_items_inner_exception_convertToJSON(delete_invites_results_response_array_items_inner->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // delete_invites_results_response_array_items_inner->invite
    if(delete_invites_results_response_array_items_inner->invite) {
    cJSON *invite_local_JSON = base_invite_data_response_convertToJSON(delete_invites_results_response_array_items_inner->invite);
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

delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner_parseFromJSON(cJSON *delete_invites_results_response_array_items_innerJSON){

    delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner_local_var = NULL;

    // define the local variable for delete_invites_results_response_array_items_inner->exception
    delete_invites_results_response_array_items_inner_exception_t *exception_local_nonprim = NULL;

    // define the local variable for delete_invites_results_response_array_items_inner->invite
    base_invite_data_response_t *invite_local_nonprim = NULL;

    // delete_invites_results_response_array_items_inner->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(delete_invites_results_response_array_items_innerJSON, "exception");
    if (exception) { 
    exception_local_nonprim = delete_invites_results_response_array_items_inner_exception_parseFromJSON(exception); //nonprimitive
    }

    // delete_invites_results_response_array_items_inner->invite
    cJSON *invite = cJSON_GetObjectItemCaseSensitive(delete_invites_results_response_array_items_innerJSON, "invite");
    if (invite) { 
    invite_local_nonprim = base_invite_data_response_parseFromJSON(invite); //nonprimitive
    }


    delete_invites_results_response_array_items_inner_local_var = delete_invites_results_response_array_items_inner_create (
        exception ? exception_local_nonprim : NULL,
        invite ? invite_local_nonprim : NULL
        );

    return delete_invites_results_response_array_items_inner_local_var;
end:
    if (exception_local_nonprim) {
        delete_invites_results_response_array_items_inner_exception_free(exception_local_nonprim);
        exception_local_nonprim = NULL;
    }
    if (invite_local_nonprim) {
        base_invite_data_response_free(invite_local_nonprim);
        invite_local_nonprim = NULL;
    }
    return NULL;

}
