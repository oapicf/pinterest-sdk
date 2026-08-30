#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_event_ingestion_source.h"


char* conversion_event_ingestion_source_conversion_event_ingestion_source_ToString(pinterest_rest_api_conversion_event_ingestion_source__e conversion_event_ingestion_source) {
    char *conversion_event_ingestion_sourceArray[] =  { "NULL", "TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE" };
    return conversion_event_ingestion_sourceArray[conversion_event_ingestion_source];
}

pinterest_rest_api_conversion_event_ingestion_source__e conversion_event_ingestion_source_conversion_event_ingestion_source_FromString(char* conversion_event_ingestion_source) {
    int stringToReturn = 0;
    char *conversion_event_ingestion_sourceArray[] =  { "NULL", "TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE" };
    size_t sizeofArray = sizeof(conversion_event_ingestion_sourceArray) / sizeof(conversion_event_ingestion_sourceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_event_ingestion_source, conversion_event_ingestion_sourceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_event_ingestion_source_convertToJSON(pinterest_rest_api_conversion_event_ingestion_source__e conversion_event_ingestion_source) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_event_ingestion_source", conversion_event_ingestion_source_conversion_event_ingestion_source_ToString(conversion_event_ingestion_source)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_event_ingestion_source__e conversion_event_ingestion_source_parseFromJSON(cJSON *conversion_event_ingestion_sourceJSON) {
    if(!cJSON_IsString(conversion_event_ingestion_sourceJSON) || (conversion_event_ingestion_sourceJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_event_ingestion_source_conversion_event_ingestion_source_FromString(conversion_event_ingestion_sourceJSON->valuestring);
}
