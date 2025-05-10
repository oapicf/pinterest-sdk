#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_test_response.h"



static lead_form_test_response_t *lead_form_test_response_create_internal(
    char *subscription_id
    ) {
    lead_form_test_response_t *lead_form_test_response_local_var = malloc(sizeof(lead_form_test_response_t));
    if (!lead_form_test_response_local_var) {
        return NULL;
    }
    lead_form_test_response_local_var->subscription_id = subscription_id;

    lead_form_test_response_local_var->_library_owned = 1;
    return lead_form_test_response_local_var;
}

__attribute__((deprecated)) lead_form_test_response_t *lead_form_test_response_create(
    char *subscription_id
    ) {
    return lead_form_test_response_create_internal (
        subscription_id
        );
}

void lead_form_test_response_free(lead_form_test_response_t *lead_form_test_response) {
    if(NULL == lead_form_test_response){
        return ;
    }
    if(lead_form_test_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_form_test_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_test_response->subscription_id) {
        free(lead_form_test_response->subscription_id);
        lead_form_test_response->subscription_id = NULL;
    }
    free(lead_form_test_response);
}

cJSON *lead_form_test_response_convertToJSON(lead_form_test_response_t *lead_form_test_response) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_test_response->subscription_id
    if(lead_form_test_response->subscription_id) {
    if(cJSON_AddStringToObject(item, "subscription_id", lead_form_test_response->subscription_id) == NULL) {
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

lead_form_test_response_t *lead_form_test_response_parseFromJSON(cJSON *lead_form_test_responseJSON){

    lead_form_test_response_t *lead_form_test_response_local_var = NULL;

    // lead_form_test_response->subscription_id
    cJSON *subscription_id = cJSON_GetObjectItemCaseSensitive(lead_form_test_responseJSON, "subscription_id");
    if (cJSON_IsNull(subscription_id)) {
        subscription_id = NULL;
    }
    if (subscription_id) { 
    if(!cJSON_IsString(subscription_id) && !cJSON_IsNull(subscription_id))
    {
    goto end; //String
    }
    }


    lead_form_test_response_local_var = lead_form_test_response_create_internal (
        subscription_id && !cJSON_IsNull(subscription_id) ? strdup(subscription_id->valuestring) : NULL
        );

    return lead_form_test_response_local_var;
end:
    return NULL;

}
