#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_mmm_report_response_data.h"



create_mmm_report_response_data_t *create_mmm_report_response_data_create(
    bulk_reporting_job_status_t *report_status,
    char *token,
    char *message,
    char *status
    ) {
    create_mmm_report_response_data_t *create_mmm_report_response_data_local_var = malloc(sizeof(create_mmm_report_response_data_t));
    if (!create_mmm_report_response_data_local_var) {
        return NULL;
    }
    create_mmm_report_response_data_local_var->report_status = report_status;
    create_mmm_report_response_data_local_var->token = token;
    create_mmm_report_response_data_local_var->message = message;
    create_mmm_report_response_data_local_var->status = status;

    return create_mmm_report_response_data_local_var;
}


void create_mmm_report_response_data_free(create_mmm_report_response_data_t *create_mmm_report_response_data) {
    if(NULL == create_mmm_report_response_data){
        return ;
    }
    listEntry_t *listEntry;
    if (create_mmm_report_response_data->report_status) {
        bulk_reporting_job_status_free(create_mmm_report_response_data->report_status);
        create_mmm_report_response_data->report_status = NULL;
    }
    if (create_mmm_report_response_data->token) {
        free(create_mmm_report_response_data->token);
        create_mmm_report_response_data->token = NULL;
    }
    if (create_mmm_report_response_data->message) {
        free(create_mmm_report_response_data->message);
        create_mmm_report_response_data->message = NULL;
    }
    if (create_mmm_report_response_data->status) {
        free(create_mmm_report_response_data->status);
        create_mmm_report_response_data->status = NULL;
    }
    free(create_mmm_report_response_data);
}

cJSON *create_mmm_report_response_data_convertToJSON(create_mmm_report_response_data_t *create_mmm_report_response_data) {
    cJSON *item = cJSON_CreateObject();

    // create_mmm_report_response_data->report_status
    if(create_mmm_report_response_data->report_status) {
    cJSON *report_status_local_JSON = bulk_reporting_job_status_convertToJSON(create_mmm_report_response_data->report_status);
    if(report_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "report_status", report_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // create_mmm_report_response_data->token
    if(create_mmm_report_response_data->token) {
    if(cJSON_AddStringToObject(item, "token", create_mmm_report_response_data->token) == NULL) {
    goto fail; //String
    }
    }


    // create_mmm_report_response_data->message
    if(create_mmm_report_response_data->message) {
    if(cJSON_AddStringToObject(item, "message", create_mmm_report_response_data->message) == NULL) {
    goto fail; //String
    }
    }


    // create_mmm_report_response_data->status
    if(create_mmm_report_response_data->status) {
    if(cJSON_AddStringToObject(item, "status", create_mmm_report_response_data->status) == NULL) {
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

create_mmm_report_response_data_t *create_mmm_report_response_data_parseFromJSON(cJSON *create_mmm_report_response_dataJSON){

    create_mmm_report_response_data_t *create_mmm_report_response_data_local_var = NULL;

    // define the local variable for create_mmm_report_response_data->report_status
    bulk_reporting_job_status_t *report_status_local_nonprim = NULL;

    // create_mmm_report_response_data->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(create_mmm_report_response_dataJSON, "report_status");
    if (report_status) { 
    report_status_local_nonprim = bulk_reporting_job_status_parseFromJSON(report_status); //custom
    }

    // create_mmm_report_response_data->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(create_mmm_report_response_dataJSON, "token");
    if (token) { 
    if(!cJSON_IsString(token) && !cJSON_IsNull(token))
    {
    goto end; //String
    }
    }

    // create_mmm_report_response_data->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(create_mmm_report_response_dataJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // create_mmm_report_response_data->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(create_mmm_report_response_dataJSON, "status");
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }


    create_mmm_report_response_data_local_var = create_mmm_report_response_data_create (
        report_status ? report_status_local_nonprim : NULL,
        token && !cJSON_IsNull(token) ? strdup(token->valuestring) : NULL,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        status && !cJSON_IsNull(status) ? strdup(status->valuestring) : NULL
        );

    return create_mmm_report_response_data_local_var;
end:
    if (report_status_local_nonprim) {
        bulk_reporting_job_status_free(report_status_local_nonprim);
        report_status_local_nonprim = NULL;
    }
    return NULL;

}
