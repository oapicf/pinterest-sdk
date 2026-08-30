#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_status.h"


char* schedule_status_schedule_status_ToString(pinterest_rest_api_schedule_status__e schedule_status) {
    char *schedule_statusArray[] =  { "NULL", "DRAFT", "CREATED", "SCHEDULED", "ACTIVE", "COMPLETED", "FAILED", "CANCELED" };
    return schedule_statusArray[schedule_status];
}

pinterest_rest_api_schedule_status__e schedule_status_schedule_status_FromString(char* schedule_status) {
    int stringToReturn = 0;
    char *schedule_statusArray[] =  { "NULL", "DRAFT", "CREATED", "SCHEDULED", "ACTIVE", "COMPLETED", "FAILED", "CANCELED" };
    size_t sizeofArray = sizeof(schedule_statusArray) / sizeof(schedule_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(schedule_status, schedule_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *schedule_status_convertToJSON(pinterest_rest_api_schedule_status__e schedule_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "schedule_status", schedule_status_schedule_status_ToString(schedule_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_schedule_status__e schedule_status_parseFromJSON(cJSON *schedule_statusJSON) {
    if(!cJSON_IsString(schedule_statusJSON) || (schedule_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return schedule_status_schedule_status_FromString(schedule_statusJSON->valuestring);
}
