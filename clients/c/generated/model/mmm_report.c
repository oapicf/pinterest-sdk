#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mmm_report.h"



static mmm_report_t *mmm_report_create_internal(
    char *message,
    bulk_reporting_job_status_t *report_status,
    double *size,
    char *status,
    char *token,
    char *url
    ) {
    mmm_report_t *mmm_report_local_var = malloc(sizeof(mmm_report_t));
    if (!mmm_report_local_var) {
        return NULL;
    }
    memset(mmm_report_local_var, 0, sizeof(mmm_report_t));
    mmm_report_local_var->_library_owned = 1;
    mmm_report_local_var->message = message;
    mmm_report_local_var->report_status = report_status;
    mmm_report_local_var->size = size;
    mmm_report_local_var->status = status;
    mmm_report_local_var->token = token;
    mmm_report_local_var->url = url;
    return mmm_report_local_var;
}

__attribute__((deprecated)) mmm_report_t *mmm_report_create(
    char *message,
    bulk_reporting_job_status_t *report_status,
    double *size,
    char *status,
    char *token,
    char *url
    ) {
    double *size_copy = NULL;
    if (size) {
        size_copy = malloc(sizeof(double));
        if (size_copy) *size_copy = *size;
    }
    mmm_report_t *result = mmm_report_create_internal (
        message,
        report_status,
        size_copy,
        status,
        token,
        url
        );
    if (!result) {
        free(size_copy);
    }
    return result;
}

void mmm_report_free(mmm_report_t *mmm_report) {
    if(NULL == mmm_report){
        return ;
    }
    if(mmm_report->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "mmm_report_free");
        return ;
    }
    listEntry_t *listEntry;
    if (mmm_report->message) {
        free(mmm_report->message);
        mmm_report->message = NULL;
    }
    if (mmm_report->report_status) {
        bulk_reporting_job_status_free(mmm_report->report_status);
        mmm_report->report_status = NULL;
    }
    if (mmm_report->size) {
        free(mmm_report->size);
        mmm_report->size = NULL;
    }
    if (mmm_report->status) {
        free(mmm_report->status);
        mmm_report->status = NULL;
    }
    if (mmm_report->token) {
        free(mmm_report->token);
        mmm_report->token = NULL;
    }
    if (mmm_report->url) {
        free(mmm_report->url);
        mmm_report->url = NULL;
    }
    free(mmm_report);
}

cJSON *mmm_report_convertToJSON(mmm_report_t *mmm_report) {
    cJSON *item = cJSON_CreateObject();

    // mmm_report->message
    if(mmm_report->message) {
    if(cJSON_AddStringToObject(item, "message", mmm_report->message) == NULL) {
    goto fail; //String
    }
    }


    // mmm_report->report_status
    if(mmm_report->report_status) {
    cJSON *report_status_local_JSON = bulk_reporting_job_status_convertToJSON(mmm_report->report_status);
    if(report_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "report_status", report_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // mmm_report->size
    if(mmm_report->size) {
    if(cJSON_AddNumberToObject(item, "size", *mmm_report->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // mmm_report->status
    if(mmm_report->status) {
    if(cJSON_AddStringToObject(item, "status", mmm_report->status) == NULL) {
    goto fail; //String
    }
    }


    // mmm_report->token
    if(mmm_report->token) {
    if(cJSON_AddStringToObject(item, "token", mmm_report->token) == NULL) {
    goto fail; //String
    }
    }


    // mmm_report->url
    if(mmm_report->url) {
    if(cJSON_AddStringToObject(item, "url", mmm_report->url) == NULL) {
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

mmm_report_t *mmm_report_parseFromJSON(cJSON *mmm_reportJSON){

    mmm_report_t *mmm_report_local_var = NULL;

    char *message_local_str = NULL;

    // define the local variable for mmm_report->report_status
    bulk_reporting_job_status_t *report_status_local_nonprim = NULL;

    // define the local variable for mmm_report->size
    double *size_local_var = NULL;

    char *status_local_str = NULL;

    char *token_local_str = NULL;

    char *url_local_str = NULL;

    // mmm_report->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(mmm_reportJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // mmm_report->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(mmm_reportJSON, "report_status");
    if (cJSON_IsNull(report_status)) {
        report_status = NULL;
    }
    if (report_status) { 
    report_status_local_nonprim = bulk_reporting_job_status_parseFromJSON(report_status); //custom
    }

    // mmm_report->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(mmm_reportJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    size_local_var = malloc(sizeof(double));
    if(!size_local_var)
    {
        goto end;
    }
    *size_local_var = size->valuedouble;
    }

    // mmm_report->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(mmm_reportJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }

    // mmm_report->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(mmm_reportJSON, "token");
    if (cJSON_IsNull(token)) {
        token = NULL;
    }
    if (token) { 
    if(!cJSON_IsString(token) && !cJSON_IsNull(token))
    {
    goto end; //String
    }
    }

    // mmm_report->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(mmm_reportJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);
    if (status && !cJSON_IsNull(status)) status_local_str = strdup(status->valuestring);
    if (token && !cJSON_IsNull(token)) token_local_str = strdup(token->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    mmm_report_local_var = mmm_report_create_internal (
        message_local_str,
        report_status ? report_status_local_nonprim : NULL,
        size_local_var,
        status_local_str,
        token_local_str,
        url_local_str
        );

    if (!mmm_report_local_var) {
        goto end;
    }

    return mmm_report_local_var;
end:
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    if (report_status_local_nonprim) {
        bulk_reporting_job_status_free(report_status_local_nonprim);
        report_status_local_nonprim = NULL;
    }
    if (size_local_var) {
        free(size_local_var);
        size_local_var = NULL;
    }
    if (status_local_str) {
        free(status_local_str);
        status_local_str = NULL;
    }
    if (token_local_str) {
        free(token_local_str);
        token_local_str = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
