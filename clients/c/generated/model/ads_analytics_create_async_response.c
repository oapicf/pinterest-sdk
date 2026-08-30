#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_create_async_response.h"



static ads_analytics_create_async_response_t *ads_analytics_create_async_response_create_internal(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *token
    ) {
    ads_analytics_create_async_response_t *ads_analytics_create_async_response_local_var = malloc(sizeof(ads_analytics_create_async_response_t));
    if (!ads_analytics_create_async_response_local_var) {
        return NULL;
    }
    memset(ads_analytics_create_async_response_local_var, 0, sizeof(ads_analytics_create_async_response_t));
    ads_analytics_create_async_response_local_var->_library_owned = 1;
    ads_analytics_create_async_response_local_var->message = message;
    ads_analytics_create_async_response_local_var->report_status = report_status;
    ads_analytics_create_async_response_local_var->token = token;
    return ads_analytics_create_async_response_local_var;
}

__attribute__((deprecated)) ads_analytics_create_async_response_t *ads_analytics_create_async_response_create(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *token
    ) {
    ads_analytics_create_async_response_t *result = ads_analytics_create_async_response_create_internal (
        message,
        report_status,
        token
        );
    if (!result) {
    }
    return result;
}

void ads_analytics_create_async_response_free(ads_analytics_create_async_response_t *ads_analytics_create_async_response) {
    if(NULL == ads_analytics_create_async_response){
        return ;
    }
    if(ads_analytics_create_async_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_analytics_create_async_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_analytics_create_async_response->message) {
        free(ads_analytics_create_async_response->message);
        ads_analytics_create_async_response->message = NULL;
    }
    if (ads_analytics_create_async_response->token) {
        free(ads_analytics_create_async_response->token);
        ads_analytics_create_async_response->token = NULL;
    }
    free(ads_analytics_create_async_response);
}

cJSON *ads_analytics_create_async_response_convertToJSON(ads_analytics_create_async_response_t *ads_analytics_create_async_response) {
    cJSON *item = cJSON_CreateObject();

    // ads_analytics_create_async_response->message
    if(ads_analytics_create_async_response->message) {
    if(cJSON_AddStringToObject(item, "message", ads_analytics_create_async_response->message) == NULL) {
    goto fail; //String
    }
    }


    // ads_analytics_create_async_response->report_status
    if(ads_analytics_create_async_response->report_status != pinterest_rest_api_bulk_reporting_job_status__NULL) {
    cJSON *report_status_local_JSON = bulk_reporting_job_status_convertToJSON(ads_analytics_create_async_response->report_status);
    if(report_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "report_status", report_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ads_analytics_create_async_response->token
    if(ads_analytics_create_async_response->token) {
    if(cJSON_AddStringToObject(item, "token", ads_analytics_create_async_response->token) == NULL) {
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

ads_analytics_create_async_response_t *ads_analytics_create_async_response_parseFromJSON(cJSON *ads_analytics_create_async_responseJSON){

    ads_analytics_create_async_response_t *ads_analytics_create_async_response_local_var = NULL;

    char *message_local_str = NULL;

    // define the local variable for ads_analytics_create_async_response->report_status
    pinterest_rest_api_bulk_reporting_job_status__e report_status_local_nonprim = 0;

    char *token_local_str = NULL;

    // ads_analytics_create_async_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(ads_analytics_create_async_responseJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // ads_analytics_create_async_response->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(ads_analytics_create_async_responseJSON, "report_status");
    if (cJSON_IsNull(report_status)) {
        report_status = NULL;
    }
    if (report_status) { 
    report_status_local_nonprim = bulk_reporting_job_status_parseFromJSON(report_status); //custom
    }

    // ads_analytics_create_async_response->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(ads_analytics_create_async_responseJSON, "token");
    if (cJSON_IsNull(token)) {
        token = NULL;
    }
    if (token) { 
    if(!cJSON_IsString(token) && !cJSON_IsNull(token))
    {
    goto end; //String
    }
    }


    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);
    if (token && !cJSON_IsNull(token)) token_local_str = strdup(token->valuestring);

    ads_analytics_create_async_response_local_var = ads_analytics_create_async_response_create_internal (
        message_local_str,
        report_status ? report_status_local_nonprim : 0,
        token_local_str
        );

    if (!ads_analytics_create_async_response_local_var) {
        goto end;
    }

    return ads_analytics_create_async_response_local_var;
end:
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    if (report_status_local_nonprim) {
        report_status_local_nonprim = 0;
    }
    if (token_local_str) {
        free(token_local_str);
        token_local_str = NULL;
    }
    return NULL;

}
