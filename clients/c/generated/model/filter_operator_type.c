#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "filter_operator_type.h"


char* filter_operator_type_filter_operator_type_ToString(pinterest_rest_api_filter_operator_type__e filter_operator_type) {
    char *filter_operator_typeArray[] =  { "NULL", "IS", "CONTAINS" };
    return filter_operator_typeArray[filter_operator_type];
}

pinterest_rest_api_filter_operator_type__e filter_operator_type_filter_operator_type_FromString(char* filter_operator_type) {
    int stringToReturn = 0;
    char *filter_operator_typeArray[] =  { "NULL", "IS", "CONTAINS" };
    size_t sizeofArray = sizeof(filter_operator_typeArray) / sizeof(filter_operator_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(filter_operator_type, filter_operator_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *filter_operator_type_convertToJSON(pinterest_rest_api_filter_operator_type__e filter_operator_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "filter_operator_type", filter_operator_type_filter_operator_type_ToString(filter_operator_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_filter_operator_type__e filter_operator_type_parseFromJSON(cJSON *filter_operator_typeJSON) {
    if(!cJSON_IsString(filter_operator_typeJSON) || (filter_operator_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return filter_operator_type_filter_operator_type_FromString(filter_operator_typeJSON->valuestring);
}
