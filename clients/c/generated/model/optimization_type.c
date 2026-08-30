#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "optimization_type.h"


char* optimization_type_optimization_type_ToString(pinterest_rest_api_optimization_type__e optimization_type) {
    char *optimization_typeArray[] =  { "NULL", "CLICKTHROUGH", "IMPRESSION", "WEB_CONVERSION", "ROAS", "OUTBOUND_CLICK" };
    return optimization_typeArray[optimization_type];
}

pinterest_rest_api_optimization_type__e optimization_type_optimization_type_FromString(char* optimization_type) {
    int stringToReturn = 0;
    char *optimization_typeArray[] =  { "NULL", "CLICKTHROUGH", "IMPRESSION", "WEB_CONVERSION", "ROAS", "OUTBOUND_CLICK" };
    size_t sizeofArray = sizeof(optimization_typeArray) / sizeof(optimization_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(optimization_type, optimization_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *optimization_type_convertToJSON(pinterest_rest_api_optimization_type__e optimization_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "optimization_type", optimization_type_optimization_type_ToString(optimization_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_optimization_type__e optimization_type_parseFromJSON(cJSON *optimization_typeJSON) {
    if(!cJSON_IsString(optimization_typeJSON) || (optimization_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return optimization_type_optimization_type_FromString(optimization_typeJSON->valuestring);
}
