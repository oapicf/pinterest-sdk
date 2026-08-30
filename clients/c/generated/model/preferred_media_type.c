#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "preferred_media_type.h"


char* preferred_media_type_preferred_media_type_ToString(pinterest_rest_api_preferred_media_type__e preferred_media_type) {
    char *preferred_media_typeArray[] =  { "NULL", "VIDEO", "IMAGE", "" };
    return preferred_media_typeArray[preferred_media_type];
}

pinterest_rest_api_preferred_media_type__e preferred_media_type_preferred_media_type_FromString(char* preferred_media_type) {
    int stringToReturn = 0;
    char *preferred_media_typeArray[] =  { "NULL", "VIDEO", "IMAGE", "" };
    size_t sizeofArray = sizeof(preferred_media_typeArray) / sizeof(preferred_media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(preferred_media_type, preferred_media_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *preferred_media_type_convertToJSON(pinterest_rest_api_preferred_media_type__e preferred_media_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "preferred_media_type", preferred_media_type_preferred_media_type_ToString(preferred_media_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_preferred_media_type__e preferred_media_type_parseFromJSON(cJSON *preferred_media_typeJSON) {
    if(!cJSON_IsString(preferred_media_typeJSON) || (preferred_media_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return preferred_media_type_preferred_media_type_FromString(preferred_media_typeJSON->valuestring);
}
