#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_format.h"


char* catalogs_format_catalogs_format_ToString(pinterest_rest_api_catalogs_format__e catalogs_format) {
    char *catalogs_formatArray[] =  { "NULL", "TSV", "CSV", "XML", "INTEGRATION" };
    return catalogs_formatArray[catalogs_format];
}

pinterest_rest_api_catalogs_format__e catalogs_format_catalogs_format_FromString(char* catalogs_format) {
    int stringToReturn = 0;
    char *catalogs_formatArray[] =  { "NULL", "TSV", "CSV", "XML", "INTEGRATION" };
    size_t sizeofArray = sizeof(catalogs_formatArray) / sizeof(catalogs_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_format, catalogs_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_format_convertToJSON(pinterest_rest_api_catalogs_format__e catalogs_format) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_format", catalogs_format_catalogs_format_ToString(catalogs_format)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_format__e catalogs_format_parseFromJSON(cJSON *catalogs_formatJSON) {
    if(!cJSON_IsString(catalogs_formatJSON) || (catalogs_formatJSON->valuestring == NULL)) {
        return 0;
    }
    return catalogs_format_catalogs_format_FromString(catalogs_formatJSON->valuestring);
}
