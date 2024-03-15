#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_create_async_response.h"



ads_analytics_create_async_response_t *ads_analytics_create_async_response_create(
    bulk_reporting_job_status_t *report_status,
    char *token,
    char *message
    ) {
    ads_analytics_create_async_response_t *ads_analytics_create_async_response_local_var = malloc(sizeof(ads_analytics_create_async_response_t));
    if (!ads_analytics_create_async_response_local_var) {
        return NULL;
    }
    ads_analytics_create_async_response_local_var->report_status = report_status;
    ads_analytics_create_async_response_local_var->token = token;
    ads_analytics_create_async_response_local_var->message = message;

    return ads_analytics_create_async_response_local_var;
}


void ads_analytics_create_async_response_free(ads_analytics_create_async_response_t *ads_analytics_create_async_response) {
    if(NULL == ads_analytics_create_async_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ads_analytics_create_async_response->report_status) {
        bulk_reporting_job_status_free(ads_analytics_create_async_response->report_status);
        ads_analytics_create_async_response->report_status = NULL;
    }
    if (ads_analytics_create_async_response->token) {
        free(ads_analytics_create_async_response->token);
        ads_analytics_create_async_response->token = NULL;
    }
    if (ads_analytics_create_async_response->message) {
        free(ads_analytics_create_async_response->message);
        ads_analytics_create_async_response->message = NULL;
    }
    free(ads_analytics_create_async_response);
}

cJSON *ads_analytics_create_async_response_convertToJSON(ads_analytics_create_async_response_t *ads_analytics_create_async_response) {
    cJSON *item = cJSON_CreateObject();

    // ads_analytics_create_async_response->report_status
    if(ads_analytics_create_async_response->report_status) {
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


    // ads_analytics_create_async_response->message
    if(ads_analytics_create_async_response->message) {
    if(cJSON_AddStringToObject(item, "message", ads_analytics_create_async_response->message) == NULL) {
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

    // define the local variable for ads_analytics_create_async_response->report_status
    bulk_reporting_job_status_t *report_status_local_nonprim = NULL;

    // ads_analytics_create_async_response->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(ads_analytics_create_async_responseJSON, "report_status");
    if (report_status) { 
    report_status_local_nonprim = bulk_reporting_job_status_parseFromJSON(report_status); //custom
    }

    // ads_analytics_create_async_response->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(ads_analytics_create_async_responseJSON, "token");
    if (token) { 
    if(!cJSON_IsString(token) && !cJSON_IsNull(token))
    {
    goto end; //String
    }
    }

    // ads_analytics_create_async_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(ads_analytics_create_async_responseJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    ads_analytics_create_async_response_local_var = ads_analytics_create_async_response_create (
        report_status ? report_status_local_nonprim : NULL,
        token && !cJSON_IsNull(token) ? strdup(token->valuestring) : NULL,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL
        );

    return ads_analytics_create_async_response_local_var;
end:
    if (report_status_local_nonprim) {
        bulk_reporting_job_status_free(report_status_local_nonprim);
        report_status_local_nonprim = NULL;
    }
    return NULL;

}
