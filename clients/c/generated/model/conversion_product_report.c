#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_product_report.h"



static conversion_product_report_t *conversion_product_report_create_internal(
    char *message,
    bulk_reporting_job_status_t *report_status,
    double *size,
    char *token,
    char *url
    ) {
    conversion_product_report_t *conversion_product_report_local_var = malloc(sizeof(conversion_product_report_t));
    if (!conversion_product_report_local_var) {
        return NULL;
    }
    memset(conversion_product_report_local_var, 0, sizeof(conversion_product_report_t));
    conversion_product_report_local_var->_library_owned = 1;
    conversion_product_report_local_var->message = message;
    conversion_product_report_local_var->report_status = report_status;
    conversion_product_report_local_var->size = size;
    conversion_product_report_local_var->token = token;
    conversion_product_report_local_var->url = url;
    return conversion_product_report_local_var;
}

__attribute__((deprecated)) conversion_product_report_t *conversion_product_report_create(
    char *message,
    bulk_reporting_job_status_t *report_status,
    double *size,
    char *token,
    char *url
    ) {
    double *size_copy = NULL;
    if (size) {
        size_copy = malloc(sizeof(double));
        if (size_copy) *size_copy = *size;
    }
    conversion_product_report_t *result = conversion_product_report_create_internal (
        message,
        report_status,
        size_copy,
        token,
        url
        );
    if (!result) {
        free(size_copy);
    }
    return result;
}

void conversion_product_report_free(conversion_product_report_t *conversion_product_report) {
    if(NULL == conversion_product_report){
        return ;
    }
    if(conversion_product_report->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_product_report_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_product_report->message) {
        free(conversion_product_report->message);
        conversion_product_report->message = NULL;
    }
    if (conversion_product_report->report_status) {
        bulk_reporting_job_status_free(conversion_product_report->report_status);
        conversion_product_report->report_status = NULL;
    }
    if (conversion_product_report->size) {
        free(conversion_product_report->size);
        conversion_product_report->size = NULL;
    }
    if (conversion_product_report->token) {
        free(conversion_product_report->token);
        conversion_product_report->token = NULL;
    }
    if (conversion_product_report->url) {
        free(conversion_product_report->url);
        conversion_product_report->url = NULL;
    }
    free(conversion_product_report);
}

cJSON *conversion_product_report_convertToJSON(conversion_product_report_t *conversion_product_report) {
    cJSON *item = cJSON_CreateObject();

    // conversion_product_report->message
    if(conversion_product_report->message) {
    if(cJSON_AddStringToObject(item, "message", conversion_product_report->message) == NULL) {
    goto fail; //String
    }
    }


    // conversion_product_report->report_status
    if(conversion_product_report->report_status) {
    cJSON *report_status_local_JSON = bulk_reporting_job_status_convertToJSON(conversion_product_report->report_status);
    if(report_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "report_status", report_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_product_report->size
    if(conversion_product_report->size) {
    if(cJSON_AddNumberToObject(item, "size", *conversion_product_report->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_product_report->token
    if(conversion_product_report->token) {
    if(cJSON_AddStringToObject(item, "token", conversion_product_report->token) == NULL) {
    goto fail; //String
    }
    }


    // conversion_product_report->url
    if(conversion_product_report->url) {
    if(cJSON_AddStringToObject(item, "url", conversion_product_report->url) == NULL) {
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

conversion_product_report_t *conversion_product_report_parseFromJSON(cJSON *conversion_product_reportJSON){

    conversion_product_report_t *conversion_product_report_local_var = NULL;

    char *message_local_str = NULL;

    // define the local variable for conversion_product_report->report_status
    bulk_reporting_job_status_t *report_status_local_nonprim = NULL;

    // define the local variable for conversion_product_report->size
    double *size_local_var = NULL;

    char *token_local_str = NULL;

    char *url_local_str = NULL;

    // conversion_product_report->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(conversion_product_reportJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // conversion_product_report->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(conversion_product_reportJSON, "report_status");
    if (cJSON_IsNull(report_status)) {
        report_status = NULL;
    }
    if (report_status) { 
    report_status_local_nonprim = bulk_reporting_job_status_parseFromJSON(report_status); //custom
    }

    // conversion_product_report->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(conversion_product_reportJSON, "size");
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

    // conversion_product_report->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(conversion_product_reportJSON, "token");
    if (cJSON_IsNull(token)) {
        token = NULL;
    }
    if (token) { 
    if(!cJSON_IsString(token) && !cJSON_IsNull(token))
    {
    goto end; //String
    }
    }

    // conversion_product_report->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(conversion_product_reportJSON, "url");
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
    if (token && !cJSON_IsNull(token)) token_local_str = strdup(token->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    conversion_product_report_local_var = conversion_product_report_create_internal (
        message_local_str,
        report_status ? report_status_local_nonprim : NULL,
        size_local_var,
        token_local_str,
        url_local_str
        );

    if (!conversion_product_report_local_var) {
        goto end;
    }

    return conversion_product_report_local_var;
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
