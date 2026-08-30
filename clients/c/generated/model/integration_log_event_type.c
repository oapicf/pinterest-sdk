#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_log_event_type.h"


char* integration_log_event_type_integration_log_event_type_ToString(pinterest_rest_api_integration_log_event_type__e integration_log_event_type) {
    char *integration_log_event_typeArray[] =  { "NULL", "APP", "API" };
    return integration_log_event_typeArray[integration_log_event_type];
}

pinterest_rest_api_integration_log_event_type__e integration_log_event_type_integration_log_event_type_FromString(char* integration_log_event_type) {
    int stringToReturn = 0;
    char *integration_log_event_typeArray[] =  { "NULL", "APP", "API" };
    size_t sizeofArray = sizeof(integration_log_event_typeArray) / sizeof(integration_log_event_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(integration_log_event_type, integration_log_event_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *integration_log_event_type_convertToJSON(pinterest_rest_api_integration_log_event_type__e integration_log_event_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "integration_log_event_type", integration_log_event_type_integration_log_event_type_ToString(integration_log_event_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_integration_log_event_type__e integration_log_event_type_parseFromJSON(cJSON *integration_log_event_typeJSON) {
    if(!cJSON_IsString(integration_log_event_typeJSON) || (integration_log_event_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return integration_log_event_type_integration_log_event_type_FromString(integration_log_event_typeJSON->valuestring);
}
