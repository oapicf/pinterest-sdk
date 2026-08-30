#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "numeric_filter_operator_type.h"


char* numeric_filter_operator_type_numeric_filter_operator_type_ToString(pinterest_rest_api_numeric_filter_operator_type__e numeric_filter_operator_type) {
    char *numeric_filter_operator_typeArray[] =  { "NULL", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS" };
    return numeric_filter_operator_typeArray[numeric_filter_operator_type];
}

pinterest_rest_api_numeric_filter_operator_type__e numeric_filter_operator_type_numeric_filter_operator_type_FromString(char* numeric_filter_operator_type) {
    int stringToReturn = 0;
    char *numeric_filter_operator_typeArray[] =  { "NULL", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS" };
    size_t sizeofArray = sizeof(numeric_filter_operator_typeArray) / sizeof(numeric_filter_operator_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(numeric_filter_operator_type, numeric_filter_operator_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *numeric_filter_operator_type_convertToJSON(pinterest_rest_api_numeric_filter_operator_type__e numeric_filter_operator_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "numeric_filter_operator_type", numeric_filter_operator_type_numeric_filter_operator_type_ToString(numeric_filter_operator_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_numeric_filter_operator_type__e numeric_filter_operator_type_parseFromJSON(cJSON *numeric_filter_operator_typeJSON) {
    if(!cJSON_IsString(numeric_filter_operator_typeJSON) || (numeric_filter_operator_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return numeric_filter_operator_type_numeric_filter_operator_type_FromString(numeric_filter_operator_typeJSON->valuestring);
}
