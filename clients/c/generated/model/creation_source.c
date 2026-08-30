#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "creation_source.h"


char* creation_source_creation_source_ToString(pinterest_rest_api_creation_source__e creation_source) {
    char *creation_sourceArray[] =  { "NULL", "ADS_API", "ADS_MANAGER_REPORTING_PAGE", "ADS_MANAGER_REPORT_BUILDER" };
    return creation_sourceArray[creation_source];
}

pinterest_rest_api_creation_source__e creation_source_creation_source_FromString(char* creation_source) {
    int stringToReturn = 0;
    char *creation_sourceArray[] =  { "NULL", "ADS_API", "ADS_MANAGER_REPORTING_PAGE", "ADS_MANAGER_REPORT_BUILDER" };
    size_t sizeofArray = sizeof(creation_sourceArray) / sizeof(creation_sourceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(creation_source, creation_sourceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *creation_source_convertToJSON(pinterest_rest_api_creation_source__e creation_source) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "creation_source", creation_source_creation_source_ToString(creation_source)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_creation_source__e creation_source_parseFromJSON(cJSON *creation_sourceJSON) {
    if(!cJSON_IsString(creation_sourceJSON) || (creation_sourceJSON->valuestring == NULL)) {
        return 0;
    }
    return creation_source_creation_source_FromString(creation_sourceJSON->valuestring);
}
