#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tie_breaker_type.h"


char* tie_breaker_type_tie_breaker_type_ToString(pinterest_rest_api_tie_breaker_type__e tie_breaker_type) {
    char *tie_breaker_typeArray[] =  { "NULL", "RANDOM", "CUSTOM" };
    return tie_breaker_typeArray[tie_breaker_type];
}

pinterest_rest_api_tie_breaker_type__e tie_breaker_type_tie_breaker_type_FromString(char* tie_breaker_type) {
    int stringToReturn = 0;
    char *tie_breaker_typeArray[] =  { "NULL", "RANDOM", "CUSTOM" };
    size_t sizeofArray = sizeof(tie_breaker_typeArray) / sizeof(tie_breaker_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(tie_breaker_type, tie_breaker_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *tie_breaker_type_convertToJSON(pinterest_rest_api_tie_breaker_type__e tie_breaker_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "tie_breaker_type", tie_breaker_type_tie_breaker_type_ToString(tie_breaker_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_tie_breaker_type__e tie_breaker_type_parseFromJSON(cJSON *tie_breaker_typeJSON) {
    if(!cJSON_IsString(tie_breaker_typeJSON) || (tie_breaker_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return tie_breaker_type_tie_breaker_type_FromString(tie_breaker_typeJSON->valuestring);
}
