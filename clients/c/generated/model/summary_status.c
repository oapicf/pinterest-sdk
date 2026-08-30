#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "summary_status.h"


char* summary_status_summary_status_ToString(pinterest_rest_api_summary_status__e summary_status) {
    char *summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return summary_statusArray[summary_status];
}

pinterest_rest_api_summary_status__e summary_status_summary_status_FromString(char* summary_status) {
    int stringToReturn = 0;
    char *summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(summary_statusArray) / sizeof(summary_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(summary_status, summary_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *summary_status_convertToJSON(pinterest_rest_api_summary_status__e summary_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "summary_status", summary_status_summary_status_ToString(summary_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_summary_status__e summary_status_parseFromJSON(cJSON *summary_statusJSON) {
    if(!cJSON_IsString(summary_statusJSON) || (summary_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return summary_status_summary_status_FromString(summary_statusJSON->valuestring);
}
