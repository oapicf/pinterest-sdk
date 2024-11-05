#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_invites_results_response_array_items_inner_exception.h"



delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception_create(
    char *invite_id,
    char *message
    ) {
    delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception_local_var = malloc(sizeof(delete_invites_results_response_array_items_inner_exception_t));
    if (!delete_invites_results_response_array_items_inner_exception_local_var) {
        return NULL;
    }
    delete_invites_results_response_array_items_inner_exception_local_var->invite_id = invite_id;
    delete_invites_results_response_array_items_inner_exception_local_var->message = message;

    return delete_invites_results_response_array_items_inner_exception_local_var;
}


void delete_invites_results_response_array_items_inner_exception_free(delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception) {
    if(NULL == delete_invites_results_response_array_items_inner_exception){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_invites_results_response_array_items_inner_exception->invite_id) {
        free(delete_invites_results_response_array_items_inner_exception->invite_id);
        delete_invites_results_response_array_items_inner_exception->invite_id = NULL;
    }
    if (delete_invites_results_response_array_items_inner_exception->message) {
        free(delete_invites_results_response_array_items_inner_exception->message);
        delete_invites_results_response_array_items_inner_exception->message = NULL;
    }
    free(delete_invites_results_response_array_items_inner_exception);
}

cJSON *delete_invites_results_response_array_items_inner_exception_convertToJSON(delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception) {
    cJSON *item = cJSON_CreateObject();

    // delete_invites_results_response_array_items_inner_exception->invite_id
    if(delete_invites_results_response_array_items_inner_exception->invite_id) {
    if(cJSON_AddStringToObject(item, "invite_id", delete_invites_results_response_array_items_inner_exception->invite_id) == NULL) {
    goto fail; //String
    }
    }


    // delete_invites_results_response_array_items_inner_exception->message
    if(delete_invites_results_response_array_items_inner_exception->message) {
    if(cJSON_AddStringToObject(item, "message", delete_invites_results_response_array_items_inner_exception->message) == NULL) {
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

delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception_parseFromJSON(cJSON *delete_invites_results_response_array_items_inner_exceptionJSON){

    delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception_local_var = NULL;

    // delete_invites_results_response_array_items_inner_exception->invite_id
    cJSON *invite_id = cJSON_GetObjectItemCaseSensitive(delete_invites_results_response_array_items_inner_exceptionJSON, "invite_id");
    if (invite_id) { 
    if(!cJSON_IsString(invite_id) && !cJSON_IsNull(invite_id))
    {
    goto end; //String
    }
    }

    // delete_invites_results_response_array_items_inner_exception->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(delete_invites_results_response_array_items_inner_exceptionJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    delete_invites_results_response_array_items_inner_exception_local_var = delete_invites_results_response_array_items_inner_exception_create (
        invite_id && !cJSON_IsNull(invite_id) ? strdup(invite_id->valuestring) : NULL,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return delete_invites_results_response_array_items_inner_exception_local_var;
end:
    return NULL;

}
