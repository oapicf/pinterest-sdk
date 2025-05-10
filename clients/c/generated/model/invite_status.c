#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_status.h"


char* invite_status_invite_status_ToString(pinterest_rest_api_invite_status__e invite_status) {
    char *invite_statusArray[] =  { "NULL", "PENDING", "ACCEPTED", "DECLINED", "CANCELLED", "EXPIRED" };
    return invite_statusArray[invite_status];
}

pinterest_rest_api_invite_status__e invite_status_invite_status_FromString(char* invite_status) {
    int stringToReturn = 0;
    char *invite_statusArray[] =  { "NULL", "PENDING", "ACCEPTED", "DECLINED", "CANCELLED", "EXPIRED" };
    size_t sizeofArray = sizeof(invite_statusArray) / sizeof(invite_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(invite_status, invite_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *invite_status_convertToJSON(pinterest_rest_api_invite_status__e invite_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "invite_status", invite_status_invite_status_ToString(invite_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_invite_status__e invite_status_parseFromJSON(cJSON *invite_statusJSON) {
    if(!cJSON_IsString(invite_statusJSON) || (invite_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return invite_status_invite_status_FromString(invite_statusJSON->valuestring);
}
