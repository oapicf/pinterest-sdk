#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nullable_label_status.h"


char* nullable_label_status_nullable_label_status_ToString(pinterest_rest_api_nullable_label_status__e nullable_label_status) {
    char *nullable_label_statusArray[] =  { "NULL", "ACTIVE", "ARCHIVED", "" };
    return nullable_label_statusArray[nullable_label_status];
}

pinterest_rest_api_nullable_label_status__e nullable_label_status_nullable_label_status_FromString(char* nullable_label_status) {
    int stringToReturn = 0;
    char *nullable_label_statusArray[] =  { "NULL", "ACTIVE", "ARCHIVED", "" };
    size_t sizeofArray = sizeof(nullable_label_statusArray) / sizeof(nullable_label_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(nullable_label_status, nullable_label_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *nullable_label_status_convertToJSON(pinterest_rest_api_nullable_label_status__e nullable_label_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "nullable_label_status", nullable_label_status_nullable_label_status_ToString(nullable_label_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_nullable_label_status__e nullable_label_status_parseFromJSON(cJSON *nullable_label_statusJSON) {
    if(!cJSON_IsString(nullable_label_statusJSON) || (nullable_label_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return nullable_label_status_nullable_label_status_FromString(nullable_label_statusJSON->valuestring);
}
