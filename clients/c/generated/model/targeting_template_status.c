#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_status.h"


char* targeting_template_status_targeting_template_status_ToString(pinterest_rest_api_targeting_template_status__e targeting_template_status) {
    char *targeting_template_statusArray[] =  { "NULL", "ACTIVE", "DELETED" };
    return targeting_template_statusArray[targeting_template_status];
}

pinterest_rest_api_targeting_template_status__e targeting_template_status_targeting_template_status_FromString(char* targeting_template_status) {
    int stringToReturn = 0;
    char *targeting_template_statusArray[] =  { "NULL", "ACTIVE", "DELETED" };
    size_t sizeofArray = sizeof(targeting_template_statusArray) / sizeof(targeting_template_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_template_status, targeting_template_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *targeting_template_status_convertToJSON(pinterest_rest_api_targeting_template_status__e targeting_template_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_template_status", targeting_template_status_targeting_template_status_ToString(targeting_template_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_targeting_template_status__e targeting_template_status_parseFromJSON(cJSON *targeting_template_statusJSON) {
    if(!cJSON_IsString(targeting_template_statusJSON) || (targeting_template_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return targeting_template_status_targeting_template_status_FromString(targeting_template_statusJSON->valuestring);
}
