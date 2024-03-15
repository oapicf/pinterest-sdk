#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_mmm_report_response.h"



get_mmm_report_response_t *get_mmm_report_response_create(
    double code,
    get_mmm_report_response_data_t *data,
    char *message,
    char *status
    ) {
    get_mmm_report_response_t *get_mmm_report_response_local_var = malloc(sizeof(get_mmm_report_response_t));
    if (!get_mmm_report_response_local_var) {
        return NULL;
    }
    get_mmm_report_response_local_var->code = code;
    get_mmm_report_response_local_var->data = data;
    get_mmm_report_response_local_var->message = message;
    get_mmm_report_response_local_var->status = status;

    return get_mmm_report_response_local_var;
}


void get_mmm_report_response_free(get_mmm_report_response_t *get_mmm_report_response) {
    if(NULL == get_mmm_report_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_mmm_report_response->data) {
        get_mmm_report_response_data_free(get_mmm_report_response->data);
        get_mmm_report_response->data = NULL;
    }
    if (get_mmm_report_response->message) {
        free(get_mmm_report_response->message);
        get_mmm_report_response->message = NULL;
    }
    if (get_mmm_report_response->status) {
        free(get_mmm_report_response->status);
        get_mmm_report_response->status = NULL;
    }
    free(get_mmm_report_response);
}

cJSON *get_mmm_report_response_convertToJSON(get_mmm_report_response_t *get_mmm_report_response) {
    cJSON *item = cJSON_CreateObject();

    // get_mmm_report_response->code
    if(get_mmm_report_response->code) {
    if(cJSON_AddNumberToObject(item, "code", get_mmm_report_response->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // get_mmm_report_response->data
    if(get_mmm_report_response->data) {
    cJSON *data_local_JSON = get_mmm_report_response_data_convertToJSON(get_mmm_report_response->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // get_mmm_report_response->message
    if(get_mmm_report_response->message) {
    if(cJSON_AddStringToObject(item, "message", get_mmm_report_response->message) == NULL) {
    goto fail; //String
    }
    }


    // get_mmm_report_response->status
    if(get_mmm_report_response->status) {
    if(cJSON_AddStringToObject(item, "status", get_mmm_report_response->status) == NULL) {
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

get_mmm_report_response_t *get_mmm_report_response_parseFromJSON(cJSON *get_mmm_report_responseJSON){

    get_mmm_report_response_t *get_mmm_report_response_local_var = NULL;

    // define the local variable for get_mmm_report_response->data
    get_mmm_report_response_data_t *data_local_nonprim = NULL;

    // get_mmm_report_response->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(get_mmm_report_responseJSON, "code");
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    }

    // get_mmm_report_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(get_mmm_report_responseJSON, "data");
    if (data) { 
    data_local_nonprim = get_mmm_report_response_data_parseFromJSON(data); //nonprimitive
    }

    // get_mmm_report_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(get_mmm_report_responseJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // get_mmm_report_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(get_mmm_report_responseJSON, "status");
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }


    get_mmm_report_response_local_var = get_mmm_report_response_create (
        code ? code->valuedouble : 0,
        data ? data_local_nonprim : NULL,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        status && !cJSON_IsNull(status) ? strdup(status->valuestring) : NULL
        );

    return get_mmm_report_response_local_var;
end:
    if (data_local_nonprim) {
        get_mmm_report_response_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
