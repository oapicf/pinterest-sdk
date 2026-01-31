#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "source_platform_options.h"


char* source_platform_options_source_platform_options_ToString(pinterest_rest_api_source_platform_options__e source_platform_options) {
    char *source_platform_optionsArray[] =  { "NULL", "WEB", "MOBILE", "MOBILE_ANDROID", "MOBILE_IOS", "OFFLINE", "PINTEREST_WEB", "PINTEREST_ANDROID", "PINTEREST_IOS", "POINT_OF_SALE" };
    return source_platform_optionsArray[source_platform_options];
}

pinterest_rest_api_source_platform_options__e source_platform_options_source_platform_options_FromString(char* source_platform_options) {
    int stringToReturn = 0;
    char *source_platform_optionsArray[] =  { "NULL", "WEB", "MOBILE", "MOBILE_ANDROID", "MOBILE_IOS", "OFFLINE", "PINTEREST_WEB", "PINTEREST_ANDROID", "PINTEREST_IOS", "POINT_OF_SALE" };
    size_t sizeofArray = sizeof(source_platform_optionsArray) / sizeof(source_platform_optionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source_platform_options, source_platform_optionsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *source_platform_options_convertToJSON(pinterest_rest_api_source_platform_options__e source_platform_options) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "source_platform_options", source_platform_options_source_platform_options_ToString(source_platform_options)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_source_platform_options__e source_platform_options_parseFromJSON(cJSON *source_platform_optionsJSON) {
    if(!cJSON_IsString(source_platform_optionsJSON) || (source_platform_optionsJSON->valuestring == NULL)) {
        return 0;
    }
    return source_platform_options_source_platform_options_FromString(source_platform_optionsJSON->valuestring);
}
