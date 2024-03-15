#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_upload_status.h"


char* media_upload_status_media_upload_status_ToString(pinterest_rest_api_media_upload_status__e media_upload_status) {
    char *media_upload_statusArray[] =  { "NULL", "registered", "processing", "succeeded", "failed" };
    return media_upload_statusArray[media_upload_status];
}

pinterest_rest_api_media_upload_status__e media_upload_status_media_upload_status_FromString(char* media_upload_status) {
    int stringToReturn = 0;
    char *media_upload_statusArray[] =  { "NULL", "registered", "processing", "succeeded", "failed" };
    size_t sizeofArray = sizeof(media_upload_statusArray) / sizeof(media_upload_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(media_upload_status, media_upload_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *media_upload_status_media_upload_status_convertToJSON(pinterest_rest_api_media_upload_status__e media_upload_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "media_upload_status", media_upload_status_media_upload_status_ToString(media_upload_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_media_upload_status__e media_upload_status_media_upload_status_parseFromJSON(cJSON *media_upload_statusJSON) {
    pinterest_rest_api_media_upload_status__e *media_upload_status = NULL;
    pinterest_rest_api_media_upload_status__e media_upload_statusVariable;
    cJSON *media_upload_statusVar = cJSON_GetObjectItemCaseSensitive(media_upload_statusJSON, "media_upload_status");
    if(!cJSON_IsString(media_upload_statusVar) || (media_upload_statusVar->valuestring == NULL)){
        goto end;
    }
    media_upload_statusVariable = media_upload_status_media_upload_status_FromString(media_upload_statusVar->valuestring);
    return media_upload_statusVariable;
end:
    return 0;
}
