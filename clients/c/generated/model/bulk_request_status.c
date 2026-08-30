#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_request_status.h"


char* bulk_request_status_bulk_request_status_ToString(pinterest_rest_api_bulk_request_status__e bulk_request_status) {
    char *bulk_request_statusArray[] =  { "NULL", "RUNNING", "SUCCEEDED", "FAILED" };
    return bulk_request_statusArray[bulk_request_status];
}

pinterest_rest_api_bulk_request_status__e bulk_request_status_bulk_request_status_FromString(char* bulk_request_status) {
    int stringToReturn = 0;
    char *bulk_request_statusArray[] =  { "NULL", "RUNNING", "SUCCEEDED", "FAILED" };
    size_t sizeofArray = sizeof(bulk_request_statusArray) / sizeof(bulk_request_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(bulk_request_status, bulk_request_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *bulk_request_status_convertToJSON(pinterest_rest_api_bulk_request_status__e bulk_request_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bulk_request_status", bulk_request_status_bulk_request_status_ToString(bulk_request_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_bulk_request_status__e bulk_request_status_parseFromJSON(cJSON *bulk_request_statusJSON) {
    if(!cJSON_IsString(bulk_request_statusJSON) || (bulk_request_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return bulk_request_status_bulk_request_status_FromString(bulk_request_statusJSON->valuestring);
}
