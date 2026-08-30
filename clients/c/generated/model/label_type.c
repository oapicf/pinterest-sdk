#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_type.h"


char* label_type_label_type_ToString(pinterest_rest_api_label_type__e label_type) {
    char *label_typeArray[] =  { "NULL", "BRAND", "CUSTOM" };
    return label_typeArray[label_type];
}

pinterest_rest_api_label_type__e label_type_label_type_FromString(char* label_type) {
    int stringToReturn = 0;
    char *label_typeArray[] =  { "NULL", "BRAND", "CUSTOM" };
    size_t sizeofArray = sizeof(label_typeArray) / sizeof(label_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(label_type, label_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *label_type_convertToJSON(pinterest_rest_api_label_type__e label_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "label_type", label_type_label_type_ToString(label_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_label_type__e label_type_parseFromJSON(cJSON *label_typeJSON) {
    if(!cJSON_IsString(label_typeJSON) || (label_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return label_type_label_type_FromString(label_typeJSON->valuestring);
}
