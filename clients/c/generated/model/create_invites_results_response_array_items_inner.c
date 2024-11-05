#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_invites_results_response_array_items_inner.h"



create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner_create(
    invite_exception_response_t *exception,
    create_invites_results_response_array_items_inner_invite_t *invite
    ) {
    create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner_local_var = malloc(sizeof(create_invites_results_response_array_items_inner_t));
    if (!create_invites_results_response_array_items_inner_local_var) {
        return NULL;
    }
    create_invites_results_response_array_items_inner_local_var->exception = exception;
    create_invites_results_response_array_items_inner_local_var->invite = invite;

    return create_invites_results_response_array_items_inner_local_var;
}


void create_invites_results_response_array_items_inner_free(create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner) {
    if(NULL == create_invites_results_response_array_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (create_invites_results_response_array_items_inner->exception) {
        invite_exception_response_free(create_invites_results_response_array_items_inner->exception);
        create_invites_results_response_array_items_inner->exception = NULL;
    }
    if (create_invites_results_response_array_items_inner->invite) {
        create_invites_results_response_array_items_inner_invite_free(create_invites_results_response_array_items_inner->invite);
        create_invites_results_response_array_items_inner->invite = NULL;
    }
    free(create_invites_results_response_array_items_inner);
}

cJSON *create_invites_results_response_array_items_inner_convertToJSON(create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_invites_results_response_array_items_inner->exception
    if(create_invites_results_response_array_items_inner->exception) {
    cJSON *exception_local_JSON = invite_exception_response_convertToJSON(create_invites_results_response_array_items_inner->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_invites_results_response_array_items_inner->invite
    if(create_invites_results_response_array_items_inner->invite) {
    cJSON *invite_local_JSON = create_invites_results_response_array_items_inner_invite_convertToJSON(create_invites_results_response_array_items_inner->invite);
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

create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner_parseFromJSON(cJSON *create_invites_results_response_array_items_innerJSON){

    create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner_local_var = NULL;

    // define the local variable for create_invites_results_response_array_items_inner->exception
    invite_exception_response_t *exception_local_nonprim = NULL;

    // define the local variable for create_invites_results_response_array_items_inner->invite
    create_invites_results_response_array_items_inner_invite_t *invite_local_nonprim = NULL;

    // create_invites_results_response_array_items_inner->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(create_invites_results_response_array_items_innerJSON, "exception");
    if (exception) { 
    exception_local_nonprim = invite_exception_response_parseFromJSON(exception); //nonprimitive
    }

    // create_invites_results_response_array_items_inner->invite
    cJSON *invite = cJSON_GetObjectItemCaseSensitive(create_invites_results_response_array_items_innerJSON, "invite");
    if (invite) { 
    invite_local_nonprim = create_invites_results_response_array_items_inner_invite_parseFromJSON(invite); //nonprimitive
    }


    create_invites_results_response_array_items_inner_local_var = create_invites_results_response_array_items_inner_create (
        exception ? exception_local_nonprim : NULL,
        invite ? invite_local_nonprim : NULL
        );

    return create_invites_results_response_array_items_inner_local_var;
end:
    if (exception_local_nonprim) {
        invite_exception_response_free(exception_local_nonprim);
        exception_local_nonprim = NULL;
    }
    if (invite_local_nonprim) {
        create_invites_results_response_array_items_inner_invite_free(invite_local_nonprim);
        invite_local_nonprim = NULL;
    }
    return NULL;

}
