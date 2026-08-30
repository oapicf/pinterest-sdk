#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "http_method.h"


char* http_method_http_method_ToString(pinterest_rest_api_http_method__e http_method) {
    char *http_methodArray[] =  { "NULL", "GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH" };
    return http_methodArray[http_method];
}

pinterest_rest_api_http_method__e http_method_http_method_FromString(char* http_method) {
    int stringToReturn = 0;
    char *http_methodArray[] =  { "NULL", "GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH" };
    size_t sizeofArray = sizeof(http_methodArray) / sizeof(http_methodArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(http_method, http_methodArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *http_method_convertToJSON(pinterest_rest_api_http_method__e http_method) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "http_method", http_method_http_method_ToString(http_method)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_http_method__e http_method_parseFromJSON(cJSON *http_methodJSON) {
    if(!cJSON_IsString(http_methodJSON) || (http_methodJSON->valuestring == NULL)) {
        return 0;
    }
    return http_method_http_method_FromString(http_methodJSON->valuestring);
}
