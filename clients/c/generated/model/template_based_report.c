#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "template_based_report.h"



static template_based_report_t *template_based_report_create_internal(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *template_id,
    char *token
    ) {
    template_based_report_t *template_based_report_local_var = malloc(sizeof(template_based_report_t));
    if (!template_based_report_local_var) {
        return NULL;
    }
    template_based_report_local_var->message = message;
    template_based_report_local_var->report_status = report_status;
    template_based_report_local_var->template_id = template_id;
    template_based_report_local_var->token = token;

    template_based_report_local_var->_library_owned = 1;
    return template_based_report_local_var;
}

__attribute__((deprecated)) template_based_report_t *template_based_report_create(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *template_id,
    char *token
    ) {
    return template_based_report_create_internal (
        message,
        report_status,
        template_id,
        token
        );
}

void template_based_report_free(template_based_report_t *template_based_report) {
    if(NULL == template_based_report){
        return ;
    }
    if(template_based_report->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "template_based_report_free");
        return ;
    }
    listEntry_t *listEntry;
    if (template_based_report->message) {
        free(template_based_report->message);
        template_based_report->message = NULL;
    }
    if (template_based_report->template_id) {
        free(template_based_report->template_id);
        template_based_report->template_id = NULL;
    }
    if (template_based_report->token) {
        free(template_based_report->token);
        template_based_report->token = NULL;
    }
    free(template_based_report);
}

cJSON *template_based_report_convertToJSON(template_based_report_t *template_based_report) {
    cJSON *item = cJSON_CreateObject();

    // template_based_report->message
    if(template_based_report->message) {
    if(cJSON_AddStringToObject(item, "message", template_based_report->message) == NULL) {
    goto fail; //String
    }
    }


    // template_based_report->report_status
    if (pinterest_rest_api_bulk_reporting_job_status__NULL == template_based_report->report_status) {
        goto fail;
    }
    cJSON *report_status_local_JSON = bulk_reporting_job_status_convertToJSON(template_based_report->report_status);
    if(report_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "report_status", report_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // template_based_report->template_id
    if (!template_based_report->template_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "template_id", template_based_report->template_id) == NULL) {
    goto fail; //String
    }


    // template_based_report->token
    if(template_based_report->token) {
    if(cJSON_AddStringToObject(item, "token", template_based_report->token) == NULL) {
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

template_based_report_t *template_based_report_parseFromJSON(cJSON *template_based_reportJSON){

    template_based_report_t *template_based_report_local_var = NULL;

    // define the local variable for template_based_report->report_status
    pinterest_rest_api_bulk_reporting_job_status__e report_status_local_nonprim = 0;

    // template_based_report->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(template_based_reportJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // template_based_report->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(template_based_reportJSON, "report_status");
    if (cJSON_IsNull(report_status)) {
        report_status = NULL;
    }
    if (!report_status) {
        goto end;
    }

    
    report_status_local_nonprim = bulk_reporting_job_status_parseFromJSON(report_status); //custom

    // template_based_report->template_id
    cJSON *template_id = cJSON_GetObjectItemCaseSensitive(template_based_reportJSON, "template_id");
    if (cJSON_IsNull(template_id)) {
        template_id = NULL;
    }
    if (!template_id) {
        goto end;
    }

    
    if(!cJSON_IsString(template_id))
    {
    goto end; //String
    }

    // template_based_report->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(template_based_reportJSON, "token");
    if (cJSON_IsNull(token)) {
        token = NULL;
    }
    if (token) { 
    if(!cJSON_IsString(token) && !cJSON_IsNull(token))
    {
    goto end; //String
    }
    }


    template_based_report_local_var = template_based_report_create_internal (
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        report_status_local_nonprim,
        strdup(template_id->valuestring),
        token && !cJSON_IsNull(token) ? strdup(token->valuestring) : NULL
        );

    return template_based_report_local_var;
end:
    if (report_status_local_nonprim) {
        report_status_local_nonprim = 0;
    }
    return NULL;

}
