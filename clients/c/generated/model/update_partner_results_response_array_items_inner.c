#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_partner_results_response_array_items_inner.h"



update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner_create(
    business_access_error_t *exception,
    char *member_or_partner_id
    ) {
    update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner_local_var = malloc(sizeof(update_partner_results_response_array_items_inner_t));
    if (!update_partner_results_response_array_items_inner_local_var) {
        return NULL;
    }
    update_partner_results_response_array_items_inner_local_var->exception = exception;
    update_partner_results_response_array_items_inner_local_var->member_or_partner_id = member_or_partner_id;

    return update_partner_results_response_array_items_inner_local_var;
}


void update_partner_results_response_array_items_inner_free(update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner) {
    if(NULL == update_partner_results_response_array_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (update_partner_results_response_array_items_inner->exception) {
        business_access_error_free(update_partner_results_response_array_items_inner->exception);
        update_partner_results_response_array_items_inner->exception = NULL;
    }
    if (update_partner_results_response_array_items_inner->member_or_partner_id) {
        free(update_partner_results_response_array_items_inner->member_or_partner_id);
        update_partner_results_response_array_items_inner->member_or_partner_id = NULL;
    }
    free(update_partner_results_response_array_items_inner);
}

cJSON *update_partner_results_response_array_items_inner_convertToJSON(update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // update_partner_results_response_array_items_inner->exception
    if(update_partner_results_response_array_items_inner->exception) {
    cJSON *exception_local_JSON = business_access_error_convertToJSON(update_partner_results_response_array_items_inner->exception);
    if(exception_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exception", exception_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_partner_results_response_array_items_inner->member_or_partner_id
    if(update_partner_results_response_array_items_inner->member_or_partner_id) {
    if(cJSON_AddStringToObject(item, "member_or_partner_id", update_partner_results_response_array_items_inner->member_or_partner_id) == NULL) {
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

update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner_parseFromJSON(cJSON *update_partner_results_response_array_items_innerJSON){

    update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner_local_var = NULL;

    // define the local variable for update_partner_results_response_array_items_inner->exception
    business_access_error_t *exception_local_nonprim = NULL;

    // update_partner_results_response_array_items_inner->exception
    cJSON *exception = cJSON_GetObjectItemCaseSensitive(update_partner_results_response_array_items_innerJSON, "exception");
    if (exception) { 
    exception_local_nonprim = business_access_error_parseFromJSON(exception); //nonprimitive
    }

    // update_partner_results_response_array_items_inner->member_or_partner_id
    cJSON *member_or_partner_id = cJSON_GetObjectItemCaseSensitive(update_partner_results_response_array_items_innerJSON, "member_or_partner_id");
    if (member_or_partner_id) { 
    if(!cJSON_IsString(member_or_partner_id) && !cJSON_IsNull(member_or_partner_id))
    {
    goto end; //String
    }
    }


    update_partner_results_response_array_items_inner_local_var = update_partner_results_response_array_items_inner_create (
        exception ? exception_local_nonprim : NULL,
        member_or_partner_id && !cJSON_IsNull(member_or_partner_id) ? strdup(member_or_partner_id->valuestring) : NULL
        );

    return update_partner_results_response_array_items_inner_local_var;
end:
    if (exception_local_nonprim) {
        business_access_error_free(exception_local_nonprim);
        exception_local_nonprim = NULL;
    }
    return NULL;

}
