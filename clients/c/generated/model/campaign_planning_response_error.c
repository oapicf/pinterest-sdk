#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_response_error.h"



static campaign_planning_response_error_t *campaign_planning_response_error_create_internal(
    pinterest_rest_api_campaign_planning_response_error_code__e code,
    char *message
    ) {
    campaign_planning_response_error_t *campaign_planning_response_error_local_var = malloc(sizeof(campaign_planning_response_error_t));
    if (!campaign_planning_response_error_local_var) {
        return NULL;
    }
    memset(campaign_planning_response_error_local_var, 0, sizeof(campaign_planning_response_error_t));
    campaign_planning_response_error_local_var->_library_owned = 1;
    campaign_planning_response_error_local_var->code = code;
    campaign_planning_response_error_local_var->message = message;
    return campaign_planning_response_error_local_var;
}

__attribute__((deprecated)) campaign_planning_response_error_t *campaign_planning_response_error_create(
    pinterest_rest_api_campaign_planning_response_error_code__e code,
    char *message
    ) {
    campaign_planning_response_error_t *result = campaign_planning_response_error_create_internal (
        code,
        message
        );
    if (!result) {
    }
    return result;
}

void campaign_planning_response_error_free(campaign_planning_response_error_t *campaign_planning_response_error) {
    if(NULL == campaign_planning_response_error){
        return ;
    }
    if(campaign_planning_response_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_response_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_response_error->message) {
        free(campaign_planning_response_error->message);
        campaign_planning_response_error->message = NULL;
    }
    free(campaign_planning_response_error);
}

cJSON *campaign_planning_response_error_convertToJSON(campaign_planning_response_error_t *campaign_planning_response_error) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_response_error->code
    if(campaign_planning_response_error->code != pinterest_rest_api_campaign_planning_response_error_code__NULL) {
    cJSON *code_local_JSON = campaign_planning_response_error_code_convertToJSON(campaign_planning_response_error->code);
    if(code_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "code", code_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_planning_response_error->message
    if(campaign_planning_response_error->message) {
    if(cJSON_AddStringToObject(item, "message", campaign_planning_response_error->message) == NULL) {
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

campaign_planning_response_error_t *campaign_planning_response_error_parseFromJSON(cJSON *campaign_planning_response_errorJSON){

    campaign_planning_response_error_t *campaign_planning_response_error_local_var = NULL;

    // define the local variable for campaign_planning_response_error->code
    pinterest_rest_api_campaign_planning_response_error_code__e code_local_nonprim = 0;

    char *message_local_str = NULL;

    // campaign_planning_response_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(campaign_planning_response_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    code_local_nonprim = campaign_planning_response_error_code_parseFromJSON(code); //custom
    }

    // campaign_planning_response_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(campaign_planning_response_errorJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    campaign_planning_response_error_local_var = campaign_planning_response_error_create_internal (
        code ? code_local_nonprim : 0,
        message_local_str
        );

    if (!campaign_planning_response_error_local_var) {
        goto end;
    }

    return campaign_planning_response_error_local_var;
end:
    if (code_local_nonprim) {
        code_local_nonprim = 0;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
