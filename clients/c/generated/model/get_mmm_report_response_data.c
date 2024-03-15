#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_mmm_report_response_data.h"


char* get_mmm_report_response_data_report_status_ToString(pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e report_status) {
    char* report_statusArray[] =  { "NULL", "DOES_NOT_EXIST", "FINISHED", "IN_PROGRESS", "EXPIRED", "FAILED", "CANCELLED" };
    return report_statusArray[report_status];
}

pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e get_mmm_report_response_data_report_status_FromString(char* report_status){
    int stringToReturn = 0;
    char *report_statusArray[] =  { "NULL", "DOES_NOT_EXIST", "FINISHED", "IN_PROGRESS", "EXPIRED", "FAILED", "CANCELLED" };
    size_t sizeofArray = sizeof(report_statusArray) / sizeof(report_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_status, report_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

get_mmm_report_response_data_t *get_mmm_report_response_data_create(
    pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e report_status,
    char *url,
    double size
    ) {
    get_mmm_report_response_data_t *get_mmm_report_response_data_local_var = malloc(sizeof(get_mmm_report_response_data_t));
    if (!get_mmm_report_response_data_local_var) {
        return NULL;
    }
    get_mmm_report_response_data_local_var->report_status = report_status;
    get_mmm_report_response_data_local_var->url = url;
    get_mmm_report_response_data_local_var->size = size;

    return get_mmm_report_response_data_local_var;
}


void get_mmm_report_response_data_free(get_mmm_report_response_data_t *get_mmm_report_response_data) {
    if(NULL == get_mmm_report_response_data){
        return ;
    }
    listEntry_t *listEntry;
    if (get_mmm_report_response_data->url) {
        free(get_mmm_report_response_data->url);
        get_mmm_report_response_data->url = NULL;
    }
    free(get_mmm_report_response_data);
}

cJSON *get_mmm_report_response_data_convertToJSON(get_mmm_report_response_data_t *get_mmm_report_response_data) {
    cJSON *item = cJSON_CreateObject();

    // get_mmm_report_response_data->report_status
    if(get_mmm_report_response_data->report_status != pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_NULL) {
    if(cJSON_AddStringToObject(item, "report_status", report_statusget_mmm_report_response_data_ToString(get_mmm_report_response_data->report_status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // get_mmm_report_response_data->url
    if(get_mmm_report_response_data->url) {
    if(cJSON_AddStringToObject(item, "url", get_mmm_report_response_data->url) == NULL) {
    goto fail; //String
    }
    }


    // get_mmm_report_response_data->size
    if(get_mmm_report_response_data->size) {
    if(cJSON_AddNumberToObject(item, "size", get_mmm_report_response_data->size) == NULL) {
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

get_mmm_report_response_data_t *get_mmm_report_response_data_parseFromJSON(cJSON *get_mmm_report_response_dataJSON){

    get_mmm_report_response_data_t *get_mmm_report_response_data_local_var = NULL;

    // get_mmm_report_response_data->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(get_mmm_report_response_dataJSON, "report_status");
    pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_e report_statusVariable;
    if (report_status) { 
    if(!cJSON_IsString(report_status))
    {
    goto end; //Enum
    }
    report_statusVariable = get_mmm_report_response_data_report_status_FromString(report_status->valuestring);
    }

    // get_mmm_report_response_data->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(get_mmm_report_response_dataJSON, "url");
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }

    // get_mmm_report_response_data->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(get_mmm_report_response_dataJSON, "size");
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    }


    get_mmm_report_response_data_local_var = get_mmm_report_response_data_create (
        report_status ? report_statusVariable : pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL,
        size ? size->valuedouble : 0
        );

    return get_mmm_report_response_data_local_var;
end:
    return NULL;

}
