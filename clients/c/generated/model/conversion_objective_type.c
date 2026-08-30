#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_objective_type.h"


char* conversion_objective_type_conversion_objective_type_ToString(pinterest_rest_api_conversion_objective_type__e conversion_objective_type) {
    char *conversion_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "APP_INSTALL", "SALES", "LEADS", "CTV_CONSIDERATION" };
    return conversion_objective_typeArray[conversion_objective_type];
}

pinterest_rest_api_conversion_objective_type__e conversion_objective_type_conversion_objective_type_FromString(char* conversion_objective_type) {
    int stringToReturn = 0;
    char *conversion_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "APP_INSTALL", "SALES", "LEADS", "CTV_CONSIDERATION" };
    size_t sizeofArray = sizeof(conversion_objective_typeArray) / sizeof(conversion_objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_objective_type, conversion_objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_objective_type_convertToJSON(pinterest_rest_api_conversion_objective_type__e conversion_objective_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_objective_type", conversion_objective_type_conversion_objective_type_ToString(conversion_objective_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_objective_type__e conversion_objective_type_parseFromJSON(cJSON *conversion_objective_typeJSON) {
    if(!cJSON_IsString(conversion_objective_typeJSON) || (conversion_objective_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_objective_type_conversion_objective_type_FromString(conversion_objective_typeJSON->valuestring);
}
