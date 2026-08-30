#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_test.h"



static lead_form_test_t *lead_form_test_create_internal(
    char *subscription_id
    ) {
    lead_form_test_t *lead_form_test_local_var = malloc(sizeof(lead_form_test_t));
    if (!lead_form_test_local_var) {
        return NULL;
    }
    memset(lead_form_test_local_var, 0, sizeof(lead_form_test_t));
    lead_form_test_local_var->_library_owned = 1;
    lead_form_test_local_var->subscription_id = subscription_id;
    return lead_form_test_local_var;
}

__attribute__((deprecated)) lead_form_test_t *lead_form_test_create(
    char *subscription_id
    ) {
    lead_form_test_t *result = lead_form_test_create_internal (
        subscription_id
        );
    if (!result) {
    }
    return result;
}

void lead_form_test_free(lead_form_test_t *lead_form_test) {
    if(NULL == lead_form_test){
        return ;
    }
    if(lead_form_test->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_form_test_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_test->subscription_id) {
        free(lead_form_test->subscription_id);
        lead_form_test->subscription_id = NULL;
    }
    free(lead_form_test);
}

cJSON *lead_form_test_convertToJSON(lead_form_test_t *lead_form_test) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_test->subscription_id
    if(lead_form_test->subscription_id) {
    if(cJSON_AddStringToObject(item, "subscription_id", lead_form_test->subscription_id) == NULL) {
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

lead_form_test_t *lead_form_test_parseFromJSON(cJSON *lead_form_testJSON){

    lead_form_test_t *lead_form_test_local_var = NULL;

    char *subscription_id_local_str = NULL;

    // lead_form_test->subscription_id
    cJSON *subscription_id = cJSON_GetObjectItemCaseSensitive(lead_form_testJSON, "subscription_id");
    if (cJSON_IsNull(subscription_id)) {
        subscription_id = NULL;
    }
    if (subscription_id) { 
    if(!cJSON_IsString(subscription_id) && !cJSON_IsNull(subscription_id))
    {
    goto end; //String
    }
    }


    if (subscription_id && !cJSON_IsNull(subscription_id)) subscription_id_local_str = strdup(subscription_id->valuestring);

    lead_form_test_local_var = lead_form_test_create_internal (
        subscription_id_local_str
        );

    if (!lead_form_test_local_var) {
        goto end;
    }

    return lead_form_test_local_var;
end:
    if (subscription_id_local_str) {
        free(subscription_id_local_str);
        subscription_id_local_str = NULL;
    }
    return NULL;

}
