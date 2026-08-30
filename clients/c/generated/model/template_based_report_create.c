#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "template_based_report_create.h"



static template_based_report_create_t *template_based_report_create_create_internal(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *token
    ) {
    template_based_report_create_t *template_based_report_create_local_var = malloc(sizeof(template_based_report_create_t));
    if (!template_based_report_create_local_var) {
        return NULL;
    }
    memset(template_based_report_create_local_var, 0, sizeof(template_based_report_create_t));
    template_based_report_create_local_var->_library_owned = 1;
    template_based_report_create_local_var->message = message;
    template_based_report_create_local_var->report_status = report_status;
    template_based_report_create_local_var->token = token;
    return template_based_report_create_local_var;
}

__attribute__((deprecated)) template_based_report_create_t *template_based_report_create_create(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *token
    ) {
    template_based_report_create_t *result = template_based_report_create_create_internal (
        message,
        report_status,
        token
        );
    if (!result) {
    }
    return result;
}

void template_based_report_create_free(template_based_report_create_t *template_based_report_create) {
    if(NULL == template_based_report_create){
        return ;
    }
    if(template_based_report_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "template_based_report_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (template_based_report_create->message) {
        free(template_based_report_create->message);
        template_based_report_create->message = NULL;
    }
    if (template_based_report_create->token) {
        free(template_based_report_create->token);
        template_based_report_create->token = NULL;
    }
    free(template_based_report_create);
}

cJSON *template_based_report_create_convertToJSON(template_based_report_create_t *template_based_report_create) {
    cJSON *item = cJSON_CreateObject();

    // template_based_report_create->message
    if(template_based_report_create->message) {
    if(cJSON_AddStringToObject(item, "message", template_based_report_create->message) == NULL) {
    goto fail; //String
    }
    }


    // template_based_report_create->report_status
    if (pinterest_rest_api_bulk_reporting_job_status__NULL == template_based_report_create->report_status) {
        goto fail;
    }
    cJSON *report_status_local_JSON = bulk_reporting_job_status_convertToJSON(template_based_report_create->report_status);
    if(report_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "report_status", report_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // template_based_report_create->token
    if(template_based_report_create->token) {
    if(cJSON_AddStringToObject(item, "token", template_based_report_create->token) == NULL) {
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

template_based_report_create_t *template_based_report_create_parseFromJSON(cJSON *template_based_report_createJSON){

    template_based_report_create_t *template_based_report_create_local_var = NULL;

    char *message_local_str = NULL;

    // define the local variable for template_based_report_create->report_status
    pinterest_rest_api_bulk_reporting_job_status__e report_status_local_nonprim = 0;

    char *token_local_str = NULL;

    // template_based_report_create->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(template_based_report_createJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // template_based_report_create->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(template_based_report_createJSON, "report_status");
    if (cJSON_IsNull(report_status)) {
        report_status = NULL;
    }
    if (!report_status) {
        goto end;
    }

    
    report_status_local_nonprim = bulk_reporting_job_status_parseFromJSON(report_status); //custom

    // template_based_report_create->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(template_based_report_createJSON, "token");
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

    template_based_report_create_local_var = template_based_report_create_create_internal (
        message_local_str,
        report_status_local_nonprim,
        token_local_str
        );

    if (!template_based_report_create_local_var) {
        goto end;
    }

    return template_based_report_create_local_var;
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
