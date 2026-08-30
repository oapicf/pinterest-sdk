#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_report.h"


char* catalogs_report_report_status_ToString(pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_status) {
    char* report_statusArray[] =  { "NULL", "FINISHED", "IN_PROGRESS" };
    return report_statusArray[report_status];
}

pinterest_rest_api_catalogs_report_REPORTSTATUS_e catalogs_report_report_status_FromString(char* report_status){
    int stringToReturn = 0;
    char *report_statusArray[] =  { "NULL", "FINISHED", "IN_PROGRESS" };
    size_t sizeofArray = sizeof(report_statusArray) / sizeof(report_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_status, report_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_report_t *catalogs_report_create_internal(
    pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_status,
    double *size,
    char *url
    ) {
    catalogs_report_t *catalogs_report_local_var = malloc(sizeof(catalogs_report_t));
    if (!catalogs_report_local_var) {
        return NULL;
    }
    memset(catalogs_report_local_var, 0, sizeof(catalogs_report_t));
    catalogs_report_local_var->_library_owned = 1;
    catalogs_report_local_var->report_status = report_status;
    catalogs_report_local_var->size = size;
    catalogs_report_local_var->url = url;
    return catalogs_report_local_var;
}

__attribute__((deprecated)) catalogs_report_t *catalogs_report_create(
    pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_status,
    double *size,
    char *url
    ) {
    double *size_copy = NULL;
    if (size) {
        size_copy = malloc(sizeof(double));
        if (size_copy) *size_copy = *size;
    }
    catalogs_report_t *result = catalogs_report_create_internal (
        report_status,
        size_copy,
        url
        );
    if (!result) {
        free(size_copy);
    }
    return result;
}

void catalogs_report_free(catalogs_report_t *catalogs_report) {
    if(NULL == catalogs_report){
        return ;
    }
    if(catalogs_report->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_report_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_report->size) {
        free(catalogs_report->size);
        catalogs_report->size = NULL;
    }
    if (catalogs_report->url) {
        free(catalogs_report->url);
        catalogs_report->url = NULL;
    }
    free(catalogs_report);
}

cJSON *catalogs_report_convertToJSON(catalogs_report_t *catalogs_report) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_report->report_status
    if(catalogs_report->report_status != pinterest_rest_api_catalogs_report_REPORTSTATUS_NULL) {
    if(cJSON_AddStringToObject(item, "report_status", catalogs_report_report_status_ToString(catalogs_report->report_status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_report->size
    if(catalogs_report->size) {
    if(cJSON_AddNumberToObject(item, "size", *catalogs_report->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_report->url
    if(catalogs_report->url) {
    if(cJSON_AddStringToObject(item, "url", catalogs_report->url) == NULL) {
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

catalogs_report_t *catalogs_report_parseFromJSON(cJSON *catalogs_reportJSON){

    catalogs_report_t *catalogs_report_local_var = NULL;

    // define the local variable for catalogs_report->size
    double *size_local_var = NULL;

    char *url_local_str = NULL;

    // catalogs_report->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(catalogs_reportJSON, "report_status");
    if (cJSON_IsNull(report_status)) {
        report_status = NULL;
    }
    pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_statusVariable;
    if (report_status) { 
    if(!cJSON_IsString(report_status))
    {
    goto end; //Enum
    }
    report_statusVariable = catalogs_report_report_status_FromString(report_status->valuestring);
    }

    // catalogs_report->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(catalogs_reportJSON, "size");
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

    // catalogs_report->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(catalogs_reportJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    catalogs_report_local_var = catalogs_report_create_internal (
        report_status ? report_statusVariable : pinterest_rest_api_catalogs_report_REPORTSTATUS_NULL,
        size_local_var,
        url_local_str
        );

    if (!catalogs_report_local_var) {
        goto end;
    }

    return catalogs_report_local_var;
end:
    if (size_local_var) {
        free(size_local_var);
        size_local_var = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
