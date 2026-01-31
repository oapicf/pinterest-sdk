#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "content_type.h"


char* content_type_content_type_ToString(pinterest_rest_api_content_type__e content_type) {
    char *content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return content_typeArray[content_type];
}

pinterest_rest_api_content_type__e content_type_content_type_FromString(char* content_type) {
    int stringToReturn = 0;
    char *content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    size_t sizeofArray = sizeof(content_typeArray) / sizeof(content_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(content_type, content_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *content_type_convertToJSON(pinterest_rest_api_content_type__e content_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "content_type", content_type_content_type_ToString(content_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_content_type__e content_type_parseFromJSON(cJSON *content_typeJSON) {
    if(!cJSON_IsString(content_typeJSON) || (content_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return content_type_content_type_FromString(content_typeJSON->valuestring);
}
