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

catalogs_report_t *catalogs_report_create(
    pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_status,
    char *url,
    double size
    ) {
    catalogs_report_t *catalogs_report_local_var = malloc(sizeof(catalogs_report_t));
    if (!catalogs_report_local_var) {
        return NULL;
    }
    catalogs_report_local_var->report_status = report_status;
    catalogs_report_local_var->url = url;
    catalogs_report_local_var->size = size;

    return catalogs_report_local_var;
}


void catalogs_report_free(catalogs_report_t *catalogs_report) {
    if(NULL == catalogs_report){
        return ;
    }
    listEntry_t *listEntry;
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
    if(cJSON_AddStringToObject(item, "report_status", report_statuscatalogs_report_ToString(catalogs_report->report_status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_report->url
    if(catalogs_report->url) {
    if(cJSON_AddStringToObject(item, "url", catalogs_report->url) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_report->size
    if(catalogs_report->size) {
    if(cJSON_AddNumberToObject(item, "size", catalogs_report->size) == NULL) {
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

catalogs_report_t *catalogs_report_parseFromJSON(cJSON *catalogs_reportJSON){

    catalogs_report_t *catalogs_report_local_var = NULL;

    // catalogs_report->report_status
    cJSON *report_status = cJSON_GetObjectItemCaseSensitive(catalogs_reportJSON, "report_status");
    pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_statusVariable;
    if (report_status) { 
    if(!cJSON_IsString(report_status))
    {
    goto end; //Enum
    }
    report_statusVariable = catalogs_report_report_status_FromString(report_status->valuestring);
    }

    // catalogs_report->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(catalogs_reportJSON, "url");
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }

    // catalogs_report->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(catalogs_reportJSON, "size");
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    }


    catalogs_report_local_var = catalogs_report_create (
        report_status ? report_statusVariable : pinterest_rest_api_catalogs_report_REPORTSTATUS_NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL,
        size ? size->valuedouble : 0
        );

    return catalogs_report_local_var;
end:
    return NULL;

}
