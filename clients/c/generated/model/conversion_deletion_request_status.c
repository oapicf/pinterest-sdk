#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_deletion_request_status.h"


char* conversion_deletion_request_status_conversion_deletion_request_status_ToString(pinterest_rest_api_conversion_deletion_request_status__e conversion_deletion_request_status) {
    char *conversion_deletion_request_statusArray[] =  { "NULL", "PENDING", "SUBMITTED", "CANCELLED" };
    return conversion_deletion_request_statusArray[conversion_deletion_request_status];
}

pinterest_rest_api_conversion_deletion_request_status__e conversion_deletion_request_status_conversion_deletion_request_status_FromString(char* conversion_deletion_request_status) {
    int stringToReturn = 0;
    char *conversion_deletion_request_statusArray[] =  { "NULL", "PENDING", "SUBMITTED", "CANCELLED" };
    size_t sizeofArray = sizeof(conversion_deletion_request_statusArray) / sizeof(conversion_deletion_request_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_deletion_request_status, conversion_deletion_request_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_deletion_request_status_convertToJSON(pinterest_rest_api_conversion_deletion_request_status__e conversion_deletion_request_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_deletion_request_status", conversion_deletion_request_status_conversion_deletion_request_status_ToString(conversion_deletion_request_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_deletion_request_status__e conversion_deletion_request_status_parseFromJSON(cJSON *conversion_deletion_request_statusJSON) {
    if(!cJSON_IsString(conversion_deletion_request_statusJSON) || (conversion_deletion_request_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_deletion_request_status_conversion_deletion_request_status_FromString(conversion_deletion_request_statusJSON->valuestring);
}
