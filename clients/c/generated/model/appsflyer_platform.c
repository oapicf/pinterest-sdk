#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "appsflyer_platform.h"


char* appsflyer_platform_appsflyer_platform_ToString(pinterest_rest_api_appsflyer_platform__e appsflyer_platform) {
    char *appsflyer_platformArray[] =  { "NULL", "android", "ios" };
    return appsflyer_platformArray[appsflyer_platform];
}

pinterest_rest_api_appsflyer_platform__e appsflyer_platform_appsflyer_platform_FromString(char* appsflyer_platform) {
    int stringToReturn = 0;
    char *appsflyer_platformArray[] =  { "NULL", "android", "ios" };
    size_t sizeofArray = sizeof(appsflyer_platformArray) / sizeof(appsflyer_platformArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(appsflyer_platform, appsflyer_platformArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *appsflyer_platform_convertToJSON(pinterest_rest_api_appsflyer_platform__e appsflyer_platform) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "appsflyer_platform", appsflyer_platform_appsflyer_platform_ToString(appsflyer_platform)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_appsflyer_platform__e appsflyer_platform_parseFromJSON(cJSON *appsflyer_platformJSON) {
    if(!cJSON_IsString(appsflyer_platformJSON) || (appsflyer_platformJSON->valuestring == NULL)) {
        return 0;
    }
    return appsflyer_platform_appsflyer_platform_FromString(appsflyer_platformJSON->valuestring);
}
