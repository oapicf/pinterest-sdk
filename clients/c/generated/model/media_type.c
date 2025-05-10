#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_type.h"


char* media_type_media_type_ToString(pinterest_rest_api_media_type__e media_type) {
    char *media_typeArray[] =  { "NULL", "IMAGE", "VIDEO" };
    return media_typeArray[media_type];
}

pinterest_rest_api_media_type__e media_type_media_type_FromString(char* media_type) {
    int stringToReturn = 0;
    char *media_typeArray[] =  { "NULL", "IMAGE", "VIDEO" };
    size_t sizeofArray = sizeof(media_typeArray) / sizeof(media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(media_type, media_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *media_type_convertToJSON(pinterest_rest_api_media_type__e media_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "media_type", media_type_media_type_ToString(media_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_media_type__e media_type_parseFromJSON(cJSON *media_typeJSON) {
    if(!cJSON_IsString(media_typeJSON) || (media_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return media_type_media_type_FromString(media_typeJSON->valuestring);
}
