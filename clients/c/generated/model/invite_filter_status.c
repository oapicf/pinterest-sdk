#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_filter_status.h"


char* invite_filter_status_invite_filter_status_ToString(pinterest_rest_api_invite_filter_status__e invite_filter_status) {
    char *invite_filter_statusArray[] =  { "NULL", "PENDING", "EXPIRED" };
    return invite_filter_statusArray[invite_filter_status];
}

pinterest_rest_api_invite_filter_status__e invite_filter_status_invite_filter_status_FromString(char* invite_filter_status) {
    int stringToReturn = 0;
    char *invite_filter_statusArray[] =  { "NULL", "PENDING", "EXPIRED" };
    size_t sizeofArray = sizeof(invite_filter_statusArray) / sizeof(invite_filter_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(invite_filter_status, invite_filter_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *invite_filter_status_convertToJSON(pinterest_rest_api_invite_filter_status__e invite_filter_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "invite_filter_status", invite_filter_status_invite_filter_status_ToString(invite_filter_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_invite_filter_status__e invite_filter_status_parseFromJSON(cJSON *invite_filter_statusJSON) {
    if(!cJSON_IsString(invite_filter_statusJSON) || (invite_filter_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return invite_filter_status_invite_filter_status_FromString(invite_filter_statusJSON->valuestring);
}
