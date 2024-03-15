#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_reporting_job_status.h"


char* bulk_reporting_job_status_bulk_reporting_job_status_ToString(pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_status) {
    char *bulk_reporting_job_statusArray[] =  { "NULL", "DOES_NOT_EXIST", "FINISHED", "IN_PROGRESS", "EXPIRED", "FAILED", "CANCELLED" };
    return bulk_reporting_job_statusArray[bulk_reporting_job_status];
}

pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_status_bulk_reporting_job_status_FromString(char* bulk_reporting_job_status) {
    int stringToReturn = 0;
    char *bulk_reporting_job_statusArray[] =  { "NULL", "DOES_NOT_EXIST", "FINISHED", "IN_PROGRESS", "EXPIRED", "FAILED", "CANCELLED" };
    size_t sizeofArray = sizeof(bulk_reporting_job_statusArray) / sizeof(bulk_reporting_job_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(bulk_reporting_job_status, bulk_reporting_job_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *bulk_reporting_job_status_bulk_reporting_job_status_convertToJSON(pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bulk_reporting_job_status", bulk_reporting_job_status_bulk_reporting_job_status_ToString(bulk_reporting_job_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_status_bulk_reporting_job_status_parseFromJSON(cJSON *bulk_reporting_job_statusJSON) {
    pinterest_rest_api_bulk_reporting_job_status__e *bulk_reporting_job_status = NULL;
    pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_statusVariable;
    cJSON *bulk_reporting_job_statusVar = cJSON_GetObjectItemCaseSensitive(bulk_reporting_job_statusJSON, "bulk_reporting_job_status");
    if(!cJSON_IsString(bulk_reporting_job_statusVar) || (bulk_reporting_job_statusVar->valuestring == NULL)){
        goto end;
    }
    bulk_reporting_job_statusVariable = bulk_reporting_job_status_bulk_reporting_job_status_FromString(bulk_reporting_job_statusVar->valuestring);
    return bulk_reporting_job_statusVariable;
end:
    return 0;
}
