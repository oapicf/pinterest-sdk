#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_log_level.h"


char* integration_log_level_integration_log_level_ToString(pinterest_rest_api_integration_log_level__e integration_log_level) {
    char *integration_log_levelArray[] =  { "NULL", "INFO", "WARN", "ERROR" };
    return integration_log_levelArray[integration_log_level];
}

pinterest_rest_api_integration_log_level__e integration_log_level_integration_log_level_FromString(char* integration_log_level) {
    int stringToReturn = 0;
    char *integration_log_levelArray[] =  { "NULL", "INFO", "WARN", "ERROR" };
    size_t sizeofArray = sizeof(integration_log_levelArray) / sizeof(integration_log_levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(integration_log_level, integration_log_levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *integration_log_level_convertToJSON(pinterest_rest_api_integration_log_level__e integration_log_level) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "integration_log_level", integration_log_level_integration_log_level_ToString(integration_log_level)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_integration_log_level__e integration_log_level_parseFromJSON(cJSON *integration_log_levelJSON) {
    if(!cJSON_IsString(integration_log_levelJSON) || (integration_log_levelJSON->valuestring == NULL)) {
        return 0;
    }
    return integration_log_level_integration_log_level_FromString(integration_log_levelJSON->valuestring);
}
