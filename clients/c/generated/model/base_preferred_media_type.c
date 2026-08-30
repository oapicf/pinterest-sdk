#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "base_preferred_media_type.h"


char* base_preferred_media_type_base_preferred_media_type_ToString(pinterest_rest_api_base_preferred_media_type__e base_preferred_media_type) {
    char *base_preferred_media_typeArray[] =  { "NULL", "VIDEO", "IMAGE" };
    return base_preferred_media_typeArray[base_preferred_media_type];
}

pinterest_rest_api_base_preferred_media_type__e base_preferred_media_type_base_preferred_media_type_FromString(char* base_preferred_media_type) {
    int stringToReturn = 0;
    char *base_preferred_media_typeArray[] =  { "NULL", "VIDEO", "IMAGE" };
    size_t sizeofArray = sizeof(base_preferred_media_typeArray) / sizeof(base_preferred_media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(base_preferred_media_type, base_preferred_media_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *base_preferred_media_type_convertToJSON(pinterest_rest_api_base_preferred_media_type__e base_preferred_media_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "base_preferred_media_type", base_preferred_media_type_base_preferred_media_type_ToString(base_preferred_media_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_base_preferred_media_type__e base_preferred_media_type_parseFromJSON(cJSON *base_preferred_media_typeJSON) {
    if(!cJSON_IsString(base_preferred_media_typeJSON) || (base_preferred_media_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return base_preferred_media_type_base_preferred_media_type_FromString(base_preferred_media_typeJSON->valuestring);
}
