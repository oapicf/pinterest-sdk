#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "os_family.h"


char* os_family_os_family_ToString(pinterest_rest_api_os_family__e os_family) {
    char *os_familyArray[] =  { "NULL", "ios", "android", "macos", "windows", "linux", "bsd", "other" };
    return os_familyArray[os_family];
}

pinterest_rest_api_os_family__e os_family_os_family_FromString(char* os_family) {
    int stringToReturn = 0;
    char *os_familyArray[] =  { "NULL", "ios", "android", "macos", "windows", "linux", "bsd", "other" };
    size_t sizeofArray = sizeof(os_familyArray) / sizeof(os_familyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(os_family, os_familyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *os_family_convertToJSON(pinterest_rest_api_os_family__e os_family) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "os_family", os_family_os_family_ToString(os_family)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_os_family__e os_family_parseFromJSON(cJSON *os_familyJSON) {
    if(!cJSON_IsString(os_familyJSON) || (os_familyJSON->valuestring == NULL)) {
        return 0;
    }
    return os_family_os_family_FromString(os_familyJSON->valuestring);
}
