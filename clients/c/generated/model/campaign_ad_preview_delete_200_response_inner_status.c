#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_ad_preview_delete_200_response_inner_status.h"


char* campaign_ad_preview_delete_200_response_inner_status_status_code_ToString(pinterest_rest_api_campaign_ad_preview_delete_200_response_inner_status_STATUSCODE_e status_code) {
    char* status_codeArray[] =  { "NULL", "204" };
    return status_codeArray[status_code];
}

pinterest_rest_api_campaign_ad_preview_delete_200_response_inner_status_STATUSCODE_e campaign_ad_preview_delete_200_response_inner_status_status_code_FromString(char* status_code){
    int stringToReturn = 0;
    char *status_codeArray[] =  { "NULL", "204" };
    size_t sizeofArray = sizeof(status_codeArray) / sizeof(status_codeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status_code, status_codeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status_create_internal(
    double *status_code,
    int *code,
    char *message
    ) {
    campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status_local_var = malloc(sizeof(campaign_ad_preview_delete_200_response_inner_status_t));
    if (!campaign_ad_preview_delete_200_response_inner_status_local_var) {
        return NULL;
    }
    memset(campaign_ad_preview_delete_200_response_inner_status_local_var, 0, sizeof(campaign_ad_preview_delete_200_response_inner_status_t));
    campaign_ad_preview_delete_200_response_inner_status_local_var->_library_owned = 1;
    campaign_ad_preview_delete_200_response_inner_status_local_var->status_code = status_code;
    campaign_ad_preview_delete_200_response_inner_status_local_var->code = code;
    campaign_ad_preview_delete_200_response_inner_status_local_var->message = message;
    return campaign_ad_preview_delete_200_response_inner_status_local_var;
}

__attribute__((deprecated)) campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status_create(
    double *status_code,
    int *code,
    char *message
    ) {
    double *status_code_copy = NULL;
    if (status_code) {
        status_code_copy = malloc(sizeof(double));
        if (status_code_copy) *status_code_copy = *status_code;
    }
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    campaign_ad_preview_delete_200_response_inner_status_t *result = campaign_ad_preview_delete_200_response_inner_status_create_internal (
        status_code_copy,
        code_copy,
        message
        );
    if (!result) {
        free(status_code_copy);
        free(code_copy);
    }
    return result;
}

void campaign_ad_preview_delete_200_response_inner_status_free(campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status) {
    if(NULL == campaign_ad_preview_delete_200_response_inner_status){
        return ;
    }
    if(campaign_ad_preview_delete_200_response_inner_status->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_ad_preview_delete_200_response_inner_status_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_ad_preview_delete_200_response_inner_status->status_code) {
        free(campaign_ad_preview_delete_200_response_inner_status->status_code);
        campaign_ad_preview_delete_200_response_inner_status->status_code = NULL;
    }
    if (campaign_ad_preview_delete_200_response_inner_status->code) {
        free(campaign_ad_preview_delete_200_response_inner_status->code);
        campaign_ad_preview_delete_200_response_inner_status->code = NULL;
    }
    if (campaign_ad_preview_delete_200_response_inner_status->message) {
        free(campaign_ad_preview_delete_200_response_inner_status->message);
        campaign_ad_preview_delete_200_response_inner_status->message = NULL;
    }
    free(campaign_ad_preview_delete_200_response_inner_status);
}

cJSON *campaign_ad_preview_delete_200_response_inner_status_convertToJSON(campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status) {
    cJSON *item = cJSON_CreateObject();

    // campaign_ad_preview_delete_200_response_inner_status->status_code
    if (pinterest_rest_api_campaign_ad_preview_delete_200_response_inner_status_STATUSCODE_NULL == campaign_ad_preview_delete_200_response_inner_status->status_code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "statusCode", *campaign_ad_preview_delete_200_response_inner_status->status_code) == NULL) {
    goto fail; //Numeric
    }


    // campaign_ad_preview_delete_200_response_inner_status->code
    if (!campaign_ad_preview_delete_200_response_inner_status->code) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "code", *campaign_ad_preview_delete_200_response_inner_status->code) == NULL) {
    goto fail; //Numeric
    }


    // campaign_ad_preview_delete_200_response_inner_status->message
    if (!campaign_ad_preview_delete_200_response_inner_status->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", campaign_ad_preview_delete_200_response_inner_status->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status_parseFromJSON(cJSON *campaign_ad_preview_delete_200_response_inner_statusJSON){

    campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status_local_var = NULL;

    // define the local variable for campaign_ad_preview_delete_200_response_inner_status->status_code
    double *status_code_local_var = NULL;

    // define the local variable for campaign_ad_preview_delete_200_response_inner_status->code
    int *code_local_var = NULL;

    char *message_local_str = NULL;

    // campaign_ad_preview_delete_200_response_inner_status->status_code
    cJSON *status_code = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_delete_200_response_inner_statusJSON, "statusCode");
    if (cJSON_IsNull(status_code)) {
        status_code = NULL;
    }
    if (!status_code) {
        goto end;
    }

    
    if(!cJSON_IsNumber(status_code))
    {
    goto end; //Numeric
    }
    status_code_local_var = malloc(sizeof(double));
    if(!status_code_local_var)
    {
        goto end;
    }
    *status_code_local_var = status_code->valuedouble;

    // campaign_ad_preview_delete_200_response_inner_status->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_delete_200_response_inner_statusJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    code_local_var = malloc(sizeof(int));
    if(!code_local_var)
    {
        goto end;
    }
    *code_local_var = code->valuedouble;

    // campaign_ad_preview_delete_200_response_inner_status->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(campaign_ad_preview_delete_200_response_inner_statusJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    campaign_ad_preview_delete_200_response_inner_status_local_var = campaign_ad_preview_delete_200_response_inner_status_create_internal (
        status_code_local_var,
        code_local_var,
        message_local_str
        );

    if (!campaign_ad_preview_delete_200_response_inner_status_local_var) {
        goto end;
    }

    return campaign_ad_preview_delete_200_response_inner_status_local_var;
end:
    if (status_code_local_var) {
        free(status_code_local_var);
        status_code_local_var = NULL;
    }
    if (code_local_var) {
        free(code_local_var);
        code_local_var = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
