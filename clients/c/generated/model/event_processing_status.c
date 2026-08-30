#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "event_processing_status.h"


char* event_processing_status_event_processing_status_ToString(pinterest_rest_api_event_processing_status__e event_processing_status) {
    char *event_processing_statusArray[] =  { "NULL", "failed", "processed" };
    return event_processing_statusArray[event_processing_status];
}

pinterest_rest_api_event_processing_status__e event_processing_status_event_processing_status_FromString(char* event_processing_status) {
    int stringToReturn = 0;
    char *event_processing_statusArray[] =  { "NULL", "failed", "processed" };
    size_t sizeofArray = sizeof(event_processing_statusArray) / sizeof(event_processing_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event_processing_status, event_processing_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *event_processing_status_convertToJSON(pinterest_rest_api_event_processing_status__e event_processing_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "event_processing_status", event_processing_status_event_processing_status_ToString(event_processing_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_event_processing_status__e event_processing_status_parseFromJSON(cJSON *event_processing_statusJSON) {
    if(!cJSON_IsString(event_processing_statusJSON) || (event_processing_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return event_processing_status_event_processing_status_FromString(event_processing_statusJSON->valuestring);
}
