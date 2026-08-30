#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ingestion_source.h"


char* ingestion_source_ingestion_source_ToString(pinterest_rest_api_ingestion_source__e ingestion_source) {
    char *ingestion_sourceArray[] =  { "NULL", "TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE" };
    return ingestion_sourceArray[ingestion_source];
}

pinterest_rest_api_ingestion_source__e ingestion_source_ingestion_source_FromString(char* ingestion_source) {
    int stringToReturn = 0;
    char *ingestion_sourceArray[] =  { "NULL", "TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE" };
    size_t sizeofArray = sizeof(ingestion_sourceArray) / sizeof(ingestion_sourceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ingestion_source, ingestion_sourceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ingestion_source_convertToJSON(pinterest_rest_api_ingestion_source__e ingestion_source) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ingestion_source", ingestion_source_ingestion_source_ToString(ingestion_source)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ingestion_source__e ingestion_source_parseFromJSON(cJSON *ingestion_sourceJSON) {
    if(!cJSON_IsString(ingestion_sourceJSON) || (ingestion_sourceJSON->valuestring == NULL)) {
        return 0;
    }
    return ingestion_source_ingestion_source_FromString(ingestion_sourceJSON->valuestring);
}
