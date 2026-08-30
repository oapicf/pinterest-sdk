#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nullable_label_type.h"


char* nullable_label_type_nullable_label_type_ToString(pinterest_rest_api_nullable_label_type__e nullable_label_type) {
    char *nullable_label_typeArray[] =  { "NULL", "BRAND", "CUSTOM", "" };
    return nullable_label_typeArray[nullable_label_type];
}

pinterest_rest_api_nullable_label_type__e nullable_label_type_nullable_label_type_FromString(char* nullable_label_type) {
    int stringToReturn = 0;
    char *nullable_label_typeArray[] =  { "NULL", "BRAND", "CUSTOM", "" };
    size_t sizeofArray = sizeof(nullable_label_typeArray) / sizeof(nullable_label_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(nullable_label_type, nullable_label_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *nullable_label_type_convertToJSON(pinterest_rest_api_nullable_label_type__e nullable_label_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "nullable_label_type", nullable_label_type_nullable_label_type_ToString(nullable_label_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_nullable_label_type__e nullable_label_type_parseFromJSON(cJSON *nullable_label_typeJSON) {
    if(!cJSON_IsString(nullable_label_typeJSON) || (nullable_label_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return nullable_label_type_nullable_label_type_FromString(nullable_label_typeJSON->valuestring);
}
