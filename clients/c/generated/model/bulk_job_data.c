#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_job_data.h"



static bulk_job_data_t *bulk_job_data_create_internal(
    char *result_url,
    pinterest_rest_api_bulk_request_status__e status,
    int *workload_id
    ) {
    bulk_job_data_t *bulk_job_data_local_var = malloc(sizeof(bulk_job_data_t));
    if (!bulk_job_data_local_var) {
        return NULL;
    }
    memset(bulk_job_data_local_var, 0, sizeof(bulk_job_data_t));
    bulk_job_data_local_var->_library_owned = 1;
    bulk_job_data_local_var->result_url = result_url;
    bulk_job_data_local_var->status = status;
    bulk_job_data_local_var->workload_id = workload_id;
    return bulk_job_data_local_var;
}

__attribute__((deprecated)) bulk_job_data_t *bulk_job_data_create(
    char *result_url,
    pinterest_rest_api_bulk_request_status__e status,
    int *workload_id
    ) {
    int *workload_id_copy = NULL;
    if (workload_id) {
        workload_id_copy = malloc(sizeof(int));
        if (workload_id_copy) *workload_id_copy = *workload_id;
    }
    bulk_job_data_t *result = bulk_job_data_create_internal (
        result_url,
        status,
        workload_id_copy
        );
    if (!result) {
        free(workload_id_copy);
    }
    return result;
}

void bulk_job_data_free(bulk_job_data_t *bulk_job_data) {
    if(NULL == bulk_job_data){
        return ;
    }
    if(bulk_job_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_job_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_job_data->result_url) {
        free(bulk_job_data->result_url);
        bulk_job_data->result_url = NULL;
    }
    if (bulk_job_data->workload_id) {
        free(bulk_job_data->workload_id);
        bulk_job_data->workload_id = NULL;
    }
    free(bulk_job_data);
}

cJSON *bulk_job_data_convertToJSON(bulk_job_data_t *bulk_job_data) {
    cJSON *item = cJSON_CreateObject();

    // bulk_job_data->result_url
    if(bulk_job_data->result_url) {
    if(cJSON_AddStringToObject(item, "result_url", bulk_job_data->result_url) == NULL) {
    goto fail; //String
    }
    }


    // bulk_job_data->status
    if (pinterest_rest_api_bulk_request_status__NULL == bulk_job_data->status) {
        goto fail;
    }
    cJSON *status_local_JSON = bulk_request_status_convertToJSON(bulk_job_data->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // bulk_job_data->workload_id
    if(bulk_job_data->workload_id) {
    if(cJSON_AddNumberToObject(item, "workload_id", *bulk_job_data->workload_id) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bulk_job_data_t *bulk_job_data_parseFromJSON(cJSON *bulk_job_dataJSON){

    bulk_job_data_t *bulk_job_data_local_var = NULL;

    char *result_url_local_str = NULL;

    // define the local variable for bulk_job_data->status
    pinterest_rest_api_bulk_request_status__e status_local_nonprim = 0;

    // define the local variable for bulk_job_data->workload_id
    int *workload_id_local_var = NULL;

    // bulk_job_data->result_url
    cJSON *result_url = cJSON_GetObjectItemCaseSensitive(bulk_job_dataJSON, "result_url");
    if (cJSON_IsNull(result_url)) {
        result_url = NULL;
    }
    if (result_url) { 
    if(!cJSON_IsString(result_url) && !cJSON_IsNull(result_url))
    {
    goto end; //String
    }
    }

    // bulk_job_data->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(bulk_job_dataJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = bulk_request_status_parseFromJSON(status); //custom

    // bulk_job_data->workload_id
    cJSON *workload_id = cJSON_GetObjectItemCaseSensitive(bulk_job_dataJSON, "workload_id");
    if (cJSON_IsNull(workload_id)) {
        workload_id = NULL;
    }
    if (workload_id) { 
    if(!cJSON_IsNumber(workload_id))
    {
    goto end; //Numeric
    }
    workload_id_local_var = malloc(sizeof(int));
    if(!workload_id_local_var)
    {
        goto end;
    }
    *workload_id_local_var = workload_id->valuedouble;
    }


    if (result_url && !cJSON_IsNull(result_url)) result_url_local_str = strdup(result_url->valuestring);

    bulk_job_data_local_var = bulk_job_data_create_internal (
        result_url_local_str,
        status_local_nonprim,
        workload_id_local_var
        );

    if (!bulk_job_data_local_var) {
        goto end;
    }

    return bulk_job_data_local_var;
end:
    if (result_url_local_str) {
        free(result_url_local_str);
        result_url_local_str = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (workload_id_local_var) {
        free(workload_id_local_var);
        workload_id_local_var = NULL;
    }
    return NULL;

}
