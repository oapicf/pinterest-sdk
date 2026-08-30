#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "website_verification_method.h"


char* website_verification_method_website_verification_method_ToString(pinterest_rest_api_website_verification_method__e website_verification_method) {
    char *website_verification_methodArray[] =  { "NULL", "FILENAME", "METATAG", "DNSTXT" };
    return website_verification_methodArray[website_verification_method];
}

pinterest_rest_api_website_verification_method__e website_verification_method_website_verification_method_FromString(char* website_verification_method) {
    int stringToReturn = 0;
    char *website_verification_methodArray[] =  { "NULL", "FILENAME", "METATAG", "DNSTXT" };
    size_t sizeofArray = sizeof(website_verification_methodArray) / sizeof(website_verification_methodArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(website_verification_method, website_verification_methodArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *website_verification_method_convertToJSON(pinterest_rest_api_website_verification_method__e website_verification_method) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "website_verification_method", website_verification_method_website_verification_method_ToString(website_verification_method)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_website_verification_method__e website_verification_method_parseFromJSON(cJSON *website_verification_methodJSON) {
    if(!cJSON_IsString(website_verification_methodJSON) || (website_verification_methodJSON->valuestring == NULL)) {
        return 0;
    }
    return website_verification_method_website_verification_method_FromString(website_verification_methodJSON->valuestring);
}
