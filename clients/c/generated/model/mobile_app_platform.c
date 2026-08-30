#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mobile_app_platform.h"


char* mobile_app_platform_mobile_app_platform_ToString(pinterest_rest_api_mobile_app_platform__e mobile_app_platform) {
    char *mobile_app_platformArray[] =  { "NULL", "IOS", "ANDROID" };
    return mobile_app_platformArray[mobile_app_platform];
}

pinterest_rest_api_mobile_app_platform__e mobile_app_platform_mobile_app_platform_FromString(char* mobile_app_platform) {
    int stringToReturn = 0;
    char *mobile_app_platformArray[] =  { "NULL", "IOS", "ANDROID" };
    size_t sizeofArray = sizeof(mobile_app_platformArray) / sizeof(mobile_app_platformArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(mobile_app_platform, mobile_app_platformArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *mobile_app_platform_convertToJSON(pinterest_rest_api_mobile_app_platform__e mobile_app_platform) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "mobile_app_platform", mobile_app_platform_mobile_app_platform_ToString(mobile_app_platform)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_mobile_app_platform__e mobile_app_platform_parseFromJSON(cJSON *mobile_app_platformJSON) {
    if(!cJSON_IsString(mobile_app_platformJSON) || (mobile_app_platformJSON->valuestring == NULL)) {
        return 0;
    }
    return mobile_app_platform_mobile_app_platform_FromString(mobile_app_platformJSON->valuestring);
}
