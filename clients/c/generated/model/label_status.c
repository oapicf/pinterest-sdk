#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_status.h"


char* label_status_label_status_ToString(pinterest_rest_api_label_status__e label_status) {
    char *label_statusArray[] =  { "NULL", "ACTIVE", "ARCHIVED" };
    return label_statusArray[label_status];
}

pinterest_rest_api_label_status__e label_status_label_status_FromString(char* label_status) {
    int stringToReturn = 0;
    char *label_statusArray[] =  { "NULL", "ACTIVE", "ARCHIVED" };
    size_t sizeofArray = sizeof(label_statusArray) / sizeof(label_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(label_status, label_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *label_status_convertToJSON(pinterest_rest_api_label_status__e label_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "label_status", label_status_label_status_ToString(label_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_label_status__e label_status_parseFromJSON(cJSON *label_statusJSON) {
    if(!cJSON_IsString(label_statusJSON) || (label_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return label_status_label_status_FromString(label_statusJSON->valuestring);
}
