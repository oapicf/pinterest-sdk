#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_learning_mode_type.h"


char* conversion_learning_mode_type_conversion_learning_mode_type_ToString(pinterest_rest_api_conversion_learning_mode_type__e conversion_learning_mode_type) {
    char *conversion_learning_mode_typeArray[] =  { "NULL", "NOT_ACTIVE", "ACTIVE", "" };
    return conversion_learning_mode_typeArray[conversion_learning_mode_type];
}

pinterest_rest_api_conversion_learning_mode_type__e conversion_learning_mode_type_conversion_learning_mode_type_FromString(char* conversion_learning_mode_type) {
    int stringToReturn = 0;
    char *conversion_learning_mode_typeArray[] =  { "NULL", "NOT_ACTIVE", "ACTIVE", "" };
    size_t sizeofArray = sizeof(conversion_learning_mode_typeArray) / sizeof(conversion_learning_mode_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_learning_mode_type, conversion_learning_mode_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_learning_mode_type_convertToJSON(pinterest_rest_api_conversion_learning_mode_type__e conversion_learning_mode_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_learning_mode_type", conversion_learning_mode_type_conversion_learning_mode_type_ToString(conversion_learning_mode_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_learning_mode_type__e conversion_learning_mode_type_parseFromJSON(cJSON *conversion_learning_mode_typeJSON) {
    if(!cJSON_IsString(conversion_learning_mode_typeJSON) || (conversion_learning_mode_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_learning_mode_type_conversion_learning_mode_type_FromString(conversion_learning_mode_typeJSON->valuestring);
}
