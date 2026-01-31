#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_parent_type.h"


char* label_parent_type_label_parent_type_ToString(pinterest_rest_api_label_parent_type__e label_parent_type) {
    char *label_parent_typeArray[] =  { "NULL", "CAMPAIGN" };
    return label_parent_typeArray[label_parent_type];
}

pinterest_rest_api_label_parent_type__e label_parent_type_label_parent_type_FromString(char* label_parent_type) {
    int stringToReturn = 0;
    char *label_parent_typeArray[] =  { "NULL", "CAMPAIGN" };
    size_t sizeofArray = sizeof(label_parent_typeArray) / sizeof(label_parent_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(label_parent_type, label_parent_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *label_parent_type_convertToJSON(pinterest_rest_api_label_parent_type__e label_parent_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "label_parent_type", label_parent_type_label_parent_type_ToString(label_parent_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_label_parent_type__e label_parent_type_parseFromJSON(cJSON *label_parent_typeJSON) {
    if(!cJSON_IsString(label_parent_typeJSON) || (label_parent_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return label_parent_type_label_parent_type_FromString(label_parent_typeJSON->valuestring);
}
