#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_upload_type.h"


char* media_upload_type_media_upload_type_ToString(pinterest_rest_api_media_upload_type__e media_upload_type) {
    char *media_upload_typeArray[] =  { "NULL", "video" };
    return media_upload_typeArray[media_upload_type];
}

pinterest_rest_api_media_upload_type__e media_upload_type_media_upload_type_FromString(char* media_upload_type) {
    int stringToReturn = 0;
    char *media_upload_typeArray[] =  { "NULL", "video" };
    size_t sizeofArray = sizeof(media_upload_typeArray) / sizeof(media_upload_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(media_upload_type, media_upload_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *media_upload_type_media_upload_type_convertToJSON(pinterest_rest_api_media_upload_type__e media_upload_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "media_upload_type", media_upload_type_media_upload_type_ToString(media_upload_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_media_upload_type__e media_upload_type_media_upload_type_parseFromJSON(cJSON *media_upload_typeJSON) {
    pinterest_rest_api_media_upload_type__e *media_upload_type = NULL;
    pinterest_rest_api_media_upload_type__e media_upload_typeVariable;
    cJSON *media_upload_typeVar = cJSON_GetObjectItemCaseSensitive(media_upload_typeJSON, "media_upload_type");
    if(!cJSON_IsString(media_upload_typeVar) || (media_upload_typeVar->valuestring == NULL)){
        goto end;
    }
    media_upload_typeVariable = media_upload_type_media_upload_type_FromString(media_upload_typeVar->valuestring);
    return media_upload_typeVariable;
end:
    return 0;
}
