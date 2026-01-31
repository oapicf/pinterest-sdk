#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ingestion_source_options.h"


char* ingestion_source_options_ingestion_source_options_ToString(pinterest_rest_api_ingestion_source_options__e ingestion_source_options) {
    char *ingestion_source_optionsArray[] =  { "NULL", "TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE" };
    return ingestion_source_optionsArray[ingestion_source_options];
}

pinterest_rest_api_ingestion_source_options__e ingestion_source_options_ingestion_source_options_FromString(char* ingestion_source_options) {
    int stringToReturn = 0;
    char *ingestion_source_optionsArray[] =  { "NULL", "TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE" };
    size_t sizeofArray = sizeof(ingestion_source_optionsArray) / sizeof(ingestion_source_optionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ingestion_source_options, ingestion_source_optionsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ingestion_source_options_convertToJSON(pinterest_rest_api_ingestion_source_options__e ingestion_source_options) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ingestion_source_options", ingestion_source_options_ingestion_source_options_ToString(ingestion_source_options)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ingestion_source_options__e ingestion_source_options_parseFromJSON(cJSON *ingestion_source_optionsJSON) {
    if(!cJSON_IsString(ingestion_source_optionsJSON) || (ingestion_source_optionsJSON->valuestring == NULL)) {
        return 0;
    }
    return ingestion_source_options_ingestion_source_options_FromString(ingestion_source_optionsJSON->valuestring);
}
